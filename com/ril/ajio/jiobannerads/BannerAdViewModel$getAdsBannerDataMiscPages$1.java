/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.BannerAdViewModel$getAdsBannerDataMiscPages$1$1;
import com.ril.ajio.services.entity.BannerAdsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class BannerAdViewModel$getAdsBannerDataMiscPages$1
extends qg3_2
implements Function2 {
    final /* synthetic */ BannerAdsConfig $bannerConfig;
    final /* synthetic */ boolean $isThirdPartyBannersEnabled;
    final /* synthetic */ boolean $isUserLoggedIn;
    final /* synthetic */ xv$a_0 $screenName;
    final /* synthetic */ long $timeOutThirdPartyAds;
    final /* synthetic */ String $userType;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$getAdsBannerDataMiscPages$1(BannerAdsConfig bannerAdsConfig, boolean bl2, boolean bl3, long l2, BannerAdViewModel bannerAdViewModel, xv$a_0 xv$a_0, String string2, f80_0 f80_02) {
        this.$bannerConfig = bannerAdsConfig;
        this.$isUserLoggedIn = bl2;
        this.$isThirdPartyBannersEnabled = bl3;
        this.$timeOutThirdPartyAds = l2;
        this.this$0 = bannerAdViewModel;
        this.$screenName = xv$a_0;
        this.$userType = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        BannerAdsConfig bannerAdsConfig = this.$bannerConfig;
        boolean bl2 = this.$isUserLoggedIn;
        boolean bl3 = this.$isThirdPartyBannersEnabled;
        long l2 = this.$timeOutThirdPartyAds;
        BannerAdViewModel bannerAdViewModel = this.this$0;
        xv$a_0 xv$a_0 = this.$screenName;
        String string2 = this.$userType;
        object = new BannerAdViewModel$getAdsBannerDataMiscPages$1(bannerAdsConfig, bl2, bl3, l2, bannerAdViewModel, xv$a_0, string2, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$getAdsBannerDataMiscPages$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$getAdsBannerDataMiscPages$1)object).invokeSuspend(object2);
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
            BannerAdsConfig bannerAdsConfig = this.$bannerConfig;
            boolean bl2 = this.$isUserLoggedIn;
            boolean bl3 = this.$isThirdPartyBannersEnabled;
            long l2 = this.$timeOutThirdPartyAds;
            BannerAdViewModel bannerAdViewModel = this.this$0;
            xv$a_0 xv$a_0 = this.$screenName;
            String string2 = this.$userType;
            object = new BannerAdViewModel$getAdsBannerDataMiscPages$1$1(bannerAdsConfig, bl2, bl3, l2, bannerAdViewModel, xv$a_0, string2, null);
            this.label = n4;
            object = be_1.c((Function2)object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

