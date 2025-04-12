/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class FragmentPendingPointsRefreshBinding
implements BC3 {
    public final RecyclerView activePointsRv;
    public final ShimmerFrameLayout apShimmerView;
    public final FrameLayout apShimmerViewParent;
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private FragmentPendingPointsRefreshBinding(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = coordinatorLayout;
        this.activePointsRv = recyclerView;
        this.apShimmerView = shimmerFrameLayout;
        this.apShimmerViewParent = frameLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static FragmentPendingPointsRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.active_points_rv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (RecyclerView)view;
        if (object2 != null) {
            n3 = R$id.ap_shimmer_view;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (ShimmerFrameLayout)view;
            if (object3 != null) {
                n3 = R$id.ap_shimmer_view_parent;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (FrameLayout)view;
                if (view2 != null) {
                    n3 = R$id.app_bar_layout;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AppBarLayout)view;
                    if (object4 != null) {
                        n3 = R$id.collapsing_toolbar;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (CollapsingToolbarLayout)view;
                        if (object5 != null && (view = dd2_2.a(n3 = R$id.float_header_view, object)) != null) {
                            ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view);
                            n3 = R$id.toolbar;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (Toolbar)view;
                            if (object6 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                                Object object7 = object;
                                object7 = (CoordinatorLayout)object;
                                FragmentPendingPointsRefreshBinding fragmentPendingPointsRefreshBinding = new FragmentPendingPointsRefreshBinding((CoordinatorLayout)object7, (RecyclerView)object2, (ShimmerFrameLayout)((Object)object3), (FrameLayout)view2, (AppBarLayout)object4, (CollapsingToolbarLayout)((Object)object5), toolbarTitleSubtitleViewBinding, (Toolbar)object6, toolbarTitleSubtitleViewBinding2);
                                return fragmentPendingPointsRefreshBinding;
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

    public static FragmentPendingPointsRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentPendingPointsRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentPendingPointsRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_pending_points_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentPendingPointsRefreshBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

