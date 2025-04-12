/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video;

import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.controller.f;
import com.jio.jioads.instream.video.InstreamVideoInfiniteAdFetcher;
import com.jio.jioads.multiad.f_0;
import com.jio.jioads.multiad.model.a;
import com.jio.jioads.multiad.model.c;
import com.jio.jioads.multiad.model.e;
import kotlin.jvm.internal.Intrinsics;

public final class p
implements f_0 {
    public final /* synthetic */ InstreamVideoInfiniteAdFetcher a;

    public p(InstreamVideoInfiniteAdFetcher instreamVideoInfiniteAdFetcher) {
        this.a = instreamVideoInfiniteAdFetcher;
    }

    public final void a(a object, com.jio.jioads.multiad.model.f object2, String object3) {
        JioAdView$AdState jioAdView$AdState;
        object3 = this.a;
        Object object4 = InstreamVideoInfiniteAdFetcher.access$getIJioAdView$p((InstreamVideoInfiniteAdFetcher)object3).k0();
        if (object4 != (jioAdView$AdState = JioAdView$AdState.FAILED) && (object4 = InstreamVideoInfiniteAdFetcher.access$getIJioAdView$p((InstreamVideoInfiniteAdFetcher)object3).k0()) != (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
            object4 = ((f)InstreamVideoInfiniteAdFetcher.access$getIJioAdViewController$p((InstreamVideoInfiniteAdFetcher)object3)).i().b;
            object4 = object4 != null ? ((e)object4).b : null;
            InstreamVideoInfiniteAdFetcher.access$processSelectedAd((InstreamVideoInfiniteAdFetcher)object3, (a)object, (com.jio.jioads.multiad.model.f)object2, (c)object4, false);
            return;
        }
        object = new StringBuilder();
        object2 = InstreamVideoInfiniteAdFetcher.access$getIJioAdView$p((InstreamVideoInfiniteAdFetcher)object3).P();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": JioAdView state is destroyed so returning from getBackupAd() of  InstreamVideoInfiniteAdFetcher");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }
}

