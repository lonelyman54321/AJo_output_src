/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CartExRetPolicyItemBinding
implements BC3 {
    public final ImageView imv;
    private final LinearLayout rootView;
    public final AjioTextView txt;

    private CartExRetPolicyItemBinding(LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.imv = imageView;
        this.txt = ajioTextView;
    }

    public static CartExRetPolicyItemBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.imv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.txt, object)) != null) {
            object = (LinearLayout)object;
            CartExRetPolicyItemBinding cartExRetPolicyItemBinding = new CartExRetPolicyItemBinding((LinearLayout)object, imageView, ajioTextView);
            return cartExRetPolicyItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartExRetPolicyItemBinding inflate(LayoutInflater layoutInflater) {
        return CartExRetPolicyItemBinding.inflate(layoutInflater, null, false);
    }

    public static CartExRetPolicyItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_ex_ret_policy_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartExRetPolicyItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

