/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.OptionalProvider;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;

public final class d
implements Deferred$DeferredHandler {
    public final void handle(Provider provider) {
        OptionalProvider.c(provider);
    }
}

