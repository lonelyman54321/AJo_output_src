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
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class FragmentAjioCashDetailRefreshBinding
implements BC3 {
    public final TabLayout acTabLayout;
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    private final CoordinatorLayout rootView;
    public final FrameLayout tabDataNT;
    public final FrameLayout tabDataT;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;
    public final ShimmerFrameLayout walletShimmerView;

    private FragmentAjioCashDetailRefreshBinding(CoordinatorLayout coordinatorLayout, TabLayout tabLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, FrameLayout frameLayout, FrameLayout frameLayout2, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = coordinatorLayout;
        this.acTabLayout = tabLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.tabDataNT = frameLayout;
        this.tabDataT = frameLayout2;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
        this.walletShimmerView = shimmerFrameLayout;
    }

    public static FragmentAjioCashDetailRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.ac_tab_layout;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (TabLayout)view;
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
                    n3 = R$id.tabDataNT;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (FrameLayout)view;
                    if (view2 != null) {
                        n3 = R$id.tabDataT;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (FrameLayout)view;
                        if (view3 != null) {
                            n3 = R$id.toolbar;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (Toolbar)view;
                            if (object5 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                                n3 = R$id.wallet_shimmer_view;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (ShimmerFrameLayout)view;
                                if (object6 != null) {
                                    Object object7 = object;
                                    object7 = (CoordinatorLayout)object;
                                    FragmentAjioCashDetailRefreshBinding fragmentAjioCashDetailRefreshBinding = new FragmentAjioCashDetailRefreshBinding((CoordinatorLayout)object7, (TabLayout)((Object)object2), (AppBarLayout)object3, (CollapsingToolbarLayout)((Object)object4), toolbarTitleSubtitleViewBinding, (FrameLayout)view2, (FrameLayout)view3, (Toolbar)object5, toolbarTitleSubtitleViewBinding2, (ShimmerFrameLayout)((Object)object6));
                                    return fragmentAjioCashDetailRefreshBinding;
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

    public static FragmentAjioCashDetailRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAjioCashDetailRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAjioCashDetailRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_ajio_cash_detail_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAjioCashDetailRefreshBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

