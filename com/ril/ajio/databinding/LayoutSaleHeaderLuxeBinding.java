/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutSaleHeaderLuxeBinding
implements BC3 {
    public final CollapsingToolbarLayout collapsingToolbar;
    private final AppBarLayout rootView;
    public final AppBarLayout saleAppBarLayout;

    private LayoutSaleHeaderLuxeBinding(AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, AppBarLayout appBarLayout2) {
        this.rootView = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.saleAppBarLayout = appBarLayout2;
    }

    public static LayoutSaleHeaderLuxeBinding bind(View object) {
        int n3 = R$id.collapsing_toolbar;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)dd2_2.a(n3, object);
        if (collapsingToolbarLayout != null) {
            object = (AppBarLayout)object;
            LayoutSaleHeaderLuxeBinding layoutSaleHeaderLuxeBinding = new LayoutSaleHeaderLuxeBinding((AppBarLayout)object, collapsingToolbarLayout, (AppBarLayout)object);
            return layoutSaleHeaderLuxeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutSaleHeaderLuxeBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSaleHeaderLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSaleHeaderLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_header_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSaleHeaderLuxeBinding.bind((View)layoutInflater);
    }

    public AppBarLayout getRoot() {
        return this.rootView;
    }
}

