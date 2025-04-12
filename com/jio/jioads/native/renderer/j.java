/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package com.jio.jioads.native.renderer;

import android.view.MotionEvent;
import android.view.View;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;

public final class j
implements View.OnTouchListener {
    public final /* synthetic */ NativeAdViewRenderer a;

    public /* synthetic */ j(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return NativeAdViewRenderer.a(this.a, view, motionEvent);
    }
}

