/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutSalePriceBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final TextView saleDiscountTV;
    public final AppCompatImageView saleIV;
    public final TextView salePriceTV;
    public final TextView salePriceTextTV;

    private LayoutSalePriceBinding(RelativeLayout relativeLayout, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.saleDiscountTV = textView;
        this.saleIV = appCompatImageView;
        this.salePriceTV = textView2;
        this.salePriceTextTV = textView3;
    }

    public static LayoutSalePriceBinding bind(View object) {
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
                        object3 = (RelativeLayout)object;
                        LayoutSalePriceBinding layoutSalePriceBinding = new LayoutSalePriceBinding((RelativeLayout)object3, (TextView)view2, (AppCompatImageView)((Object)object2), (TextView)view3, (TextView)view4);
                        return layoutSalePriceBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSalePriceBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSalePriceBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSalePriceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_price;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSalePriceBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

