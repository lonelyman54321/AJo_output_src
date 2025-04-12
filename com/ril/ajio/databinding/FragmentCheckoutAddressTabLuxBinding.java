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
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentCheckoutAddressTabLuxBinding
implements BC3 {
    public final AjioTextView checkoutAddressLblAddaddress;
    public final AjioLoaderView checkoutAddressLoader;
    public final View checkoutAddressShimmer;
    public final TabLayout checkoutAddressTab;
    public final Toolbar checkoutAddressToolbarLuxe;
    public final TextView checkoutAddressToolbarTitle;
    public final ViewPager checkoutAddressViewpager;
    private final CoordinatorLayout rootView;
    public final AppBarLayout unusedAppBarLayout;

    private FragmentCheckoutAddressTabLuxBinding(CoordinatorLayout coordinatorLayout, AjioTextView ajioTextView, AjioLoaderView ajioLoaderView, View view, TabLayout tabLayout, Toolbar toolbar, TextView textView, ViewPager viewPager, AppBarLayout appBarLayout) {
        this.rootView = coordinatorLayout;
        this.checkoutAddressLblAddaddress = ajioTextView;
        this.checkoutAddressLoader = ajioLoaderView;
        this.checkoutAddressShimmer = view;
        this.checkoutAddressTab = tabLayout;
        this.checkoutAddressToolbarLuxe = toolbar;
        this.checkoutAddressToolbarTitle = textView;
        this.checkoutAddressViewpager = viewPager;
        this.unusedAppBarLayout = appBarLayout;
    }

    public static FragmentCheckoutAddressTabLuxBinding bind(View object) {
        View view;
        int n3 = R$id.checkout_address_lbl_addaddress;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            View view2;
            n3 = R$id.checkout_address_loader;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioLoaderView)view;
            if (object3 != null && (view2 = dd2_2.a(n3 = R$id.checkout_address_shimmer, object)) != null) {
                n3 = R$id.checkout_address_tab;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (TabLayout)view;
                if (object4 != null) {
                    n3 = R$id.checkout_address_toolbar_luxe;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (Toolbar)view;
                    if (object5 != null) {
                        n3 = R$id.checkout_address_toolbar_title;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (TextView)view;
                        if (view3 != null) {
                            n3 = R$id.checkout_address_viewpager;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (ViewPager)view;
                            if (object6 != null) {
                                n3 = R$id.unused_appBarLayout;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AppBarLayout)view;
                                if (object7 != null) {
                                    Object object8 = object;
                                    object8 = (CoordinatorLayout)object;
                                    FragmentCheckoutAddressTabLuxBinding fragmentCheckoutAddressTabLuxBinding = new FragmentCheckoutAddressTabLuxBinding((CoordinatorLayout)object8, (AjioTextView)object2, (AjioLoaderView)((Object)object3), view2, (TabLayout)((Object)object4), (Toolbar)object5, (TextView)view3, (ViewPager)((Object)object6), (AppBarLayout)object7);
                                    return fragmentCheckoutAddressTabLuxBinding;
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

    public static FragmentCheckoutAddressTabLuxBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCheckoutAddressTabLuxBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCheckoutAddressTabLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_checkout_address_tab_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCheckoutAddressTabLuxBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

