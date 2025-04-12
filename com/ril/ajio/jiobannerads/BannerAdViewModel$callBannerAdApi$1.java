/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.BannerAdViewModel$callBannerAdApi$1$1;
import com.ril.ajio.services.data.Product.BannerAdTargetedFormulaData;
import com.ril.ajio.services.data.Product.JioBannerAdsPLPFacet;
import com.ril.ajio.services.entity.BannerAd;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class BannerAdViewModel$callBannerAdApi$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $adSpotId;
    final /* synthetic */ BannerAdTargetedFormulaData $bannerConfigData;
    final /* synthetic */ JioBannerAdsPLPFacet $bannerConfigDatav2;
    final /* synthetic */ HashMap $filtersSelectionStatusMap;
    final /* synthetic */ boolean $isFilterAppliedForConfigFacet;
    final /* synthetic */ bv2_0 $plpDelegate;
    Object L$0;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$callBannerAdApi$1(BannerAdViewModel bannerAdViewModel, String string2, BannerAdTargetedFormulaData bannerAdTargetedFormulaData, JioBannerAdsPLPFacet jioBannerAdsPLPFacet, bv2_0 bv2_02, boolean bl2, HashMap hashMap, f80_0 f80_02) {
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
        BannerAdViewModel bannerAdViewModel = this.this$0;
        String string2 = this.$adSpotId;
        BannerAdTargetedFormulaData bannerAdTargetedFormulaData = this.$bannerConfigData;
        JioBannerAdsPLPFacet jioBannerAdsPLPFacet = this.$bannerConfigDatav2;
        bv2_0 bv2_02 = this.$plpDelegate;
        boolean bl2 = this.$isFilterAppliedForConfigFacet;
        HashMap hashMap = this.$filtersSelectionStatusMap;
        object = new BannerAdViewModel$callBannerAdApi$1(bannerAdViewModel, string2, bannerAdTargetedFormulaData, jioBannerAdsPLPFacet, bv2_02, bl2, hashMap, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$callBannerAdApi$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$callBannerAdApi$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        bv2_0 bv2_02;
        BannerAdTargetedFormulaData bannerAdTargetedFormulaData;
        Object object4;
        BannerAdViewModel bannerAdViewModel;
        Object object5;
        Object object6 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            object6 = (Ref$ObjectRef)this.L$0;
            vl2_2.b(object);
        } else {
            BannerAdViewModel$callBannerAdApi$1$1 bannerAdViewModel$callBannerAdApi$1$1;
            vl2_2.b(object);
            object = new Ref$ObjectRef();
            object5 = this.this$0;
            object5 = BannerAdViewModel.access$getDispatcher$p((BannerAdViewModel)object5);
            bannerAdViewModel = this.this$0;
            object4 = this.$adSpotId;
            bannerAdTargetedFormulaData = this.$bannerConfigData;
            JioBannerAdsPLPFacet jioBannerAdsPLPFacet = this.$bannerConfigDatav2;
            bv2_02 = this.$plpDelegate;
            boolean bl2 = this.$isFilterAppliedForConfigFacet;
            HashMap hashMap = this.$filtersSelectionStatusMap;
            object3 = bannerAdViewModel$callBannerAdApi$1$1;
            object2 = object;
            bannerAdViewModel$callBannerAdApi$1$1 = new BannerAdViewModel$callBannerAdApi$1$1((Ref$ObjectRef)object, bannerAdViewModel, (String)object4, bannerAdTargetedFormulaData, jioBannerAdsPLPFacet, bv2_02, bl2, hashMap, null);
            this.L$0 = object;
            this.label = n4;
            object5 = Ae3.g(this, (CoroutineContext)object5, bannerAdViewModel$callBannerAdApi$1$1);
            if (object5 == object6) {
                return object6;
            }
            object6 = object;
        }
        try {
            object = this.this$0;
            object = BannerAdViewModel.access$getBannerAdMLD$p((BannerAdViewModel)object);
            object6 = ((Ref$ObjectRef)object6).element;
            ((R53)object).k(object6);
            return Unit.a;
        }
        catch (Exception exception) {}
        object6 = ApiErrorRepo.INSTANCE;
        object5 = UrlHelper.Companion.getInstance();
        n4 = 0;
        Object object7 = new Object[]{};
        object3 = "plp";
        object2 = "banner_ads_url";
        object5 = ((UrlHelper)object5).getApiUrl((String)object3, (String)object2, object7);
        object7 = "Jio Ads - ";
        object5 = kp1_0.c((String)object7, (String)object5);
        Object object8 = exception.getMessage();
        if (object8 == null) {
            object8 = "";
        }
        object7 = object8;
        object4 = o72_0.a;
        int n7 = 72;
        bv2_02 = null;
        object2 = null;
        bannerAdTargetedFormulaData = null;
        ApiErrorRepo.logServiceErrorEvent$default((ApiErrorRepo)object6, (String)object5, (String)object8, 200, null, false, (String)object4, null, n7, null);
        object8 = BannerAdViewModel.access$getBannerAdMLD$p(this.this$0);
        int n8 = 7;
        bannerAdViewModel = null;
        n3 = 0;
        object5 = null;
        n4 = 0;
        object7 = null;
        object3 = null;
        object6 = object4;
        object4 = new BannerAd(null, null, null, n8, null);
        ((R53)object8).k(object4);
        return Unit.a;
    }
}

