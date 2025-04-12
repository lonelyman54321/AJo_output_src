/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$Segment;
import com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry;

final class MapMakerInternalMap$StrongKeyStrongValueSegment
extends MapMakerInternalMap$Segment {
    public MapMakerInternalMap$StrongKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int n3) {
        super(mapMakerInternalMap, n3);
    }

    public MapMakerInternalMap$StrongKeyStrongValueEntry castForTesting(MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry) {
        return (MapMakerInternalMap$StrongKeyStrongValueEntry)mapMakerInternalMap$InternalEntry;
    }

    public MapMakerInternalMap$StrongKeyStrongValueSegment self() {
        return this;
    }
}

