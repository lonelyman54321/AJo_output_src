/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import com.ril.ajio.services.entity.BannerAdsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class BannerAdViewModel$getAdsBannerDataMiscPages$1$1$2
extends qg3_2
implements Function2 {
    final /* synthetic */ BannerAdsConfig $bannerConfig;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$getAdsBannerDataMiscPages$1$1$2(BannerAdViewModel bannerAdViewModel, BannerAdsConfig bannerAdsConfig, f80_0 f80_02) {
        this.this$0 = bannerAdViewModel;
        this.$bannerConfig = bannerAdsConfig;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        BannerAdViewModel bannerAdViewModel = this.this$0;
        BannerAdsConfig bannerAdsConfig = this.$bannerConfig;
        object = new BannerAdViewModel$getAdsBannerDataMiscPages$1$1$2(bannerAdViewModel, bannerAdsConfig, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$getAdsBannerDataMiscPages$1$1$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$getAdsBannerDataMiscPages$1$1$2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            BannerAdUseCase bannerAdUseCase = BannerAdViewModel.access$getBannerAdUseCase$p(this.this$0);
            String string2 = this.$bannerConfig.getPageUrl();
            this.label = n4;
            int n7 = 6;
            object = BannerAdUseCase.callThirdPartyBannerAdsApi$default(bannerAdUseCase, string2, null, false, this, n7, null);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

