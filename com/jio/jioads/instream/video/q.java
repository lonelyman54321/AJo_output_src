/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.video.InstreamVideoInfiniteAdFetcher;
import com.jio.jioads.multiad.f_0;
import com.jio.jioads.multiad.model.a;
import com.jio.jioads.multiad.model.c;
import com.jio.jioads.multiad.model.e;
import kotlin.jvm.internal.Intrinsics;

public final class q
implements f_0 {
    public final /* synthetic */ InstreamVideoInfiniteAdFetcher a;

    public q(InstreamVideoInfiniteAdFetcher instreamVideoInfiniteAdFetcher) {
        this.a = instreamVideoInfiniteAdFetcher;
    }

    public final void a(a object, com.jio.jioads.multiad.model.f object2, String object3) {
        object3 = this.a;
        Object object4 = InstreamVideoInfiniteAdFetcher.access$getIJioAdView$p((InstreamVideoInfiniteAdFetcher)object3).k0();
        Object object5 = JioAdView$AdState.FAILED;
        Object object6 = "message";
        if (object4 != object5 && (object4 = InstreamVideoInfiniteAdFetcher.access$getIJioAdView$p((InstreamVideoInfiniteAdFetcher)object3).k0()) != (object5 = JioAdView$AdState.DESTROYED)) {
            boolean bl2;
            object4 = null;
            if (object != null) {
                object5 = ((a)object).b;
            } else {
                bl2 = false;
                object5 = null;
            }
            if (object5 != null) {
                object5 = ((f)InstreamVideoInfiniteAdFetcher.access$getIJioAdViewController$p((InstreamVideoInfiniteAdFetcher)object3)).i().b;
                if (object5 != null) {
                    object4 = ((e)object5).b;
                }
                bl2 = true;
                InstreamVideoInfiniteAdFetcher.access$processSelectedAd((InstreamVideoInfiniteAdFetcher)object3, (a)object, (com.jio.jioads.multiad.model.f)object2, (c)object4, bl2);
            } else {
                object = ((f)InstreamVideoInfiniteAdFetcher.access$getIJioAdViewController$p((InstreamVideoInfiniteAdFetcher)object3)).a;
                boolean bl3 = ((o)object).o;
                if (!bl3 && !(bl3 = ((o)(object = ((f)InstreamVideoInfiniteAdFetcher.access$getIJioAdViewController$p((InstreamVideoInfiniteAdFetcher)object3)).a)).g0())) {
                    object = new StringBuilder();
                    object2 = InstreamVideoInfiniteAdFetcher.access$getIJioAdView$p((InstreamVideoInfiniteAdFetcher)object3).P();
                    ((StringBuilder)object).append((String)object2);
                    object2 = " No Production ads available. Checking if Backup Ad Available locally";
                    ((StringBuilder)object).append((String)object2);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object6);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    InstreamVideoInfiniteAdFetcher.access$getBackupAd((InstreamVideoInfiniteAdFetcher)object3);
                } else {
                    Intrinsics.checkNotNullParameter("Ignoring backup ad selection incase of hybrid multi ad", (String)object6);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = JioAdError.Companion;
                    object2 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                    object4 = "No ad in Inventory";
                    object6 = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), (String)object4);
                    object5 = InstreamVideoInfiniteAdFetcher.access$getOnError$p((InstreamVideoInfiniteAdFetcher)object3);
                    Boolean bl4 = Boolean.FALSE;
                    d d2 = d.a;
                    String string2 = "Ignoring backup ad selection incase of hybrid multi ad";
                    String string3 = "getProductionAd";
                    String string4 = "InstreamVideoInfiniteAdFetcher";
                    object5.invoke(object6, bl4, (Object)d2, string3, string4, string2);
                }
            }
            return;
        }
        object = new StringBuilder();
        object2 = InstreamVideoInfiniteAdFetcher.access$getIJioAdView$p((InstreamVideoInfiniteAdFetcher)object3).P();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": JioAdView state is destroyed so returning from getProductionAd() of  InstreamVideoInfiniteAdFetcher");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object6);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }
}

