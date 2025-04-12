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

public final class PesdkRowPaymentTcBinding
implements BC3 {
    private final LinearLayout rootView;
    public final LinearLayout rowOfferTitleTvTitle;

    private PesdkRowPaymentTcBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.rowOfferTitleTvTitle = linearLayout2;
    }

    public static PesdkRowPaymentTcBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            PesdkRowPaymentTcBinding pesdkRowPaymentTcBinding = new PesdkRowPaymentTcBinding((LinearLayout)object, (LinearLayout)object);
            return pesdkRowPaymentTcBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PesdkRowPaymentTcBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRowPaymentTcBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRowPaymentTcBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_row_payment_tc;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRowPaymentTcBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

