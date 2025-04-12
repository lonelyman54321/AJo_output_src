/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.BannerAdViewModel$callBannerAdsHomeApi$1$1$1;
import com.ril.ajio.jiobannerads.BannerAdViewModel$callBannerAdsHomeApi$1$1$2;
import com.ril.ajio.services.entity.BannerAd;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class BannerAdViewModel$callBannerAdsHomeApi$1$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $asi;
    final /* synthetic */ Ref$ObjectRef $cmsBannerApiDataCallBack;
    final /* synthetic */ String $loggedIn;
    final /* synthetic */ String $pageUrl;
    final /* synthetic */ String $storeId;
    final /* synthetic */ Ref$ObjectRef $thirdPartyApiDataCallBack;
    final /* synthetic */ String $userType;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$callBannerAdsHomeApi$1$1(Ref$ObjectRef ref$ObjectRef, BannerAdViewModel bannerAdViewModel, Ref$ObjectRef ref$ObjectRef2, String string2, String string3, String string4, String string5, String string6, f80_0 f80_02) {
        this.$cmsBannerApiDataCallBack = ref$ObjectRef;
        this.this$0 = bannerAdViewModel;
        this.$thirdPartyApiDataCallBack = ref$ObjectRef2;
        this.$asi = string2;
        this.$pageUrl = string3;
        this.$storeId = string4;
        this.$loggedIn = string5;
        this.$userType = string6;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.$cmsBannerApiDataCallBack;
        BannerAdViewModel bannerAdViewModel = this.this$0;
        Ref$ObjectRef ref$ObjectRef2 = this.$thirdPartyApiDataCallBack;
        String string2 = this.$asi;
        String string3 = this.$pageUrl;
        String string4 = this.$storeId;
        String string5 = this.$loggedIn;
        String string6 = this.$userType;
        BannerAdViewModel$callBannerAdsHomeApi$1$1 bannerAdViewModel$callBannerAdsHomeApi$1$1 = new BannerAdViewModel$callBannerAdsHomeApi$1$1(ref$ObjectRef, bannerAdViewModel, ref$ObjectRef2, string2, string3, string4, string5, string6, f80_02);
        bannerAdViewModel$callBannerAdsHomeApi$1$1.L$0 = object;
        return bannerAdViewModel$callBannerAdsHomeApi$1$1;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$callBannerAdsHomeApi$1$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$callBannerAdsHomeApi$1$1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block15: {
            block16: {
                block20: {
                    block17: {
                        block18: {
                            block19: {
                                var2_2 = this;
                                var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                var4_4 = this.label;
                                var5_5 /* !! */  = null;
                                var6_6 = "Exception is ";
                                var7_7 = 2;
                                var8_8 = 1;
                                if (var4_4 == 0) break block18;
                                if (var4_4 == var8_8) break block19;
                                if (var4_4 != var7_7) {
                                    var9_11 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var9_11;
                                }
                                var9_9 = (Ref$ObjectRef)this.L$0;
                                try {
                                    vl2_2.b(var1_1);
                                    var5_5 /* !! */  = var1_1;
                                    ** GOTO lbl-1000
                                }
                                catch (Exception var9_10) {
                                    break block15;
                                }
                            }
                            var9_9 = (Ref$ObjectRef)this.L$1;
                            var10_15 = (Object[])this.L$0;
                            try {
                                vl2_2.b(var1_1);
                                var11_16 = var10_15;
                                var10_15 = var1_1;
                            }
                            catch (Exception var9_12) {
                                break block16;
                            }
                        }
                        vl2_2.b(var1_1);
                        var9_9 = (i90_0)this.L$0;
                        var12_17 = xv_0.g();
                        var13_18 = 3;
                        if (var12_17) {
                            var15_20 = this.this$0;
                            var16_21 = this.$asi;
                            var17_22 = this.$pageUrl;
                            var18_23 = this.$storeId;
                            var19_24 = this.$loggedIn;
                            var20_25 = this.$userType;
                            var21_26 = var14_19;
                            var14_19 = new BannerAdViewModel$callBannerAdsHomeApi$1$1$1(var15_20, var16_21, var17_22, var18_23, var19_24, var20_25, null);
                            var14_19 = Ae3.a((i90_0)var9_9, null, (Function2)var14_19, var13_18);
                        } else {
                            var12_17 = false;
                            var14_19 = null;
                        }
                        var21_26 = h40_0.a;
                        var22_27 = h40_0.Z0();
                        if (var22_27) {
                            var15_20 = var2_2.this$0;
                            var16_21 = var2_2.$pageUrl;
                            var17_22 = var2_2.$storeId;
                            var21_26 = new BannerAdViewModel$callBannerAdsHomeApi$1$1$2(var15_20, var16_21, var17_22, null);
                            var11_16 = var9_9 = Ae3.a((i90_0)var9_9, null, (Function2)var21_26, var13_18);
                        } else {
                            var13_18 = 0;
                            var11_16 = null;
                        }
                        try {
                            var9_9 = var2_2.$cmsBannerApiDataCallBack;
                            if (var14_19 == null) break block17;
                            var2_2.L$0 = var11_16;
                            var2_2.L$1 = var9_9;
                            var2_2.label = var8_8;
                            var10_15 = var14_19.D(var2_2);
                            if (var10_15 == var3_3 /* !! */ ) {
                                return var3_3 /* !! */ ;
                            }
                        }
                        catch (Exception var9_13) {
                            var10_15 = var11_16;
                            break block16;
                        }
                        var10_15 = (BannerAd)var10_15;
                        break block20;
                    }
                    var8_8 = 0;
                    var10_15 = null;
                }
                var9_9.element = var10_15;
                var9_9 = var2_2.this$0;
                var10_15 = var2_2.$cmsBannerApiDataCallBack;
                var10_15 = var10_15.element;
                var10_15 = (BannerAd)var10_15;
                var14_19 = var9_9.getJioBannerAdsMap();
                BannerAdViewModel.access$updateAllJioAdstoMap((BannerAdViewModel)var9_9, (BannerAd)var10_15, (HashMap)var14_19);
                ** GOTO lbl-1000
            }
            var14_19 = yn3_0.a;
            var9_9 = var9_9.getMessage();
            var9_9 = kp1_0.c(var6_6, (String)var9_9);
            var11_16 = new Object[]{};
            var14_19.a((String)var9_9, (Object[])var11_16);
            var11_16 = var10_15;
lbl-1000:
            // 2 sources

            {
                var9_9 = var2_2.$thirdPartyApiDataCallBack;
                if (var11_16 == null) ** GOTO lbl102
                var2_2.L$0 = var9_9;
                var2_2.L$1 = null;
                var2_2.label = var7_7;
                var5_5 /* !! */  = var11_16.y0(var2_2);
                if (var5_5 /* !! */  != var3_3 /* !! */ ) ** GOTO lbl-1000
                return var3_3 /* !! */ ;
            }
lbl-1000:
            // 2 sources

            {
                var5_5 /* !! */  = (DataCallback)var5_5 /* !! */ ;
lbl102:
                // 2 sources

                var9_9.element = var5_5 /* !! */ ;
                var9_9 = var2_2.this$0;
                var3_3 /* !! */  = var2_2.$thirdPartyApiDataCallBack;
                var3_3 /* !! */  = var3_3 /* !! */ .element;
                var3_3 /* !! */  = (DataCallback)var3_3 /* !! */ ;
                BannerAdViewModel.access$updateAllExternalAdsToMap((BannerAdViewModel)var9_9, (DataCallback)var3_3 /* !! */ );
                return Unit.a;
            }
        }
        var3_3 /* !! */  = yn3_0.a;
        var9_14 = var9_10.getMessage();
        var9_14 = kp1_0.c(var6_6, var9_14);
        var5_5 /* !! */  = new Object[]{};
        var3_3 /* !! */ .a(var9_14, var5_5 /* !! */ );
        return Unit.a;
    }
}

