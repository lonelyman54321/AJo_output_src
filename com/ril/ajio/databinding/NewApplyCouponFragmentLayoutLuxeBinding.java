/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
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
import com.ril.ajio.databinding.AjioCouponGiftCardLuxeBinding;

public final class NewApplyCouponFragmentLayoutLuxeBinding
implements BC3 {
    public final AjioCouponGiftCardLuxeBinding ajioGiftCardView;
    public final AppBarLayout appBarLayout;
    public final TextView applyCouponTv;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ImageView couponCancel;
    public final RecyclerView couponListRv;
    public final Toolbar couponLuxeToolbar;
    public final CoordinatorLayout couponParent;
    public final AjioLoaderView couponProgressBar;
    public final TextView couponValidation;
    public final ConstraintLayout editCouponContainer;
    public final EditText enterCouponET;
    public final TextView luxeCartToolbarTitle;
    private final CoordinatorLayout rootView;
    public final ConstraintLayout searchCouponContainer;

    private NewApplyCouponFragmentLayoutLuxeBinding(CoordinatorLayout coordinatorLayout, AjioCouponGiftCardLuxeBinding ajioCouponGiftCardLuxeBinding, AppBarLayout appBarLayout, TextView textView, CollapsingToolbarLayout collapsingToolbarLayout, ImageView imageView, RecyclerView recyclerView, Toolbar toolbar, CoordinatorLayout coordinatorLayout2, AjioLoaderView ajioLoaderView, TextView textView2, ConstraintLayout constraintLayout, EditText editText, TextView textView3, ConstraintLayout constraintLayout2) {
        this.rootView = coordinatorLayout;
        this.ajioGiftCardView = ajioCouponGiftCardLuxeBinding;
        this.appBarLayout = appBarLayout;
        this.applyCouponTv = textView;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.couponCancel = imageView;
        this.couponListRv = recyclerView;
        this.couponLuxeToolbar = toolbar;
        this.couponParent = coordinatorLayout2;
        this.couponProgressBar = ajioLoaderView;
        this.couponValidation = textView2;
        this.editCouponContainer = constraintLayout;
        this.enterCouponET = editText;
        this.luxeCartToolbarTitle = textView3;
        this.searchCouponContainer = constraintLayout2;
    }

    public static NewApplyCouponFragmentLayoutLuxeBinding bind(View view) {
        Object object = view;
        int n3 = R$id.ajio_gift_card_view;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            AjioCouponGiftCardLuxeBinding ajioCouponGiftCardLuxeBinding = AjioCouponGiftCardLuxeBinding.bind(view2);
            n3 = R$id.app_bar_layout;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AppBarLayout)view2;
            if (object2 != null) {
                n3 = R$id.applyCouponTv;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (TextView)view2;
                if (view3 != null) {
                    n3 = R$id.collapsing_toolbar;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (CollapsingToolbarLayout)view2;
                    if (object3 != null) {
                        n3 = R$id.coupon_cancel;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (ImageView)view2;
                        if (view4 != null) {
                            n3 = R$id.couponListRv;
                            Object object4 = view2 = dd2_2.a(n3, view);
                            object4 = (RecyclerView)view2;
                            if (object4 != null) {
                                n3 = R$id.coupon_luxe_toolbar;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (Toolbar)view2;
                                if (object5 != null) {
                                    Object object6 = view;
                                    object6 = (CoordinatorLayout)view;
                                    n3 = R$id.couponProgressBar;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioLoaderView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.couponValidation;
                                        View view5 = view2 = dd2_2.a(n3, view);
                                        view5 = (TextView)view2;
                                        if (view5 != null) {
                                            n3 = R$id.editCouponContainer;
                                            Object object8 = view2 = dd2_2.a(n3, view);
                                            object8 = (ConstraintLayout)view2;
                                            if (object8 != null) {
                                                n3 = R$id.enterCouponET;
                                                View view6 = view2 = dd2_2.a(n3, view);
                                                view6 = (EditText)view2;
                                                if (view6 != null) {
                                                    n3 = R$id.luxe_cart_toolbar_title;
                                                    View view7 = view2 = dd2_2.a(n3, view);
                                                    view7 = (TextView)view2;
                                                    if (view7 != null) {
                                                        n3 = R$id.searchCouponContainer;
                                                        Object object9 = view2 = dd2_2.a(n3, view);
                                                        object9 = (ConstraintLayout)view2;
                                                        if (object9 != null) {
                                                            object = new NewApplyCouponFragmentLayoutLuxeBinding((CoordinatorLayout)object6, ajioCouponGiftCardLuxeBinding, (AppBarLayout)object2, (TextView)view3, (CollapsingToolbarLayout)((Object)object3), (ImageView)view4, (RecyclerView)object4, (Toolbar)object5, (CoordinatorLayout)object6, (AjioLoaderView)((Object)object7), (TextView)view5, (ConstraintLayout)((Object)object8), (EditText)view6, (TextView)view7, (ConstraintLayout)((Object)object9));
                                                            return object;
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

    public static NewApplyCouponFragmentLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return NewApplyCouponFragmentLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static NewApplyCouponFragmentLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_apply_coupon_fragment_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewApplyCouponFragmentLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

