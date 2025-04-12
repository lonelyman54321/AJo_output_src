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
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.databinding.NoOrderLayoutRevampBinding;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class FragmentOrderlistRevampBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    public final NoOrderLayoutRevampBinding noOrderLayout;
    public final RecyclerView orderListRecyclerView;
    public final LinearLayout orderListViewShimmer;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private FragmentOrderlistRevampBinding(CoordinatorLayout coordinatorLayout, AjioLoaderView ajioLoaderView, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, NoOrderLayoutRevampBinding noOrderLayoutRevampBinding, RecyclerView recyclerView, LinearLayout linearLayout, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = coordinatorLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.noOrderLayout = noOrderLayoutRevampBinding;
        this.orderListRecyclerView = recyclerView;
        this.orderListViewShimmer = linearLayout;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static FragmentOrderlistRevampBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_loader_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioLoaderView)view;
        if (object2 != null) {
            n3 = R$id.app_bar_layout;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppBarLayout)view;
            if (object3 != null) {
                n3 = R$id.collapsing_toolbar;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (CollapsingToolbarLayout)view;
                if (object4 != null && (view = dd2_2.a(n3 = R$id.float_header_view, object)) != null) {
                    ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view);
                    n3 = R$id.no_order_layout;
                    view = dd2_2.a(n3, object);
                    if (view != null) {
                        NoOrderLayoutRevampBinding noOrderLayoutRevampBinding = NoOrderLayoutRevampBinding.bind(view);
                        n3 = R$id.order_list_recycler_view;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (RecyclerView)view;
                        if (object5 != null) {
                            n3 = R$id.order_list_view_shimmer;
                            View view2 = view = dd2_2.a(n3, object);
                            view2 = (LinearLayout)view;
                            if (view2 != null) {
                                n3 = R$id.toolbar;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (Toolbar)view;
                                if (object6 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                                    ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                                    Object object7 = object;
                                    object7 = (CoordinatorLayout)object;
                                    FragmentOrderlistRevampBinding fragmentOrderlistRevampBinding = new FragmentOrderlistRevampBinding((CoordinatorLayout)object7, (AjioLoaderView)((Object)object2), (AppBarLayout)object3, (CollapsingToolbarLayout)((Object)object4), toolbarTitleSubtitleViewBinding, noOrderLayoutRevampBinding, (RecyclerView)object5, (LinearLayout)view2, (Toolbar)object6, toolbarTitleSubtitleViewBinding2);
                                    return fragmentOrderlistRevampBinding;
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

    public static FragmentOrderlistRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentOrderlistRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentOrderlistRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_orderlist_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentOrderlistRevampBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

