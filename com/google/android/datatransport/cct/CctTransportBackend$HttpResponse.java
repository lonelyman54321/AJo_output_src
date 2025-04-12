/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct;

import java.net.URL;

final class CctTransportBackend$HttpResponse {
    final int code;
    final long nextRequestMillis;
    final URL redirectUrl;

    public CctTransportBackend$HttpResponse(int n3, URL uRL, long l2) {
        this.code = n3;
        this.redirectUrl = uRL;
        this.nextRequestMillis = l2;
    }
}

