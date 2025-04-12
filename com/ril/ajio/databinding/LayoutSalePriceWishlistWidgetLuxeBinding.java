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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutSalePriceWishlistWidgetLuxeBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final AppCompatImageView saleIV;
    public final TextView salePriceTV;
    public final TextView salePriceTextTV;

    private LayoutSalePriceWishlistWidgetLuxeBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.saleIV = appCompatImageView;
        this.salePriceTV = textView;
        this.salePriceTextTV = textView2;
    }

    public static LayoutSalePriceWishlistWidgetLuxeBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.saleIV;
        AppCompatImageView appCompatImageView = (AppCompatImageView)dd2_2.a(n3, object);
        if (appCompatImageView != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.salePriceTV, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.salePriceTextTV, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutSalePriceWishlistWidgetLuxeBinding layoutSalePriceWishlistWidgetLuxeBinding = new LayoutSalePriceWishlistWidgetLuxeBinding((ConstraintLayout)((Object)object), appCompatImageView, textView2, textView);
            return layoutSalePriceWishlistWidgetLuxeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSalePriceWishlistWidgetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSalePriceWishlistWidgetLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSalePriceWishlistWidgetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_price_wishlist_widget_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSalePriceWishlistWidgetLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

