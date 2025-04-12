/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network;

import com.affise.attribution.debug.network.DebugOnNetworkCallback;
import com.affise.attribution.network.HttpClient$Method;
import com.affise.attribution.network.HttpResponse;
import java.net.URL;
import java.util.Map;

public interface HttpClient {
    public HttpResponse executeRequest(URL var1, HttpClient$Method var2, String var3, Map var4, boolean var5);

    public DebugOnNetworkCallback getDebugRequest();

    public void setDebugRequest(DebugOnNetworkCallback var1);
}

