/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.debug.network;

import com.affise.attribution.network.HttpRequest;
import com.affise.attribution.network.HttpResponse;

public interface DebugOnNetworkCallback {
    public void handle(HttpRequest var1, HttpResponse var2);
}

