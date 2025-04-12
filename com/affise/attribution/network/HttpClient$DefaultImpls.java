/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network;

import com.affise.attribution.network.HttpClient;
import com.affise.attribution.network.HttpClient$Method;
import com.affise.attribution.network.HttpResponse;
import java.net.URL;
import java.util.Map;

public final class HttpClient$DefaultImpls {
    public static /* synthetic */ HttpResponse executeRequest$default(HttpClient object, URL uRL, HttpClient.Method method, String string2, Map map2, boolean bl2, int n3, Object object2) {
        if (object2 == null) {
            boolean bl3;
            if ((n3 &= 0x10) != 0) {
                bl2 = true;
                bl3 = true;
            } else {
                bl3 = bl2;
            }
            return object.executeRequest(uRL, method, string2, map2, bl3);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeRequest");
        throw object;
    }
}

