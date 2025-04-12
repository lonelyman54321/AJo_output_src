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

public abstract class AjioCouponGiftCardLuxeBinding
extends ViewDataBinding {
    public final TextView agAddTv;
    public final ImageView agCashIv;
    public final TextView agCashTv;
    public final TextView agInfoTv;

    public AjioCouponGiftCardLuxeBinding(Object object, View view, int n3, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(object, view, n3);
        this.agAddTv = textView;
        this.agCashIv = imageView;
        this.agCashTv = textView2;
        this.agInfoTv = textView3;
    }

    public static AjioCouponGiftCardLuxeBinding bind(View view) {
        return AjioCouponGiftCardLuxeBinding.bind(view, null);
    }

    public static AjioCouponGiftCardLuxeBinding bind(View view, Object object) {
        int n3 = R$layout.ajio_coupon_gift_card_luxe;
        return (AjioCouponGiftCardLuxeBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static AjioCouponGiftCardLuxeBinding inflate(LayoutInflater layoutInflater) {
        return AjioCouponGiftCardLuxeBinding.inflate(layoutInflater, null);
    }

    public static AjioCouponGiftCardLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return AjioCouponGiftCardLuxeBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static AjioCouponGiftCardLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.ajio_coupon_gift_card_luxe;
        return (AjioCouponGiftCardLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static AjioCouponGiftCardLuxeBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.ajio_coupon_gift_card_luxe;
        return (AjioCouponGiftCardLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

