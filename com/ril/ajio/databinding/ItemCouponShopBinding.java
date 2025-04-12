/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemCouponShopBinding
implements BC3 {
    public final TextView couponShopBtn;
    public final TextView couponShopInfo;
    private final ConstraintLayout rootView;

    private ItemCouponShopBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.couponShopBtn = textView;
        this.couponShopInfo = textView2;
    }

    public static ItemCouponShopBinding bind(View object) {
        TextView textView;
        int n3 = R$id.coupon_shop_btn;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (textView = (TextView)dd2_2.a(n3 = R$id.coupon_shop_info, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ItemCouponShopBinding itemCouponShopBinding = new ItemCouponShopBinding((ConstraintLayout)((Object)object), textView2, textView);
            return itemCouponShopBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCouponShopBinding inflate(LayoutInflater layoutInflater) {
        return ItemCouponShopBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCouponShopBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_coupon_shop;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCouponShopBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

