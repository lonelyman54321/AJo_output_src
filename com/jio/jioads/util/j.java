/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.util;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

public abstract class j {
    public static void a(String object) {
        Intrinsics.checkNotNullParameter(object, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public static void b(String object) {
        Intrinsics.checkNotNullParameter(object, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public static void c(String object) {
        Intrinsics.checkNotNullParameter(object, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(String string2) {
        CharSequence charSequence = "str";
        Intrinsics.checkNotNullParameter(string2, (String)charSequence);
        try {
            String string3;
            String string4;
            int n3 = string2.length();
            int n4 = 4000;
            n3 /= n4;
            int n7 = string2.length();
            n7 %= n4;
            int n8 = 0;
            while (true) {
                string4 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                string3 = "";
                if (n8 >= n3) break;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                int n10 = n4 * n8;
                int n14 = n4 * ++n8;
                string3 = string2.substring(n10, n14);
                Intrinsics.checkNotNullExpressionValue(string3, string4);
                stringBuilder.append(string3);
                string4 = stringBuilder.toString();
                j.a(string4);
            }
            if (n7 <= 0) return;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            n4 *= n3;
            n3 = string2.length();
            string2 = string2.substring(n4, n3);
            Intrinsics.checkNotNullExpressionValue(string2, string4);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            j.a(string2);
            return;
        }
        catch (Exception exception) {}
        charSequence = new StringBuilder("Error while printing long Response: ");
        Utility utility = Utility.INSTANCE;
        String string5 = utility.printStacktrace(exception);
        ((StringBuilder)charSequence).append(string5);
        string5 = ((StringBuilder)charSequence).toString();
        j.b(string5);
    }
}

