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

public final class RowPaymentFailRevampBinding
implements BC3 {
    private final LinearLayout rootView;

    private RowPaymentFailRevampBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static RowPaymentFailRevampBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            RowPaymentFailRevampBinding rowPaymentFailRevampBinding = new RowPaymentFailRevampBinding((LinearLayout)object);
            return rowPaymentFailRevampBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowPaymentFailRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowPaymentFailRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowPaymentFailRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_payment_fail_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPaymentFailRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

