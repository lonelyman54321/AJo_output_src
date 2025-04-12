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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpMultiImageRowBinding
implements BC3 {
    public final ImageView pdpProductImg;
    private final ConstraintLayout rootView;

    private PlpMultiImageRowBinding(ConstraintLayout constraintLayout, ImageView imageView) {
        this.rootView = constraintLayout;
        this.pdpProductImg = imageView;
    }

    public static PlpMultiImageRowBinding bind(View object) {
        int n3 = R$id.pdp_product_img;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (ConstraintLayout)((Object)object);
            PlpMultiImageRowBinding plpMultiImageRowBinding = new PlpMultiImageRowBinding((ConstraintLayout)((Object)object), imageView);
            return plpMultiImageRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpMultiImageRowBinding inflate(LayoutInflater layoutInflater) {
        return PlpMultiImageRowBinding.inflate(layoutInflater, null, false);
    }

    public static PlpMultiImageRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_multi_image_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpMultiImageRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

