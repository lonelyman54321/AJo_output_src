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

/*
 * Renamed from com.jio.jioads.native.renderer.b
 */
public final class b_0
implements View.OnClickListener {
    public final /* synthetic */ NativeAdViewRenderer a;

    public /* synthetic */ b_0(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final void onClick(View view) {
        NativeAdViewRenderer.a(this.a, view);
    }
}

