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

public final class CartNoViewRefreshBinding
implements BC3 {
    private final LinearLayout rootView;

    private CartNoViewRefreshBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static CartNoViewRefreshBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            CartNoViewRefreshBinding cartNoViewRefreshBinding = new CartNoViewRefreshBinding((LinearLayout)object);
            return cartNoViewRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CartNoViewRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CartNoViewRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CartNoViewRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_no_view_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartNoViewRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

