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

public final class ItemCouponShopBankBinding
implements BC3 {
    public final TextView couponShopBtn;
    public final ConstraintLayout couponShopBtnContainer;
    private final ConstraintLayout rootView;

    private ItemCouponShopBankBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.couponShopBtn = textView;
        this.couponShopBtnContainer = constraintLayout2;
    }

    public static ItemCouponShopBankBinding bind(View object) {
        int n3 = R$id.coupon_shop_btn;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (ConstraintLayout)((Object)object);
            ItemCouponShopBankBinding itemCouponShopBankBinding = new ItemCouponShopBankBinding((ConstraintLayout)((Object)object), textView, (ConstraintLayout)((Object)object));
            return itemCouponShopBankBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCouponShopBankBinding inflate(LayoutInflater layoutInflater) {
        return ItemCouponShopBankBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCouponShopBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_coupon_shop_bank;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCouponShopBankBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

