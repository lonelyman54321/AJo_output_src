/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class BannerAdViewModel$callBannerClickImpression$1$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$callBannerClickImpression$1$1(BannerAdViewModel bannerAdViewModel, String string2, f80_0 f80_02) {
        this.this$0 = bannerAdViewModel;
        this.$url = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        BannerAdViewModel bannerAdViewModel = this.this$0;
        String string2 = this.$url;
        object = new BannerAdViewModel$callBannerClickImpression$1$1(bannerAdViewModel, string2, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$callBannerClickImpression$1$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$callBannerClickImpression$1$1)object).invokeSuspend(object2);
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
            object = BannerAdViewModel.access$getBannerAdUseCase$p(this.this$0);
            String string2 = this.$url;
            this.label = n4;
            object = ((BannerAdUseCase)object).callBannerClickImpression(string2, this);
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

