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

public final class FragmentReferralBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    public final CoordinatorLayout referralLayoutParent;
    public final RecyclerView referralRv;
    public final ShimmerFrameLayout referralShimmerView;
    public final FrameLayout referralShimmerViewParent;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final View toolbarBackground;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private FragmentReferralBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, CoordinatorLayout coordinatorLayout2, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, Toolbar toolbar, View view, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.referralLayoutParent = coordinatorLayout2;
        this.referralRv = recyclerView;
        this.referralShimmerView = shimmerFrameLayout;
        this.referralShimmerViewParent = frameLayout;
        this.toolbar = toolbar;
        this.toolbarBackground = view;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static FragmentReferralBinding bind(View object) {
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
                Object object4 = object;
                object4 = (CoordinatorLayout)object;
                n3 = R$id.referral_rv;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (RecyclerView)view;
                if (object5 != null) {
                    n3 = R$id.referral_shimmer_view;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (ShimmerFrameLayout)view;
                    if (object6 != null) {
                        n3 = R$id.referral_shimmer_view_parent;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (FrameLayout)view;
                        if (view2 != null) {
                            View view3;
                            n3 = R$id.toolbar;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (Toolbar)view;
                            if (object7 != null && (view3 = dd2_2.a(n3 = R$id.toolbar_background, object)) != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                                object = new FragmentReferralBinding((CoordinatorLayout)object4, (AppBarLayout)object2, (CollapsingToolbarLayout)((Object)object3), toolbarTitleSubtitleViewBinding, (CoordinatorLayout)object4, (RecyclerView)object5, (ShimmerFrameLayout)((Object)object6), (FrameLayout)view2, (Toolbar)object7, view3, toolbarTitleSubtitleViewBinding2);
                                return object;
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

    public static FragmentReferralBinding inflate(LayoutInflater layoutInflater) {
        return FragmentReferralBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentReferralBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_referral;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentReferralBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

