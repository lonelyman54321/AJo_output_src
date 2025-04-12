/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.videoAds;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.videoAds.h;
import com.jio.jioads.videomodule.i_0;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import kotlin.jvm.internal.Intrinsics;

public final class f
extends CountDownTimer {
    public final /* synthetic */ h a;

    public f(h h3, long l2) {
        this.a = h3;
        super(l2, 1000L);
    }

    public final void onFinish() {
        Object object = this.a;
        Object object2 = ((h)object).y;
        if (object2 != null) {
            object2.cancel();
        }
        boolean bl2 = false;
        ((h)object).y = null;
        object2 = ((h)object).o;
        Object object3 = JioPlayerState.PREPARING;
        if (object2 == object3) {
            object2 = new StringBuilder();
            object3 = ((h)object).c;
            String string2 = ": ExoPlayer preparation timer finish closing ad!";
            j_0.i((b)object3, (StringBuilder)object2, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = ((h)object).b;
            if (object != null) {
                bl2 = true;
                ((i_0)object).a(bl2);
            }
        }
    }

    public final void onTick(long l2) {
        block6: {
            Object object;
            h h3;
            Object object2;
            block5: {
                Object object3;
                block4: {
                    object2 = new StringBuilder();
                    h3 = this.a;
                    object3 = h3.c;
                    Object object4 = ": ExoPlayer is getting prepared for trackNumber: ";
                    j_0.n((b)object3, (StringBuilder)object2, object4);
                    int n3 = h3.q;
                    ((StringBuilder)object2).append(n3);
                    ((StringBuilder)object2).append("...");
                    object2 = ((StringBuilder)object2).toString();
                    object3 = "message";
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    object2 = h3.k;
                    if (object2 == null || (object3 = h3.o) == (object4 = JioPlayerState.ERROR) || object3 == (object4 = JioPlayerState.IDEAL) || object3 == (object4 = JioPlayerState.PREPARING)) break block4;
                    Intrinsics.checkNotNull(object2);
                    object = ((androidx.media3.common.b)object2).isPlaying();
                    if (object != 0) break block5;
                    long l3 = System.currentTimeMillis();
                    long l4 = h3.i;
                    long l7 = (l3 -= l4) - (l4 = (long)70);
                    object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object < 0) break block5;
                }
                if ((object2 = h3.o) != (object3 = JioPlayerState.PREPARED)) break block6;
            }
            if ((object2 = h3.y) != null) {
                object2.cancel();
            }
            object = 0;
            object2 = null;
            h3.y = null;
        }
    }
}

