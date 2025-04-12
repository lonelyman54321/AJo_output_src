/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$HashIterator;
import java.util.Map;

final class MapMakerInternalMap$EntryIterator
extends MapMakerInternalMap$HashIterator {
    public MapMakerInternalMap$EntryIterator(MapMakerInternalMap mapMakerInternalMap) {
        super(mapMakerInternalMap);
    }

    public Map.Entry next() {
        return this.nextEntry();
    }
}

