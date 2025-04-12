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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.databinding.LayoutShimmerAddressRevampBinding;

public final class FragmentAddressListRevampBinding
implements BC3 {
    public final CollapsingToolbarLayout alfCtl;
    public final Toolbar alfToolbar;
    public final TextView alfTvAddAddress;
    public final AppBarLayout appBarLayout;
    public final AjioLoaderView falrPbLoading;
    public final RecyclerView falrRvAddress;
    public final LayoutShimmerAddressRevampBinding falrShimmer;
    private final CoordinatorLayout rootView;

    private FragmentAddressListRevampBinding(CoordinatorLayout coordinatorLayout, CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, TextView textView, AppBarLayout appBarLayout, AjioLoaderView ajioLoaderView, RecyclerView recyclerView, LayoutShimmerAddressRevampBinding layoutShimmerAddressRevampBinding) {
        this.rootView = coordinatorLayout;
        this.alfCtl = collapsingToolbarLayout;
        this.alfToolbar = toolbar;
        this.alfTvAddAddress = textView;
        this.appBarLayout = appBarLayout;
        this.falrPbLoading = ajioLoaderView;
        this.falrRvAddress = recyclerView;
        this.falrShimmer = layoutShimmerAddressRevampBinding;
    }

    public static FragmentAddressListRevampBinding bind(View object) {
        View view;
        int n3 = R$id.alfCtl;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (CollapsingToolbarLayout)view;
        if (object2 != null) {
            n3 = R$id.alfToolbar;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (Toolbar)view;
            if (object3 != null) {
                n3 = R$id.alfTvAddAddress;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (TextView)view;
                if (view2 != null) {
                    n3 = R$id.app_bar_layout;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AppBarLayout)view;
                    if (object4 != null) {
                        n3 = R$id.falrPbLoading;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioLoaderView)view;
                        if (object5 != null) {
                            n3 = R$id.falrRvAddress;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (RecyclerView)view;
                            if (object6 != null && (view = dd2_2.a(n3 = R$id.falrShimmer, object)) != null) {
                                LayoutShimmerAddressRevampBinding layoutShimmerAddressRevampBinding = LayoutShimmerAddressRevampBinding.bind(view);
                                Object object7 = object;
                                object7 = (CoordinatorLayout)object;
                                FragmentAddressListRevampBinding fragmentAddressListRevampBinding = new FragmentAddressListRevampBinding((CoordinatorLayout)object7, (CollapsingToolbarLayout)((Object)object2), (Toolbar)object3, (TextView)view2, (AppBarLayout)object4, (AjioLoaderView)((Object)object5), (RecyclerView)object6, layoutShimmerAddressRevampBinding);
                                return fragmentAddressListRevampBinding;
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

    public static FragmentAddressListRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAddressListRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAddressListRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_address_list_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAddressListRevampBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

