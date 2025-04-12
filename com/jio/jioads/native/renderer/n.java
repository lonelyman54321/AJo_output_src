/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.utils.f;
import com.jio.jioads.utils.i;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class n
implements f {
    public final /* synthetic */ NativeAdViewRenderer a;
    public final /* synthetic */ HashMap b;

    public n(NativeAdViewRenderer nativeAdViewRenderer, HashMap hashMap) {
        this.a = nativeAdViewRenderer;
        this.b = hashMap;
    }

    public final void a(HashMap object) {
        block7: {
            Object object2;
            NativeAdViewRenderer nativeAdViewRenderer;
            block8: {
                String string2;
                JioAdView$AdState jioAdView$AdState;
                nativeAdViewRenderer = this.a;
                object2 = nativeAdViewRenderer.getIJioAdView().k0();
                if (object2 == (jioAdView$AdState = JioAdView$AdState.DESTROYED)) break block7;
                if (object == null) break block8;
                NativeAdViewRenderer.access$setFileDownloaderCallbackResponses$p(nativeAdViewRenderer, object);
                object2 = NativeAdViewRenderer.access$getImageDetailMap$p(nativeAdViewRenderer).keySet().iterator();
                int n3 = 1;
                boolean bl2 = true;
                while (true) {
                    int n4;
                    block10: {
                        Object object3;
                        block11: {
                            String string3;
                            Object object4;
                            String string4;
                            block9: {
                                boolean bl3;
                                n4 = object2.hasNext();
                                string2 = "message";
                                if (n4 == 0) break;
                                string4 = (String)object2.next();
                                object4 = NativeAdViewRenderer.access$getImageDetailMap$p(nativeAdViewRenderer).get(string4);
                                string3 = ":  Rendition of image for key ";
                                if (object4 == null || !(bl3 = object.containsKey(string4))) break block9;
                                object4 = (i)object.get(string4);
                                if (object4 != null) {
                                    object4 = ((i)object4).b;
                                } else {
                                    bl3 = false;
                                    object4 = null;
                                }
                                if (object4 != null) break block10;
                                object3 = new StringBuilder();
                                object4 = nativeAdViewRenderer.getIJioAdView().P();
                                object3.append((String)object4);
                                object3.append(string3);
                                object3.append(string4);
                                string4 = " unsuccessful downloadAllMediaFileAndSetToView ";
                                object3.append(string4);
                                Intrinsics.checkNotNullParameter(object3.toString(), string2);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object3 = JioAds$LogLevel.NONE;
                                break block11;
                            }
                            object3 = new StringBuilder();
                            object4 = nativeAdViewRenderer.getIJioAdView().P();
                            object3.append((String)object4);
                            object3.append(string3);
                            object3.append(string4);
                            string4 = " unsuccessful";
                            object3.append(string4);
                            Intrinsics.checkNotNullParameter(object3.toString(), string2);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object3 = JioAds$LogLevel.NONE;
                        }
                        bl2 = false;
                        object3 = null;
                    }
                    n4 = NativeAdViewRenderer.access$getImageCount$p(nativeAdViewRenderer) + n3;
                    NativeAdViewRenderer.access$setImageCount$p(nativeAdViewRenderer, n4);
                }
                object = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
                if (object != null) {
                    int n7;
                    object = this.b;
                    int n8 = object.size();
                    if (n8 == (n7 = NativeAdViewRenderer.access$getImageCount$p(nativeAdViewRenderer))) {
                        if (bl2) {
                            object = new StringBuilder();
                            object2 = nativeAdViewRenderer.getIJioAdView().P();
                            ((StringBuilder)object).append((String)object2);
                            object2 = ": file downloaded Successfully custom native";
                            ((StringBuilder)object).append((String)object2);
                            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string2);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object = JioAds$LogLevel.NONE;
                            n8 = nativeAdViewRenderer.getShouldShowCarousel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ^ n3;
                            NativeAdViewRenderer.access$preparedAllViewsForRenderCustomNative(nativeAdViewRenderer, n8 != 0);
                        }
                    } else {
                        object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                        object2 = "Native ad rendition error in imageToDl 1";
                        NativeAdViewRenderer.access$setNativeError(nativeAdViewRenderer, (String)object2, (JioAdError$JioAdErrorType)((Object)object));
                    }
                    NativeAdViewRenderer.access$setImageCount$p(nativeAdViewRenderer, 0);
                }
                break block7;
            }
            object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
            object2 = "Native ad rendition error response null ";
            NativeAdViewRenderer.access$setNativeError(nativeAdViewRenderer, (String)object2, (JioAdError$JioAdErrorType)((Object)object));
        }
    }
}

