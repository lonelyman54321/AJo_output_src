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

public final class ShippingMiddleBiggerBarBinding
implements BC3 {
    private final LinearLayout rootView;

    private ShippingMiddleBiggerBarBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static ShippingMiddleBiggerBarBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            ShippingMiddleBiggerBarBinding shippingMiddleBiggerBarBinding = new ShippingMiddleBiggerBarBinding((LinearLayout)object);
            return shippingMiddleBiggerBarBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ShippingMiddleBiggerBarBinding inflate(LayoutInflater layoutInflater) {
        return ShippingMiddleBiggerBarBinding.inflate(layoutInflater, null, false);
    }

    public static ShippingMiddleBiggerBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shipping_middle_bigger_bar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShippingMiddleBiggerBarBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

