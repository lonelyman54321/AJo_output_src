/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ActivityExchangeConfirmedBinding
implements BC3 {
    public final Toolbar alfToolbar;
    public final AppBarLayout appBarLayout;
    public final ConstraintLayout clContinueShopping;
    public final CollapsingToolbarLayout collapseToolBar;
    public final AjioTextView continueShopping;
    public final FrameLayout exchangeConfirmedContentframe;
    private final CoordinatorLayout rootView;

    private ActivityExchangeConfirmedBinding(CoordinatorLayout coordinatorLayout, Toolbar toolbar, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, CollapsingToolbarLayout collapsingToolbarLayout, AjioTextView ajioTextView, FrameLayout frameLayout) {
        this.rootView = coordinatorLayout;
        this.alfToolbar = toolbar;
        this.appBarLayout = appBarLayout;
        this.clContinueShopping = constraintLayout;
        this.collapseToolBar = collapsingToolbarLayout;
        this.continueShopping = ajioTextView;
        this.exchangeConfirmedContentframe = frameLayout;
    }

    public static ActivityExchangeConfirmedBinding bind(View object) {
        View view;
        int n3 = R$id.alfToolbar;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (Toolbar)view;
        if (object2 != null) {
            n3 = R$id.appBarLayout;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppBarLayout)view;
            if (object3 != null) {
                n3 = R$id.clContinueShopping;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (ConstraintLayout)view;
                if (object4 != null) {
                    n3 = R$id.collapseToolBar;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (CollapsingToolbarLayout)view;
                    if (object5 != null) {
                        n3 = R$id.continue_shopping;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.exchange_confirmed_contentframe;
                            View view2 = view = dd2_2.a(n3, object);
                            view2 = (FrameLayout)view;
                            if (view2 != null) {
                                Object object7 = object;
                                object7 = (CoordinatorLayout)object;
                                ActivityExchangeConfirmedBinding activityExchangeConfirmedBinding = new ActivityExchangeConfirmedBinding((CoordinatorLayout)object7, (Toolbar)object2, (AppBarLayout)object3, (ConstraintLayout)((Object)object4), (CollapsingToolbarLayout)((Object)object5), (AjioTextView)object6, (FrameLayout)view2);
                                return activityExchangeConfirmedBinding;
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

    public static ActivityExchangeConfirmedBinding inflate(LayoutInflater layoutInflater) {
        return ActivityExchangeConfirmedBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityExchangeConfirmedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_exchange_confirmed;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityExchangeConfirmedBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

