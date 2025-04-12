/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$HashIterator;
import java.util.Map;

final class LocalCache$EntryIterator
extends LocalCache$HashIterator {
    public LocalCache$EntryIterator(LocalCache localCache) {
        super(localCache);
    }

    public Map.Entry next() {
        return this.nextEntry();
    }
}

