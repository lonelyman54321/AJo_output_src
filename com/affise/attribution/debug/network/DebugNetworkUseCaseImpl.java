/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.debug.network;

import com.affise.attribution.debug.network.DebugNetworkUseCase;
import com.affise.attribution.debug.network.DebugOnNetworkCallback;
import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.network.HttpClient;
import kotlin.jvm.internal.Intrinsics;

public final class DebugNetworkUseCaseImpl
implements DebugNetworkUseCase {
    private final HttpClient httpClient;
    private final AffiseInitProperties initProperties;

    public DebugNetworkUseCaseImpl(AffiseInitProperties affiseInitProperties, HttpClient httpClient2) {
        Intrinsics.checkNotNullParameter(affiseInitProperties, "initProperties");
        Intrinsics.checkNotNullParameter(httpClient2, "httpClient");
        this.initProperties = affiseInitProperties;
        this.httpClient = httpClient2;
    }

    public void onRequest(DebugOnNetworkCallback debugOnNetworkCallback) {
        Intrinsics.checkNotNullParameter(debugOnNetworkCallback, "onComplete");
        AffiseInitProperties affiseInitProperties = this.initProperties;
        boolean bl2 = affiseInitProperties.isProduction();
        if (bl2) {
            return;
        }
        this.httpClient.setDebugRequest(debugOnNetworkCallback);
    }
}

