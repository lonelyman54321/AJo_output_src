/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.common.e;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.native.renderer.NativeAdViewRenderer$handleNativeAdClick$1$onAdClickSuccess$1;

public final class p
implements e {
    public final /* synthetic */ NativeAdViewRenderer a;

    public p(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final void a() {
        JioAdView$AdState jioAdView$AdState;
        NativeAdViewRenderer nativeAdViewRenderer = this.a;
        Object object = nativeAdViewRenderer.getIJioAdView().k0();
        if (object != (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
            NativeAdViewRenderer.access$adClicked(nativeAdViewRenderer);
            object = new NativeAdViewRenderer$handleNativeAdClick$1$onAdClickSuccess$1(nativeAdViewRenderer);
            ((Thread)object).start();
        }
    }

    public final void b() {
    }
}

