/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network;

public final class HttpClient$Method
extends Enum {
    private static final /* synthetic */ HttpClient$Method[] $VALUES;
    public static final /* enum */ HttpClient$Method GET;
    public static final /* enum */ HttpClient$Method POST;

    private static final /* synthetic */ HttpClient$Method[] $values() {
        HttpClient$Method httpClient$Method = GET;
        httpClient$Method = POST;
        HttpClient$Method[] httpClient$MethodArray = new HttpClient$Method[]{httpClient$Method, httpClient$Method};
        return httpClient$MethodArray;
    }

    static {
        HttpClient$Method httpClient$Method;
        GET = httpClient$Method = new HttpClient$Method("GET", 0);
        POST = httpClient$Method = new HttpClient$Method("POST", 1);
        $VALUES = HttpClient$Method.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HttpClient$Method() {
        void var2_-1;
        void var1_-1;
    }

    public static HttpClient$Method valueOf(String string2) {
        return Enum.valueOf(HttpClient$Method.class, string2);
    }

    public static HttpClient$Method[] values() {
        return (HttpClient$Method[])$VALUES.clone();
    }
}

