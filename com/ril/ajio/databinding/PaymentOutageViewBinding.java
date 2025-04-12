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

public final class PaymentOutageViewBinding
implements BC3 {
    public final TextView pfContainer;
    private final TextView rootView;

    private PaymentOutageViewBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.pfContainer = textView2;
    }

    public static PaymentOutageViewBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            PaymentOutageViewBinding paymentOutageViewBinding = new PaymentOutageViewBinding((TextView)object, (TextView)object);
            return paymentOutageViewBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PaymentOutageViewBinding inflate(LayoutInflater layoutInflater) {
        return PaymentOutageViewBinding.inflate(layoutInflater, null, false);
    }

    public static PaymentOutageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.payment_outage_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PaymentOutageViewBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

