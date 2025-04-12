/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutSaleHeaderWishlistWidgetBinding
implements BC3 {
    public final TextView infoTV;
    private final LinearLayout rootView;
    public final AppCompatImageView saleIV;

    private LayoutSaleHeaderWishlistWidgetBinding(LinearLayout linearLayout, TextView textView, AppCompatImageView appCompatImageView) {
        this.rootView = linearLayout;
        this.infoTV = textView;
        this.saleIV = appCompatImageView;
    }

    public static LayoutSaleHeaderWishlistWidgetBinding bind(View object) {
        AppCompatImageView appCompatImageView;
        int n3 = R$id.infoTV;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null && (appCompatImageView = (AppCompatImageView)dd2_2.a(n3 = R$id.saleIV, object)) != null) {
            object = (LinearLayout)object;
            LayoutSaleHeaderWishlistWidgetBinding layoutSaleHeaderWishlistWidgetBinding = new LayoutSaleHeaderWishlistWidgetBinding((LinearLayout)object, textView, appCompatImageView);
            return layoutSaleHeaderWishlistWidgetBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSaleHeaderWishlistWidgetBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSaleHeaderWishlistWidgetBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSaleHeaderWishlistWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_header_wishlist_widget;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSaleHeaderWishlistWidgetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

