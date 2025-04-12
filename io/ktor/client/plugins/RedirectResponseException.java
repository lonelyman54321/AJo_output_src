/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.client.plugins;

import io.ktor.client.plugins.ResponseException;
import kotlin.jvm.internal.Intrinsics;

public final class RedirectResponseException
extends ResponseException {
    public final String b;

    public RedirectResponseException(jb1_2 object, String string2) {
        Intrinsics.checkNotNullParameter(object, "response");
        Intrinsics.checkNotNullParameter(string2, "cachedResponseText");
        super((jb1_2)object, string2);
        StringBuilder stringBuilder = new StringBuilder("Unhandled redirect: ");
        Object object2 = ((jb1_2)object).a().c().getMethod().a;
        stringBuilder.append((String)object2);
        stringBuilder.append(' ');
        object2 = ((jb1_2)object).a().c().getUrl();
        stringBuilder.append(object2);
        stringBuilder.append(". Status: ");
        object = ((jb1_2)object).e();
        stringBuilder.append(object);
        stringBuilder.append(". Text: \"");
        stringBuilder.append(string2);
        stringBuilder.append('\"');
        this.b = object = stringBuilder.toString();
    }

    public final String getMessage() {
        return this.b;
    }
}

