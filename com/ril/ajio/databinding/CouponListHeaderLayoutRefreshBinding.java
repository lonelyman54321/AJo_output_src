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

public final class CouponListHeaderLayoutRefreshBinding
implements BC3 {
    public final TextView couponListHeaderTv;
    private final TextView rootView;

    private CouponListHeaderLayoutRefreshBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.couponListHeaderTv = textView2;
    }

    public static CouponListHeaderLayoutRefreshBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            CouponListHeaderLayoutRefreshBinding couponListHeaderLayoutRefreshBinding = new CouponListHeaderLayoutRefreshBinding((TextView)object, (TextView)object);
            return couponListHeaderLayoutRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CouponListHeaderLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CouponListHeaderLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CouponListHeaderLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_list_header_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponListHeaderLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

