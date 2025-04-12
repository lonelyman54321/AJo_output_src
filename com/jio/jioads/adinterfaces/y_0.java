/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.jio.jioads.adinterfaces;

import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import com.jio.jioads.adinterfaces.u_0;
import com.jio.jioads.adinterfaces.v_0;
import com.jio.jioads.adinterfaces.w_0;
import com.jio.jioads.adinterfaces.x;
import com.jio.jioads.util.s;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.adinterfaces.y
 */
public final class y_0
implements JioVmapAdsLoader$JioVmapListener {
    public final /* synthetic */ JioVmapAdsLoader a;

    public y_0(JioVmapAdsLoader jioVmapAdsLoader) {
        this.a = jioVmapAdsLoader;
    }

    public final void notifyPlayerTime() {
        Intrinsics.checkNotNullParameter("Notify Player Time", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        JioVmapAdsLoader jioVmapAdsLoader = this.a;
        object = new v_0(jioVmapAdsLoader);
        s.d((Function0)object);
    }

    public final void onJioVmapAdsLoaded(List list) {
        Intrinsics.checkNotNullParameter(list, "cuePoints");
        Intrinsics.checkNotNullParameter("onJioVmapAdsLoaded()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Enum enum_ = JioAds$LogLevel.NONE;
        JioVmapAdsLoader jioVmapAdsLoader = this.a;
        JioVmapAdsLoader.access$setVmapLoaded$p(jioVmapAdsLoader, true);
        enum_ = JioAdView$AdState.RECEIVED;
        JioVmapAdsLoader.access$setAdState$p(jioVmapAdsLoader, (JioAdView$AdState)enum_);
        Object object = Looper.getMainLooper();
        enum_ = new Handler(object);
        object = new w_0(jioVmapAdsLoader, list);
        enum_.post((Runnable)object);
    }

    public final void onJioVmapError(JioAdError jioAdError) {
        Intrinsics.checkNotNullParameter(jioAdError, "error");
        Object object = new StringBuilder("onJioVmapError: ");
        Object object2 = jioAdError.getErrorDescription();
        object.append((String)object2);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        JioVmapAdsLoader jioVmapAdsLoader = this.a;
        object2 = new pn_0(3, jioVmapAdsLoader, jioAdError);
        object.post((Runnable)object2);
    }

    public final void onJioVmapEvent(JioAdEvent jioAdEvent, HashMap object) {
        Object object2;
        Intrinsics.checkNotNullParameter(jioAdEvent, "event");
        object = new StringBuilder("Giving onJioVmapEvent : ");
        Object object3 = jioAdEvent.getType();
        ((StringBuilder)object).append(object3);
        object = ((StringBuilder)object).toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = jioAdEvent.getType();
        if (object == null) {
            object2 = -1;
        } else {
            object3 = u_0.$EnumSwitchMapping$0;
            object2 = ((Enum)object).ordinal();
            object2 = (Object)object3[object2];
        }
        int n3 = 1;
        JioVmapAdsLoader jioVmapAdsLoader = this.a;
        if (object2 != n3) {
            n3 = 2;
            if (object2 != n3) {
                n3 = 3;
                if (object2 == n3) {
                    object = JioAdView$AdState.NOT_REQUESTED;
                    JioVmapAdsLoader.access$setAdState$p(jioVmapAdsLoader, (JioAdView$AdState)((Object)object));
                }
            } else {
                JioVmapAdsLoader.access$stopPlayerTimeObserver(jioVmapAdsLoader);
            }
        } else {
            object = JioAdView$AdState.PREPARED;
            JioVmapAdsLoader.access$setAdState$p(jioVmapAdsLoader, (JioAdView$AdState)((Object)object));
        }
        object3 = Looper.getMainLooper();
        object = new Handler((Looper)object3);
        object3 = new x(jioVmapAdsLoader, jioAdEvent);
        object.post((Runnable)object3);
    }
}

