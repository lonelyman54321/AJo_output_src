/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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
import com.ril.ajio.databinding.AjioCouponGiftCardBinding;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class NewApplyCouponFragmentLayoutRefreshBinding
implements BC3 {
    public final CoordinatorLayout activityCcCallmeParent;
    public final AjioCouponGiftCardBinding ajioGiftCardView;
    public final AppBarLayout appBarLayout;
    public final TextView applyCouponTv;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final RecyclerView couponListRv;
    public final AjioLoaderView couponProgressBar;
    public final TextView couponValidation;
    public final EditText enterCouponET;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    private final CoordinatorLayout rootView;
    public final ConstraintLayout searchCouponContainer;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private NewApplyCouponFragmentLayoutRefreshBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, AjioCouponGiftCardBinding ajioCouponGiftCardBinding, AppBarLayout appBarLayout, TextView textView, CollapsingToolbarLayout collapsingToolbarLayout, RecyclerView recyclerView, AjioLoaderView ajioLoaderView, TextView textView2, EditText editText, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, ConstraintLayout constraintLayout, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = coordinatorLayout;
        this.activityCcCallmeParent = coordinatorLayout2;
        this.ajioGiftCardView = ajioCouponGiftCardBinding;
        this.appBarLayout = appBarLayout;
        this.applyCouponTv = textView;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.couponListRv = recyclerView;
        this.couponProgressBar = ajioLoaderView;
        this.couponValidation = textView2;
        this.enterCouponET = editText;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.searchCouponContainer = constraintLayout;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static NewApplyCouponFragmentLayoutRefreshBinding bind(View object) {
        Object object2 = object;
        object2 = (CoordinatorLayout)object;
        int n3 = R$id.ajio_gift_card_view;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            AjioCouponGiftCardBinding ajioCouponGiftCardBinding = AjioCouponGiftCardBinding.bind(view);
            n3 = R$id.app_bar_layout;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppBarLayout)view;
            if (object3 != null) {
                n3 = R$id.applyCouponTv;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (TextView)view;
                if (view2 != null) {
                    n3 = R$id.collapsing_toolbar;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (CollapsingToolbarLayout)view;
                    if (object4 != null) {
                        n3 = R$id.couponListRv;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (RecyclerView)view;
                        if (object5 != null) {
                            n3 = R$id.couponProgressBar;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioLoaderView)view;
                            if (object6 != null) {
                                n3 = R$id.couponValidation;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (TextView)view;
                                if (view3 != null) {
                                    n3 = R$id.enterCouponET;
                                    View view4 = view = dd2_2.a(n3, object);
                                    view4 = (EditText)view;
                                    if (view4 != null && (view = dd2_2.a(n3 = R$id.float_header_view, object)) != null) {
                                        ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view);
                                        n3 = R$id.searchCouponContainer;
                                        Object object7 = view = dd2_2.a(n3, object);
                                        object7 = (ConstraintLayout)view;
                                        if (object7 != null) {
                                            n3 = R$id.toolbar;
                                            Object object8 = view = dd2_2.a(n3, object);
                                            object8 = (Toolbar)view;
                                            if (object8 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                                                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view);
                                                Object object9 = object;
                                                view = object2;
                                                object = new NewApplyCouponFragmentLayoutRefreshBinding((CoordinatorLayout)object2, (CoordinatorLayout)object2, ajioCouponGiftCardBinding, (AppBarLayout)object3, (TextView)view2, (CollapsingToolbarLayout)((Object)object4), (RecyclerView)object5, (AjioLoaderView)((Object)object6), (TextView)view3, (EditText)view4, toolbarTitleSubtitleViewBinding, (ConstraintLayout)((Object)object7), (Toolbar)object8, toolbarTitleSubtitleViewBinding2);
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewApplyCouponFragmentLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return NewApplyCouponFragmentLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static NewApplyCouponFragmentLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_apply_coupon_fragment_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewApplyCouponFragmentLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

