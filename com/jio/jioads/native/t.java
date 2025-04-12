/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
package com.jio.jioads.native;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.m;
import com.jio.jioads.native.s;
import com.jio.jioads.native.utils.a;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.e;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class t {
    public final b a;
    public final com.jio.jioads.controller.a b;
    public final c c;
    public final Map d;
    public boolean e;
    public a f;

    public t(b b2, com.jio.jioads.controller.a a2, c c2, Map map2) {
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(a2, "jioAdCallback");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        Intrinsics.checkNotNullParameter(map2, "responseHeaders");
        this.a = b2;
        this.b = a2;
        this.c = c2;
        this.d = map2;
    }

    public final int a() {
        String string2;
        Object object;
        Object object2 = this.d;
        int n3 = com.jio.jioads.utils.e.c((Map)object2);
        int n4 = -1;
        int n7 = 1;
        b b2 = this.a;
        if (n3 == n4) {
            com.jio.jioads.audioplayer.b.a(b2, ": Server refresh header value is -1");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            this.e = n7;
            return 0;
        }
        Object object3 = b2.k0();
        if (object3 == (object = JioAdView$AdState.DESTROYED)) {
            return 0;
        }
        object3 = Utility.INSTANCE;
        object = b2.Y();
        n4 = (int)(((Utility)object3).isPackage((Context)object, "com.jio.stb.screensaver", null) ? 1 : 0);
        String string3 = ": Respecting server refresh header value";
        if (n4 == 0 && (n3 = (int)(((Utility)object3).isPackage((Context)(object = b2.Y()), string2 = "com.jio.halotv", null) ? 1 : 0)) == 0) {
            n3 = com.jio.jioads.utils.e.c((Map)object2);
            n4 = 30;
            if (n3 != 0 && (n7 > (n3 = com.jio.jioads.utils.e.c((Map)object2)) || n3 >= n4)) {
                n3 = com.jio.jioads.utils.e.c((Map)object2);
                if (n3 >= n4) {
                    com.jio.jioads.audioplayer.b.a(b2, string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    this.e = false;
                    return com.jio.jioads.utils.e.c((Map)object2);
                }
                com.jio.jioads.audioplayer.b.a(b2, ": returning DEFAULT_REFRESH_RATE");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                this.e = false;
                return n4;
            }
            com.jio.jioads.audioplayer.b.a(b2, ": Server refresh header value is 0 or server refresh header is not present");
            object2 = JioAds.Companion;
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            n3 = b2.f();
            if (n3 >= n4) {
                object3 = m.a(b2, ": refresh value is ");
                n4 = b2.f();
                ((StringBuilder)object3).append(n4);
                object3 = ((StringBuilder)object3).toString();
                object = "message";
                Intrinsics.checkNotNullParameter(object3, (String)object);
                object2 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                int n8 = b2.f();
                if (n8 != 0) {
                    n7 = 0;
                    Object var11_11 = null;
                }
                this.e = n7;
                n4 = b2.f();
            } else {
                object3 = new StringBuilder();
                String string4 = ": refresh rate is less than Default value";
                j_0.i(b2, (StringBuilder)object3, string4);
                object2 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.e = false;
            }
            return n4;
        }
        com.jio.jioads.audioplayer.b.a(b2, string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        this.e = false;
        return com.jio.jioads.utils.e.c((Map)object2);
    }

    public final void b() {
        Object object;
        Object object2 = new StringBuilder();
        Object object3 = this.a;
        j_0.i((b)object3, object2, ": inside initRefreshHandler ");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = object3.k0();
        Enum enum_ = JioAdView$AdState.DESTROYED;
        if (object2 == enum_) {
            return;
        }
        object2 = object3.Y();
        enum_ = object3.K();
        if (enum_ != (object = JioAdView$AD_TYPE.INSTREAM_VIDEO) && (enum_ = object3.K()) != (object = JioAdView$AD_TYPE.INTERSTITIAL)) {
            object = Looper.getMainLooper();
            s s7 = new s(this, (Context)object2);
            enum_ = new Handler((Looper)object, (Handler.Callback)s7);
            object = this.f;
            if (object != null) {
                ((a)object).a();
            }
            if ((object = this.f) != null) {
                long l2;
                ((a)object).a();
                ((a)object).h = l2 = 0L;
            }
            object3 = object3.P();
            this.f = object = new a((Context)object2, (Handler)enum_, (String)object3);
        }
    }

    public final void c() {
        a a2;
        boolean bl2 = this.e;
        if (!bl2 && (a2 = this.f) != null) {
            a2.a();
        }
    }

    public final void d() {
        boolean bl2;
        Object object = this.f;
        if (object != null && !(bl2 = ((a)object).f) && !(bl2 = this.e)) {
            object = new StringBuilder();
            Object object2 = this.a;
            String string2 = ": Selected RefreshRate: ";
            j_0.n((b)object2, (StringBuilder)object, string2);
            int n3 = this.a();
            ((StringBuilder)object).append(n3);
            object = ((StringBuilder)object).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.f;
            if (object != null) {
                n3 = this.a();
                string2 = null;
                ((a)object).b(n3, false);
            }
            if ((object = this.f) != null) {
                ((a)object).c();
            }
        }
    }
}

