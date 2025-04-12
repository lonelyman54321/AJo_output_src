/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.text.TextUtils
 *  android.webkit.WebView
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.jio.jioads.multiad;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.appsflyer.internal.y;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.multiad.F;
import com.jio.jioads.multiad.q;
import com.jio.jioads.multiad.targeting.a;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class H {
    public final Activity a;
    public final boolean b;
    public boolean c;
    public JSONArray d;
    public JSONObject e;
    public String f;
    public boolean g;
    public boolean h;
    public ScheduledExecutorService i;
    public q j;
    public volatile WebView k;
    public boolean l;

    public H(boolean bl2, Activity activity) {
        String string2 = "mContext";
        Intrinsics.checkNotNullParameter(activity, string2);
        this.a = activity;
        this.b = bl2;
        bl2 = Utility.isNativeTargettingSupporting$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (!bl2) {
            this.h = bl2 = true;
            int n3 = 2;
            ci0_0 ci0_02 = new ci0_0(this, n3);
            activity.runOnUiThread((Runnable)ci0_02);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        this.g = false;
        this.h = false;
        this.f = null;
        try {
            Activity activity = this.a;
            int n3 = 1;
            y y5 = new y(this, n3);
            activity.runOnUiThread((Runnable)y5);
        }
        catch (Exception exception) {}
        this.k = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Object object, boolean bl2) {
        ExecutorService executorService;
        block5: {
            boolean bl3;
            block4: {
                bl3 = this.l;
                if (bl3) {
                    object = new StringBuilder();
                    String string2 = this.f;
                    String string3 = ": else case of sendResponse";
                    j_0.k((StringBuilder)object, string2, string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    return;
                }
                this.l = bl3 = true;
                try {
                    executorService = this.i;
                    if (executorService == null) break block4;
                    executorService.shutdownNow();
                }
                catch (Exception exception) {
                    break block5;
                }
            }
            bl3 = false;
            executorService = null;
            {
                this.i = null;
            }
        }
        executorService = Executors.newSingleThreadExecutor();
        F f5 = new F(bl2, this, object);
        if (executorService == null) return;
        executorService.submit(f5);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c(JSONArray var1_1, JSONObject var2_2) {
        block42: {
            block30: {
                var3_3 = this;
                var4_4 /* !! */  = var1_1;
                var5_5 /* !! */  = var2_2;
                var6_6 = 1;
                var7_7 = Utility.isNativeTargettingSupporting$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var8_8 /* !! */  = this.a;
                if (!var7_7) break block30;
                var9_9 = var2_2.toString();
                var10_10 = "toString(...)";
                Intrinsics.checkNotNullExpressionValue(var9_9, (String)var10_10);
                var11_11 = var1_1.toString();
                Intrinsics.checkNotNullExpressionValue(var11_11, (String)var10_10);
                var10_10 = "\"";
                var12_12 /* !! */  = "";
                var13_13 = 0;
                var14_14 = null;
                var9_9 = kotlin.text.b.n((String)var9_9, (String)var10_10, var12_12 /* !! */ , false);
                var11_11 = kotlin.text.b.n((String)var11_11, (String)var10_10, var12_12 /* !! */ , false);
                var15_15 = new StringBuilder("loadTargetingExpressionForBunch(). Server received expression: ");
                var15_15.append((String)var11_11);
                var15_15.append(" and publisher passed metaData= ");
                var15_15.append((String)var9_9);
                var9_9 = var15_15.toString();
                var11_11 = "message";
                Intrinsics.checkNotNullParameter(var9_9, (String)var11_11);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var9_9 = JioAds$LogLevel.NONE;
                new JSONObject();
                Intrinsics.checkNotNullParameter(var1_1, "customKeyValueExpressionList");
                Intrinsics.checkNotNullParameter(var2_2, "customKeyValues");
                var9_9 = new ArrayList();
                var16_16 = var1_1.length();
                for (var17_17 = 0; var17_17 < var16_16; var17_17 += var36_38) {
                    block29: {
                        block31: {
                            var18_18 /* !! */  = var4_4 /* !! */ .getJSONObject(var17_17);
                            var19_19 = var18_18 /* !! */ .optString("serverExp", var12_12 /* !! */ );
                            var20_20 = "optString(...)";
                            Intrinsics.checkNotNullExpressionValue(var19_19, (String)var20_20);
                            var21_21 = TextUtils.isEmpty((CharSequence)var19_19);
                            if (var21_21 != 0) break block31;
                            var20_20 = Pattern.compile("mdt\\('(.*?)',\\s*'(.*?)',\\s*'(.*?)'\\)").matcher((CharSequence)var19_19);
                            var14_14 = new ArrayList();
                            while (var22_22 = var20_20.find()) {
                                block37: {
                                    block33: {
                                        block32: {
                                            var23_23 = var20_20.group(var6_6);
                                            var24_25 /* !! */  = "group(...)";
                                            Intrinsics.checkNotNullExpressionValue(var23_23, (String)var24_25 /* !! */ );
                                            var23_23 = StringsKt.m0((CharSequence)var23_23).toString();
                                            var25_26 = var16_16;
                                            var4_4 /* !! */  = var20_20.group(2);
                                            Intrinsics.checkNotNullExpressionValue(var4_4 /* !! */ , (String)var24_25 /* !! */ );
                                            var4_4 /* !! */  = StringsKt.m0((CharSequence)var4_4 /* !! */ ).toString();
                                            var15_15 = var20_20.group(3);
                                            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var24_25 /* !! */ );
                                            var24_25 /* !! */  = StringsKt.m0((CharSequence)var15_15).toString();
                                            var26_27 = var20_20;
                                            var20_20 = "','";
                                            var15_15 = ui0_1.a(og_1.a("'", (String)var23_23, (String)var20_20, (String)var4_4 /* !! */ , (String)var20_20), (String)var24_25 /* !! */ , '\'');
                                            var21_21 = 0;
                                            var15_15 = kotlin.text.b.n((String)var15_15, (String)var10_10, var12_12 /* !! */ , false);
                                            var27_28 = var8_8 /* !! */ ;
                                            var28_30 = 41;
                                            var8_8 /* !! */  = oj_0.b((char)var28_30, "mdt(", (String)var15_15);
                                            var20_20 = "scat";
                                            var15_15 = xx_2.i(new String[]{"pcat", var20_20});
                                            var16_16 = (int)var15_15.contains(var23_23);
                                            if (var16_16 == 0) break block32;
                                            var29_31 = var11_11;
                                            ** GOTO lbl-1000
                                        }
                                        var15_15 = new String[]{","};
                                        var29_31 = var11_11;
                                        var30_32 = 6;
                                        var21_21 = 0;
                                        var20_20 = null;
                                        var4_4 /* !! */  = StringsKt.a0((CharSequence)var4_4 /* !! */ , (String[])var15_15, false, 0, var30_32);
                                        var16_16 = yx_2.o((Iterable)var4_4 /* !! */ , 10);
                                        var11_11 = new ArrayList(var16_16);
                                        var4_4 /* !! */  = var4_4 /* !! */ .iterator();
                                        while ((var16_16 = (int)var4_4 /* !! */ .hasNext()) != 0) {
                                            var15_15 = StringsKt.m0((String)var4_4 /* !! */ .next()).toString();
                                            var20_20 = Locale.getDefault();
                                            var31_33 = var4_4 /* !! */ ;
                                            Intrinsics.checkNotNullExpressionValue(var20_20, "getDefault(...)");
                                            var4_4 /* !! */  = var15_15.toUpperCase((Locale)var20_20);
                                            var15_15 = "this as java.lang.String).toUpperCase(locale)";
                                            Intrinsics.checkNotNullExpressionValue(var4_4 /* !! */ , (String)var15_15);
                                            var11_11.add(var4_4 /* !! */ );
                                            var4_4 /* !! */  = var31_33;
                                        }
                                        var32_34 = var2_2.length();
                                        var15_15 = "!=";
                                        if (var32_34 <= 0) break block33;
                                        var4_4 /* !! */  = var2_2.keys();
                                        Intrinsics.checkNotNullExpressionValue(var4_4 /* !! */ , "keys(...)");
                                        var21_21 = 0;
                                        var20_20 = null;
                                        var22_22 = false;
                                        var31_33 = null;
                                        block3: while (var33_35 = var4_4 /* !! */ .hasNext()) {
                                            block36: {
                                                block34: {
                                                    block35: {
                                                        var34_36 = var4_4 /* !! */ .next();
                                                        var35_37 = var4_4 /* !! */ ;
                                                        var4_4 /* !! */  = var34_36;
                                                        var4_4 /* !! */  = (String)var34_36;
                                                        Intrinsics.checkNotNull(var4_4 /* !! */ );
                                                        var36_38 = 1;
                                                        var33_35 = StringsKt.F((CharSequence)var4_4 /* !! */ , (CharSequence)var23_23, (boolean)var36_38);
                                                        if (!var33_35) break block34;
                                                        var36_38 = Intrinsics.areEqual(var24_25 /* !! */ , var15_15);
                                                        if (var36_38 == 0) break block35;
                                                        var3_3 = var5_5 /* !! */ .getString((String)var4_4 /* !! */ );
                                                        if (var3_3 == null) {
                                                            var3_3 = var12_12 /* !! */ ;
                                                        }
                                                        if ((var36_38 = (int)com.jio.jioads.multiad.targeting.a.a((String)var3_3, (ArrayList)var11_11)) == 0) ** GOTO lbl-1000
                                                    }
                                                    if ((var36_38 = (int)Intrinsics.areEqual(var24_25 /* !! */ , var3_3 = "==")) == 0) break block36;
                                                    var3_3 = var5_5 /* !! */ .getString((String)var4_4 /* !! */ );
                                                    if (var3_3 == null) {
                                                        var3_3 = var12_12 /* !! */ ;
                                                    }
                                                    if ((var36_38 = (int)com.jio.jioads.multiad.targeting.a.a((String)var3_3, (ArrayList)var11_11)) == 0) break block36;
                                                    ** GOTO lbl-1000
                                                }
                                                var36_38 = Intrinsics.areEqual(var24_25 /* !! */ , var15_15);
                                                if (var36_38 != 0) {
                                                    var36_38 = 1;
                                                    var21_21 += var36_38;
lbl130:
                                                    // 2 sources

                                                    while (true) {
                                                        var3_3 = this;
                                                        var4_4 /* !! */  = var35_37;
                                                        continue block3;
                                                        break;
                                                    }
                                                }
                                            }
                                            var22_22 = true;
                                            ** continue;
                                        }
                                        break block37;
                                    }
                                    var36_38 = Intrinsics.areEqual(var24_25 /* !! */ , var15_15);
                                    if (var36_38 != 0) ** GOTO lbl-1000
                                    var21_21 = 0;
                                    var20_20 = null;
                                    var22_22 = false;
                                    var31_33 = null;
                                }
                                if (!var22_22 && var21_21 > 0) lbl-1000:
                                // 5 sources

                                {
                                    var36_38 = 1;
                                } else {
                                    var36_38 = 0;
                                    var3_3 = null;
                                }
                                var3_3 = (boolean)var36_38;
                                var4_4 /* !! */  = new Pair(var8_8 /* !! */ , var3_3);
                                var14_14.add(var4_4 /* !! */ );
                                var3_3 = this;
                                var4_4 /* !! */  = var1_1;
                                var16_16 = var25_26;
                                var20_20 = var26_27;
                                var8_8 /* !! */  = var27_28;
                                var11_11 = var29_31;
                                var6_6 = 1;
                            }
                            var27_28 = var8_8 /* !! */ ;
                            var29_31 = var11_11;
                            var25_26 = var16_16;
                            var4_4 /* !! */  = " && ";
                            var3_3 = kotlin.text.b.n((String)var19_19, " and ", (String)var4_4 /* !! */ , false);
                            var8_8 /* !! */  = " || ";
                            var3_3 = kotlin.text.b.n((String)var3_3, " or ", (String)var8_8 /* !! */ , false);
                            var24_25 /* !! */  = " ";
                            var3_3 = kotlin.text.b.n((String)var3_3, (String)var24_25 /* !! */ , var12_12 /* !! */ , false);
                            var23_23 = var14_14.iterator();
                            while ((var30_32 = (int)var23_23.hasNext()) != 0) {
                                var11_11 = (Pair)var23_23.next();
                                var14_14 = (String)var11_11.a;
                                var11_11 = (Boolean)var11_11.b;
                                var30_32 = (int)var11_11.booleanValue();
                                var16_16 = 0;
                                var15_15 = null;
                                var14_14 = kotlin.text.b.n(kotlin.text.b.n((String)var14_14, (String)var10_10, var12_12 /* !! */ , false), (String)var24_25 /* !! */ , var12_12 /* !! */ , false);
                                var11_11 = var30_32 != 0 ? "true" : "false";
                                var3_3 = kotlin.text.b.n((String)var3_3, (String)var14_14, (String)var11_11, false);
                            }
                            var16_16 = 0;
                            var15_15 = null;
                            var23_23 = "&&";
                            var3_3 = kotlin.text.b.n((String)var3_3, (String)var23_23, (String)var4_4 /* !! */ , false);
                            var4_4 /* !! */  = "||";
                            var3_3 = StringsKt.m0(kotlin.text.b.n((String)var3_3, (String)var4_4 /* !! */ , (String)var8_8 /* !! */ , false)).toString();
                            var28_30 = 6;
                            var6_6 = (int)(var3_3 = StringsKt.a0((CharSequence)var3_3, var24_25 /* !! */  = new String[]{var24_25 /* !! */ }, false, 0, var28_30)).isEmpty();
                            if (var6_6 != 0) {
                                var6_6 = 0;
                                var24_25 /* !! */  = null;
lbl195:
                                // 4 sources

                                while (true) {
                                    var30_32 = 2;
                                    break block29;
                                    break;
                                }
                            }
                            var24_25 /* !! */  = (String)var3_3.get(0);
                            var6_6 = (int)Boolean.parseBoolean((String)var24_25 /* !! */ );
                            var28_30 = 1;
                            while (true) {
                                block41: {
                                    block40: {
                                        block39: {
                                            block38: {
                                                if (var28_30 >= (var30_32 = var3_3.size()) || (var30_32 = var3_3.size()) <= var28_30) ** GOTO lbl195
                                                var11_11 = var3_3.get(var28_30);
                                                var30_32 = (int)Intrinsics.areEqual(var11_11, var23_23);
                                                if (var30_32 == 0) break block38;
                                                var30_32 = var3_3.size();
                                                var13_13 = 1;
                                                var16_16 = var28_30 + 1;
                                                if (var30_32 <= var16_16) ** GOTO lbl195
                                                var11_11 = (String)var3_3.get(var16_16);
                                                var30_32 = (int)Boolean.parseBoolean((String)var11_11);
                                                if (var6_6 == 0 || var30_32 == 0) break block39;
                                                break block40;
                                            }
                                            var11_11 = var3_3.get(var28_30);
                                            var30_32 = (int)Intrinsics.areEqual(var11_11, var4_4 /* !! */ );
                                            if (var30_32 == 0) break block41;
                                            var30_32 = var3_3.size();
                                            var13_13 = 1;
                                            var16_16 = var28_30 + 1;
                                            if (var30_32 > var16_16) ** break;
                                            ** continue;
                                            var11_11 = (String)var3_3.get(var16_16);
                                            var30_32 = (int)Boolean.parseBoolean((String)var11_11);
                                            if (var6_6 != 0 || var30_32 != 0) break block40;
                                        }
                                        var6_6 = 0;
                                        var24_25 /* !! */  = null;
lbl229:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var6_6 = 1;
                                    ** continue;
                                    var30_32 = 2;
                                    var28_30 += var30_32;
                                    continue;
                                }
                                var30_32 = 2;
                                var13_13 = 1;
                                var28_30 += var13_13;
                            }
                        }
                        var27_28 = var8_8 /* !! */ ;
                        var29_31 = var11_11;
                        var25_26 = var16_16;
                        var30_32 = 2;
                        var6_6 = 1;
                    }
                    if (var6_6 != 0) {
                        var3_3 = var18_18 /* !! */ .optString("adId");
                        Intrinsics.checkNotNull(var3_3);
                        var32_34 = var3_3.length();
                        if (var32_34 > 0) {
                            var32_34 = 1;
                        } else {
                            var32_34 = 0;
                            var4_4 /* !! */  = null;
                        }
                        if (var32_34 != 0) {
                            var9_9.add(var3_3);
                        }
                    }
                    var36_38 = 1;
                    var3_3 = this;
                    var4_4 /* !! */  = var1_1;
                    var16_16 = var25_26;
                    var8_8 /* !! */  = var27_28;
                    var11_11 = var29_31;
                    var6_6 = 1;
                    var13_13 = 0;
                    var14_14 = null;
                }
                var27_28 = var8_8 /* !! */ ;
                var29_31 = var11_11;
                var3_3 = new StringBuilder();
                var4_4 /* !! */  = this;
                var5_5 /* !! */  = this.f;
                var3_3.append((String)var5_5 /* !! */ );
                var3_3.append(": loadTargetingExpressionForBunch:targetedAds ");
                var3_3.append(var9_9);
                var3_3 = var3_3.toString();
                var5_5 /* !! */  = var11_11;
                Intrinsics.checkNotNullParameter(var3_3, (String)var11_11);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var3_3 = JioAds$LogLevel.NONE;
                var36_38 = var9_9.size();
                if (var36_38 > 0) {
                    var36_38 = 1;
                    this.b(var9_9, (boolean)var36_38);
                } else {
                    var36_38 = 0;
                    var3_3 = null;
                    this.b(var9_9, false);
                    if (var8_8 /* !! */  != null) {
                        var10_10 = Utility.INSTANCE;
                        var12_12 /* !! */  = com.jio.jioads.cdnlogging.d.a;
                        var3_3 = JioAdError$JioAdErrorType.ERROR_IN_JS_TARGETING;
                        var14_14 = var3_3.getErrorTitle();
                        var5_5 /* !! */  = p.t;
                        if (var5_5 /* !! */  != null) {
                            var5_5 /* !! */  = new com.jio.jioads.cdnlogging.a();
                        } else {
                            var37_39 = false;
                            var5_5 /* !! */  = null;
                        }
                        var37_39 = var4_4 /* !! */ .b;
                        var19_19 = var37_39;
                        var20_20 = var27_28.getPackageName();
                        var38_40 = var3_3.getErrorCode();
                        var11_11 = "";
                        var15_15 = "Targeting expression match failed";
                        var18_18 /* !! */  = "CampaignQualifierHandler-loadTargetingExpressionForBunch";
                        var22_22 = false;
                        var31_33 = null;
                        var8_8 /* !! */  = var27_28;
                        var10_10.logError((Context)var27_28, (String)var11_11, (d)var12_12 /* !! */ , (String)var14_14, (String)var15_15, (com.jio.jioads.cdnlogging.a)var5_5 /* !! */ , (String)var18_18 /* !! */ , (Boolean)var19_19, (String)var20_20, var38_40, false);
                    }
                }
                break block42;
            }
            var4_4 /* !! */  = this;
            var27_29 = var8_8 /* !! */ ;
            var23_24 = var1_1;
            var6_6 = 1;
            var3_3 = new mw0_2(this, var6_6, var2_2, var1_1);
            var5_5 /* !! */  = var8_8 /* !! */ ;
            var8_8 /* !! */ .runOnUiThread((Runnable)var3_3);
        }
    }
}

