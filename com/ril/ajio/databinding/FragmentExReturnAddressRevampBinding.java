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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutShimmerAddressRevampBinding;

public final class FragmentExReturnAddressRevampBinding
implements BC3 {
    public final RecyclerView addressRv;
    public final Toolbar alfToolbar;
    public final TextView alfTvAddAddress;
    public final AppBarLayout appBarLayout;
    public final AjioTextView btnProceed;
    public final CollapsingToolbarLayout collapseToolBar;
    public final AjioLoaderView falrPbLoading;
    public final LayoutShimmerAddressRevampBinding falrShimmer;
    public final ConstraintLayout fragmentAddressLayoutProceed;
    private final CoordinatorLayout rootView;

    private FragmentExReturnAddressRevampBinding(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, Toolbar toolbar, TextView textView, AppBarLayout appBarLayout, AjioTextView ajioTextView, CollapsingToolbarLayout collapsingToolbarLayout, AjioLoaderView ajioLoaderView, LayoutShimmerAddressRevampBinding layoutShimmerAddressRevampBinding, ConstraintLayout constraintLayout) {
        this.rootView = coordinatorLayout;
        this.addressRv = recyclerView;
        this.alfToolbar = toolbar;
        this.alfTvAddAddress = textView;
        this.appBarLayout = appBarLayout;
        this.btnProceed = ajioTextView;
        this.collapseToolBar = collapsingToolbarLayout;
        this.falrPbLoading = ajioLoaderView;
        this.falrShimmer = layoutShimmerAddressRevampBinding;
        this.fragmentAddressLayoutProceed = constraintLayout;
    }

    public static FragmentExReturnAddressRevampBinding bind(View object) {
        View view;
        int n3 = R$id.addressRv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (RecyclerView)view;
        if (object2 != null) {
            n3 = R$id.alfToolbar;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (Toolbar)view;
            if (object3 != null) {
                n3 = R$id.alfTvAddAddress;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (TextView)view;
                if (view2 != null) {
                    n3 = R$id.appBarLayout;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AppBarLayout)view;
                    if (object4 != null) {
                        n3 = R$id.btnProceed;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.collapseToolBar;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (CollapsingToolbarLayout)view;
                            if (object6 != null) {
                                n3 = R$id.falrPbLoading;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioLoaderView)view;
                                if (object7 != null && (view = dd2_2.a(n3 = R$id.falrShimmer, object)) != null) {
                                    LayoutShimmerAddressRevampBinding layoutShimmerAddressRevampBinding = LayoutShimmerAddressRevampBinding.bind(view);
                                    n3 = R$id.fragment_address_layout_proceed;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (ConstraintLayout)view;
                                    if (object8 != null) {
                                        Object object9 = object;
                                        object9 = (CoordinatorLayout)object;
                                        FragmentExReturnAddressRevampBinding fragmentExReturnAddressRevampBinding = new FragmentExReturnAddressRevampBinding((CoordinatorLayout)object9, (RecyclerView)object2, (Toolbar)object3, (TextView)view2, (AppBarLayout)object4, (AjioTextView)object5, (CollapsingToolbarLayout)((Object)object6), (AjioLoaderView)((Object)object7), layoutShimmerAddressRevampBinding, (ConstraintLayout)((Object)object8));
                                        return fragmentExReturnAddressRevampBinding;
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

    public static FragmentExReturnAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentExReturnAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentExReturnAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_ex_return_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentExReturnAddressRevampBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

