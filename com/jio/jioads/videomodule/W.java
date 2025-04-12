/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.view.ViewGroup
 */
package com.jio.jioads.videomodule;

import android.os.CountDownTimer;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.util.Utility;
import com.jio.jioads.videomodule.config.a;
import com.jio.jioads.videomodule.s;

public final class W
extends CountDownTimer {
    public final /* synthetic */ s a;

    public W(s s7) {
        this.a = s7;
        super(2000L, 1000L);
    }

    public final void onFinish() {
        block8: {
            int n3;
            boolean bl2;
            s s7;
            block7: {
                Object object = new StringBuilder();
                s7 = this.a;
                Object object2 = s7.d;
                CharSequence charSequence = ": ViewableTimer onFinish called";
                j_0.i(object2, (StringBuilder)object, charSequence);
                object = JioAds.Companion;
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = s7.i;
                if (object2 == null && (object2 = s7.h) == null) {
                    return;
                }
                charSequence = s7.H;
                if (charSequence != null) {
                    charSequence.cancel();
                    bl2 = false;
                    s7.H = null;
                    charSequence = new StringBuilder();
                    String string2 = ": removing viewable timer";
                    l_0.e(s7, (StringBuilder)charSequence, string2);
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                object = s7.g0();
                n3 = ((a)object).o;
                bl2 = true;
                if (n3 == 0) break block7;
                object = s7.d;
                n3 = (int)(object.D() ? 1 : 0);
                if (n3 != 0) {
                    n3 = 1;
                } else {
                    object = Utility.INSTANCE;
                    int n4 = 50;
                    n3 = (int)(((Utility)object).checkVisibility((ViewGroup)object2, n4) ? 1 : 0);
                }
                if (n3 == 0) break block8;
            }
            n3 = s7.P;
            s7.D(n3);
            s7.G = bl2;
        }
    }

    public final void onTick(long l2) {
    }
}

