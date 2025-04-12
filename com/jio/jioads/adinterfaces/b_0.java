/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader;
import com.jio.jioads.adinterfaces.t_0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from com.jio.jioads.adinterfaces.B
 */
public final class b_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ JioVmapAdsLoader d;

    public b_0(Ref$ObjectRef ref$ObjectRef, JioVmapAdsLoader jioVmapAdsLoader) {
        this.c = ref$ObjectRef;
        this.d = jioVmapAdsLoader;
        super(0);
    }

    public final Object invoke() {
        Object object = JioAdError.Companion;
        Object object2 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
        object.getClass();
        object = t_0.a((JioAdError$JioAdErrorType)((Object)object2));
        object2 = (String)this.c.element;
        ((JioAdError)object).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
        object2 = this.d;
        JioAdView jioAdView = JioVmapAdsLoader.access$getMJioAdView$p((JioVmapAdsLoader)object2);
        if (jioAdView != null) {
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.FAILED;
            jioAdView.setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(jioAdView$AdState);
        }
        object2 = JioVmapAdsLoader.access$getJioVmapListener$p((JioVmapAdsLoader)object2);
        if (object2 != null) {
            object2.onJioVmapError((JioAdError)object);
        }
        return Unit.a;
    }
}

