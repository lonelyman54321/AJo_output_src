/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpProductItemTagBinding
implements BC3 {
    public final ImageView plpRowProductIv;
    private final LinearLayout rootView;

    private PlpProductItemTagBinding(LinearLayout linearLayout, ImageView imageView) {
        this.rootView = linearLayout;
        this.plpRowProductIv = imageView;
    }

    public static PlpProductItemTagBinding bind(View object) {
        int n3 = R$id.plp_row_product_iv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (LinearLayout)object;
            PlpProductItemTagBinding plpProductItemTagBinding = new PlpProductItemTagBinding((LinearLayout)object, imageView);
            return plpProductItemTagBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpProductItemTagBinding inflate(LayoutInflater layoutInflater) {
        return PlpProductItemTagBinding.inflate(layoutInflater, null, false);
    }

    public static PlpProductItemTagBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_product_item_tag;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpProductItemTagBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

