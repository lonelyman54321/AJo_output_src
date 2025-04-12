/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ril.ajio.R$layout;

public final class PdpMainProductImgBinding
implements BC3 {
    public final ImageView productImg;
    private final ImageView rootView;

    private PdpMainProductImgBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.productImg = imageView2;
    }

    public static PdpMainProductImgBinding bind(View object) {
        if (object != null) {
            object = (ImageView)object;
            PdpMainProductImgBinding pdpMainProductImgBinding = new PdpMainProductImgBinding((ImageView)object, (ImageView)object);
            return pdpMainProductImgBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PdpMainProductImgBinding inflate(LayoutInflater layoutInflater) {
        return PdpMainProductImgBinding.inflate(layoutInflater, null, false);
    }

    public static PdpMainProductImgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_main_product_img;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpMainProductImgBinding.bind((View)layoutInflater);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}

