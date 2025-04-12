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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class FragmentAjioCashRefreshBinding
implements BC3 {
    public final ShimmerFrameLayout acShimmerView;
    public final FrameLayout acShimmerViewParent;
    public final AppBarLayout appBarLayout;
    public final AppCompatImageView awForward;
    public final RecyclerView awLpRv;
    public final TextView awViewHistoryTv;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;
    public final LinearLayout walletSpendsContainer;

    private FragmentAjioCashRefreshBinding(CoordinatorLayout coordinatorLayout, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, RecyclerView recyclerView, TextView textView, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2, LinearLayout linearLayout) {
        this.rootView = coordinatorLayout;
        this.acShimmerView = shimmerFrameLayout;
        this.acShimmerViewParent = frameLayout;
        this.appBarLayout = appBarLayout;
        this.awForward = appCompatImageView;
        this.awLpRv = recyclerView;
        this.awViewHistoryTv = textView;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
        this.walletSpendsContainer = linearLayout;
    }

    public static FragmentAjioCashRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.ac_shimmer_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ShimmerFrameLayout)view;
        if (object2 != null) {
            n3 = R$id.ac_shimmer_view_parent;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (FrameLayout)view;
            if (view2 != null) {
                n3 = R$id.app_bar_layout;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AppBarLayout)view;
                if (object3 != null) {
                    n3 = R$id.aw_forward;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AppCompatImageView)view;
                    if (object4 != null) {
                        n3 = R$id.aw_lp_rv;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (RecyclerView)view;
                        if (object5 != null) {
                            n3 = R$id.aw_view_history_tv;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (TextView)view;
                            if (view3 != null) {
                                n3 = R$id.collapsing_toolbar;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (CollapsingToolbarLayout)view;
                                if (object6 != null && (view = dd2_2.a(n3 = R$id.float_header_view, object)) != null) {
                                    ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view);
                                    n3 = R$id.toolbar;
                                    Object object7 = view = dd2_2.a(n3, object);
                                    object7 = (Toolbar)view;
                                    if (object7 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                                        ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                                        n3 = R$id.wallet_spends_container;
                                        View view4 = view = dd2_2.a(n3, object);
                                        view4 = (LinearLayout)view;
                                        if (view4 != null) {
                                            Object object8 = object;
                                            object8 = (CoordinatorLayout)object;
                                            FragmentAjioCashRefreshBinding fragmentAjioCashRefreshBinding = new FragmentAjioCashRefreshBinding((CoordinatorLayout)object8, (ShimmerFrameLayout)((Object)object2), (FrameLayout)view2, (AppBarLayout)object3, (AppCompatImageView)((Object)object4), (RecyclerView)object5, (TextView)view3, (CollapsingToolbarLayout)((Object)object6), toolbarTitleSubtitleViewBinding, (Toolbar)object7, toolbarTitleSubtitleViewBinding2, (LinearLayout)view4);
                                            return fragmentAjioCashRefreshBinding;
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

    public static FragmentAjioCashRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAjioCashRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAjioCashRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_ajio_cash_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAjioCashRefreshBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

