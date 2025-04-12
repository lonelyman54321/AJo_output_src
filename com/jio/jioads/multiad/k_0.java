/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.multiad.b_0;
import com.jio.jioads.multiad.i_0;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.t;
import com.jio.jioads.multiad.y;
import com.jio.jioads.multiad.z;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.c;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.k;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.multiad.k
 */
public final class k_0
implements b_0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ z b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public k_0(z z5, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        this.a = hashMap;
        this.b = z5;
        this.c = arrayList;
        this.d = arrayList2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(f var1_1) {
        block58: {
            block53: {
                block54: {
                    block55: {
                        block56: {
                            block52: {
                                block57: {
                                    var2_2 = this;
                                    var3_3 = this.b;
                                    var4_4 = "message";
                                    if (var1_1 != null || !(var7_7 = (var5_5 = this.a).containsKey(var6_6 = "pgm")) || (var7_7 = var3_3.t)) break block53;
                                    var5_5 = var5_5.get(var6_6);
                                    var8_8 /* !! */  = var5_5;
                                    var8_8 /* !! */  = var5_5;
                                    var10_12 = this.d;
                                    var11_13 = this.a;
                                    var12_16 = this.c;
                                    var5_5 = var9_11;
                                    var13_19 = var3_3;
                                    var14_22 = var1_1;
                                    var9_11 = new i_0(var3_3, var1_1, (HashMap)var11_13, (ArrayList)var12_16, (ArrayList)var10_12);
                                    if (var8_8 /* !! */  == null || (var15_25 = var8_8 /* !! */ .containsKey(var6_6)) != (var7_7 = true)) break block54;
                                    var5_5 = (f)var8_8 /* !! */ .get(var6_6);
                                    var14_22 = null;
                                    if (var5_5 != null) {
                                        var11_13 = var5_5.g;
                                    } else {
                                        var16_27 = false;
                                        var11_13 = null;
                                    }
                                    var16_27 = TextUtils.isEmpty((CharSequence)var11_13);
                                    if (var16_27) break block55;
                                    if (var5_5 == null) break block56;
                                    var11_13 = var3_3.m;
                                    var12_16 = "";
                                    if (var11_13 == null || (var16_27 = var11_13.containsKey(var10_12 = var3_3.d())) != var7_7) ** GOTO lbl-1000
                                    var11_13 = var3_3.m;
                                    Intrinsics.checkNotNull(var11_13);
                                    var10_12 = var3_3.o;
                                    if (var10_12 != null) {
                                        var10_12 = var10_12.P();
                                    } else {
                                        var17_28 = 0;
                                        var10_12 = null;
                                    }
                                    var11_13 = (Object[])var11_13.get(var10_12);
                                    if (var11_13 != null) {
                                        var17_28 = 3;
                                        var11_13 = var11_13[var17_28].toString();
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var11_13 = var12_16;
                                    }
                                    var10_12 = var3_3.o;
                                    if (var10_12 != null) {
                                        var10_12 = var10_12.k0();
                                    } else {
                                        var17_28 = 0;
                                        var10_12 = null;
                                    }
                                    var8_8 /* !! */  = JioAdView$AdState.DESTROYED;
                                    var18_29 = null;
                                    if (var10_12 == var8_8 /* !! */ ) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            var16_27 = true;
                                            break block52;
                                            break;
                                        }
                                    }
                                    var10_12 = var3_3.o;
                                    if (var10_12 == null || (var10_12 = var10_12.z()) == null || (var17_28 = var10_12.i0()) != 0) break block57;
                                    var10_12 = var3_3.o;
                                    if (var10_12 != null) {
                                        var10_12 = var10_12.L();
                                    } else {
                                        var17_28 = 0;
                                        var10_12 = null;
                                    }
                                    var19_30 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
                                    if (var10_12 == var19_30 || (var17_28 = (int)Intrinsics.areEqual(var11_13, var6_6)) == 0 && !(var16_27 = Intrinsics.areEqual(var11_13, var10_12 = "prm"))) break block57;
                                    var3_3.t = var7_7;
                                    var11_13 = new StringBuilder();
                                    var10_12 = var3_3.o;
                                    if (var10_12 != null) {
                                        var10_12 = var10_12.P();
                                    } else {
                                        var17_28 = 0;
                                        var10_12 = null;
                                    }
                                    var6_6 = ": pgm skipping instruction prev camp equals to pgm or prm";
                                    j_0.k((StringBuilder)var11_13, (String)var10_12, var6_6);
                                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    var11_13 = JioAds$LogLevel.NONE;
                                    ** GOTO lbl-1000
                                }
                                if ((var11_13 = var3_3.o) != null && (var11_13 = var11_13.P()) != null) {
                                    var10_12 = var3_3.q;
                                    if (var10_12 != null) {
                                        Intrinsics.checkNotNullParameter(var11_13, "adspotId");
                                        var11_13 = t.r.get(var11_13);
                                        var10_12 = Boolean.TRUE;
                                        var16_27 = Intrinsics.areEqual(var11_13, var10_12);
                                        var11_13 = var16_27;
                                    } else {
                                        var16_27 = false;
                                        var11_13 = null;
                                    }
                                    var10_12 = Boolean.TRUE;
                                    var16_27 = Intrinsics.areEqual(var11_13, var10_12);
                                } else {
                                    var16_27 = false;
                                    var11_13 = null;
                                }
                                if (var16_27) {
                                    var11_13 = new StringBuilder();
                                    var10_12 = var3_3.o;
                                    if (var10_12 != null) {
                                        var10_12 = var10_12.P();
                                    } else {
                                        var17_28 = 0;
                                        var10_12 = null;
                                    }
                                    var6_6 = ": pgm skipping instruction  backup already selected";
                                    j_0.k((StringBuilder)var11_13, (String)var10_12, var6_6);
                                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    var11_13 = JioAds$LogLevel.NONE;
                                    ** continue;
                                }
                                var16_27 = false;
                                var11_13 = null;
                            }
                            if (var16_27) break block56;
                            var11_13 = new StringBuilder();
                            var10_12 = var3_3.o;
                            if (var10_12 != null) {
                                var10_12 = var10_12.P();
                            } else {
                                var17_28 = 0;
                                var10_12 = null;
                            }
                            var6_6 = ": hitting pgm instruction url";
                            j_0.k((StringBuilder)var11_13, (String)var10_12, var6_6);
                            var11_13 = JioAds.Companion;
                            var11_13.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var10_12 = JioAds$LogLevel.NONE;
                            var10_12 = var5_5.h;
                            if (var10_12 == null) ** GOTO lbl-1000
                            Intrinsics.checkNotNull(var10_12);
                            var17_28 = (int)var10_12.isEmpty();
                            if (!(var7_7 ^= var17_28)) ** GOTO lbl-1000
                            var13_19 = var3_3.o;
                            if (var13_19 != null) {
                                var13_19 = var13_19.k0();
                            } else {
                                var7_7 = false;
                                var13_19 = null;
                            }
                            if (var13_19 != var8_8 /* !! */ ) {
                                var13_19 = var3_3.B;
                                if (var13_19 != null) {
                                    var5_5 = var5_5.h;
                                    Intrinsics.checkNotNull(var5_5);
                                    var5_5 = (String)var5_5.get(0);
                                    var11_13 = new Object();
                                    var11_13.p = var13_19;
                                    var10_12 = var3_3.o;
                                    if (var10_12 != null) {
                                        var10_12 = var10_12.P();
                                    } else {
                                        var17_28 = 0;
                                        var10_12 = null;
                                    }
                                    var11_13.q = var10_12;
                                    var11_13.a = var5_5;
                                    var11_13.b = var5_5 = var3_3.c;
                                    Intrinsics.checkNotNullParameter(var13_19, "context");
                                    var5_5 = "common_prefs";
                                    var10_12 = "advid";
                                    var5_5 = j_0.d((Context)var13_19, (String)var5_5, 0, var12_16, (String)var10_12);
                                    var12_16 = "null cannot be cast to non-null type kotlin.String";
                                    try {
                                        Intrinsics.checkNotNull(var5_5, (String)var12_16);
                                        var5_5 = (String)var5_5;
                                    }
                                    catch (Exception v0) {
                                        var15_25 = 0;
                                        var5_5 = null;
                                    }
                                    var11_13.r = var5_5;
                                    var5_5 = Utility.INSTANCE;
                                    var11_13.s = var12_16 = var5_5.getUidFromPreferences((Context)var13_19);
                                    var11_13.l = var12_16 = Integer.valueOf(0);
                                    var12_16 = var3_3.o;
                                    if (var12_16 != null) {
                                        var12_16 = var12_16.q0();
                                    } else {
                                        var20_31 = 0;
                                        var12_16 = null;
                                    }
                                    var11_13.w = var12_16;
                                    var11_13.m = var12_16 = Boolean.FALSE;
                                    var12_16 = var3_3.o;
                                    if (var12_16 != null) {
                                        var12_16 = var12_16.R();
                                    } else {
                                        var20_31 = 0;
                                        var12_16 = null;
                                    }
                                    var11_13.t = var12_16;
                                    var12_16 = var3_3.o;
                                    if (var12_16 != null) {
                                        var12_16.L();
                                    }
                                    if ((var12_16 = var3_3.o) != null) {
                                        var20_31 = var12_16.W();
                                        var12_16 = var20_31;
                                    } else {
                                        var20_31 = 0;
                                        var12_16 = null;
                                    }
                                    var11_13.F = var12_16;
                                    var12_16 = var3_3.o;
                                    if (var12_16 != null) {
                                        var12_16 = var12_16.K();
                                    } else {
                                        var20_31 = 0;
                                        var12_16 = null;
                                    }
                                    var11_13.u = var12_16;
                                    var21_32 = var5_5.replaceMacros((k)var11_13);
                                    var11_13.g();
                                    var15_25 = TextUtils.isEmpty((CharSequence)var21_32);
                                    if (var15_25 == 0) {
                                        var5_5 = new StringBuilder();
                                        var11_13 = var3_3.o;
                                        if (var11_13 != null) {
                                            var11_13 = var11_13.P();
                                        } else {
                                            var16_27 = false;
                                            var11_13 = null;
                                        }
                                        var5_5.append((String)var11_13);
                                        var5_5.append(": isPGMAdEmpty: ");
                                        var16_27 = var3_3.g;
                                        var5_5.append(var16_27);
                                        var5_5.append(",  isPgmSkipped: ");
                                        var16_27 = var3_3.t;
                                        var5_5.append(var16_27);
                                        Intrinsics.checkNotNullParameter(var5_5.toString(), var4_4);
                                        var5_5 = JioAds.Companion;
                                        var5_5.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var11_13 = JioAds$LogLevel.NONE;
                                        var11_13 = new StringBuilder();
                                        var12_16 = var3_3.o;
                                        if (var12_16 != null) {
                                            var14_22 = var12_16.P();
                                        }
                                        var11_13.append((String)var14_22);
                                        var11_13.append(": instruction Url of PGM node: ");
                                        var11_13.append(var21_32);
                                        var14_22 = var11_13.toString();
                                        Intrinsics.checkNotNullParameter(var14_22, var4_4);
                                        var5_5.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var5_5 = var3_3.F;
                                        if (var5_5 != null) {
                                            var5_5.a();
                                        }
                                        var3_3.F = var18_29 = new c((Context)var13_19);
                                        var15_25 = 5;
                                        var22_33 = var15_25;
                                        var5_5 = new y(var3_3, var9_11, (Context)var13_19);
                                        var7_7 = var3_3.b;
                                        var23_34 = var7_7;
                                        var19_30 = null;
                                        var18_29.b(0, var21_32, null, null, var22_33, (NetworkTaskListener)var5_5, var23_34);
                                    } else {
                                        var5_5 = new StringBuilder();
                                        var13_19 = var3_3.o;
                                        if (var13_19 != null) {
                                            var14_22 = var13_19.P();
                                        }
                                        var13_19 = ": status url array empty for PGM node skipping it";
                                        j_0.k((StringBuilder)var5_5, (String)var14_22, (String)var13_19);
                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var5_5 = JioAds$LogLevel.NONE;
                                        var9_11.a();
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                var5_5 = new StringBuilder();
                                var13_19 = var3_3.o;
                                if (var13_19 != null) {
                                    var14_22 = var13_19.P();
                                }
                                var13_19 = ": status url node unavailable for PGM node skipping it";
                                j_0.k((StringBuilder)var5_5, (String)var14_22, (String)var13_19);
                                var5_5 = var11_13.getInstance();
                                var5_5.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var9_11.a();
                            }
                            break block58;
                        }
                        var9_11.a();
                        break block58;
                    }
                    var9_11.a();
                    break block58;
                }
                var9_11.a();
                break block58;
            }
            var15_26 = var3_3.t;
            if (var15_26 && var1_1 == null) {
                Intrinsics.checkNotNullParameter("Pgm is skipped and proceed for promotion and selected campaign also null", var4_4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var5_5 = JioAds$LogLevel.NONE;
                var11_14 = var2_2.c;
                var12_17 = var2_2.d;
                var14_23 = var2_2.a;
                var24_35 = var3_3.h;
                var8_9 = "prm";
                var5_5 = var3_3;
                var13_20 = var1_1;
                var4_4 = var8_9;
                z.j(var3_3, var1_1, var14_23, var11_14, var12_17, var24_35, var8_9);
            } else {
                var11_15 = var2_2.c;
                var12_18 = var2_2.d;
                var14_24 = var2_2.a;
                var24_36 = var3_3.h;
                var8_10 = "dd";
                var5_5 = var3_3;
                var13_21 = var1_1;
                var4_4 = var8_10;
                z.j(var3_3, var1_1, var14_24, var11_15, var12_18, var24_36, var8_10);
            }
        }
    }
}

