/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.CheckBox
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class AvailblecouponPromotionRowBinding
implements BC3 {
    public final CheckBox avlCheckbox;
    public final AjioTextView avlCouponDescription;
    public final ImageView avlCouponImage;
    public final AjioTextView avlCouponPoint;
    public final LinearLayout llData;
    private final FrameLayout rootView;

    private AvailblecouponPromotionRowBinding(FrameLayout frameLayout, CheckBox checkBox, AjioTextView ajioTextView, ImageView imageView, AjioTextView ajioTextView2, LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.avlCheckbox = checkBox;
        this.avlCouponDescription = ajioTextView;
        this.avlCouponImage = imageView;
        this.avlCouponPoint = ajioTextView2;
        this.llData = linearLayout;
    }

    public static AvailblecouponPromotionRowBinding bind(View object) {
        View view;
        int n3 = R$id.avl_checkbox;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (CheckBox)view;
        if (view2 != null) {
            n3 = R$id.avl_coupon_description;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.avl_coupon_image;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.avl_coupon_point;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.ll_data;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (LinearLayout)view;
                        if (view4 != null) {
                            Object object4 = object;
                            object4 = (FrameLayout)object;
                            AvailblecouponPromotionRowBinding availblecouponPromotionRowBinding = new AvailblecouponPromotionRowBinding((FrameLayout)object4, (CheckBox)view2, (AjioTextView)object2, (ImageView)view3, (AjioTextView)object3, (LinearLayout)view4);
                            return availblecouponPromotionRowBinding;
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

    public static AvailblecouponPromotionRowBinding inflate(LayoutInflater layoutInflater) {
        return AvailblecouponPromotionRowBinding.inflate(layoutInflater, null, false);
    }

    public static AvailblecouponPromotionRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.availblecoupon_promotion_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AvailblecouponPromotionRowBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

