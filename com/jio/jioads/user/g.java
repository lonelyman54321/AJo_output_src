/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.database.Cursor
 *  android.os.Build
 *  android.text.TextUtils
 */
package com.jio.jioads.user;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.util.Utility;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class g {
    public final Context a;
    public String b;
    public String c;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public static boolean e() {
        Object object = new StringBuilder("is Device JioBook Brand: ");
        String string2 = Build.BRAND;
        object.append(string2);
        object.append(", Board: ");
        String string3 = Build.BOARD;
        String string4 = "message";
        ir3_0.b(object, string3, string4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = "Jio";
        boolean bl2 = true;
        boolean bl3 = kotlin.text.b.i(string2, (String)object, bl2);
        if (!bl3 || !(bl3 = kotlin.text.b.i(string3, (String)(object = "JioBook"), bl2))) {
            bl2 = false;
            string4 = null;
        }
        return bl2;
    }

    public final void a(Cursor cursor) {
        block33: {
            int n3;
            Object object;
            String string2;
            Object object2;
            Object object3;
            String string3;
            block32: {
                string3 = "subid";
                object3 = "advid";
                object2 = "message";
                string2 = "JioAdsPushService UID = ";
                object = "JioAdsPushService advid= ";
                Object object4 = "Jioads push service cursor is not null";
                Intrinsics.checkNotNullParameter(object4, (String)object2);
                object4 = JioAds.Companion;
                Object object5 = ((JioAds$Companion)object4).getInstance();
                ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = JioAds$LogLevel.NONE;
                int n4 = cursor.getColumnIndex((String)object3);
                if (n4 < 0) break block32;
                object5 = "Attempting to fetch advId from JioAdsPushService content provider for STB";
                Intrinsics.checkNotNullParameter(object5, (String)object2);
                object5 = ((JioAds$Companion)object4).getInstance();
                ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                cursor.moveToFirst();
                n3 = cursor.getColumnIndex((String)object3);
                object3 = cursor.getString(n3);
                object5 = new StringBuilder((String)object);
                ((StringBuilder)object5).append((String)object3);
                object = ((StringBuilder)object5).toString();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = ((JioAds$Companion)object4).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                try {
                    this.b((String)object3, false);
                }
                catch (Exception exception) {
                    Intrinsics.checkNotNullParameter("Exception while getting advid JioAdsPushService for STB", (String)object2);
                    object = JioAds.Companion;
                    ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = JioAds$LogLevel.NONE;
                    object4 = Utility.INSTANCE;
                    object3 = ((Utility)object4).printStacktrace(exception);
                    com.jio.jioads.jioreel.tracker.model.b.g((String)object3, (JioAds$Companion)object);
                }
            }
            n3 = cursor.getColumnIndex(string3);
            if (n3 < 0) break block33;
            object3 = JioAds.Companion;
            object = ((JioAds$Companion)object3).getInstance();
            boolean bl2 = ((JioAds)object).isUidServiceDisabled();
            if (bl2) break block33;
            object = this.b;
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) break block33;
            cursor.moveToFirst();
            int n7 = cursor.getColumnIndex(string3);
            string3 = cursor.getString(n7);
            if (string3 == null) break block33;
            bl2 = TextUtils.isEmpty((CharSequence)string3);
            if (bl2) break block33;
            string2 = string2.concat(string3);
            Intrinsics.checkNotNullParameter(string2, (String)object2);
            object3 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.b = string3;
            object3 = "subscriberId_key";
            string2 = this.a;
            object = "common_prefs";
            try {
                j_0.p((Context)string2, (String)object, 0, string3, (String)object3);
            }
            catch (Exception exception) {
                Intrinsics.checkNotNullParameter("Exception while getting uid from JioAdsPushService for STB", (String)object2);
                object3 = JioAds.Companion;
                ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = Utility.INSTANCE;
                String string4 = ((Utility)object2).printStacktrace(exception);
                com.jio.jioads.jioreel.tracker.model.b.g(string4, (JioAds$Companion)object3);
            }
        }
        cursor.close();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String string2, boolean bl2) {
        String string3 = "Storing advid: ";
        try {
            void var3_7;
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(string2);
            String string4 = " & isLimitAdTrackingEnabled flag: ";
            stringBuilder.append(string4);
            if (bl2) {
                String string5 = "true";
            } else {
                String string6 = "false";
            }
            stringBuilder.append((String)var3_7);
            String string7 = stringBuilder.toString();
            String string8 = "message";
            Intrinsics.checkNotNullParameter(string7, string8);
            JioAds$Companion jioAds$Companion = JioAds.Companion;
            JioAds jioAds = jioAds$Companion.getInstance();
            jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            this.c = string2;
            Context context = this.a;
            String string9 = "common_prefs";
            SharedPreferences sharedPreferences2 = j_0.o(context, string9);
            SharedPreferences.Editor editor = sharedPreferences2.edit();
            if (editor != null) {
                String string10 = "advid";
                editor.putString(string10, string2);
            }
            if (editor != null) {
                string2 = "limit-tracking";
                editor.putBoolean(string2, bl2);
            }
            if (editor == null) return;
            editor.apply();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void c() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        Object object;
        Object object2;
        Context context;
        Object object3;
        Object object4 = null;
        int n3 = 1;
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Checking if GMS is present", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        try {
            object3 = new Class[n3];
            context = Context.class;
            object3[0] = context;
            context = AdvertisingIdClient.class;
            object2 = "getAdvertisingIdInfo";
            object3 = Arrays.copyOf(object3, n3);
            object3 = context.getMethod((String)object2, (Class<?>)object3);
            context = this.a;
            object = new Object[n3];
            object[0] = context;
            object = ((Method)object3).invoke(null, (Object[])object);
        }
        catch (Exception exception) {
            Intrinsics.checkNotNullParameter("AdvertisingIdClient dependency not found", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            n3 = 0;
            object = null;
        }
        if (object == null) {
            Intrinsics.checkNotNullParameter("gmsObject unavailable", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            return;
        }
        object3 = new Class[]{};
        context = object.getClass();
        object2 = Arrays.copyOf(object3, 0);
        object2 = context.getMethod("isLimitAdTrackingEnabled", (Class<?>)object2).invoke(object, null);
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Boolean");
        object2 = (Boolean)object2;
        boolean bl2 = (Boolean)object2;
        Object object5 = new StringBuilder("Is LAT enabled ");
        ((StringBuilder)object5).append(bl2);
        Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), string2);
        object5 = JioAds.Companion;
        ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (bl2) {
            object4 = "google: Can't get ADVID";
            v12.a((String)object4, string2, (JioAds$Companion)object5);
            return;
        }
        object4 = (Class[])Arrays.copyOf(object3, 0);
        object3 = "getId";
        if ((object4 = (String)context.getMethod((String)object3, (Class<?>)object4).invoke(object, null)) != null) {
            this.b((String)object4, bl2);
            object = "Google Advertisement Id: ";
            Intrinsics.checkNotNullParameter(((String)object).concat((String)object4), string2);
            object4 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            return;
        }
        object4 = "google: ADVID is null";
        v12.a((String)object4, string2, (JioAds$Companion)object5);
    }
}

