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

public final class RowPaymentFailLuxBinding
implements BC3 {
    private final LinearLayout rootView;

    private RowPaymentFailLuxBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static RowPaymentFailLuxBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            RowPaymentFailLuxBinding rowPaymentFailLuxBinding = new RowPaymentFailLuxBinding((LinearLayout)object);
            return rowPaymentFailLuxBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowPaymentFailLuxBinding inflate(LayoutInflater layoutInflater) {
        return RowPaymentFailLuxBinding.inflate(layoutInflater, null, false);
    }

    public static RowPaymentFailLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_payment_fail_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPaymentFailLuxBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

