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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CouponPromotionActivityIndex1Binding
implements BC3 {
    public final AjioTextView number;
    private final CardView rootView;

    private CouponPromotionActivityIndex1Binding(CardView cardView, AjioTextView ajioTextView) {
        this.rootView = cardView;
        this.number = ajioTextView;
    }

    public static CouponPromotionActivityIndex1Binding bind(View object) {
        int n3 = R$id.number;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (CardView)((Object)object);
            CouponPromotionActivityIndex1Binding couponPromotionActivityIndex1Binding = new CouponPromotionActivityIndex1Binding((CardView)((Object)object), ajioTextView);
            return couponPromotionActivityIndex1Binding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CouponPromotionActivityIndex1Binding inflate(LayoutInflater layoutInflater) {
        return CouponPromotionActivityIndex1Binding.inflate(layoutInflater, null, false);
    }

    public static CouponPromotionActivityIndex1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_promotion_activity_index1;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponPromotionActivityIndex1Binding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

