/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.RowCartCouponNudgeLayoutBinding;

public final class RowCartCouponLuxeBinding
implements BC3 {
    public final TextView changeCoupon;
    public final ConstraintLayout couponContainer;
    public final ImageView couponImg;
    public final ConstraintLayout couponInfoContainer;
    public final RowCartCouponNudgeLayoutBinding couponNudgeLayout;
    public final TextView couponSavingTv;
    public final TextView couponTextTv;
    private final RelativeLayout rootView;

    private RowCartCouponLuxeBinding(RelativeLayout relativeLayout, TextView textView, ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, RowCartCouponNudgeLayoutBinding rowCartCouponNudgeLayoutBinding, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.changeCoupon = textView;
        this.couponContainer = constraintLayout;
        this.couponImg = imageView;
        this.couponInfoContainer = constraintLayout2;
        this.couponNudgeLayout = rowCartCouponNudgeLayoutBinding;
        this.couponSavingTv = textView2;
        this.couponTextTv = textView3;
    }

    public static RowCartCouponLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.changeCoupon;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.couponContainer;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (ConstraintLayout)view;
            if (object2 != null) {
                n3 = R$id.couponImg;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.couponInfoContainer;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (ConstraintLayout)view;
                    if (object3 != null && (view = dd2_2.a(n3 = R$id.couponNudgeLayout, object)) != null) {
                        RowCartCouponNudgeLayoutBinding rowCartCouponNudgeLayoutBinding = RowCartCouponNudgeLayoutBinding.bind(view);
                        n3 = R$id.couponSavingTv;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (TextView)view;
                        if (view4 != null) {
                            n3 = R$id.couponTextTv;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (TextView)view;
                            if (view5 != null) {
                                Object object4 = object;
                                object4 = (RelativeLayout)object;
                                RowCartCouponLuxeBinding rowCartCouponLuxeBinding = new RowCartCouponLuxeBinding((RelativeLayout)object4, (TextView)view2, (ConstraintLayout)((Object)object2), (ImageView)view3, (ConstraintLayout)((Object)object3), rowCartCouponNudgeLayoutBinding, (TextView)view4, (TextView)view5);
                                return rowCartCouponLuxeBinding;
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

    public static RowCartCouponLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowCartCouponLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartCouponLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_coupon_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartCouponLuxeBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

