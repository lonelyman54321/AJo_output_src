/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.native.parser.a;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.utils.f;
import com.jio.jioads.utils.i;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class o
implements f {
    public final /* synthetic */ NativeAdViewRenderer a;

    public o(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final void a(HashMap object) {
        Object object2;
        NativeAdViewRenderer nativeAdViewRenderer = this.a;
        Object object3 = nativeAdViewRenderer.getIJioAdView().k0();
        if (object3 != (object2 = JioAdView$AdState.DESTROYED)) {
            boolean bl2;
            if (object != null && !(bl2 = object.isEmpty())) {
                boolean bl3;
                NativeAdViewRenderer.access$setFileDownloaderCallbackResponses$p(nativeAdViewRenderer, object);
                object3 = object.keySet().iterator();
                while (bl3 = object3.hasNext()) {
                    object2 = (String)object3.next();
                    Object object4 = (object2 = (i)object.get(object2)) != null ? ((i)object2).b : null;
                    if (object4 == null || (object4 = NativeAdViewRenderer.access$getJioAdParser$p(nativeAdViewRenderer)) == null) continue;
                    String string2 = ((i)object2).a;
                    object2 = (byte[])((i)object2).b;
                    try {
                        object4 = ((a)object4).C;
                        if (object4 == null) continue;
                    }
                    catch (Exception exception) {}
                    object4.putOpt(string2, object2);
                }
                object = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
                if (object != null) {
                    object3 = NativeAdViewRenderer.access$getJioAdParser$p(nativeAdViewRenderer);
                    object.c((a)object3);
                }
                object = new StringBuilder();
                object3 = nativeAdViewRenderer.getIJioAdView().P();
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(": File downloaded successfully");
                object = ((StringBuilder)object).toString();
                object3 = "message";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                NativeAdViewRenderer.access$cacheAndPrepareAd(nativeAdViewRenderer);
            } else {
                object = JioAdError$JioAdErrorType.ERROR_IMAGE_DOWNLOAD;
                object3 = "Error while downloading native ad";
                NativeAdViewRenderer.access$setNativeError(nativeAdViewRenderer, (String)object3, (JioAdError$JioAdErrorType)((Object)object));
            }
        }
    }
}

