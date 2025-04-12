/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$AbstractStrongKeyEntry;
import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$InternalEntryHelper;
import com.google.common.collect.MapMakerInternalMap$Segment;
import com.google.common.collect.MapMakerInternalMap$Strength;
import com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry;
import com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$LinkedStrongKeyWeakValueEntry;
import com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment;
import com.google.common.collect.MapMakerInternalMap$WeakValueReference;
import com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl;
import java.lang.ref.ReferenceQueue;

final class MapMakerInternalMap$StrongKeyWeakValueEntry$Helper
implements MapMakerInternalMap$InternalEntryHelper {
    private static final MapMakerInternalMap$StrongKeyWeakValueEntry$Helper INSTANCE;

    static {
        MapMakerInternalMap$StrongKeyWeakValueEntry$Helper mapMakerInternalMap$StrongKeyWeakValueEntry$Helper;
        INSTANCE = mapMakerInternalMap$StrongKeyWeakValueEntry$Helper = new MapMakerInternalMap$StrongKeyWeakValueEntry$Helper();
    }

    public static MapMakerInternalMap$StrongKeyWeakValueEntry$Helper instance() {
        return INSTANCE;
    }

    public MapMakerInternalMap$StrongKeyWeakValueEntry copy(MapMakerInternalMap$StrongKeyWeakValueSegment object, MapMakerInternalMap$StrongKeyWeakValueEntry object2, MapMakerInternalMap$StrongKeyWeakValueEntry mapMakerInternalMap$StrongKeyWeakValueEntry) {
        boolean bl2 = MapMakerInternalMap$Segment.isCollected((MapMakerInternalMap$InternalEntry)object2);
        if (bl2) {
            return null;
        }
        Object object3 = ((MapMakerInternalMap$AbstractStrongKeyEntry)object2).key;
        int n3 = ((MapMakerInternalMap$AbstractStrongKeyEntry)object2).hash;
        mapMakerInternalMap$StrongKeyWeakValueEntry = this.newEntry((MapMakerInternalMap$StrongKeyWeakValueSegment)object, object3, n3, mapMakerInternalMap$StrongKeyWeakValueEntry);
        object2 = MapMakerInternalMap$StrongKeyWeakValueEntry.access$400((MapMakerInternalMap$StrongKeyWeakValueEntry)object2);
        object = MapMakerInternalMap$StrongKeyWeakValueSegment.access$500((MapMakerInternalMap$StrongKeyWeakValueSegment)object);
        object = object2.copyFor((ReferenceQueue)object, mapMakerInternalMap$StrongKeyWeakValueEntry);
        MapMakerInternalMap$StrongKeyWeakValueEntry.access$402(mapMakerInternalMap$StrongKeyWeakValueEntry, (MapMakerInternalMap$WeakValueReference)object);
        return mapMakerInternalMap$StrongKeyWeakValueEntry;
    }

    public MapMakerInternalMap$Strength keyStrength() {
        return MapMakerInternalMap$Strength.STRONG;
    }

    public MapMakerInternalMap$StrongKeyWeakValueEntry newEntry(MapMakerInternalMap$StrongKeyWeakValueSegment object, Object object2, int n3, MapMakerInternalMap$StrongKeyWeakValueEntry mapMakerInternalMap$StrongKeyWeakValueEntry) {
        if (mapMakerInternalMap$StrongKeyWeakValueEntry == null) {
            mapMakerInternalMap$StrongKeyWeakValueEntry = null;
            object = new MapMakerInternalMap$StrongKeyWeakValueEntry(object2, n3, null);
        } else {
            object = new MapMakerInternalMap$StrongKeyWeakValueEntry$LinkedStrongKeyWeakValueEntry(object2, n3, mapMakerInternalMap$StrongKeyWeakValueEntry);
        }
        return object;
    }

    public MapMakerInternalMap$StrongKeyWeakValueSegment newSegment(MapMakerInternalMap mapMakerInternalMap, int n3) {
        MapMakerInternalMap$StrongKeyWeakValueSegment mapMakerInternalMap$StrongKeyWeakValueSegment = new MapMakerInternalMap$StrongKeyWeakValueSegment(mapMakerInternalMap, n3);
        return mapMakerInternalMap$StrongKeyWeakValueSegment;
    }

    public void setValue(MapMakerInternalMap$StrongKeyWeakValueSegment object, MapMakerInternalMap$StrongKeyWeakValueEntry mapMakerInternalMap$StrongKeyWeakValueEntry, Object object2) {
        MapMakerInternalMap$WeakValueReference mapMakerInternalMap$WeakValueReference = MapMakerInternalMap$StrongKeyWeakValueEntry.access$400(mapMakerInternalMap$StrongKeyWeakValueEntry);
        object = MapMakerInternalMap$StrongKeyWeakValueSegment.access$500((MapMakerInternalMap$StrongKeyWeakValueSegment)object);
        MapMakerInternalMap$WeakValueReferenceImpl mapMakerInternalMap$WeakValueReferenceImpl = new MapMakerInternalMap$WeakValueReferenceImpl((ReferenceQueue)object, object2, mapMakerInternalMap$StrongKeyWeakValueEntry);
        MapMakerInternalMap$StrongKeyWeakValueEntry.access$402(mapMakerInternalMap$StrongKeyWeakValueEntry, mapMakerInternalMap$WeakValueReferenceImpl);
        mapMakerInternalMap$WeakValueReference.clear();
    }

    public MapMakerInternalMap$Strength valueStrength() {
        return MapMakerInternalMap$Strength.WEAK;
    }
}

