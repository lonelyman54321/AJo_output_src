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
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioRedirectingProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ActivityPaymentLuxBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final FrameLayout fragmentBackground;
    public final LinearLayout fragmentCartListLayoutButton;
    public final FrameLayout fragmentPayment;
    public final AjioTextView fragmentRetryPaymentTvProceed;
    public final TextView luxePaymentToolbarTitle;
    public final FrameLayout paymentEmptyContainer;
    public final AjioLoaderView paymentLoader;
    public final FrameLayout paymentMainContainer;
    public final LinearLayout paymentNotification;
    public final AjioTextView paymentNotificationText;
    public final Toolbar paymentToolbarLuxe;
    public final AjioRedirectingProgressView redirectingProgressBar;
    private final RelativeLayout rootView;
    public final LinearLayout titleProductContainer;

    private ActivityPaymentLuxBinding(RelativeLayout relativeLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, LinearLayout linearLayout, FrameLayout frameLayout2, AjioTextView ajioTextView, TextView textView, FrameLayout frameLayout3, AjioLoaderView ajioLoaderView, FrameLayout frameLayout4, LinearLayout linearLayout2, AjioTextView ajioTextView2, Toolbar toolbar, AjioRedirectingProgressView ajioRedirectingProgressView, LinearLayout linearLayout3) {
        this.rootView = relativeLayout;
        this.appBarLayout = appBarLayout;
        this.fragmentBackground = frameLayout;
        this.fragmentCartListLayoutButton = linearLayout;
        this.fragmentPayment = frameLayout2;
        this.fragmentRetryPaymentTvProceed = ajioTextView;
        this.luxePaymentToolbarTitle = textView;
        this.paymentEmptyContainer = frameLayout3;
        this.paymentLoader = ajioLoaderView;
        this.paymentMainContainer = frameLayout4;
        this.paymentNotification = linearLayout2;
        this.paymentNotificationText = ajioTextView2;
        this.paymentToolbarLuxe = toolbar;
        this.redirectingProgressBar = ajioRedirectingProgressView;
        this.titleProductContainer = linearLayout3;
    }

    public static ActivityPaymentLuxBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.app_bar_layout;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppBarLayout)view2;
        if (object2 != null) {
            n3 = R$id.fragment_background;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (FrameLayout)view2;
            if (view3 != null) {
                n3 = R$id.fragment_cart_list_layout_button;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (LinearLayout)view2;
                if (view4 != null) {
                    n3 = R$id.fragment_payment;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (FrameLayout)view2;
                    if (view5 != null) {
                        n3 = R$id.fragment_retry_payment_tv_proceed;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioTextView)view2;
                        if (object3 != null) {
                            n3 = R$id.luxe_payment_toolbar_title;
                            View view6 = view2 = dd2_2.a(n3, view);
                            view6 = (TextView)view2;
                            if (view6 != null) {
                                n3 = R$id.payment_empty_container;
                                View view7 = view2 = dd2_2.a(n3, view);
                                view7 = (FrameLayout)view2;
                                if (view7 != null) {
                                    n3 = R$id.payment_loader;
                                    Object object4 = view2 = dd2_2.a(n3, view);
                                    object4 = (AjioLoaderView)view2;
                                    if (object4 != null) {
                                        n3 = R$id.payment_main_container;
                                        View view8 = view2 = dd2_2.a(n3, view);
                                        view8 = (FrameLayout)view2;
                                        if (view8 != null) {
                                            n3 = R$id.payment_notification;
                                            View view9 = view2 = dd2_2.a(n3, view);
                                            view9 = (LinearLayout)view2;
                                            if (view9 != null) {
                                                n3 = R$id.payment_notification_text;
                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                object5 = (AjioTextView)view2;
                                                if (object5 != null) {
                                                    n3 = R$id.payment_toolbar_luxe;
                                                    Object object6 = view2 = dd2_2.a(n3, view);
                                                    object6 = (Toolbar)view2;
                                                    if (object6 != null) {
                                                        n3 = R$id.redirecting_progress_bar;
                                                        Object object7 = view2 = dd2_2.a(n3, view);
                                                        object7 = (AjioRedirectingProgressView)view2;
                                                        if (object7 != null) {
                                                            n3 = R$id.titleProductContainer;
                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                            view10 = (LinearLayout)view2;
                                                            if (view10 != null) {
                                                                View view11 = view;
                                                                view11 = (RelativeLayout)view;
                                                                ActivityPaymentLuxBinding activityPaymentLuxBinding = new ActivityPaymentLuxBinding((RelativeLayout)view11, (AppBarLayout)object2, (FrameLayout)view3, (LinearLayout)view4, (FrameLayout)view5, (AjioTextView)object3, (TextView)view6, (FrameLayout)view7, (AjioLoaderView)((Object)object4), (FrameLayout)view8, (LinearLayout)view9, (AjioTextView)object5, (Toolbar)object6, (AjioRedirectingProgressView)((Object)object7), (LinearLayout)view10);
                                                                return activityPaymentLuxBinding;
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
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityPaymentLuxBinding inflate(LayoutInflater layoutInflater) {
        return ActivityPaymentLuxBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityPaymentLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_payment_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityPaymentLuxBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

