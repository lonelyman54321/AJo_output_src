/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$AbstractCacheSet;
import com.google.common.cache.LocalCache$KeyIterator;
import java.util.Iterator;

final class LocalCache$KeySet
extends LocalCache$AbstractCacheSet {
    final /* synthetic */ LocalCache this$0;

    public LocalCache$KeySet(LocalCache localCache) {
        this.this$0 = localCache;
        super(localCache);
    }

    public boolean contains(Object object) {
        return this.this$0.containsKey(object);
    }

    public Iterator iterator() {
        LocalCache localCache = this.this$0;
        LocalCache$KeyIterator localCache$KeyIterator = new LocalCache$KeyIterator(localCache);
        return localCache$KeyIterator;
    }

    public boolean remove(Object object) {
        boolean bl2;
        LocalCache localCache = this.this$0;
        if ((object = localCache.remove(object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

