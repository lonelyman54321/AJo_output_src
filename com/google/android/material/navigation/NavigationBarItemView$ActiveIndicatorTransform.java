/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.navigation;

import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.navigation.NavigationBarItemView$1;

class NavigationBarItemView$ActiveIndicatorTransform {
    private static final float ALPHA_FRACTION = 0.2f;
    private static final float SCALE_X_HIDDEN = 0.4f;
    private static final float SCALE_X_SHOWN = 1.0f;

    private NavigationBarItemView$ActiveIndicatorTransform() {
    }

    public /* synthetic */ NavigationBarItemView$ActiveIndicatorTransform(NavigationBarItemView$1 navigationBarItemView$1) {
        this();
    }

    public float calculateAlpha(float f5, float f6) {
        float f7 = f6 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        float f8 = object == false ? 0.8f : 0.0f;
        float f11 = 1.0f;
        if (object == false) {
            object = 1065353216;
            f6 = 1.0f;
        } else {
            object = 1045220557;
            f6 = 0.2f;
        }
        return AnimationUtils.lerp(0.0f, f11, f8, f6, f5);
    }

    public float calculateScaleX(float f5, float f6) {
        return AnimationUtils.lerp(0.4f, 1.0f, f5);
    }

    public float calculateScaleY(float f5, float f6) {
        return 1.0f;
    }

    public void updateForProgress(float f5, float f6, View view) {
        float f7 = this.calculateScaleX(f5, f6);
        view.setScaleX(f7);
        f7 = this.calculateScaleY(f5, f6);
        view.setScaleY(f7);
        f5 = this.calculateAlpha(f5, f6);
        view.setAlpha(f5);
    }
}

