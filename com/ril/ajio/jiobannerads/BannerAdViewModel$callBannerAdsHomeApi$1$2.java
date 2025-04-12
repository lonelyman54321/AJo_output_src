/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class BannerAdViewModel$callBannerAdsHomeApi$1$2
extends qg3_2
implements Function2 {
    final /* synthetic */ Ref$ObjectRef $cmsBannerApiDataCallBack;
    final /* synthetic */ Ref$ObjectRef $thirdPartyApiDataCallBack;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$callBannerAdsHomeApi$1$2(BannerAdViewModel bannerAdViewModel, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, f80_0 f80_02) {
        this.this$0 = bannerAdViewModel;
        this.$cmsBannerApiDataCallBack = ref$ObjectRef;
        this.$thirdPartyApiDataCallBack = ref$ObjectRef2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        BannerAdViewModel bannerAdViewModel = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$cmsBannerApiDataCallBack;
        Ref$ObjectRef ref$ObjectRef2 = this.$thirdPartyApiDataCallBack;
        object = new BannerAdViewModel$callBannerAdsHomeApi$1$2(bannerAdViewModel, ref$ObjectRef, ref$ObjectRef2, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$callBannerAdsHomeApi$1$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$callBannerAdsHomeApi$1$2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        if (!n3) {
            vl2_2.b(object);
            object = this.this$0.getBannerAdsHome();
            object2 = this.$cmsBannerApiDataCallBack.element;
            if (object2 == null && (object2 = this.$thirdPartyApiDataCallBack.element) == null) {
                n3 = 0;
                object2 = null;
            } else {
                n3 = 1;
            }
            object2 = n3 != 0;
            ((R53)object).k(object2);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

