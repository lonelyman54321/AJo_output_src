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

public final class CouponCustomTabBinding
implements BC3 {
    public final TextView couponListType;
    private final LinearLayout rootView;

    private CouponCustomTabBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.couponListType = textView;
    }

    public static CouponCustomTabBinding bind(View object) {
        int n3 = R$id.coupon_list_type;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (LinearLayout)object;
            CouponCustomTabBinding couponCustomTabBinding = new CouponCustomTabBinding((LinearLayout)object, textView);
            return couponCustomTabBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CouponCustomTabBinding inflate(LayoutInflater layoutInflater) {
        return CouponCustomTabBinding.inflate(layoutInflater, null, false);
    }

    public static CouponCustomTabBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_custom_tab;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponCustomTabBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

