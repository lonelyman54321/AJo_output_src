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

public final class ShimmerRowAcDetailBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final View rowShimmerAcDetail1;
    public final View rowShimmerAcDetail2;
    public final View rowShimmerAcDetail3;
    public final View rowShimmerAcDetail4;
    public final View rowShimmerAcDetail5;
    public final View rowShimmerAcDetail6;

    private ShimmerRowAcDetailBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5, View view6) {
        this.rootView = constraintLayout;
        this.rowShimmerAcDetail1 = view;
        this.rowShimmerAcDetail2 = view2;
        this.rowShimmerAcDetail3 = view3;
        this.rowShimmerAcDetail4 = view4;
        this.rowShimmerAcDetail5 = view5;
        this.rowShimmerAcDetail6 = view6;
    }

    public static ShimmerRowAcDetailBinding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        int n3 = R$id.row_shimmer_ac_detail_1;
        View view6 = dd2_2.a(n3, object);
        if (view6 != null && (view5 = dd2_2.a(n3 = R$id.row_shimmer_ac_detail_2, object)) != null && (view4 = dd2_2.a(n3 = R$id.row_shimmer_ac_detail_3, object)) != null && (view3 = dd2_2.a(n3 = R$id.row_shimmer_ac_detail_4, object)) != null && (view2 = dd2_2.a(n3 = R$id.row_shimmer_ac_detail_5, object)) != null && (view = dd2_2.a(n3 = R$id.row_shimmer_ac_detail_6, object)) != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            ShimmerRowAcDetailBinding shimmerRowAcDetailBinding = new ShimmerRowAcDetailBinding((ConstraintLayout)((Object)object2), view6, view5, view4, view3, view2, view);
            return shimmerRowAcDetailBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShimmerRowAcDetailBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerRowAcDetailBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerRowAcDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_row_ac_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerRowAcDetailBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

