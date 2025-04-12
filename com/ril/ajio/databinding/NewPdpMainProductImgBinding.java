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

public final class NewPdpMainProductImgBinding
implements BC3 {
    public final ImageView productImg;
    private final ImageView rootView;

    private NewPdpMainProductImgBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.productImg = imageView2;
    }

    public static NewPdpMainProductImgBinding bind(View object) {
        if (object != null) {
            object = (ImageView)object;
            NewPdpMainProductImgBinding newPdpMainProductImgBinding = new NewPdpMainProductImgBinding((ImageView)object, (ImageView)object);
            return newPdpMainProductImgBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static NewPdpMainProductImgBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpMainProductImgBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpMainProductImgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_main_product_img;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpMainProductImgBinding.bind((View)layoutInflater);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}

