/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.R$layout;

public final class CouponSeparatorLayoutLuxeBinding
implements BC3 {
    private final View rootView;

    private CouponSeparatorLayoutLuxeBinding(View view) {
        this.rootView = view;
    }

    public static CouponSeparatorLayoutLuxeBinding bind(View object) {
        if (object != null) {
            CouponSeparatorLayoutLuxeBinding couponSeparatorLayoutLuxeBinding = new CouponSeparatorLayoutLuxeBinding((View)object);
            return couponSeparatorLayoutLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CouponSeparatorLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return CouponSeparatorLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static CouponSeparatorLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_separator_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponSeparatorLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public View getRoot() {
        return this.rootView;
    }
}

