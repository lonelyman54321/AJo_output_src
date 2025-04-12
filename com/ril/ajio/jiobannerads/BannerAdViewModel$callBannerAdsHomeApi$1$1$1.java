/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class BannerAdViewModel$callBannerAdsHomeApi$1$1$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $asi;
    final /* synthetic */ String $loggedIn;
    final /* synthetic */ String $pageUrl;
    final /* synthetic */ String $storeId;
    final /* synthetic */ String $userType;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$callBannerAdsHomeApi$1$1$1(BannerAdViewModel bannerAdViewModel, String string2, String string3, String string4, String string5, String string6, f80_0 f80_02) {
        this.this$0 = bannerAdViewModel;
        this.$asi = string2;
        this.$pageUrl = string3;
        this.$storeId = string4;
        this.$loggedIn = string5;
        this.$userType = string6;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        BannerAdViewModel bannerAdViewModel = this.this$0;
        String string2 = this.$asi;
        String string3 = this.$pageUrl;
        String string4 = this.$storeId;
        String string5 = this.$loggedIn;
        String string6 = this.$userType;
        object = new BannerAdViewModel$callBannerAdsHomeApi$1$1$1(bannerAdViewModel, string2, string3, string4, string5, string6, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$callBannerAdsHomeApi$1$1$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$callBannerAdsHomeApi$1$1$1)object).invokeSuspend(object2);
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
            String string2 = this.$asi;
            String string3 = this.$pageUrl;
            String string4 = this.$storeId;
            String string5 = this.$loggedIn;
            String string6 = this.$userType;
            this.label = n4;
            String string7 = "jioBannerAdsHome";
            object = bannerAdUseCase.callJioBannerAdsApi(string2, string3, string4, string5, string6, string7, this);
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

