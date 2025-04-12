/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$HashIterator;

final class MapMakerInternalMap$ValueIterator
extends MapMakerInternalMap$HashIterator {
    public MapMakerInternalMap$ValueIterator(MapMakerInternalMap mapMakerInternalMap) {
        super(mapMakerInternalMap);
    }

    public Object next() {
        return this.nextEntry().getValue();
    }
}

