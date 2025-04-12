/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowSearchTrendingCategoriesRefreshBinding
implements BC3 {
    public final ImageView ivSearchCategoryThumbnail;
    private final CardView rootView;
    public final View searchTrendingDivider;
    public final LinearLayout searchTrendingSubcategoriesParent;
    public final TextView tvSearchCategoryName;

    private RowSearchTrendingCategoriesRefreshBinding(CardView cardView, ImageView imageView, View view, LinearLayout linearLayout, TextView textView) {
        this.rootView = cardView;
        this.ivSearchCategoryThumbnail = imageView;
        this.searchTrendingDivider = view;
        this.searchTrendingSubcategoriesParent = linearLayout;
        this.tvSearchCategoryName = textView;
    }

    public static RowSearchTrendingCategoriesRefreshBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.iv_search_category_thumbnail;
        View view3 = view2 = dd2_2.a(n3, object);
        view3 = (ImageView)view2;
        if (view3 != null && (view = dd2_2.a(n3 = R$id.search_trending_divider, object)) != null) {
            n3 = R$id.search_trending_subcategories_parent;
            View view4 = view2 = dd2_2.a(n3, object);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n3 = R$id.tv_search_category_name;
                View view5 = view2 = dd2_2.a(n3, object);
                view5 = (TextView)view2;
                if (view5 != null) {
                    Object object2 = object;
                    object2 = (CardView)((Object)object);
                    RowSearchTrendingCategoriesRefreshBinding rowSearchTrendingCategoriesRefreshBinding = new RowSearchTrendingCategoriesRefreshBinding((CardView)((Object)object2), (ImageView)view3, view, (LinearLayout)view4, (TextView)view5);
                    return rowSearchTrendingCategoriesRefreshBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowSearchTrendingCategoriesRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowSearchTrendingCategoriesRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowSearchTrendingCategoriesRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_search_trending_categories_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowSearchTrendingCategoriesRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

