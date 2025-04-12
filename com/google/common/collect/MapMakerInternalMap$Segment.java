/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$InternalEntryHelper;
import com.google.common.collect.MapMakerInternalMap$WeakValueReference;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

abstract class MapMakerInternalMap$Segment
extends ReentrantLock {
    volatile int count;
    final MapMakerInternalMap map;
    int modCount;
    final AtomicInteger readCount;
    volatile AtomicReferenceArray table;
    int threshold;

    public MapMakerInternalMap$Segment(MapMakerInternalMap serializable, int n3) {
        AtomicInteger atomicInteger;
        this.readCount = atomicInteger = new AtomicInteger();
        this.map = serializable;
        serializable = this.newEntryArray(n3);
        this.initTable((AtomicReferenceArray)serializable);
    }

    public static boolean isCollected(MapMakerInternalMap$InternalEntry object) {
        boolean bl2;
        if ((object = object.getValue()) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public abstract MapMakerInternalMap$InternalEntry castForTesting(MapMakerInternalMap$InternalEntry var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void clear() {
        int n3 = this.count;
        if (n3 == 0) return;
        this.lock();
        try {
            Serializable serializable = this.table;
            int n4 = 0;
            while (true) {
                int n7;
                if (n4 >= (n7 = ((AtomicReferenceArray)serializable).length())) {
                    this.maybeClearReferenceQueues();
                    serializable = this.readCount;
                    ((AtomicInteger)serializable).set(0);
                    this.modCount = n3 = this.modCount + 1;
                    this.count = 0;
                    this.unlock();
                    return;
                }
                n7 = 0;
                ((AtomicReferenceArray)serializable).set(n4, null);
                ++n4;
            }
        }
        catch (Throwable throwable) {}
        this.unlock();
        throw throwable;
    }

    public void clearReferenceQueue(ReferenceQueue referenceQueue) {
        Reference reference;
        while ((reference = referenceQueue.poll()) != null) {
        }
    }

    /*
     * Exception decompiling
     */
    public boolean clearValueForTesting(Object var1_1, int var2_3, MapMakerInternalMap$WeakValueReference var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [13 : 166->173)] java.lang.Throwable
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

    public boolean containsKey(Object object, int n3) {
        Throwable throwable2;
        block6: {
            block4: {
                boolean bl2;
                block5: {
                    try {
                        int n4 = this.count;
                        bl2 = false;
                        if (n4 == 0) break block4;
                    }
                    catch (Throwable throwable2) {}
                    object = this.getLiveEntry(object, n3);
                    if (object == null) break block5;
                    object = object.getValue();
                    if (object == null) break block5;
                    bl2 = true;
                    break block6;
                }
                this.postReadCleanup();
                return bl2;
            }
            this.postReadCleanup();
            return false;
        }
        this.postReadCleanup();
        throw throwable2;
    }

    public boolean containsValue(Object object) {
        block14: {
            int n3 = this.count;
            if (n3 == 0) break block14;
            AtomicReferenceArray atomicReferenceArray = this.table;
            int n4 = atomicReferenceArray.length();
            for (int i3 = 0; i3 < n4; ++i3) {
                Object object2 = atomicReferenceArray.get(i3);
                object2 = (MapMakerInternalMap$InternalEntry)object2;
                while (object2 != null) {
                    block15: {
                        Object object3;
                        try {
                            object3 = this.getLiveValue((MapMakerInternalMap$InternalEntry)object2);
                            if (object3 == null) break block15;
                        }
                        catch (Throwable throwable) {}
                        Object object4 = this.map;
                        object4 = ((MapMakerInternalMap)object4).valueEquivalence();
                        boolean bl2 = ((Equivalence)object4).equivalent(object, object3);
                        if (!bl2) break block15;
                        this.postReadCleanup();
                        return true;
                    }
                    try {
                        object2 = object2.getNext();
                        return (boolean)object2;
                    }
                    finally {
                    }
                }
            }
        }
        this.postReadCleanup();
        return false;
    }

    public MapMakerInternalMap$InternalEntry copyEntry(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry2) {
        MapMakerInternalMap$InternalEntryHelper mapMakerInternalMap$InternalEntryHelper = this.map.entryHelper;
        MapMakerInternalMap$Segment mapMakerInternalMap$Segment = this.self();
        return mapMakerInternalMap$InternalEntryHelper.copy(mapMakerInternalMap$Segment, mapMakerInternalMap$InternalEntry, mapMakerInternalMap$InternalEntry2);
    }

    public MapMakerInternalMap$InternalEntry copyForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry2) {
        MapMakerInternalMap$InternalEntryHelper mapMakerInternalMap$InternalEntryHelper = this.map.entryHelper;
        MapMakerInternalMap$Segment mapMakerInternalMap$Segment = this.self();
        mapMakerInternalMap$InternalEntry = this.castForTesting(mapMakerInternalMap$InternalEntry);
        mapMakerInternalMap$InternalEntry2 = this.castForTesting(mapMakerInternalMap$InternalEntry2);
        return mapMakerInternalMap$InternalEntryHelper.copy(mapMakerInternalMap$Segment, mapMakerInternalMap$InternalEntry, mapMakerInternalMap$InternalEntry2);
    }

    public void drainKeyReferenceQueue(ReferenceQueue referenceQueue) {
        Object object;
        int n3 = 0;
        while ((object = referenceQueue.poll()) != null) {
            object = (MapMakerInternalMap$InternalEntry)object;
            MapMakerInternalMap mapMakerInternalMap = this.map;
            mapMakerInternalMap.reclaimKey((MapMakerInternalMap$InternalEntry)object);
            int n4 = 16;
            if (++n3 != n4) continue;
        }
    }

    public void drainValueReferenceQueue(ReferenceQueue referenceQueue) {
        Object object;
        int n3 = 0;
        while ((object = referenceQueue.poll()) != null) {
            object = (MapMakerInternalMap$WeakValueReference)object;
            MapMakerInternalMap mapMakerInternalMap = this.map;
            mapMakerInternalMap.reclaimValue((MapMakerInternalMap$WeakValueReference)object);
            int n4 = 16;
            if (++n3 != n4) continue;
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
            MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry;
            MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry2 = (MapMakerInternalMap$InternalEntry)atomicReferenceArray.get(i3);
            if (mapMakerInternalMap$InternalEntry2 == null) continue;
            int n10 = mapMakerInternalMap$InternalEntry2.getHash() & n3;
            if (mapMakerInternalMap$InternalEntry == null) {
                atomicReferenceArray2.set(n10, mapMakerInternalMap$InternalEntry2);
                continue;
            }
            MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry3 = mapMakerInternalMap$InternalEntry2;
            for (mapMakerInternalMap$InternalEntry = mapMakerInternalMap$InternalEntry2.getNext(); mapMakerInternalMap$InternalEntry != null; mapMakerInternalMap$InternalEntry = mapMakerInternalMap$InternalEntry.getNext()) {
                int n14 = mapMakerInternalMap$InternalEntry.getHash() & n3;
                if (n14 == n10) continue;
                mapMakerInternalMap$InternalEntry3 = mapMakerInternalMap$InternalEntry;
                n10 = n14;
            }
            atomicReferenceArray2.set(n10, mapMakerInternalMap$InternalEntry3);
            while (mapMakerInternalMap$InternalEntry2 != mapMakerInternalMap$InternalEntry3) {
                int n15 = mapMakerInternalMap$InternalEntry2.getHash() & n3;
                MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry4 = (MapMakerInternalMap$InternalEntry)atomicReferenceArray2.get(n15);
                if ((mapMakerInternalMap$InternalEntry4 = this.copyEntry(mapMakerInternalMap$InternalEntry2, mapMakerInternalMap$InternalEntry4)) != null) {
                    atomicReferenceArray2.set(n15, mapMakerInternalMap$InternalEntry4);
                } else {
                    n4 += -1;
                }
                mapMakerInternalMap$InternalEntry2 = mapMakerInternalMap$InternalEntry2.getNext();
            }
        }
        this.table = atomicReferenceArray2;
        this.count = n4;
    }

    public Object get(Object object, int n3) {
        Throwable throwable2;
        block6: {
            block5: {
                block4: {
                    try {
                        object = this.getLiveEntry(object, n3);
                        if (object != null) break block4;
                        this.postReadCleanup();
                        return null;
                    }
                    catch (Throwable throwable2) {}
                }
                object = object.getValue();
                if (object != null) break block5;
                this.tryDrainReferenceQueues();
                break block6;
            }
            this.postReadCleanup();
            return object;
        }
        this.postReadCleanup();
        throw throwable2;
    }

    public MapMakerInternalMap$InternalEntry getEntry(Object object, int n3) {
        int n4 = this.count;
        if (n4 != 0) {
            for (MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry = this.getFirst(n3); mapMakerInternalMap$InternalEntry != null; mapMakerInternalMap$InternalEntry = mapMakerInternalMap$InternalEntry.getNext()) {
                int n7 = mapMakerInternalMap$InternalEntry.getHash();
                if (n7 != n3) continue;
                Object object2 = mapMakerInternalMap$InternalEntry.getKey();
                if (object2 == null) {
                    this.tryDrainReferenceQueues();
                    continue;
                }
                Equivalence equivalence = this.map.keyEquivalence;
                n7 = (int)(equivalence.equivalent(object, object2) ? 1 : 0);
                if (n7 == 0) continue;
                return mapMakerInternalMap$InternalEntry;
            }
        }
        return null;
    }

    public MapMakerInternalMap$InternalEntry getFirst(int n3) {
        AtomicReferenceArray atomicReferenceArray = this.table;
        int n4 = atomicReferenceArray.length() + -1;
        return (MapMakerInternalMap$InternalEntry)atomicReferenceArray.get(n3 &= n4);
    }

    public ReferenceQueue getKeyReferenceQueueForTesting() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public MapMakerInternalMap$InternalEntry getLiveEntry(Object object, int n3) {
        return this.getEntry(object, n3);
    }

    public Object getLiveValue(MapMakerInternalMap$InternalEntry object) {
        Object object2 = object.getKey();
        if (object2 == null) {
            this.tryDrainReferenceQueues();
            return null;
        }
        if ((object = object.getValue()) == null) {
            this.tryDrainReferenceQueues();
            return null;
        }
        return object;
    }

    public Object getLiveValueForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        mapMakerInternalMap$InternalEntry = this.castForTesting(mapMakerInternalMap$InternalEntry);
        return this.getLiveValue(mapMakerInternalMap$InternalEntry);
    }

    public ReferenceQueue getValueReferenceQueueForTesting() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public MapMakerInternalMap$WeakValueReference getWeakValueReferenceForTesting(MapMakerInternalMap$InternalEntry object) {
        object = new AssertionError();
        throw object;
    }

    public void initTable(AtomicReferenceArray atomicReferenceArray) {
        int n3;
        this.threshold = n3 = atomicReferenceArray.length() * 3 / 4;
        this.table = atomicReferenceArray;
    }

    public void maybeClearReferenceQueues() {
    }

    public void maybeDrainReferenceQueues() {
    }

    public AtomicReferenceArray newEntryArray(int n3) {
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(n3);
        return atomicReferenceArray;
    }

    public MapMakerInternalMap$InternalEntry newEntryForTesting(Object object, int n3, MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        MapMakerInternalMap$InternalEntryHelper mapMakerInternalMap$InternalEntryHelper = this.map.entryHelper;
        MapMakerInternalMap$Segment mapMakerInternalMap$Segment = this.self();
        mapMakerInternalMap$InternalEntry = this.castForTesting(mapMakerInternalMap$InternalEntry);
        return mapMakerInternalMap$InternalEntryHelper.newEntry(mapMakerInternalMap$Segment, object, n3, mapMakerInternalMap$InternalEntry);
    }

    public MapMakerInternalMap$WeakValueReference newWeakValueReferenceForTesting(MapMakerInternalMap$InternalEntry object, Object object2) {
        object = new AssertionError();
        throw object;
    }

    public void postReadCleanup() {
        AtomicInteger atomicInteger = this.readCount;
        int n3 = atomicInteger.incrementAndGet() & 0x3F;
        if (n3 == 0) {
            this.runCleanup();
        }
    }

    public void preWriteCleanup() {
        this.runLockedCleanup();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object put(Object object, int n3, Object object2, boolean bl2) {
        Object e2;
        Object e5;
        int n4;
        AtomicReferenceArray atomicReferenceArray;
        int n7;
        block8: {
            this.lock();
            try {
                this.preWriteCleanup();
                n7 = this.count + 1;
                int n8 = this.threshold;
                if (n7 > n8) {
                    this.expand();
                    n7 = this.count + 1;
                }
                atomicReferenceArray = this.table;
                n4 = atomicReferenceArray.length() + -1 & n3;
                e5 = atomicReferenceArray.get(n4);
                break block8;
            }
            catch (Throwable throwable) {}
            this.unlock();
            throw throwable;
        }
        for (e2 = e5 = (MapMakerInternalMap$InternalEntry)e5; e2 != null; e2 = e2.getNext()) {
            Object object3 = e2.getKey();
            int n10 = e2.getHash();
            if (n10 != n3 || object3 == null) continue;
            Object object4 = this.map;
            object4 = ((MapMakerInternalMap)object4).keyEquivalence;
            boolean bl3 = ((Equivalence)object4).equivalent(object, object3);
            if (!bl3) continue;
            object = e2.getValue();
            if (object == null) {
                int n14;
                this.modCount = n14 = this.modCount + 1;
                this.setValue((MapMakerInternalMap$InternalEntry)e2, object2);
                this.count = n14 = this.count;
                this.unlock();
                return null;
            }
            if (bl2) {
                this.unlock();
                return object;
            }
            this.modCount = n3 = this.modCount + 1;
            this.setValue((MapMakerInternalMap$InternalEntry)e2, object2);
            this.unlock();
            return object;
        }
        {
            bl2 = this.modCount + 1;
            this.modCount = (int)(bl2 ? 1 : 0);
            Object object5 = this.map;
            object5 = ((MapMakerInternalMap)object5).entryHelper;
            e2 = this.self();
            object = object5.newEntry((MapMakerInternalMap$Segment)e2, object, n3, (MapMakerInternalMap$InternalEntry)e5);
            this.setValue((MapMakerInternalMap$InternalEntry)object, object2);
            atomicReferenceArray.set(n4, object);
            this.count = n7;
            this.unlock();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean reclaimKey(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, int n3) {
        Object object;
        Object object2;
        int n4;
        int n7;
        AtomicReferenceArray atomicReferenceArray;
        this.lock();
        try {
            atomicReferenceArray = this.table;
            n7 = atomicReferenceArray.length();
            n4 = 1;
            object2 = atomicReferenceArray.get(n3 &= (n7 -= n4));
            object = object2 = (MapMakerInternalMap$InternalEntry)object2;
        }
        catch (Throwable throwable) {}
        while (true) {
            if (object == null) {
                this.unlock();
                return false;
            }
            if (object == mapMakerInternalMap$InternalEntry) {
                int n8;
                this.modCount = n8 = this.modCount + n4;
                mapMakerInternalMap$InternalEntry = this.removeFromChain((MapMakerInternalMap$InternalEntry)object2, (MapMakerInternalMap$InternalEntry)object);
                n7 = this.count - n4;
                atomicReferenceArray.set(n3, mapMakerInternalMap$InternalEntry);
                this.count = n7;
                this.unlock();
                return n4 != 0;
            }
            object = object.getNext();
            continue;
            break;
        }
        this.unlock();
        throw throwable;
    }

    /*
     * Exception decompiling
     */
    public boolean reclaimValue(Object var1_1, int var2_3, MapMakerInternalMap$WeakValueReference var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 17[TRYBLOCK] [17 : 194->201)] java.lang.Throwable
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
    public Object remove(Object object, int n3) {
        Throwable throwable2;
        block5: {
            this.lock();
            try {
                this.preWriteCleanup();
                AtomicReferenceArray atomicReferenceArray = this.table;
                int n4 = atomicReferenceArray.length() + -1 & n3;
                Object e2 = atomicReferenceArray.get(n4);
                for (Object e5 = e2 = (MapMakerInternalMap$InternalEntry)e2; e5 != null; e5 = e5.getNext()) {
                    Object object2 = e5.getKey();
                    int n7 = e5.getHash();
                    if (n7 != n3 || object2 == null) continue;
                    Object object3 = this.map;
                    object3 = ((MapMakerInternalMap)object3).keyEquivalence;
                    boolean bl2 = ((Equivalence)object3).equivalent(object, object2);
                    if (!bl2) continue;
                    object = e5.getValue();
                    if (object != null || (n3 = (int)(MapMakerInternalMap$Segment.isCollected((MapMakerInternalMap$InternalEntry)e5) ? 1 : 0)) != 0) {
                        this.modCount = n3 = this.modCount + 1;
                        MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry = this.removeFromChain((MapMakerInternalMap$InternalEntry)e2, (MapMakerInternalMap$InternalEntry)e5);
                        int n8 = this.count + -1;
                        atomicReferenceArray.set(n4, mapMakerInternalMap$InternalEntry);
                        this.count = n8;
                        this.unlock();
                        return object;
                    }
                    this.unlock();
                    return null;
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            this.unlock();
            return null;
        }
        this.unlock();
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean remove(Object var1_1, int var2_3, Object var3_4) {
        block11: {
            block8: {
                this.lock();
                try {
                    this.preWriteCleanup();
                    var4_5 = this.table;
                    var5_6 = var4_5.length();
                    var6_7 = 1;
                    var5_6 = var5_6 - var6_7 & var2_3;
                    var7_8 = var4_5.get(var5_6);
                    var8_9 = var7_8 = (MapMakerInternalMap$InternalEntry)var7_8;
                    while (true) {
                        var9_10 = false;
                        if (var8_9 == null) break block8;
                        var10_11 = var8_9.getKey();
                        var11_12 = var8_9.getHash();
                        if (var11_12 != var2_3 || var10_11 == null) break block9;
                        var12_13 = this.map;
                        var12_13 = var12_13.keyEquivalence;
                        var13_14 = var12_13.equivalent(var1_1, var10_11);
                        if (!var13_14) break block9;
                        var1_1 = var8_9.getValue();
                        var14_15 = this.map;
                        var15_16 = (var14_15 = var14_15.valueEquivalence()).equivalent(var3_4, var1_1);
                        if (var15_16 != 0) {
                            var9_10 = true;
                        } else {
                            var15_16 = MapMakerInternalMap$Segment.isCollected((MapMakerInternalMap$InternalEntry)var8_9);
                            if (var15_16 == 0) ** break block10
                        }
                        this.modCount = var15_16 = this.modCount + var6_7;
                        var1_1 = this.removeFromChain((MapMakerInternalMap$InternalEntry)var7_8, (MapMakerInternalMap$InternalEntry)var8_9);
                        var2_3 = this.count - var6_7;
                        var4_5.set(var5_6, var1_1);
                        this.count = var2_3;
                        this.unlock();
                        return var9_10;
                    }
                }
                catch (Throwable var1_2) {
                    break block11;
                }
                {
                    block9: {
                        this.unlock();
                        return false;
                    }
                    var8_9 = var8_9.getNext();
                    continue;
                }
            }
            this.unlock();
            return false;
        }
        this.unlock();
        throw var1_2;
    }

    public boolean removeEntryForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry2;
        int n3 = mapMakerInternalMap$InternalEntry.getHash();
        AtomicReferenceArray atomicReferenceArray = this.table;
        int n4 = atomicReferenceArray.length();
        int n7 = 1;
        for (MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry3 = mapMakerInternalMap$InternalEntry2 = (MapMakerInternalMap$InternalEntry)atomicReferenceArray.get(n3 &= (n4 -= n7)); mapMakerInternalMap$InternalEntry3 != null; mapMakerInternalMap$InternalEntry3 = mapMakerInternalMap$InternalEntry3.getNext()) {
            int n8;
            if (mapMakerInternalMap$InternalEntry3 != mapMakerInternalMap$InternalEntry) continue;
            this.modCount = n8 = this.modCount + n7;
            mapMakerInternalMap$InternalEntry = this.removeFromChain(mapMakerInternalMap$InternalEntry2, mapMakerInternalMap$InternalEntry3);
            n4 = this.count - n7;
            atomicReferenceArray.set(n3, mapMakerInternalMap$InternalEntry);
            this.count = n4;
            return n7 != 0;
        }
        return false;
    }

    public MapMakerInternalMap$InternalEntry removeFromChain(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry2) {
        int n3 = this.count;
        MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry3 = mapMakerInternalMap$InternalEntry2.getNext();
        while (mapMakerInternalMap$InternalEntry != mapMakerInternalMap$InternalEntry2) {
            MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry4 = this.copyEntry(mapMakerInternalMap$InternalEntry, mapMakerInternalMap$InternalEntry3);
            if (mapMakerInternalMap$InternalEntry4 != null) {
                mapMakerInternalMap$InternalEntry3 = mapMakerInternalMap$InternalEntry4;
            } else {
                n3 += -1;
            }
            mapMakerInternalMap$InternalEntry = mapMakerInternalMap$InternalEntry.getNext();
        }
        this.count = n3;
        return mapMakerInternalMap$InternalEntry3;
    }

    public MapMakerInternalMap$InternalEntry removeFromChainForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry2) {
        mapMakerInternalMap$InternalEntry = this.castForTesting(mapMakerInternalMap$InternalEntry);
        mapMakerInternalMap$InternalEntry2 = this.castForTesting(mapMakerInternalMap$InternalEntry2);
        return this.removeFromChain(mapMakerInternalMap$InternalEntry, mapMakerInternalMap$InternalEntry2);
    }

    public boolean removeTableEntryForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        mapMakerInternalMap$InternalEntry = this.castForTesting(mapMakerInternalMap$InternalEntry);
        return this.removeEntryForTesting(mapMakerInternalMap$InternalEntry);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object replace(Object object, int n3, Object object2) {
        block7: {
            Throwable throwable2;
            block8: {
                this.lock();
                try {
                    this.preWriteCleanup();
                    AtomicReferenceArray atomicReferenceArray = this.table;
                    int n4 = atomicReferenceArray.length() + -1 & n3;
                    Object e2 = atomicReferenceArray.get(n4);
                    for (Object e5 = e2 = (MapMakerInternalMap$InternalEntry)e2; e5 != null; e5 = e5.getNext()) {
                        Object object3 = e5.getKey();
                        int n7 = e5.getHash();
                        if (n7 != n3 || object3 == null) continue;
                        Object object4 = this.map;
                        object4 = ((MapMakerInternalMap)object4).keyEquivalence;
                        boolean bl2 = ((Equivalence)object4).equivalent(object, object3);
                        if (!bl2) continue;
                        object = e5.getValue();
                        if (object == null) {
                            int n8 = MapMakerInternalMap$Segment.isCollected((MapMakerInternalMap$InternalEntry)e5);
                            if (n8 != 0) {
                                this.modCount = n8 = this.modCount + 1;
                                object = this.removeFromChain((MapMakerInternalMap$InternalEntry)e2, (MapMakerInternalMap$InternalEntry)e5);
                                n3 = this.count + -1;
                                atomicReferenceArray.set(n4, object);
                                this.count = n3;
                            }
                            break block7;
                        }
                        this.modCount = n3 = this.modCount + 1;
                        this.setValue((MapMakerInternalMap$InternalEntry)e5, object2);
                        this.unlock();
                        return object;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                this.unlock();
                return null;
            }
            this.unlock();
            throw throwable2;
        }
        this.unlock();
        return null;
    }

    /*
     * Exception decompiling
     */
    public boolean replace(Object var1_1, int var2_3, Object var3_4, Object var4_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 17[TRYBLOCK] [18 : 197->201)] java.lang.Throwable
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

    public void runCleanup() {
        this.runLockedCleanup();
    }

    public void runLockedCleanup() {
        boolean bl2 = this.tryLock();
        if (bl2) {
            try {
                this.maybeDrainReferenceQueues();
                AtomicInteger atomicInteger = this.readCount;
                atomicInteger.set(0);
            }
            finally {
                this.unlock();
            }
        }
    }

    public abstract MapMakerInternalMap$Segment self();

    public void setTableEntryForTesting(int n3, MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        AtomicReferenceArray atomicReferenceArray = this.table;
        mapMakerInternalMap$InternalEntry = this.castForTesting(mapMakerInternalMap$InternalEntry);
        atomicReferenceArray.set(n3, mapMakerInternalMap$InternalEntry);
    }

    public void setValue(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, Object object) {
        MapMakerInternalMap$InternalEntryHelper mapMakerInternalMap$InternalEntryHelper = this.map.entryHelper;
        MapMakerInternalMap$Segment mapMakerInternalMap$Segment = this.self();
        mapMakerInternalMap$InternalEntryHelper.setValue(mapMakerInternalMap$Segment, mapMakerInternalMap$InternalEntry, object);
    }

    public void setValueForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, Object object) {
        MapMakerInternalMap$InternalEntryHelper mapMakerInternalMap$InternalEntryHelper = this.map.entryHelper;
        MapMakerInternalMap$Segment mapMakerInternalMap$Segment = this.self();
        mapMakerInternalMap$InternalEntry = this.castForTesting(mapMakerInternalMap$InternalEntry);
        mapMakerInternalMap$InternalEntryHelper.setValue(mapMakerInternalMap$Segment, mapMakerInternalMap$InternalEntry, object);
    }

    public void setWeakValueReferenceForTesting(MapMakerInternalMap$InternalEntry object, MapMakerInternalMap$WeakValueReference mapMakerInternalMap$WeakValueReference) {
        object = new AssertionError();
        throw object;
    }

    public void tryDrainReferenceQueues() {
        boolean bl2 = this.tryLock();
        if (bl2) {
            try {
                this.maybeDrainReferenceQueues();
            }
            finally {
                this.unlock();
            }
        }
    }
}

