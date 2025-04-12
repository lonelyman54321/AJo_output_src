/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.ViewGroupOverlayApi14;
import com.google.android.material.internal.ViewOverlayApi14$OverlayViewGroup;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;

class ViewOverlayApi14
implements ViewOverlayImpl {
    protected ViewOverlayApi14$OverlayViewGroup overlayViewGroup;

    public ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        ViewOverlayApi14$OverlayViewGroup viewOverlayApi14$OverlayViewGroup;
        this.overlayViewGroup = viewOverlayApi14$OverlayViewGroup = new ViewOverlayApi14$OverlayViewGroup(context, viewGroup, view, this);
    }

    public static ViewOverlayApi14 createFrom(View view) {
        ViewGroup viewGroup = ViewUtils.getContentView(view);
        if (viewGroup != null) {
            int n3 = viewGroup.getChildCount();
            Context context = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                View view2 = viewGroup.getChildAt(i3);
                boolean bl2 = view2 instanceof ViewOverlayApi14$OverlayViewGroup;
                if (!bl2) continue;
                return ((ViewOverlayApi14$OverlayViewGroup)view2).viewOverlay;
            }
            context = viewGroup.getContext();
            ViewGroupOverlayApi14 viewGroupOverlayApi14 = new ViewGroupOverlayApi14(context, viewGroup, view);
            return viewGroupOverlayApi14;
        }
        return null;
    }

    public void add(Drawable drawable2) {
        this.overlayViewGroup.add(drawable2);
    }

    public void remove(Drawable drawable2) {
        this.overlayViewGroup.remove(drawable2);
    }
}

