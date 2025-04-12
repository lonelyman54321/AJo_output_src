/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import com.ril.ajio.services.data.Product.BannerAdTargetedFormulaData;
import com.ril.ajio.services.data.Product.JioBannerAdsPLPFacet;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class BannerAdViewModel$callBannerAdApi$1$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $adSpotId;
    final /* synthetic */ Ref$ObjectRef $bannerAd;
    final /* synthetic */ BannerAdTargetedFormulaData $bannerConfigData;
    final /* synthetic */ JioBannerAdsPLPFacet $bannerConfigDatav2;
    final /* synthetic */ HashMap $filtersSelectionStatusMap;
    final /* synthetic */ boolean $isFilterAppliedForConfigFacet;
    final /* synthetic */ bv2_0 $plpDelegate;
    Object L$0;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$callBannerAdApi$1$1(Ref$ObjectRef ref$ObjectRef, BannerAdViewModel bannerAdViewModel, String string2, BannerAdTargetedFormulaData bannerAdTargetedFormulaData, JioBannerAdsPLPFacet jioBannerAdsPLPFacet, bv2_0 bv2_02, boolean bl2, HashMap hashMap, f80_0 f80_02) {
        this.$bannerAd = ref$ObjectRef;
        this.this$0 = bannerAdViewModel;
        this.$adSpotId = string2;
        this.$bannerConfigData = bannerAdTargetedFormulaData;
        this.$bannerConfigDatav2 = jioBannerAdsPLPFacet;
        this.$plpDelegate = bv2_02;
        this.$isFilterAppliedForConfigFacet = bl2;
        this.$filtersSelectionStatusMap = hashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.$bannerAd;
        BannerAdViewModel bannerAdViewModel = this.this$0;
        String string2 = this.$adSpotId;
        BannerAdTargetedFormulaData bannerAdTargetedFormulaData = this.$bannerConfigData;
        JioBannerAdsPLPFacet jioBannerAdsPLPFacet = this.$bannerConfigDatav2;
        bv2_0 bv2_02 = this.$plpDelegate;
        boolean bl2 = this.$isFilterAppliedForConfigFacet;
        HashMap hashMap = this.$filtersSelectionStatusMap;
        object = new BannerAdViewModel$callBannerAdApi$1$1(ref$ObjectRef, bannerAdViewModel, string2, bannerAdTargetedFormulaData, jioBannerAdsPLPFacet, bv2_02, bl2, hashMap, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$callBannerAdApi$1$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$callBannerAdApi$1$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef)this.L$0;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.$bannerAd;
            BannerAdUseCase bannerAdUseCase = BannerAdViewModel.access$getBannerAdUseCase$p(this.this$0);
            String string2 = this.$adSpotId;
            BannerAdTargetedFormulaData bannerAdTargetedFormulaData = this.$bannerConfigData;
            JioBannerAdsPLPFacet jioBannerAdsPLPFacet = this.$bannerConfigDatav2;
            bv2_0 bv2_02 = this.$plpDelegate;
            boolean bl2 = this.$isFilterAppliedForConfigFacet;
            HashMap hashMap = this.$filtersSelectionStatusMap;
            this.L$0 = object;
            this.label = n4;
            Object object2 = bannerAdUseCase.callBannerAdsApi(string2, bannerAdTargetedFormulaData, jioBannerAdsPLPFacet, bv2_02, bl2, hashMap, this);
            if (object2 == j90_02) {
                return j90_02;
            }
            Object object3 = object;
            object = object2;
        }
        var2_5.element = object;
        return Unit.a;
    }
}

