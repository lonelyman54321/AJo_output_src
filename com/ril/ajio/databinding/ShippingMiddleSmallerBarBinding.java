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

public final class ShippingMiddleSmallerBarBinding
implements BC3 {
    private final LinearLayout rootView;

    private ShippingMiddleSmallerBarBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static ShippingMiddleSmallerBarBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            ShippingMiddleSmallerBarBinding shippingMiddleSmallerBarBinding = new ShippingMiddleSmallerBarBinding((LinearLayout)object);
            return shippingMiddleSmallerBarBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ShippingMiddleSmallerBarBinding inflate(LayoutInflater layoutInflater) {
        return ShippingMiddleSmallerBarBinding.inflate(layoutInflater, null, false);
    }

    public static ShippingMiddleSmallerBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shipping_middle_smaller_bar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShippingMiddleSmallerBarBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

