/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.Animation
 *  android.view.animation.Transformation
 */
package com.ril.ajio.customviews.widgets;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.ril.ajio.customviews.widgets.AjioWrappingViewPager;

class AjioWrappingViewPager$1
extends Animation {
    final /* synthetic */ AjioWrappingViewPager this$0;
    final /* synthetic */ int val$currentHeight;
    final /* synthetic */ int val$heightChange;
    final /* synthetic */ int val$targetHeight;

    public AjioWrappingViewPager$1(AjioWrappingViewPager ajioWrappingViewPager, int n3, int n4, int n7) {
        this.this$0 = ajioWrappingViewPager;
        this.val$targetHeight = n3;
        this.val$heightChange = n4;
        this.val$currentHeight = n7;
    }

    public void applyTransformation(float f5, Transformation transformation) {
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object >= 0) {
            ViewGroup.LayoutParams layoutParams = this.this$0.getLayoutParams();
            object = this.val$targetHeight;
            layoutParams.height = (int)object;
        } else {
            int n3;
            object = this.val$heightChange;
            f6 = (float)object * f5;
            int n4 = (int)f6;
            transformation = this.this$0.getLayoutParams();
            transformation.height = n3 = this.val$currentHeight + n4;
        }
        this.this$0.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}

