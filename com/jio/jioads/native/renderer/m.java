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

public final class m
implements f {
    public final /* synthetic */ NativeAdViewRenderer a;
    public final /* synthetic */ HashMap b;

    public m(NativeAdViewRenderer nativeAdViewRenderer, HashMap hashMap) {
        this.a = nativeAdViewRenderer;
        this.b = hashMap;
    }

    public final void a(HashMap object) {
        block7: {
            Object object2;
            NativeAdViewRenderer nativeAdViewRenderer;
            block8: {
                int n3;
                int n4;
                int n7;
                JioAdView$AdState jioAdView$AdState;
                nativeAdViewRenderer = this.a;
                object2 = nativeAdViewRenderer.getIJioAdView().k0();
                if (object2 == (jioAdView$AdState = JioAdView$AdState.DESTROYED)) break block7;
                NativeAdViewRenderer.access$setFileDownloaderCallbackResponses$p(nativeAdViewRenderer, object);
                if (object == null) break block8;
                object2 = NativeAdViewRenderer.access$getImageDetailMap$p(nativeAdViewRenderer).keySet().iterator();
                int n8 = 1;
                boolean bl2 = true;
                while ((n7 = object2.hasNext()) != 0) {
                    block10: {
                        Object object3;
                        block11: {
                            String string2;
                            String string3;
                            Object object4;
                            String string4;
                            block9: {
                                boolean bl3;
                                string4 = (String)object2.next();
                                NativeAdViewRenderer.access$setFileDownloaderCallbackResponses$p(nativeAdViewRenderer, object);
                                object4 = NativeAdViewRenderer.access$getImageDetailMap$p(nativeAdViewRenderer).get(string4);
                                string3 = "message";
                                string2 = ":  Rendition of image for key ";
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
                                object3.append(string2);
                                object3.append(string4);
                                string4 = " unsuccessful ";
                                object3.append(string4);
                                Intrinsics.checkNotNullParameter(object3.toString(), string3);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object3 = JioAds$LogLevel.NONE;
                                break block11;
                            }
                            object3 = new StringBuilder();
                            object4 = nativeAdViewRenderer.getIJioAdView().P();
                            object3.append((String)object4);
                            object3.append(string2);
                            object3.append(string4);
                            string4 = " unsuccessful";
                            object3.append(string4);
                            Intrinsics.checkNotNullParameter(object3.toString(), string3);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object3 = JioAds$LogLevel.NONE;
                        }
                        bl2 = false;
                        object3 = null;
                    }
                    n7 = NativeAdViewRenderer.access$getImageCount$p(nativeAdViewRenderer) + n8;
                    NativeAdViewRenderer.access$setImageCount$p(nativeAdViewRenderer, n7);
                }
                object = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
                if (object != null && (n4 = (object = this.b).size()) == (n3 = NativeAdViewRenderer.access$getImageCount$p(nativeAdViewRenderer))) {
                    if (bl2) {
                        object = NativeAdViewRenderer.access$getNewOrienation$p(nativeAdViewRenderer);
                        if (object == null) {
                            NativeAdViewRenderer.access$preparedAllViewsForRender(nativeAdViewRenderer, n8 != 0);
                        }
                    } else {
                        object = JioAdError$JioAdErrorType.ERROR_MEDIA_FILES_EMPTY;
                        object2 = "Native ad rendition error in imageToDl not custom";
                        NativeAdViewRenderer.access$setNativeError(nativeAdViewRenderer, (String)object2, (JioAdError$JioAdErrorType)((Object)object));
                    }
                    NativeAdViewRenderer.access$setImageCount$p(nativeAdViewRenderer, 0);
                }
                break block7;
            }
            object = JioAdError$JioAdErrorType.ERROR_MEDIA_FILES_EMPTY;
            object2 = "Native ad rendition error getting imageDetailMap null";
            NativeAdViewRenderer.access$setNativeError(nativeAdViewRenderer, (String)object2, (JioAdError$JioAdErrorType)((Object)object));
        }
    }
}

