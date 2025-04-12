/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads.domain;

import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;

final class BannerAdUseCase$callThirdPartyBannerAdsApi$1
extends h80_0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BannerAdUseCase this$0;

    public BannerAdUseCase$callThirdPartyBannerAdsApi$1(BannerAdUseCase bannerAdUseCase, f80_0 f80_02) {
        this.this$0 = bannerAdUseCase;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return this.this$0.callThirdPartyBannerAdsApi(null, null, false, this);
    }
}

