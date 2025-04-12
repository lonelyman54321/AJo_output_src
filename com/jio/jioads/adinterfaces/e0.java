/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.W;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vmapbuilder.VmapResponseListeners;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class e0
implements VmapResponseListeners {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ W b;
    public final /* synthetic */ Integer c;

    public e0(JioAdView jioAdView, Integer n3, W w4) {
        this.a = jioAdView;
        this.b = w4;
        this.c = n3;
    }

    public final void onVmapErrorReceived(JioAdError jioAdError) {
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        JioAdView.access$adSelectionFailed(this.a, jioAdError, null, "getAds", "JioAdView");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onVmapResponseReceived(Object object, boolean bl2) {
        Exception exception2;
        Object object2;
        JioAdView jioAdView;
        Object object3;
        String string2;
        String string3;
        block13: {
            boolean bl3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            e0 e02;
            block10: {
                boolean bl4;
                block11: {
                    int n3;
                    block12: {
                        e02 = this;
                        object7 = object;
                        string3 = "";
                        string2 = "getAds";
                        object3 = "message";
                        jioAdView = this.a;
                        JioAdView$AdState jioAdView$AdState = jioAdView.getMAdState();
                        if (jioAdView$AdState == (object2 = JioAdView$AdState.DESTROYED)) return;
                        jioAdView$AdState = null;
                        try {
                            int n4;
                            object2 = new StringBuilder();
                            object6 = jioAdView.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            ((StringBuilder)object2).append((String)object6);
                            object6 = ": Inside getAds() responseListener";
                            ((StringBuilder)object2).append((String)object6);
                            object2 = ((StringBuilder)object2).toString();
                            Intrinsics.checkNotNullParameter(object2, (String)object3);
                            object2 = JioAds.Companion;
                            object6 = ((JioAds$Companion)object2).getInstance();
                            ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object6 = JioAds$LogLevel.NONE;
                            object6 = "JioAdView";
                            object5 = "No Ad in Inventory";
                            object4 = "adseq";
                            if (object == null || (n4 = Intrinsics.areEqual(object, string3))) break block10;
                            n4 = JioAdView.access$getMAdResponseType$p(jioAdView);
                            if (n4 != (n3 = 1)) break block11;
                            object6 = new StringBuilder();
                            object5 = jioAdView.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            ((StringBuilder)object6).append((String)object5);
                            object5 = ": Inside getAds: On Video Response Received";
                            ((StringBuilder)object6).append((String)object5);
                            object6 = ((StringBuilder)object6).toString();
                            Intrinsics.checkNotNullParameter(object6, (String)object3);
                            object6 = ((JioAds$Companion)object2).getInstance();
                            ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object6 = JioAdView.access$getAdsSelected$p(jioAdView);
                            if (object6 != null) break block12;
                            object6 = new ArrayList();
                            JioAdView.access$setAdsSelected$p(jioAdView, (ArrayList)object6);
                        }
                        catch (Exception exception2) {
                            break block13;
                        }
                    }
                    object6 = JioAdView.access$getAdsSelected$p(jioAdView);
                    Intrinsics.checkNotNull(object6);
                    object7 = object.toString();
                    ((ArrayList)object6).add(object7);
                    object7 = JioAdView.access$getMJioAdViewController$p(jioAdView);
                    int n7 = object7 != null && (object7 = ((o)object7).n((String)(object6 = "podc"))) != null ? (Integer)object7 : 1;
                    object6 = JioAdView.access$getMJioAdViewController$p(jioAdView);
                    if (object6 != null) {
                        ((o)object6).l();
                    }
                    object6 = new StringBuilder();
                    object5 = jioAdView.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    ((StringBuilder)object6).append((String)object5);
                    object5 = ": podc- ";
                    ((StringBuilder)object6).append((String)object5);
                    ((StringBuilder)object6).append(n7);
                    object6 = ((StringBuilder)object6).toString();
                    Intrinsics.checkNotNullParameter(object6, (String)object3);
                    object3 = ((JioAds$Companion)object2).getInstance();
                    ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (n7 != 0) {
                        int n8;
                        object3 = JioAdView.access$getAdsSelected$p(jioAdView);
                        if (object3 != null) {
                            n8 = ((ArrayList)object3).size();
                        } else {
                            n8 = 0;
                            object3 = null;
                        }
                        if (n7 != n8 && ((object7 = JioAdView.access$getMJioAdViewController$p(jioAdView)) == null || (n7 = (int)(((o)object7).o ? 1 : 0)) != 0)) {
                            object7 = JioAdView.access$getMJioAdViewController$p(jioAdView);
                            if (object7 != null) {
                                object7 = JioAdView.access$getMJioAdViewController$p(jioAdView);
                                Intrinsics.checkNotNull(object7);
                                object7.getClass();
                                object3 = "rs";
                                Intrinsics.checkNotNullParameter(e02, (String)object3);
                                ((o)object7).w = e02;
                                ((o)object7).A(n3 != 0);
                                return;
                            }
                            W w4 = e02.b;
                            JioAdView jioAdView2 = e02.a;
                            ArrayList arrayList = JioAdView.access$getAdsSelected$p(jioAdView2);
                            object7 = JioAdView.access$getMJioAdViewController$p(jioAdView);
                            Object object8 = object7 != null ? (object7 = ((o)object7).E((String)object4)) : null;
                            Integer n10 = JioAdView.access$getMCuePoint$p(jioAdView);
                            w4.b(jioAdView2, arrayList, (String)object8, n10, bl2);
                            return;
                        }
                    }
                    object2 = e02.b;
                    object6 = e02.a;
                    object5 = JioAdView.access$getAdsSelected$p((JioAdView)object6);
                    object7 = JioAdView.access$getMJioAdViewController$p(jioAdView);
                    object4 = object7 != null ? (object7 = ((o)object7).E((String)object4)) : null;
                    Integer n14 = JioAdView.access$getMCuePoint$p(jioAdView);
                    n3 = (int)(bl2 ? 1 : 0);
                    object2.b((JioAdView)object6, (ArrayList)object5, (String)object4, n14, bl2);
                    return;
                }
                object7 = JioAdView.access$getAdsSelected$p(jioAdView);
                if (object7 != null && !(bl4 = object7.isEmpty())) {
                    W w5 = this.b;
                    JioAdView jioAdView3 = this.a;
                    ArrayList arrayList = JioAdView.access$getAdsSelected$p(jioAdView3);
                    object7 = JioAdView.access$getMJioAdViewController$p(jioAdView);
                    Object object9 = object7 != null ? (object7 = ((o)object7).E((String)object4)) : null;
                    Integer n15 = JioAdView.access$getMCuePoint$p(jioAdView);
                    w5.b(jioAdView3, arrayList, (String)object9, n15, bl2);
                    return;
                }
                object7 = JioAdError.Companion;
                object3 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                object7.getClass();
                object7 = t_0.a((JioAdError$JioAdErrorType)((Object)object3));
                ((JioAdError)object7).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object5);
                JioAdView.access$adSelectionFailed(jioAdView, (JioAdError)object7, null, string2, (String)object6);
                return;
            }
            object7 = JioAdView.access$getAdsSelected$p(jioAdView);
            if (object7 != null && !(bl3 = object7.isEmpty())) {
                W w7 = e02.b;
                JioAdView jioAdView4 = e02.a;
                ArrayList arrayList = JioAdView.access$getAdsSelected$p(jioAdView4);
                object7 = JioAdView.access$getMJioAdViewController$p(jioAdView);
                Object object10 = object7 != null ? (object7 = ((o)object7).E((String)object4)) : null;
                Integer n16 = e02.c;
                w7.b(jioAdView4, arrayList, (String)object10, n16, bl2);
                return;
            }
            object7 = JioAdError.Companion;
            object3 = JioAdError$JioAdErrorType.ERROR_NOFILL;
            object7.getClass();
            object7 = t_0.a((JioAdError$JioAdErrorType)((Object)object3));
            ((JioAdError)object7).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object5);
            JioAdView.access$adSelectionFailed(jioAdView, (JioAdError)object7, null, string2, (String)object6);
            return;
        }
        object3 = new StringBuilder("Exception in onResponseReceived--> ");
        com.jio.jioads.jioreel.tracker.model.b.c(Utility.INSTANCE, exception2, (StringBuilder)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object11 = JioAds$LogLevel.NONE;
        object11 = JioAdError.Companion;
        object3 = JioAdError$JioAdErrorType.ERROR_PARSING;
        object2 = "Error in parsing getAd response";
        object11 = j_0.c((t_0)object11, (JioAdError$JioAdErrorType)((Object)object3), (String)object2);
        JioAdView.access$adSelectionFailed(jioAdView, (JioAdError)object11, null, string2, string3);
    }
}

