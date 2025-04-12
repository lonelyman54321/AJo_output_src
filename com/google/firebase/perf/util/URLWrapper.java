/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

import java.net.URL;
import java.net.URLConnection;

public class URLWrapper {
    private final URL url;

    public URLWrapper(URL uRL) {
        this.url = uRL;
    }

    public URLConnection openConnection() {
        return this.url.openConnection();
    }

    public String toString() {
        return this.url.toString();
    }
}

