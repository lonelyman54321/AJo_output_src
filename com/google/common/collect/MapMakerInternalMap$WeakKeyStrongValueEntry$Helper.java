/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$AbstractWeakKeyEntry;
import com.google.common.collect.MapMakerInternalMap$InternalEntryHelper;
import com.google.common.collect.MapMakerInternalMap$Strength;
import com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry;
import com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$LinkedWeakKeyStrongValueEntry;
import com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment;
import java.lang.ref.ReferenceQueue;

final class MapMakerInternalMap$WeakKeyStrongValueEntry$Helper
implements MapMakerInternalMap$InternalEntryHelper {
    private static final MapMakerInternalMap$WeakKeyStrongValueEntry$Helper INSTANCE;

    static {
        MapMakerInternalMap$WeakKeyStrongValueEntry$Helper mapMakerInternalMap$WeakKeyStrongValueEntry$Helper;
        INSTANCE = mapMakerInternalMap$WeakKeyStrongValueEntry$Helper = new MapMakerInternalMap$WeakKeyStrongValueEntry$Helper();
    }

    public static MapMakerInternalMap$WeakKeyStrongValueEntry$Helper instance() {
        return INSTANCE;
    }

    public MapMakerInternalMap$WeakKeyStrongValueEntry copy(MapMakerInternalMap$WeakKeyStrongValueSegment object, MapMakerInternalMap$WeakKeyStrongValueEntry object2, MapMakerInternalMap$WeakKeyStrongValueEntry mapMakerInternalMap$WeakKeyStrongValueEntry) {
        Object object3 = ((MapMakerInternalMap$AbstractWeakKeyEntry)object2).getKey();
        if (object3 == null) {
            return null;
        }
        int n3 = ((MapMakerInternalMap$AbstractWeakKeyEntry)object2).hash;
        object = this.newEntry((MapMakerInternalMap$WeakKeyStrongValueSegment)object, object3, n3, mapMakerInternalMap$WeakKeyStrongValueEntry);
        object2 = MapMakerInternalMap$WeakKeyStrongValueEntry.access$1100((MapMakerInternalMap$WeakKeyStrongValueEntry)object2);
        MapMakerInternalMap$WeakKeyStrongValueEntry.access$1102((MapMakerInternalMap$WeakKeyStrongValueEntry)object, object2);
        return object;
    }

    public MapMakerInternalMap$Strength keyStrength() {
        return MapMakerInternalMap$Strength.WEAK;
    }

    public MapMakerInternalMap$WeakKeyStrongValueEntry newEntry(MapMakerInternalMap$WeakKeyStrongValueSegment object, Object object2, int n3, MapMakerInternalMap$WeakKeyStrongValueEntry mapMakerInternalMap$WeakKeyStrongValueEntry) {
        if (mapMakerInternalMap$WeakKeyStrongValueEntry == null) {
            object = MapMakerInternalMap$WeakKeyStrongValueSegment.access$1200((MapMakerInternalMap$WeakKeyStrongValueSegment)object);
            Object var5_5 = null;
            mapMakerInternalMap$WeakKeyStrongValueEntry = new MapMakerInternalMap$WeakKeyStrongValueEntry((ReferenceQueue)object, object2, n3, null);
        } else {
            ReferenceQueue referenceQueue = MapMakerInternalMap$WeakKeyStrongValueSegment.access$1200((MapMakerInternalMap$WeakKeyStrongValueSegment)object);
            MapMakerInternalMap$WeakKeyStrongValueEntry$LinkedWeakKeyStrongValueEntry mapMakerInternalMap$WeakKeyStrongValueEntry$LinkedWeakKeyStrongValueEntry = new MapMakerInternalMap$WeakKeyStrongValueEntry$LinkedWeakKeyStrongValueEntry(referenceQueue, object2, n3, mapMakerInternalMap$WeakKeyStrongValueEntry, null);
            mapMakerInternalMap$WeakKeyStrongValueEntry = mapMakerInternalMap$WeakKeyStrongValueEntry$LinkedWeakKeyStrongValueEntry;
        }
        return mapMakerInternalMap$WeakKeyStrongValueEntry;
    }

    public MapMakerInternalMap$WeakKeyStrongValueSegment newSegment(MapMakerInternalMap mapMakerInternalMap, int n3) {
        MapMakerInternalMap$WeakKeyStrongValueSegment mapMakerInternalMap$WeakKeyStrongValueSegment = new MapMakerInternalMap$WeakKeyStrongValueSegment(mapMakerInternalMap, n3);
        return mapMakerInternalMap$WeakKeyStrongValueSegment;
    }

    public void setValue(MapMakerInternalMap$WeakKeyStrongValueSegment mapMakerInternalMap$WeakKeyStrongValueSegment, MapMakerInternalMap$WeakKeyStrongValueEntry mapMakerInternalMap$WeakKeyStrongValueEntry, Object object) {
        MapMakerInternalMap$WeakKeyStrongValueEntry.access$1102(mapMakerInternalMap$WeakKeyStrongValueEntry, object);
    }

    public MapMakerInternalMap$Strength valueStrength() {
        return MapMakerInternalMap$Strength.STRONG;
    }
}

