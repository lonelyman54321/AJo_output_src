/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.cdnlogging;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.a;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.cdnlogging.b;
import kotlin.jvm.internal.Intrinsics;

public abstract class c {
    public static void a(Context context, String string2, Boolean bl2) {
        int n3 = 1;
        l_0.h("CDN Error URL: ", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        com.jio.jioads.network.c c2 = new com.jio.jioads.network.c(context);
        int n4 = string2.length() - n3;
        int n7 = 0;
        boolean bl3 = false;
        String string3 = null;
        while (n7 <= n4) {
            int n8 = !bl3 ? n7 : n4;
            n8 = string2.charAt(n8);
            int n10 = 32;
            n8 = Intrinsics.compare(n8, n10);
            n8 = n8 <= 0 ? 1 : 0;
            if (!bl3) {
                if (n8 == 0) {
                    bl3 = true;
                    continue;
                }
                n7 += n3;
                continue;
            }
            if (n8 == 0) break;
            n4 += -1;
        }
        string3 = a.a(n4, n3, n7, string2);
        Integer n14 = 0;
        b b2 = new Object();
        c2.b(0, string3, null, null, n14, b2, bl2);
    }
}

