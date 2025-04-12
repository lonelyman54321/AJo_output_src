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

public final class CartShimmerRefreshBinding
implements BC3 {
    private final LinearLayout rootView;

    private CartShimmerRefreshBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static CartShimmerRefreshBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            CartShimmerRefreshBinding cartShimmerRefreshBinding = new CartShimmerRefreshBinding((LinearLayout)object);
            return cartShimmerRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CartShimmerRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CartShimmerRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CartShimmerRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_shimmer_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartShimmerRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

