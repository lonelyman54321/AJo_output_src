/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache$StatsCounter;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheLoader$InvalidCacheLoadException;
import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$AccessQueue;
import com.google.common.cache.LocalCache$EntryFactory;
import com.google.common.cache.LocalCache$LoadingValueReference;
import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.ReferenceEntry;
import com.google.common.cache.RemovalCause;
import com.google.common.cache.RemovalNotification;
import com.google.common.cache.c;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

class LocalCache$Segment
extends ReentrantLock {
    final Queue accessQueue;
    volatile int count;
    final ReferenceQueue keyReferenceQueue;
    final LocalCache map;
    final long maxSegmentWeight;
    int modCount;
    final AtomicInteger readCount;
    final Queue recencyQueue;
    final AbstractCache$StatsCounter statsCounter;
    volatile AtomicReferenceArray table;
    int threshold;
    long totalWeight;
    final ReferenceQueue valueReferenceQueue;
    final Queue writeQueue;

    public LocalCache$Segment(LocalCache object, int n3, long l2, AbstractCache$StatsCounter abstractCache$StatsCounter) {
        AtomicInteger atomicInteger;
        this.readCount = atomicInteger = new AtomicInteger();
        this.map = object;
        this.maxSegmentWeight = l2;
        ReferenceQueue referenceQueue = (AbstractCache$StatsCounter)Preconditions.checkNotNull(abstractCache$StatsCounter);
        this.statsCounter = referenceQueue;
        Queue queue = this.newEntryArray(n3);
        this.initTable((AtomicReferenceArray)((Object)queue));
        n3 = (int)(((LocalCache)object).usesKeyReferences() ? 1 : 0);
        referenceQueue = null;
        if (n3 != 0) {
            queue = new Queue();
        } else {
            n3 = 0;
            queue = null;
        }
        this.keyReferenceQueue = queue;
        n3 = (int)(((LocalCache)object).usesValueReferences() ? 1 : 0);
        if (n3 != 0) {
            referenceQueue = new ReferenceQueue();
        }
        this.valueReferenceQueue = referenceQueue;
        n3 = (int)(((LocalCache)object).usesAccessQueue() ? 1 : 0);
        queue = n3 != 0 ? new Queue() : LocalCache.discardingQueue();
        this.recencyQueue = queue;
        n3 = (int)(((LocalCache)object).usesWriteQueue() ? 1 : 0);
        if (n3 != 0) {
        } else {
            queue = LocalCache.discardingQueue();
        }
        this.writeQueue = queue;
        boolean bl2 = ((LocalCache)object).usesAccessQueue();
        object = bl2 ? new LocalCache$AccessQueue() : LocalCache.discardingQueue();
        this.accessQueue = object;
    }

    public static /* synthetic */ void a(LocalCache$Segment localCache$Segment, Object object, int n3, LocalCache$LoadingValueReference loadingValueReference, ListenableFuture listenableFuture) {
        localCache$Segment.lambda$loadAsync$0(object, n3, loadingValueReference, listenableFuture);
    }

    private /* synthetic */ void lambda$loadAsync$0(Object object, int n3, LocalCache$LoadingValueReference localCache$LoadingValueReference, ListenableFuture object2) {
        try {
            this.getAndRecordStats(object, n3, localCache$LoadingValueReference, (ListenableFuture)object2);
        }
        catch (Throwable throwable) {
            Logger logger = LocalCache.logger;
            object2 = Level.WARNING;
            String string2 = "Exception thrown during refresh";
            logger.log((Level)object2, string2, throwable);
            localCache$LoadingValueReference.setException(throwable);
        }
    }

    public void cleanUp() {
        long l2 = this.map.ticker.read();
        this.runLockedCleanup(l2);
        this.runUnlockedCleanup();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void clear() {
        int n3;
        Object object;
        int n4;
        block8: {
            n4 = this.count;
            if (n4 == 0) return;
            this.lock();
            try {
                object = this.map;
                object = ((LocalCache)object).ticker;
                long l2 = ((Ticker)object).read();
                this.preWriteCleanup(l2);
                object = this.table;
                n3 = 0;
                break block8;
            }
            catch (Throwable throwable) {}
            this.unlock();
            this.postWriteCleanup();
            throw throwable;
        }
        while (true) {
            Object object2;
            int n7;
            if (n3 < (n7 = ((AtomicReferenceArray)object).length())) {
                object2 = ((AtomicReferenceArray)object).get(n3);
            } else {
                n3 = 0;
                while (true) {
                    if (n3 >= (n7 = ((AtomicReferenceArray)object).length())) {
                        this.clearReferenceQueues();
                        object = this.writeQueue;
                        object.clear();
                        object = this.accessQueue;
                        object.clear();
                        object = this.readCount;
                        ((AtomicInteger)object).set(0);
                        this.modCount = n4 = this.modCount + 1;
                        this.count = 0;
                        this.unlock();
                        this.postWriteCleanup();
                        return;
                    }
                    n7 = 0;
                    object2 = null;
                    ((AtomicReferenceArray)object).set(n3, null);
                    ++n3;
                }
            }
            for (object2 = (ReferenceEntry)object2; object2 != null; object2 = object2.getNext()) {
                Object object3 = object2.getValueReference();
                boolean bl2 = object3.isActive();
                if (!bl2) continue;
                Object object4 = object2.getKey();
                object3 = object2.getValueReference();
                Object object5 = object3.get();
                object3 = object4 != null && object5 != null ? RemovalCause.EXPLICIT : RemovalCause.COLLECTED;
                LocalCache$ValueReference localCache$ValueReference = object3;
                int n8 = object2.getHash();
                object3 = object2.getValueReference();
                int n10 = object3.getWeight();
                this.enqueueNotification(object4, n8, object5, n10, (RemovalCause)((Object)localCache$ValueReference));
            }
            ++n3;
        }
    }

    public void clearKeyReferenceQueue() {
        Reference reference;
        while ((reference = this.keyReferenceQueue.poll()) != null) {
        }
    }

    public void clearReferenceQueues() {
        LocalCache localCache = this.map;
        boolean bl2 = localCache.usesKeyReferences();
        if (bl2) {
            this.clearKeyReferenceQueue();
        }
        if (bl2 = (localCache = this.map).usesValueReferences()) {
            this.clearValueReferenceQueue();
        }
    }

    public void clearValueReferenceQueue() {
        Reference reference;
        while ((reference = this.valueReferenceQueue.poll()) != null) {
        }
    }

    public boolean containsKey(Object object, int n3) {
        Throwable throwable2;
        block11: {
            block9: {
                boolean bl2;
                block10: {
                    try {
                        int n4 = this.count;
                        bl2 = false;
                        if (n4 == 0) break block9;
                    }
                    catch (Throwable throwable2) {}
                    Object object2 = this.map;
                    object2 = ((LocalCache)object2).ticker;
                    long l2 = ((Ticker)object2).read();
                    object = this.getLiveEntry(object, n3, l2);
                    if (object != null) break block10;
                    this.postReadCleanup();
                    return false;
                }
                object = object.getValueReference();
                object = object.get();
                if (object != null) {
                    bl2 = true;
                }
                this.postReadCleanup();
                return bl2;
                break block11;
            }
            this.postReadCleanup();
            return false;
        }
        this.postReadCleanup();
        throw throwable2;
    }

    public boolean containsValue(Object object) {
        block17: {
            int n3 = this.count;
            if (n3 == 0) break block17;
            Object object2 = this.map;
            object2 = ((LocalCache)object2).ticker;
            long l2 = ((Ticker)object2).read();
            object2 = this.table;
            int n4 = ((AtomicReferenceArray)object2).length();
            for (int i3 = 0; i3 < n4; ++i3) {
                Object object3 = ((AtomicReferenceArray)object2).get(i3);
                object3 = (ReferenceEntry)object3;
                while (object3 != null) {
                    block18: {
                        Object object4;
                        try {
                            object4 = this.getLiveValue((ReferenceEntry)object3, l2);
                            if (object4 == null) break block18;
                        }
                        catch (Throwable throwable) {}
                        Object object5 = this.map;
                        object5 = ((LocalCache)object5).valueEquivalence;
                        boolean bl2 = ((Equivalence)object5).equivalent(object, object4);
                        if (!bl2) break block18;
                        this.postReadCleanup();
                        return true;
                    }
                    try {
                        object3 = object3.getNext();
                        return (boolean)object3;
                    }
                    finally {
                    }
                }
            }
        }
        this.postReadCleanup();
        return false;
    }

    public ReferenceEntry copyEntry(ReferenceEntry referenceEntry, ReferenceEntry object) {
        boolean bl2;
        Object object2 = referenceEntry.getKey();
        if (object2 == null) {
            return null;
        }
        LocalCache$ValueReference localCache$ValueReference = referenceEntry.getValueReference();
        Object object3 = localCache$ValueReference.get();
        if (object3 == null && (bl2 = localCache$ValueReference.isActive())) {
            return null;
        }
        referenceEntry = this.map.entryFactory.copyEntry(this, referenceEntry, (ReferenceEntry)object, object2);
        object = this.valueReferenceQueue;
        object = localCache$ValueReference.copyFor((ReferenceQueue)object, object3, referenceEntry);
        referenceEntry.setValueReference((LocalCache$ValueReference)object);
        return referenceEntry;
    }

    public void drainKeyReferenceQueue() {
        Object object;
        int n3 = 0;
        while ((object = this.keyReferenceQueue.poll()) != null) {
            object = (ReferenceEntry)object;
            LocalCache localCache = this.map;
            localCache.reclaimKey((ReferenceEntry)object);
            int n4 = 16;
            if (++n3 != n4) continue;
        }
    }

    public void drainRecencyQueue() {
        ReferenceEntry referenceEntry;
        while ((referenceEntry = (ReferenceEntry)this.recencyQueue.poll()) != null) {
            Queue queue = this.accessQueue;
            boolean bl2 = queue.contains(referenceEntry);
            if (!bl2) continue;
            queue = this.accessQueue;
            queue.add(referenceEntry);
        }
    }

    public void drainReferenceQueues() {
        LocalCache localCache = this.map;
        boolean bl2 = localCache.usesKeyReferences();
        if (bl2) {
            this.drainKeyReferenceQueue();
        }
        if (bl2 = (localCache = this.map).usesValueReferences()) {
            this.drainValueReferenceQueue();
        }
    }

    public void drainValueReferenceQueue() {
        Object object;
        int n3 = 0;
        while ((object = this.valueReferenceQueue.poll()) != null) {
            object = (LocalCache$ValueReference)object;
            LocalCache localCache = this.map;
            localCache.reclaimValue((LocalCache$ValueReference)object);
            int n4 = 16;
            if (++n3 != n4) continue;
        }
    }

    public void enqueueNotification(Object object, int n3, Object object2, int n4, RemovalCause removalCause) {
        Queue queue;
        Object object3;
        long l2 = this.totalWeight;
        long l3 = n4;
        this.totalWeight = l2 -= l3;
        n3 = (int)(removalCause.wasEvicted() ? 1 : 0);
        if (n3 != 0) {
            object3 = this.statsCounter;
            object3.recordEviction();
        }
        if ((object3 = this.map.removalNotificationQueue) != (queue = LocalCache.DISCARDING_QUEUE)) {
            object = RemovalNotification.create(object, object2, removalCause);
            object3 = this.map.removalNotificationQueue;
            object3.offer(object);
        }
    }

    public void evictEntries(ReferenceEntry object) {
        long l2;
        RemovalCause removalCause;
        int n3;
        long l3;
        Object object2 = this.map;
        boolean n32 = ((LocalCache)object2).evictsBySize();
        if (!n32) {
            return;
        }
        this.drainRecencyQueue();
        object2 = object.getValueReference();
        int n4 = object2.getWeight();
        long l4 = n4;
        long l7 = this.maxSegmentWeight;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 > 0 && (l3 = (long)this.removeEntry((ReferenceEntry)object, n3 = object.getHash(), removalCause = RemovalCause.SIZE)) == false) {
            object = new AssertionError();
            throw object;
        }
        while ((l3 = (l2 = (l4 = this.totalWeight) - (l7 = this.maxSegmentWeight)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
            int n7;
            object = this.getNextEvictable();
            l3 = (long)this.removeEntry((ReferenceEntry)object, n7 = object.getHash(), removalCause = RemovalCause.SIZE);
            if (l3 != false) continue;
            object = new AssertionError();
            throw object;
        }
    }

    public void expand() {
        int n3;
        int n4;
        AtomicReferenceArray atomicReferenceArray = this.table;
        int n7 = atomicReferenceArray.length();
        if (n7 >= (n4 = 0x40000000)) {
            return;
        }
        n4 = this.count;
        int n8 = n7 << 1;
        AtomicReferenceArray atomicReferenceArray2 = this.newEntryArray(n8);
        this.threshold = n3 = atomicReferenceArray2.length() * 3 / 4;
        n3 = atomicReferenceArray2.length() + -1;
        for (int i3 = 0; i3 < n7; ++i3) {
            ReferenceEntry referenceEntry;
            ReferenceEntry referenceEntry2 = (ReferenceEntry)atomicReferenceArray.get(i3);
            if (referenceEntry2 == null) continue;
            int n10 = referenceEntry2.getHash() & n3;
            if (referenceEntry == null) {
                atomicReferenceArray2.set(n10, referenceEntry2);
                continue;
            }
            ReferenceEntry referenceEntry3 = referenceEntry2;
            for (referenceEntry = referenceEntry2.getNext(); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                int n14 = referenceEntry.getHash() & n3;
                if (n14 == n10) continue;
                referenceEntry3 = referenceEntry;
                n10 = n14;
            }
            atomicReferenceArray2.set(n10, referenceEntry3);
            while (referenceEntry2 != referenceEntry3) {
                int n15 = referenceEntry2.getHash() & n3;
                ReferenceEntry referenceEntry4 = (ReferenceEntry)atomicReferenceArray2.get(n15);
                if ((referenceEntry4 = this.copyEntry(referenceEntry2, referenceEntry4)) != null) {
                    atomicReferenceArray2.set(n15, referenceEntry4);
                } else {
                    this.removeCollectedEntry(referenceEntry2);
                    n4 += -1;
                }
                referenceEntry2 = referenceEntry2.getNext();
            }
        }
        this.table = atomicReferenceArray2;
        this.count = n4;
    }

    public void expireEntries(long l2) {
        boolean bl2;
        RemovalCause removalCause;
        LocalCache localCache;
        int n3;
        ReferenceEntry referenceEntry;
        this.drainRecencyQueue();
        while ((referenceEntry = (ReferenceEntry)this.writeQueue.peek()) != null && (n3 = (localCache = this.map).isExpired(referenceEntry, l2)) != 0) {
            n3 = referenceEntry.getHash();
            bl2 = this.removeEntry(referenceEntry, n3, removalCause = RemovalCause.EXPIRED);
            if (bl2) continue;
            AssertionError assertionError = new AssertionError();
            throw assertionError;
        }
        while ((referenceEntry = (ReferenceEntry)this.accessQueue.peek()) != null && (n3 = (int)((localCache = this.map).isExpired(referenceEntry, l2) ? 1 : 0)) != 0) {
            n3 = referenceEntry.getHash();
            bl2 = this.removeEntry(referenceEntry, n3, removalCause = RemovalCause.EXPIRED);
            if (bl2) continue;
            AssertionError assertionError = new AssertionError();
            throw assertionError;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object get(Object object, int n3) {
        Throwable throwable2;
        block7: {
            block6: {
                try {
                    int n4 = this.count;
                    if (n4 == 0) break block6;
                    Object object2 = this.map;
                    object2 = ((LocalCache)object2).ticker;
                    long l2 = ((Ticker)object2).read();
                    ReferenceEntry referenceEntry = this.getLiveEntry(object, n3, l2);
                    if (referenceEntry == null) {
                        this.postReadCleanup();
                        return null;
                    }
                    object = referenceEntry.getValueReference();
                    Object object3 = object.get();
                    if (object3 != null) {
                        this.recordRead(referenceEntry, l2);
                        Object object4 = referenceEntry.getKey();
                        object = this.map;
                        CacheLoader cacheLoader = ((LocalCache)object).defaultLoader;
                        object = this.scheduleRefresh(referenceEntry, object4, n3, object3, l2, cacheLoader);
                        this.postReadCleanup();
                        return object;
                    }
                    this.tryDrainReferenceQueues();
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            this.postReadCleanup();
            return null;
        }
        this.postReadCleanup();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object get(Object var1_1, int var2_6, CacheLoader var3_7) {
        block9: {
            Preconditions.checkNotNull(var1_1);
            Preconditions.checkNotNull(var3_7);
            try {
                var4_8 = this.count;
                if (var4_8 != 0 && (var5_9 = this.getEntry(var1_1, var2_6)) != null) {
                    var6_10 = this.map;
                    var6_10 = var6_10.ticker;
                    var7_11 = var6_10.read();
                    var9_12 = this.getLiveValue(var5_9, var7_11);
                    if (var9_12 != null) {
                        this.recordRead(var5_9, var7_11);
                        var6_10 = this.statsCounter;
                        var10_13 = 1;
                        var6_10.recordHits(var10_13);
                        var1_1 = this.scheduleRefresh(var5_9, var1_1, var2_6, var9_12, var7_11, var3_7);
                        this.postReadCleanup();
                        return var1_1;
                    }
                }
                ** GOTO lbl-1000
            }
            catch (Throwable var1_2) {
                break block9;
            }
            catch (ExecutionException var1_3) {
                ** GOTO lbl-1000
            }
            {
                var6_10 = var5_9.getValueReference();
                var10_14 = var6_10.isLoading();
                if (!var10_14) ** GOTO lbl-1000
                var1_1 = this.waitForLoadingValue(var5_9, var1_1, (LocalCache$ValueReference)var6_10);
                this.postReadCleanup();
                return var1_1;
            }
lbl-1000:
            // 2 sources

            {
                var1_1 = this.lockedGetOrLoad(var1_1, var2_6, var3_7);
                this.postReadCleanup();
                return var1_1;
            }
lbl-1000:
            // 1 sources

            {
                var11_15 = var1_3.getCause();
            }
            var12_16 = var11_15 instanceof Error;
            if (var12_16) ** GOTO lbl43
            var12_16 = var11_15 instanceof RuntimeException;
            if (!var12_16) ** GOTO lbl42
            {
                var1_4 = new UncheckedExecutionException(var11_15);
                throw var1_4;
lbl42:
                // 1 sources

                throw var1_3;
lbl43:
                // 1 sources

                var11_15 = (Error)var11_15;
                var1_5 = new ExecutionError((Error)var11_15);
                throw var1_5;
            }
        }
        this.postReadCleanup();
        throw var1_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object getAndRecordStats(Object object, int n3, LocalCache$LoadingValueReference localCache$LoadingValueReference, ListenableFuture object2) {
        void var5_8;
        block6: {
            Object object3;
            block5: {
                object3 = "CacheLoader returned null for key ";
                try {
                    object2 = Uninterruptibles.getUninterruptibly((Future)object2);
                    if (object2 == null) break block5;
                }
                catch (Throwable throwable) {
                    object2 = null;
                    break block6;
                }
                try {
                    object3 = this.statsCounter;
                    long l2 = localCache$LoadingValueReference.elapsedNanos();
                    object3.recordLoadSuccess(l2);
                    this.storeLoadedValue(object, n3, localCache$LoadingValueReference, object2);
                    return object2;
                }
                catch (Throwable throwable) {}
                break block6;
            }
            StringBuilder stringBuilder = new StringBuilder((String)object3);
            stringBuilder.append(object);
            object3 = ".";
            stringBuilder.append((String)object3);
            object3 = stringBuilder.toString();
            CacheLoader$InvalidCacheLoadException cacheLoader$InvalidCacheLoadException = new CacheLoader$InvalidCacheLoadException((String)object3);
            throw cacheLoader$InvalidCacheLoadException;
        }
        if (object2 == null) {
            object2 = this.statsCounter;
            long l3 = localCache$LoadingValueReference.elapsedNanos();
            object2.recordLoadException(l3);
            this.removeLoadingValue(object, n3, localCache$LoadingValueReference);
        }
        throw var5_8;
    }

    public ReferenceEntry getEntry(Object object, int n3) {
        for (ReferenceEntry referenceEntry = this.getFirst(n3); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
            int n4 = referenceEntry.getHash();
            if (n4 != n3) continue;
            Object object2 = referenceEntry.getKey();
            if (object2 == null) {
                this.tryDrainReferenceQueues();
                continue;
            }
            Equivalence equivalence = this.map.keyEquivalence;
            n4 = (int)(equivalence.equivalent(object, object2) ? 1 : 0);
            if (n4 == 0) continue;
            return referenceEntry;
        }
        return null;
    }

    public ReferenceEntry getFirst(int n3) {
        AtomicReferenceArray atomicReferenceArray = this.table;
        int n4 = atomicReferenceArray.length() + -1;
        return (ReferenceEntry)atomicReferenceArray.get(n3 &= n4);
    }

    public ReferenceEntry getLiveEntry(Object object, int n3, long l2) {
        object = this.getEntry(object, n3);
        n3 = 0;
        if (object == null) {
            return null;
        }
        LocalCache localCache = this.map;
        boolean bl2 = localCache.isExpired((ReferenceEntry)object, l2);
        if (bl2) {
            this.tryExpireEntries(l2);
            return null;
        }
        return object;
    }

    public Object getLiveValue(ReferenceEntry referenceEntry, long l2) {
        Object object = referenceEntry.getKey();
        if (object == null) {
            this.tryDrainReferenceQueues();
            return null;
        }
        object = referenceEntry.getValueReference().get();
        if (object == null) {
            this.tryDrainReferenceQueues();
            return null;
        }
        LocalCache localCache = this.map;
        boolean bl2 = localCache.isExpired(referenceEntry, l2);
        if (bl2) {
            this.tryExpireEntries(l2);
            return null;
        }
        return object;
    }

    public ReferenceEntry getNextEvictable() {
        boolean bl2;
        Object object = this.accessQueue.iterator();
        while (bl2 = object.hasNext()) {
            ReferenceEntry referenceEntry = (ReferenceEntry)object.next();
            LocalCache$ValueReference localCache$ValueReference = referenceEntry.getValueReference();
            int n3 = localCache$ValueReference.getWeight();
            if (n3 <= 0) continue;
            return referenceEntry;
        }
        object = new AssertionError();
        throw object;
    }

    public void initTable(AtomicReferenceArray atomicReferenceArray) {
        long l2;
        long l3;
        long l4;
        long l7;
        int n3;
        this.threshold = n3 = atomicReferenceArray.length() * 3 / 4;
        LocalCache localCache = this.map;
        n3 = (int)(localCache.customWeigher() ? 1 : 0);
        if (n3 == 0 && (l7 = (l4 = (l3 = (long)(n3 = this.threshold)) - (l2 = this.maxSegmentWeight)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            this.threshold = ++n3;
        }
        this.table = atomicReferenceArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public LocalCache$LoadingValueReference insertLoadingValueReference(Object object, int n3, boolean bl2) {
        Throwable throwable2;
        block7: {
            Object e2;
            int n4;
            AtomicReferenceArray atomicReferenceArray;
            this.lock();
            try {
                Object object2 = this.map;
                object2 = ((LocalCache)object2).ticker;
                long l2 = ((Ticker)object2).read();
                this.preWriteCleanup(l2);
                atomicReferenceArray = this.table;
                n4 = atomicReferenceArray.length() + -1 & n3;
                e2 = atomicReferenceArray.get(n4);
                for (Object e5 = e2 = (ReferenceEntry)e2; e5 != null; e5 = e5.getNext()) {
                    block8: {
                        Object object3;
                        block9: {
                            Object object4 = e5.getKey();
                            int n7 = e5.getHash();
                            if (n7 != n3 || object4 == null) continue;
                            Object object5 = this.map;
                            object5 = ((LocalCache)object5).keyEquivalence;
                            boolean bl3 = ((Equivalence)object5).equivalent(object, object4);
                            if (!bl3) continue;
                            object = e5.getValueReference();
                            n3 = (int)(object.isLoading() ? 1 : 0);
                            if (n3 != 0) break block8;
                            if (!bl2) break block9;
                            long l3 = e5.getWriteTime();
                            l2 -= l3;
                            object3 = this.map;
                            l3 = ((LocalCache)object3).refreshNanos;
                            long l4 = l2 - l3;
                            Object object6 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                            if (object6 < 0) break block8;
                        }
                        this.modCount = n3 = this.modCount + 1;
                        object3 = new LocalCache$LoadingValueReference((LocalCache$ValueReference)object);
                        e5.setValueReference((LocalCache$ValueReference)object3);
                        this.unlock();
                        this.postWriteCleanup();
                        return object3;
                    }
                    this.unlock();
                    this.postWriteCleanup();
                    return null;
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            bl2 = this.modCount + 1;
            this.modCount = (int)(bl2 ? 1 : 0);
            LocalCache$LoadingValueReference localCache$LoadingValueReference = new LocalCache$LoadingValueReference();
            object = this.newEntry(object, n3, (ReferenceEntry)e2);
            object.setValueReference(localCache$LoadingValueReference);
            atomicReferenceArray.set(n4, object);
            this.unlock();
            this.postWriteCleanup();
            return localCache$LoadingValueReference;
        }
        this.unlock();
        this.postWriteCleanup();
        throw throwable2;
    }

    public ListenableFuture loadAsync(Object object, int n3, LocalCache$LoadingValueReference localCache$LoadingValueReference, CacheLoader object2) {
        object2 = localCache$LoadingValueReference.loadFuture(object, (CacheLoader)object2);
        c c2 = new c(this, object, n3, localCache$LoadingValueReference, (ListenableFuture)object2);
        object = MoreExecutors.directExecutor();
        object2.addListener(c2, (Executor)object);
        return object2;
    }

    public Object loadSync(Object object, int n3, LocalCache$LoadingValueReference localCache$LoadingValueReference, CacheLoader object2) {
        object2 = localCache$LoadingValueReference.loadFuture(object, (CacheLoader)object2);
        return this.getAndRecordStats(object, n3, localCache$LoadingValueReference, (ListenableFuture)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object lockedGetOrLoad(Object object, int n3, CacheLoader cacheLoader) {
        Throwable throwable2;
        block24: {
            Object object2;
            boolean bl2;
            LocalCache$LoadingValueReference localCache$LoadingValueReference;
            Object object3;
            Object object4;
            int n4;
            AtomicReferenceArray atomicReferenceArray;
            int n7;
            Object object5;
            int n8;
            Object object6;
            LocalCache$Segment localCache$Segment;
            block22: {
                block23: {
                    localCache$Segment = this;
                    object6 = object;
                    n8 = n3;
                    this.lock();
                    try {
                        object5 = this.map;
                        object5 = ((LocalCache)object5).ticker;
                        long l2 = ((Ticker)object5).read();
                        this.preWriteCleanup(l2);
                        int n10 = this.count;
                        n7 = 1;
                        int n14 = n10 + -1;
                        atomicReferenceArray = this.table;
                        n10 = atomicReferenceArray.length() - n7;
                        n4 = n3 & n10;
                        Object object7 = atomicReferenceArray.get(n4);
                        object4 = object7;
                        object3 = object4 = (ReferenceEntry)object7;
                        while (true) {
                            localCache$LoadingValueReference = null;
                            if (object3 == null) break;
                            object7 = object3.getKey();
                            int n15 = object3.getHash();
                            if (n15 == n8 && object7 != null) {
                                Object object8 = localCache$Segment.map;
                                object8 = ((LocalCache)object8).keyEquivalence;
                                n15 = (int)(((Equivalence)object8).equivalent(object6, object7) ? 1 : 0);
                                if (n15 != 0) {
                                    LocalCache$ValueReference localCache$ValueReference = object3.getValueReference();
                                    n15 = (int)(localCache$ValueReference.isLoading() ? 1 : 0);
                                    if (n15 != 0) {
                                        bl2 = false;
                                        object5 = null;
                                        object2 = localCache$ValueReference;
                                        break block22;
                                    }
                                    object8 = localCache$ValueReference.get();
                                    if (object8 == null) {
                                        int n16 = localCache$ValueReference.getWeight();
                                        RemovalCause removalCause = RemovalCause.COLLECTED;
                                        object5 = this;
                                        object2 = object7;
                                        n10 = n3;
                                        this.enqueueNotification(object7, n3, object8, n16, removalCause);
                                    } else {
                                        LocalCache localCache = localCache$Segment.map;
                                        int n17 = localCache.isExpired((ReferenceEntry)object3, l2);
                                        if (n17 == 0) {
                                            localCache$Segment.recordLockedRead((ReferenceEntry)object3, l2);
                                            object6 = localCache$Segment.statsCounter;
                                            object6.recordHits(n7);
                                            this.unlock();
                                            this.postWriteCleanup();
                                            return object8;
                                        }
                                        n17 = localCache$ValueReference.getWeight();
                                        RemovalCause removalCause = RemovalCause.EXPIRED;
                                        object5 = this;
                                        object2 = object7;
                                        n10 = n3;
                                        this.enqueueNotification(object7, n3, object8, n17, removalCause);
                                    }
                                    object5 = localCache$Segment.writeQueue;
                                    object5.remove(object3);
                                    object5 = localCache$Segment.accessQueue;
                                    object5.remove(object3);
                                    localCache$Segment.count = n14;
                                    object2 = localCache$ValueReference;
                                    break block23;
                                }
                            }
                            object3 = object3.getNext();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block24;
                    }
                    object2 = null;
                }
                bl2 = true;
            }
            if (bl2) {
                localCache$LoadingValueReference = new LocalCache$LoadingValueReference();
                if (object3 == null) {
                    object3 = localCache$Segment.newEntry(object6, n8, (ReferenceEntry)object4);
                    object3.setValueReference(localCache$LoadingValueReference);
                    atomicReferenceArray.set(n4, object3);
                } else {
                    object3.setValueReference(localCache$LoadingValueReference);
                }
            }
            this.unlock();
            this.postWriteCleanup();
            if (bl2) {
                try {
                    synchronized (object3) {
                        object5 = cacheLoader;
                        object6 = localCache$Segment.loadSync(object6, n8, localCache$LoadingValueReference, cacheLoader);
                    }
                }
                catch (Throwable throwable3) {
                    localCache$Segment.statsCounter.recordMisses(n7);
                    throw throwable3;
                }
                localCache$Segment.statsCounter.recordMisses(n7);
                return object6;
            }
            return localCache$Segment.waitForLoadingValue((ReferenceEntry)object3, object6, (LocalCache$ValueReference)object2);
        }
        this.unlock();
        this.postWriteCleanup();
        throw throwable2;
    }

    public ReferenceEntry newEntry(Object object, int n3, ReferenceEntry referenceEntry) {
        LocalCache$EntryFactory localCache$EntryFactory = this.map.entryFactory;
        object = Preconditions.checkNotNull(object);
        return localCache$EntryFactory.newEntry(this, object, n3, referenceEntry);
    }

    public AtomicReferenceArray newEntryArray(int n3) {
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(n3);
        return atomicReferenceArray;
    }

    public void postReadCleanup() {
        AtomicInteger atomicInteger = this.readCount;
        int n3 = atomicInteger.incrementAndGet() & 0x3F;
        if (n3 == 0) {
            this.cleanUp();
        }
    }

    public void postWriteCleanup() {
        this.runUnlockedCleanup();
    }

    public void preWriteCleanup(long l2) {
        this.runLockedCleanup(l2);
    }

    /*
     * Exception decompiling
     */
    public Object put(Object var1_1, int var2_2, Object var3_3, boolean var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [7 : 72->77)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean reclaimKey(ReferenceEntry object, int n3) {
        Object object2;
        Object object3;
        int n4;
        int n7;
        AtomicReferenceArray atomicReferenceArray;
        this.lock();
        try {
            atomicReferenceArray = this.table;
            n7 = atomicReferenceArray.length();
            n4 = 1;
            n7 = n7 - n4 & n3;
            Object e2 = atomicReferenceArray.get(n7);
            object3 = e2;
            object2 = object3 = (ReferenceEntry)e2;
        }
        catch (Throwable throwable) {}
        while (true) {
            if (object2 == null) {
                this.unlock();
                this.postWriteCleanup();
                return false;
            }
            if (object2 == object) {
                int n8;
                this.modCount = n8 = this.modCount + n4;
                Object object4 = object2.getKey();
                object = object2.getValueReference();
                Object object5 = object.get();
                LocalCache$ValueReference localCache$ValueReference = object2.getValueReference();
                RemovalCause removalCause = RemovalCause.COLLECTED;
                object = this.removeValueFromChain((ReferenceEntry)object3, (ReferenceEntry)object2, object4, n3, object5, localCache$ValueReference, removalCause);
                n3 = this.count - n4;
                atomicReferenceArray.set(n7, object);
                this.count = n3;
                this.unlock();
                this.postWriteCleanup();
                return n4 != 0;
            }
            object2 = object2.getNext();
            continue;
            break;
        }
        this.unlock();
        this.postWriteCleanup();
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean reclaimValue(Object object, int n3, LocalCache$ValueReference localCache$ValueReference) {
        Throwable throwable2;
        block14: {
            block11: {
                int n4;
                Object object2;
                int n7;
                int n8;
                AtomicReferenceArray atomicReferenceArray;
                this.lock();
                try {
                    atomicReferenceArray = this.table;
                    n8 = atomicReferenceArray.length();
                    n7 = 1;
                    n8 = n8 - n7 & n3;
                    Object e2 = atomicReferenceArray.get(n8);
                    Object object3 = e2;
                    object2 = object3 = (ReferenceEntry)e2;
                    while (true) {
                        e2 = null;
                        if (object2 == null) break block11;
                        Object object4 = object2.getKey();
                        int n10 = object2.getHash();
                        if (n10 != n3 || object4 == null) break block12;
                        Object object5 = this.map;
                        object5 = ((LocalCache)object5).keyEquivalence;
                        n10 = (int)(((Equivalence)object5).equivalent(object, object4) ? 1 : 0);
                        if (n10 == 0) break block12;
                        object = object2.getValueReference();
                        if (object != localCache$ValueReference) break block13;
                        this.modCount = n4 = this.modCount + n7;
                        Object object6 = localCache$ValueReference.get();
                        RemovalCause removalCause = RemovalCause.COLLECTED;
                        object5 = this;
                        object = this.removeValueFromChain((ReferenceEntry)object3, (ReferenceEntry)object2, object4, n3, object6, localCache$ValueReference, removalCause);
                        n3 = this.count - n7;
                        break;
                    }
                }
                catch (Throwable throwable2) {
                    break block14;
                }
                {
                    block12: {
                        block13: {
                            atomicReferenceArray.set(n8, object);
                            this.count = n3;
                            this.unlock();
                            n4 = (int)(this.isHeldByCurrentThread() ? 1 : 0);
                            if (n4 == 0) {
                                this.postWriteCleanup();
                            }
                            return n7 != 0;
                        }
                        this.unlock();
                        boolean bl2 = this.isHeldByCurrentThread();
                        if (!bl2) {
                            this.postWriteCleanup();
                        }
                        return false;
                    }
                    object2 = object2.getNext();
                    continue;
                }
            }
            this.unlock();
            boolean bl3 = this.isHeldByCurrentThread();
            if (!bl3) {
                this.postWriteCleanup();
            }
            return false;
        }
        this.unlock();
        n3 = (int)(this.isHeldByCurrentThread() ? 1 : 0);
        if (n3 == 0) {
            this.postWriteCleanup();
        }
        throw throwable2;
    }

    public void recordLockedRead(ReferenceEntry referenceEntry, long l2) {
        LocalCache localCache = this.map;
        boolean bl2 = localCache.recordsAccess();
        if (bl2) {
            referenceEntry.setAccessTime(l2);
        }
        this.accessQueue.add(referenceEntry);
    }

    public void recordRead(ReferenceEntry referenceEntry, long l2) {
        LocalCache localCache = this.map;
        boolean bl2 = localCache.recordsAccess();
        if (bl2) {
            referenceEntry.setAccessTime(l2);
        }
        this.recencyQueue.add(referenceEntry);
    }

    public void recordWrite(ReferenceEntry referenceEntry, int n3, long l2) {
        this.drainRecencyQueue();
        long l3 = this.totalWeight;
        long l4 = n3;
        this.totalWeight = l3 += l4;
        LocalCache localCache = this.map;
        n3 = (int)(localCache.recordsAccess() ? 1 : 0);
        if (n3 != 0) {
            referenceEntry.setAccessTime(l2);
        }
        if ((n3 = (int)((localCache = this.map).recordsWrite() ? 1 : 0)) != 0) {
            referenceEntry.setWriteTime(l2);
        }
        this.accessQueue.add(referenceEntry);
        this.writeQueue.add(referenceEntry);
    }

    public Object refresh(Object object, int n3, CacheLoader cacheLoader, boolean bl2) {
        LocalCache$LoadingValueReference localCache$LoadingValueReference = this.insertLoadingValueReference(object, n3, bl2);
        if (localCache$LoadingValueReference == null) {
            return null;
        }
        if ((n3 = (int)((object = this.loadAsync(object, n3, localCache$LoadingValueReference, cacheLoader)).isDone() ? 1 : 0)) != 0) {
            try {
                return Uninterruptibles.getUninterruptibly((Future)object);
            }
            catch (Throwable throwable) {}
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object remove(Object object, int n3) {
        this.lock();
        try {
            Object object2 = this.map;
            object2 = ((LocalCache)object2).ticker;
            long l2 = ((Ticker)object2).read();
            this.preWriteCleanup(l2);
            object2 = this.table;
            int n4 = ((AtomicReferenceArray)object2).length() + -1 & n3;
            Object object3 = ((AtomicReferenceArray)object2).get(n4);
            Object object4 = object3;
            Object object5 = object4 = (ReferenceEntry)object3;
            while (true) {
                block7: {
                    block6: {
                        LocalCache$ValueReference localCache$ValueReference;
                        Object object6;
                        Object object7;
                        int n7;
                        block9: {
                            int n8;
                            block8: {
                                n7 = 0;
                                object3 = null;
                                if (object5 == null) break block6;
                                object7 = object5.getKey();
                                n8 = object5.getHash();
                                if (n8 != n3 || object7 == null) break block7;
                                object6 = this.map;
                                object6 = ((LocalCache)object6).keyEquivalence;
                                n8 = (int)(((Equivalence)object6).equivalent(object, object7) ? 1 : 0);
                                if (n8 == 0) break block7;
                                localCache$ValueReference = object5.getValueReference();
                                object = localCache$ValueReference.get();
                                if (object == null) break block8;
                                object3 = RemovalCause.EXPLICIT;
                                break block9;
                            }
                            n8 = (int)(localCache$ValueReference.isActive() ? 1 : 0);
                            if (n8 == 0) break block6;
                            object3 = RemovalCause.COLLECTED;
                        }
                        this.modCount = n7 = this.modCount + 1;
                        object6 = this;
                        ReferenceEntry referenceEntry = this.removeValueFromChain((ReferenceEntry)object4, (ReferenceEntry)object5, object7, n3, object, localCache$ValueReference, (RemovalCause)((Object)object3));
                        n7 = this.count + -1;
                        ((AtomicReferenceArray)object2).set(n4, referenceEntry);
                        this.count = n7;
                        this.unlock();
                        this.postWriteCleanup();
                        return object;
                    }
                    this.unlock();
                    this.postWriteCleanup();
                    return null;
                }
                object5 = object5.getNext();
            }
        }
        catch (Throwable throwable) {}
        this.unlock();
        this.postWriteCleanup();
        throw throwable;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean remove(Object var1_1, int var2_3, Object var3_4) {
        block10: {
            this.lock();
            try {
                var4_5 = this.map;
                var4_5 = var4_5.ticker;
                var5_6 = var4_5.read();
                this.preWriteCleanup(var5_6);
                var4_5 = this.table;
                var7_7 = var4_5.length();
                var8_8 = 1;
                var7_7 = var7_7 - var8_8 & var2_3;
            }
            catch (Throwable var1_2) {
                break block10;
            }
            var9_9 = var4_5.get(var7_7);
            var10_10 = var9_9;
            var11_11 = var10_10 = (ReferenceEntry)var9_9;
            while (true) {
                block11: {
                    block13: {
                        block12: {
                            var9_9 = null;
                            if (var11_11 == null) break block11;
                            var12_12 = var11_11.getKey();
                            var13_13 = var11_11.getHash();
                            if (var13_13 != var2_3 || var12_12 == null) ** GOTO lbl-1000
                            var14_14 = this.map;
                            var14_14 = var14_14.keyEquivalence;
                            var13_13 = (int)var14_14.equivalent(var1_1 /* !! */ , var12_12);
                            if (var13_13 == 0) ** GOTO lbl-1000
                            var15_15 = var11_11.getValueReference();
                            var16_16 = var15_15.get();
                            var1_1 /* !! */  = this.map;
                            var1_1 /* !! */  = var1_1 /* !! */ .valueEquivalence;
                            var17_17 = var1_1 /* !! */ .equivalent(var3_4, var16_16);
                            if (!var17_17) break block12;
                            var1_1 /* !! */  = RemovalCause.EXPLICIT;
                            break block13;
                        }
                        if (var16_16 != null || !(var17_17 = var15_15.isActive())) break block11;
                        var1_1 /* !! */  = RemovalCause.COLLECTED;
                    }
                    this.modCount = var18_18 = this.modCount + var8_8;
                    var14_14 = this;
                    var19_19 /* !! */  = this.removeValueFromChain((ReferenceEntry)var10_10, (ReferenceEntry)var11_11, var12_12, var2_3, var16_16, var15_15, (RemovalCause)var1_1 /* !! */ );
                    var18_18 = this.count - var8_8;
                    {
                        var4_5.set(var7_7, var19_19 /* !! */ );
                        this.count = var18_18;
                        var19_19 /* !! */  = RemovalCause.EXPLICIT;
                        if (var1_1 /* !! */  != var19_19 /* !! */ ) {
                            var8_8 = 0;
                        }
                        this.unlock();
                        this.postWriteCleanup();
                        return (boolean)var8_8;
                    }
                }
                this.unlock();
                this.postWriteCleanup();
                return false;
lbl-1000:
                // 2 sources

                {
                    var11_11 = var11_11.getNext();
                    continue;
                }
                break;
            }
        }
        this.unlock();
        this.postWriteCleanup();
        throw var1_2;
    }

    public void removeCollectedEntry(ReferenceEntry referenceEntry) {
        Object object = referenceEntry.getKey();
        int n3 = referenceEntry.getHash();
        Object object2 = referenceEntry.getValueReference().get();
        int n4 = referenceEntry.getValueReference().getWeight();
        RemovalCause removalCause = RemovalCause.COLLECTED;
        this.enqueueNotification(object, n3, object2, n4, removalCause);
        this.writeQueue.remove(referenceEntry);
        this.accessQueue.remove(referenceEntry);
    }

    public boolean removeEntry(ReferenceEntry referenceEntry, int n3, RemovalCause removalCause) {
        AtomicReferenceArray atomicReferenceArray = this.table;
        int n4 = atomicReferenceArray.length();
        int n7 = 1;
        n4 = n4 - n7 & n3;
        Object e2 = atomicReferenceArray.get(n4);
        Object e5 = e2;
        for (Object e7 = e5 = (ReferenceEntry)e2; e7 != null; e7 = e7.getNext()) {
            int n8;
            if (e7 != referenceEntry) continue;
            this.modCount = n8 = this.modCount + n7;
            Object object = e7.getKey();
            Object object2 = e7.getValueReference().get();
            LocalCache$ValueReference localCache$ValueReference = e7.getValueReference();
            referenceEntry = this.removeValueFromChain((ReferenceEntry)e5, (ReferenceEntry)e7, object, n3, object2, localCache$ValueReference, removalCause);
            n3 = this.count - n7;
            atomicReferenceArray.set(n4, referenceEntry);
            this.count = n3;
            return n7 != 0;
        }
        return false;
    }

    public ReferenceEntry removeEntryFromChain(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        int n3 = this.count;
        ReferenceEntry referenceEntry3 = referenceEntry2.getNext();
        while (referenceEntry != referenceEntry2) {
            ReferenceEntry referenceEntry4 = this.copyEntry(referenceEntry, referenceEntry3);
            if (referenceEntry4 != null) {
                referenceEntry3 = referenceEntry4;
            } else {
                this.removeCollectedEntry(referenceEntry);
                n3 += -1;
            }
            referenceEntry = referenceEntry.getNext();
        }
        this.count = n3;
        return referenceEntry3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean removeLoadingValue(Object var1_1, int var2_3, LocalCache$LoadingValueReference var3_4) {
        this.lock();
        try {
            var4_5 = this.table;
            var5_6 = var4_5.length();
            var6_7 = 1;
            var5_6 = var5_6 - var6_7 & var2_3;
            var7_8 = var4_5.get(var5_6);
            var8_9 = var7_8 = (ReferenceEntry)var7_8;
            while (true) {
                if (var8_9 == null) ** break block8
                var9_10 = var8_9.getKey();
                var10_11 = var8_9.getHash();
                if (var10_11 != var2_3 || var9_10 == null) break block9;
                var11_12 = this.map;
                var11_12 = var11_12.keyEquivalence;
                var12_13 = var11_12.equivalent(var1_1, var9_10);
                if (!var12_13) break block9;
                var1_1 = var8_9.getValueReference();
                if (var1_1 != var3_4) ** break block8
                var13_14 = var3_4.isActive();
                if (var13_14) {
                    var1_1 = var3_4.getOldValue();
                    var8_9.setValueReference((LocalCache$ValueReference)var1_1);
                } else {
                    var1_1 = this.removeEntryFromChain((ReferenceEntry)var7_8, (ReferenceEntry)var8_9);
                    var4_5.set(var5_6, var1_1);
                }
                this.unlock();
                this.postWriteCleanup();
                return (boolean)var6_7;
            }
        }
        catch (Throwable var1_2) {}
        {
            block9: {
                this.unlock();
                this.postWriteCleanup();
                return false;
            }
            var8_9 = var8_9.getNext();
            continue;
        }
        this.unlock();
        this.postWriteCleanup();
        throw var1_2;
    }

    public ReferenceEntry removeValueFromChain(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object object, int n3, Object object2, LocalCache$ValueReference localCache$ValueReference, RemovalCause removalCause) {
        int n4 = localCache$ValueReference.getWeight();
        this.enqueueNotification(object, n3, object2, n4, removalCause);
        this.writeQueue.remove(referenceEntry2);
        object = this.accessQueue;
        object.remove(referenceEntry2);
        boolean bl2 = localCache$ValueReference.isLoading();
        if (bl2) {
            localCache$ValueReference.notifyNewValue(null);
            return referenceEntry;
        }
        return this.removeEntryFromChain(referenceEntry, referenceEntry2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object replace(Object object, int n3, Object object2) {
        block7: {
            LocalCache$Segment localCache$Segment = this;
            int n4 = n3;
            this.lock();
            try {
                Object object3 = this.map;
                object3 = ((LocalCache)object3).ticker;
                long l2 = ((Ticker)object3).read();
                this.preWriteCleanup(l2);
                AtomicReferenceArray atomicReferenceArray = this.table;
                int n7 = atomicReferenceArray.length() + -1;
                int n8 = n3 & n7;
                Object object4 = object3 = atomicReferenceArray.get(n8);
                for (Object object5 = object4 = (ReferenceEntry)object3; object5 != null; object5 = object5.getNext()) {
                    Object object6 = object5.getKey();
                    n7 = object5.getHash();
                    if (n7 != n4 || object6 == null) continue;
                    object3 = localCache$Segment.map;
                    object3 = ((LocalCache)object3).keyEquivalence;
                    n7 = (int)(((Equivalence)object3).equivalent(object, object6) ? 1 : 0);
                    if (n7 == 0) continue;
                    LocalCache$ValueReference localCache$ValueReference = object5.getValueReference();
                    Object object7 = localCache$ValueReference.get();
                    if (object7 == null) {
                        n7 = (int)(localCache$ValueReference.isActive() ? 1 : 0);
                        if (n7 != 0) {
                            localCache$Segment.modCount = n7 = localCache$Segment.modCount + 1;
                            RemovalCause removalCause = RemovalCause.COLLECTED;
                            object3 = this;
                            int n10 = n3;
                            Object object8 = object7;
                            ReferenceEntry referenceEntry = this.removeValueFromChain((ReferenceEntry)object4, (ReferenceEntry)object5, object6, n3, object7, localCache$ValueReference, removalCause);
                            n7 = localCache$Segment.count + -1;
                            atomicReferenceArray.set(n8, referenceEntry);
                            localCache$Segment.count = n7;
                        }
                        break block7;
                    }
                    localCache$Segment.modCount = n7 = localCache$Segment.modCount + 1;
                    int n14 = localCache$ValueReference.getWeight();
                    RemovalCause removalCause = RemovalCause.REPLACED;
                    object3 = this;
                    object4 = object;
                    object6 = object7;
                    this.enqueueNotification(object, n3, object7, n14, removalCause);
                    object4 = object5;
                    object6 = object2;
                    this.setValue((ReferenceEntry)object5, object, object2, l2);
                    localCache$Segment.evictEntries((ReferenceEntry)object5);
                    this.unlock();
                    this.postWriteCleanup();
                    return object7;
                }
                break block7;
            }
            catch (Throwable throwable) {}
            this.unlock();
            this.postWriteCleanup();
            throw throwable;
        }
        this.unlock();
        this.postWriteCleanup();
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean replace(Object var1_1, int var2_2, Object var3_3, Object var4_4) {
        block7: {
            block8: {
                var5_5 = this;
                var6_6 = var2_2;
                this.lock();
                var7_7 = this.map;
                var7_7 = var7_7.ticker;
                var8_8 = var7_7.read();
                this.preWriteCleanup(var8_8);
                var10_9 = this.table;
                var11_10 = var10_9.length();
                var12_11 = 1;
                var13_12 = var2_2 & (var11_10 -= var12_11);
                var14_13 = var7_7 = var10_9.get(var13_12);
                for (var15_14 = var14_13 = (ReferenceEntry)var7_7; var15_14 != null; var15_14 = var15_14.getNext()) {
                    var16_15 = var15_14.getKey();
                    var11_10 = var15_14.getHash();
                    if (var11_10 != var6_6 || var16_15 == null) continue;
                    var7_7 = var5_5.map;
                    var7_7 = var7_7.keyEquivalence;
                    var11_10 = (int)var7_7.equivalent(var1_1, var16_15);
                    if (var11_10 == 0) continue;
                    var17_16 = var15_14.getValueReference();
                    var18_17 = var17_16.get();
                    if (var18_17 != null) ** GOTO lbl-1000
                    var11_10 = (int)var17_16.isActive();
                    if (var11_10 == 0) break block7;
                    var5_5.modCount = var11_10 = var5_5.modCount + var12_11;
                    var19_18 = RemovalCause.COLLECTED;
                    var7_7 = this;
                    var20_19 = var2_2;
                    var21_21 = this.removeValueFromChain((ReferenceEntry)var14_13, (ReferenceEntry)var15_14, var16_15, var2_2, var18_17, var17_16, var19_18);
                    var11_10 = var5_5.count - var12_11;
                    {
                        var10_9.set(var13_12, var21_21);
                        var5_5.count = var11_10;
                        break block7;
                    }
                }
                break block7;
                {
                    block9: {
                        catch (Throwable var21_22) {
                            break block8;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var7_7 = var5_5.map;
                            var7_7 = var7_7.valueEquivalence;
                            var11_10 = (int)var7_7.equivalent(var3_3, var18_17);
                            if (var11_10 == 0) break block9;
                            var5_5.modCount = var11_10 = var5_5.modCount + var12_11;
                            var20_20 = var17_16.getWeight();
                            var10_9 = RemovalCause.REPLACED;
                            var7_7 = this;
                            var14_13 = var1_1;
                            var16_15 = var18_17;
                            var18_17 = var10_9;
                            this.enqueueNotification(var1_1, var2_2, var16_15, var20_20, (RemovalCause)var10_9);
                            var14_13 = var15_14;
                            var16_15 = var4_4;
                            this.setValue((ReferenceEntry)var15_14, var1_1, var4_4, var8_8);
                            var5_5.evictEntries((ReferenceEntry)var15_14);
                            this.unlock();
                            this.postWriteCleanup();
                            return (boolean)var12_11;
                        }
                    }
                    var5_5.recordLockedRead((ReferenceEntry)var15_14, var8_8);
                    break block7;
                }
            }
            this.unlock();
            this.postWriteCleanup();
            throw var21_22;
        }
        this.unlock();
        this.postWriteCleanup();
        return false;
    }

    public void runLockedCleanup(long l2) {
        boolean bl2 = this.tryLock();
        if (bl2) {
            try {
                this.drainReferenceQueues();
                this.expireEntries(l2);
                AtomicInteger atomicInteger = this.readCount;
                atomicInteger.set(0);
            }
            finally {
                this.unlock();
            }
        }
    }

    public void runUnlockedCleanup() {
        boolean bl2 = this.isHeldByCurrentThread();
        if (!bl2) {
            LocalCache localCache = this.map;
            localCache.processPendingNotifications();
        }
    }

    public Object scheduleRefresh(ReferenceEntry object, Object object2, int n3, Object object3, long l2, CacheLoader cacheLoader) {
        LocalCache localCache = this.map;
        boolean bl2 = localCache.refreshes();
        if (bl2) {
            boolean bl3;
            long l3 = object.getWriteTime();
            l2 -= l3;
            localCache = this.map;
            l3 = localCache.refreshNanos;
            long l4 = l2 - l3;
            Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object4 > 0 && !(bl3 = (object = object.getValueReference()).isLoading()) && (object = this.refresh(object2, n3, cacheLoader, bl3 = true)) != null) {
                return object;
            }
        }
        return object3;
    }

    public void setValue(ReferenceEntry referenceEntry, Object object, Object object2, long l2) {
        boolean bl2;
        LocalCache$ValueReference localCache$ValueReference = referenceEntry.getValueReference();
        Object object3 = this.map.weigher;
        int n3 = object3.weigh(object, object2);
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object3 = null;
        }
        Preconditions.checkState(bl2, "Weights must be non-negative");
        object3 = this.map.valueStrength.referenceValue(this, referenceEntry, object2, n3);
        referenceEntry.setValueReference((LocalCache$ValueReference)object3);
        this.recordWrite(referenceEntry, n3, l2);
        localCache$ValueReference.notifyNewValue(object2);
    }

    /*
     * Exception decompiling
     */
    public boolean storeLoadedValue(Object var1_1, int var2_2, LocalCache$LoadingValueReference var3_3, Object var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [8 : 93->98)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void tryDrainReferenceQueues() {
        boolean bl2 = this.tryLock();
        if (bl2) {
            try {
                this.drainReferenceQueues();
            }
            finally {
                this.unlock();
            }
        }
    }

    public void tryExpireEntries(long l2) {
        boolean bl2 = this.tryLock();
        if (bl2) {
            try {
                this.expireEntries(l2);
            }
            finally {
                this.unlock();
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object waitForLoadingValue(ReferenceEntry object, Object object2, LocalCache$ValueReference object3) {
        Throwable throwable2;
        int n3;
        block5: {
            String string2 = "CacheLoader returned null for key ";
            boolean bl2 = object3.isLoading();
            if (!bl2) {
                object = new AssertionError();
                throw object;
            }
            bl2 = Thread.holdsLock(object);
            n3 = 1;
            String string3 = "Recursive load of: %s";
            Preconditions.checkState(bl2 ^= n3, string3, object2);
            try {
                object3 = object3.waitForValue();
                if (object3 != null) {
                    object2 = this.map;
                    object2 = ((LocalCache)object2).ticker;
                    long l2 = ((Ticker)object2).read();
                    this.recordRead((ReferenceEntry)object, l2);
                    this.statsCounter.recordMisses(n3);
                    return object3;
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            {
                object3 = new StringBuilder(string2);
                ((StringBuilder)object3).append(object2);
                object2 = ".";
                ((StringBuilder)object3).append((String)object2);
                object2 = ((StringBuilder)object3).toString();
                object = new CacheLoader$InvalidCacheLoadException((String)object2);
                throw object;
            }
        }
        this.statsCounter.recordMisses(n3);
        throw throwable2;
    }
}

