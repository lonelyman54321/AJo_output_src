/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Environment
 *  android.os.StatFs
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.utils.g;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class h {
    public static String a(Exception object) {
        Intrinsics.checkNotNullParameter(object, "e");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        ((Throwable)object).printStackTrace(printWriter);
        object = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String b(String object, SharedPreferences object2, String object3, String object4) {
        Exception exception2;
        String string2;
        block12: {
            block9: {
                Object object5 = "?";
                String string3 = "Cached path : ";
                String string4 = "Checking if file is cached with key: ";
                string2 = "message";
                if (object != null) {
                    boolean bl2;
                    block11: {
                        block10: {
                            try {
                                boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                                if (bl3) break block9;
                                String string5 = String.valueOf(object3);
                                bl3 = TextUtils.isEmpty((CharSequence)string5);
                                if (bl3) {
                                    object3 = object4;
                                }
                                bl2 = TextUtils.isEmpty((CharSequence)object3);
                                if (bl2) break block10;
                                Intrinsics.checkNotNull(object3);
                                object = object3;
                                break block11;
                            }
                            catch (Exception exception2) {
                                break block12;
                            }
                        }
                        object3 = null;
                        bl2 = StringsKt.F((CharSequence)object, (CharSequence)object5, false);
                        if (bl2) {
                            bl2 = 6 != 0;
                            bl2 = StringsKt.O((CharSequence)object, (String)object5, 0, false, (int)(bl2 ? 1 : 0));
                            object = ((String)object).substring(0, (int)(bl2 ? 1 : 0));
                            object3 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        }
                    }
                    object3 = new StringBuilder(string4);
                    ((StringBuilder)object3).append((String)object);
                    object4 = " Status: ";
                    ((StringBuilder)object3).append((String)object4);
                    if (object2 != null) {
                        bl2 = object2.contains((String)object);
                        object4 = bl2;
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    ((StringBuilder)object3).append(object4);
                    object3 = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullParameter(object3, string2);
                    object3 = JioAds.Companion;
                    object4 = ((JioAds$Companion)object3).getInstance();
                    ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = JioAds$LogLevel.NONE;
                    if (object2 == null) return null;
                    bl2 = object2.contains((String)object);
                    if (!bl2) return null;
                    object4 = object2.getString((String)object, null);
                    if (object4 == null) return null;
                    object5 = new JSONObject((String)object4);
                    object4 = "expiryTime";
                    long l2 = object5.optLong((String)object4);
                    object4 = "cachingTime";
                    long l3 = object5.optLong((String)object4);
                    long l4 = System.currentTimeMillis();
                    object4 = "cachePath";
                    object4 = object5.optString((String)object4);
                    object5 = new File((String)object4);
                    long l7 = l4 - (l2 += l3);
                    Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object6 < 0 && (object6 = (Object)((File)object5).exists()) != false) {
                        object = "File is already cached.It will be shown from local storage";
                        Intrinsics.checkNotNullParameter(object, string2);
                        object = ((JioAds$Companion)object3).getInstance();
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = new StringBuilder(string3);
                        ((StringBuilder)object).append(object5);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(object, string2);
                        object = ((JioAds$Companion)object3).getInstance();
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        return object4;
                    }
                    object5 = new File((String)object4);
                    boolean bl4 = ((File)object5).exists();
                    if (bl4) {
                        object5 = new File((String)object4);
                        ((File)object5).delete();
                    }
                    object2 = object2.edit();
                    object2.remove((String)object);
                    object2.apply();
                    object = "Cached file has been expired. Deleting from local storage";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = ((JioAds$Companion)object3).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    return null;
                }
            }
            object = "Inside else block of isFileCached()";
            Intrinsics.checkNotNullParameter(object, string2);
            object = JioAds.Companion;
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return null;
        }
        object3 = "Exception while checking file cached status--> ";
        object2 = new StringBuilder((String)object3);
        Object object7 = h.a(exception2);
        ((StringBuilder)object2).append((String)object7);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object7 = JioAds$LogLevel.NONE;
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void c(String object, long l2, SharedPreferences sharedPreferences2, String string2) {
        block18: {
            void var4_11;
            void var3_10;
            long l3;
            String string3;
            JSONObject jSONObject;
            String string4 = "Storing cached file details in pref ";
            try {
                jSONObject = new JSONObject();
                string3 = "cachePath";
            }
            catch (Exception exception) {
                return;
            }
            jSONObject.put(string3, object);
            String string5 = "expiryTime";
            jSONObject.put(string5, l3);
            String string6 = "cachingTime";
            l3 = System.currentTimeMillis();
            jSONObject.put(string6, l3);
            if (var3_10 == null) break block18;
            SharedPreferences.Editor editor = var3_10.edit();
            String string7 = jSONObject.toString();
            editor.putString((String)var4_11, string7);
            editor.apply();
            StringBuilder stringBuilder = new StringBuilder(string4);
            stringBuilder.append(jSONObject);
            string7 = " Key = ";
            stringBuilder.append(string7);
            stringBuilder.append((String)var4_11);
            String string8 = stringBuilder.toString();
            string7 = "message";
            Intrinsics.checkNotNullParameter(string8, string7);
            JioAds$Companion jioAds$Companion = JioAds.Companion;
            JioAds jioAds = jioAds$Companion.getInstance();
            jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
    }

    public static boolean d(int n3) {
        long l2;
        long l3;
        long l4;
        Object object = Environment.getDataDirectory();
        object = ((File)object).getPath();
        Object object2 = new StatFs((String)object);
        long l7 = object2.getBlockSizeLong();
        long l8 = object2.getAvailableBlocksLong() * l7;
        boolean bl2 = true;
        long l12 = 0L;
        long l14 = l8 - l12;
        Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object3 == false) {
            return bl2;
        }
        long l15 = 1024L;
        long l16 = l8 - l15;
        Object object4 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object4 >= 0 && (l4 = (l3 = (l8 /= (l2 = (long)(object4 = (Object)1024))) - l15) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0) {
            l12 = l8 / l2;
        }
        object = new StringBuilder("Available local storage: ");
        ((StringBuilder)object).append(l12);
        ((StringBuilder)object).append("MB");
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        l8 = n3;
        n3 = (int)(l12 == l8 ? 0 : (l12 < l8 ? -1 : 1));
        if (n3 <= 0) {
            bl2 = false;
        }
        return bl2;
    }

    public static boolean e(Context object, JioAds$MediaType jioAds$MediaType) {
        Intrinsics.checkNotNullParameter((Object)jioAds$MediaType, "mediaType");
        Object object2 = g.$EnumSwitchMapping$0;
        int n3 = jioAds$MediaType.ordinal();
        int n4 = object2[n3];
        n3 = 50;
        int n7 = 1;
        if (n4 != n7) {
            int n8 = 2;
            if (n4 != n8) {
                n8 = 3;
                if (n4 != n8) {
                    Intrinsics.checkNotNullParameter("Invalid Media type passed", "message");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    return false;
                }
                n4 = (int)(h.d(n3) ? 1 : 0);
                if (n4 == 0) {
                    object2 = JioAds.Companion.getInstance();
                    ((JioAds)object2).clearCachedMedia((Context)object, jioAds$MediaType);
                    n7 = (int)(h.d(n3) ? 1 : 0);
                }
                return n7 != 0;
            }
            n4 = 20;
            n3 = (int)(h.d(n4) ? 1 : 0);
            if (n3 == 0) {
                JioAds jioAds = JioAds.Companion.getInstance();
                jioAds.clearCachedMedia((Context)object, jioAds$MediaType);
                n7 = (int)(h.d(n4) ? 1 : 0);
            }
            return n7 != 0;
        }
        n4 = (int)(h.d(n3) ? 1 : 0);
        if (n4 == 0) {
            object2 = JioAds.Companion.getInstance();
            ((JioAds)object2).clearCachedMedia((Context)object, jioAds$MediaType);
            n7 = h.d(n3);
        }
        return n7 != 0;
    }
}

