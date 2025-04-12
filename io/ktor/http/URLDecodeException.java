/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;

public final class URLDecodeException
extends Exception {
    public URLDecodeException(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2);
    }
}

