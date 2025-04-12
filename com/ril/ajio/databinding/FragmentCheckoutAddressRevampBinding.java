/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentCheckoutAddressRevampBinding
implements BC3 {
    public final CollapsingToolbarLayout checkoutAddressCollapseToolbar;
    public final AjioTextView checkoutAddressLblAddaddress;
    public final AjioLoaderView checkoutAddressLoader;
    public final RecyclerView checkoutAddressRv;
    public final View checkoutAddressShimmer;
    public final Toolbar checkoutAddressToolbar;
    private final CoordinatorLayout rootView;
    public final AppBarLayout unusedAppBarLayout;
    public final RelativeLayout unusedLayout;
    public final TextView unusedTv;

    private FragmentCheckoutAddressRevampBinding(CoordinatorLayout coordinatorLayout, CollapsingToolbarLayout collapsingToolbarLayout, AjioTextView ajioTextView, AjioLoaderView ajioLoaderView, RecyclerView recyclerView, View view, Toolbar toolbar, AppBarLayout appBarLayout, RelativeLayout relativeLayout, TextView textView) {
        this.rootView = coordinatorLayout;
        this.checkoutAddressCollapseToolbar = collapsingToolbarLayout;
        this.checkoutAddressLblAddaddress = ajioTextView;
        this.checkoutAddressLoader = ajioLoaderView;
        this.checkoutAddressRv = recyclerView;
        this.checkoutAddressShimmer = view;
        this.checkoutAddressToolbar = toolbar;
        this.unusedAppBarLayout = appBarLayout;
        this.unusedLayout = relativeLayout;
        this.unusedTv = textView;
    }

    public static FragmentCheckoutAddressRevampBinding bind(View object) {
        View view;
        int n3 = R$id.checkout_address_collapse_toolbar;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (CollapsingToolbarLayout)view;
        if (object2 != null) {
            n3 = R$id.checkout_address_lbl_addaddress;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.checkout_address_loader;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioLoaderView)view;
                if (object4 != null) {
                    View view2;
                    n3 = R$id.checkout_address_rv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (RecyclerView)view;
                    if (object5 != null && (view2 = dd2_2.a(n3 = R$id.checkout_address_shimmer, object)) != null) {
                        n3 = R$id.checkout_address_toolbar;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (Toolbar)view;
                        if (object6 != null) {
                            n3 = R$id.unused_appBarLayout;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AppBarLayout)view;
                            if (object7 != null) {
                                n3 = R$id.unused_layout;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (RelativeLayout)view;
                                if (view3 != null) {
                                    n3 = R$id.unused_tv;
                                    View view4 = view = dd2_2.a(n3, object);
                                    view4 = (TextView)view;
                                    if (view4 != null) {
                                        Object object8 = object;
                                        object8 = (CoordinatorLayout)object;
                                        FragmentCheckoutAddressRevampBinding fragmentCheckoutAddressRevampBinding = new FragmentCheckoutAddressRevampBinding((CoordinatorLayout)object8, (CollapsingToolbarLayout)((Object)object2), (AjioTextView)object3, (AjioLoaderView)((Object)object4), (RecyclerView)object5, view2, (Toolbar)object6, (AppBarLayout)object7, (RelativeLayout)view3, (TextView)view4);
                                        return fragmentCheckoutAddressRevampBinding;
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

    public static FragmentCheckoutAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCheckoutAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCheckoutAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_checkout_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCheckoutAddressRevampBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

