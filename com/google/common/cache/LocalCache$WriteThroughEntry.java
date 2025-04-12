/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import java.util.Map;

final class LocalCache$WriteThroughEntry
implements Map.Entry {
    final Object key;
    final /* synthetic */ LocalCache this$0;
    Object value;

    public LocalCache$WriteThroughEntry(LocalCache localCache, Object object, Object object2) {
        this.this$0 = localCache;
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
        object2 = ((LocalCache)object2).put(object3, object);
        this.value = object;
        return object2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.getKey();
        stringBuilder.append(object);
        stringBuilder.append("=");
        object = this.getValue();
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

