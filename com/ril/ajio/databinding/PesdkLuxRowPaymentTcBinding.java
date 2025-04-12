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
import com.ril.ajio.R$layout;

public final class PesdkLuxRowPaymentTcBinding
implements BC3 {
    private final LinearLayout rootView;
    public final LinearLayout rowOfferTitleTvTitle;

    private PesdkLuxRowPaymentTcBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.rowOfferTitleTvTitle = linearLayout2;
    }

    public static PesdkLuxRowPaymentTcBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            PesdkLuxRowPaymentTcBinding pesdkLuxRowPaymentTcBinding = new PesdkLuxRowPaymentTcBinding((LinearLayout)object, (LinearLayout)object);
            return pesdkLuxRowPaymentTcBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PesdkLuxRowPaymentTcBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxRowPaymentTcBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxRowPaymentTcBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_row_payment_tc;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxRowPaymentTcBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

