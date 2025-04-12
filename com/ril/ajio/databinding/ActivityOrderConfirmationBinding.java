/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ActivityOrderConfirmationBinding
implements BC3 {
    public final FrameLayout aocFragmentContainer;
    public final LinearLayout paymentNotification;
    public final AjioTextView paymentNotificationText;
    private final ConstraintLayout rootView;

    private ActivityOrderConfirmationBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.aocFragmentContainer = frameLayout;
        this.paymentNotification = linearLayout;
        this.paymentNotificationText = ajioTextView;
    }

    public static ActivityOrderConfirmationBinding bind(View object) {
        AjioTextView ajioTextView;
        LinearLayout linearLayout;
        int n3 = R$id.aocFragmentContainer;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.payment_notification, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.payment_notification_text, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ActivityOrderConfirmationBinding activityOrderConfirmationBinding = new ActivityOrderConfirmationBinding((ConstraintLayout)((Object)object), frameLayout, linearLayout, ajioTextView);
            return activityOrderConfirmationBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityOrderConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return ActivityOrderConfirmationBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityOrderConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_order_confirmation;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityOrderConfirmationBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

