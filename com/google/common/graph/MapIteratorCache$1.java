/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.MapIteratorCache;
import com.google.common.graph.MapIteratorCache$1$1;
import java.util.AbstractSet;
import java.util.Iterator;

class MapIteratorCache$1
extends AbstractSet {
    final /* synthetic */ MapIteratorCache this$0;

    public MapIteratorCache$1(MapIteratorCache mapIteratorCache) {
        this.this$0 = mapIteratorCache;
    }

    public boolean contains(Object object) {
        return this.this$0.containsKey(object);
    }

    public UnmodifiableIterator iterator() {
        Iterator iterator = MapIteratorCache.access$000(this.this$0).entrySet().iterator();
        MapIteratorCache$1$1 mapIteratorCache$1$1 = new MapIteratorCache$1$1(this, iterator);
        return mapIteratorCache$1$1;
    }

    public int size() {
        return MapIteratorCache.access$000(this.this$0).size();
    }
}

