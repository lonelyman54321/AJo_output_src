/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$layout;

public final class ShimmerTwoWhiteCircleLayoutBinding
implements BC3 {
    private final LinearLayout rootView;

    private ShimmerTwoWhiteCircleLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static ShimmerTwoWhiteCircleLayoutBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            ShimmerTwoWhiteCircleLayoutBinding shimmerTwoWhiteCircleLayoutBinding = new ShimmerTwoWhiteCircleLayoutBinding((LinearLayout)object);
            return shimmerTwoWhiteCircleLayoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ShimmerTwoWhiteCircleLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerTwoWhiteCircleLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerTwoWhiteCircleLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_two_white_circle_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerTwoWhiteCircleLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

