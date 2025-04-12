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
import com.ril.ajio.R$layout;

public final class SearchNewTrendingShimmerItemBinding
implements BC3 {
    private final LinearLayout rootView;

    private SearchNewTrendingShimmerItemBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static SearchNewTrendingShimmerItemBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            SearchNewTrendingShimmerItemBinding searchNewTrendingShimmerItemBinding = new SearchNewTrendingShimmerItemBinding((LinearLayout)object);
            return searchNewTrendingShimmerItemBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static SearchNewTrendingShimmerItemBinding inflate(LayoutInflater layoutInflater) {
        return SearchNewTrendingShimmerItemBinding.inflate(layoutInflater, null, false);
    }

    public static SearchNewTrendingShimmerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.search_new_trending_shimmer_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchNewTrendingShimmerItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

