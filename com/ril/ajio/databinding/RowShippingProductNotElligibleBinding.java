/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowShippingProductNotElligibleBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final AppCompatImageView rowShippingImv;
    public final View rowShippingOverlay;
    public final RelativeLayout rowShippingProductImv;

    private RowShippingProductNotElligibleBinding(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, View view, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.rowShippingImv = appCompatImageView;
        this.rowShippingOverlay = view;
        this.rowShippingProductImv = relativeLayout2;
    }

    public static RowShippingProductNotElligibleBinding bind(View object) {
        View view;
        int n3 = R$id.row_shipping_imv;
        AppCompatImageView appCompatImageView = (AppCompatImageView)dd2_2.a(n3, object);
        if (appCompatImageView != null && (view = dd2_2.a(n3 = R$id.row_shipping_overlay, object)) != null) {
            object = (RelativeLayout)object;
            RowShippingProductNotElligibleBinding rowShippingProductNotElligibleBinding = new RowShippingProductNotElligibleBinding((RelativeLayout)object, appCompatImageView, view, (RelativeLayout)object);
            return rowShippingProductNotElligibleBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowShippingProductNotElligibleBinding inflate(LayoutInflater layoutInflater) {
        return RowShippingProductNotElligibleBinding.inflate(layoutInflater, null, false);
    }

    public static RowShippingProductNotElligibleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_shipping_product_not_elligible;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowShippingProductNotElligibleBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

