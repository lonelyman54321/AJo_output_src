/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapEntry;
import com.google.common.collect.MapMakerInternalMap;
import java.util.Map;

final class MapMakerInternalMap$WriteThroughEntry
extends AbstractMapEntry {
    final Object key;
    final /* synthetic */ MapMakerInternalMap this$0;
    Object value;

    public MapMakerInternalMap$WriteThroughEntry(MapMakerInternalMap mapMakerInternalMap, Object object, Object object2) {
        this.this$0 = mapMakerInternalMap;
        this.key = object;
        this.value = object2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        Object k2;
        Object object2;
        boolean bl3 = object instanceof Map.Entry;
        boolean bl4 = false;
        if (bl3 && (bl3 = (object2 = this.key).equals(k2 = (object = (Map.Entry)object).getKey())) && (bl2 = (object2 = this.value).equals(object = object.getValue()))) {
            bl4 = true;
        }
        return bl4;
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = this.key.hashCode();
        int n4 = this.value.hashCode();
        return n3 ^ n4;
    }

    public Object setValue(Object object) {
        Object object2 = this.this$0;
        Object object3 = this.key;
        object2 = ((MapMakerInternalMap)object2).put(object3, object);
        this.value = object;
        return object2;
    }
}

