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

public final class RowShippingProductImvBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final AppCompatImageView rowShippingImv;
    public final RelativeLayout rowShippingProductImv;

    private RowShippingProductImvBinding(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.rowShippingImv = appCompatImageView;
        this.rowShippingProductImv = relativeLayout2;
    }

    public static RowShippingProductImvBinding bind(View object) {
        int n3 = R$id.row_shipping_imv;
        AppCompatImageView appCompatImageView = (AppCompatImageView)dd2_2.a(n3, object);
        if (appCompatImageView != null) {
            object = (RelativeLayout)object;
            RowShippingProductImvBinding rowShippingProductImvBinding = new RowShippingProductImvBinding((RelativeLayout)object, appCompatImageView, (RelativeLayout)object);
            return rowShippingProductImvBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowShippingProductImvBinding inflate(LayoutInflater layoutInflater) {
        return RowShippingProductImvBinding.inflate(layoutInflater, null, false);
    }

    public static RowShippingProductImvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_shipping_product_imv;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowShippingProductImvBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

