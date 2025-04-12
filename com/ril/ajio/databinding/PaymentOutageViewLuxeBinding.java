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
import com.ril.ajio.R$layout;

public final class PaymentOutageViewLuxeBinding
implements BC3 {
    public final TextView pfContainer;
    private final TextView rootView;

    private PaymentOutageViewLuxeBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.pfContainer = textView2;
    }

    public static PaymentOutageViewLuxeBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            PaymentOutageViewLuxeBinding paymentOutageViewLuxeBinding = new PaymentOutageViewLuxeBinding((TextView)object, (TextView)object);
            return paymentOutageViewLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PaymentOutageViewLuxeBinding inflate(LayoutInflater layoutInflater) {
        return PaymentOutageViewLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static PaymentOutageViewLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.payment_outage_view_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PaymentOutageViewLuxeBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

