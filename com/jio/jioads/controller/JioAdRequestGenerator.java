/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 *  android.telephony.gsm.GsmCellLocation
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsLoader;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.controller.b;
import com.jio.jioads.multiad.I;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.utils.Constants$DynamicDisplaySize;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.utils.Constants$SDKVersion;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class JioAdRequestGenerator {
    private final Context context;
    private JioAdsLoader mJioAdsLoader;

    public JioAdRequestGenerator(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void adMetaDataToParams(LinkedHashMap linkedHashMap, Map map2) {
        if (map2 != null) {
            boolean bl2;
            Iterator iterator = map2.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                if (bl3) continue;
                String string3 = null;
                String string4 = "md_";
                bl3 = StringsKt.F(string2, string4, false);
                if (!bl3) {
                    string3 = (String)map2.get(string2);
                    if (string3 == null) continue;
                    string2 = string4.concat(string2);
                    linkedHashMap.put(string2, string3);
                    continue;
                }
                string3 = (String)map2.get(string2);
                if (string3 == null) continue;
                linkedHashMap.put(string2, string3);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void addApplicationInfoParams(Context object, LinkedHashMap linkedHashMap, String string2) {
        String string3;
        void var2_6;
        PackageInfo packageInfo;
        block13: {
            PackageManager packageManager;
            try {
                packageManager = object.getPackageManager();
            }
            catch (Exception exception) {
                return;
            }
            String string4 = object.getPackageName();
            String string5 = null;
            packageInfo = packageManager.getPackageInfo(string4, 0);
            string4 = "ai";
            String string6 = object.getPackageName();
            string5 = "getPackageName(...)";
            Intrinsics.checkNotNullExpressionValue(string6, string5);
            var2_6.put(string4, string6);
            if (string3 == null) break block13;
            boolean bl2 = kotlin.text.b.k(string3);
            if (bl2) break block13;
            String string7 = "aic";
            var2_6.put(string7, string3);
        }
        String string8 = "av";
        string3 = packageInfo.versionName;
        String string9 = "versionName";
        Intrinsics.checkNotNullExpressionValue(string3, string9);
        var2_6.put(string8, string3);
    }

    public static /* synthetic */ HashMap commonAdRequestParams$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(JioAdRequestGenerator jioAdRequestGenerator, LinkedHashMap linkedHashMap, Map map2, String string2, JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE, int n3, Object object) {
        int n4 = n3 & 4;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 8) != 0) {
            jioAdView$ORIENTATION_TYPE = null;
        }
        return jioAdRequestGenerator.commonAdRequestParams$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(linkedHashMap, map2, string2, jioAdView$ORIENTATION_TYPE);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final HashMap getAdRequestParams(String var1_1, HashMap var2_2, JioAdView$ORIENTATION_TYPE var3_3, String var4_4, JioAdView$AD_TYPE var5_5, List var6_6, Integer var7_7, Integer var8_8, Integer var9_9, Boolean var10_10, String var11_11, Integer var12_12, String var13_13, String var14_14, String var15_15) {
        block33: {
            block31: {
                block32: {
                    var16_16 = this;
                    var17_17 = var1_1;
                    var18_18 = var5_5;
                    var19_20 = var11_11;
                    var20_21 = var13_13;
                    var21_22 = var14_14;
                    var22_23 = var15_15;
                    var23_24 = "1";
                    var24_25 = new LinkedHashMap<Object, Object>();
                    var25_26 = "message";
                    if (var1_1 == null) ** GOTO lbl22
                    try {
                        var26_27 /* !! */  = this.mJioAdsLoader;
                        if (var26_27 /* !! */  != null) {
                            var26_27 /* !! */  = "vmi";
                            var24_25.put(var26_27 /* !! */ , var1_1);
                        } else {
                            var26_27 /* !! */  = "asi";
                            var24_25.put(var26_27 /* !! */ , var1_1);
                        }
lbl22:
                        // 3 sources

                        var26_27 /* !! */  = var16_16.mJioAdsLoader;
                        var27_28 = "";
                        if (var26_27 /* !! */  == null) break block31;
                        var28_29 = var26_27 /* !! */ .getContentVideoLength$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        cfr_temp_0 = var28_29 - (var30_30 = 0L);
                        var32_31 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var32_31 /* !! */  > 0) {
                            var26_27 /* !! */  = "cvl";
                            var33_32 = var16_16.mJioAdsLoader;
                            if (var33_32 != null) {
                                var28_29 = var33_32.getContentVideoLength$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var33_32 = var28_29;
                            } else {
                                var34_33 = 0;
                                var33_32 = null;
                            }
                            var33_32 = String.valueOf(var33_32);
                            var24_25.put(var26_27 /* !! */ , var33_32);
                        }
                        if ((var26_27 /* !! */  = var16_16.mJioAdsLoader) != null) {
                            var26_27 /* !! */  = var26_27 /* !! */ .getContentVideoCuePoint$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        } else {
                            var32_31 /* !! */  = 0;
                            var26_27 /* !! */  = null;
                        }
                        if (var26_27 /* !! */  == null || (var34_33 = var26_27 /* !! */ .size()) <= 0) break block31;
                        var26_27 /* !! */  = var26_27 /* !! */ .iterator();
                        var34_33 = 1;
                        var35_34 = var27_28;
                        break block32;
                    }
                    catch (Exception var18_19) {}
                    var19_20 = new StringBuilder();
                    var19_20.append((String)var17_17);
                    var19_20.append(": Exception in getAdRequestParams");
                    Intrinsics.checkNotNullParameter(var19_20.toString(), var25_26);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var17_17 = JioAds$LogLevel.NONE;
                    var17_17 = Utility.INSTANCE;
                    var17_17.printStacktrace(var18_19);
                    return var24_25;
                }
                while (var36_35 = var26_27 /* !! */ .hasNext()) {
                    var37_36 = var26_27 /* !! */ .next();
                    var37_36 = (Long)var37_36;
                    if (var34_33 != 0) {
                        var28_29 = var37_36.longValue();
                        var35_34 = String.valueOf(var28_29);
                        var34_33 = 0;
                        var33_32 = null;
                        continue;
                    }
                    var38_37 = new StringBuilder();
                    var38_37.append(var35_34);
                    var39_38 = '|';
                    var38_37.append(var39_38);
                    var40_39 = var37_36.longValue();
                    var38_37.append(var40_39);
                    var35_34 = var38_37.toString();
                }
                var26_27 /* !! */  = "cue";
                var24_25.put(var26_27 /* !! */ , var35_34);
            }
            var26_27 /* !! */  = "fn";
            var24_25.put(var26_27 /* !! */ , var23_24);
            var26_27 /* !! */  = JioAdView$AD_TYPE.INFEED;
            var38_37 = "bz";
            if (var18_18 != var26_27 /* !! */ ) break block33;
            var18_18 = Utility.INSTANCE;
            var19_20 = var16_16.context;
            var42_40 = var18_18.isDeviceTypeTablet((Context)var19_20);
            if (var42_40 == '\u0000' && (var43_41 = var18_18.getCurrentUIModeType((Context)(var19_20 = var16_16.context))) != (var42_40 = '\u0004')) {
                var18_18 = "320x50";
                var24_25.put(var38_37, var18_18);
            } else {
                var18_18 = "728x90";
                var24_25.put(var38_37, var18_18);
            }
            ** GOTO lbl124
        }
        var26_27 /* !! */  = JioAdView$AD_TYPE.CONTENT_STREAM;
        if (var18_18 != var26_27 /* !! */ ) ** GOTO lbl114
        var18_18 = "300x250";
        {
            var24_25.put(var38_37, var18_18);
            ** GOTO lbl124
lbl114:
            // 1 sources

            var26_27 /* !! */  = JioAdView$AD_TYPE.INSTREAM_VIDEO;
            if (var18_18 != var26_27 /* !! */ ) ** GOTO lbl120
            var18_18 = "video";
        }
        {
            var24_25.put(var38_37, var18_18);
            ** GOTO lbl124
lbl120:
            // 1 sources

            var26_27 /* !! */  = JioAdView$AD_TYPE.CUSTOM_NATIVE;
            if (var18_18 != var26_27 /* !! */  || var19_20 == null) ** GOTO lbl124
        }
        {
            var24_25.put(var38_37, var19_20);
lbl124:
            // 6 sources

            if (var6_6 != null && (var43_41 = (char)var6_6.isEmpty()) == '\u0000') {
                var18_18 = var6_6.iterator();
                while ((var42_40 = (char)var18_18.hasNext()) != '\u0000') {
                    var19_20 = var18_18.next();
                    var19_20 = (Constants$DynamicDisplaySize)var19_20;
                    var26_27 /* !! */  = new StringBuilder();
                    var26_27 /* !! */ .append(var27_28);
                    var19_20 = var19_20.getDynamicSize();
                    var26_27 /* !! */ .append((String)var19_20);
                    var42_40 = ',';
                    var26_27 /* !! */ .append(var42_40);
                    var27_28 = var26_27 /* !! */ .toString();
                }
                if (var27_28 != null) {
                    var18_18 = ",";
                    var38_37 = StringsKt.V(var27_28, (String)var18_18);
                } else {
                    var38_37 = null;
                }
                if (var38_37 != null) {
                    var18_18 = "sbz";
                    var24_25.put(var18_18, var38_37);
                }
            }
            if (var21_22 != null && (var43_41 = var14_14.length()) != '\u0000') {
                var18_18 = "xbz";
                var24_25.put(var18_18, var21_22);
            }
            if (var22_23 != null && (var43_41 = (char)TextUtils.isEmpty((CharSequence)var15_15)) == '\u0000') {
                var18_18 = "iaf";
                var24_25.put(var18_18, var22_23);
            }
            if (var10_10 != null && (var43_41 = (char)var10_10.booleanValue()) != '\u0000' || var10_10 == null && (var43_41 = (char)(var18_18 = Utility.INSTANCE).isSystemApp$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)(var19_20 = var16_16.context))) != '\u0000') {
                var18_18 = "pb";
                var24_25.put(var18_18, var23_24);
            }
            if (var7_7 != null && (var43_41 = var7_7.intValue()) > '\u0000') {
                var18_18 = "pmad";
                var19_20 = var7_7.toString();
                var24_25.put(var18_18, var19_20);
            }
            var43_41 = '\uffffffff';
            if (var9_9 == null || (var42_40 = var9_9.intValue()) == var43_41) ** GOTO lbl173
            var19_20 = "pmxd";
            var44_42 = var9_9 * 1000;
        }
        {
            var21_22 = String.valueOf(var44_42);
            var24_25.put(var19_20, var21_22);
lbl173:
            // 2 sources

            if (var8_8 == null || (var42_40 = var8_8.intValue()) == var43_41) ** GOTO lbl179
            var18_18 = "pmnd";
            var42_40 = var8_8 * 1000;
        }
        {
            var19_20 = String.valueOf((int)var42_40);
            var24_25.put(var18_18, var19_20);
lbl179:
            // 2 sources

            if (var12_12 != null) {
                var18_18 = "apz";
                var19_20 = var12_12.toString();
                var24_25.put(var18_18, var19_20);
            }
            if (var20_21 != null && (var43_41 = var13_13.length()) != '\u0000' && (var42_40 = (var18_18 = new JSONObject((String)var20_21)).length()) > '\u0000') {
                var19_20 = new StringBuilder();
                var19_20.append((String)var17_17);
                var20_21 = ": Eads Object: ";
                var19_20.append((String)var20_21);
                var19_20.append(var18_18);
                var19_20 = var19_20.toString();
                Intrinsics.checkNotNullParameter(var19_20, var25_26);
                var19_20 = JioAds.Companion;
                var20_21 = var19_20.getInstance();
                var20_21.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var20_21 = JioAds$LogLevel.NONE;
                var45_43 = var18_18.has((String)var17_17);
                if (var45_43) {
                    var20_21 = new StringBuilder();
                    var20_21.append((String)var17_17);
                    var21_22 = ": Eads for adspotId ";
                    var20_21.append(var21_22);
                    var20_21.append((String)var17_17);
                    var21_22 = " are : ";
                    var20_21.append(var21_22);
                    var21_22 = var18_18.optString((String)var17_17);
                    var20_21.append(var21_22);
                    var20_21 = var20_21.toString();
                    Intrinsics.checkNotNullParameter(var20_21, var25_26);
                    var19_20 = var19_20.getInstance();
                    var19_20.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var19_20 = "eads";
                    var18_18 = var18_18.optString((String)var17_17);
                    var18_18 = var18_18.toString();
                    var24_25.put(var19_20, var18_18);
                }
            }
            var18_18 = var2_2;
            var19_20 = var3_3;
            var20_21 = var4_4;
            var16_16.commonAdRequestParams$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var24_25, var2_2, var4_4, var3_3);
            return var24_25;
        }
    }

    public static /* synthetic */ HashMap getAdRequestParams$default(JioAdRequestGenerator jioAdRequestGenerator, String string2, HashMap hashMap, JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE, String string3, JioAdView$AD_TYPE jioAdView$AD_TYPE, List list, Integer n3, Integer n4, Integer n7, Boolean bl2, String string4, Integer n8, String string5, String string6, String string7, int n10, Object object) {
        int n14 = n10;
        int n15 = n10 & 0x800;
        Integer n16 = n15 != 0 ? null : n8;
        String string8 = (n14 &= 0x1000) != 0 ? null : string5;
        return jioAdRequestGenerator.getAdRequestParams(string2, hashMap, jioAdView$ORIENTATION_TYPE, string3, jioAdView$AD_TYPE, list, n3, n4, n7, bl2, string4, n16, string8, string6, string7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void getLocationParams(Context object, HashMap serializable) {
        Exception exception2;
        Object object2;
        block5: {
            int n3;
            CharSequence charSequence;
            Object object3;
            Object object4;
            object2 = "";
            if (object == null) return;
            try {
                object4 = Utility.INSTANCE;
                int n4 = ((Utility)object4).getCurrentUIModeType((Context)object);
                int n7 = 4;
                if (n4 == n7) return;
                object3 = "phone";
                object3 = object.getSystemService((String)object3);
                charSequence = "null cannot be cast to non-null type android.telephony.TelephonyManager";
                Intrinsics.checkNotNull(object3, (String)charSequence);
                object3 = (TelephonyManager)object3;
                charSequence = object3.getNetworkOperator();
                String string2 = object3.getSimOperator();
                String string3 = "no";
                serializable.put(string3, charSequence);
                charSequence = "so";
                serializable.put(charSequence, string2);
                charSequence = "android.permission.ACCESS_FINE_LOCATION";
                n3 = ((Utility)object4).isPermissionGranted((Context)object, (String)charSequence);
                if (n3 == 0) return;
            }
            catch (Exception exception2) {
                break block5;
            }
            object = object3.getCellLocation();
            int n8 = object instanceof GsmCellLocation;
            if (n8 != 0) {
                object = (GsmCellLocation)object;
            } else {
                n3 = 0;
                object = null;
            }
            if (object == null) return;
            n8 = object.getLac();
            n3 = object.getCid();
            if (n8 <= 0) return;
            if (n3 <= 0) return;
            object3 = "lac";
            charSequence = new StringBuilder((String)object2);
            ((StringBuilder)charSequence).append(n8);
            object4 = ((StringBuilder)charSequence).toString();
            serializable.put(object3, object4);
            object4 = "ce";
            object3 = new StringBuilder((String)object2);
            ((StringBuilder)object3).append(n3);
            object = ((StringBuilder)object3).toString();
            serializable.put(object4, object);
            return;
        }
        serializable = new StringBuilder("Exception while getting n/w operator: ");
        object2 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception2, (StringBuilder)serializable);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public static /* synthetic */ Map getRequestHeaders$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(JioAdRequestGenerator jioAdRequestGenerator, String string2, String string3, Context context, String string4, boolean bl2, int n3, Object object) {
        boolean bl3;
        if ((n3 &= 0x10) != 0) {
            bl2 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        return jioAdRequestGenerator.getRequestHeaders$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, string3, context, string4, bl3);
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void getlatnLonParams(Context object, HashMap object2) {
        block51: {
            int n3;
            Object[] objectArray;
            int n4 = 3;
            int n7 = 2;
            int n8 = 1;
            int n10 = 0;
            Object object3 = null;
            int n14 = 4;
            if (object != null) {
                objectArray = Utility.INSTANCE;
                n3 = objectArray.getCurrentUIModeType((Context)object);
                if (n3 == n14) break block51;
            }
            n3 = 0;
            objectArray = null;
            String string2 = "gts";
            if (object != null) {
                Object object4 = "context";
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object4 = "common_prefs";
                SharedPreferences sharedPreferences2 = j_0.o(object, (String)object4);
                object4 = "lat";
                long l2 = 0L;
                long l3 = sharedPreferences2.getLong((String)object4, l2);
                double d2 = Double.longBitsToDouble(l3);
                object4 = d2;
                Object object5 = "lon";
                l3 = sharedPreferences2.getLong((String)object5, l2);
                d2 = Double.longBitsToDouble(l3);
                object5 = d2;
                Object object6 = "accu";
                float f5 = sharedPreferences2.getFloat((String)object6, 0.0f);
                object6 = Float.valueOf(f5);
                l2 = sharedPreferences2.getLong(string2, l2);
                Long l4 = l2;
                String string3 = "provider";
                String string4 = sharedPreferences2.getString(string3, null);
                n3 = 5;
                objectArray = new Object[n3];
                objectArray[0] = object4;
                objectArray[n8] = object5;
                objectArray[n7] = object6;
                objectArray[n4] = l4;
                objectArray[n14] = string4;
            }
            if (objectArray != null) {
                String string5;
                block52: {
                    int n15 = objectArray.length;
                    if (n15 < n14) break block51;
                    Utility utility = objectArray[0];
                    Object object7 = objectArray[n8];
                    Object object8 = objectArray[n7];
                    Utility utility2 = objectArray[n4];
                    object3 = String.valueOf(utility);
                    n10 = ((String)object3).length();
                    if (n10 <= 0) break block52;
                    double d5 = 0.0;
                    objectArray = d5;
                    n3 = (int)(Intrinsics.areEqual(utility, objectArray) ? 1 : 0);
                    if (n3 != 0) break block52;
                    objectArray = d5;
                    n3 = (int)(Intrinsics.areEqual(object7, objectArray) ? 1 : 0);
                    if (n3 != 0) break block52;
                    objectArray = Float.valueOf(0.0f);
                    n3 = (int)(Intrinsics.areEqual(object8, objectArray) ? 1 : 0);
                    if (n3 != 0) break block52;
                    object3 = d5;
                    n10 = (int)(Intrinsics.areEqual(utility2, object3) ? 1 : 0);
                    if (n10 != 0) break block52;
                    object3 = "la";
                    String string6 = String.valueOf(utility);
                    string5.put(object3, string6);
                    String string7 = "lo";
                    object7 = String.valueOf(object7);
                    string5.put(string7, object7);
                    String string8 = "acc";
                    object8 = String.valueOf(object8);
                    string5.put(string8, object8);
                    String string9 = String.valueOf(utility2);
                    string5.put(string2, string9);
                    return;
                }
                String string10 = "location data is not available";
                string5 = "message";
                Intrinsics.checkNotNullParameter(string10, string5);
                JioAds$Companion jioAds$Companion = JioAds.Companion;
                JioAds jioAds = jioAds$Companion.getInstance();
                jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            }
        }
        return;
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final HashMap commonAdRequestParams$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(LinkedHashMap var1_1, Map var2_2, String var3_3, JioAdView$ORIENTATION_TYPE var4_4) {
        block50: {
            var5_5 = this;
            var6_6 = var1_1;
            var7_7 = var4_4;
            var8_9 = "gn";
            var9_10 = "ci";
            var10_11 /* !! */  = "co";
            var11_12 /* !! */  = "pc";
            var12_13 /* !! */  = "st";
            var13_14 = "common_prefs";
            var14_15 = "context";
            var15_16 = "os";
            var16_17 = "vr";
            var17_18 = "message";
            var18_19 = "";
            var19_20 = "Publisher Requested orientation:: ";
            var7_7 = "actual device width :: ";
            var20_21 = "actual device orientation:: ";
            var21_22 = "mccmnc: ";
            var22_23 = "actual device height:: ";
            var23_24 /* !! */  = "params";
            Intrinsics.checkNotNullParameter(var1_1, (String)var23_24 /* !! */ );
            var23_24 /* !! */  = Constants$SDKVersion.Companion;
            var24_25 /* !! */  = var7_7;
            var7_7 = var23_24 /* !! */ .getLIBRARY_VERSION();
            var1_1.put(var16_17, var7_7);
            var7_7 = "android";
            var1_1.put(var15_16, var7_7);
            var7_7 = this.context;
            Intrinsics.checkNotNullParameter(var7_7, var14_15);
            var25_26 = null;
            var26_27 = var15_16;
            var15_16 = "advid";
            var27_28 = var8_9;
            var28_29 = 0;
            var8_9 = null;
            {
                catch (Exception var7_8) {
                    break block50;
                }
                try {
                    var7_7 = j_0.d((Context)var7_7, (String)var13_14, 0, var18_19, var15_16);
                    var8_9 = "null cannot be cast to non-null type kotlin.String";
                    Intrinsics.checkNotNull(var7_7, (String)var8_9);
                    var7_7 = (String)var7_7;
                }
                catch (Exception v0) {
                    var29_30 = 0;
                    var7_7 = null;
                }
                {
                    var8_9 = var5_5.context;
                    Intrinsics.checkNotNullParameter(var8_9, var14_15);
                    var30_31 = 4;
                    var15_16 = "limit-tracking";
                    var31_32 = var18_19;
                }
                try {
                    var18_19 = Boolean.FALSE;
                    var8_9 = j_0.d((Context)var8_9, (String)var13_14, var30_31, var18_19, var15_16);
                    var13_14 = "null cannot be cast to non-null type kotlin.Boolean";
                    Intrinsics.checkNotNull(var8_9, (String)var13_14);
                    var8_9 = (Boolean)var8_9;
                    var28_29 = (int)var8_9.booleanValue();
                }
                catch (Exception v1) {
                    var28_29 = 0;
                    var8_9 = null;
                }
                var13_14 = "lt";
                var15_16 = "1";
                if (var28_29 == 0 && var7_7 != null && (var28_29 = var7_7.length()) != 0) {
                    var8_9 = "ifa";
                    var6_6.put(var8_9, var7_7);
                    var7_7 = "0";
                    var6_6.put(var13_14, var7_7);
                } else {
                    var6_6.put(var13_14, var15_16);
                }
                var7_7 = Utility.INSTANCE;
                var8_9 = var5_5.context;
                var7_7 = var7_7.getUidFromPreferences((Context)var8_9);
                var8_9 = JioAds.Companion;
                var13_14 = var8_9.getInstance();
                var32_33 = var13_14.isUidServiceDisabled();
                if (var32_33 == '\u0000' && var7_7 != null && (var32_33 = var7_7.length()) != '\u0000') {
                    var13_14 = "uid";
                    var6_6.put(var13_14, var7_7);
                }
                var7_7 = "trq";
                var33_34 = System.currentTimeMillis();
                var13_14 = String.valueOf(var33_34);
                var6_6.put(var7_7, var13_14);
                var7_7 = var5_5.context;
                if (var7_7 != null) {
                    var13_14 = var3_3;
                    var5_5.addApplicationInfoParams((Context)var7_7, var6_6, var3_3);
                }
                var7_7 = var23_24 /* !! */ .getLIBRARY_VERSION();
                var6_6.put(var16_17, var7_7);
                var7_7 = var5_5.context;
                var7_7 = var5_5.getSimOperator((Context)var7_7);
                var23_24 /* !! */  = new StringBuilder((String)var21_22);
                var23_24 /* !! */ .append((String)var7_7);
                var23_24 /* !! */  = var23_24 /* !! */ .toString();
                Intrinsics.checkNotNullParameter(var23_24 /* !! */ , var17_18);
                var23_24 /* !! */  = var8_9.getInstance();
                var23_24 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var23_24 /* !! */  = JioAds$LogLevel.NONE;
                var35_35 = 2;
                if (var7_7 != null && (var36_36 = var7_7.length()) != 0) {
                    var36_36 = 3;
                    var28_29 = 0;
                    var8_9 = null;
                    var13_14 = var7_7.substring(0, var36_36);
                    var8_9 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                    Intrinsics.checkNotNullExpressionValue(var13_14, (String)var8_9);
                    var7_7 = var7_7.substring(var36_36);
                    var21_22 = "this as java.lang.String).substring(startIndex)";
                    Intrinsics.checkNotNullExpressionValue(var7_7, (String)var21_22);
                    var36_36 = var7_7.length();
                    if (var36_36 == var35_35) {
                        var21_22 = StringCompanionObject.INSTANCE;
                        var21_22 = Locale.getDefault();
                        var8_9 = "%03d";
                        var29_30 = Integer.parseInt((String)var7_7);
                        var7_7 = var29_30;
                        var37_37 = 1;
                        var18_19 = new Object[var37_37];
                        var18_19[0] = var7_7;
                        var7_7 = Arrays.copyOf(var18_19, var37_37);
                        var7_7 = String.format((Locale)var21_22, (String)var8_9, (Object[])var7_7);
                        var21_22 = "format(locale, format, *args)";
                        Intrinsics.checkNotNullExpressionValue(var7_7, (String)var21_22);
                    }
                    var21_22 = "cc";
                    var6_6.put(var21_22, var13_14);
                    var21_22 = "nc";
                    var6_6.put(var21_22, var7_7);
                }
                try {
                    var7_7 = var5_5.context;
                    if (var7_7 != null && (var7_7 = var7_7.getResources()) != null && (var7_7 = var7_7.getConfiguration()) != null) {
                        var7_7 = var7_7.locale;
                    } else {
                        var29_30 = 0;
                        var7_7 = null;
                    }
                    var21_22 = "lc";
                    var8_9 = new StringBuilder();
                    if (var7_7 != null) {
                        var13_14 = var7_7.getISO3Language();
                    } else {
                        var32_33 = '\u0000';
                        var13_14 = null;
                    }
                    var8_9.append((String)var13_14);
                    var32_33 = '_';
                    var8_9.append(var32_33);
                    if (var7_7 != null) {
                        var7_7 = var7_7.getCountry();
                    } else {
                        var29_30 = 0;
                        var7_7 = null;
                    }
                    var8_9.append((String)var7_7);
                    var7_7 = var8_9.toString();
                    var6_6.put(var21_22, var7_7);
                    ** GOTO lbl181
                }
                catch (Exception v2) {}
                var7_7 = "Could not fetch locale";
                {
                    Intrinsics.checkNotNullParameter(var7_7, var17_18);
                    var7_7 = JioAds.Companion;
                    var7_7 = var7_7.getInstance();
                    var7_7.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var7_7 = JioAds$LogLevel.NONE;
lbl181:
                    // 2 sources

                    var7_7 = var5_5.context;
                    var5_5.getlatnLonParams((Context)var7_7, var6_6);
                    var7_7 = var6_6.get(var12_13 /* !! */ );
                    var7_7 = (String)var7_7;
                    if (var7_7 != null && (var29_30 = var7_7.length()) != 0) {
                        var7_7 = "md_st";
                        var21_22 = var6_6.get(var12_13 /* !! */ );
                        var21_22 = (String)var21_22;
                        Intrinsics.checkNotNull(var21_22);
                        var6_6.put(var7_7, var21_22);
                    }
                    var7_7 = var6_6.get(var11_12 /* !! */ );
                    if ((var7_7 = (String)var7_7) != null && (var29_30 = var7_7.length()) != 0) {
                        var7_7 = "md_pc";
                        var21_22 = var6_6.get(var11_12 /* !! */ );
                        var21_22 = (String)var21_22;
                        Intrinsics.checkNotNull(var21_22);
                        var6_6.put(var7_7, var21_22);
                    }
                    var7_7 = var6_6.get(var10_11 /* !! */ );
                    if ((var7_7 = (String)var7_7) != null && (var29_30 = var7_7.length()) != 0) {
                        var7_7 = "md_co";
                        var21_22 = var6_6.get(var10_11 /* !! */ );
                        var21_22 = (String)var21_22;
                        Intrinsics.checkNotNull(var21_22);
                        var6_6.put(var7_7, var21_22);
                    }
                    var7_7 = var6_6.get(var9_10);
                    if ((var7_7 = (String)var7_7) != null && (var29_30 = var7_7.length()) != 0) {
                        var7_7 = "md_ci";
                        var21_22 = var6_6.get(var9_10);
                        var21_22 = (String)var21_22;
                        Intrinsics.checkNotNull(var21_22);
                        var6_6.put(var7_7, var21_22);
                    }
                    var7_7 = var27_28;
                    var21_22 = var6_6.get(var27_28);
                    if ((var21_22 = (String)var21_22) != null && (var36_36 = var21_22.length()) != 0) {
                        var21_22 = "md_gn";
                        var7_7 = var6_6.get(var27_28);
                        var7_7 = (String)var7_7;
                        Intrinsics.checkNotNull(var7_7);
                        var6_6.put(var21_22, var7_7);
                    }
                    var7_7 = JioAds.Companion;
                    var21_22 = var7_7.getInstance();
                    var36_36 = (int)var21_22.isChromiumDependencyPresent();
                    var8_9 = "ua";
                    if (var36_36 == 0) {
                        var7_7 = Utility.INSTANCE;
                        var21_22 = var5_5.context;
                        if ((var7_7 = var7_7.getUserAgent((Context)var21_22)) != null) {
                            var6_6.put(var8_9, var7_7);
                        }
                        while (true) {
                            var21_22 = var31_32;
                            break;
                        }
                    } else {
                        var7_7 = var7_7.getInstance();
                        if ((var7_7 = var7_7.getCustomUserAgent()) == null || (var36_36 = var7_7.length()) == 0) ** continue;
                        var21_22 = var31_32;
                        var38_38 = Intrinsics.areEqual(var7_7, var31_32);
                        if (!var38_38) {
                            var6_6.put(var8_9, var7_7);
                        }
                    }
                    var7_7 = Build.MODEL;
                    var8_9 = "MODEL";
                    Intrinsics.checkNotNullExpressionValue(var7_7, (String)var8_9);
                    var8_9 = " ";
                    var38_38 = false;
                    var9_10 = null;
                    var7_7 = kotlin.text.b.n((String)var7_7, (String)var8_9, (String)var21_22, false);
                    var28_29 = var7_7.length();
                    if (var28_29 > 0) {
                        var8_9 = "mn";
                        var6_6.put(var8_9, var7_7);
                        var8_9 = "md_dvm";
                        var6_6.put(var8_9, var7_7);
                    }
                    if ((var7_7 = Build.BRAND) != null && (var28_29 = var7_7.length()) != 0) {
                        var8_9 = "br";
                        Intrinsics.checkNotNull(var7_7);
                        var6_6.put(var8_9, var7_7);
                        var8_9 = "md_dvb";
                        var6_6.put(var8_9, var7_7);
                    }
                    var7_7 = var26_27;
                    var6_6.put(var26_27, var15_16);
                    var7_7 = "osv";
                    var8_9 = new StringBuilder();
                    var9_10 = Build.VERSION.RELEASE;
                    var8_9.append((String)var9_10);
                    var8_9.append((String)var21_22);
                    var8_9 = var8_9.toString();
                    var6_6.put(var7_7, var8_9);
                    var7_7 = "md_osv";
                    var8_9 = new StringBuilder();
                    var8_9.append((String)var9_10);
                    var8_9.append((String)var21_22);
                    var8_9 = var8_9.toString();
                    var6_6.put(var7_7, var8_9);
                    var7_7 = Resources.getSystem();
                    var7_7 = var7_7.getDisplayMetrics();
                    var28_29 = var7_7.widthPixels;
                    var29_30 = var7_7.heightPixels;
                    var10_11 /* !! */  = var24_25 /* !! */ ;
                    var9_10 = new StringBuilder((String)var24_25 /* !! */ );
                    var9_10.append(var28_29);
                    var9_10 = var9_10.toString();
                    j.c((String)var9_10);
                    var10_11 /* !! */  = var22_23;
                    var9_10 = new StringBuilder(var22_23);
                    var9_10.append(var29_30);
                    var9_10 = var9_10.toString();
                    j.c((String)var9_10);
                    var10_11 /* !! */  = var20_21;
                    var9_10 = new StringBuilder(var20_21);
                    var10_11 /* !! */  = var5_5.context;
                    if (var10_11 /* !! */  != null && (var10_11 /* !! */  = var10_11 /* !! */ .getResources()) != null && (var10_11 /* !! */  = var10_11 /* !! */ .getConfiguration()) != null) {
                        var39_39 = var10_11 /* !! */ .orientation;
                        var25_26 = var39_39;
                    }
                    var10_11 /* !! */  = var25_26;
                    var9_10.append(var25_26);
                    var9_10 = var9_10.toString();
                    j.c((String)var9_10);
                    var9_10 = "sh";
                    var10_11 /* !! */  = "sw";
                    var11_12 /* !! */  = var4_4;
                    if (var4_4 == null) ** GOTO lbl386
                    var13_14 = var19_20;
                    var12_13 /* !! */  = new StringBuilder(var19_20);
                    var12_13 /* !! */ .append((Object)var4_4);
                    var12_13 /* !! */  = var12_13 /* !! */ .toString();
                    j.a(var12_13 /* !! */ );
                    var12_13 /* !! */  = JioAdView$ORIENTATION_TYPE.LANDSCAPE;
                }
            }
            {
                if (var4_4 != var12_13 /* !! */  || (var12_13 /* !! */  = var5_5.context) != null && (var12_13 /* !! */  = var12_13 /* !! */ .getResources()) != null && (var12_13 /* !! */  = var12_13 /* !! */ .getConfiguration()) != null && (var40_40 = var12_13 /* !! */ .orientation) == var35_35) ** GOTO lbl-1000
                var23_24 /* !! */  = "Publisher Requested orientation is landscape but device orientation is portrait so changing width and height";
                j.a((String)var23_24 /* !! */ );
                var23_24 /* !! */  = new StringBuilder();
                var23_24 /* !! */ .append(var29_30);
                var23_24 /* !! */ .append((String)var21_22);
                var7_7 = var23_24 /* !! */ .toString();
                var6_6.put(var10_11 /* !! */ , var7_7);
                var7_7 = new StringBuilder();
                var7_7.append(var28_29);
                var7_7.append((String)var21_22);
                var7_7 = var7_7.toString();
                var6_6.put(var9_10, var7_7);
                ** GOTO lbl402
            }
lbl-1000:
            // 1 sources

            {
                block51: {
                    var23_24 /* !! */  = JioAdView$ORIENTATION_TYPE.PORTRAIT;
                    if (var11_12 /* !! */  == var23_24 /* !! */  && ((var23_24 /* !! */  = var5_5.context) == null || (var23_24 /* !! */  = var23_24 /* !! */ .getResources()) == null || (var23_24 /* !! */  = var23_24 /* !! */ .getConfiguration()) == null || (var35_35 = var23_24 /* !! */ .orientation) != (var40_40 = 1))) {
                        var23_24 /* !! */  = "Publisher Requested orientation is portrait but device orientation is landscape so changing width and height";
                        j.a((String)var23_24 /* !! */ );
                        var23_24 /* !! */  = new StringBuilder();
                        var23_24 /* !! */ .append(var29_30);
                        var23_24 /* !! */ .append((String)var21_22);
                        var7_7 = var23_24 /* !! */ .toString();
                        var6_6.put(var10_11 /* !! */ , var7_7);
                        var7_7 = new StringBuilder();
                        var7_7.append(var28_29);
                        var7_7.append((String)var21_22);
                        var7_7 = var7_7.toString();
                        var6_6.put(var9_10, var7_7);
                        break block51;
                    } else {
                        var23_24 /* !! */  = new StringBuilder();
                        var23_24 /* !! */ .append(var28_29);
                        var23_24 /* !! */ .append((String)var21_22);
                        var23_24 /* !! */  = var23_24 /* !! */ .toString();
                        var6_6.put(var10_11 /* !! */ , var23_24 /* !! */ );
                        var23_24 /* !! */  = new StringBuilder();
                        var23_24 /* !! */ .append(var29_30);
                        var23_24 /* !! */ .append((String)var21_22);
                        var7_7 = var23_24 /* !! */ .toString();
                        var6_6.put(var9_10, var7_7);
                    }
                    break block51;
lbl386:
                    // 1 sources

                    var23_24 /* !! */  = new StringBuilder();
                    var23_24 /* !! */ .append(var28_29);
                    var23_24 /* !! */ .append((String)var21_22);
                    var23_24 /* !! */  = var23_24 /* !! */ .toString();
                    var6_6.put(var10_11 /* !! */ , var23_24 /* !! */ );
                    var23_24 /* !! */  = new StringBuilder();
                    var23_24 /* !! */ .append(var29_30);
                    var23_24 /* !! */ .append((String)var21_22);
                    var7_7 = var23_24 /* !! */ .toString();
                    var6_6.put(var9_10, var7_7);
                }
                var7_7 = Utility.INSTANCE;
                var23_24 /* !! */  = var5_5.context;
                var35_35 = var7_7.getCurrentUIModeType((Context)var23_24 /* !! */ );
                var21_22 = "dt";
                var28_29 = 1;
                if (var35_35 != var28_29) {
                    if (var35_35 != var30_31) {
                        var6_6.put(var21_22, var15_16);
                    } else {
                        var23_24 /* !! */  = "4";
                        var6_6.put(var21_22, var23_24 /* !! */ );
                    }
                } else {
                    var23_24 /* !! */  = var5_5.context;
                    var35_35 = (int)var7_7.isDeviceTypeTablet((Context)var23_24 /* !! */ );
                    if (var35_35 != 0) {
                        var23_24 /* !! */  = "2";
                        var6_6.put(var21_22, var23_24 /* !! */ );
                    } else {
                        var6_6.put(var21_22, var15_16);
                    }
                }
                var23_24 /* !! */  = var5_5.context;
                var7_7 = var7_7.getNetworkConnectionType((Context)var23_24 /* !! */ );
                if (var7_7 != null) {
                    var23_24 /* !! */  = "ap";
                    var6_6.put(var23_24 /* !! */ , var7_7);
                    var23_24 /* !! */  = "md_nt";
                    var6_6.put(var23_24 /* !! */ , var7_7);
                }
                var7_7 = var5_5.context;
                var5_5.getLocationParams((Context)var7_7, var6_6);
                var7_7 = var5_5.context;
                if (var7_7 != null && (var7_7 = Utility.getSimSerialNumber((Context)var7_7)) != null) {
                    var23_24 /* !! */  = "sn";
                    var6_6.put(var23_24 /* !! */ , var7_7);
                    var23_24 /* !! */  = "md_srid";
                    var6_6.put(var23_24 /* !! */ , var7_7);
                }
                var7_7 = "tz";
                var23_24 /* !! */  = TimeZone.getDefault();
                var23_24 /* !! */  = var23_24 /* !! */ .getDisplayName();
                var21_22 = "getDisplayName(...)";
                Intrinsics.checkNotNullExpressionValue(var23_24 /* !! */ , (String)var21_22);
                var6_6.put(var7_7, var23_24 /* !! */ );
                var7_7 = "md_hr";
                var23_24 /* !! */  = Calendar.getInstance();
                var36_36 = 11;
                var35_35 = var23_24 /* !! */ .get(var36_36);
                var23_24 /* !! */  = String.valueOf(var35_35);
                var6_6.put(var7_7, var23_24 /* !! */ );
                var7_7 = "md_min";
                var23_24 /* !! */  = Calendar.getInstance();
                var36_36 = 12;
                var35_35 = var23_24 /* !! */ .get(var36_36);
                var23_24 /* !! */  = String.valueOf(var35_35);
                var6_6.put(var7_7, var23_24 /* !! */ );
                this.adMetaDataToParams(var1_1, var2_2);
                var7_7 = "ao";
                if (var11_12 /* !! */  == null) ** GOTO lbl482
                var23_24 /* !! */  = JioAdView$ORIENTATION_TYPE.LANDSCAPE;
                if (var11_12 /* !! */  != var23_24 /* !! */ ) ** GOTO lbl476
                var23_24 /* !! */  = "l";
            }
            {
                var6_6.put(var7_7, var23_24 /* !! */ );
                return var6_6;
lbl476:
                // 1 sources

                var23_24 /* !! */  = JioAdView$ORIENTATION_TYPE.PORTRAIT;
                if (var11_12 /* !! */  != var23_24 /* !! */ ) return var6_6;
                var23_24 /* !! */  = "p";
            }
            {
                var6_6.put(var7_7, var23_24 /* !! */ );
                return var6_6;
lbl482:
                // 1 sources

                var23_24 /* !! */  = var5_5.context;
                var23_24 /* !! */  = var5_5.getDeviceOrientation((Context)var23_24 /* !! */ );
                var6_6.put(var7_7, var23_24 /* !! */ );
                return var6_6;
            }
        }
        Intrinsics.checkNotNullParameter("Exception in getAdRequestParams", var17_18);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var23_24 /* !! */  = JioAds$LogLevel.NONE;
        var23_24 /* !! */  = Utility.INSTANCE;
        var23_24 /* !! */ .printStacktrace(var7_8);
        return var6_6;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Pair getAdRequestData(boolean bl2, String string2, String string3, String string4, HashMap hashMap, JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE, String string5, JioAdView$AD_TYPE object, List object2, Integer object3, Integer object4, Integer object5, String string6, Integer n3, String string7, String string8, boolean bl3, JioAdsLoader jioAdsLoader, boolean bl4, String string9, String string10) {
        void var19_20;
        void var16_17;
        int n4;
        String string11;
        Object var15_16;
        Object var13_14;
        String string12;
        String string13;
        CharSequence charSequence;
        String string14;
        Object object6;
        void var10_11;
        Object[] objectArray;
        Object object7;
        Object object8;
        Object object9;
        int n7;
        block12: {
            block14: {
                int n8;
                void var18_19;
                block13: {
                    void var21_22;
                    void var20_21;
                    void var14_15;
                    void var17_18;
                    n7 = 1;
                    this.mJioAdsLoader = var18_19;
                    Boolean bl5 = (boolean)var17_18;
                    object9 = this;
                    object8 = string4;
                    object7 = hashMap;
                    JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE2 = jioAdView$ORIENTATION_TYPE;
                    String string15 = string5;
                    objectArray = object;
                    object6 = var10_11;
                    charSequence = string14;
                    object9 = this.getAdRequestParams(string4, hashMap, jioAdView$ORIENTATION_TYPE, string5, (JioAdView$AD_TYPE)((Object)object), (List)((Object)string13), (Integer)var10_11, (Integer)((Object)string14), (Integer)((Object)string12), bl5, var13_14, (Integer)var14_15, var15_16, (String)var20_21, (String)var21_22);
                    if (bl2) {
                        int n10;
                        object8 = string3;
                        if (string3 != null && (n10 = string3.length()) != 0) {
                            object7 = "te";
                            object9.put(object7, string3);
                        }
                    }
                    object8 = this;
                    object7 = this.context;
                    Intrinsics.checkNotNull(object7);
                    string11 = "";
                    objectArray = "cgi_id";
                    object7 = j_0.d((Context)object7, "common_prefs", 0, string11, (String)objectArray);
                    String string16 = "null cannot be cast to non-null type kotlin.String";
                    Intrinsics.checkNotNull(object7, string16);
                    object7 = (String)object7;
                    n8 = ((String)object7).length();
                    if (n8 == 0) {
                        object7 = "defaultCGI";
                    }
                    object9.put("cgi", object7);
                    object7 = Utility.INSTANCE;
                    String string17 = "UTF-8";
                    object9 = ((Utility)object7).encodeAdRequestParameters((Map)object9, string17);
                    object7 = string2;
                    if (string2 == null || (n8 = string2.length()) == 0) break block13;
                    String string18 = "https://";
                    objectArray = "https";
                    object6 = "http";
                    if (bl2) {
                        boolean bl6 = kotlin.text.b.s(string2, (String)object6, false);
                        charSequence = "/delivery/mapi.php";
                        object7 = !bl6 && (n4 = (int)(kotlin.text.b.s(string2, (String)objectArray, false) ? 1 : 0)) == 0 ? cP.a(string18, string2, (String)charSequence) : ((String)object7).concat((String)charSequence);
                    } else {
                        boolean bl7 = kotlin.text.b.s(string2, (String)object6, false);
                        charSequence = "/delivery/api.php";
                        object7 = !bl7 && (n4 = (int)(kotlin.text.b.s(string2, (String)objectArray, false) ? 1 : 0)) == 0 ? cP.a(string18, string2, (String)charSequence) : ((String)object7).concat((String)charSequence);
                    }
                    n8 = 1;
                    n4 = 2;
                    break block12;
                }
                int[] nArray = b.$EnumSwitchMapping$0;
                object7 = JioAds.Companion.getInstance().getEnvironment$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                int n15 = ((Enum)object7).ordinal();
                n15 = nArray[n15];
                if (n15 == (n8 = 1)) break block14;
                n4 = 2;
                if (n15 != n4) {
                    int n16 = 3;
                    if (n15 != n16) {
                        n16 = 4;
                        if (n15 != n16) {
                            object9 = new NoWhenBranchMatchedException();
                            throw object9;
                        }
                        object7 = bl2 ? "http://49.40.64.244:6080/proxy.mads.php" : (var18_19 != null ? "http://49.40.64.244:6080/proxy.vapi.php" : "http://49.40.64.244:6080/proxy.api.php");
                        break block12;
                    } else {
                        object7 = bl2 ? "http://49.40.64.244:6080/sit.gomapi.php" : ((object7 = ((JioAdRequestGenerator)object8).mJioAdsLoader) != null ? "http://49.40.64.244:6080/sit.vapi.php" : "http://49.40.64.244:6080/sit.goapi.php");
                    }
                    break block12;
                } else {
                    object7 = bl2 ? "https://mercury-stg.jio.com/delivery/mapi.php" : ((object7 = ((JioAdRequestGenerator)object8).mJioAdsLoader) != null ? "https://mercury-stg.jio.com/delivery/vapi.php" : "https://mercury-stg.jio.com/delivery/api.php");
                }
                break block12;
            }
            n4 = 2;
            object7 = bl2 ? "https://mercury.jio.com/delivery/mapi.php" : ((object7 = ((JioAdRequestGenerator)object8).mJioAdsLoader) != null ? "https://mercury.jio.com/delivery/vapi.php" : "https://mercury.jio.com/delivery/api.php");
        }
        object7 = ((Object)StringsKt.m0((CharSequence)object7)).toString();
        object7 = oo1_1.a("\\s", (String)object7, string11);
        object6 = ((JioAdRequestGenerator)object8).context;
        charSequence = null;
        n7 = 16;
        JioAdRequestGenerator jioAdRequestGenerator = this;
        string13 = string4;
        var10_11 = var16_17;
        string14 = object6;
        string12 = string5;
        var13_14 = null;
        var15_16 = null;
        object6 = JioAdRequestGenerator.getRequestHeaders$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(this, string4, (String)var16_17, (Context)object6, string5, false, n7, null);
        if (var19_20 == false) {
            void var28_36;
            charSequence = nn_2.a(string4, ": ");
            if (bl2) {
                String string19 = "Multi";
            }
            ((StringBuilder)charSequence).append((String)var28_36);
            ((StringBuilder)charSequence).append("Ad Invocation Url: ");
            ((StringBuilder)charSequence).append((String)object7);
            char c2 = '?';
            ((StringBuilder)charSequence).append(c2);
            ir3_0.b((StringBuilder)charSequence, (String)object9, "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
        objectArray = new Object[n4];
        objectArray[0] = object9;
        objectArray[n8] = object6;
        return new Pair(object7, objectArray);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDeviceOrientation(Context object) {
        int n3;
        int n4;
        int n7;
        if (object != null && (object = object.getResources()) != null && (object = object.getConfiguration()) != null) {
            n7 = object.orientation;
            object = n7;
        } else {
            n7 = 0;
            object = null;
        }
        object = object != null && (n4 = object.intValue()) == (n3 = 2) ? "l" : (object != null && (n7 = object.intValue()) == (n4 = 1) ? "p" : "");
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map getRequestHeaders$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String var1_1, String var2_2, Context var3_3, String var4_4, boolean var5_5) {
        block23: {
            var6_6 /* !! */  = var1_1;
            var7_7 = var3_3;
            var8_8 = var4_4;
            var9_9 = "message";
            var10_10 = "type";
            var11_11 = "expiry";
            var12_12 = "id";
            var13_13 = "mtype";
            var14_14 = "Request headers for ";
            var15_15 = new HashMap<Object, Object>();
            try {
                var16_16 = Constants$HeaderKeys.ACCEPT_ENCODING;
                var16_16 = var16_16.getKey();
                var17_17 = "gzip";
                var15_15.put(var16_16, var17_17);
                var16_16 = "ls";
                var17_17 = var2_2;
                var15_15.put(var16_16, var2_2);
                var16_16 = "";
                if (var3_3 != null) {
                    var17_17 = "common_prefs";
                    var18_18 = "GlobalId";
                    var19_19 = 0;
                    var16_16 = j_0.d(var3_3, var17_17, 0, var16_16, var18_18);
                    var17_17 = "null cannot be cast to non-null type kotlin.String";
                    Intrinsics.checkNotNull(var16_16, var17_17);
                    var16_16 = (String)var16_16;
                }
            }
            catch (Exception v0) {
                var8_8 = this;
                break block23;
            }
            {
                var17_17 = new JSONObject();
                var20_20 = var16_16.length();
                if (var20_20 > 0) {
                    var17_17 = new JSONObject((String)var16_16);
                }
                var16_16 = new JSONObject();
                var18_18 = "optJSONObject(...)";
                var19_19 = 0;
                if (var8_8 != null && (var21_21 = var4_4.length()) != 0) {
                    var22_22 = var17_17.has((String)var8_8);
                    if (var22_22) {
                        var16_16 = var17_17.optJSONObject((String)var8_8);
                        Intrinsics.checkNotNullExpressionValue(var16_16, var18_18);
                    }
                } else {
                    if (var7_7 != null) {
                        var8_8 = var3_3.getPackageName();
                    } else {
                        var23_24 = 0;
                        var8_8 = null;
                    }
                    if (var8_8 != null && (var23_24 = var8_8.length()) != 0) {
                        if (var7_7 != null) {
                            var8_8 = var3_3.getPackageName();
                        } else {
                            var23_24 = 0;
                            var8_8 = null;
                        }
                        var23_24 = (int)var17_17.has((String)var8_8);
                        if (var23_24 != 0) {
                            if (var7_7 != null) {
                                var7_7 = var3_3.getPackageName();
                            } else {
                                var22_23 = false;
                                var7_7 = null;
                            }
                            var16_16 = var17_17.optJSONObject((String)var7_7);
                            Intrinsics.checkNotNullExpressionValue(var16_16, var18_18);
                        }
                    }
                }
                var7_7 = new JSONObject();
                var8_8 = "adspots";
                var8_8 = var16_16.optJSONObject((String)var8_8);
                var17_17 = var16_16.optJSONObject(var13_13);
                var17_17 = var17_17 != null ? var17_17.optString(var6_6 /* !! */ ) : null;
                if (var8_8 != null && (var20_20 = (int)var8_8.has(var6_6 /* !! */ )) != 0) {
                    var8_8 = var8_8.get(var6_6 /* !! */ );
                    var8_8 = var8_8.toString();
                    var7_7 = new JSONObject((String)var8_8);
                } else {
                    var8_8 = var16_16.optString(var12_12, null);
                    var18_18 = var16_16.optString(var11_11, null);
                    var16_16 = var16_16.optString((String)var10_10, null);
                    if (var8_8 != null && (var19_19 = var8_8.length()) != 0) {
                        var7_7.put((String)var10_10, var16_16);
                        var7_7.put(var12_12, var8_8);
                        var7_7.put(var11_11, (Object)var18_18);
                    }
                }
                if (var17_17 != null && (var23_24 = var17_17.length()) != 0) {
                    var7_7.put(var13_13, (Object)var17_17);
                }
                var8_8 = "mid";
                var7_7 = var7_7.toString();
                var15_15.put(var8_8, var7_7);
                if (var5_5) ** GOTO lbl108
                var8_8 = this;
            }
            try {
                block24: {
                    var10_10 = this.context;
                    var7_7 = new I((Context)var10_10);
                    var7_7 = var7_7.b(var6_6 /* !! */ );
                    var24_25 = var7_7.length();
                    if (var24_25 > 0) {
                        var10_10 = Constants$HeaderKeys.X_Jio_FC;
                        var10_10 = var10_10.getKey();
                        var15_15.put(var10_10, var7_7);
                    }
                    break block24;
lbl108:
                    // 1 sources

                    var8_8 = this;
                }
                var7_7 = new StringBuilder(var14_14);
                var7_7.append(var6_6 /* !! */ );
                var10_10 = ": ";
                var7_7.append((String)var10_10);
                var7_7.append(var15_15);
                var7_7 = var7_7.toString();
                Intrinsics.checkNotNullParameter(var7_7, var9_9);
                var7_7 = JioAds.Companion;
                var7_7 = var7_7.getInstance();
                var7_7.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var6_6 /* !! */  = JioAds$LogLevel.NONE;
                return var15_15;
            }
            catch (Exception v1) {}
        }
        var7_7 = new StringBuilder();
        var7_7.append(var6_6 /* !! */ );
        var7_7.append(": Exception in getRequestHeaders");
        Intrinsics.checkNotNullParameter(var7_7.toString(), var9_9);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var6_6 /* !! */  = JioAds$LogLevel.NONE;
        return var15_15;
    }

    public final HashMap getRequestParams(Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return JioAdRequestGenerator.commonAdRequestParams$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(this, linkedHashMap, map2, null, null, 12, null);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String getSimOperator(Context object) {
        TelephonyManager telephonyManager;
        String string2;
        String string3 = null;
        if (object != null) {
            string2 = "phone";
            Object object2 = object.getSystemService(string2);
        } else {
            Object var1_3 = null;
        }
        string2 = "null cannot be cast to non-null type android.telephony.TelephonyManager";
        try {
            void var1_4;
            Intrinsics.checkNotNull(var1_4, string2);
            telephonyManager = (TelephonyManager)var1_4;
        }
        catch (Exception exception) {
            return string3;
        }
        return telephonyManager.getSimOperator();
    }
}

