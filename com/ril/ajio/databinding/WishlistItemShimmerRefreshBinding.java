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

public final class WishlistItemShimmerRefreshBinding
implements BC3 {
    public final View imageShimmer;
    private final ConstraintLayout rootView;
    public final View wishlistShimmerItem1;
    public final View wishlistShimmerItem2;
    public final View wishlistShimmerItem3;
    public final View wishlistShimmerItem4;
    public final View wishlistShimmerItem5;

    private WishlistItemShimmerRefreshBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5, View view6) {
        this.rootView = constraintLayout;
        this.imageShimmer = view;
        this.wishlistShimmerItem1 = view2;
        this.wishlistShimmerItem2 = view3;
        this.wishlistShimmerItem3 = view4;
        this.wishlistShimmerItem4 = view5;
        this.wishlistShimmerItem5 = view6;
    }

    public static WishlistItemShimmerRefreshBinding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        int n3 = R$id.imageShimmer;
        View view6 = dd2_2.a(n3, object);
        if (view6 != null && (view5 = dd2_2.a(n3 = R$id.wishlistShimmerItem1, object)) != null && (view4 = dd2_2.a(n3 = R$id.wishlistShimmerItem2, object)) != null && (view3 = dd2_2.a(n3 = R$id.wishlistShimmerItem3, object)) != null && (view2 = dd2_2.a(n3 = R$id.wishlistShimmerItem4, object)) != null && (view = dd2_2.a(n3 = R$id.wishlistShimmerItem5, object)) != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            WishlistItemShimmerRefreshBinding wishlistItemShimmerRefreshBinding = new WishlistItemShimmerRefreshBinding((ConstraintLayout)((Object)object2), view6, view5, view4, view3, view2, view);
            return wishlistItemShimmerRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static WishlistItemShimmerRefreshBinding inflate(LayoutInflater layoutInflater) {
        return WishlistItemShimmerRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static WishlistItemShimmerRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.wishlist_item_shimmer_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return WishlistItemShimmerRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

