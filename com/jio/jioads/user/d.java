/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.user;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.user.b;
import com.jio.jioads.user.g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class d
implements NetworkTaskListener {
    public final /* synthetic */ g a;
    public final /* synthetic */ b b;

    public d(g g3, b b2) {
        this.a = g3;
        this.b = b2;
    }

    public final void onError(int n3, Object object, Map object2) {
        String string2 = "Error while getting uid-->";
        object2 = new StringBuilder(string2);
        ((StringBuilder)object2).append(n3);
        n3 = 45;
        ((StringBuilder)object2).append((char)n3);
        ((StringBuilder)object2).append(object);
        Object object3 = ((StringBuilder)object2).toString();
        object = "message";
        Intrinsics.checkNotNullParameter(object3, (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.b;
        if (object3 != null) {
            object = JioAdError.Companion;
            object2 = JioAdError$JioAdErrorType.ERROR_FETCHING_UID;
            object.getClass();
            object = t_0.a((JioAdError$JioAdErrorType)((Object)object2));
            object2 = "Not able to fetch uid";
            ((JioAdError)object).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
            object3 = ((b)object3).a;
            ((g)object3).c();
        }
        this.a.getClass();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSuccess(String var1_1, Map var2_2) {
        block15: {
            block14: {
                var3_3 = 1;
                var4_4 = "subscriberId";
                var5_5 = "user";
                var6_6 = "sessionAttributes";
                var7_7 = "message";
                Intrinsics.checkNotNullParameter("Fill status reported successfully", var7_7);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var8_8 /* !! */  = JioAds$LogLevel.NONE;
                var8_8 /* !! */  = "Not able to fetch uid";
                var9_9 = this.b;
                var10_10 = this.a;
                if (var1_1 == null) break block15;
                var11_11 = var1_1.length() - var3_3;
                var12_12 = 0;
                var13_13 = null;
                var14_14 = false;
                while (true) {
                    var15_15 = 32;
                    if (var12_12 > var11_11) break;
                    var16_16 = var14_14 == false ? var12_12 : var11_11;
                    var16_16 = Intrinsics.compare(var1_1.charAt(var16_16), var15_15);
                    var16_16 = var16_16 <= 0 ? 1 : 0;
                    if (!var14_14) {
                        if (var16_16 == 0) {
                            var14_14 = true;
                            continue;
                        }
                        var12_12 += var3_3;
                        continue;
                    }
                    if (var16_16 == 0) break;
                    var11_11 += -1;
                }
                var11_11 += var3_3;
                var17_17 = var1_1.subSequence(var12_12, var11_11).toString();
                if ((var11_11 = (int)Intrinsics.areEqual(var17_17, var13_13 = "")) != 0) break block15;
                try {
                    var17_17 = new JSONObject((String)var1_1);
                    var18_18 = var17_17.isNull(var6_6);
                    if (var18_18) ** GOTO lbl123
                    var1_1 = var17_17.getJSONObject(var6_6);
                    var19_19 = var1_1.isNull(var5_5);
                    if (var19_19) ** GOTO lbl121
                    var20_20 = (var1_1 = var1_1.getJSONObject(var5_5)).isNull(var4_4);
                    if (var20_20 != 0) ** GOTO lbl119
                    var10_10.b = var1_1 = var1_1.getString(var4_4);
                    if (var1_1 != null) {
                        var21_21 = var1_1.length() - var3_3;
                        var20_20 = 0;
                        var5_5 = null;
                        var19_19 = false;
                        var6_6 = null;
                    }
                    ** GOTO lbl102
                }
                catch (Exception v0) {
                    break block14;
                }
                while (var20_20 <= var21_21) {
                    var11_11 = var19_19 == false ? var20_20 : var21_21;
                    {
                        var11_11 = var1_1.charAt(var11_11);
                        if ((var11_11 = Intrinsics.compare(var11_11, var15_15)) <= 0) {
                            var11_11 = 1;
                        } else {
                            var11_11 = 0;
                            var17_17 = null;
                        }
                        if (!var19_19) {
                            if (var11_11 == 0) {
                                var19_19 = true;
                                continue;
                            }
                            var20_20 += var3_3;
                            continue;
                        }
                        if (var11_11 == 0) break;
                        var21_21 += -1;
                    }
                }
                {
                    var1_1 = var1_1.subSequence(var20_20, var21_21 += var3_3);
                    var18_18 = Intrinsics.areEqual(var1_1 = var1_1.toString(), var13_13);
                    if (!var18_18) {
                        var1_1 = new StringBuilder();
                        var2_2 /* !! */  = "uid-->";
                        var1_1.append((String)var2_2 /* !! */ );
                        var2_2 /* !! */  = var10_10.b;
                        var1_1.append((String)var2_2 /* !! */ );
                        var1_1 = var1_1.toString();
                        Intrinsics.checkNotNullParameter(var1_1, var7_7);
                        var1_1 = JioAds.Companion;
                        var1_1 = var1_1.getInstance();
                        var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var1_1 = JioAds$LogLevel.NONE;
                        var1_1 = var10_10.b;
                        var2_2 /* !! */  = "subscriberId_key";
                        var4_4 = var10_10.a;
                        var5_5 = "common_prefs";
                        j_0.p((Context)var4_4, var5_5, 0, var1_1, (String)var2_2 /* !! */ );
                        if (var9_9 == null) return;
                        var1_1 = var10_10.b;
                        var18_18 = TextUtils.isEmpty((CharSequence)var1_1);
                        if (var18_18 != false) return;
                        var1_1 = var9_9.a;
                        var1_1.c();
                        return;
                    }
lbl102:
                    // 3 sources

                    var1_1 = "uid is NULL from ZLA";
                    Intrinsics.checkNotNullParameter(var1_1, var7_7);
                    var1_1 = JioAds.Companion;
                    var1_1 = var1_1.getInstance();
                    var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = JioAds$LogLevel.NONE;
                    if (var9_9 == null) return;
                    var1_1 = JioAdError.Companion;
                    var2_2 /* !! */  = JioAdError$JioAdErrorType.ERROR_FETCHING_UID;
                    var1_1.getClass();
                    var1_1 = t_0.a((JioAdError$JioAdErrorType)var2_2 /* !! */ );
                    var1_1.setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var8_8 /* !! */ );
                    var1_1 = var9_9.a;
                    var1_1.c();
                    return;
lbl119:
                    // 1 sources

                    var1_1 = new Exception();
                    throw var1_1;
lbl121:
                    // 1 sources

                    var1_1 = new Exception();
                    throw var1_1;
lbl123:
                    // 1 sources

                    var1_1 = new Exception();
                    throw var1_1;
                }
            }
            var10_10.getClass();
            if (var9_9 == null) return;
            var1_1 = JioAdError.Companion;
            var2_2 /* !! */  = JioAdError$JioAdErrorType.ERROR_FETCHING_UID;
            var1_1.getClass();
            t_0.a((JioAdError$JioAdErrorType)var2_2 /* !! */ ).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var8_8 /* !! */ );
            var1_1 = var9_9.a;
            var1_1.c();
            return;
        }
        Intrinsics.checkNotNullParameter("ZLA response is null", var7_7);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var1_1 = JioAds$LogLevel.NONE;
        if (var9_9 == null) return;
        var1_1 = JioAdError.Companion;
        var2_2 /* !! */  = JioAdError$JioAdErrorType.ERROR_FETCHING_UID;
        var1_1.getClass();
        t_0.a((JioAdError$JioAdErrorType)var2_2 /* !! */ ).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var8_8 /* !! */ );
        var1_1 = var9_9.a;
        var1_1.c();
        var10_10.getClass();
    }
}

