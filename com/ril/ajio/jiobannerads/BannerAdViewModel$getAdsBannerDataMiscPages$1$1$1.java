/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import com.ril.ajio.services.entity.BannerAdsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class BannerAdViewModel$getAdsBannerDataMiscPages$1$1$1
extends qg3_2
implements Function2 {
    final /* synthetic */ BannerAdsConfig $bannerConfig;
    final /* synthetic */ String $isUserLoggedString;
    final /* synthetic */ String $userType;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$getAdsBannerDataMiscPages$1$1$1(BannerAdViewModel bannerAdViewModel, BannerAdsConfig bannerAdsConfig, String string2, String string3, f80_0 f80_02) {
        this.this$0 = bannerAdViewModel;
        this.$bannerConfig = bannerAdsConfig;
        this.$isUserLoggedString = string2;
        this.$userType = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        BannerAdViewModel bannerAdViewModel = this.this$0;
        BannerAdsConfig bannerAdsConfig = this.$bannerConfig;
        String string2 = this.$isUserLoggedString;
        String string3 = this.$userType;
        object = new BannerAdViewModel$getAdsBannerDataMiscPages$1$1$1(bannerAdViewModel, bannerAdsConfig, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$getAdsBannerDataMiscPages$1$1$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$getAdsBannerDataMiscPages$1$1$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return object;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        BannerAdUseCase bannerAdUseCase = BannerAdViewModel.access$getBannerAdUseCase$p(this.this$0);
        object = this.$bannerConfig.getJioAdsAsi();
        String string2 = "";
        Object object2 = object == null ? string2 : object;
        object = this.$bannerConfig.getJioAdsPageUrl();
        Object object3 = object == null ? string2 : object;
        String string3 = od3_2.a();
        String string4 = this.$isUserLoggedString;
        String string5 = this.$userType;
        this.label = n4;
        String string6 = "jioBannerAdsMisc";
        object = bannerAdUseCase.callJioBannerAdsApi((String)object2, (String)object3, string3, string4, string5, string6, this);
        if (object != j90_02) return object;
        return j90_02;
    }
}

