/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

import java.io.IOException;

public class UnsupportedMimeTypeException
extends IOException {
    private final String mimeType;
    private final String url;

    public UnsupportedMimeTypeException(String string2, String string3, String string4) {
        super(string2);
        this.mimeType = string3;
        this.url = string4;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = super.toString();
        stringBuilder.append(string2);
        stringBuilder.append(". Mimetype=");
        string2 = this.mimeType;
        stringBuilder.append(string2);
        stringBuilder.append(", URL=");
        string2 = this.url;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

