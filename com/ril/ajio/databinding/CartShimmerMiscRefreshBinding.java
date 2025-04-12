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

public final class CartShimmerMiscRefreshBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final View shimmerDummyMisc1;
    public final View shimmerDummyMisc2;
    public final View shimmerDummyMisc3;
    public final View shimmerDummyMisc4;

    private CartShimmerMiscRefreshBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4) {
        this.rootView = constraintLayout;
        this.shimmerDummyMisc1 = view;
        this.shimmerDummyMisc2 = view2;
        this.shimmerDummyMisc3 = view3;
        this.shimmerDummyMisc4 = view4;
    }

    public static CartShimmerMiscRefreshBinding bind(View object) {
        View view;
        View view2;
        View view3;
        int n3 = R$id.shimmerDummyMisc1;
        View view4 = dd2_2.a(n3, object);
        if (view4 != null && (view3 = dd2_2.a(n3 = R$id.shimmerDummyMisc2, object)) != null && (view2 = dd2_2.a(n3 = R$id.shimmerDummyMisc3, object)) != null && (view = dd2_2.a(n3 = R$id.shimmerDummyMisc4, object)) != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            CartShimmerMiscRefreshBinding cartShimmerMiscRefreshBinding = new CartShimmerMiscRefreshBinding((ConstraintLayout)((Object)object2), view4, view3, view2, view);
            return cartShimmerMiscRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartShimmerMiscRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CartShimmerMiscRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CartShimmerMiscRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_shimmer_misc_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartShimmerMiscRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

