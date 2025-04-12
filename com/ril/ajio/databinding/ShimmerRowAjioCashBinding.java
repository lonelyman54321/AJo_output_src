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

public final class ShimmerRowAjioCashBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final View rowShimmerAc1;
    public final View rowShimmerAc2;
    public final View rowShimmerAc3;
    public final View rowShimmerAc4;
    public final View rowShimmerAc5;

    private ShimmerRowAjioCashBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5) {
        this.rootView = constraintLayout;
        this.rowShimmerAc1 = view;
        this.rowShimmerAc2 = view2;
        this.rowShimmerAc3 = view3;
        this.rowShimmerAc4 = view4;
        this.rowShimmerAc5 = view5;
    }

    public static ShimmerRowAjioCashBinding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        int n3 = R$id.row_shimmer_ac_1;
        View view5 = dd2_2.a(n3, object);
        if (view5 != null && (view4 = dd2_2.a(n3 = R$id.row_shimmer_ac_2, object)) != null && (view3 = dd2_2.a(n3 = R$id.row_shimmer_ac_3, object)) != null && (view2 = dd2_2.a(n3 = R$id.row_shimmer_ac_4, object)) != null && (view = dd2_2.a(n3 = R$id.row_shimmer_ac_5, object)) != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            ShimmerRowAjioCashBinding shimmerRowAjioCashBinding = new ShimmerRowAjioCashBinding((ConstraintLayout)((Object)object2), view5, view4, view3, view2, view);
            return shimmerRowAjioCashBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShimmerRowAjioCashBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerRowAjioCashBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerRowAjioCashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_row_ajio_cash;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerRowAjioCashBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

