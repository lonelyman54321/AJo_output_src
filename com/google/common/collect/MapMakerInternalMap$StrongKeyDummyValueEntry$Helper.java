/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMaker$Dummy;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$InternalEntryHelper;
import com.google.common.collect.MapMakerInternalMap$Strength;
import com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry;
import com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$LinkedStrongKeyDummyValueEntry;
import com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment;

final class MapMakerInternalMap$StrongKeyDummyValueEntry$Helper
implements MapMakerInternalMap$InternalEntryHelper {
    private static final MapMakerInternalMap$StrongKeyDummyValueEntry$Helper INSTANCE;

    static {
        MapMakerInternalMap$StrongKeyDummyValueEntry$Helper mapMakerInternalMap$StrongKeyDummyValueEntry$Helper;
        INSTANCE = mapMakerInternalMap$StrongKeyDummyValueEntry$Helper = new MapMakerInternalMap$StrongKeyDummyValueEntry$Helper();
    }

    public static MapMakerInternalMap$StrongKeyDummyValueEntry$Helper instance() {
        return INSTANCE;
    }

    public MapMakerInternalMap$StrongKeyDummyValueEntry copy(MapMakerInternalMap$StrongKeyDummyValueSegment mapMakerInternalMap$StrongKeyDummyValueSegment, MapMakerInternalMap$StrongKeyDummyValueEntry mapMakerInternalMap$StrongKeyDummyValueEntry, MapMakerInternalMap$StrongKeyDummyValueEntry mapMakerInternalMap$StrongKeyDummyValueEntry2) {
        Object object = mapMakerInternalMap$StrongKeyDummyValueEntry.key;
        int n3 = mapMakerInternalMap$StrongKeyDummyValueEntry.hash;
        return this.newEntry(mapMakerInternalMap$StrongKeyDummyValueSegment, object, n3, mapMakerInternalMap$StrongKeyDummyValueEntry2);
    }

    public MapMakerInternalMap$Strength keyStrength() {
        return MapMakerInternalMap$Strength.STRONG;
    }

    public MapMakerInternalMap$StrongKeyDummyValueEntry newEntry(MapMakerInternalMap$StrongKeyDummyValueSegment object, Object object2, int n3, MapMakerInternalMap$StrongKeyDummyValueEntry mapMakerInternalMap$StrongKeyDummyValueEntry) {
        if (mapMakerInternalMap$StrongKeyDummyValueEntry == null) {
            mapMakerInternalMap$StrongKeyDummyValueEntry = null;
            object = new MapMakerInternalMap$StrongKeyDummyValueEntry(object2, n3, null);
        } else {
            object = new MapMakerInternalMap$StrongKeyDummyValueEntry$LinkedStrongKeyDummyValueEntry(object2, n3, mapMakerInternalMap$StrongKeyDummyValueEntry);
        }
        return object;
    }

    public MapMakerInternalMap$StrongKeyDummyValueSegment newSegment(MapMakerInternalMap mapMakerInternalMap, int n3) {
        MapMakerInternalMap$StrongKeyDummyValueSegment mapMakerInternalMap$StrongKeyDummyValueSegment = new MapMakerInternalMap$StrongKeyDummyValueSegment(mapMakerInternalMap, n3);
        return mapMakerInternalMap$StrongKeyDummyValueSegment;
    }

    public void setValue(MapMakerInternalMap$StrongKeyDummyValueSegment mapMakerInternalMap$StrongKeyDummyValueSegment, MapMakerInternalMap$StrongKeyDummyValueEntry mapMakerInternalMap$StrongKeyDummyValueEntry, MapMaker$Dummy mapMaker$Dummy) {
    }

    public MapMakerInternalMap$Strength valueStrength() {
        return MapMakerInternalMap$Strength.STRONG;
    }
}

