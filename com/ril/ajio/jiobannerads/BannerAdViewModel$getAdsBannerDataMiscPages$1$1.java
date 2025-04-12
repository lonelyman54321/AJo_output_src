/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.BannerAdViewModel$getAdsBannerDataMiscPages$1$1$1;
import com.ril.ajio.jiobannerads.BannerAdViewModel$getAdsBannerDataMiscPages$1$1$2;
import com.ril.ajio.jiobannerads.BannerAdViewModel$getAdsBannerDataMiscPages$1$1$cmsBannerApi$1;
import com.ril.ajio.services.entity.BannerAd;
import com.ril.ajio.services.entity.BannerAdsConfig;
import com.ril.ajio.services.entity.BannerResponse;
import com.ril.ajio.services.entity.ThirdPartyBannerAds;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.k;

final class BannerAdViewModel$getAdsBannerDataMiscPages$1$1
extends qg3_2
implements Function2 {
    final /* synthetic */ BannerAdsConfig $bannerConfig;
    final /* synthetic */ boolean $isThirdPartyBannersEnabled;
    final /* synthetic */ boolean $isUserLoggedIn;
    final /* synthetic */ xv$a_0 $screenName;
    final /* synthetic */ long $timeOutThirdPartyAds;
    final /* synthetic */ String $userType;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$getAdsBannerDataMiscPages$1$1(BannerAdsConfig bannerAdsConfig, boolean bl2, boolean bl3, long l2, BannerAdViewModel bannerAdViewModel, xv$a_0 xv$a_0, String string2, f80_0 f80_02) {
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
        BannerAdViewModel$getAdsBannerDataMiscPages$1$1 bannerAdViewModel$getAdsBannerDataMiscPages$1$1 = new BannerAdViewModel$getAdsBannerDataMiscPages$1$1(bannerAdsConfig, bl2, bl3, l2, bannerAdViewModel, xv$a_0, string2, f80_02);
        bannerAdViewModel$getAdsBannerDataMiscPages$1$1.L$0 = object;
        return bannerAdViewModel$getAdsBannerDataMiscPages$1$1;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$getAdsBannerDataMiscPages$1$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$getAdsBannerDataMiscPages$1$1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block25: {
            block26: {
                block31: {
                    block28: {
                        block29: {
                            block30: {
                                var2_2 = this;
                                var3_3 = j90_0.COROUTINE_SUSPENDED;
                                var4_6 = this.label;
                                var5_7 = null;
                                var6_8 = 3;
                                var7_9 = 2;
                                var8_10 = 1;
                                if (var4_6 == 0) break block28;
                                if (var4_6 == var8_10) break block29;
                                if (var4_6 == var7_9) break block30;
                                if (var4_6 != var6_8) {
                                    var3_3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var3_3;
                                }
                                var3_3 = (DataCallback)this.L$0;
                                try {
                                    vl2_2.b(var1_1);
                                    var9_11 = var1_1;
                                    ** GOTO lbl-1000
                                }
                                catch (Exception var3_4) {
                                    break block25;
                                }
                            }
                            var3_3 = (DataCallback)this.L$0;
                            vl2_2.b(var1_1);
                            var9_11 = var1_1;
                        }
                        var9_11 = (Ref$ObjectRef)this.L$1;
                        var10_12 = (vn0_2)this.L$0;
                        vl2_2.b(var1_1);
                        var11_13 = var10_12;
                        var10_12 = var1_1;
                        break block31;
                    }
                    vl2_2.b(var1_1);
                    var9_11 = (i90_0)this.L$0;
                    var11_13 = this.this$0;
                    var12_14 = this.$bannerConfig;
                    var13_15 /* !! */  = this.$screenName;
                    var10_12 = new BannerAdViewModel$getAdsBannerDataMiscPages$1$1$cmsBannerApi$1((BannerAdViewModel)var11_13, (BannerAdsConfig)var12_14, var13_15 /* !! */ , null);
                    var10_12 = Ae3.a((i90_0)var9_11, null, (Function2)var10_12, var6_8);
                    var11_13 = new Ref$ObjectRef();
                    var12_14 = this.$bannerConfig;
                    var14_16 = var12_14.isJioBannerAdsEnabled();
                    if (var14_16) {
                        var14_16 = this.$isUserLoggedIn;
                        var12_14 = var14_16 != false ? "LOGGED_IN" : "NON_LOGGED_IN";
                        var15_17 = var12_14;
                        var16_18 = var2_2.this$0;
                        var17_20 = var2_2.$bannerConfig;
                        var18_21 = var2_2.$userType;
                        var13_15 /* !! */  = var12_14;
                        var12_14 = new BannerAdViewModel$getAdsBannerDataMiscPages$1$1$1(var16_18, var17_20, (String)var15_17, var18_21, null);
                        var9_11 = Ae3.a((i90_0)var9_11, null, (Function2)var12_14, var6_8);
                    } else {
                        var14_16 = this.$isThirdPartyBannersEnabled;
                        if (var14_16) {
                            var13_15 /* !! */  = this.this$0;
                            var16_19 = this.$bannerConfig;
                            var12_14 = new BannerAdViewModel$getAdsBannerDataMiscPages$1$1$2((BannerAdViewModel)var13_15 /* !! */ , var16_19, null);
                            var11_13.element = var9_11 = Ae3.a((i90_0)var9_11, null, (Function2)var12_14, var6_8);
                        }
                        var4_6 = 0;
                        var9_11 = null;
                    }
                    var2_2.L$0 = var9_11;
                    var2_2.L$1 = var11_13;
                    var2_2.label = var8_10;
                    var10_12 = var10_12.D(var2_2);
                    if (var10_12 == var3_3) {
                        return var3_3;
                    }
                    var19_22 = var11_13;
                    var11_13 = var9_11;
                    var9_11 = var19_22;
                }
                var10_12 = (DataCallback)var10_12;
                {
                    var12_14 = var2_2.$bannerConfig;
                    var14_16 = var12_14.isJioBannerAdsEnabled();
                    if (!var14_16) ** GOTO lbl-1000
                    if (var11_13 == null) break block26;
                }
                try {
                    var2_2.L$0 = var10_12;
                    var2_2.L$1 = null;
                    var2_2.label = var7_9;
                    var9_11 = var11_13.y0(var2_2);
                    if (var9_11 == var3_3) {
                        return var3_3;
                    }
                    var3_3 = var10_12;
                }
                catch (Exception v0) {
                    var3_3 = var10_12;
lbl89:
                    // 2 sources

                    while (true) {
                        var10_12 = var3_3;
                        while (true) {
                            var20_23 = false;
                            var3_3 = null;
                            var4_6 = 0;
                            var9_11 = null;
                            ** GOTO lbl124
                            break;
                        }
                        break;
                    }
                }
                try {
                    var9_11 = (BannerAd)var9_11;
                    var10_12 = var3_3;
                }
                catch (Exception v1) {
                    ** continue;
                }
            }
            var4_6 = 0;
            var9_11 = null;
            var3_3 = var9_11;
            var4_6 = 0;
            var9_11 = null;
            ** GOTO lbl124
lbl-1000:
            // 1 sources

            {
                if ((var7_9 = (int)var2_2.$isThirdPartyBannersEnabled) == 0) ** continue;
                var21_24 = var2_2.$timeOutThirdPartyAds;
                var23_25 = new HashMap<K, V>((Ref$ObjectRef)var9_11, null);
                var2_2.L$0 = var10_12;
                var2_2.L$1 = null;
                var2_2.label = var6_8;
                var9_11 = k.b(var21_24, (Function2)var23_25, var2_2);
                if (var9_11 == var3_3) {
                    return var3_3;
                }
                var3_3 = var10_12;
            }
lbl-1000:
            // 2 sources

            {
                block33: {
                    block27: {
                        block32: {
                            var9_11 = (DataCallback)var9_11;
                            var10_12 = var3_3;
                            var20_23 = false;
                            var3_3 = null;
lbl124:
                            // 3 sources

                            var24_26 = cp_1.Companion;
                            var24_26.getClass();
                            var24_26 = cp$a.e();
                            var24_26.getClass();
                            var6_8 = (int)cp_1.J((DataCallback)var10_12);
                            if (var6_8 == 0) {
                                var3_3 = var2_2.this$0;
                                var3_3 = BannerAdViewModel.access$getAdditionalBannerMLD$p((BannerAdViewModel)var3_3);
                                var9_11 = var2_2.this$0;
                                var5_7 = var2_2.$bannerConfig;
                                var9_11 = BannerAdViewModel.access$getEmptyComponentForDynamicAds((BannerAdViewModel)var9_11, (BannerAdsConfig)var5_7);
                                var3_3.k(var9_11);
                                return Unit.a;
                            }
                            var24_26 = var10_12.getData();
                            if ((var24_26 = (BannerResponse)var24_26) == null) {
                                var3_3 = var2_2.this$0;
                                var3_3 = BannerAdViewModel.access$getAdditionalBannerMLD$p((BannerAdViewModel)var3_3);
                                var9_11 = var2_2.this$0;
                                var5_7 = var2_2.$bannerConfig;
                                var9_11 = BannerAdViewModel.access$getEmptyComponentForDynamicAds((BannerAdViewModel)var9_11, (BannerAdsConfig)var5_7);
                                var3_3.k(var9_11);
                                return Unit.a;
                            }
                            var23_25 = var2_2.this$0;
                            BannerAdViewModel.access$checkForBannerType((BannerAdViewModel)var23_25, (BannerResponse)var24_26);
                            var23_25 = var2_2.$bannerConfig;
                            var7_9 = (int)var23_25.isJioBannerAdsEnabled();
                            if (var7_9 != 0 || (var7_9 = (int)var2_2.$isThirdPartyBannersEnabled) != 0) break block32;
                            var3_3 = var2_2.this$0;
                            BannerAdViewModel.access$handleBanner((BannerAdViewModel)var3_3, (BannerResponse)var24_26);
                            break block33;
                        }
                        var23_25 = new HashMap<K, V>();
                        var10_12 = var2_2.$bannerConfig;
                        var25_27 = var10_12.isJioBannerAdsEnabled();
                        if (var25_27 == var8_10) {
                            var9_11 = var2_2.this$0;
                            BannerAdViewModel.access$updateAllJioAdstoMap((BannerAdViewModel)var9_11, (BannerAd)var3_3, var23_25);
lbl163:
                            // 3 sources

                            while (true) {
                                var20_23 = false;
                                var3_3 = null;
                                break block27;
                                break;
                            }
                        }
                        if (var9_11 == null) ** GOTO lbl163
                        var3_3 = var9_11.getData();
                        if ((var3_3 = (ThirdPartyBannerAds)var3_3) != null) ** break;
                        ** continue;
                        var3_3 = var3_3.getAds();
                    }
                    var9_11 = cp$a.e();
                    var26_28 = var2_2.$bannerConfig;
                    var26_28.isJioBannerAdsEnabled();
                    var9_11.getClass();
                    cp_1.S((BannerResponse)var24_26, (Map)var3_3, var23_25);
                }
                var3_3 = var24_26.getComponent();
                if (var3_3 != null) {
                    var5_7 = var3_3.getBanners();
                }
                if (var5_7 != null && !(var20_23 = var5_7.isEmpty())) {
                    var3_3 = var2_2.this$0;
                    var3_3 = BannerAdViewModel.access$getAdditionalBannerMLD$p((BannerAdViewModel)var3_3);
                    var9_11 = var24_26.getComponent();
                    var3_3.k(var9_11);
                    return Unit.a;
                }
                var3_3 = var2_2.this$0;
                var3_3 = BannerAdViewModel.access$getAdditionalBannerMLD$p((BannerAdViewModel)var3_3);
                var9_11 = var2_2.this$0;
                var5_7 = var2_2.$bannerConfig;
                var9_11 = BannerAdViewModel.access$getEmptyComponentForDynamicAds((BannerAdViewModel)var9_11, (BannerAdsConfig)var5_7);
                var3_3.k(var9_11);
                return Unit.a;
            }
        }
        var9_11 = yn3_0.a;
        var3_5 = var3_4.getMessage();
        var3_5 = kp1_0.c("Exception is ", var3_5);
        var5_7 = new Object[]{};
        var9_11.a(var3_5, (Object[])var5_7);
        return Unit.a;
    }
}

