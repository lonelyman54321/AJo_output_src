/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.OptionalProvider;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;

public final class f
implements Deferred$DeferredHandler {
    public final /* synthetic */ Deferred$DeferredHandler a;
    public final /* synthetic */ Deferred$DeferredHandler b;

    public /* synthetic */ f(Deferred$DeferredHandler deferred$DeferredHandler, Deferred$DeferredHandler deferred$DeferredHandler2) {
        this.a = deferred$DeferredHandler;
        this.b = deferred$DeferredHandler2;
    }

    public final void handle(Provider provider) {
        Deferred$DeferredHandler deferred$DeferredHandler = this.a;
        Deferred$DeferredHandler deferred$DeferredHandler2 = this.b;
        OptionalProvider.b(deferred$DeferredHandler, deferred$DeferredHandler2, provider);
    }
}

