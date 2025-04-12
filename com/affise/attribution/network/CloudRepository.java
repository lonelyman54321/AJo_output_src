/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network;

import com.affise.attribution.network.HttpResponse;
import java.util.List;

public interface CloudRepository {
    public HttpResponse createRequest(String var1, List var2);

    public void send(List var1, String var2);
}

