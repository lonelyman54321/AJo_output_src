/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.os.Handler
 */
package com.jio.jioads.videomodule.player;

import android.media.MediaPlayer;
import android.os.Handler;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.videomodule.player.h;
import com.jio.jioads.videomodule.player.k;
import kotlin.jvm.internal.Intrinsics;

public final class i
implements MediaPlayer.OnBufferingUpdateListener {
    public final /* synthetic */ k a;

    public /* synthetic */ i(k k2) {
        this.a = k2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onBufferingUpdate(MediaPlayer object, int n3) {
        Exception exception2;
        k k2;
        String string2;
        block6: {
            int n4;
            int n7;
            h h3;
            Handler handler;
            int n8;
            string2 = "message";
            k2 = this.a;
            Object object2 = "this$0";
            Intrinsics.checkNotNullParameter(k2, (String)object2);
            try {
                k2.p = n3;
                object2 = k2.d;
            }
            catch (Exception exception2) {
                break block6;
            }
            {
                n8 = k2.A;
                handler = k2.C;
                h3 = k2.D;
            }
            if (n8 != 0 && (n8 = object.getCurrentPosition()) != 0 && (n8 = k2.A) == (n7 = object.getCurrentPosition())) {
                Object object3 = new StringBuilder();
                String string3 = object2.P();
                ((StringBuilder)object3).append(string3);
                string3 = ": Media Player ";
                ((StringBuilder)object3).append(string3);
                n7 = k2.b;
                ((StringBuilder)object3).append(n7);
                string3 = " OnBufferingUpdateListener(), Percent = ";
                ((StringBuilder)object3).append(string3);
                ((StringBuilder)object3).append(n3);
                string3 = ", Position = ";
                ((StringBuilder)object3).append(string3);
                int n10 = object.getCurrentPosition();
                ((StringBuilder)object3).append(n10);
                object = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object, string2);
                object = JioAds.Companion;
                object3 = ((JioAds$Companion)object).getInstance();
                ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = new StringBuilder();
                string3 = object2.P();
                ((StringBuilder)object3).append(string3);
                string3 = ": Stucked Video !!!";
                ((StringBuilder)object3).append(string3);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, string2);
                object3 = ((JioAds$Companion)object).getInstance();
                ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                n8 = 100;
                if (n3 == n8 && (n3 = (int)(k2.B ? 1 : 0)) == 0) {
                    n10 = 1;
                    k2.B = n10;
                    long l2 = 3000L;
                    handler.postDelayed((Runnable)h3, l2);
                    return;
                }
                CharSequence charSequence = new StringBuilder();
                object2 = object2.P();
                charSequence.append((String)object2);
                object2 = ": Handler is already initiated or buffer percent is not 100";
                charSequence.append((String)object2);
                charSequence = charSequence.toString();
                Intrinsics.checkNotNullParameter(charSequence, string2);
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                return;
            }
            k2.A = n4 = object.getCurrentPosition();
            handler.removeCallbacks((Runnable)h3);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        string2 = k2.d.P();
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        string2 = "<this>";
        Intrinsics.checkNotNullParameter(exception2, string2);
        b.e(exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

