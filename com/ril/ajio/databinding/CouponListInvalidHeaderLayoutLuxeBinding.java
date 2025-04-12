/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CouponListInvalidHeaderLayoutLuxeBinding
implements BC3 {
    public final TextView couponListHeaderTv;
    private final LinearLayout rootView;

    private CouponListInvalidHeaderLayoutLuxeBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.couponListHeaderTv = textView;
    }

    public static CouponListInvalidHeaderLayoutLuxeBinding bind(View object) {
        int n3 = R$id.coupon_list_header_tv;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (LinearLayout)object;
            CouponListInvalidHeaderLayoutLuxeBinding couponListInvalidHeaderLayoutLuxeBinding = new CouponListInvalidHeaderLayoutLuxeBinding((LinearLayout)object, textView);
            return couponListInvalidHeaderLayoutLuxeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CouponListInvalidHeaderLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return CouponListInvalidHeaderLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static CouponListInvalidHeaderLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_list_invalid_header_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponListInvalidHeaderLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

