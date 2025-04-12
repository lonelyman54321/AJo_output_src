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

public final class ItemCouponClickExpandedBinding
implements BC3 {
    public final TextView couponClickExpandedText;
    private final ConstraintLayout rootView;

    private ItemCouponClickExpandedBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.couponClickExpandedText = textView;
    }

    public static ItemCouponClickExpandedBinding bind(View object) {
        int n3 = R$id.coupon_click_expanded_text;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (ConstraintLayout)((Object)object);
            ItemCouponClickExpandedBinding itemCouponClickExpandedBinding = new ItemCouponClickExpandedBinding((ConstraintLayout)((Object)object), textView);
            return itemCouponClickExpandedBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCouponClickExpandedBinding inflate(LayoutInflater layoutInflater) {
        return ItemCouponClickExpandedBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCouponClickExpandedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_coupon_click_expanded;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCouponClickExpandedBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

