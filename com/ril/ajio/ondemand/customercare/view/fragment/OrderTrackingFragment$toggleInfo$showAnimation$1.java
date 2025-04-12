/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Transformation
 */
package com.ril.ajio.ondemand.customercare.view.fragment;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.Intrinsics;

public final class OrderTrackingFragment$toggleInfo$showAnimation$1
extends Animation {
    final /* synthetic */ View $aTvMessage;
    final /* synthetic */ int $targetHeight;

    public OrderTrackingFragment$toggleInfo$showAnimation$1(View view, int n3) {
        this.$aTvMessage = view;
        this.$targetHeight = n3;
    }

    public void applyTransformation(float f5, Transformation transformation) {
        int n3;
        String string2 = "t";
        Intrinsics.checkNotNullParameter(transformation, string2);
        transformation = this.$aTvMessage.getLayoutParams();
        float f6 = 1.0f;
        float f7 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f7 == false) {
            n3 = -2;
            f5 = 0.0f / 0.0f;
        } else {
            f7 = this.$targetHeight;
            f6 = (float)f7 * f5;
            n3 = (int)f6;
        }
        transformation.height = n3;
        this.$aTvMessage.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}

