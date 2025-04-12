/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.jio.jioads.util;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioAdsMetadata$Builder;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.instreamads.vastparser.model.e;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.c;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.k;
import com.jio.jioads.util.t;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class u {
    public final Boolean a;

    public u(Boolean bl2) {
        this.a = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void c(u u3, Context context, String string2, String string3, String string4, String string5, String string6, HashMap hashMap, String string7, JioAdView$AD_TYPE jioAdView$AD_TYPE, int n3, a a2) {
        Object object;
        Boolean bl2;
        Integer n4;
        JioAdsMetadata jioAdsMetadata;
        String string8;
        Object object2 = u3;
        Context context2 = context;
        int n7 = 1;
        u3.getClass();
        k k2 = new Object();
        String string9 = string2;
        k2.a = string2;
        k2.q = string4;
        Utility utility = Utility.INSTANCE;
        k2.b = string8 = utility.getCcbValue(string4);
        String string10 = string5;
        k2.r = string5;
        String string11 = string6;
        k2.s = string6;
        JioAdsMetadata$Builder jioAdsMetadata$Builder = new JioAdsMetadata$Builder();
        k2.t = jioAdsMetadata = jioAdsMetadata$Builder.setCustomMetadata(hashMap).build();
        k2.c = string3;
        JioAdView$AD_TYPE jioAdView$AD_TYPE2 = jioAdView$AD_TYPE;
        k2.u = jioAdView$AD_TYPE;
        k2.v = "";
        k2.l = n4 = Integer.valueOf(n7);
        JioAdView$AD_TYPE jioAdView$AD_TYPE3 = JioAdView$AD_TYPE.INTERSTITIAL;
        k2.w = string7;
        k2.e = bl2 = Boolean.FALSE;
        String string12 = utility.replaceMacros(k2);
        Intrinsics.checkNotNullParameter(KW.a(string4, ": Error Logging: ", string3, ", Error Url: ", string12), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        c c2 = new c(context);
        int n8 = string12.length() - n7;
        Object var17_31 = null;
        int n10 = 0;
        boolean bl3 = false;
        Boolean bl4 = null;
        while (n10 <= n8) {
            int n14 = !bl3 ? n10 : n8;
            n14 = string12.charAt(n14);
            int n15 = 32;
            n14 = Intrinsics.compare(n14, n15);
            n14 = n14 <= 0 ? 1 : 0;
            if (!bl3) {
                if (n14 == 0) {
                    bl3 = true;
                    continue;
                }
                n10 += n7;
                continue;
            }
            if (n14 == 0) break;
            n8 += -1;
        }
        String string13 = com.jio.jioads.adinterfaces.a.a(n8, n7, n10, string12);
        if (context2 != null) {
            object = Utility.INSTANCE.getUserAgentHeader(context2);
        } else {
            n7 = 0;
            object = null;
        }
        Map map2 = object;
        Integer n16 = n3;
        object = new t(c2);
        Boolean bl5 = ((u)object2).a;
        c2.b(0, string13, null, map2, n16, (NetworkTaskListener)object, bl5);
        object = Utility.INSTANCE;
        d d2 = d.b;
        bl4 = ((u)object2).a;
        object2 = object;
        context2 = context;
        object = d2;
        a a3 = a2;
        ((Utility)object2).logError(context, string4, d2, null, null, a2, null, bl4, string7, string3, false);
    }

    public final void a(Context context, j j3, String string2, String string3, String string4, HashMap hashMap, String string5, JioAdView$AD_TYPE jioAdView$AD_TYPE, int n3, a a2) {
        Object object = j3;
        Intrinsics.checkNotNullParameter(string2, "adSpotId");
        Object object2 = "advertisingId";
        Intrinsics.checkNotNullParameter(string3, (String)object2);
        object2 = j3 != null ? j3.n : null;
        if (object2 != null) {
            boolean bl2;
            object = ((j)object).n;
            Intrinsics.checkNotNull(object);
            String string6 = ((e)object).b;
            if (string6 != null && !(bl2 = TextUtils.isEmpty((CharSequence)string6))) {
                String string7 = "101";
                u.c(this, context, string6, string7, string2, string3, string4, hashMap, string5, jioAdView$AD_TYPE, n3, a2);
            }
        }
    }

    public final void b(Context context, m m2, String string2, String string3, String string4, HashMap hashMap, String string5, JioAdView$AD_TYPE jioAdView$AD_TYPE, int n3, a a2) {
        boolean bl2;
        Object object;
        m m3 = m2;
        Intrinsics.checkNotNullParameter(string2, "adSpotId");
        Intrinsics.checkNotNullParameter(string3, "advertisingId");
        if (m2 != null) {
            object = m2.c;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            int n4 = m3.c.size();
            bl2 = false;
            object = null;
            int n7 = 0;
            while (n7 < n4) {
                int n8;
                int n10;
                String string6;
                String string7;
                object = (j)m3.c.get(n7);
                Object object2 = object != null ? ((j)object).n : null;
                if (object2 != null) {
                    object = ((j)object).n;
                    Intrinsics.checkNotNull(object);
                    string7 = ((e)object).b;
                    if (string7 != null && !(bl2 = TextUtils.isEmpty((CharSequence)string7))) {
                        string6 = "100";
                        object = this;
                        object2 = context;
                        n10 = n7;
                        n7 = n3;
                        n8 = n4;
                        u.c(this, context, string7, string6, string2, string3, string4, hashMap, string5, jioAdView$AD_TYPE, n3, a2);
                    } else {
                        n10 = n7;
                        n8 = n4;
                    }
                } else {
                    n10 = n7;
                    n8 = n4;
                    object2 = object != null ? ((j)object).m : null;
                    if (object2 != null) {
                        object = ((j)object).m;
                        Intrinsics.checkNotNull(object);
                        string7 = ((q)object).f;
                        if (string7 != null && !(bl2 = TextUtils.isEmpty((CharSequence)string7))) {
                            string6 = "100";
                            object = this;
                            object2 = context;
                            n7 = n3;
                            u.c(this, context, string7, string6, string2, string3, string4, hashMap, string5, jioAdView$AD_TYPE, n3, a2);
                        }
                    }
                }
                n7 = n10 + 1;
                n4 = n8;
            }
        }
    }
}

