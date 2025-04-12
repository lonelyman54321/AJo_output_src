/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$HashIterator;

final class MapMakerInternalMap$KeyIterator
extends MapMakerInternalMap$HashIterator {
    public MapMakerInternalMap$KeyIterator(MapMakerInternalMap mapMakerInternalMap) {
        super(mapMakerInternalMap);
    }

    public Object next() {
        return this.nextEntry().getKey();
    }
}

