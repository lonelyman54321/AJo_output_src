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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentCheckoutAddressLuxBinding
implements BC3 {
    public final AjioTextView checkoutAddressLblAddaddress;
    public final AjioLoaderView checkoutAddressLoader;
    public final RecyclerView checkoutAddressRv;
    public final View checkoutAddressShimmer;
    public final Toolbar checkoutAddressToolbarLuxe;
    public final TextView checkoutAddressToolbarTitle;
    private final CoordinatorLayout rootView;
    public final AppBarLayout unusedAppBarLayout;

    private FragmentCheckoutAddressLuxBinding(CoordinatorLayout coordinatorLayout, AjioTextView ajioTextView, AjioLoaderView ajioLoaderView, RecyclerView recyclerView, View view, Toolbar toolbar, TextView textView, AppBarLayout appBarLayout) {
        this.rootView = coordinatorLayout;
        this.checkoutAddressLblAddaddress = ajioTextView;
        this.checkoutAddressLoader = ajioLoaderView;
        this.checkoutAddressRv = recyclerView;
        this.checkoutAddressShimmer = view;
        this.checkoutAddressToolbarLuxe = toolbar;
        this.checkoutAddressToolbarTitle = textView;
        this.unusedAppBarLayout = appBarLayout;
    }

    public static FragmentCheckoutAddressLuxBinding bind(View object) {
        View view;
        int n3 = R$id.checkout_address_lbl_addaddress;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.checkout_address_loader;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioLoaderView)view;
            if (object3 != null) {
                View view2;
                n3 = R$id.checkout_address_rv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null && (view2 = dd2_2.a(n3 = R$id.checkout_address_shimmer, object)) != null) {
                    n3 = R$id.checkout_address_toolbar_luxe;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (Toolbar)view;
                    if (object5 != null) {
                        n3 = R$id.checkout_address_toolbar_title;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (TextView)view;
                        if (view3 != null) {
                            n3 = R$id.unused_appBarLayout;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AppBarLayout)view;
                            if (object6 != null) {
                                Object object7 = object;
                                object7 = (CoordinatorLayout)object;
                                FragmentCheckoutAddressLuxBinding fragmentCheckoutAddressLuxBinding = new FragmentCheckoutAddressLuxBinding((CoordinatorLayout)object7, (AjioTextView)object2, (AjioLoaderView)((Object)object3), (RecyclerView)object4, view2, (Toolbar)object5, (TextView)view3, (AppBarLayout)object6);
                                return fragmentCheckoutAddressLuxBinding;
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

    public static FragmentCheckoutAddressLuxBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCheckoutAddressLuxBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCheckoutAddressLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_checkout_address_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCheckoutAddressLuxBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

