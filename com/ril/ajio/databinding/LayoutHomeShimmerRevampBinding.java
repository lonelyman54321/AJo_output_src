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
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutHomeShimmerRevampBinding
implements BC3 {
    private final ShimmerFrameLayout rootView;
    public final View shimmerFive;
    public final View shimmerFour;
    public final View shimmerOne;
    public final ShimmerFrameLayout shimmerParent;
    public final View shimmerSeven;
    public final View shimmerSix;
    public final View shimmerThree;
    public final View shimmerTwo;

    private LayoutHomeShimmerRevampBinding(ShimmerFrameLayout shimmerFrameLayout, View view, View view2, View view3, ShimmerFrameLayout shimmerFrameLayout2, View view4, View view5, View view6, View view7) {
        this.rootView = shimmerFrameLayout;
        this.shimmerFive = view;
        this.shimmerFour = view2;
        this.shimmerOne = view3;
        this.shimmerParent = shimmerFrameLayout2;
        this.shimmerSeven = view4;
        this.shimmerSix = view5;
        this.shimmerThree = view6;
        this.shimmerTwo = view7;
    }

    public static LayoutHomeShimmerRevampBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.shimmer_five;
        View view3 = dd2_2.a(n3, object);
        if (view3 != null && (view2 = dd2_2.a(n3 = R$id.shimmer_four, object)) != null && (view = dd2_2.a(n3 = R$id.shimmer_one, object)) != null) {
            View view4;
            View view5;
            View view6;
            Object object2 = object;
            object2 = (ShimmerFrameLayout)((Object)object);
            n3 = R$id.shimmer_seven;
            View view7 = dd2_2.a(n3, object);
            if (view7 != null && (view6 = dd2_2.a(n3 = R$id.shimmer_six, object)) != null && (view5 = dd2_2.a(n3 = R$id.shimmer_three, object)) != null && (view4 = dd2_2.a(n3 = R$id.shimmer_two, object)) != null) {
                object = new LayoutHomeShimmerRevampBinding((ShimmerFrameLayout)((Object)object2), view3, view2, view, (ShimmerFrameLayout)((Object)object2), view7, view6, view5, view4);
                return object;
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutHomeShimmerRevampBinding inflate(LayoutInflater layoutInflater) {
        return LayoutHomeShimmerRevampBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutHomeShimmerRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_home_shimmer_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutHomeShimmerRevampBinding.bind((View)layoutInflater);
    }

    public ShimmerFrameLayout getRoot() {
        return this.rootView;
    }
}

