/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$ValueIterator;
import java.util.AbstractCollection;
import java.util.Iterator;

final class MapMakerInternalMap$Values
extends AbstractCollection {
    final /* synthetic */ MapMakerInternalMap this$0;

    public MapMakerInternalMap$Values(MapMakerInternalMap mapMakerInternalMap) {
        this.this$0 = mapMakerInternalMap;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object object) {
        return this.this$0.containsValue(object);
    }

    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    public Iterator iterator() {
        MapMakerInternalMap mapMakerInternalMap = this.this$0;
        MapMakerInternalMap$ValueIterator mapMakerInternalMap$ValueIterator = new MapMakerInternalMap$ValueIterator(mapMakerInternalMap);
        return mapMakerInternalMap$ValueIterator;
    }

    public int size() {
        return this.this$0.size();
    }

    public Object[] toArray() {
        return MapMakerInternalMap.access$1800(this).toArray();
    }

    public Object[] toArray(Object[] objectArray) {
        return MapMakerInternalMap.access$1800(this).toArray(objectArray);
    }
}

