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
import com.ril.ajio.R$layout;

public final class LayoutShimmerAddressRevampBinding
implements BC3 {
    public final ShimmerFrameLayout falrShimmerFL;
    private final ShimmerFrameLayout rootView;

    private LayoutShimmerAddressRevampBinding(ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2) {
        this.rootView = shimmerFrameLayout;
        this.falrShimmerFL = shimmerFrameLayout2;
    }

    public static LayoutShimmerAddressRevampBinding bind(View object) {
        if (object != null) {
            object = (ShimmerFrameLayout)((Object)object);
            LayoutShimmerAddressRevampBinding layoutShimmerAddressRevampBinding = new LayoutShimmerAddressRevampBinding((ShimmerFrameLayout)((Object)object), (ShimmerFrameLayout)((Object)object));
            return layoutShimmerAddressRevampBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutShimmerAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return LayoutShimmerAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutShimmerAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_shimmer_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutShimmerAddressRevampBinding.bind((View)layoutInflater);
    }

    public ShimmerFrameLayout getRoot() {
        return this.rootView;
    }
}

