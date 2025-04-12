/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.C;
import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$MediaPlayBack;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import kotlin.jvm.internal.Intrinsics;

public final class I
implements Runnable {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ String b;
    public final /* synthetic */ JioAdView$MediaPlayBack c;

    public /* synthetic */ I(JioAdView jioAdView, String string2, JioAdView$MediaPlayBack jioAdView$MediaPlayBack) {
        this.a = jioAdView;
        this.b = string2;
        this.c = jioAdView$MediaPlayBack;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$adspotId");
        JioAdView$MediaPlayBack jioAdView$MediaPlayBack = this.c;
        Intrinsics.checkNotNullParameter((Object)jioAdView$MediaPlayBack, "$playbackChange");
        Object object3 = JioAdView.access$getMJioVmapListener$p((JioAdView)object);
        String string2 = "message";
        if (object3 != null) {
            object3 = nn_2.a(object2, ": vmap: playbackChange ");
            object2 = jioAdView$MediaPlayBack.name();
            ((StringBuilder)object3).append((String)object2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = ((JioAdView)object).getMAdState();
            object2 = JioAdView$AdState.DESTROYED;
            if (object3 != object2) {
                object3 = C.$EnumSwitchMapping$0;
                int n3 = jioAdView$MediaPlayBack.ordinal();
                Object object4 = object3[n3];
                n3 = 1;
                jioAdView$MediaPlayBack = null;
                if (object4 != n3) {
                    n3 = 2;
                    if (object4 == n3) {
                        object3 = JioAdView.access$getMJioVmapListener$p((JioAdView)object);
                        Intrinsics.checkNotNull(object3);
                        object2 = JioAdEvent$AdEventType.RESUMED;
                        object = new JioAdEvent((JioAdEvent$AdEventType)((Object)object2));
                        object3.onJioVmapEvent((JioAdEvent)object, null);
                    }
                } else {
                    object3 = JioAdView.access$getMJioVmapListener$p((JioAdView)object);
                    Intrinsics.checkNotNull(object3);
                    object2 = JioAdEvent$AdEventType.PAUSED;
                    object = new JioAdEvent((JioAdEvent$AdEventType)((Object)object2));
                    object3.onJioVmapEvent((JioAdEvent)object, null);
                }
            }
        } else {
            object3 = nn_2.a(object2, ": onMediaPlaybackChange ");
            object2 = jioAdView$MediaPlayBack.name();
            ((StringBuilder)object3).append((String)object2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = ((JioAdView)object).getMAdState();
            object2 = JioAdView$AdState.DESTROYED;
            if (object3 != object2 && (object3 = ((JioAdView)object).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                ((JioAdListener)object3).onMediaPlaybackChange((JioAdView)object, jioAdView$MediaPlayBack);
            }
        }
    }
}

