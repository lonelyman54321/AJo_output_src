/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.native.renderer.NativeAdViewRenderer;

public final class i
implements Runnable {
    public final /* synthetic */ NativeAdViewRenderer a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ i(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        this.a = nativeAdViewRenderer;
        this.b = bl2;
    }

    public final void run() {
        NativeAdViewRenderer nativeAdViewRenderer = this.a;
        boolean bl2 = this.b;
        NativeAdViewRenderer.a(nativeAdViewRenderer, bl2);
    }
}

