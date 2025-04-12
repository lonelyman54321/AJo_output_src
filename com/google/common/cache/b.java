/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Function;
import com.google.common.cache.LocalCache$LoadingValueReference;

public final class b
implements Function {
    public final /* synthetic */ LocalCache$LoadingValueReference a;

    public /* synthetic */ b(LocalCache$LoadingValueReference localCache$LoadingValueReference) {
        this.a = localCache$LoadingValueReference;
    }

    public final Object apply(Object object) {
        return LocalCache$LoadingValueReference.a(this.a, object);
    }
}

