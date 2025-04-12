/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package com.ril.ajio.customviews.widgets;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ril.ajio.customviews.widgets.CircularImageView;

public final class CircularImageView$manageElevation$1
extends ViewOutlineProvider {
    final /* synthetic */ CircularImageView this$0;

    public CircularImageView$manageElevation$1(CircularImageView circularImageView) {
        this.this$0 = circularImageView;
    }

    public void getOutline(View object, Outline outline) {
        if (outline != null) {
            object = this.this$0;
            int n3 = CircularImageView.access$getHeightCircle$p((CircularImageView)((Object)object));
            CircularImageView circularImageView = this.this$0;
            int n4 = CircularImageView.access$getHeightCircle$p(circularImageView);
            outline.setOval(0, 0, n3, n4);
        }
    }
}

