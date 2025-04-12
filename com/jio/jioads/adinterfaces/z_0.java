/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.jio.jioads.adinterfaces;

import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdsLoaderListener;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$VMAPInfo;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$VMAPInfoWithID;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.adinterfaces.z
 */
public final class z_0
implements JioAdsLoaderListener {
    public final /* synthetic */ JioVmapAdsLoader a;
    public final /* synthetic */ JioVmapAdsLoader$VMAPInfoWithID b;

    public z_0(JioVmapAdsLoader jioVmapAdsLoader, JioVmapAdsLoader$VMAPInfoWithID jioVmapAdsLoader$VMAPInfoWithID) {
        this.a = jioVmapAdsLoader;
        this.b = jioVmapAdsLoader$VMAPInfoWithID;
    }

    public final void onAdsLoadingError(JioAdError jioAdError) {
        JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener;
        if (jioAdError != null && (jioVmapAdsLoader$JioVmapListener = JioVmapAdsLoader.access$getJioVmapListener$p(this.a)) != null) {
            jioVmapAdsLoader$JioVmapListener.onJioVmapError(jioAdError);
        }
    }

    public final void onAdsUrlLoaded(String string2) {
        Object object;
        Intrinsics.checkNotNullParameter(string2, "vmapUrl");
        JioVmapAdsLoader jioVmapAdsLoader = this.a;
        Object object2 = JioVmapAdsLoader.access$getMJioAdView$p(jioVmapAdsLoader);
        if (object2 != null) {
            object = JioAdView$AdState.CLOSED;
            ((JioAdView)object2).setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdView$AdState)((Object)object));
        }
        object2 = this.b;
        ViewGroup viewGroup = ((JioVmapAdsLoader$VMAPInfoWithID)object2).getAdContainer();
        Integer n3 = ((JioVmapAdsLoader$VMAPInfoWithID)object2).getThreshold();
        JioAdsMetadata jioAdsMetadata = ((JioVmapAdsLoader$VMAPInfoWithID)object2).getAdTargetting();
        object = object2;
        object2 = new JioVmapAdsLoader$VMAPInfo(jioAdsMetadata, n3, viewGroup, string2, null, null, null);
        jioVmapAdsLoader.requestVmap((JioVmapAdsLoader$VMAPInfo)object2, false);
    }
}

