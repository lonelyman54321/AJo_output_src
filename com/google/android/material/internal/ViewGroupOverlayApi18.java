/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroupOverlay
 */
package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.google.android.material.internal.ViewGroupOverlayImpl;

class ViewGroupOverlayApi18
implements ViewGroupOverlayImpl {
    private final ViewGroupOverlay viewGroupOverlay;

    public ViewGroupOverlayApi18(ViewGroup viewGroup) {
        viewGroup = viewGroup.getOverlay();
        this.viewGroupOverlay = viewGroup;
    }

    public void add(Drawable drawable2) {
        this.viewGroupOverlay.add(drawable2);
    }

    public void add(View view) {
        this.viewGroupOverlay.add(view);
    }

    public void remove(Drawable drawable2) {
        this.viewGroupOverlay.remove(drawable2);
    }

    public void remove(View view) {
        this.viewGroupOverlay.remove(view);
    }
}

