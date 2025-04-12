/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.native.renderer.NativeAdViewRenderer;

public final class g
implements Runnable {
    public final /* synthetic */ NativeAdViewRenderer a;

    public /* synthetic */ g(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final void run() {
        NativeAdViewRenderer.b(this.a);
    }
}

