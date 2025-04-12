/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface ProxyApi {
    public PendingResult getSpatulaHeader(GoogleApiClient var1);

    public PendingResult performProxyRequest(GoogleApiClient var1, ProxyRequest var2);
}

