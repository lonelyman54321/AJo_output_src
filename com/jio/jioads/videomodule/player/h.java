/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 */
package com.jio.jioads.videomodule.player;

import android.media.MediaPlayer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.common.b;
import com.jio.jioads.videomodule.player.k;
import kotlin.jvm.internal.Intrinsics;

public final class h
implements Runnable {
    public final /* synthetic */ k a;

    public /* synthetic */ h(k k2) {
        this.a = k2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Exception exception2;
        Object object;
        Object object2;
        block7: {
            b b2;
            String string2;
            Object object3;
            block6: {
                int n3;
                object2 = this.a;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                object3 = null;
                try {
                    ((k)object2).B = false;
                    object = ((k)object2).f;
                    string2 = "message";
                    b2 = ((k)object2).d;
                    if (object == null) break block6;
                }
                catch (Exception exception2) {
                    break block7;
                }
                int n4 = ((k)object2).A;
                if (n4 != 0) {
                    Intrinsics.checkNotNull(object);
                    n3 = object.getCurrentPosition();
                    if (n3 != 0) {
                        n3 = ((k)object2).A;
                        MediaPlayer mediaPlayer = ((k)object2).f;
                        Intrinsics.checkNotNull(mediaPlayer);
                        n4 = mediaPlayer.getCurrentPosition();
                        if (n3 == n4) {
                            object3 = ((k)object2).c;
                            if (object3 == null) return;
                            object3 = new StringBuilder();
                            object = b2.P();
                            ((StringBuilder)object3).append((String)object);
                            object = ": After 3 Seconds, the video is still stuck. Going for onStartPrepare";
                            ((StringBuilder)object3).append((String)object);
                            object3 = ((StringBuilder)object3).toString();
                            Intrinsics.checkNotNullParameter(object3, string2);
                            object3 = JioAds.Companion;
                            object3 = ((JioAds$Companion)object3).getInstance();
                            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object2 = JioAds$LogLevel.NONE;
                            return;
                        }
                    }
                }
                object = ((k)object2).f;
                Intrinsics.checkNotNull(object);
                ((k)object2).A = n3 = object.getCurrentPosition();
                ((k)object2).B = false;
                return;
            }
            object3 = new StringBuilder();
            object = b2.P();
            ((StringBuilder)object3).append((String)object);
            object = ": MediaPlayer is empty inside Runnable";
            ((StringBuilder)object3).append((String)object);
            object3 = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullParameter(object3, string2);
            object3 = JioAds.Companion;
            object3 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            return;
        }
        object = new StringBuilder();
        object2 = ((k)object2).d.P();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": ");
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        com.jio.jioads.jioreel.tracker.model.b.e(exception2, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
    }
}

