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

public final class AjioPromotionViewLayoutBinding
implements BC3 {
    public final LinearLayout rootLayout;
    private final LinearLayout rootView;

    private AjioPromotionViewLayoutBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.rootLayout = linearLayout2;
    }

    public static AjioPromotionViewLayoutBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            AjioPromotionViewLayoutBinding ajioPromotionViewLayoutBinding = new AjioPromotionViewLayoutBinding((LinearLayout)object, (LinearLayout)object);
            return ajioPromotionViewLayoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static AjioPromotionViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return AjioPromotionViewLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static AjioPromotionViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ajio_promotion_view_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AjioPromotionViewLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

