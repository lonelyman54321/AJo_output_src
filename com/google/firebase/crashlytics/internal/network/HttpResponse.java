/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.network;

public class HttpResponse {
    private final String body;
    private final int code;

    public HttpResponse(int n3, String string2) {
        this.code = n3;
        this.body = string2;
    }

    public String body() {
        return this.body;
    }

    public int code() {
        return this.code;
    }
}

