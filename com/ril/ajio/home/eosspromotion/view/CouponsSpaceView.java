/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.home.eosspromotion.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;

public class CouponsSpaceView
extends FrameLayout
implements jc1_2,
View.OnClickListener {
    public CouponsSpaceView(Context context) {
        super(context);
        context = LayoutInflater.from((Context)context);
        int n3 = R$layout.coupons_promotion_space_view;
        context.inflate(n3, (ViewGroup)this, true);
    }

    public CouponsSpaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = LayoutInflater.from((Context)context);
        int n3 = R$layout.coupons_promotion_space_view;
        context.inflate(n3, (ViewGroup)this, true);
    }

    public CouponsSpaceView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        context = LayoutInflater.from((Context)context);
        int n4 = R$layout.coupons_promotion_space_view;
        context.inflate(n4, (ViewGroup)this, true);
    }

    public final void onClick(View view) {
    }

    public void setData(CouponPromotion couponPromotion) {
    }

    public void setOnClickCouponListener(m82_0 m82_02) {
    }
}

