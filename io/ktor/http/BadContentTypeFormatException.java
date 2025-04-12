/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;

public final class BadContentTypeFormatException
extends Exception {
    public BadContentTypeFormatException(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        StringBuilder stringBuilder = new StringBuilder("Bad Content-Type format: ");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        super(string2);
    }
}

