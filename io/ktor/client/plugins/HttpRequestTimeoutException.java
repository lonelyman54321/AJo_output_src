/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.client.plugins;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class HttpRequestTimeoutException
extends IOException
implements d80_0 {
    public final String a;
    public final Long b;

    public HttpRequestTimeoutException(String string2, Long l2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "url");
        CharSequence charSequence = new StringBuilder("Request timeout has expired [url=");
        charSequence.append(string2);
        Object object = ", request_timeout=";
        charSequence.append((String)object);
        object = l2 == null ? "unknown" : l2;
        charSequence = fK.a(charSequence, object, " ms]");
        super((String)charSequence, throwable);
        this.a = string2;
        this.b = l2;
    }

    public final Throwable a() {
        Throwable throwable = this.getCause();
        String string2 = this.a;
        Long l2 = this.b;
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(string2, l2, throwable);
        return httpRequestTimeoutException;
    }
}

