/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.exceptions;

import kotlin.jvm.internal.Intrinsics;

public final class UncaughtAffiseException
extends IllegalStateException {
    public UncaughtAffiseException(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(throwable, "cause");
        super(string2, throwable);
    }
}

