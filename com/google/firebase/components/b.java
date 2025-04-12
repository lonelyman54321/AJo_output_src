/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.LazySet;
import com.google.firebase.inject.Provider;

public final class b
implements Runnable {
    public final /* synthetic */ LazySet a;
    public final /* synthetic */ Provider b;

    public /* synthetic */ b(LazySet lazySet, Provider provider) {
        this.a = lazySet;
        this.b = provider;
    }

    public final void run() {
        LazySet lazySet = this.a;
        Provider provider = this.b;
        ComponentRuntime.d(lazySet, provider);
    }
}

