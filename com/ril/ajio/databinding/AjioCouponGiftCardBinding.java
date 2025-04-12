/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class AjioCouponGiftCardBinding
extends ViewDataBinding {
    public final TextView agAddTv;
    public final ImageView agCashIv;
    public final TextView agCashTv;
    public final TextView agInfoTv;

    public AjioCouponGiftCardBinding(Object object, View view, int n3, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(object, view, n3);
        this.agAddTv = textView;
        this.agCashIv = imageView;
        this.agCashTv = textView2;
        this.agInfoTv = textView3;
    }

    public static AjioCouponGiftCardBinding bind(View view) {
        return AjioCouponGiftCardBinding.bind(view, null);
    }

    public static AjioCouponGiftCardBinding bind(View view, Object object) {
        int n3 = R$layout.ajio_coupon_gift_card;
        return (AjioCouponGiftCardBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static AjioCouponGiftCardBinding inflate(LayoutInflater layoutInflater) {
        return AjioCouponGiftCardBinding.inflate(layoutInflater, null);
    }

    public static AjioCouponGiftCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return AjioCouponGiftCardBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static AjioCouponGiftCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.ajio_coupon_gift_card;
        return (AjioCouponGiftCardBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static AjioCouponGiftCardBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.ajio_coupon_gift_card;
        return (AjioCouponGiftCardBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

