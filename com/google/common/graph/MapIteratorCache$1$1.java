/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.MapIteratorCache;
import com.google.common.graph.MapIteratorCache$1;
import java.util.Iterator;
import java.util.Map;

class MapIteratorCache$1$1
extends UnmodifiableIterator {
    final /* synthetic */ MapIteratorCache$1 this$1;
    final /* synthetic */ Iterator val$entryIterator;

    public MapIteratorCache$1$1(MapIteratorCache$1 mapIteratorCache$1, Iterator iterator) {
        this.this$1 = mapIteratorCache$1;
        this.val$entryIterator = iterator;
    }

    public boolean hasNext() {
        return this.val$entryIterator.hasNext();
    }

    public Object next() {
        Map.Entry entry = (Map.Entry)this.val$entryIterator.next();
        MapIteratorCache.access$102(this.this$1.this$0, entry);
        return entry.getKey();
    }
}

