/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class WishlistInCartShimmerBinding
implements BC3 {
    public final View imageShimmer;
    private final ConstraintLayout rootView;
    public final View wishlistShimmerItem1;
    public final View wishlistShimmerItem2;
    public final View wishlistShimmerItem3;
    public final View wishlistShimmerItem5;

    private WishlistInCartShimmerBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5) {
        this.rootView = constraintLayout;
        this.imageShimmer = view;
        this.wishlistShimmerItem1 = view2;
        this.wishlistShimmerItem2 = view3;
        this.wishlistShimmerItem3 = view4;
        this.wishlistShimmerItem5 = view5;
    }

    public static WishlistInCartShimmerBinding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        int n3 = R$id.imageShimmer;
        View view5 = dd2_2.a(n3, object);
        if (view5 != null && (view4 = dd2_2.a(n3 = R$id.wishlistShimmerItem1, object)) != null && (view3 = dd2_2.a(n3 = R$id.wishlistShimmerItem2, object)) != null && (view2 = dd2_2.a(n3 = R$id.wishlistShimmerItem3, object)) != null && (view = dd2_2.a(n3 = R$id.wishlistShimmerItem5, object)) != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            WishlistInCartShimmerBinding wishlistInCartShimmerBinding = new WishlistInCartShimmerBinding((ConstraintLayout)((Object)object2), view5, view4, view3, view2, view);
            return wishlistInCartShimmerBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static WishlistInCartShimmerBinding inflate(LayoutInflater layoutInflater) {
        return WishlistInCartShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static WishlistInCartShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.wishlist_in_cart_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return WishlistInCartShimmerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

