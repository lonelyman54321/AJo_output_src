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

public final class LayoutProductWishlistRowOddBinding
implements BC3 {
    private final LinearLayout rootView;

    private LayoutProductWishlistRowOddBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static LayoutProductWishlistRowOddBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            LayoutProductWishlistRowOddBinding layoutProductWishlistRowOddBinding = new LayoutProductWishlistRowOddBinding((LinearLayout)object);
            return layoutProductWishlistRowOddBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutProductWishlistRowOddBinding inflate(LayoutInflater layoutInflater) {
        return LayoutProductWishlistRowOddBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutProductWishlistRowOddBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_product_wishlist_row_odd;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutProductWishlistRowOddBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

