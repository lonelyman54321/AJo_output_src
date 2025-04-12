/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DialogCouponsWarning2Binding
implements BC3 {
    public final LinearLayout bottomLayout;
    public final AjioTextView couponOkTv;
    private final RelativeLayout rootView;
    public final AjioTextView tvCouponMsg1;
    public final AjioTextView tvCouponMsg2;
    public final AjioTextView tvCouponMsg3;
    public final AjioTextView tvCouponMsg4;

    private DialogCouponsWarning2Binding(RelativeLayout relativeLayout, LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = relativeLayout;
        this.bottomLayout = linearLayout;
        this.couponOkTv = ajioTextView;
        this.tvCouponMsg1 = ajioTextView2;
        this.tvCouponMsg2 = ajioTextView3;
        this.tvCouponMsg3 = ajioTextView4;
        this.tvCouponMsg4 = ajioTextView5;
    }

    public static DialogCouponsWarning2Binding bind(View object) {
        View view;
        int n3 = R$id.bottom_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.coupon_ok_tv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.tv_coupon_msg1;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.tv_coupon_msg2;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.tv_coupon_msg3;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.tv_coupon_msg4;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                Object object7 = object;
                                object7 = (RelativeLayout)object;
                                DialogCouponsWarning2Binding dialogCouponsWarning2Binding = new DialogCouponsWarning2Binding((RelativeLayout)object7, (LinearLayout)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
                                return dialogCouponsWarning2Binding;
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static DialogCouponsWarning2Binding inflate(LayoutInflater layoutInflater) {
        return DialogCouponsWarning2Binding.inflate(layoutInflater, null, false);
    }

    public static DialogCouponsWarning2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_coupons_warning_2;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogCouponsWarning2Binding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

