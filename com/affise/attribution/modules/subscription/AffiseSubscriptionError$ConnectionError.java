/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import kotlin.jvm.internal.Intrinsics;

public final class AffiseSubscriptionError$ConnectionError
extends Exception {
    private final Object error;

    public AffiseSubscriptionError$ConnectionError(Object object) {
        Intrinsics.checkNotNullParameter(object, "error");
        CharSequence charSequence = new StringBuilder("connection error ");
        charSequence.append(object);
        charSequence = charSequence.toString();
        super((String)charSequence);
        this.error = object;
    }

    public final Object getError() {
        return this.error;
    }
}

