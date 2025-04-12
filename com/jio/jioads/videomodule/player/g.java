/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 */
package com.jio.jioads.videomodule.player;

import android.media.MediaPlayer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.videomodule.player.k;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import kotlin.jvm.internal.Intrinsics;

public final class g
implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ k a;

    public /* synthetic */ g(k k2) {
        this.a = k2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCompletion(MediaPlayer object) {
        Exception exception2;
        Object object2;
        CharSequence charSequence;
        block5: {
            Object object3;
            Object object4;
            block4: {
                int n3;
                block3: {
                    object = ": Media player ";
                    charSequence = "message";
                    object2 = this.a;
                    object4 = "this$0";
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    try {
                        object4 = new StringBuilder();
                        object3 = ((k)object2).d;
                        object3 = object3.P();
                        ((StringBuilder)object4).append((String)object3);
                        ((StringBuilder)object4).append((String)object);
                        n3 = ((k)object2).b;
                        ((StringBuilder)object4).append(n3);
                        object3 = " OnComplete listener ";
                        ((StringBuilder)object4).append((String)object3);
                        object3 = ((k)object2).f;
                        if (object3 == null) break block3;
                        n3 = object3.getCurrentPosition();
                        object3 = n3;
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                n3 = 0;
                object3 = null;
            }
            ((StringBuilder)object4).append(object3);
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object4, (String)charSequence);
            object4 = JioAds.Companion;
            object3 = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = new StringBuilder();
            Object object5 = ((k)object2).d;
            object5 = object5.P();
            ((StringBuilder)object3).append((String)object5);
            ((StringBuilder)object3).append((String)object);
            int n4 = ((k)object2).u;
            ((StringBuilder)object3).append(n4 != 0);
            object = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullParameter(object, (String)charSequence);
            object = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            n4 = ((k)object2).u;
            if (n4 != 0) {
                object = ((k)object2).c;
                if (object == null) return;
                object.c();
                return;
            }
            object = JioPlayerState.COMPLETED;
            ((k)object2).i = object;
            ((k)object2).j = n4 = -1;
            object = ((k)object2).c;
            if (object == null) return;
            charSequence = null;
            object.a(false);
            return;
        }
        charSequence = new StringBuilder();
        object2 = ((k)object2).d.P();
        ((StringBuilder)charSequence).append((String)object2);
        ((StringBuilder)charSequence).append(": ");
        object2 = "<this>";
        Intrinsics.checkNotNullParameter(exception2, (String)object2);
        b.e(exception2, (StringBuilder)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

