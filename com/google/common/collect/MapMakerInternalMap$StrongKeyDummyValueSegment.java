/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$Segment;
import com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry;

final class MapMakerInternalMap$StrongKeyDummyValueSegment
extends MapMakerInternalMap$Segment {
    public MapMakerInternalMap$StrongKeyDummyValueSegment(MapMakerInternalMap mapMakerInternalMap, int n3) {
        super(mapMakerInternalMap, n3);
    }

    public MapMakerInternalMap$StrongKeyDummyValueEntry castForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        return (MapMakerInternalMap$StrongKeyDummyValueEntry)mapMakerInternalMap$InternalEntry;
    }

    public MapMakerInternalMap$StrongKeyDummyValueSegment self() {
        return this;
    }
}

