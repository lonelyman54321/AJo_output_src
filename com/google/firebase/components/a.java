/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.OptionalProvider;
import com.google.firebase.inject.Provider;

public final class a
implements Runnable {
    public final /* synthetic */ OptionalProvider a;
    public final /* synthetic */ Provider b;

    public /* synthetic */ a(OptionalProvider optionalProvider, Provider provider) {
        this.a = optionalProvider;
        this.b = provider;
    }

    public final void run() {
        OptionalProvider optionalProvider = this.a;
        Provider provider = this.b;
        ComponentRuntime.b(optionalProvider, provider);
    }
}

