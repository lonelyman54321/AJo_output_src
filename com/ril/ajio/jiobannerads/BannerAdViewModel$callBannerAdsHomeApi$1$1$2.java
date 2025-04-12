/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class BannerAdViewModel$callBannerAdsHomeApi$1$1$2
extends qg3_2
implements Function2 {
    final /* synthetic */ String $pageUrl;
    final /* synthetic */ String $storeId;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$callBannerAdsHomeApi$1$1$2(BannerAdViewModel bannerAdViewModel, String string2, String string3, f80_0 f80_02) {
        this.this$0 = bannerAdViewModel;
        this.$pageUrl = string2;
        this.$storeId = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        BannerAdViewModel bannerAdViewModel = this.this$0;
        String string2 = this.$pageUrl;
        String string3 = this.$storeId;
        object = new BannerAdViewModel$callBannerAdsHomeApi$1$1$2(bannerAdViewModel, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$callBannerAdsHomeApi$1$1$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$callBannerAdsHomeApi$1$1$2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = this.label;
        boolean bl3 = true;
        if (!bl2) {
            vl2_2.b(object);
            object = BannerAdViewModel.access$getBannerAdUseCase$p(this.this$0);
            String string2 = this.$pageUrl;
            String string3 = this.$storeId;
            this.label = bl3;
            object = ((BannerAdUseCase)object).callThirdPartyBannerAdsApi(string2, string3, bl3, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (bl2 == bl3) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

