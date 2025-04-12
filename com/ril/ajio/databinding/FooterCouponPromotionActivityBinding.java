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
import com.ril.ajio.customviews.widgets.AjioButton;

public final class FooterCouponPromotionActivityBinding
implements BC3 {
    public final AjioButton fragmentCouponsBtn;
    private final LinearLayout rootView;

    private FooterCouponPromotionActivityBinding(LinearLayout linearLayout, AjioButton ajioButton) {
        this.rootView = linearLayout;
        this.fragmentCouponsBtn = ajioButton;
    }

    public static FooterCouponPromotionActivityBinding bind(View object) {
        int n3 = R$id.fragment_coupons_btn;
        AjioButton ajioButton = (AjioButton)dd2_2.a(n3, object);
        if (ajioButton != null) {
            object = (LinearLayout)object;
            FooterCouponPromotionActivityBinding footerCouponPromotionActivityBinding = new FooterCouponPromotionActivityBinding((LinearLayout)object, ajioButton);
            return footerCouponPromotionActivityBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FooterCouponPromotionActivityBinding inflate(LayoutInflater layoutInflater) {
        return FooterCouponPromotionActivityBinding.inflate(layoutInflater, null, false);
    }

    public static FooterCouponPromotionActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.footer_coupon_promotion_activity;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FooterCouponPromotionActivityBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

