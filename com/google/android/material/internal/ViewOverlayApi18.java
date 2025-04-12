/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewOverlay
 */
package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import com.google.android.material.internal.ViewOverlayImpl;

class ViewOverlayApi18
implements ViewOverlayImpl {
    private final ViewOverlay viewOverlay;

    public ViewOverlayApi18(View view) {
        view = view.getOverlay();
        this.viewOverlay = view;
    }

    public void add(Drawable drawable2) {
        this.viewOverlay.add(drawable2);
    }

    public void remove(Drawable drawable2) {
        this.viewOverlay.remove(drawable2);
    }
}

