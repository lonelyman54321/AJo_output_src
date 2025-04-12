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

public final class SearchTrendingShimmerBinding
implements BC3 {
    private final ShimmerFrameLayout rootView;
    public final ShimmerFrameLayout searchShimmerParent;

    private SearchTrendingShimmerBinding(ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2) {
        this.rootView = shimmerFrameLayout;
        this.searchShimmerParent = shimmerFrameLayout2;
    }

    public static SearchTrendingShimmerBinding bind(View object) {
        if (object != null) {
            object = (ShimmerFrameLayout)((Object)object);
            SearchTrendingShimmerBinding searchTrendingShimmerBinding = new SearchTrendingShimmerBinding((ShimmerFrameLayout)((Object)object), (ShimmerFrameLayout)((Object)object));
            return searchTrendingShimmerBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static SearchTrendingShimmerBinding inflate(LayoutInflater layoutInflater) {
        return SearchTrendingShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static SearchTrendingShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.search_trending_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchTrendingShimmerBinding.bind((View)layoutInflater);
    }

    public ShimmerFrameLayout getRoot() {
        return this.rootView;
    }
}

