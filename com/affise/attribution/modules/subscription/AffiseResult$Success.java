/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.AffiseResult;

public final class AffiseResult$Success
extends AffiseResult {
    private final Object value;

    public AffiseResult$Success(Object object) {
        super(null);
        this.value = object;
    }

    public final Object getValue() {
        return this.value;
    }
}

