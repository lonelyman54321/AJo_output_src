/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentExReturnTabAddressRevampBinding
implements BC3 {
    public final Toolbar alfToolbar;
    public final TextView alfTvAddAddress;
    public final AjioTextView btnProceed;
    public final AjioTextView btnProceedNew;
    public final ConstraintLayout clAddressLayout;
    public final CollapsingToolbarLayout collapseToolBar;
    public final View exReturnShimmer;
    public final ConstraintLayout fragmentAddressLayoutProceed;
    public final ConstraintLayout fragmentAddressLayoutProceedTabs;
    public final TabLayout pickupTab;
    public final ViewPager pickupViewpager;
    private final CoordinatorLayout rootView;
    public final AjioTextView tvItemElligible;
    public final TextView unusedTv;

    private FragmentExReturnTabAddressRevampBinding(CoordinatorLayout coordinatorLayout, Toolbar toolbar, TextView textView, AjioTextView ajioTextView, AjioTextView ajioTextView2, ConstraintLayout constraintLayout, CollapsingToolbarLayout collapsingToolbarLayout, View view, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TabLayout tabLayout, ViewPager viewPager, AjioTextView ajioTextView3, TextView textView2) {
        this.rootView = coordinatorLayout;
        this.alfToolbar = toolbar;
        this.alfTvAddAddress = textView;
        this.btnProceed = ajioTextView;
        this.btnProceedNew = ajioTextView2;
        this.clAddressLayout = constraintLayout;
        this.collapseToolBar = collapsingToolbarLayout;
        this.exReturnShimmer = view;
        this.fragmentAddressLayoutProceed = constraintLayout2;
        this.fragmentAddressLayoutProceedTabs = constraintLayout3;
        this.pickupTab = tabLayout;
        this.pickupViewpager = viewPager;
        this.tvItemElligible = ajioTextView3;
        this.unusedTv = textView2;
    }

    public static FragmentExReturnTabAddressRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.alfToolbar;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (Toolbar)view2;
        if (object2 != null) {
            n3 = R$id.alfTvAddAddress;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (TextView)view2;
            if (view3 != null) {
                n3 = R$id.btnProceed;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.btnProceedNew;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.clAddressLayout;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (ConstraintLayout)view2;
                        if (object5 != null) {
                            View view4;
                            n3 = R$id.collapseToolBar;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (CollapsingToolbarLayout)view2;
                            if (object6 != null && (view4 = dd2_2.a(n3 = R$id.exReturnShimmer, view)) != null) {
                                n3 = R$id.fragment_address_layout_proceed;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (ConstraintLayout)view2;
                                if (object7 != null) {
                                    n3 = R$id.fragment_address_layout_proceed_tabs;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (ConstraintLayout)view2;
                                    if (object8 != null) {
                                        n3 = R$id.pickup_tab;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (TabLayout)view2;
                                        if (object9 != null) {
                                            n3 = R$id.pickup_viewpager;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (ViewPager)view2;
                                            if (object10 != null) {
                                                n3 = R$id.tvItemElligible;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioTextView)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.unused_tv;
                                                    View view5 = view2 = dd2_2.a(n3, view);
                                                    view5 = (TextView)view2;
                                                    if (view5 != null) {
                                                        Object object12 = view;
                                                        object12 = (CoordinatorLayout)view;
                                                        FragmentExReturnTabAddressRevampBinding fragmentExReturnTabAddressRevampBinding = new FragmentExReturnTabAddressRevampBinding((CoordinatorLayout)object12, (Toolbar)object2, (TextView)view3, (AjioTextView)object3, (AjioTextView)object4, (ConstraintLayout)((Object)object5), (CollapsingToolbarLayout)((Object)object6), view4, (ConstraintLayout)((Object)object7), (ConstraintLayout)((Object)object8), (TabLayout)((Object)object9), (ViewPager)((Object)object10), (AjioTextView)object11, (TextView)view5);
                                                        return fragmentExReturnTabAddressRevampBinding;
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

    public static FragmentExReturnTabAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentExReturnTabAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentExReturnTabAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_ex_return_tab_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentExReturnTabAddressRevampBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

