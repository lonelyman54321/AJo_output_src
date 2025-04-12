/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartGwpComboItemsHolderBinding
implements BC3 {
    public final ImageView productImg;
    public final RelativeLayout productImgContainer;
    private final ConstraintLayout rootView;

    private CartGwpComboItemsHolderBinding(ConstraintLayout constraintLayout, ImageView imageView, RelativeLayout relativeLayout) {
        this.rootView = constraintLayout;
        this.productImg = imageView;
        this.productImgContainer = relativeLayout;
    }

    public static CartGwpComboItemsHolderBinding bind(View object) {
        RelativeLayout relativeLayout;
        int n3 = R$id.productImg;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (relativeLayout = (RelativeLayout)dd2_2.a(n3 = R$id.productImgContainer, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            CartGwpComboItemsHolderBinding cartGwpComboItemsHolderBinding = new CartGwpComboItemsHolderBinding((ConstraintLayout)((Object)object), imageView, relativeLayout);
            return cartGwpComboItemsHolderBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartGwpComboItemsHolderBinding inflate(LayoutInflater layoutInflater) {
        return CartGwpComboItemsHolderBinding.inflate(layoutInflater, null, false);
    }

    public static CartGwpComboItemsHolderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_gwp_combo_items_holder;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartGwpComboItemsHolderBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

