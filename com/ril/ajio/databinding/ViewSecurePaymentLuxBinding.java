/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewSecurePaymentLuxBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView viewSecurePaymentTv;

    private ViewSecurePaymentLuxBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.viewSecurePaymentTv = ajioTextView;
    }

    public static ViewSecurePaymentLuxBinding bind(View object) {
        int n3 = R$id.view_secure_payment_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            ViewSecurePaymentLuxBinding viewSecurePaymentLuxBinding = new ViewSecurePaymentLuxBinding((LinearLayout)object, ajioTextView);
            return viewSecurePaymentLuxBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ViewSecurePaymentLuxBinding inflate(LayoutInflater layoutInflater) {
        return ViewSecurePaymentLuxBinding.inflate(layoutInflater, null, false);
    }

    public static ViewSecurePaymentLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_secure_payment_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewSecurePaymentLuxBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

