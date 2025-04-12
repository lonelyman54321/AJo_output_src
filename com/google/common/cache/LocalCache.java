/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache$StatsCounter;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheBuilder$NullListener;
import com.google.common.cache.CacheBuilder$OneWeigher;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheLoader$InvalidCacheLoadException;
import com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException;
import com.google.common.cache.LocalCache$1;
import com.google.common.cache.LocalCache$2;
import com.google.common.cache.LocalCache$EntryFactory;
import com.google.common.cache.LocalCache$EntrySet;
import com.google.common.cache.LocalCache$KeySet;
import com.google.common.cache.LocalCache$NullEntry;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.LocalCache$Strength;
import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.LocalCache$Values;
import com.google.common.cache.ReferenceEntry;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import com.google.common.cache.Weigher;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;
import java.util.logging.Logger;

class LocalCache
extends AbstractMap
implements ConcurrentMap {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final Queue DISCARDING_QUEUE;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 0x40000000;
    static final int MAX_SEGMENTS = 65536;
    static final LocalCache$ValueReference UNSET;
    static final Logger logger;
    final int concurrencyLevel;
    final CacheLoader defaultLoader;
    final LocalCache$EntryFactory entryFactory;
    Set entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final AbstractCache$StatsCounter globalStatsCounter;
    final Equivalence keyEquivalence;
    Set keySet;
    final LocalCache$Strength keyStrength;
    final long maxWeight;
    final long refreshNanos;
    final RemovalListener removalListener;
    final Queue removalNotificationQueue;
    final int segmentMask;
    final int segmentShift;
    final LocalCache$Segment[] segments;
    final Ticker ticker;
    final Equivalence valueEquivalence;
    final LocalCache$Strength valueStrength;
    Collection values;
    final Weigher weigher;

    static {
        logger = Logger.getLogger(LocalCache.class.getName());
        Object object = new LocalCache$1();
        UNSET = object;
        DISCARDING_QUEUE = object = new LocalCache$2();
    }

    /*
     * WARNING - void declaration
     */
    public LocalCache(CacheBuilder cacheBuilder, CacheLoader localCache$SegmentArray) {
        int n3;
        int n4;
        int n7;
        void var13_14;
        long l2;
        long l3;
        long l4;
        long l7;
        int n8;
        long l8;
        long l12;
        Object object;
        int n42 = cacheBuilder.getConcurrencyLevel();
        int n74 = 65536;
        this.concurrencyLevel = n42 = Math.min(n42, n74);
        Object object2 = cacheBuilder.getKeyStrength();
        this.keyStrength = object2;
        this.valueStrength = object = cacheBuilder.getValueStrength();
        object = cacheBuilder.getKeyEquivalence();
        this.keyEquivalence = object;
        object = cacheBuilder.getValueEquivalence();
        this.valueEquivalence = object;
        this.maxWeight = l12 = cacheBuilder.getMaximumWeight();
        Object object3 = cacheBuilder.getWeigher();
        this.weigher = object3;
        this.expireAfterAccessNanos = l8 = cacheBuilder.getExpireAfterAccessNanos();
        this.expireAfterWriteNanos = l8 = cacheBuilder.getExpireAfterWriteNanos();
        this.refreshNanos = l8 = cacheBuilder.getRefreshNanos();
        object3 = cacheBuilder.getRemovalListener();
        this.removalListener = object3;
        CacheBuilder$NullListener cacheBuilder$NullListener = CacheBuilder$NullListener.INSTANCE;
        object3 = object3 == cacheBuilder$NullListener ? LocalCache.discardingQueue() : new ConcurrentLinkedQueue();
        this.removalNotificationQueue = object3;
        boolean n84 = this.recordsTime();
        object3 = cacheBuilder.getTicker(n84);
        this.ticker = object3;
        boolean bl2 = this.usesAccessEntries();
        int n10 = this.usesWriteEntries();
        object2 = LocalCache$EntryFactory.getFactory((LocalCache$Strength)((Object)object2), bl2, n10 != 0);
        this.entryFactory = object2;
        this.globalStatsCounter = object2 = (AbstractCache$StatsCounter)cacheBuilder.getStatsCounterSupplier().get();
        this.defaultLoader = localCache$SegmentArray;
        int n14 = Math.min(cacheBuilder.getInitialCapacity(), 0x40000000);
        n42 = (int)(this.evictsBySize() ? 1 : 0);
        if (n42 != 0 && (n42 = (int)(this.customWeigher() ? 1 : 0)) == 0) {
            l8 = n14;
            long l14 = Math.min(l8, l12);
            n14 = (int)l14;
        }
        n42 = 0;
        object2 = null;
        n74 = 1;
        boolean bl3 = false;
        object3 = null;
        for (n8 = 1; n8 < (n10 = this.concurrencyLevel) && ((n10 = (int)(this.evictsBySize() ? 1 : 0)) == 0 || (l7 = (l4 = (l3 = (long)n8 * (long)20) - (l2 = this.maxWeight)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0); n8 <<= 1) {
            ++var13_14;
        }
        this.segmentShift = n7 = 32 - var13_14;
        this.segmentMask = n4 = n8 + -1;
        object3 = this.newSegmentArray(n8);
        this.segments = object3;
        int n15 = n14 / n8;
        n10 = n15 * n8;
        if (n10 < n14) {
            n3 = n15 + 1;
        }
        while (n74 < n3) {
            n74 <<= 1;
        }
        n14 = (int)(this.evictsBySize() ? 1 : 0);
        if (n14 != 0) {
            l8 = this.maxWeight;
            long l15 = n8;
            long l16 = l8 / l15;
            long l17 = 1L;
            l16 += l17;
            l8 %= l15;
            while (n42 < (n8 = (localCache$SegmentArray = this.segments).length)) {
                l15 = n42;
                long l18 = l15 - l8;
                n8 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
                if (n8 == 0) {
                    l16 -= l17;
                }
                Object object4 = (AbstractCache$StatsCounter)cacheBuilder.getStatsCounterSupplier().get();
                localCache$SegmentArray[n42] = object4 = this.createSegment(n74, l16, (AbstractCache$StatsCounter)object4);
                ++n42;
            }
        } else {
            while (n42 < (n8 = (localCache$SegmentArray = this.segments).length)) {
                Object object5 = (AbstractCache$StatsCounter)cacheBuilder.getStatsCounterSupplier().get();
                l8 = -1;
                localCache$SegmentArray[n42] = object5 = this.createSegment(n74, l8, (AbstractCache$StatsCounter)object5);
                ++n42;
            }
        }
    }

    public static /* synthetic */ ArrayList access$200(Collection collection) {
        return LocalCache.toArrayList(collection);
    }

    public static void connectAccessOrder(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry2.setPreviousInAccessQueue(referenceEntry);
    }

    public static void connectWriteOrder(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry2.setPreviousInWriteQueue(referenceEntry);
    }

    public static Queue discardingQueue() {
        return DISCARDING_QUEUE;
    }

    public static ReferenceEntry nullEntry() {
        return LocalCache$NullEntry.INSTANCE;
    }

    public static void nullifyAccessOrder(ReferenceEntry referenceEntry) {
        ReferenceEntry referenceEntry2 = LocalCache.nullEntry();
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry.setPreviousInAccessQueue(referenceEntry2);
    }

    public static void nullifyWriteOrder(ReferenceEntry referenceEntry) {
        ReferenceEntry referenceEntry2 = LocalCache.nullEntry();
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry.setPreviousInWriteQueue(referenceEntry2);
    }

    public static int rehash(int n3) {
        int n4 = n3 << 15 ^ 0xFFFFCD7D;
        n3 += n4;
        n4 = n3 >>> 10;
        n3 ^= n4;
        n4 = n3 << 3;
        n3 += n4;
        n4 = n3 >>> 6;
        n3 ^= n4;
        n4 = n3 << 2;
        int n7 = n3 << 14;
        n4 = n4 + n7 + n3;
        return n4 >>> 16 ^ n4;
    }

    private static ArrayList toArrayList(Collection object) {
        int n3 = object.size();
        ArrayList arrayList = new ArrayList(n3);
        object = object.iterator();
        Iterators.addAll(arrayList, (Iterator)object);
        return arrayList;
    }

    public static LocalCache$ValueReference unset() {
        return UNSET;
    }

    public void cleanUp() {
        for (LocalCache$Segment localCache$Segment : this.segments) {
            localCache$Segment.cleanUp();
        }
    }

    public void clear() {
        for (LocalCache$Segment localCache$Segment : this.segments) {
            localCache$Segment.clear();
        }
    }

    public boolean containsKey(Object object) {
        if (object == null) {
            return false;
        }
        int n3 = this.hash(object);
        return this.segmentFor(n3).containsKey(object, n3);
    }

    public boolean containsValue(Object object) {
        LocalCache localCache = this;
        Object object2 = object;
        Object object3 = 0;
        ReferenceEntry referenceEntry = null;
        if (object == null) {
            return false;
        }
        Object object4 = this.ticker;
        long l2 = ((Ticker)object4).read();
        Object object5 = this.segments;
        long l3 = -1;
        int n3 = 0;
        while (true) {
            long l4;
            LocalCache$Segment[] localCache$SegmentArray;
            int n4;
            if (n3 >= (n4 = 3)) break;
            n4 = ((LocalCache$Segment[])object5).length;
            long l7 = 0L;
            for (int i3 = 0; i3 < n4; ++i3) {
                LocalCache$Segment localCache$Segment = object5[i3];
                int cfr_ignored_0 = localCache$Segment.count;
                AtomicReferenceArray atomicReferenceArray = localCache$Segment.table;
                for (int i8 = 0; i8 < (object3 = atomicReferenceArray.length()); ++i8) {
                    for (referenceEntry = (ReferenceEntry)atomicReferenceArray.get(i8); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                        boolean bl2;
                        localCache$SegmentArray = object5;
                        object5 = localCache$Segment.getLiveValue(referenceEntry, l2);
                        l4 = l2;
                        if (object5 != null && (bl2 = ((Equivalence)(object4 = localCache.valueEquivalence)).equivalent(object2, object5))) {
                            return true;
                        }
                        object5 = localCache$SegmentArray;
                        l2 = l4;
                    }
                    l4 = l2;
                    localCache$SegmentArray = object5;
                }
                l4 = l2;
                localCache$SegmentArray = object5;
                long l8 = localCache$Segment.modCount;
                l7 += l8;
                object3 = 0;
                referenceEntry = null;
            }
            l4 = l2;
            localCache$SegmentArray = object5;
            object3 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
            if (object3 == 0) {
                break;
            }
            ++n3;
            l3 = l7;
            object3 = 0;
            referenceEntry = null;
        }
        object2 = null;
        return false;
    }

    public ReferenceEntry copyEntry(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        int n3 = referenceEntry.getHash();
        return this.segmentFor(n3).copyEntry(referenceEntry, referenceEntry2);
    }

    public LocalCache$Segment createSegment(int n3, long l2, AbstractCache$StatsCounter abstractCache$StatsCounter) {
        LocalCache$Segment localCache$Segment = new LocalCache$Segment(this, n3, l2, abstractCache$StatsCounter);
        return localCache$Segment;
    }

    public boolean customWeigher() {
        boolean bl2;
        Weigher weigher = this.weigher;
        CacheBuilder$OneWeigher cacheBuilder$OneWeigher = CacheBuilder$OneWeigher.INSTANCE;
        if (weigher != cacheBuilder$OneWeigher) {
            bl2 = true;
        } else {
            bl2 = false;
            weigher = null;
        }
        return bl2;
    }

    public Set entrySet() {
        Set set = this.entrySet;
        if (set == null) {
            this.entrySet = set = new LocalCache$EntrySet(this);
        }
        return set;
    }

    public boolean evictsBySize() {
        long l2 = this.maxWeight;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    public boolean expires() {
        boolean bl2 = this.expiresAfterWrite();
        bl2 = bl2 || (bl2 = this.expiresAfterAccess());
        return bl2;
    }

    public boolean expiresAfterAccess() {
        long l2 = this.expireAfterAccessNanos;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        return bl2;
    }

    public boolean expiresAfterWrite() {
        long l2 = this.expireAfterWriteNanos;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        return bl2;
    }

    public Object get(Object object) {
        if (object == null) {
            return null;
        }
        int n3 = this.hash(object);
        return this.segmentFor(n3).get(object, n3);
    }

    public Object get(Object object, CacheLoader cacheLoader) {
        Object object2 = Preconditions.checkNotNull(object);
        int n3 = this.hash(object2);
        return this.segmentFor(n3).get(object, n3, cacheLoader);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public ImmutableMap getAll(Iterable var1_1) {
        block11: {
            block10: {
                var2_3 = Maps.newLinkedHashMap();
                var3_4 = Sets.newLinkedHashSet();
                var1_1 = var1_1.iterator();
                var4_5 = 0;
                var5_6 = 0;
                while (var6_7 = var1_1.hasNext()) {
                    var7_8 = var1_1.next();
                    var8_9 = this.get(var7_8);
                    var9_10 = var2_3.containsKey(var7_8);
                    if (var9_10) continue;
                    var2_3.put(var7_8, var8_9);
                    if (var8_9 == null) {
                        ++var5_6;
                        var3_4.add(var7_8);
                        continue;
                    }
                    ++var4_5;
                }
                var10_11 = var3_4.isEmpty();
                if (var10_11) ** GOTO lbl59
                var1_1 = Collections.unmodifiableSet(var3_4);
                var7_8 = this.defaultLoader;
                var1_1 = this.loadAll((Set)var1_1, (CacheLoader)var7_8);
                var7_8 = var3_4.iterator();
                while (var11_12 = var7_8.hasNext()) {
                    var8_9 = var7_8.next();
                    var12_13 /* !! */  = var1_1.get(var8_9);
                    if (var12_13 /* !! */  != null) {
                        var2_3.put(var8_9, var12_13 /* !! */ );
                        continue;
                    }
                    break block10;
                }
                ** GOTO lbl59
                catch (Throwable var1_2) {
                    break block11;
                }
            }
            var7_8 = new StringBuilder();
            var12_13 /* !! */  = "loadAll failed to return a value for ";
            var7_8.append((String)var12_13 /* !! */ );
            var7_8.append(var8_9);
            var7_8 = var7_8.toString();
            var1_1 = new CacheLoader$InvalidCacheLoadException((String)var7_8);
            throw var1_1;
lbl49:
            // 1 sources

            while (true) {
                var1_1 = var3_4.iterator();
                while (var13_14 = var1_1.hasNext()) {
                    var3_4 = var1_1.next();
                    var5_6 += -1;
                    var7_8 = this.defaultLoader;
                    var7_8 = this.get(var3_4, (CacheLoader)var7_8);
                    var2_3.put(var3_4, var7_8);
                }
lbl59:
                // 3 sources

                var1_1 = ImmutableMap.copyOf((Map)var2_3);
                this.globalStatsCounter.recordHits(var4_5);
                this.globalStatsCounter.recordMisses(var5_6);
                return var1_1;
            }
        }
        this.globalStatsCounter.recordHits(var4_5);
        this.globalStatsCounter.recordMisses(var5_6);
        throw var1_2;
        {
            catch (CacheLoader$UnsupportedLoadingOperationException v0) {
                ** continue;
            }
        }
    }

    public ImmutableMap getAllPresent(Iterable object) {
        boolean bl2;
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        object = object.iterator();
        int n3 = 0;
        int n4 = 0;
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            Object object2 = this.get(e2);
            if (object2 == null) {
                ++n4;
                continue;
            }
            immutableMap$Builder.put(e2, object2);
            ++n3;
        }
        this.globalStatsCounter.recordHits(n3);
        this.globalStatsCounter.recordMisses(n4);
        return immutableMap$Builder.buildKeepingLast();
    }

    public ReferenceEntry getEntry(Object object) {
        if (object == null) {
            return null;
        }
        int n3 = this.hash(object);
        return this.segmentFor(n3).getEntry(object, n3);
    }

    public Object getIfPresent(Object object) {
        Object object2 = Preconditions.checkNotNull(object);
        int n3 = this.hash(object2);
        Object object3 = this.segmentFor(n3);
        object = ((LocalCache$Segment)object3).get(object, n3);
        n3 = 1;
        if (object == null) {
            object3 = this.globalStatsCounter;
            object3.recordMisses(n3);
        } else {
            object3 = this.globalStatsCounter;
            object3.recordHits(n3);
        }
        return object;
    }

    public Object getLiveValue(ReferenceEntry referenceEntry, long l2) {
        Object object = referenceEntry.getKey();
        if (object == null) {
            return null;
        }
        object = referenceEntry.getValueReference().get();
        if (object == null) {
            return null;
        }
        boolean bl2 = this.isExpired(referenceEntry, l2);
        if (bl2) {
            return null;
        }
        return object;
    }

    public Object getOrDefault(Object object, Object object2) {
        if ((object = this.get(object)) != null) {
            object2 = object;
        }
        return object2;
    }

    public Object getOrLoad(Object object) {
        CacheLoader cacheLoader = this.defaultLoader;
        return this.get(object, cacheLoader);
    }

    public int hash(Object object) {
        return LocalCache.rehash(this.keyEquivalence.hash(object));
    }

    public void invalidateAll(Iterable object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            this.remove(e2);
        }
    }

    public boolean isEmpty() {
        int n3;
        int n4;
        LocalCache$Segment localCache$Segment;
        int n7;
        LocalCache$Segment[] localCache$SegmentArray = this.segments;
        int n8 = localCache$SegmentArray.length;
        long l2 = 0L;
        boolean bl2 = false;
        long l3 = l2;
        for (n7 = 0; n7 < n8; ++n7) {
            localCache$Segment = localCache$SegmentArray[n7];
            n4 = localCache$Segment.count;
            if (n4 != 0) {
                return false;
            }
            n3 = localCache$Segment.modCount;
            long l4 = n3;
            l3 += l4;
        }
        n8 = 1;
        n7 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
        if (n7 != 0) {
            n7 = localCache$SegmentArray.length;
            localCache$Segment = null;
            for (n3 = 0; n3 < n7; ++n3) {
                LocalCache$Segment localCache$Segment2 = localCache$SegmentArray[n3];
                int n10 = localCache$Segment2.count;
                if (n10 != 0) {
                    return false;
                }
                n4 = localCache$Segment2.modCount;
                long l7 = n4;
                l3 -= l7;
            }
            Object object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object == false) {
                bl2 = true;
            }
            return bl2;
        }
        return n8 != 0;
    }

    public boolean isExpired(ReferenceEntry referenceEntry, long l2) {
        long l3;
        Preconditions.checkNotNull(referenceEntry);
        Object object = this.expiresAfterAccess();
        boolean bl2 = true;
        if (object != 0) {
            l3 = referenceEntry.getAccessTime();
            long l4 = this.expireAfterAccessNanos;
            long l7 = (l3 = l2 - l3) - l4;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object >= 0) {
                return bl2;
            }
        }
        if ((object = this.expiresAfterWrite()) != 0) {
            l3 = referenceEntry.getWriteTime();
            long l8 = (l2 -= l3) - (l3 = this.expireAfterWriteNanos);
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 >= 0) {
                return bl2;
            }
        }
        return false;
    }

    public boolean isLive(ReferenceEntry object, long l2) {
        boolean bl2;
        int n3 = object.getHash();
        LocalCache$Segment localCache$Segment = this.segmentFor(n3);
        if ((object = localCache$Segment.getLiveValue((ReferenceEntry)object, l2)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Set keySet() {
        Set set = this.keySet;
        if (set == null) {
            this.keySet = set = new LocalCache$KeySet(this);
        }
        return set;
    }

    /*
     * Exception decompiling
     */
    public Map loadAll(Set var1_1, CacheLoader var2_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [6 : 295->298)] java.lang.Throwable
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

    public long longSize() {
        LocalCache$Segment[] localCache$SegmentArray = this.segments;
        int n3 = localCache$SegmentArray.length;
        long l2 = 0L;
        for (int i3 = 0; i3 < n3; ++i3) {
            LocalCache$Segment localCache$Segment = localCache$SegmentArray[i3];
            int n4 = localCache$Segment.count;
            n4 = Math.max(0, n4);
            long l3 = n4;
            l2 += l3;
        }
        return l2;
    }

    public ReferenceEntry newEntry(Object object, int n3, ReferenceEntry referenceEntry) {
        LocalCache$Segment localCache$Segment = this.segmentFor(n3);
        localCache$Segment.lock();
        try {
            object = localCache$Segment.newEntry(object, n3, referenceEntry);
            return object;
        }
        finally {
            localCache$Segment.unlock();
        }
    }

    public final LocalCache$Segment[] newSegmentArray(int n3) {
        return new LocalCache$Segment[n3];
    }

    public LocalCache$ValueReference newValueReference(ReferenceEntry referenceEntry, Object object, int n3) {
        int n4 = referenceEntry.getHash();
        LocalCache$Strength localCache$Strength = this.valueStrength;
        LocalCache$Segment localCache$Segment = this.segmentFor(n4);
        object = Preconditions.checkNotNull(object);
        return localCache$Strength.referenceValue(localCache$Segment, referenceEntry, object, n3);
    }

    public void processPendingNotifications() {
        RemovalNotification removalNotification;
        while ((removalNotification = (RemovalNotification)this.removalNotificationQueue.poll()) != null) {
            Object object = this.removalListener;
            try {
                object.onRemoval(removalNotification);
            }
            catch (Throwable throwable) {
                object = logger;
                Level level = Level.WARNING;
                String string2 = "Exception thrown by removal listener";
                ((Logger)object).log(level, string2, throwable);
            }
        }
    }

    public Object put(Object object, Object object2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        int n3 = this.hash(object);
        return this.segmentFor(n3).put(object, n3, object2, false);
    }

    public void putAll(Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Object k2 = entry.getKey();
            entry = entry.getValue();
            this.put(k2, entry);
        }
    }

    public Object putIfAbsent(Object object, Object object2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        int n3 = this.hash(object);
        return this.segmentFor(n3).put(object, n3, object2, true);
    }

    public void reclaimKey(ReferenceEntry referenceEntry) {
        int n3 = referenceEntry.getHash();
        this.segmentFor(n3).reclaimKey(referenceEntry, n3);
    }

    public void reclaimValue(LocalCache$ValueReference localCache$ValueReference) {
        Object object = localCache$ValueReference.getEntry();
        int n3 = object.getHash();
        LocalCache$Segment localCache$Segment = this.segmentFor(n3);
        object = object.getKey();
        localCache$Segment.reclaimValue(object, n3, localCache$ValueReference);
    }

    public boolean recordsAccess() {
        return this.expiresAfterAccess();
    }

    public boolean recordsTime() {
        boolean bl2 = this.recordsWrite();
        bl2 = bl2 || (bl2 = this.recordsAccess());
        return bl2;
    }

    public boolean recordsWrite() {
        boolean bl2 = this.expiresAfterWrite();
        bl2 = bl2 || (bl2 = this.refreshes());
        return bl2;
    }

    public void refresh(Object object) {
        Object object2 = Preconditions.checkNotNull(object);
        int n3 = this.hash(object2);
        LocalCache$Segment localCache$Segment = this.segmentFor(n3);
        CacheLoader cacheLoader = this.defaultLoader;
        localCache$Segment.refresh(object, n3, cacheLoader, false);
    }

    public boolean refreshes() {
        long l2 = this.refreshNanos;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        return bl2;
    }

    public Object remove(Object object) {
        if (object == null) {
            return null;
        }
        int n3 = this.hash(object);
        return this.segmentFor(n3).remove(object, n3);
    }

    public boolean remove(Object object, Object object2) {
        if (object != null && object2 != null) {
            int n3 = this.hash(object);
            return this.segmentFor(n3).remove(object, n3, object2);
        }
        return false;
    }

    public Object replace(Object object, Object object2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        int n3 = this.hash(object);
        return this.segmentFor(n3).replace(object, n3, object2);
    }

    public boolean replace(Object object, Object object2, Object object3) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object3);
        if (object2 == null) {
            return false;
        }
        int n3 = this.hash(object);
        return this.segmentFor(n3).replace(object, n3, object2, object3);
    }

    public LocalCache$Segment segmentFor(int n3) {
        LocalCache$Segment[] localCache$SegmentArray = this.segments;
        int n4 = this.segmentShift;
        n3 >>>= n4;
        n4 = this.segmentMask;
        return localCache$SegmentArray[n3 &= n4];
    }

    public int size() {
        return Ints.saturatedCast(this.longSize());
    }

    public boolean usesAccessEntries() {
        boolean bl2 = this.usesAccessQueue();
        bl2 = bl2 || (bl2 = this.recordsAccess());
        return bl2;
    }

    public boolean usesAccessQueue() {
        boolean bl2 = this.expiresAfterAccess();
        bl2 = bl2 || (bl2 = this.evictsBySize());
        return bl2;
    }

    public boolean usesKeyReferences() {
        boolean bl2;
        LocalCache$Strength localCache$Strength = this.keyStrength;
        LocalCache$Strength localCache$Strength2 = LocalCache$Strength.STRONG;
        if (localCache$Strength != localCache$Strength2) {
            bl2 = true;
        } else {
            bl2 = false;
            localCache$Strength = null;
        }
        return bl2;
    }

    public boolean usesValueReferences() {
        boolean bl2;
        LocalCache$Strength localCache$Strength = this.valueStrength;
        LocalCache$Strength localCache$Strength2 = LocalCache$Strength.STRONG;
        if (localCache$Strength != localCache$Strength2) {
            bl2 = true;
        } else {
            bl2 = false;
            localCache$Strength = null;
        }
        return bl2;
    }

    public boolean usesWriteEntries() {
        boolean bl2 = this.usesWriteQueue();
        bl2 = bl2 || (bl2 = this.recordsWrite());
        return bl2;
    }

    public boolean usesWriteQueue() {
        return this.expiresAfterWrite();
    }

    public Collection values() {
        Collection collection = this.values;
        if (collection == null) {
            this.values = collection = new LocalCache$Values(this);
        }
        return collection;
    }
}

