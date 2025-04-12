/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.c;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.native.NativeAdController;
import com.jio.jioads.native.parser.a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k
extends Lambda
implements Function1 {
    public final /* synthetic */ NativeAdController c;
    public final /* synthetic */ a d;
    public final /* synthetic */ Map e;

    public k(NativeAdController nativeAdController, a a2, Map map2) {
        this.c = nativeAdController;
        this.d = a2;
        this.e = map2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (m)object;
        Object object2 = this.c;
        com.jio.jioads.controller.a a2 = NativeAdController.access$getJioAdCallback$p((NativeAdController)object2);
        object2 = NativeAdController.access$getIJioAdViewController$p((NativeAdController)object2);
        a2 = (V)a2;
        a2.getClass();
        a a3 = this.d;
        Intrinsics.checkNotNullParameter(a3, "nativeAd");
        Intrinsics.checkNotNullParameter(object2, "iJioAdViewController");
        Map map2 = this.e;
        Intrinsics.checkNotNullParameter(map2, "headers");
        Object object3 = new StringBuilder();
        String string2 = ((V)a2).b;
        j_0.k(object3, string2, " Callback prepareCustomAdData");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        ((V)a2).a.prepareCustomAdData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(a3, (m)object, (c)object2, map2);
        return Unit.a;
    }
}

