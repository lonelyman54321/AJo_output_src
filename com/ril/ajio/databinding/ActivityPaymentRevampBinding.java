/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioRedirectingProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class ActivityPaymentRevampBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ToolbarTitleSubtitleViewBinding floatHeaderView;
    public final FrameLayout fragmentBackground;
    public final FrameLayout fragmentPayment;
    public final FrameLayout paymentEmptyContainer;
    public final AjioLoaderView paymentLoader;
    public final FrameLayout paymentMainContainer;
    public final LinearLayout paymentNotification;
    public final AjioTextView paymentNotificationText;
    public final AjioRedirectingProgressView redirectingProgressBar;
    private final RelativeLayout rootView;
    public final CoordinatorLayout titleProductContainer;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;

    private ActivityPaymentRevampBinding(RelativeLayout relativeLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, AjioLoaderView ajioLoaderView, FrameLayout frameLayout4, LinearLayout linearLayout, AjioTextView ajioTextView, AjioRedirectingProgressView ajioRedirectingProgressView, CoordinatorLayout coordinatorLayout, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2) {
        this.rootView = relativeLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.floatHeaderView = toolbarTitleSubtitleViewBinding;
        this.fragmentBackground = frameLayout;
        this.fragmentPayment = frameLayout2;
        this.paymentEmptyContainer = frameLayout3;
        this.paymentLoader = ajioLoaderView;
        this.paymentMainContainer = frameLayout4;
        this.paymentNotification = linearLayout;
        this.paymentNotificationText = ajioTextView;
        this.redirectingProgressBar = ajioRedirectingProgressView;
        this.titleProductContainer = coordinatorLayout;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding2;
    }

    public static ActivityPaymentRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppBarLayout)view2;
        if (object2 != null) {
            n3 = R$id.collapsing_toolbar;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (CollapsingToolbarLayout)view2;
            if (object3 != null && (view2 = dd2_2.a(n3 = R$id.float_header_view, view)) != null) {
                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view2);
                n3 = R$id.fragment_background;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (FrameLayout)view2;
                if (view3 != null) {
                    n3 = R$id.fragment_payment;
                    View view4 = view2 = dd2_2.a(n3, view);
                    view4 = (FrameLayout)view2;
                    if (view4 != null) {
                        n3 = R$id.payment_empty_container;
                        View view5 = view2 = dd2_2.a(n3, view);
                        view5 = (FrameLayout)view2;
                        if (view5 != null) {
                            n3 = R$id.payment_loader;
                            Object object4 = view2 = dd2_2.a(n3, view);
                            object4 = (AjioLoaderView)view2;
                            if (object4 != null) {
                                n3 = R$id.payment_main_container;
                                View view6 = view2 = dd2_2.a(n3, view);
                                view6 = (FrameLayout)view2;
                                if (view6 != null) {
                                    n3 = R$id.payment_notification;
                                    View view7 = view2 = dd2_2.a(n3, view);
                                    view7 = (LinearLayout)view2;
                                    if (view7 != null) {
                                        n3 = R$id.payment_notification_text;
                                        Object object5 = view2 = dd2_2.a(n3, view);
                                        object5 = (AjioTextView)view2;
                                        if (object5 != null) {
                                            n3 = R$id.redirecting_progress_bar;
                                            Object object6 = view2 = dd2_2.a(n3, view);
                                            object6 = (AjioRedirectingProgressView)view2;
                                            if (object6 != null) {
                                                n3 = R$id.titleProductContainer;
                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                object7 = (CoordinatorLayout)view2;
                                                if (object7 != null) {
                                                    n3 = R$id.toolbar;
                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                    object8 = (Toolbar)view2;
                                                    if (object8 != null && (view2 = dd2_2.a(n3 = R$id.toolbar_header_view, view)) != null) {
                                                        ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding2 = ToolbarTitleSubtitleViewBinding.bind(view2);
                                                        View view8 = view;
                                                        view8 = (RelativeLayout)view;
                                                        ActivityPaymentRevampBinding activityPaymentRevampBinding = new ActivityPaymentRevampBinding((RelativeLayout)view8, (AppBarLayout)object2, (CollapsingToolbarLayout)((Object)object3), toolbarTitleSubtitleViewBinding, (FrameLayout)view3, (FrameLayout)view4, (FrameLayout)view5, (AjioLoaderView)((Object)object4), (FrameLayout)view6, (LinearLayout)view7, (AjioTextView)object5, (AjioRedirectingProgressView)((Object)object6), (CoordinatorLayout)object7, (Toolbar)object8, toolbarTitleSubtitleViewBinding2);
                                                        return activityPaymentRevampBinding;
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

    public static ActivityPaymentRevampBinding inflate(LayoutInflater layoutInflater) {
        return ActivityPaymentRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityPaymentRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_payment_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityPaymentRevampBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

