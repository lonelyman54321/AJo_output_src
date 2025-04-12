/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.client.call;

import kotlin.jvm.internal.Intrinsics;

public final class DoubleReceiveException
extends IllegalStateException {
    public final String a;

    public DoubleReceiveException(ea1_2 object) {
        Intrinsics.checkNotNullParameter(object, "call");
        StringBuilder stringBuilder = new StringBuilder("Response already received: ");
        stringBuilder.append(object);
        this.a = object = stringBuilder.toString();
    }

    public final String getMessage() {
        return this.a;
    }
}

