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
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.databinding.EmptyCartLayoutLuxeBinding;

public final class FragmentCartListLuxeBinding
implements BC3 {
    public final AppBarLayout cartAppBarLayout;
    public final RecyclerView cartRv;
    public final LinearLayout cartShimmer;
    public final ShimmerFrameLayout cartShimmerView;
    public final Toolbar cartToolbarLuxe;
    public final EmptyCartLayoutLuxeBinding emptyCartLayout;
    public final FrameLayout fragmentCartListLayoutButton;
    public final TextView luxeCartToolbarSubTitle;
    public final TextView luxeCartToolbarTitle;
    public final AjioProgressView newFragmentCartListProgressBar;
    private final ConstraintLayout rootView;

    private FragmentCartListLuxeBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, LinearLayout linearLayout, ShimmerFrameLayout shimmerFrameLayout, Toolbar toolbar, EmptyCartLayoutLuxeBinding emptyCartLayoutLuxeBinding, FrameLayout frameLayout, TextView textView, TextView textView2, AjioProgressView ajioProgressView) {
        this.rootView = constraintLayout;
        this.cartAppBarLayout = appBarLayout;
        this.cartRv = recyclerView;
        this.cartShimmer = linearLayout;
        this.cartShimmerView = shimmerFrameLayout;
        this.cartToolbarLuxe = toolbar;
        this.emptyCartLayout = emptyCartLayoutLuxeBinding;
        this.fragmentCartListLayoutButton = frameLayout;
        this.luxeCartToolbarSubTitle = textView;
        this.luxeCartToolbarTitle = textView2;
        this.newFragmentCartListProgressBar = ajioProgressView;
    }

    public static FragmentCartListLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.cart_app_bar_layout;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppBarLayout)view;
        if (object2 != null) {
            n3 = R$id.cart_rv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (RecyclerView)view;
            if (object3 != null) {
                n3 = R$id.cart_shimmer;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.cart_shimmer_view;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (ShimmerFrameLayout)view;
                    if (object4 != null) {
                        n3 = R$id.cart_toolbar_luxe;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (Toolbar)view;
                        if (object5 != null && (view = dd2_2.a(n3 = R$id.emptyCartLayout, object)) != null) {
                            EmptyCartLayoutLuxeBinding emptyCartLayoutLuxeBinding = EmptyCartLayoutLuxeBinding.bind(view);
                            n3 = R$id.fragment_cart_list_layout_button;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (FrameLayout)view;
                            if (view3 != null) {
                                n3 = R$id.luxe_cart_toolbar_sub_title;
                                View view4 = view = dd2_2.a(n3, object);
                                view4 = (TextView)view;
                                if (view4 != null) {
                                    n3 = R$id.luxe_cart_toolbar_title;
                                    View view5 = view = dd2_2.a(n3, object);
                                    view5 = (TextView)view;
                                    if (view5 != null) {
                                        n3 = R$id.new_fragment_cart_list_progress_bar;
                                        Object object6 = view = dd2_2.a(n3, object);
                                        object6 = (AjioProgressView)view;
                                        if (object6 != null) {
                                            Object object7 = object;
                                            object7 = (ConstraintLayout)((Object)object);
                                            FragmentCartListLuxeBinding fragmentCartListLuxeBinding = new FragmentCartListLuxeBinding((ConstraintLayout)((Object)object7), (AppBarLayout)object2, (RecyclerView)object3, (LinearLayout)view2, (ShimmerFrameLayout)((Object)object4), (Toolbar)object5, emptyCartLayoutLuxeBinding, (FrameLayout)view3, (TextView)view4, (TextView)view5, (AjioProgressView)((Object)object6));
                                            return fragmentCartListLuxeBinding;
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

    public static FragmentCartListLuxeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCartListLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCartListLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cart_list_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCartListLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

