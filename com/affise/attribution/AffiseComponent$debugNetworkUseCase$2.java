/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.debug.network.DebugNetworkUseCaseImpl;
import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.network.HttpClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$debugNetworkUseCase$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseInitProperties $initProperties;
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$debugNetworkUseCase$2(AffiseInitProperties affiseInitProperties, AffiseComponent affiseComponent) {
        this.$initProperties = affiseInitProperties;
        this.this$0 = affiseComponent;
        super(0);
    }

    public final DebugNetworkUseCaseImpl invoke() {
        AffiseInitProperties affiseInitProperties = this.$initProperties;
        HttpClient httpClient2 = AffiseComponent.access$getHttpClient(this.this$0);
        DebugNetworkUseCaseImpl debugNetworkUseCaseImpl = new DebugNetworkUseCaseImpl(affiseInitProperties, httpClient2);
        return debugNetworkUseCaseImpl;
    }
}

