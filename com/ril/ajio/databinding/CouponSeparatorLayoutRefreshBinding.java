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

public final class CouponSeparatorLayoutRefreshBinding
implements BC3 {
    private final View rootView;

    private CouponSeparatorLayoutRefreshBinding(View view) {
        this.rootView = view;
    }

    public static CouponSeparatorLayoutRefreshBinding bind(View object) {
        if (object != null) {
            CouponSeparatorLayoutRefreshBinding couponSeparatorLayoutRefreshBinding = new CouponSeparatorLayoutRefreshBinding((View)object);
            return couponSeparatorLayoutRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CouponSeparatorLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CouponSeparatorLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CouponSeparatorLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_separator_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponSeparatorLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public View getRoot() {
        return this.rootView;
    }
}

