/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.text.TextUtils
 */
package com.jio.jioads.instream.audio.mediaplayerforaudio;

import android.media.MediaPlayer;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instream.audio.mediaplayerforaudio.e;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

public final class b
implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ e a;

    public /* synthetic */ b(e e2) {
        this.a = e2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onPrepared(MediaPlayer object) {
        Exception exception2;
        Object object2;
        CharSequence charSequence;
        block3: {
            int n3;
            int n4;
            block2: {
                object = this.a;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object.j = n4 = object.f;
                charSequence = "message";
                Intrinsics.checkNotNullParameter("onPrepared of audioMedia player", charSequence);
                Object object3 = JioAds.Companion;
                ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = "onPrepared calling from player";
                try {
                    Intrinsics.checkNotNullParameter(object2, charSequence);
                    object3 = ((JioAds$Companion)object3).getInstance();
                    ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = object.m;
                    if (object3 == null) break block2;
                    object3.f();
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            if ((n4 = object.k) != (n3 = object.g)) return;
            object.start();
            return;
        }
        charSequence = new StringBuilder("Exception while preparing audio ad ");
        object2 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception2, (StringBuilder)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        object = object.o;
        if (object == null) return;
        TextUtils.isEmpty((CharSequence)object);
    }
}

