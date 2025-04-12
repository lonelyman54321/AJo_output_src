/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.jio.jioads.native.renderer;

import android.view.View;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;

public final class c
implements View.OnClickListener {
    public final /* synthetic */ NativeAdViewRenderer a;

    public /* synthetic */ c(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final void onClick(View view) {
        NativeAdViewRenderer.h(this.a, view);
    }
}

