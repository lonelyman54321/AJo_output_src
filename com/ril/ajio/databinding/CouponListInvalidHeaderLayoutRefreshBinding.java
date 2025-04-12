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

public final class CouponListInvalidHeaderLayoutRefreshBinding
implements BC3 {
    public final TextView couponListHeaderTv;
    private final TextView rootView;

    private CouponListInvalidHeaderLayoutRefreshBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.couponListHeaderTv = textView2;
    }

    public static CouponListInvalidHeaderLayoutRefreshBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            CouponListInvalidHeaderLayoutRefreshBinding couponListInvalidHeaderLayoutRefreshBinding = new CouponListInvalidHeaderLayoutRefreshBinding((TextView)object, (TextView)object);
            return couponListInvalidHeaderLayoutRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CouponListInvalidHeaderLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CouponListInvalidHeaderLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CouponListInvalidHeaderLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_list_invalid_header_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponListInvalidHeaderLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

