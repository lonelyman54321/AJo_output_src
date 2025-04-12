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

public final class CouponsPromotionSpaceViewBinding
implements BC3 {
    private final LinearLayout rootView;

    private CouponsPromotionSpaceViewBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static CouponsPromotionSpaceViewBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            CouponsPromotionSpaceViewBinding couponsPromotionSpaceViewBinding = new CouponsPromotionSpaceViewBinding((LinearLayout)object);
            return couponsPromotionSpaceViewBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CouponsPromotionSpaceViewBinding inflate(LayoutInflater layoutInflater) {
        return CouponsPromotionSpaceViewBinding.inflate(layoutInflater, null, false);
    }

    public static CouponsPromotionSpaceViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupons_promotion_space_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponsPromotionSpaceViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

