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

public final class LayoutProductWishlistRowEvenBinding
implements BC3 {
    private final LinearLayout rootView;

    private LayoutProductWishlistRowEvenBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static LayoutProductWishlistRowEvenBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            LayoutProductWishlistRowEvenBinding layoutProductWishlistRowEvenBinding = new LayoutProductWishlistRowEvenBinding((LinearLayout)object);
            return layoutProductWishlistRowEvenBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutProductWishlistRowEvenBinding inflate(LayoutInflater layoutInflater) {
        return LayoutProductWishlistRowEvenBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutProductWishlistRowEvenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_product_wishlist_row_even;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutProductWishlistRowEvenBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

