/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheLoader$1;
import java.util.concurrent.Callable;

public final class a
implements Callable {
    public final /* synthetic */ CacheLoader a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(CacheLoader cacheLoader, Object object, Object object2) {
        this.a = cacheLoader;
        this.b = object;
        this.c = object2;
    }

    public final Object call() {
        Object object = this.b;
        Object object2 = this.c;
        return CacheLoader$1.a(this.a, object, object2);
    }
}

