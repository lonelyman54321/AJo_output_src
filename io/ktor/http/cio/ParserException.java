/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.http.cio;

import kotlin.jvm.internal.Intrinsics;

public final class ParserException
extends IllegalStateException {
    public ParserException(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2);
    }
}

