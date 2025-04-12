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

public final class ProductListShimmerItemBinding
implements BC3 {
    private final LinearLayout rootView;

    private ProductListShimmerItemBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static ProductListShimmerItemBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            ProductListShimmerItemBinding productListShimmerItemBinding = new ProductListShimmerItemBinding((LinearLayout)object);
            return productListShimmerItemBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ProductListShimmerItemBinding inflate(LayoutInflater layoutInflater) {
        return ProductListShimmerItemBinding.inflate(layoutInflater, null, false);
    }

    public static ProductListShimmerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.product_list_shimmer_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ProductListShimmerItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

