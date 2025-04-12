/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutHomeShimmerRevampBinding;
import com.ril.ajio.databinding.LayoutLandingPageSearchWithMenuBinding;
import com.ril.ajio.databinding.PageErrorHomePageBinding;

public final class FragmentStoreLandingPageBinding
implements BC3 {
    public final PageErrorHomePageBinding errorContainer;
    public final AppBarLayout fslpAppBar;
    public final AjioImageView fslpIvBack;
    public final AjioImageView fslpIvStoreLogo;
    public final FrameLayout fslpNSV;
    public final ConstraintLayout fslpNewHeader;
    public final LayoutLandingPageSearchWithMenuBinding fslpNewSearch;
    public final AjioProgressView fslpProgress;
    public final LinearLayout fslpSearchbarContainer;
    public final LayoutHomeShimmerRevampBinding fslpShimmer;
    public final TabLayout fslpTabLayout;
    public final FrameLayout homeCmsShimmerParent;
    public final RecyclerView homeListSisRV;
    private final CoordinatorLayout rootView;
    public final AjioImageView rowSearchComponentImvSearch;
    public final RelativeLayout rowSearchComponentLayout;
    public final AjioTextView rowSearchComponentTvSearch;

    private FragmentStoreLandingPageBinding(CoordinatorLayout coordinatorLayout, PageErrorHomePageBinding pageErrorHomePageBinding, AppBarLayout appBarLayout, AjioImageView ajioImageView, AjioImageView ajioImageView2, FrameLayout frameLayout, ConstraintLayout constraintLayout, LayoutLandingPageSearchWithMenuBinding layoutLandingPageSearchWithMenuBinding, AjioProgressView ajioProgressView, LinearLayout linearLayout, LayoutHomeShimmerRevampBinding layoutHomeShimmerRevampBinding, TabLayout tabLayout, FrameLayout frameLayout2, RecyclerView recyclerView, AjioImageView ajioImageView3, RelativeLayout relativeLayout, AjioTextView ajioTextView) {
        this.rootView = coordinatorLayout;
        this.errorContainer = pageErrorHomePageBinding;
        this.fslpAppBar = appBarLayout;
        this.fslpIvBack = ajioImageView;
        this.fslpIvStoreLogo = ajioImageView2;
        this.fslpNSV = frameLayout;
        this.fslpNewHeader = constraintLayout;
        this.fslpNewSearch = layoutLandingPageSearchWithMenuBinding;
        this.fslpProgress = ajioProgressView;
        this.fslpSearchbarContainer = linearLayout;
        this.fslpShimmer = layoutHomeShimmerRevampBinding;
        this.fslpTabLayout = tabLayout;
        this.homeCmsShimmerParent = frameLayout2;
        this.homeListSisRV = recyclerView;
        this.rowSearchComponentImvSearch = ajioImageView3;
        this.rowSearchComponentLayout = relativeLayout;
        this.rowSearchComponentTvSearch = ajioTextView;
    }

    public static FragmentStoreLandingPageBinding bind(View view) {
        Object object = view;
        int n3 = R$id.error_container;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            PageErrorHomePageBinding pageErrorHomePageBinding = PageErrorHomePageBinding.bind(view2);
            n3 = R$id.fslpAppBar;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AppBarLayout)view2;
            if (object2 != null) {
                n3 = R$id.fslpIvBack;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioImageView)view2;
                if (object3 != null) {
                    n3 = R$id.fslpIvStoreLogo;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioImageView)view2;
                    if (object4 != null) {
                        n3 = R$id.fslpNSV;
                        View view3 = view2 = dd2_2.a(n3, view);
                        view3 = (FrameLayout)view2;
                        if (view3 != null) {
                            n3 = R$id.fslpNewHeader;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (ConstraintLayout)view2;
                            if (object5 != null && (view2 = dd2_2.a(n3 = R$id.fslpNewSearch, view)) != null) {
                                LayoutLandingPageSearchWithMenuBinding layoutLandingPageSearchWithMenuBinding = LayoutLandingPageSearchWithMenuBinding.bind(view2);
                                n3 = R$id.fslp_progress;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AjioProgressView)view2;
                                if (object6 != null) {
                                    n3 = R$id.fslp_searchbar_container;
                                    View view4 = view2 = dd2_2.a(n3, view);
                                    view4 = (LinearLayout)view2;
                                    if (view4 != null && (view2 = dd2_2.a(n3 = R$id.fslpShimmer, view)) != null) {
                                        LayoutHomeShimmerRevampBinding layoutHomeShimmerRevampBinding = LayoutHomeShimmerRevampBinding.bind(view2);
                                        n3 = R$id.fslpTabLayout;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (TabLayout)view2;
                                        if (object7 != null) {
                                            n3 = R$id.homeCmsShimmerParent;
                                            View view5 = view2 = dd2_2.a(n3, view);
                                            view5 = (FrameLayout)view2;
                                            if (view5 != null) {
                                                n3 = R$id.homeListSisRV;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (RecyclerView)view2;
                                                if (object8 != null) {
                                                    n3 = R$id.row_search_component_imv_search;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (AjioImageView)view2;
                                                    if (object9 != null) {
                                                        n3 = R$id.row_search_component_layout;
                                                        View view6 = view2 = dd2_2.a(n3, view);
                                                        view6 = (RelativeLayout)view2;
                                                        if (view6 != null) {
                                                            n3 = R$id.row_search_component_tv_search;
                                                            Object object10 = view2 = dd2_2.a(n3, view);
                                                            object10 = (AjioTextView)view2;
                                                            if (object10 != null) {
                                                                Object object11 = view;
                                                                object11 = (CoordinatorLayout)view;
                                                                FragmentStoreLandingPageBinding fragmentStoreLandingPageBinding = new FragmentStoreLandingPageBinding((CoordinatorLayout)object11, pageErrorHomePageBinding, (AppBarLayout)object2, (AjioImageView)((Object)object3), (AjioImageView)((Object)object4), (FrameLayout)view3, (ConstraintLayout)((Object)object5), layoutLandingPageSearchWithMenuBinding, (AjioProgressView)((Object)object6), (LinearLayout)view4, layoutHomeShimmerRevampBinding, (TabLayout)((Object)object7), (FrameLayout)view5, (RecyclerView)object8, (AjioImageView)((Object)object9), (RelativeLayout)view6, (AjioTextView)object10);
                                                                return fragmentStoreLandingPageBinding;
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

    public static FragmentStoreLandingPageBinding inflate(LayoutInflater layoutInflater) {
        return FragmentStoreLandingPageBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentStoreLandingPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_store_landing_page;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentStoreLandingPageBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

