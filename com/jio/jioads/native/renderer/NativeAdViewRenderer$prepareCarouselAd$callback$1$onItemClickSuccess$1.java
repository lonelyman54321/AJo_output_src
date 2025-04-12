/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.native.renderer.NativeAdViewRenderer;

public final class NativeAdViewRenderer$prepareCarouselAd$callback$1$onItemClickSuccess$1
extends Thread {
    public final /* synthetic */ NativeAdViewRenderer a;

    public NativeAdViewRenderer$prepareCarouselAd$callback$1$onItemClickSuccess$1(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final void run() {
        NativeAdViewRenderer.access$processClickNotification(this.a);
    }
}

