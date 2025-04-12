/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.client.engine.okhttp;

import kotlin.jvm.internal.Intrinsics;

public final class UnsupportedFrameTypeException
extends IllegalArgumentException
implements d80_0 {
    public final Throwable a() {
        Intrinsics.checkNotNullParameter(null, "frame");
        StringBuilder stringBuilder = new StringBuilder("Unsupported frame type: ");
        stringBuilder.append((Object)null);
        String string2 = stringBuilder.toString();
        UnsupportedFrameTypeException unsupportedFrameTypeException = new IllegalArgumentException(string2);
        throw null;
    }
}

