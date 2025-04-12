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

public final class LayoutSalePriceLuxeBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final TextView saleDiscountTV;
    public final AppCompatImageView saleIV;
    public final TextView salePriceTV;
    public final TextView salePriceTextTV;

    private LayoutSalePriceLuxeBinding(ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.saleDiscountTV = textView;
        this.saleIV = appCompatImageView;
        this.salePriceTV = textView2;
        this.salePriceTextTV = textView3;
    }

    public static LayoutSalePriceLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.saleDiscountTV;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.saleIV;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AppCompatImageView)view;
            if (object2 != null) {
                n3 = R$id.salePriceTV;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.salePriceTextTV;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        LayoutSalePriceLuxeBinding layoutSalePriceLuxeBinding = new LayoutSalePriceLuxeBinding((ConstraintLayout)((Object)object3), (TextView)view2, (AppCompatImageView)((Object)object2), (TextView)view3, (TextView)view4);
                        return layoutSalePriceLuxeBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSalePriceLuxeBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSalePriceLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSalePriceLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_price_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSalePriceLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

