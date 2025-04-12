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
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;

public final class HomepageOtherProductsItemBinding
implements BC3 {
    public final AjioRoundedCornerImageView productImg;
    private final AjioRoundedCornerImageView rootView;

    private HomepageOtherProductsItemBinding(AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioRoundedCornerImageView ajioRoundedCornerImageView2) {
        this.rootView = ajioRoundedCornerImageView;
        this.productImg = ajioRoundedCornerImageView2;
    }

    public static HomepageOtherProductsItemBinding bind(View object) {
        if (object != null) {
            object = (AjioRoundedCornerImageView)((Object)object);
            HomepageOtherProductsItemBinding homepageOtherProductsItemBinding = new HomepageOtherProductsItemBinding((AjioRoundedCornerImageView)((Object)object), (AjioRoundedCornerImageView)((Object)object));
            return homepageOtherProductsItemBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static HomepageOtherProductsItemBinding inflate(LayoutInflater layoutInflater) {
        return HomepageOtherProductsItemBinding.inflate(layoutInflater, null, false);
    }

    public static HomepageOtherProductsItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.homepage_other_products_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomepageOtherProductsItemBinding.bind((View)layoutInflater);
    }

    public AjioRoundedCornerImageView getRoot() {
        return this.rootView;
    }
}

