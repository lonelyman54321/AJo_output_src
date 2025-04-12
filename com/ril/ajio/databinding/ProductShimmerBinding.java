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
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ProductShimmerBinding
implements BC3 {
    public final View firstBar;
    public final ShimmerFrameLayout homeProductWidgetShimmer;
    public final View productView;
    private final ConstraintLayout rootView;
    public final View secondBar;
    public final ConstraintLayout shimmerContainer;
    public final View thirdBar;
    public final ConstraintLayout viewConstraintLayout;

    private ProductShimmerBinding(ConstraintLayout constraintLayout, View view, ShimmerFrameLayout shimmerFrameLayout, View view2, View view3, ConstraintLayout constraintLayout2, View view4, ConstraintLayout constraintLayout3) {
        this.rootView = constraintLayout;
        this.firstBar = view;
        this.homeProductWidgetShimmer = shimmerFrameLayout;
        this.productView = view2;
        this.secondBar = view3;
        this.shimmerContainer = constraintLayout2;
        this.thirdBar = view4;
        this.viewConstraintLayout = constraintLayout3;
    }

    public static ProductShimmerBinding bind(View object) {
        int n3 = R$id.first_bar;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            View view2;
            View view3;
            View view4;
            n3 = R$id.home_product_widget_shimmer;
            Object object2 = view4 = dd2_2.a(n3, object);
            object2 = (ShimmerFrameLayout)view4;
            if (object2 != null && (view3 = dd2_2.a(n3 = R$id.product_view, object)) != null && (view2 = dd2_2.a(n3 = R$id.second_bar, object)) != null) {
                Object object3 = object;
                object3 = (ConstraintLayout)((Object)object);
                n3 = R$id.third_bar;
                View view5 = dd2_2.a(n3, object);
                if (view5 != null) {
                    n3 = R$id.view_constraint_layout;
                    Object object4 = view4 = dd2_2.a(n3, object);
                    object4 = (ConstraintLayout)view4;
                    if (object4 != null) {
                        view4 = object;
                        object = new ProductShimmerBinding((ConstraintLayout)((Object)object3), view, (ShimmerFrameLayout)((Object)object2), view3, view2, (ConstraintLayout)((Object)object3), view5, (ConstraintLayout)((Object)object4));
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ProductShimmerBinding inflate(LayoutInflater layoutInflater) {
        return ProductShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static ProductShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.product_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ProductShimmerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

