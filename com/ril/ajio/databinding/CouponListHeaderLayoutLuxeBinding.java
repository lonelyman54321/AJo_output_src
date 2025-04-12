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

public final class CouponListHeaderLayoutLuxeBinding
implements BC3 {
    public final TextView couponListHeaderTv;
    private final LinearLayout rootView;

    private CouponListHeaderLayoutLuxeBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.couponListHeaderTv = textView;
    }

    public static CouponListHeaderLayoutLuxeBinding bind(View object) {
        int n3 = R$id.coupon_list_header_tv;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (LinearLayout)object;
            CouponListHeaderLayoutLuxeBinding couponListHeaderLayoutLuxeBinding = new CouponListHeaderLayoutLuxeBinding((LinearLayout)object, textView);
            return couponListHeaderLayoutLuxeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CouponListHeaderLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return CouponListHeaderLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static CouponListHeaderLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_list_header_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponListHeaderLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

