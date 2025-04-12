/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import kotlin.jvm.internal.Intrinsics;

public final class AffiseSubscriptionError$ItemUnavailable
extends Exception {
    private final Object error;

    public AffiseSubscriptionError$ItemUnavailable(Object object) {
        Intrinsics.checkNotNullParameter(object, "error");
        CharSequence charSequence = new StringBuilder("item unavailable ");
        charSequence.append(object);
        charSequence = charSequence.toString();
        super((String)charSequence);
        this.error = object;
    }

    public final Object getError() {
        return this.error;
    }
}

