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
import com.ril.ajio.databinding.PdpSpotLightContanierBinding;

public final class NewPdpRvImageRowBinding
implements BC3 {
    public final ImageView pdpProductImg;
    private final ConstraintLayout rootView;
    public final PdpSpotLightContanierBinding spotLightContainer;

    private NewPdpRvImageRowBinding(ConstraintLayout constraintLayout, ImageView imageView, PdpSpotLightContanierBinding pdpSpotLightContanierBinding) {
        this.rootView = constraintLayout;
        this.pdpProductImg = imageView;
        this.spotLightContainer = pdpSpotLightContanierBinding;
    }

    public static NewPdpRvImageRowBinding bind(View object) {
        Object object2;
        int n3 = R$id.pdp_product_img;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (object2 = dd2_2.a(n3 = R$id.spotLightContainer, object)) != null) {
            PdpSpotLightContanierBinding pdpSpotLightContanierBinding = PdpSpotLightContanierBinding.bind(object2);
            object = (ConstraintLayout)((Object)object);
            object2 = new NewPdpRvImageRowBinding((ConstraintLayout)((Object)object), imageView, pdpSpotLightContanierBinding);
            return object2;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewPdpRvImageRowBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpRvImageRowBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpRvImageRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_rv_image_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpRvImageRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

