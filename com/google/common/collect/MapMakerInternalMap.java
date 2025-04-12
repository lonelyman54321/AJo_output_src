/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap$1;
import com.google.common.collect.MapMakerInternalMap$EntrySet;
import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$InternalEntryHelper;
import com.google.common.collect.MapMakerInternalMap$KeySet;
import com.google.common.collect.MapMakerInternalMap$Segment;
import com.google.common.collect.MapMakerInternalMap$SerializationProxy;
import com.google.common.collect.MapMakerInternalMap$Strength;
import com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper;
import com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$Helper;
import com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper;
import com.google.common.collect.MapMakerInternalMap$Values;
import com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper;
import com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper;
import com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$Helper;
import com.google.common.collect.MapMakerInternalMap$WeakValueReference;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

class MapMakerInternalMap
extends AbstractMap
implements ConcurrentMap,
Serializable {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 0x40000000;
    static final int MAX_SEGMENTS = 65536;
    static final MapMakerInternalMap$WeakValueReference UNSET_WEAK_VALUE_REFERENCE;
    private static final long serialVersionUID = 5L;
    final int concurrencyLevel;
    final transient MapMakerInternalMap$InternalEntryHelper entryHelper;
    transient Set entrySet;
    final Equivalence keyEquivalence;
    transient Set keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient MapMakerInternalMap$Segment[] segments;
    transient Collection values;

    static {
        MapMakerInternalMap$1 mapMakerInternalMap$1 = new MapMakerInternalMap$1();
        UNSET_WEAK_VALUE_REFERENCE = mapMakerInternalMap$1;
    }

    private MapMakerInternalMap(MapMaker mapMakerInternalMap$SegmentArray, MapMakerInternalMap$InternalEntryHelper mapMakerInternalMap$InternalEntryHelper) {
        int n3;
        int n4;
        Equivalence equivalence;
        int n7;
        this.concurrencyLevel = n7 = Math.min(mapMakerInternalMap$SegmentArray.getConcurrencyLevel(), 65536);
        this.keyEquivalence = equivalence = mapMakerInternalMap$SegmentArray.getKeyEquivalence();
        this.entryHelper = mapMakerInternalMap$InternalEntryHelper;
        int n8 = Math.min(mapMakerInternalMap$SegmentArray.getInitialCapacity(), 0x40000000);
        int n10 = 0;
        mapMakerInternalMap$InternalEntryHelper = null;
        n7 = 1;
        int n14 = 0;
        MapMakerInternalMap$Segment[] mapMakerInternalMap$SegmentArray2 = null;
        for (n4 = 1; n4 < (n3 = this.concurrencyLevel); n4 <<= 1) {
            ++n14;
        }
        this.segmentShift = n14 = 32 - n14;
        this.segmentMask = n14 = n4 + -1;
        mapMakerInternalMap$SegmentArray2 = this.newSegmentArray(n4);
        this.segments = mapMakerInternalMap$SegmentArray2;
        if ((n4 *= (n14 = n8 / n4)) < n8) {
            ++n14;
        }
        while (n7 < n14) {
            n7 <<= 1;
        }
        while (n10 < (n4 = (mapMakerInternalMap$SegmentArray = this.segments).length)) {
            MapMakerInternalMap$Segment mapMakerInternalMap$Segment;
            mapMakerInternalMap$SegmentArray[n10] = mapMakerInternalMap$Segment = this.createSegment(n7);
            ++n10;
        }
    }

    public static /* synthetic */ ArrayList access$1800(Collection collection) {
        return MapMakerInternalMap.toArrayList(collection);
    }

    public static MapMakerInternalMap create(MapMaker object) {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength;
        Object object2;
        Object object3 = ((MapMaker)object).getKeyStrength();
        if (object3 == (object2 = MapMakerInternalMap$Strength.STRONG) && (object3 = ((MapMaker)object).getValueStrength()) == object2) {
            object2 = MapMakerInternalMap$StrongKeyStrongValueEntry$Helper.instance();
            object3 = new MapMakerInternalMap((MapMaker)object, (MapMakerInternalMap$InternalEntryHelper)object2);
            return object3;
        }
        object3 = ((MapMaker)object).getKeyStrength();
        if (object3 == object2 && (object3 = ((MapMaker)object).getValueStrength()) == (mapMakerInternalMap$Strength = MapMakerInternalMap$Strength.WEAK)) {
            object2 = MapMakerInternalMap$StrongKeyWeakValueEntry$Helper.instance();
            object3 = new MapMakerInternalMap((MapMaker)object, (MapMakerInternalMap$InternalEntryHelper)object2);
            return object3;
        }
        object3 = ((MapMaker)object).getKeyStrength();
        if (object3 == (mapMakerInternalMap$Strength = MapMakerInternalMap$Strength.WEAK) && (object3 = ((MapMaker)object).getValueStrength()) == object2) {
            object2 = MapMakerInternalMap$WeakKeyStrongValueEntry$Helper.instance();
            object3 = new MapMakerInternalMap((MapMaker)object, (MapMakerInternalMap$InternalEntryHelper)object2);
            return object3;
        }
        object3 = ((MapMaker)object).getKeyStrength();
        if (object3 == mapMakerInternalMap$Strength && (object3 = ((MapMaker)object).getValueStrength()) == mapMakerInternalMap$Strength) {
            object2 = MapMakerInternalMap$WeakKeyWeakValueEntry$Helper.instance();
            object3 = new MapMakerInternalMap((MapMaker)object, (MapMakerInternalMap$InternalEntryHelper)object2);
            return object3;
        }
        object = new AssertionError();
        throw object;
    }

    public static MapMakerInternalMap createWithDummyValues(MapMaker object) {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength;
        Object object2;
        Object object3 = object.getKeyStrength();
        if (object3 == (object2 = MapMakerInternalMap$Strength.STRONG) && (object3 = object.getValueStrength()) == object2) {
            object2 = MapMakerInternalMap$StrongKeyDummyValueEntry$Helper.instance();
            object3 = new MapMakerInternalMap((MapMaker)object, (MapMakerInternalMap$InternalEntryHelper)object2);
            return object3;
        }
        object3 = object.getKeyStrength();
        if (object3 == (mapMakerInternalMap$Strength = MapMakerInternalMap$Strength.WEAK) && (object3 = object.getValueStrength()) == object2) {
            object2 = MapMakerInternalMap$WeakKeyDummyValueEntry$Helper.instance();
            object3 = new MapMakerInternalMap((MapMaker)object, (MapMakerInternalMap$InternalEntryHelper)object2);
            return object3;
        }
        if ((object = object.getValueStrength()) == mapMakerInternalMap$Strength) {
            object = new IllegalArgumentException("Map cannot have both weak and dummy values");
            throw object;
        }
        object = new AssertionError();
        throw object;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializationProxy");
        throw object;
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

    public static MapMakerInternalMap$WeakValueReference unsetWeakValueReference() {
        return UNSET_WEAK_VALUE_REFERENCE;
    }

    public void clear() {
        for (MapMakerInternalMap$Segment mapMakerInternalMap$Segment : this.segments) {
            mapMakerInternalMap$Segment.clear();
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
        Object object2 = object;
        Object object3 = false;
        Equivalence equivalence = null;
        if (object == null) {
            return false;
        }
        MapMakerInternalMap$Segment[] mapMakerInternalMap$SegmentArray = this.segments;
        long l2 = -1;
        int n3 = 0;
        while (true) {
            int n4;
            if (n3 >= (n4 = 3)) break;
            n4 = mapMakerInternalMap$SegmentArray.length;
            long l3 = 0L;
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7;
                MapMakerInternalMap$Segment mapMakerInternalMap$Segment = mapMakerInternalMap$SegmentArray[i3];
                int cfr_ignored_0 = mapMakerInternalMap$Segment.count;
                AtomicReferenceArray atomicReferenceArray = mapMakerInternalMap$Segment.table;
                for (int i8 = 0; i8 < (n7 = atomicReferenceArray.length()); ++i8) {
                    for (MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry = (MapMakerInternalMap$InternalEntry)atomicReferenceArray.get(i8); mapMakerInternalMap$InternalEntry != null; mapMakerInternalMap$InternalEntry = mapMakerInternalMap$InternalEntry.getNext()) {
                        Object object4 = mapMakerInternalMap$Segment.getLiveValue(mapMakerInternalMap$InternalEntry);
                        if (object4 != null && (object3 = (equivalence = this.valueEquivalence()).equivalent(object2, object4))) {
                            return true;
                        }
                        object3 = false;
                        equivalence = null;
                    }
                    object3 = false;
                    equivalence = null;
                }
                long l4 = mapMakerInternalMap$Segment.modCount;
                l3 += l4;
                object3 = false;
                equivalence = null;
            }
            object3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (!object3) {
                break;
            }
            ++n3;
            l2 = l3;
            object3 = false;
            equivalence = null;
        }
        object2 = null;
        return false;
    }

    public MapMakerInternalMap$InternalEntry copyEntry(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry, MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry2) {
        int n3 = mapMakerInternalMap$InternalEntry.getHash();
        return this.segmentFor(n3).copyEntry(mapMakerInternalMap$InternalEntry, mapMakerInternalMap$InternalEntry2);
    }

    public MapMakerInternalMap$Segment createSegment(int n3) {
        return this.entryHelper.newSegment(this, n3);
    }

    public Set entrySet() {
        Set set = this.entrySet;
        if (set == null) {
            this.entrySet = set = new MapMakerInternalMap$EntrySet(this);
        }
        return set;
    }

    public Object get(Object object) {
        if (object == null) {
            return null;
        }
        int n3 = this.hash(object);
        return this.segmentFor(n3).get(object, n3);
    }

    public MapMakerInternalMap$InternalEntry getEntry(Object object) {
        if (object == null) {
            return null;
        }
        int n3 = this.hash(object);
        return this.segmentFor(n3).getEntry(object, n3);
    }

    public Object getLiveValue(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        Object object = mapMakerInternalMap$InternalEntry.getKey();
        if (object == null) {
            return null;
        }
        return mapMakerInternalMap$InternalEntry.getValue();
    }

    public int hash(Object object) {
        return MapMakerInternalMap.rehash(this.keyEquivalence.hash(object));
    }

    public boolean isEmpty() {
        MapMakerInternalMap$Segment mapMakerInternalMap$Segment;
        int n3;
        int n4;
        MapMakerInternalMap$Segment[] mapMakerInternalMap$SegmentArray = this.segments;
        long l2 = 0L;
        boolean bl2 = false;
        long l3 = l2;
        for (n4 = 0; n4 < (n3 = mapMakerInternalMap$SegmentArray.length); ++n4) {
            mapMakerInternalMap$Segment = mapMakerInternalMap$SegmentArray[n4];
            n3 = mapMakerInternalMap$Segment.count;
            if (n3 != 0) {
                return false;
            }
            mapMakerInternalMap$Segment = mapMakerInternalMap$SegmentArray[n4];
            n3 = mapMakerInternalMap$Segment.modCount;
            long l4 = n3;
            l3 += l4;
        }
        n4 = 1;
        n3 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
        if (n3 != 0) {
            int n7;
            mapMakerInternalMap$Segment = null;
            for (n3 = 0; n3 < (n7 = mapMakerInternalMap$SegmentArray.length); ++n3) {
                MapMakerInternalMap$Segment mapMakerInternalMap$Segment2 = mapMakerInternalMap$SegmentArray[n3];
                n7 = mapMakerInternalMap$Segment2.count;
                if (n7 != 0) {
                    return false;
                }
                mapMakerInternalMap$Segment2 = mapMakerInternalMap$SegmentArray[n3];
                n7 = mapMakerInternalMap$Segment2.modCount;
                long l7 = n7;
                l3 -= l7;
            }
            Object object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object == false) {
                bl2 = true;
            }
            return bl2;
        }
        return n4 != 0;
    }

    public boolean isLiveForTesting(MapMakerInternalMap$InternalEntry object) {
        boolean bl2;
        int n3 = object.getHash();
        MapMakerInternalMap$Segment mapMakerInternalMap$Segment = this.segmentFor(n3);
        if ((object = mapMakerInternalMap$Segment.getLiveValueForTesting((MapMakerInternalMap$InternalEntry)object)) != null) {
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
            this.keySet = set = new MapMakerInternalMap$KeySet(this);
        }
        return set;
    }

    public MapMakerInternalMap$Strength keyStrength() {
        return this.entryHelper.keyStrength();
    }

    public final MapMakerInternalMap$Segment[] newSegmentArray(int n3) {
        return new MapMakerInternalMap$Segment[n3];
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

    public void reclaimKey(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        int n3 = mapMakerInternalMap$InternalEntry.getHash();
        this.segmentFor(n3).reclaimKey(mapMakerInternalMap$InternalEntry, n3);
    }

    public void reclaimValue(MapMakerInternalMap$WeakValueReference mapMakerInternalMap$WeakValueReference) {
        Object object = mapMakerInternalMap$WeakValueReference.getEntry();
        int n3 = object.getHash();
        MapMakerInternalMap$Segment mapMakerInternalMap$Segment = this.segmentFor(n3);
        object = object.getKey();
        mapMakerInternalMap$Segment.reclaimValue(object, n3, mapMakerInternalMap$WeakValueReference);
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

    public MapMakerInternalMap$Segment segmentFor(int n3) {
        MapMakerInternalMap$Segment[] mapMakerInternalMap$SegmentArray = this.segments;
        int n4 = this.segmentShift;
        n3 >>>= n4;
        n4 = this.segmentMask;
        return mapMakerInternalMap$SegmentArray[n3 &= n4];
    }

    public int size() {
        int n3;
        MapMakerInternalMap$Segment[] mapMakerInternalMap$SegmentArray = this.segments;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = mapMakerInternalMap$SegmentArray.length); ++i3) {
            MapMakerInternalMap$Segment mapMakerInternalMap$Segment = mapMakerInternalMap$SegmentArray[i3];
            n3 = mapMakerInternalMap$Segment.count;
            long l3 = n3;
            l2 += l3;
        }
        return Ints.saturatedCast(l2);
    }

    public Equivalence valueEquivalence() {
        return this.entryHelper.valueStrength().defaultEquivalence();
    }

    public MapMakerInternalMap$Strength valueStrength() {
        return this.entryHelper.valueStrength();
    }

    public Collection values() {
        Collection collection = this.values;
        if (collection == null) {
            this.values = collection = new MapMakerInternalMap$Values(this);
        }
        return collection;
    }

    public Object writeReplace() {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength = this.entryHelper.keyStrength();
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength2 = this.entryHelper.valueStrength();
        Equivalence equivalence = this.keyEquivalence;
        Equivalence equivalence2 = this.entryHelper.valueStrength().defaultEquivalence();
        int n3 = this.concurrencyLevel;
        MapMakerInternalMap$SerializationProxy mapMakerInternalMap$SerializationProxy = new MapMakerInternalMap$SerializationProxy(mapMakerInternalMap$Strength, mapMakerInternalMap$Strength2, equivalence, equivalence2, n3, this);
        return mapMakerInternalMap$SerializationProxy;
    }
}

