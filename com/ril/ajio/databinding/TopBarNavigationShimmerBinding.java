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

public final class TopBarNavigationShimmerBinding
implements BC3 {
    public final View navView;
    private final ShimmerFrameLayout rootView;
    public final View shimmerFour;
    public final View shimmerOne;
    public final ShimmerFrameLayout shimmerParentTabs;
    public final View shimmerThree;
    public final View shimmerTwo;

    private TopBarNavigationShimmerBinding(ShimmerFrameLayout shimmerFrameLayout, View view, View view2, View view3, ShimmerFrameLayout shimmerFrameLayout2, View view4, View view5) {
        this.rootView = shimmerFrameLayout;
        this.navView = view;
        this.shimmerFour = view2;
        this.shimmerOne = view3;
        this.shimmerParentTabs = shimmerFrameLayout2;
        this.shimmerThree = view4;
        this.shimmerTwo = view5;
    }

    public static TopBarNavigationShimmerBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.navView;
        View view3 = dd2_2.a(n3, object);
        if (view3 != null && (view2 = dd2_2.a(n3 = R$id.shimmer_four, object)) != null && (view = dd2_2.a(n3 = R$id.shimmer_one, object)) != null) {
            View view4;
            Object object2 = object;
            object2 = (ShimmerFrameLayout)((Object)object);
            n3 = R$id.shimmer_three;
            View view5 = dd2_2.a(n3, object);
            if (view5 != null && (view4 = dd2_2.a(n3 = R$id.shimmer_two, object)) != null) {
                object = new TopBarNavigationShimmerBinding((ShimmerFrameLayout)((Object)object2), view3, view2, view, (ShimmerFrameLayout)((Object)object2), view5, view4);
                return object;
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static TopBarNavigationShimmerBinding inflate(LayoutInflater layoutInflater) {
        return TopBarNavigationShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static TopBarNavigationShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.top_bar_navigation_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TopBarNavigationShimmerBinding.bind((View)layoutInflater);
    }

    public ShimmerFrameLayout getRoot() {
        return this.rootView;
    }
}

