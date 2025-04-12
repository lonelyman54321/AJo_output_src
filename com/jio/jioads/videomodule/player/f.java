/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 */
package com.jio.jioads.videomodule.player;

import android.media.MediaPlayer;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.videomodule.player.k;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ k a;

    public /* synthetic */ f(k k2) {
        this.a = k2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onPrepared(MediaPlayer object) {
        int n3;
        Exception exception2;
        int n4;
        Object object2;
        Object object3;
        block6: {
            object3 = this.a;
            Intrinsics.checkNotNullParameter(object3, "this$0");
            object2 = ((k)object3).d;
            Object object4 = object2.k0();
            Object object5 = JioAdView$AdState.DESTROYED;
            String string2 = "message";
            if (object4 == object5) {
                Intrinsics.checkNotNullParameter("", string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                return;
            }
            try {
                object4 = JioPlayerState.PREPARED;
                ((k)object3).i = object4;
                ((k)object3).q = n4 = object.getDuration();
                object4 = new StringBuilder();
                object5 = object2.P();
                ((StringBuilder)object4).append((String)object5);
                object5 = ": OnPreparedListener: Media Duration ";
                ((StringBuilder)object4).append((String)object5);
                int n7 = ((k)object3).q;
                ((StringBuilder)object4).append(n7);
                object4 = ((StringBuilder)object4).toString();
                Intrinsics.checkNotNullParameter(object4, string2);
                object4 = JioAds.Companion;
                object4 = ((JioAds$Companion)object4).getInstance();
                ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object4 = JioAds$LogLevel.NONE;
                n4 = 1;
                ((k)object3).t = n4;
                ((k)object3).s = n4;
                ((k)object3).r = n4;
                object4 = ((k)object3).c;
                if (object4 == null) break block6;
                object4.f();
            }
            catch (Exception exception2) {}
        }
        try {
            ((k)object3).m = n4 = object.getVideoWidth();
            ((k)object3).n = n3 = object.getVideoHeight();
        }
        catch (Exception exception3) {}
        n3 = ((k)object3).k;
        if (n3 == 0) return;
        ((k)object3).seekTo(n3);
        return;
        object3 = new StringBuilder();
        object2 = object2.P();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(": Video Media player exception ");
        object2 = "<this>";
        Intrinsics.checkNotNullParameter(exception2, (String)object2);
        b.e(exception2, (StringBuilder)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

