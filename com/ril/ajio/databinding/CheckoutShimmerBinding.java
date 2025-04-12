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

public final class CheckoutShimmerBinding
implements BC3 {
    public final ShimmerFrameLayout checkoutShimmer;
    public final LinearLayout layoutOne;
    private final LinearLayout rootView;
    public final View viewEight;
    public final View viewEle;
    public final View viewFive;
    public final View viewFou;
    public final View viewFour;
    public final View viewNine;
    public final View viewOne;
    public final View viewSeven;
    public final View viewSix;
    public final View viewTen;
    public final View viewThi;
    public final View viewThree;
    public final View viewTwe;
    public final View viewTwo;

    private CheckoutShimmerBinding(LinearLayout linearLayout, ShimmerFrameLayout shimmerFrameLayout, LinearLayout linearLayout2, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10, View view11, View view12, View view13, View view14) {
        this.rootView = linearLayout;
        this.checkoutShimmer = shimmerFrameLayout;
        this.layoutOne = linearLayout2;
        this.viewEight = view;
        this.viewEle = view2;
        this.viewFive = view3;
        this.viewFou = view4;
        this.viewFour = view5;
        this.viewNine = view6;
        this.viewOne = view7;
        this.viewSeven = view8;
        this.viewSix = view9;
        this.viewTen = view10;
        this.viewThi = view11;
        this.viewThree = view12;
        this.viewTwe = view13;
        this.viewTwo = view14;
    }

    public static CheckoutShimmerBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.checkout_shimmer;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (ShimmerFrameLayout)view2;
        if (object2 != null) {
            View view3;
            View view4;
            View view5;
            View view6;
            View view7;
            View view8;
            View view9;
            View view10;
            View view11;
            View view12;
            View view13;
            View view14;
            View view15;
            View view16;
            n3 = R$id.layout_one;
            View view17 = view2 = dd2_2.a(n3, view);
            view17 = (LinearLayout)view2;
            if (view17 != null && (view16 = dd2_2.a(n3 = R$id.view_eight, view)) != null && (view15 = dd2_2.a(n3 = R$id.view_ele, view)) != null && (view14 = dd2_2.a(n3 = R$id.view_five, view)) != null && (view13 = dd2_2.a(n3 = R$id.view_fou, view)) != null && (view12 = dd2_2.a(n3 = R$id.view_four, view)) != null && (view11 = dd2_2.a(n3 = R$id.view_nine, view)) != null && (view10 = dd2_2.a(n3 = R$id.view_one, view)) != null && (view9 = dd2_2.a(n3 = R$id.view_seven, view)) != null && (view8 = dd2_2.a(n3 = R$id.view_six, view)) != null && (view7 = dd2_2.a(n3 = R$id.view_ten, view)) != null && (view6 = dd2_2.a(n3 = R$id.view_thi, view)) != null && (view5 = dd2_2.a(n3 = R$id.view_three, view)) != null && (view4 = dd2_2.a(n3 = R$id.view_twe, view)) != null && (view3 = dd2_2.a(n3 = R$id.view_two, view)) != null) {
                View view18 = view;
                view18 = (LinearLayout)view;
                CheckoutShimmerBinding checkoutShimmerBinding = new CheckoutShimmerBinding((LinearLayout)view18, (ShimmerFrameLayout)((Object)object2), (LinearLayout)view17, view16, view15, view14, view13, view12, view11, view10, view9, view8, view7, view6, view5, view4, view3);
                return checkoutShimmerBinding;
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CheckoutShimmerBinding inflate(LayoutInflater layoutInflater) {
        return CheckoutShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static CheckoutShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.checkout_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CheckoutShimmerBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

