/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzbq;
import com.google.android.gms.internal.auth.zzbs;

public final class zzbt
implements ProxyApi {
    public final PendingResult getSpatulaHeader(GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(googleApiClient);
        zzbs zzbs2 = new zzbs(this, googleApiClient);
        return googleApiClient.execute(zzbs2);
    }

    public final PendingResult performProxyRequest(GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        Preconditions.checkNotNull(googleApiClient);
        Preconditions.checkNotNull(proxyRequest);
        zzbq zzbq2 = new zzbq(this, googleApiClient, proxyRequest);
        return googleApiClient.execute(zzbq2);
    }
}

