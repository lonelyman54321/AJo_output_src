/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.utils.io.charsets;

import kotlin.jvm.internal.Intrinsics;

public class MalformedInputException
extends java.nio.charset.MalformedInputException {
    public final String a;

    public MalformedInputException(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(0);
        this.a = string2;
    }

    public final String getMessage() {
        return this.a;
    }
}

