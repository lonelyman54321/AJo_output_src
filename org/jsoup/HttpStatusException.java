/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

import java.io.IOException;

public class HttpStatusException
extends IOException {
    private final int statusCode;
    private final String url;

    public HttpStatusException(String string2, int n3, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(". Status=");
        stringBuilder.append(n3);
        stringBuilder.append(", URL=[");
        stringBuilder.append(string3);
        stringBuilder.append("]");
        string2 = stringBuilder.toString();
        super(string2);
        this.statusCode = n3;
        this.url = string3;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getUrl() {
        return this.url;
    }
}

