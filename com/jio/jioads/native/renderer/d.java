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

public final class d
implements View.OnClickListener {
    public final /* synthetic */ NativeAdViewRenderer a;

    public /* synthetic */ d(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final void onClick(View view) {
        NativeAdViewRenderer.i(this.a, view);
    }
}

