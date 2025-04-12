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

public final class ShimmerAcDetailBinding
implements BC3 {
    private final LinearLayout rootView;

    private ShimmerAcDetailBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static ShimmerAcDetailBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            ShimmerAcDetailBinding shimmerAcDetailBinding = new ShimmerAcDetailBinding((LinearLayout)object);
            return shimmerAcDetailBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ShimmerAcDetailBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerAcDetailBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerAcDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_ac_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerAcDetailBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

