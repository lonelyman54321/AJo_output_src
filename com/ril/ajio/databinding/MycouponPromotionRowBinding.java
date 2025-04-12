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
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class MycouponPromotionRowBinding
implements BC3 {
    public final LinearLayout llCopy;
    public final FrameLayout llCouponUsed;
    public final LinearLayout llMycouponData;
    public final AjioTextView mycouponCode;
    public final AjioTextView mycouponCopy;
    public final AjioTextView mycouponDescription;
    public final ImageView mycouponImg;
    public final ImageView mycouponusedImg;
    private final FrameLayout rootView;

    private MycouponPromotionRowBinding(FrameLayout frameLayout, LinearLayout linearLayout, FrameLayout frameLayout2, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ImageView imageView, ImageView imageView2) {
        this.rootView = frameLayout;
        this.llCopy = linearLayout;
        this.llCouponUsed = frameLayout2;
        this.llMycouponData = linearLayout2;
        this.mycouponCode = ajioTextView;
        this.mycouponCopy = ajioTextView2;
        this.mycouponDescription = ajioTextView3;
        this.mycouponImg = imageView;
        this.mycouponusedImg = imageView2;
    }

    public static MycouponPromotionRowBinding bind(View object) {
        View view;
        int n3 = R$id.ll_copy;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.ll_coupon_used;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.ll_mycoupon_data;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (LinearLayout)view;
                if (view4 != null) {
                    n3 = R$id.mycoupon_code;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioTextView)view;
                    if (object2 != null) {
                        n3 = R$id.mycoupon_copy;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.mycoupon_description;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                n3 = R$id.mycoupon_img;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (ImageView)view;
                                if (view5 != null) {
                                    n3 = R$id.mycouponused_img;
                                    View view6 = view = dd2_2.a(n3, object);
                                    view6 = (ImageView)view;
                                    if (view6 != null) {
                                        Object object5 = object;
                                        object5 = (FrameLayout)object;
                                        MycouponPromotionRowBinding mycouponPromotionRowBinding = new MycouponPromotionRowBinding((FrameLayout)object5, (LinearLayout)view2, (FrameLayout)view3, (LinearLayout)view4, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (ImageView)view5, (ImageView)view6);
                                        return mycouponPromotionRowBinding;
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

    public static MycouponPromotionRowBinding inflate(LayoutInflater layoutInflater) {
        return MycouponPromotionRowBinding.inflate(layoutInflater, null, false);
    }

    public static MycouponPromotionRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.mycoupon_promotion_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return MycouponPromotionRowBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

