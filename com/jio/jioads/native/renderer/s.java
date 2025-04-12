/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.native.renderer.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s
extends Lambda
implements Function0 {
    public final /* synthetic */ NativeAdViewRenderer c;

    public s(NativeAdViewRenderer nativeAdViewRenderer) {
        this.c = nativeAdViewRenderer;
        super(0);
    }

    public final Object invoke() {
        Enum enum_;
        NativeAdViewRenderer nativeAdViewRenderer = this.c;
        Object object = nativeAdViewRenderer.getIJioAdView().k0();
        if (object != (enum_ = JioAdView$AdState.DESTROYED)) {
            NativeAdViewRenderer.access$loadView(nativeAdViewRenderer);
            object = nativeAdViewRenderer.getIJioAdView().K();
            enum_ = JioAdView$AD_TYPE.CUSTOM_NATIVE;
            if (object == enum_) {
                NativeAdViewRenderer.access$setupCTAButtonForCustomNativeAd(nativeAdViewRenderer);
            } else {
                NativeAdViewRenderer.access$setNativeAdClickUrls(nativeAdViewRenderer);
            }
            object = new r(nativeAdViewRenderer);
            long l2 = 500L;
            com.jio.jioads.util.s.b(l2, (Function0)object);
        }
        return Unit.a;
    }
}

