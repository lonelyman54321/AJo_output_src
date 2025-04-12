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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ShopTheLookProductsLoaderLuxBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final View v1;
    public final View v2;
    public final View v3;
    public final View v4;
    public final View v5;

    private ShopTheLookProductsLoaderLuxBinding(RelativeLayout relativeLayout, View view, View view2, View view3, View view4, View view5) {
        this.rootView = relativeLayout;
        this.v1 = view;
        this.v2 = view2;
        this.v3 = view3;
        this.v4 = view4;
        this.v5 = view5;
    }

    public static ShopTheLookProductsLoaderLuxBinding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        int n3 = R$id.v1;
        View view5 = dd2_2.a(n3, object);
        if (view5 != null && (view4 = dd2_2.a(n3 = R$id.v2, object)) != null && (view3 = dd2_2.a(n3 = R$id.v3, object)) != null && (view2 = dd2_2.a(n3 = R$id.v4, object)) != null && (view = dd2_2.a(n3 = R$id.v5, object)) != null) {
            Object object2 = object;
            object2 = (RelativeLayout)object;
            ShopTheLookProductsLoaderLuxBinding shopTheLookProductsLoaderLuxBinding = new ShopTheLookProductsLoaderLuxBinding((RelativeLayout)object2, view5, view4, view3, view2, view);
            return shopTheLookProductsLoaderLuxBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShopTheLookProductsLoaderLuxBinding inflate(LayoutInflater layoutInflater) {
        return ShopTheLookProductsLoaderLuxBinding.inflate(layoutInflater, null, false);
    }

    public static ShopTheLookProductsLoaderLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shop_the_look_products_loader_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShopTheLookProductsLoaderLuxBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

