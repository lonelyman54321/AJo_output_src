/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$ValueIterator;
import java.util.AbstractCollection;
import java.util.Iterator;

final class LocalCache$Values
extends AbstractCollection {
    final /* synthetic */ LocalCache this$0;

    public LocalCache$Values(LocalCache localCache) {
        this.this$0 = localCache;
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
        LocalCache localCache = this.this$0;
        LocalCache$ValueIterator localCache$ValueIterator = new LocalCache$ValueIterator(localCache);
        return localCache$ValueIterator;
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

