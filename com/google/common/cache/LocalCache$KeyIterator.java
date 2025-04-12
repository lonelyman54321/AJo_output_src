/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$HashIterator;

final class LocalCache$KeyIterator
extends LocalCache$HashIterator {
    public LocalCache$KeyIterator(LocalCache localCache) {
        super(localCache);
    }

    public Object next() {
        return this.nextEntry().getKey();
    }
}

