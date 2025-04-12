/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$AbstractWeakKeyEntry;
import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$InternalEntryHelper;
import com.google.common.collect.MapMakerInternalMap$Segment;
import com.google.common.collect.MapMakerInternalMap$Strength;
import com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry;
import com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$LinkedWeakKeyWeakValueEntry;
import com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment;
import com.google.common.collect.MapMakerInternalMap$WeakValueReference;
import com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl;
import java.lang.ref.ReferenceQueue;

final class MapMakerInternalMap$WeakKeyWeakValueEntry$Helper
implements MapMakerInternalMap$InternalEntryHelper {
    private static final MapMakerInternalMap$WeakKeyWeakValueEntry$Helper INSTANCE;

    static {
        MapMakerInternalMap$WeakKeyWeakValueEntry$Helper mapMakerInternalMap$WeakKeyWeakValueEntry$Helper;
        INSTANCE = mapMakerInternalMap$WeakKeyWeakValueEntry$Helper = new MapMakerInternalMap$WeakKeyWeakValueEntry$Helper();
    }

    public static MapMakerInternalMap$WeakKeyWeakValueEntry$Helper instance() {
        return INSTANCE;
    }

    public MapMakerInternalMap$WeakKeyWeakValueEntry copy(MapMakerInternalMap$WeakKeyWeakValueSegment object, MapMakerInternalMap$WeakKeyWeakValueEntry object2, MapMakerInternalMap$WeakKeyWeakValueEntry mapMakerInternalMap$WeakKeyWeakValueEntry) {
        Object object3 = ((MapMakerInternalMap$AbstractWeakKeyEntry)object2).getKey();
        int n3 = 0;
        if (object3 == null) {
            return null;
        }
        boolean bl2 = MapMakerInternalMap$Segment.isCollected((MapMakerInternalMap$InternalEntry)object2);
        if (bl2) {
            return null;
        }
        n3 = ((MapMakerInternalMap$AbstractWeakKeyEntry)object2).hash;
        mapMakerInternalMap$WeakKeyWeakValueEntry = this.newEntry((MapMakerInternalMap$WeakKeyWeakValueSegment)object, object3, n3, mapMakerInternalMap$WeakKeyWeakValueEntry);
        object2 = MapMakerInternalMap$WeakKeyWeakValueEntry.access$1400((MapMakerInternalMap$WeakKeyWeakValueEntry)object2);
        object = MapMakerInternalMap$WeakKeyWeakValueSegment.access$1500((MapMakerInternalMap$WeakKeyWeakValueSegment)object);
        object = object2.copyFor((ReferenceQueue)object, mapMakerInternalMap$WeakKeyWeakValueEntry);
        MapMakerInternalMap$WeakKeyWeakValueEntry.access$1402(mapMakerInternalMap$WeakKeyWeakValueEntry, (MapMakerInternalMap$WeakValueReference)object);
        return mapMakerInternalMap$WeakKeyWeakValueEntry;
    }

    public MapMakerInternalMap$Strength keyStrength() {
        return MapMakerInternalMap$Strength.WEAK;
    }

    public MapMakerInternalMap$WeakKeyWeakValueEntry newEntry(MapMakerInternalMap$WeakKeyWeakValueSegment object, Object object2, int n3, MapMakerInternalMap$WeakKeyWeakValueEntry mapMakerInternalMap$WeakKeyWeakValueEntry) {
        if (mapMakerInternalMap$WeakKeyWeakValueEntry == null) {
            object = MapMakerInternalMap$WeakKeyWeakValueSegment.access$1600((MapMakerInternalMap$WeakKeyWeakValueSegment)object);
            mapMakerInternalMap$WeakKeyWeakValueEntry = new MapMakerInternalMap$WeakKeyWeakValueEntry((ReferenceQueue)object, object2, n3);
        } else {
            object = MapMakerInternalMap$WeakKeyWeakValueSegment.access$1600((MapMakerInternalMap$WeakKeyWeakValueSegment)object);
            MapMakerInternalMap$WeakKeyWeakValueEntry$LinkedWeakKeyWeakValueEntry mapMakerInternalMap$WeakKeyWeakValueEntry$LinkedWeakKeyWeakValueEntry = new MapMakerInternalMap$WeakKeyWeakValueEntry$LinkedWeakKeyWeakValueEntry((ReferenceQueue)object, object2, n3, mapMakerInternalMap$WeakKeyWeakValueEntry);
            mapMakerInternalMap$WeakKeyWeakValueEntry = mapMakerInternalMap$WeakKeyWeakValueEntry$LinkedWeakKeyWeakValueEntry;
        }
        return mapMakerInternalMap$WeakKeyWeakValueEntry;
    }

    public MapMakerInternalMap$WeakKeyWeakValueSegment newSegment(MapMakerInternalMap mapMakerInternalMap, int n3) {
        MapMakerInternalMap$WeakKeyWeakValueSegment mapMakerInternalMap$WeakKeyWeakValueSegment = new MapMakerInternalMap$WeakKeyWeakValueSegment(mapMakerInternalMap, n3);
        return mapMakerInternalMap$WeakKeyWeakValueSegment;
    }

    public void setValue(MapMakerInternalMap$WeakKeyWeakValueSegment object, MapMakerInternalMap$WeakKeyWeakValueEntry mapMakerInternalMap$WeakKeyWeakValueEntry, Object object2) {
        MapMakerInternalMap$WeakValueReference mapMakerInternalMap$WeakValueReference = MapMakerInternalMap$WeakKeyWeakValueEntry.access$1400(mapMakerInternalMap$WeakKeyWeakValueEntry);
        object = MapMakerInternalMap$WeakKeyWeakValueSegment.access$1500((MapMakerInternalMap$WeakKeyWeakValueSegment)object);
        MapMakerInternalMap$WeakValueReferenceImpl mapMakerInternalMap$WeakValueReferenceImpl = new MapMakerInternalMap$WeakValueReferenceImpl((ReferenceQueue)object, object2, mapMakerInternalMap$WeakKeyWeakValueEntry);
        MapMakerInternalMap$WeakKeyWeakValueEntry.access$1402(mapMakerInternalMap$WeakKeyWeakValueEntry, mapMakerInternalMap$WeakValueReferenceImpl);
        mapMakerInternalMap$WeakValueReference.clear();
    }

    public MapMakerInternalMap$Strength valueStrength() {
        return MapMakerInternalMap$Strength.WEAK;
    }
}

