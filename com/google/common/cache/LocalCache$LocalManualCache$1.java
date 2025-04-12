/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.CacheLoader;
import com.google.common.cache.LocalCache$LocalManualCache;
import java.util.concurrent.Callable;

class LocalCache$LocalManualCache$1
extends CacheLoader {
    final /* synthetic */ Callable val$valueLoader;

    public LocalCache$LocalManualCache$1(LocalCache$LocalManualCache localCache$LocalManualCache, Callable callable) {
        this.val$valueLoader = callable;
    }

    public Object load(Object object) {
        return this.val$valueLoader.call();
    }
}

