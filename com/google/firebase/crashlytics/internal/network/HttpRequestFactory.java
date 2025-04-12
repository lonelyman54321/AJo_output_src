/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.network;

import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import java.util.Collections;
import java.util.Map;

public class HttpRequestFactory {
    public HttpGetRequest buildHttpGetRequest(String string2) {
        Map map2 = Collections.emptyMap();
        return this.buildHttpGetRequest(string2, map2);
    }

    public HttpGetRequest buildHttpGetRequest(String string2, Map map2) {
        HttpGetRequest httpGetRequest = new HttpGetRequest(string2, map2);
        return httpGetRequest;
    }
}

