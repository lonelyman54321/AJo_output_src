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

public final class OrderTrackingFragment$toggleInfo$hideAnimation$1
extends Animation {
    final /* synthetic */ View $aTvMessage;
    final /* synthetic */ int $initialHeight;

    public OrderTrackingFragment$toggleInfo$hideAnimation$1(View view, int n3) {
        this.$aTvMessage = view;
        this.$initialHeight = n3;
    }

    public void applyTransformation(float f5, Transformation transformation) {
        String string2 = "t";
        Intrinsics.checkNotNullParameter(transformation, string2);
        float f6 = 1.0f;
        float f7 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f7 == false) {
            View view = this.$aTvMessage;
            f7 = 8;
            f6 = 1.1E-44f;
            view.setVisibility((int)f7);
        } else {
            transformation = this.$aTvMessage.getLayoutParams();
            int n3 = this.$initialHeight;
            float f8 = (float)n3 * f5;
            int n4 = (int)f8;
            transformation.height = n3 -= n4;
            View view = this.$aTvMessage;
            view.requestLayout();
        }
    }

    public boolean willChangeBounds() {
        return true;
    }
}

