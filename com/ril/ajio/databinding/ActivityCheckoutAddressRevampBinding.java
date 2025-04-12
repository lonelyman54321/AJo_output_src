/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ActivityCheckoutAddressRevampBinding
implements BC3 {
    public final FrameLayout checkoutAddressContentframe;
    public final AjioLoaderView exCheckoutAddressProgressView;
    public final AjioTextView notificationText;
    private final RelativeLayout rootView;

    private ActivityCheckoutAddressRevampBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, AjioLoaderView ajioLoaderView, AjioTextView ajioTextView) {
        this.rootView = relativeLayout;
        this.checkoutAddressContentframe = frameLayout;
        this.exCheckoutAddressProgressView = ajioLoaderView;
        this.notificationText = ajioTextView;
    }

    public static ActivityCheckoutAddressRevampBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioLoaderView ajioLoaderView;
        int n3 = R$id.checkout_address_contentframe;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null && (ajioLoaderView = (AjioLoaderView)dd2_2.a(n3 = R$id.ex_checkout_address_progressView, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.notification_text, object)) != null) {
            object = (RelativeLayout)object;
            ActivityCheckoutAddressRevampBinding activityCheckoutAddressRevampBinding = new ActivityCheckoutAddressRevampBinding((RelativeLayout)object, frameLayout, ajioLoaderView, ajioTextView);
            return activityCheckoutAddressRevampBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityCheckoutAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return ActivityCheckoutAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityCheckoutAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_checkout_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityCheckoutAddressRevampBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

