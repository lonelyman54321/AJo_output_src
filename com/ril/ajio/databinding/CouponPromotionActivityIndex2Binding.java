/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CouponPromotionActivityIndex2Binding
implements BC3 {
    public final ImageView couponImage;
    public final AjioTextView number;
    private final CardView rootView;

    private CouponPromotionActivityIndex2Binding(CardView cardView, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = cardView;
        this.couponImage = imageView;
        this.number = ajioTextView;
    }

    public static CouponPromotionActivityIndex2Binding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.coupon_image;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.number, object)) != null) {
            object = (CardView)((Object)object);
            CouponPromotionActivityIndex2Binding couponPromotionActivityIndex2Binding = new CouponPromotionActivityIndex2Binding((CardView)((Object)object), imageView, ajioTextView);
            return couponPromotionActivityIndex2Binding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CouponPromotionActivityIndex2Binding inflate(LayoutInflater layoutInflater) {
        return CouponPromotionActivityIndex2Binding.inflate(layoutInflater, null, false);
    }

    public static CouponPromotionActivityIndex2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_promotion_activity_index2;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponPromotionActivityIndex2Binding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

