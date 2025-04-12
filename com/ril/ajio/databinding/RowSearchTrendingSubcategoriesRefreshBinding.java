/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowSearchTrendingSubcategoriesRefreshBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final Guideline searchTrendingGuideline;
    public final TextView tvSearchTrendingSubcategory1;
    public final TextView tvSearchTrendingSubcategory2;

    private RowSearchTrendingSubcategoriesRefreshBinding(ConstraintLayout constraintLayout, Guideline guideline, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.searchTrendingGuideline = guideline;
        this.tvSearchTrendingSubcategory1 = textView;
        this.tvSearchTrendingSubcategory2 = textView2;
    }

    public static RowSearchTrendingSubcategoriesRefreshBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.search_trending_guideline;
        Guideline guideline = (Guideline)dd2_2.a(n3, object);
        if (guideline != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.tv_search_trending_subcategory1, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.tv_search_trending_subcategory2, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowSearchTrendingSubcategoriesRefreshBinding rowSearchTrendingSubcategoriesRefreshBinding = new RowSearchTrendingSubcategoriesRefreshBinding((ConstraintLayout)((Object)object), guideline, textView2, textView);
            return rowSearchTrendingSubcategoriesRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowSearchTrendingSubcategoriesRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowSearchTrendingSubcategoriesRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowSearchTrendingSubcategoriesRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_search_trending_subcategories_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowSearchTrendingSubcategoriesRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

