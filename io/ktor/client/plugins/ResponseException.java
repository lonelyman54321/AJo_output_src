/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.client.plugins;

import kotlin.jvm.internal.Intrinsics;

public class ResponseException
extends IllegalStateException {
    public final transient jb1_2 a;

    public ResponseException(jb1_2 jb1_22, String string2) {
        Intrinsics.checkNotNullParameter(jb1_22, "response");
        Intrinsics.checkNotNullParameter(string2, "cachedResponseText");
        StringBuilder stringBuilder = new StringBuilder("Bad response: ");
        stringBuilder.append(jb1_22);
        stringBuilder.append(". Text: \"");
        stringBuilder.append(string2);
        stringBuilder.append('\"');
        string2 = stringBuilder.toString();
        super(string2);
        this.a = jb1_22;
    }
}

