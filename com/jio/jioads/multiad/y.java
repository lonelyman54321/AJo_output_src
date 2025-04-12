/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.d_0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.multiad.i_0;
import com.jio.jioads.multiad.z;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.c;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class y
implements NetworkTaskListener {
    public final /* synthetic */ z a;
    public final /* synthetic */ i_0 b;
    public final /* synthetic */ Context c;

    public y(z z5, i_0 i_02, Context context) {
        this.a = z5;
        this.b = i_02;
        this.c = context;
    }

    public final void onError(int n3, Object object, Map object2) {
        Object object3 = this.a;
        object = ((z)object3).F;
        if (object != null) {
            ((c)object).a();
        }
        object = null;
        ((z)object3).F = null;
        object2 = new StringBuilder();
        object3 = ((z)object3).o;
        if (object3 != null) {
            object = object3.P();
        }
        j_0.k((StringBuilder)object2, (String)object, ": status url responded with error for PGM node skipping it");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        this.b.a();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onSuccess(String var1_1, Map var2_2) {
        block42: {
            block38: {
                block39: {
                    block40: {
                        block41: {
                            var2_2 = this.a;
                            var3_3 /* !! */  = var2_2.F;
                            if (var3_3 /* !! */  != null) {
                                var3_3 /* !! */ .a();
                            }
                            var4_4 = null;
                            var2_2.F = null;
                            var5_5 = TextUtils.isEmpty((CharSequence)var1_1);
                            var6_6 = this.b;
                            if (var5_5) break block38;
                            Intrinsics.checkNotNull(var1_1);
                            var3_3 /* !! */  = new JSONObject((String)var1_1);
                            var7_7 = "instructions";
                            var8_8 = var3_3 /* !! */ .has((String)var7_7);
                            if (var8_8 == 0) break block39;
                            var3_3 /* !! */  = var3_3 /* !! */ .getJSONArray((String)var7_7);
                            var7_7 = "getJSONArray(...)";
                            Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , (String)var7_7);
                            var9_9 = var3_3 /* !! */ .length();
                            var8_8 = 0;
                            var10_10 = null;
                            if (var9_9 <= 0) ** GOTO lbl-1000
                            var3_3 /* !! */  = var3_3 /* !! */ .getJSONObject(0);
                            Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , "getJSONObject(...)");
                            var7_7 = "action";
                            var11_11 = var3_3 /* !! */ .has((String)var7_7);
                            if (var11_11 != 0) {
                                var3_3 /* !! */  = var3_3 /* !! */ .getString((String)var7_7);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var5_5 = false;
                                var3_3 /* !! */  = null;
                            }
                            var7_7 = new StringBuilder();
                            var12_12 = var2_2.o;
                            if (var12_12 != null) {
                                var12_12 = var12_12.P();
                            } else {
                                var11_11 = 0;
                                var12_12 = null;
                            }
                            var7_7.append((String)var12_12);
                            var12_12 = ": instruction PGM ";
                            var7_7.append((String)var12_12);
                            var7_7.append((String)var1_1);
                            Intrinsics.checkNotNullParameter(var7_7.toString(), "message");
                            var1_1 = JioAds.Companion;
                            var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var7_7 = JioAds$LogLevel.NONE;
                            if (var3_3 /* !! */  != null) {
                                var7_7 = Locale.getDefault();
                                var12_12 = "getDefault(...)";
                                Intrinsics.checkNotNullExpressionValue(var7_7, (String)var12_12);
                                var3_3 /* !! */  = var3_3 /* !! */ .toUpperCase((Locale)var7_7);
                                var7_7 = "this as java.lang.String).toUpperCase(locale)";
                                Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , (String)var7_7);
                            } else {
                                var5_5 = false;
                                var3_3 /* !! */  = null;
                            }
                            var13_13 = true;
                            if (var3_3 /* !! */  == null) ** GOTO lbl-1000
                            var9_9 = var3_3 /* !! */ .hashCode();
                            if (var9_9 == (var11_11 = 2175)) break block40;
                            var8_8 = 2640;
                            if (var9_9 == var8_8) break block41;
                            var8_8 = 1818912567;
                            if (var9_9 != var8_8 || !(var5_5 = var3_3 /* !! */ .equals(var7_7 = "NOACTION"))) ** GOTO lbl-1000
                            var10_10 = var2_2.d();
                            var9_9 = 0;
                            var12_12 = "pid";
                            var14_14 = "pid";
                            var15_15 = "pgm";
                            var3_3 /* !! */  = var2_2;
                            var2_2.e(0, (String)var10_10, (String)var12_12, var14_14, var15_15);
                            var3_3 /* !! */  = new StringBuilder();
                            var7_7 = var2_2.o;
                            if (var7_7 != null) {
                                var7_7 = var7_7.P();
                            } else {
                                var9_9 = 0;
                                var7_7 = null;
                            }
                            var10_10 = ": deliver pgm Ads";
                            d_0.a((StringBuilder)var3_3 /* !! */ , (String)var7_7, (String)var10_10, (JioAds$Companion)var1_1);
                            var3_3 /* !! */  = var2_2.o;
                            if (var3_3 /* !! */  != null) {
                                var3_3 /* !! */ .a(var13_13);
                            }
                            if ((var3_3 /* !! */  = var2_2.o) != null) {
                                var3_3 /* !! */  = var3_3 /* !! */ .K();
                            } else {
                                var5_5 = false;
                                var3_3 /* !! */  = null;
                            }
                            var7_7 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                            if (var3_3 /* !! */  == var7_7) {
                                var3_3 /* !! */  = var2_2.o;
                                var7_7 = "pgm_load_ad";
                                if (var3_3 /* !! */  != null && (var3_3 /* !! */  = var3_3 /* !! */ .z()) != null && (var5_5 = var3_3 /* !! */ .i0()) == var13_13) {
                                    var3_3 /* !! */  = new StringBuilder();
                                    var10_10 = var2_2.o;
                                    if (var10_10 != null) {
                                        var10_10 = var10_10.P();
                                    } else {
                                        var8_8 = 0;
                                        var10_10 = null;
                                    }
                                    var12_12 = ": pgm only available so pgm ad will be inserted during load ad";
                                    d_0.a((StringBuilder)var3_3 /* !! */ , (String)var10_10, (String)var12_12, (JioAds$Companion)var1_1);
                                } else {
                                    var3_3 /* !! */  = var2_2.o;
                                    if (var3_3 /* !! */  != null) {
                                        var3_3 /* !! */  = var3_3 /* !! */ .L();
                                    } else {
                                        var5_5 = false;
                                        var3_3 /* !! */  = null;
                                    }
                                    var10_10 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
                                    if (var3_3 /* !! */  == var10_10) {
                                        var3_3 /* !! */  = new StringBuilder();
                                        var10_10 = var2_2.o;
                                        if (var10_10 != null) {
                                            var10_10 = var10_10.P();
                                        } else {
                                            var8_8 = 0;
                                            var10_10 = null;
                                        }
                                        var12_12 = ": pgm infinite loop so giving pgm load ad";
                                        d_0.a((StringBuilder)var3_3 /* !! */ , (String)var10_10, (String)var12_12, (JioAds$Companion)var1_1);
                                    } else {
                                        var3_3 /* !! */  = new StringBuilder();
                                        var7_7 = var2_2.o;
                                        if (var7_7 != null) {
                                            var7_7 = var7_7.P();
                                        } else {
                                            var9_9 = 0;
                                            var7_7 = null;
                                        }
                                        var10_10 = ": mid-roll so adding placeholder for pgm";
                                        d_0.a((StringBuilder)var3_3 /* !! */ , (String)var7_7, (String)var10_10, (JioAds$Companion)var1_1);
                                        var7_7 = "pgm_add_placeholder";
                                    }
                                }
                                var2_2.h(null, null, (String)var7_7, null);
                            } else {
                                var6_6.a();
                                var2_2.t = var13_13;
                            }
                            break block42;
                        }
                        var7_7 = "SC";
                        var5_5 = var3_3 /* !! */ .equals(var7_7);
                        if (!var5_5) ** GOTO lbl-1000
                        var3_3 /* !! */  = new StringBuilder();
                        var7_7 = var2_2.o;
                        if (var7_7 != null) {
                            var4_4 = var7_7.P();
                        }
                        var7_7 = ": PGM ad status is SC so skipping PGM node";
                        d_0.a((StringBuilder)var3_3 /* !! */ , var4_4, (String)var7_7, (JioAds$Companion)var1_1);
                        var2_2.t = var13_13;
                        var6_6.a();
                        break block42;
                    }
                    var7_7 = "DC";
                    var5_5 = var3_3 /* !! */ .equals(var7_7);
                    if (var5_5) {
                        var3_3 /* !! */  = var2_2.o;
                        if (var3_3 /* !! */  != null) {
                            var3_3 /* !! */  = var3_3 /* !! */ .k0();
                        } else {
                            var5_5 = false;
                            var3_3 /* !! */  = null;
                        }
                        var7_7 = JioAdView$AdState.DESTROYED;
                        if (var3_3 /* !! */  == var7_7) {
                            return;
                        }
                        var3_3 /* !! */  = new StringBuilder();
                        var7_7 = var2_2.o;
                        if (var7_7 != null) {
                            var4_4 = var7_7.P();
                        }
                        var7_7 = ": PGM ad status is DC so deleting PGM node";
                        d_0.a((StringBuilder)var3_3 /* !! */ , var4_4, (String)var7_7, (JioAds$Companion)var1_1);
                        var1_1 = var2_2.o;
                        if (var1_1 != null) {
                            var1_1.a(false);
                        }
                        if ((var1_1 = var2_2.o) != null && (var10_10 = var1_1.P()) != null) {
                            var7_7 = this.c;
                            var11_11 = 0;
                            var12_12 = null;
                            var16_16 = var2_2.d;
                            var17_17 = true;
                            var4_4 = "pgm";
                            var3_3 /* !! */  = var2_2;
                            var2_2.g((Context)var7_7, (String)var10_10, null, var16_16, var17_17, var4_4);
                        }
                        var6_6.a();
                    } else lbl-1000:
                    // 4 sources

                    {
                        var3_3 /* !! */  = new StringBuilder();
                        var7_7 = var2_2.o;
                        if (var7_7 != null) {
                            var4_4 = var7_7.P();
                        }
                        var7_7 = ": PGM instruction json is null so skipping PGM node";
                        d_0.a((StringBuilder)var3_3 /* !! */ , var4_4, (String)var7_7, (JioAds$Companion)var1_1);
                        var2_2.t = var13_13;
                        var6_6.a();
                    }
                    break block42;
                }
                var1_1 = new StringBuilder();
                var2_2 = var2_2.o;
                if (var2_2 != null) {
                    var4_4 = var2_2.P();
                }
                var2_2 = ": status url array does not have instruction node for PGM node so skipping it";
                j_0.k((StringBuilder)var1_1, var4_4, (String)var2_2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var1_1 = JioAds$LogLevel.NONE;
                var6_6.a();
                break block42;
            }
            var1_1 = new StringBuilder();
            var2_2 = var2_2.o;
            if (var2_2 != null) {
                var4_4 = var2_2.P();
            }
            var2_2 = ": status url response is empty for PGM so skipping it";
            j_0.k((StringBuilder)var1_1, var4_4, (String)var2_2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var1_1 = JioAds$LogLevel.NONE;
            var6_6.a();
        }
    }
}

