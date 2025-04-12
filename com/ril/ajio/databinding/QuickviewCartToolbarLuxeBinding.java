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

public final class QuickviewCartToolbarLuxeBinding
implements BC3 {
    public final ImageView cartWishlistIcon;
    private final ImageView rootView;

    private QuickviewCartToolbarLuxeBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.cartWishlistIcon = imageView2;
    }

    public static QuickviewCartToolbarLuxeBinding bind(View object) {
        if (object != null) {
            object = (ImageView)object;
            QuickviewCartToolbarLuxeBinding quickviewCartToolbarLuxeBinding = new QuickviewCartToolbarLuxeBinding((ImageView)object, (ImageView)object);
            return quickviewCartToolbarLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static QuickviewCartToolbarLuxeBinding inflate(LayoutInflater layoutInflater) {
        return QuickviewCartToolbarLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static QuickviewCartToolbarLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.quickview_cart_toolbar_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return QuickviewCartToolbarLuxeBinding.bind((View)layoutInflater);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}

