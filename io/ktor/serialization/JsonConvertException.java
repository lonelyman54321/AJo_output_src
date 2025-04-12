/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.serialization;

import io.ktor.serialization.ContentConvertException;
import kotlin.jvm.internal.Intrinsics;

public final class JsonConvertException
extends ContentConvertException {
    public JsonConvertException(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2, throwable);
    }
}

