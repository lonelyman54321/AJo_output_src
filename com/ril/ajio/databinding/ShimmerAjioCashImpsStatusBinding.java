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
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ShimmerAjioCashImpsStatusBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final Guideline shimmerGuideline;
    public final View view1;
    public final View view2;
    public final View view3;
    public final View view4;
    public final View view5;

    private ShimmerAjioCashImpsStatusBinding(ConstraintLayout constraintLayout, Guideline guideline, View view, View view2, View view3, View view4, View view5) {
        this.rootView = constraintLayout;
        this.shimmerGuideline = guideline;
        this.view1 = view;
        this.view2 = view2;
        this.view3 = view3;
        this.view4 = view4;
        this.view5 = view5;
    }

    public static ShimmerAjioCashImpsStatusBinding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        int n3 = R$id.shimmerGuideline;
        View view7 = view6 = dd2_2.a(n3, object);
        view7 = (Guideline)view6;
        if (view7 != null && (view5 = dd2_2.a(n3 = R$id.view_1, object)) != null && (view4 = dd2_2.a(n3 = R$id.view_2, object)) != null && (view3 = dd2_2.a(n3 = R$id.view_3, object)) != null && (view2 = dd2_2.a(n3 = R$id.view_4, object)) != null && (view = dd2_2.a(n3 = R$id.view_5, object)) != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            ShimmerAjioCashImpsStatusBinding shimmerAjioCashImpsStatusBinding = new ShimmerAjioCashImpsStatusBinding((ConstraintLayout)((Object)object2), (Guideline)view7, view5, view4, view3, view2, view);
            return shimmerAjioCashImpsStatusBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShimmerAjioCashImpsStatusBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerAjioCashImpsStatusBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerAjioCashImpsStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_ajio_cash_imps_status;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerAjioCashImpsStatusBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

