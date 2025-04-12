/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class OffersMergeCouponItemBinding
implements BC3 {
    public final AjioImageView couponImage;
    public final ConstraintLayout couponItem;
    public final AjioTextView offerCode;
    public final AjioTextView offerDesc;
    public final AjioTextView offerPrice;
    private final ConstraintLayout rootView;
    public final AjioTextView termsConditions;
    public final AjioTextView timerText;
    public final AjioTextView totalCoupons;

    private OffersMergeCouponItemBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = constraintLayout;
        this.couponImage = ajioImageView;
        this.couponItem = constraintLayout2;
        this.offerCode = ajioTextView;
        this.offerDesc = ajioTextView2;
        this.offerPrice = ajioTextView3;
        this.termsConditions = ajioTextView4;
        this.timerText = ajioTextView5;
        this.totalCoupons = ajioTextView6;
    }

    public static OffersMergeCouponItemBinding bind(View object) {
        View view;
        int n3 = R$id.coupon_image;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioImageView)view;
        if (object2 != null) {
            n3 = R$id.coupon_item;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (ConstraintLayout)view;
            if (object3 != null) {
                n3 = R$id.offer_code;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.offer_desc;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.offer_price;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.terms_conditions;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                n3 = R$id.timer_text;
                                Object object8 = view = dd2_2.a(n3, object);
                                object8 = (AjioTextView)view;
                                if (object8 != null) {
                                    n3 = R$id.total_coupons;
                                    Object object9 = view = dd2_2.a(n3, object);
                                    object9 = (AjioTextView)view;
                                    if (object9 != null) {
                                        Object object10 = object;
                                        object10 = (ConstraintLayout)((Object)object);
                                        OffersMergeCouponItemBinding offersMergeCouponItemBinding = new OffersMergeCouponItemBinding((ConstraintLayout)((Object)object10), (AjioImageView)((Object)object2), (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9);
                                        return offersMergeCouponItemBinding;
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

    public static OffersMergeCouponItemBinding inflate(LayoutInflater layoutInflater) {
        return OffersMergeCouponItemBinding.inflate(layoutInflater, null, false);
    }

    public static OffersMergeCouponItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.offers_merge_coupon_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OffersMergeCouponItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

