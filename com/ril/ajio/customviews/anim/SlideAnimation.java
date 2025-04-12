/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Transformation
 */
package com.ril.ajio.customviews.anim;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class SlideAnimation
extends Animation {
    private int mFromHeight;
    private int mToHeight;
    private View mView;

    public SlideAnimation(View view, int n3, int n4) {
        this.mView = view;
        this.mFromHeight = n3;
        this.mToHeight = n4;
    }

    public void applyTransformation(float f5, Transformation transformation) {
        int n3;
        transformation = this.mView;
        int n4 = transformation.getHeight();
        if (n4 != (n3 = this.mToHeight)) {
            n4 = this.mFromHeight;
            float f6 = n4;
            float f7 = (float)(n3 -= n4) * f5 + f6;
            int n7 = (int)f7;
            transformation = this.mView.getLayoutParams();
            transformation.height = n7;
            View view = this.mView;
            view.requestLayout();
        }
    }

    public boolean willChangeBounds() {
        return true;
    }
}

