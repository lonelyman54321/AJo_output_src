/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMaker$Dummy;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$InternalEntryHelper;
import com.google.common.collect.MapMakerInternalMap$Strength;
import com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry;
import com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$LinkedWeakKeyDummyValueEntry;
import com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment;
import java.lang.ref.ReferenceQueue;

final class MapMakerInternalMap$WeakKeyDummyValueEntry$Helper
implements MapMakerInternalMap$InternalEntryHelper {
    private static final MapMakerInternalMap$WeakKeyDummyValueEntry$Helper INSTANCE;

    static {
        MapMakerInternalMap$WeakKeyDummyValueEntry$Helper mapMakerInternalMap$WeakKeyDummyValueEntry$Helper;
        INSTANCE = mapMakerInternalMap$WeakKeyDummyValueEntry$Helper = new MapMakerInternalMap$WeakKeyDummyValueEntry$Helper();
    }

    public static MapMakerInternalMap$WeakKeyDummyValueEntry$Helper instance() {
        return INSTANCE;
    }

    public MapMakerInternalMap$WeakKeyDummyValueEntry copy(MapMakerInternalMap$WeakKeyDummyValueSegment mapMakerInternalMap$WeakKeyDummyValueSegment, MapMakerInternalMap$WeakKeyDummyValueEntry mapMakerInternalMap$WeakKeyDummyValueEntry, MapMakerInternalMap$WeakKeyDummyValueEntry mapMakerInternalMap$WeakKeyDummyValueEntry2) {
        Object object = mapMakerInternalMap$WeakKeyDummyValueEntry.getKey();
        if (object == null) {
            return null;
        }
        int n3 = mapMakerInternalMap$WeakKeyDummyValueEntry.hash;
        return this.newEntry(mapMakerInternalMap$WeakKeyDummyValueSegment, object, n3, mapMakerInternalMap$WeakKeyDummyValueEntry2);
    }

    public MapMakerInternalMap$Strength keyStrength() {
        return MapMakerInternalMap$Strength.WEAK;
    }

    public MapMakerInternalMap$WeakKeyDummyValueEntry newEntry(MapMakerInternalMap$WeakKeyDummyValueSegment object, Object object2, int n3, MapMakerInternalMap$WeakKeyDummyValueEntry mapMakerInternalMap$WeakKeyDummyValueEntry) {
        if (mapMakerInternalMap$WeakKeyDummyValueEntry == null) {
            object = MapMakerInternalMap$WeakKeyDummyValueSegment.access$800((MapMakerInternalMap$WeakKeyDummyValueSegment)object);
            Object var5_5 = null;
            mapMakerInternalMap$WeakKeyDummyValueEntry = new MapMakerInternalMap$WeakKeyDummyValueEntry((ReferenceQueue)object, object2, n3, null);
        } else {
            ReferenceQueue referenceQueue = MapMakerInternalMap$WeakKeyDummyValueSegment.access$800((MapMakerInternalMap$WeakKeyDummyValueSegment)object);
            MapMakerInternalMap$WeakKeyDummyValueEntry$LinkedWeakKeyDummyValueEntry mapMakerInternalMap$WeakKeyDummyValueEntry$LinkedWeakKeyDummyValueEntry = new MapMakerInternalMap$WeakKeyDummyValueEntry$LinkedWeakKeyDummyValueEntry(referenceQueue, object2, n3, mapMakerInternalMap$WeakKeyDummyValueEntry, null);
            mapMakerInternalMap$WeakKeyDummyValueEntry = mapMakerInternalMap$WeakKeyDummyValueEntry$LinkedWeakKeyDummyValueEntry;
        }
        return mapMakerInternalMap$WeakKeyDummyValueEntry;
    }

    public MapMakerInternalMap$WeakKeyDummyValueSegment newSegment(MapMakerInternalMap mapMakerInternalMap, int n3) {
        MapMakerInternalMap$WeakKeyDummyValueSegment mapMakerInternalMap$WeakKeyDummyValueSegment = new MapMakerInternalMap$WeakKeyDummyValueSegment(mapMakerInternalMap, n3);
        return mapMakerInternalMap$WeakKeyDummyValueSegment;
    }

    public void setValue(MapMakerInternalMap$WeakKeyDummyValueSegment mapMakerInternalMap$WeakKeyDummyValueSegment, MapMakerInternalMap$WeakKeyDummyValueEntry mapMakerInternalMap$WeakKeyDummyValueEntry, MapMaker$Dummy mapMaker$Dummy) {
    }

    public MapMakerInternalMap$Strength valueStrength() {
        return MapMakerInternalMap$Strength.STRONG;
    }
}

