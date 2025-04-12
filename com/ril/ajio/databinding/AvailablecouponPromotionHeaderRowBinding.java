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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class AvailablecouponPromotionHeaderRowBinding
implements BC3 {
    public final AjioTextView availableCouponsTv;
    private final LinearLayout rootView;

    private AvailablecouponPromotionHeaderRowBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.availableCouponsTv = ajioTextView;
    }

    public static AvailablecouponPromotionHeaderRowBinding bind(View object) {
        int n3 = R$id.available_coupons_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            AvailablecouponPromotionHeaderRowBinding availablecouponPromotionHeaderRowBinding = new AvailablecouponPromotionHeaderRowBinding((LinearLayout)object, ajioTextView);
            return availablecouponPromotionHeaderRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static AvailablecouponPromotionHeaderRowBinding inflate(LayoutInflater layoutInflater) {
        return AvailablecouponPromotionHeaderRowBinding.inflate(layoutInflater, null, false);
    }

    public static AvailablecouponPromotionHeaderRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.availablecoupon_promotion_header_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AvailablecouponPromotionHeaderRowBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

