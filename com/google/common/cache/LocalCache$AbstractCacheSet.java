/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import java.util.AbstractSet;

abstract class LocalCache$AbstractCacheSet
extends AbstractSet {
    final /* synthetic */ LocalCache this$0;

    public LocalCache$AbstractCacheSet(LocalCache localCache) {
        this.this$0 = localCache;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    public int size() {
        return this.this$0.size();
    }

    public Object[] toArray() {
        return LocalCache.access$200(this).toArray();
    }

    public Object[] toArray(Object[] objectArray) {
        return LocalCache.access$200(this).toArray(objectArray);
    }
}

