/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$AbstractStrongKeyEntry;
import com.google.common.collect.MapMakerInternalMap$InternalEntryHelper;
import com.google.common.collect.MapMakerInternalMap$Strength;
import com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry;
import com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$LinkedStrongKeyStrongValueEntry;
import com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment;

final class MapMakerInternalMap$StrongKeyStrongValueEntry$Helper
implements MapMakerInternalMap$InternalEntryHelper {
    private static final MapMakerInternalMap$StrongKeyStrongValueEntry$Helper INSTANCE;

    static {
        MapMakerInternalMap$StrongKeyStrongValueEntry$Helper mapMakerInternalMap$StrongKeyStrongValueEntry$Helper;
        INSTANCE = mapMakerInternalMap$StrongKeyStrongValueEntry$Helper = new MapMakerInternalMap$StrongKeyStrongValueEntry$Helper();
    }

    public static MapMakerInternalMap$StrongKeyStrongValueEntry$Helper instance() {
        return INSTANCE;
    }

    public MapMakerInternalMap$StrongKeyStrongValueEntry copy(MapMakerInternalMap$StrongKeyStrongValueSegment object, MapMakerInternalMap$StrongKeyStrongValueEntry object2, MapMakerInternalMap$StrongKeyStrongValueEntry mapMakerInternalMap$StrongKeyStrongValueEntry) {
        Object object3 = ((MapMakerInternalMap$AbstractStrongKeyEntry)object2).key;
        int n3 = ((MapMakerInternalMap$AbstractStrongKeyEntry)object2).hash;
        object = this.newEntry((MapMakerInternalMap$StrongKeyStrongValueSegment)object, object3, n3, mapMakerInternalMap$StrongKeyStrongValueEntry);
        object2 = MapMakerInternalMap$StrongKeyStrongValueEntry.access$200((MapMakerInternalMap$StrongKeyStrongValueEntry)object2);
        MapMakerInternalMap$StrongKeyStrongValueEntry.access$202((MapMakerInternalMap$StrongKeyStrongValueEntry)object, object2);
        return object;
    }

    public MapMakerInternalMap$Strength keyStrength() {
        return MapMakerInternalMap$Strength.STRONG;
    }

    public MapMakerInternalMap$StrongKeyStrongValueEntry newEntry(MapMakerInternalMap$StrongKeyStrongValueSegment object, Object object2, int n3, MapMakerInternalMap$StrongKeyStrongValueEntry mapMakerInternalMap$StrongKeyStrongValueEntry) {
        if (mapMakerInternalMap$StrongKeyStrongValueEntry == null) {
            mapMakerInternalMap$StrongKeyStrongValueEntry = null;
            object = new MapMakerInternalMap$StrongKeyStrongValueEntry(object2, n3, null);
        } else {
            object = new MapMakerInternalMap$StrongKeyStrongValueEntry$LinkedStrongKeyStrongValueEntry(object2, n3, mapMakerInternalMap$StrongKeyStrongValueEntry);
        }
        return object;
    }

    public MapMakerInternalMap$StrongKeyStrongValueSegment newSegment(MapMakerInternalMap mapMakerInternalMap, int n3) {
        MapMakerInternalMap$StrongKeyStrongValueSegment mapMakerInternalMap$StrongKeyStrongValueSegment = new MapMakerInternalMap$StrongKeyStrongValueSegment(mapMakerInternalMap, n3);
        return mapMakerInternalMap$StrongKeyStrongValueSegment;
    }

    public void setValue(MapMakerInternalMap$StrongKeyStrongValueSegment mapMakerInternalMap$StrongKeyStrongValueSegment, MapMakerInternalMap$StrongKeyStrongValueEntry mapMakerInternalMap$StrongKeyStrongValueEntry, Object object) {
        MapMakerInternalMap$StrongKeyStrongValueEntry.access$202(mapMakerInternalMap$StrongKeyStrongValueEntry, object);
    }

    public MapMakerInternalMap$Strength valueStrength() {
        return MapMakerInternalMap$Strength.STRONG;
    }
}

