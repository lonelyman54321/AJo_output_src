/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogCartCouponRefreshBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final Guideline couponGuideline;
    public final TextView dialogCartCouponBtnSaveMore;
    public final TextView dialogCartCouponBtnShipping;
    public final TextView dialogCartCouponTvCoupon;
    public final TextView dialogCartCouponTvSave;
    private final LinearLayout rootView;

    private DialogCartCouponRefreshBinding(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, Guideline guideline, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.couponGuideline = guideline;
        this.dialogCartCouponBtnSaveMore = textView;
        this.dialogCartCouponBtnShipping = textView2;
        this.dialogCartCouponTvCoupon = textView3;
        this.dialogCartCouponTvSave = textView4;
    }

    public static DialogCartCouponRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelContainer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.couponGuideline;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (Guideline)view;
                if (view4 != null) {
                    n3 = R$id.dialog_cart_coupon_btn_save_more;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.dialog_cart_coupon_btn_shipping;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.dialog_cart_coupon_tv_coupon;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                n3 = R$id.dialog_cart_coupon_tv_save;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (TextView)view;
                                if (view8 != null) {
                                    Object object2 = object;
                                    object2 = (LinearLayout)object;
                                    DialogCartCouponRefreshBinding dialogCartCouponRefreshBinding = new DialogCartCouponRefreshBinding((LinearLayout)object2, (ImageView)view2, (FrameLayout)view3, (Guideline)view4, (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8);
                                    return dialogCartCouponRefreshBinding;
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

    public static DialogCartCouponRefreshBinding inflate(LayoutInflater layoutInflater) {
        return DialogCartCouponRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static DialogCartCouponRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_cart_coupon_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogCartCouponRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

