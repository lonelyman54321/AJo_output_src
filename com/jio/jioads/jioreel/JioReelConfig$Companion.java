/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.jioreel;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.JioReelConfig;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import kotlin.jvm.internal.Intrinsics;

public final class JioReelConfig$Companion {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JioReelConfig config(Context object, JioReelListener jioReelListener) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    object2 = "context";
                    try {
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        object2 = "jioReelListener";
                        Intrinsics.checkNotNullParameter(jioReelListener, (String)object2);
                        object2 = "Inside JioReelConfig for getting the reelconfig instance";
                        String string2 = "message";
                        Intrinsics.checkNotNullParameter(object2, string2);
                        object2 = JioAds.Companion;
                        object2 = ((JioAds$Companion)object2).getInstance();
                        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object2 = JioAds$LogLevel.NONE;
                        object2 = JioReelConfig.access$getINSTANCE$cp();
                        if (object2 != null) break block3;
                        object2 = new JioReelConfig((Context)object, jioReelListener);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                JioReelConfig.access$setINSTANCE$cp((JioReelConfig)object2);
                object = JioReelConfig.access$getINSTANCE$cp();
                Intrinsics.checkNotNull(object);
                return object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setPlayer(ExoPlayer exoPlayer) {
        synchronized (this) {
            Object object = "exoPlayer";
            Intrinsics.checkNotNullParameter(exoPlayer, (String)object);
            object = "Inside setPlayer api fro exoplayer";
            String string2 = "message";
            Intrinsics.checkNotNullParameter(object, string2);
            object = JioAds.Companion;
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = JioReelConfig.access$getINSTANCE$cp();
            if (object != null) {
                JioReelConfig.access$setExoPlayer$p((JioReelConfig)object, exoPlayer);
            }
            return;
        }
    }
}

