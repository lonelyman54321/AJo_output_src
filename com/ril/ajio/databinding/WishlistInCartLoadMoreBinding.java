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
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class WishlistInCartLoadMoreBinding
implements BC3 {
    public final ShimmerFrameLayout closetRowShimmerView;
    private final LinearLayout rootView;

    private WishlistInCartLoadMoreBinding(LinearLayout linearLayout, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = linearLayout;
        this.closetRowShimmerView = shimmerFrameLayout;
    }

    public static WishlistInCartLoadMoreBinding bind(View object) {
        int n3 = R$id.closet_row_shimmer_view;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout)dd2_2.a(n3, object);
        if (shimmerFrameLayout != null) {
            object = (LinearLayout)object;
            WishlistInCartLoadMoreBinding wishlistInCartLoadMoreBinding = new WishlistInCartLoadMoreBinding((LinearLayout)object, shimmerFrameLayout);
            return wishlistInCartLoadMoreBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static WishlistInCartLoadMoreBinding inflate(LayoutInflater layoutInflater) {
        return WishlistInCartLoadMoreBinding.inflate(layoutInflater, null, false);
    }

    public static WishlistInCartLoadMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.wishlist_in_cart_load_more;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return WishlistInCartLoadMoreBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

