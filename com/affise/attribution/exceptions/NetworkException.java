/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.exceptions;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class NetworkException
extends IOException {
    private final int status;

    public NetworkException(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2);
        this.status = n3;
    }

    public final int getStatus() {
        return this.status;
    }
}

