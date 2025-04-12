/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutSaleHeaderSubComponentLuxeBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ConstraintLayout saleHeaderContainer;
    public final ImageView saleHeaderIV;
    public final TextView saleHeaderTV;
    public final TextView saleInfoTV;
    public final TextView showPriceBtn;

    private LayoutSaleHeaderSubComponentLuxeBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.saleHeaderContainer = constraintLayout2;
        this.saleHeaderIV = imageView;
        this.saleHeaderTV = textView;
        this.saleInfoTV = textView2;
        this.showPriceBtn = textView3;
    }

    public static LayoutSaleHeaderSubComponentLuxeBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.saleHeaderIV;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.saleHeaderTV;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.saleInfoTV;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.showPriceBtn;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object3 = object;
                        view = object2;
                        object = new LayoutSaleHeaderSubComponentLuxeBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (ImageView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSaleHeaderSubComponentLuxeBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSaleHeaderSubComponentLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSaleHeaderSubComponentLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_header_sub_component_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSaleHeaderSubComponentLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

