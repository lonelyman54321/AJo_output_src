/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.jio.jioads.videomodule;

import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.util.Utility;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public final class q
implements Runnable {
    public final /* synthetic */ s a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ q(s s7, boolean bl2) {
        this.a = s7;
        this.b = bl2;
    }

    public final void run() {
        s s7 = this.a;
        Intrinsics.checkNotNullParameter(s7, "this$0");
        Object object = new StringBuilder();
        j_0.i(s7.d, (StringBuilder)object, ": inside loadVideo() post");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = s7.d;
        JioAdView$AdState jioAdView$AdState = object.k0();
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState != jioAdView$AdState2 && (jioAdView$AdState2 = (jioAdView$AdState = s7.i) == null ? s7.h : jioAdView$AdState) != null) {
            boolean bl2 = this.b;
            if (bl2) {
                boolean bl3 = false;
                object = null;
                s7.K(false);
            } else {
                if (jioAdView$AdState == null) {
                    jioAdView$AdState = s7.h;
                    Intrinsics.checkNotNull((Object)jioAdView$AdState);
                }
                boolean bl4 = object.D();
                bl2 = true;
                if (bl4) {
                    bl4 = true;
                } else {
                    object = Utility.INSTANCE;
                    int n3 = 5;
                    bl4 = ((Utility)object).checkVisibility((ViewGroup)jioAdView$AdState, n3);
                }
                if (!bl4) {
                    s7.K(bl2);
                }
            }
        }
    }
}

