/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.jio.jioads.multiad;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.multiad.A;
import com.jio.jioads.multiad.D;
import com.jio.jioads.multiad.H;
import com.jio.jioads.util.Utility;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from com.jio.jioads.multiad.E
 */
public final class e_0
implements A {
    public final /* synthetic */ H a;
    public final /* synthetic */ Activity b;

    public e_0(H h3, Activity activity) {
        this.a = h3;
        this.b = activity;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String var1_1) {
        block32: {
            block31: {
                block29: {
                    block28: {
                        block27: {
                            var2_2 = var1_1;
                            Intrinsics.checkNotNullParameter(var1_1, "jscript");
                            var3_8 = new Ref$ObjectRef();
                            var3_8.element = var1_1;
                            var4_9 = TextUtils.isEmpty((CharSequence)var1_1);
                            var5_10 = this.b;
                            var6_11 = this.a;
                            if (!var4_9) ** GOTO lbl59
                            var2_2 = new StringBuilder();
                            var7_12 = var6_11.f;
                            j_0.k((StringBuilder)var2_2, (String)var7_12, ": js file is empty so reading it from assets");
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var2_2 = JioAds$LogLevel.NONE;
                            var2_2 = var5_10.getAssets();
                            Intrinsics.checkNotNullExpressionValue(var2_2, "getAssets(...)");
                            Intrinsics.checkNotNullParameter(var2_2, "mgr");
                            var7_12 = "jio_js";
                            Intrinsics.checkNotNullParameter(var7_12, "fileName");
                            var8_13 = new StringBuilder();
                            var9_14 = false;
                            var10_15 /* !! */  = null;
                            try {
                                var11_16 = Intrinsics.areEqual(var7_12, var7_12);
                                if (!var11_16) break block27;
                                var7_12 = "TargetingValidator.js";
                                var2_2 = var2_2.open((String)var7_12);
                            }
                            catch (Throwable var2_3) {
                                var12_17 = null;
                                ** GOTO lbl51
                            }
                            catch (Exception v0) {
                                var11_16 = false;
                                var7_12 = null;
                                break block28;
                            }
lbl36:
                            // 2 sources

                            while (true) {
                                var7_12 = var2_2;
                                ** try [egrp 2[TRYBLOCK] [7, 6 : 188->209)] { 
lbl39:
                                // 1 sources

                                ** GOTO lbl-1000
                                break;
                            }
                        }
                        var7_12 = "OmSdkJs.js";
                        {
                            var2_2 = var2_2.open((String)var7_12);
                            ** continue;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var2_2 = new InputStreamReader((InputStream)var7_12);
                            var12_17 = new BufferedReader((Reader)var2_2);
                        }
                        try {
                            try {
                                var13_18 = var12_17.readLine();
                                var2_2 = new StringBuilder((String)var13_18);
                            }
                            catch (Exception v1) {
                                break block29;
                            }
lbl51:
                            // 2 sources

                            while (true) {
                                var7_12 = var10_15 /* !! */ ;
lbl53:
                                // 2 sources

                                while (true) {
                                    if (var12_17 != null) {
                                        var12_17.close();
                                    }
                                    if (var7_12 != null) {
                                        var7_12.close();
                                    }
                                    throw var2_6;
                                }
                                break;
                            }
lbl59:
                            // 2 sources

                            while (true) {
                                var4_9 = var5_10 instanceof Activity;
                                if (var4_9) {
                                    var2_2 = new D(var3_8, var6_11);
                                    var5_10.runOnUiThread((Runnable)var2_2);
                                }
                                return;
                            }
                            try {
                                while ((var8_13 = var12_17.readLine()) != null) {
                                    var14_19 = '\n';
                                    var2_2.append(var14_19);
                                    var2_2.append((String)var8_13);
                                }
                            }
                            catch (Exception v2) {
                                var8_13 = var2_2;
                                break block29;
                            }
                        }
                        catch (Throwable var2_4) {
                            ** continue;
                        }
                        var12_17.close();
                        if (var7_12 == null) break block32;
                        ** GOTO lbl121
lbl85:
                        // 1 sources

                        catch (Throwable var2_5) {
                            var12_17 = null;
lbl87:
                            // 2 sources

                            while (true) {
                                var10_15 /* !! */  = var7_12;
                                ** continue;
                                break;
                            }
                        }
lbl90:
                        // 1 sources

                        catch (Exception v3) {}
                    }
                    var12_17 = null;
                }
                try {
                    var13_18 = Utility.INSTANCE;
                    var15_20 = var6_11.a;
                    var16_21 = "";
                    var17_22 = d.a;
                    var2_2 = JioAdError$JioAdErrorType.ERROR_IN_JS_TARGETING;
                    var18_23 = var2_2.getErrorTitle();
                    var19_24 = "Error while reading Targeting-OM.js file";
                    var20_25 /* !! */  = p.t;
                    if (var20_25 /* !! */  != null) {
                        var10_15 /* !! */  = new a();
                    }
                    var20_25 /* !! */  = var10_15 /* !! */ ;
                    var21_26 = "CampaignQualifierHandler-readCampaignQualifierJS";
                    var9_14 = var6_11.b;
                    var22_27 = var9_14;
                    var10_15 /* !! */  = var6_11.a;
                    var23_28 = var10_15 /* !! */ .getPackageName();
                    var24_29 = var2_2.getErrorCode();
                    var13_18.logError((Context)var15_20, var16_21, var17_22, var18_23, var19_24, (a)var20_25 /* !! */ , var21_26, var22_27, var23_28, var24_29, false);
                    if (var12_17 == null) break block31;
                }
                catch (Throwable var2_7) {
                    ** continue;
                }
                var12_17.close();
            }
            if (var7_12 != null) {
                var2_2 = var8_13;
lbl121:
                // 2 sources

                var7_12.close();
            } else {
                var2_2 = var8_13;
            }
        }
        var2_2 = var2_2.toString();
        var7_12 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(var2_2, (String)var7_12);
        var3_8.element = var2_2;
        ** while (true)
    }
}

