/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioCircularTextView;

public final class CartMenuItemLayoutBinding
implements BC3 {
    public final AjioCircularTextView count;
    public final AjioAspectRatioImageView icon;
    private final LinearLayout rootView;

    private CartMenuItemLayoutBinding(LinearLayout linearLayout, AjioCircularTextView ajioCircularTextView, AjioAspectRatioImageView ajioAspectRatioImageView) {
        this.rootView = linearLayout;
        this.count = ajioCircularTextView;
        this.icon = ajioAspectRatioImageView;
    }

    public static CartMenuItemLayoutBinding bind(View object) {
        AjioAspectRatioImageView ajioAspectRatioImageView;
        int n3 = R$id.count;
        AjioCircularTextView ajioCircularTextView = (AjioCircularTextView)dd2_2.a(n3, object);
        if (ajioCircularTextView != null && (ajioAspectRatioImageView = (AjioAspectRatioImageView)dd2_2.a(n3 = R$id.icon, object)) != null) {
            object = (LinearLayout)object;
            CartMenuItemLayoutBinding cartMenuItemLayoutBinding = new CartMenuItemLayoutBinding((LinearLayout)object, ajioCircularTextView, ajioAspectRatioImageView);
            return cartMenuItemLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartMenuItemLayoutBinding inflate(LayoutInflater layoutInflater) {
        return CartMenuItemLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static CartMenuItemLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_menu_item_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartMenuItemLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

