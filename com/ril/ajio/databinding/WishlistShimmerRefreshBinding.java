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

public final class WishlistShimmerRefreshBinding
implements BC3 {
    private final LinearLayout rootView;

    private WishlistShimmerRefreshBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static WishlistShimmerRefreshBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            WishlistShimmerRefreshBinding wishlistShimmerRefreshBinding = new WishlistShimmerRefreshBinding((LinearLayout)object);
            return wishlistShimmerRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static WishlistShimmerRefreshBinding inflate(LayoutInflater layoutInflater) {
        return WishlistShimmerRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static WishlistShimmerRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.wishlist_shimmer_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return WishlistShimmerRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

