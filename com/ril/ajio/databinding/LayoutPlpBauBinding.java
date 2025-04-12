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
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.databinding.LayoutImageUploadErrorPlpBinding;
import com.ril.ajio.databinding.LayoutNoInternetPlpBinding;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class LayoutPlpBauBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    public final LayoutNoInternetPlpBinding layoutNoInternet;
    public final LayoutImageUploadErrorPlpBinding layoutNoProducts;
    public final LinearLayout layoutSelectedFilterBau;
    private final CoordinatorLayout rootView;
    public final LinearLayout searchHeader;
    public final RecyclerView stickySelectedQuickFiltersRvBau;
    public final Toolbar toolbar;
    public final AjioAspectRatioImageView toolbarBgIv;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private LayoutPlpBauBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, LayoutNoInternetPlpBinding layoutNoInternetPlpBinding, LayoutImageUploadErrorPlpBinding layoutImageUploadErrorPlpBinding, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, Toolbar toolbar, AjioAspectRatioImageView ajioAspectRatioImageView, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.layoutNoInternet = layoutNoInternetPlpBinding;
        this.layoutNoProducts = layoutImageUploadErrorPlpBinding;
        this.layoutSelectedFilterBau = linearLayout;
        this.searchHeader = linearLayout2;
        this.stickySelectedQuickFiltersRvBau = recyclerView;
        this.toolbar = toolbar;
        this.toolbarBgIv = ajioAspectRatioImageView;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static LayoutPlpBauBinding bind(View object) {
        View view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppBarLayout)view;
        if (object2 != null) {
            n3 = R$id.collapsing_toolbar;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (CollapsingToolbarLayout)view;
            if (object3 != null && (view = dd2_2.a(n3 = R$id.float_header_view, object)) != null) {
                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view);
                n3 = R$id.layout_no_internet;
                view = dd2_2.a(n3, object);
                if (view != null) {
                    LayoutNoInternetPlpBinding layoutNoInternetPlpBinding = LayoutNoInternetPlpBinding.bind(view);
                    n3 = R$id.layout_no_products;
                    view = dd2_2.a(n3, object);
                    if (view != null) {
                        LayoutImageUploadErrorPlpBinding layoutImageUploadErrorPlpBinding = LayoutImageUploadErrorPlpBinding.bind(view);
                        n3 = R$id.layout_selected_filter_bau;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (LinearLayout)view;
                        if (view2 != null) {
                            n3 = R$id.searchHeader;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (LinearLayout)view;
                            if (view3 != null) {
                                n3 = R$id.sticky_selected_quick_filters_rv_bau;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (RecyclerView)view;
                                if (object4 != null) {
                                    n3 = R$id.toolbar;
                                    Object object5 = view = dd2_2.a(n3, object);
                                    object5 = (Toolbar)view;
                                    if (object5 != null) {
                                        n3 = R$id.toolbar_bg_iv;
                                        Object object6 = view = dd2_2.a(n3, object);
                                        object6 = (AjioAspectRatioImageView)view;
                                        if (object6 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                                            ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                                            Object object7 = object;
                                            object7 = (CoordinatorLayout)object;
                                            LayoutPlpBauBinding layoutPlpBauBinding = new LayoutPlpBauBinding((CoordinatorLayout)object7, (AppBarLayout)object2, (CollapsingToolbarLayout)((Object)object3), toolbarTitleSubtitleViewBinding, layoutNoInternetPlpBinding, layoutImageUploadErrorPlpBinding, (LinearLayout)view2, (LinearLayout)view3, (RecyclerView)object4, (Toolbar)object5, (AjioAspectRatioImageView)((Object)object6), toolbarTitleSubtitleViewBinding2);
                                            return layoutPlpBauBinding;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutPlpBauBinding inflate(LayoutInflater layoutInflater) {
        return LayoutPlpBauBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutPlpBauBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_plp_bau;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutPlpBauBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

