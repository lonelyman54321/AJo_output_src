/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

public final class ConcurrentIOException
extends IllegalStateException {
    public ConcurrentIOException(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "taskName");
        StringBuilder stringBuilder = new StringBuilder("Concurrent ");
        stringBuilder.append(string2);
        stringBuilder.append(" attempts");
        string2 = stringBuilder.toString();
        super(string2, throwable);
    }
}

