/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$AbstractCacheSet;
import com.google.common.cache.LocalCache$EntryIterator;
import java.util.Iterator;
import java.util.Map;

final class LocalCache$EntrySet
extends LocalCache$AbstractCacheSet {
    final /* synthetic */ LocalCache this$0;

    public LocalCache$EntrySet(LocalCache localCache) {
        this.this$0 = localCache;
        super(localCache);
    }

    public boolean contains(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Map.Entry;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        Object object2 = (object = (Map.Entry)object).getKey();
        if (object2 == null) {
            return false;
        }
        Object object3 = this.this$0;
        if ((object2 = ((LocalCache)object3).get(object2)) != null && (bl2 = ((Equivalence)(object3 = this.this$0.valueEquivalence)).equivalent(object = object.getValue(), object2))) {
            bl4 = true;
        }
        return bl4;
    }

    public Iterator iterator() {
        LocalCache localCache = this.this$0;
        LocalCache$EntryIterator localCache$EntryIterator = new LocalCache$EntryIterator(localCache);
        return localCache$EntryIterator;
    }

    public boolean remove(Object object) {
        LocalCache localCache;
        boolean bl2;
        boolean bl3 = object instanceof Map.Entry;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        Object k2 = (object = (Map.Entry)object).getKey();
        if (k2 != null && (bl2 = (localCache = this.this$0).remove(k2, object = object.getValue()))) {
            bl4 = true;
        }
        return bl4;
    }
}

