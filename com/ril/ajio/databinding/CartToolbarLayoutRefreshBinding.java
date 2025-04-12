/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ril.ajio.R$layout;

public final class CartToolbarLayoutRefreshBinding
implements BC3 {
    public final ImageView cartWishlistIcon;
    private final ImageView rootView;

    private CartToolbarLayoutRefreshBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.cartWishlistIcon = imageView2;
    }

    public static CartToolbarLayoutRefreshBinding bind(View object) {
        if (object != null) {
            object = (ImageView)object;
            CartToolbarLayoutRefreshBinding cartToolbarLayoutRefreshBinding = new CartToolbarLayoutRefreshBinding((ImageView)object, (ImageView)object);
            return cartToolbarLayoutRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CartToolbarLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CartToolbarLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CartToolbarLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_toolbar_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartToolbarLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}

