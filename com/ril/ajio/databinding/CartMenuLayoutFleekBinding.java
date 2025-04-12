/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CartMenuLayoutFleekBinding
implements BC3 {
    public final AjioTextView menuCartCountTv;
    public final AppCompatImageView menuCartIv;
    public final LinearLayout menuCartLayout;
    private final RelativeLayout rootView;

    private CartMenuLayoutFleekBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AppCompatImageView appCompatImageView, LinearLayout linearLayout) {
        this.rootView = relativeLayout;
        this.menuCartCountTv = ajioTextView;
        this.menuCartIv = appCompatImageView;
        this.menuCartLayout = linearLayout;
    }

    public static CartMenuLayoutFleekBinding bind(View object) {
        LinearLayout linearLayout;
        AppCompatImageView appCompatImageView;
        int n3 = R$id.menu_cart_count_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (appCompatImageView = (AppCompatImageView)dd2_2.a(n3 = R$id.menu_cart_iv, object)) != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.menu_cart_layout, object)) != null) {
            object = (RelativeLayout)object;
            CartMenuLayoutFleekBinding cartMenuLayoutFleekBinding = new CartMenuLayoutFleekBinding((RelativeLayout)object, ajioTextView, appCompatImageView, linearLayout);
            return cartMenuLayoutFleekBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartMenuLayoutFleekBinding inflate(LayoutInflater layoutInflater) {
        return CartMenuLayoutFleekBinding.inflate(layoutInflater, null, false);
    }

    public static CartMenuLayoutFleekBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_menu_layout_fleek;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartMenuLayoutFleekBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

