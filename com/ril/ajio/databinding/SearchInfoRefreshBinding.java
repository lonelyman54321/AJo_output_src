/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ImageSearchLayoutBinding;

public final class SearchInfoRefreshBinding
implements BC3 {
    public final ImageSearchLayoutBinding imageSearchContainer;
    public final TextView noMatchFound;
    public final LinearLayout recentHistoryContainer;
    public final TextView recentOption;
    public final TextView recentSearchTv;
    private final ConstraintLayout rootView;
    public final RecyclerView rvSearchHistory;
    public final RecyclerView rvSearchTrendingCategories;
    public final RecyclerView rvTrendingCategoriesNew;
    public final FrameLayout searchCmsShimmerParent;
    public final LinearLayout searchHistoryCategoriesLayout;
    public final NestedScrollView searchHistoryCategoriesScroll;
    public final RecyclerView searchList;
    public final ConstraintLayout searchParent;
    public final LinearLayout trendingCategoriesParent;
    public final TextView tvTrendingCategories;

    private SearchInfoRefreshBinding(ConstraintLayout constraintLayout, ImageSearchLayoutBinding imageSearchLayoutBinding, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, FrameLayout frameLayout, LinearLayout linearLayout2, NestedScrollView nestedScrollView, RecyclerView recyclerView4, ConstraintLayout constraintLayout2, LinearLayout linearLayout3, TextView textView4) {
        this.rootView = constraintLayout;
        this.imageSearchContainer = imageSearchLayoutBinding;
        this.noMatchFound = textView;
        this.recentHistoryContainer = linearLayout;
        this.recentOption = textView2;
        this.recentSearchTv = textView3;
        this.rvSearchHistory = recyclerView;
        this.rvSearchTrendingCategories = recyclerView2;
        this.rvTrendingCategoriesNew = recyclerView3;
        this.searchCmsShimmerParent = frameLayout;
        this.searchHistoryCategoriesLayout = linearLayout2;
        this.searchHistoryCategoriesScroll = nestedScrollView;
        this.searchList = recyclerView4;
        this.searchParent = constraintLayout2;
        this.trendingCategoriesParent = linearLayout3;
        this.tvTrendingCategories = textView4;
    }

    public static SearchInfoRefreshBinding bind(View view) {
        Object object = view;
        int n3 = R$id.imageSearchContainer;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            ImageSearchLayoutBinding imageSearchLayoutBinding = ImageSearchLayoutBinding.bind(view2);
            n3 = R$id.no_match_found;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (TextView)view2;
            if (view3 != null) {
                n3 = R$id.recent_history_container;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (LinearLayout)view2;
                if (view4 != null) {
                    n3 = R$id.recent_option;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (TextView)view2;
                    if (view5 != null) {
                        n3 = R$id.recent_search_tv;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (TextView)view2;
                        if (view6 != null) {
                            n3 = R$id.rv_search_history;
                            Object object2 = view2 = dd2_2.a(n3, view);
                            object2 = (RecyclerView)view2;
                            if (object2 != null) {
                                n3 = R$id.rv_search_trending_categories;
                                Object object3 = view2 = dd2_2.a(n3, view);
                                object3 = (RecyclerView)view2;
                                if (object3 != null) {
                                    n3 = R$id.rv_trending_categories_new;
                                    Object object4 = view2 = dd2_2.a(n3, view);
                                    object4 = (RecyclerView)view2;
                                    if (object4 != null) {
                                        n3 = R$id.searchCmsShimmerParent;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (FrameLayout)view2;
                                        if (view7 != null) {
                                            n3 = R$id.search_history_categories_layout;
                                            View view8 = view2 = dd2_2.a(n3, view);
                                            view8 = (LinearLayout)view2;
                                            if (view8 != null) {
                                                n3 = R$id.search_history_categories_scroll;
                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                object5 = (NestedScrollView)view2;
                                                if (object5 != null) {
                                                    n3 = R$id.searchList;
                                                    Object object6 = view2 = dd2_2.a(n3, view);
                                                    object6 = (RecyclerView)view2;
                                                    if (object6 != null) {
                                                        Object object7 = view;
                                                        object7 = (ConstraintLayout)view;
                                                        n3 = R$id.trending_categories_parent;
                                                        View view9 = view2 = dd2_2.a(n3, view);
                                                        view9 = (LinearLayout)view2;
                                                        if (view9 != null) {
                                                            n3 = R$id.tv_trending_categories;
                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                            view10 = (TextView)view2;
                                                            if (view10 != null) {
                                                                object = new SearchInfoRefreshBinding((ConstraintLayout)((Object)object7), imageSearchLayoutBinding, (TextView)view3, (LinearLayout)view4, (TextView)view5, (TextView)view6, (RecyclerView)object2, (RecyclerView)object3, (RecyclerView)object4, (FrameLayout)view7, (LinearLayout)view8, (NestedScrollView)object5, (RecyclerView)object6, (ConstraintLayout)((Object)object7), (LinearLayout)view9, (TextView)view10);
                                                                return object;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SearchInfoRefreshBinding inflate(LayoutInflater layoutInflater) {
        return SearchInfoRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static SearchInfoRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.search_info_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchInfoRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

