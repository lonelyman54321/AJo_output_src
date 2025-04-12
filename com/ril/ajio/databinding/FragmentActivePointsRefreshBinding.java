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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class FragmentActivePointsRefreshBinding
implements BC3 {
    public final RecyclerView activePointsRv;
    public final ShimmerFrameLayout apShimmerView;
    public final FrameLayout apShimmerViewParent;
    public final AppBarLayout appBarLayout;
    public final AppCompatImageView awForward;
    public final TextView awViewHistoryTv;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    public final AppCompatImageView pendingForwardIv;
    public final View pendingPointClick;
    public final ConstraintLayout pendingPointContainer;
    public final TextView pendingPointsTv;
    private final CoordinatorLayout rootView;
    public final LinearLayout tncContainer;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;
    public final TextView tvAdditionalPending;

    private FragmentActivePointsRefreshBinding(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, TextView textView, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, AppCompatImageView appCompatImageView2, View view, ConstraintLayout constraintLayout, TextView textView2, LinearLayout linearLayout, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2, TextView textView3) {
        this.rootView = coordinatorLayout;
        this.activePointsRv = recyclerView;
        this.apShimmerView = shimmerFrameLayout;
        this.apShimmerViewParent = frameLayout;
        this.appBarLayout = appBarLayout;
        this.awForward = appCompatImageView;
        this.awViewHistoryTv = textView;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.pendingForwardIv = appCompatImageView2;
        this.pendingPointClick = view;
        this.pendingPointContainer = constraintLayout;
        this.pendingPointsTv = textView2;
        this.tncContainer = linearLayout;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
        this.tvAdditionalPending = textView3;
    }

    public static FragmentActivePointsRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.active_points_rv;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (RecyclerView)view2;
        if (object2 != null) {
            n3 = R$id.ap_shimmer_view;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (ShimmerFrameLayout)view2;
            if (object3 != null) {
                n3 = R$id.ap_shimmer_view_parent;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (FrameLayout)view2;
                if (view3 != null) {
                    n3 = R$id.app_bar_layout;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AppBarLayout)view2;
                    if (object4 != null) {
                        n3 = R$id.aw_forward;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AppCompatImageView)view2;
                        if (object5 != null) {
                            n3 = R$id.aw_view_history_tv;
                            View view4 = view2 = dd2_2.a(n3, view);
                            view4 = (TextView)view2;
                            if (view4 != null) {
                                n3 = R$id.collapsing_toolbar;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (CollapsingToolbarLayout)view2;
                                if (object6 != null && (view2 = dd2_2.a(n3 = R$id.float_header_view, view)) != null) {
                                    View view5;
                                    ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view2);
                                    n3 = R$id.pending_forward_iv;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AppCompatImageView)view2;
                                    if (object7 != null && (view5 = dd2_2.a(n3 = R$id.pending_point_click, view)) != null) {
                                        n3 = R$id.pending_point_container;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (ConstraintLayout)view2;
                                        if (object8 != null) {
                                            n3 = R$id.pending_points_tv;
                                            View view6 = view2 = dd2_2.a(n3, view);
                                            view6 = (TextView)view2;
                                            if (view6 != null) {
                                                n3 = R$id.tnc_container;
                                                View view7 = view2 = dd2_2.a(n3, view);
                                                view7 = (LinearLayout)view2;
                                                if (view7 != null) {
                                                    n3 = R$id.toolbar;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (Toolbar)view2;
                                                    if (object9 != null && (view2 = dd2_2.a(n3 = R$id.toolbar_header_view, view)) != null) {
                                                        ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view2);
                                                        n3 = R$id.tv_additional_pending;
                                                        View view8 = view2 = dd2_2.a(n3, view);
                                                        view8 = (TextView)view2;
                                                        if (view8 != null) {
                                                            Object object10 = view;
                                                            object10 = (CoordinatorLayout)view;
                                                            FragmentActivePointsRefreshBinding fragmentActivePointsRefreshBinding = new FragmentActivePointsRefreshBinding((CoordinatorLayout)object10, (RecyclerView)object2, (ShimmerFrameLayout)((Object)object3), (FrameLayout)view3, (AppBarLayout)object4, (AppCompatImageView)((Object)object5), (TextView)view4, (CollapsingToolbarLayout)((Object)object6), toolbarTitleSubtitleViewBinding, (AppCompatImageView)((Object)object7), view5, (ConstraintLayout)((Object)object8), (TextView)view6, (LinearLayout)view7, (Toolbar)object9, toolbarTitleSubtitleViewBinding2, (TextView)view8);
                                                            return fragmentActivePointsRefreshBinding;
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

    public static FragmentActivePointsRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentActivePointsRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentActivePointsRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_active_points_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentActivePointsRefreshBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

