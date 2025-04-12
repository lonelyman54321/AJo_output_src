/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.ViewGroupOverlayImpl;
import com.google.android.material.internal.ViewOverlayApi14;

class ViewGroupOverlayApi14
extends ViewOverlayApi14
implements ViewGroupOverlayImpl {
    public ViewGroupOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public static ViewGroupOverlayApi14 createFrom(ViewGroup viewGroup) {
        return (ViewGroupOverlayApi14)ViewOverlayApi14.createFrom((View)viewGroup);
    }

    public void add(View view) {
        this.overlayViewGroup.add(view);
    }

    public void remove(View view) {
        this.overlayViewGroup.remove(view);
    }
}

