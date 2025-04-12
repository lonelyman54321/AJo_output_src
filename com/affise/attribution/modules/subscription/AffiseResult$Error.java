/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.AffiseResult;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseResult$Error
extends AffiseResult {
    private final Exception error;

    public AffiseResult$Error(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "error");
        super(null);
        this.error = exception;
    }

    public final Exception getError() {
        return this.error;
    }
}

