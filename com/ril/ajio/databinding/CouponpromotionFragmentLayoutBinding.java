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
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CouponpromotionFragmentLayoutBinding
implements BC3 {
    public final AjioImageView backButtonCb;
    public final ImageView couponBonanzaImg;
    public final AjioTextView couponPromotionLabel;
    public final FrameLayout couponPromotionLl;
    public final AjioProgressView couponsPromotionProgressBar;
    public final LinearLayout footer;
    private final FrameLayout rootView;

    private CouponpromotionFragmentLayoutBinding(FrameLayout frameLayout, AjioImageView ajioImageView, ImageView imageView, AjioTextView ajioTextView, FrameLayout frameLayout2, AjioProgressView ajioProgressView, LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.backButtonCb = ajioImageView;
        this.couponBonanzaImg = imageView;
        this.couponPromotionLabel = ajioTextView;
        this.couponPromotionLl = frameLayout2;
        this.couponsPromotionProgressBar = ajioProgressView;
        this.footer = linearLayout;
    }

    public static CouponpromotionFragmentLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.back_button_cb;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioImageView)view;
        if (object2 != null) {
            n3 = R$id.coupon_bonanza_img;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.coupon_promotion_label;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.coupon_promotion_ll;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (FrameLayout)view;
                    if (view3 != null) {
                        n3 = R$id.coupons_promotion_progress_bar;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioProgressView)view;
                        if (object4 != null) {
                            n3 = R$id.footer;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (LinearLayout)view;
                            if (view4 != null) {
                                Object object5 = object;
                                object5 = (FrameLayout)object;
                                CouponpromotionFragmentLayoutBinding couponpromotionFragmentLayoutBinding = new CouponpromotionFragmentLayoutBinding((FrameLayout)object5, (AjioImageView)((Object)object2), (ImageView)view2, (AjioTextView)object3, (FrameLayout)view3, (AjioProgressView)((Object)object4), (LinearLayout)view4);
                                return couponpromotionFragmentLayoutBinding;
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

    public static CouponpromotionFragmentLayoutBinding inflate(LayoutInflater layoutInflater) {
        return CouponpromotionFragmentLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static CouponpromotionFragmentLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.couponpromotion_fragment_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponpromotionFragmentLayoutBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

