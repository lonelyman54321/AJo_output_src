/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class i {
    public final String a;
    public final Serializable b;

    public i(String string2, Serializable serializable) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.a = string2;
        this.b = serializable;
    }
}

