/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule.player;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.common.b;
import com.jio.jioads.util.s;
import com.jio.jioads.videomodule.player.k;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c
extends Lambda
implements Function0 {
    public final /* synthetic */ k c;

    public c(k k2) {
        this.c = k2;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        Exception exception2;
        String string2;
        Object object;
        Object object2;
        block10: {
            Object object3;
            block9: {
                object3 = new StringBuilder();
                object2 = this.c;
                object = ((k)object2).d;
                string2 = ": Inside JioMediaPlayer cleanup";
                j_0.i((b)object, object3, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                s.a(((k)object2).g);
                object3 = ((k)object2).v;
                if (object3 != null) {
                    object3.release();
                }
                object3 = JioPlayerState.RELEASED;
                ((k)object2).i = object3;
                object3 = null;
                ((k)object2).E = null;
                ((k)object2).x = null;
                ((k)object2).y = null;
                ((k)object2).z = null;
                ((k)object2).F = null;
                ((k)object2).c = null;
                ((k)object2).w = null;
                ((k)object2).l = null;
                try {
                    object = ((k)object2).f;
                    if (object == null) break block9;
                    object.reset();
                    object.setSurface(null);
                    object.release();
                }
                catch (Exception exception2) {
                    break block10;
                }
            }
            if ((object = ((k)object2).e) != null) {
                object.shutdown();
            }
            ((k)object2).e = null;
            object = ((k)object2).f;
            if (object != null) {
                object.setOnCompletionListener(null);
            }
            if ((object = ((k)object2).f) != null) {
                object.setOnBufferingUpdateListener(null);
            }
            if ((object = ((k)object2).f) != null) {
                object.setOnPreparedListener(null);
            }
            if ((object = ((k)object2).f) != null) {
                object.setOnErrorListener(null);
            }
            if ((object = ((k)object2).f) != null) {
                object.setOnVideoSizeChangedListener(null);
            }
            ((k)object2).f = null;
            ((k)object2).c = null;
            object3 = JioPlayerState.IDEAL;
            ((k)object2).i = object3;
            return Unit.a;
        }
        object = new StringBuilder();
        object2 = ((k)object2).d;
        string2 = ": Exception while release of JioMediaPlayer ";
        j_0.n((b)object2, (StringBuilder)object, string2);
        l_0.f(exception2, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return Unit.a;
    }
}

