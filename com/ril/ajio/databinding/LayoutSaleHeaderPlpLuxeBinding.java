/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$layout;

public final class LayoutSaleHeaderPlpLuxeBinding
implements BC3 {
    private final FrameLayout rootView;

    private LayoutSaleHeaderPlpLuxeBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static LayoutSaleHeaderPlpLuxeBinding bind(View object) {
        if (object != null) {
            object = (FrameLayout)object;
            LayoutSaleHeaderPlpLuxeBinding layoutSaleHeaderPlpLuxeBinding = new LayoutSaleHeaderPlpLuxeBinding((FrameLayout)object);
            return layoutSaleHeaderPlpLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutSaleHeaderPlpLuxeBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSaleHeaderPlpLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSaleHeaderPlpLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_header_plp_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSaleHeaderPlpLuxeBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

