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

public final class DialogCouponsWarning1Binding
implements BC3 {
    public final LinearLayout bottomLayout;
    public final LinearLayout buynowLayout;
    public final LinearLayout cancelLayout;
    public final AjioTextView couponBuynow;
    public final AjioTextView couponCancel;
    public final AjioTextView couponTv;
    public final AjioTextView couponTvB;
    public final LinearLayout dataLl;
    private final RelativeLayout rootView;

    private DialogCouponsWarning1Binding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LinearLayout linearLayout4) {
        this.rootView = relativeLayout;
        this.bottomLayout = linearLayout;
        this.buynowLayout = linearLayout2;
        this.cancelLayout = linearLayout3;
        this.couponBuynow = ajioTextView;
        this.couponCancel = ajioTextView2;
        this.couponTv = ajioTextView3;
        this.couponTvB = ajioTextView4;
        this.dataLl = linearLayout4;
    }

    public static DialogCouponsWarning1Binding bind(View object) {
        View view;
        int n3 = R$id.bottom_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.buynow_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.cancel_layout;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (LinearLayout)view;
                if (view4 != null) {
                    n3 = R$id.coupon_buynow;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioTextView)view;
                    if (object2 != null) {
                        n3 = R$id.coupon_cancel;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.coupon_tv;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                n3 = R$id.coupon_tv_b;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    n3 = R$id.data_ll;
                                    View view5 = view = dd2_2.a(n3, object);
                                    view5 = (LinearLayout)view;
                                    if (view5 != null) {
                                        Object object6 = object;
                                        object6 = (RelativeLayout)object;
                                        DialogCouponsWarning1Binding dialogCouponsWarning1Binding = new DialogCouponsWarning1Binding((RelativeLayout)object6, (LinearLayout)view2, (LinearLayout)view3, (LinearLayout)view4, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (LinearLayout)view5);
                                        return dialogCouponsWarning1Binding;
                                    }
                                }
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

    public static DialogCouponsWarning1Binding inflate(LayoutInflater layoutInflater) {
        return DialogCouponsWarning1Binding.inflate(layoutInflater, null, false);
    }

    public static DialogCouponsWarning1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_coupons_warning_1;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogCouponsWarning1Binding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

