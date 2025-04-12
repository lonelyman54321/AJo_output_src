/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.serialization;

import kotlin.jvm.internal.Intrinsics;

public class ContentConvertException
extends Exception {
    public ContentConvertException(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2, throwable);
    }
}

