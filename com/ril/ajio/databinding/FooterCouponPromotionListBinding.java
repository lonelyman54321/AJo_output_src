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
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FooterCouponPromotionListBinding
implements BC3 {
    public final AjioAspectRatioImageView couponInfo;
    public final AjioTextView footerSelectedCoupons;
    public final AjioTextView footerSelectedPoints;
    public final AjioButton fragmentCouponsBtn;
    private final LinearLayout rootView;

    private FooterCouponPromotionListBinding(LinearLayout linearLayout, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioButton ajioButton) {
        this.rootView = linearLayout;
        this.couponInfo = ajioAspectRatioImageView;
        this.footerSelectedCoupons = ajioTextView;
        this.footerSelectedPoints = ajioTextView2;
        this.fragmentCouponsBtn = ajioButton;
    }

    public static FooterCouponPromotionListBinding bind(View object) {
        View view;
        int n3 = R$id.coupon_info;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioAspectRatioImageView)view;
        if (object2 != null) {
            n3 = R$id.footer_selected_coupons;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.footer_selected_points;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.fragment_coupons_btn;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioButton)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (LinearLayout)object;
                        FooterCouponPromotionListBinding footerCouponPromotionListBinding = new FooterCouponPromotionListBinding((LinearLayout)object6, (AjioAspectRatioImageView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioButton)object5);
                        return footerCouponPromotionListBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FooterCouponPromotionListBinding inflate(LayoutInflater layoutInflater) {
        return FooterCouponPromotionListBinding.inflate(layoutInflater, null, false);
    }

    public static FooterCouponPromotionListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.footer_coupon_promotion_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FooterCouponPromotionListBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

