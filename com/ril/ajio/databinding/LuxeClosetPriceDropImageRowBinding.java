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

public final class LuxeClosetPriceDropImageRowBinding
implements BC3 {
    public final ImageView ivMergeOosProduct;
    private final LinearLayout rootView;

    private LuxeClosetPriceDropImageRowBinding(LinearLayout linearLayout, ImageView imageView) {
        this.rootView = linearLayout;
        this.ivMergeOosProduct = imageView;
    }

    public static LuxeClosetPriceDropImageRowBinding bind(View object) {
        int n3 = R$id.iv_merge_oos_product;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (LinearLayout)object;
            LuxeClosetPriceDropImageRowBinding luxeClosetPriceDropImageRowBinding = new LuxeClosetPriceDropImageRowBinding((LinearLayout)object, imageView);
            return luxeClosetPriceDropImageRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeClosetPriceDropImageRowBinding inflate(LayoutInflater layoutInflater) {
        return LuxeClosetPriceDropImageRowBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeClosetPriceDropImageRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_closet_price_drop_image_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeClosetPriceDropImageRowBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

