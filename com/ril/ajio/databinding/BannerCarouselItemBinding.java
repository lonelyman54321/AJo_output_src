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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$layout;

public final class BannerCarouselItemBinding
implements BC3 {
    public final ConstraintLayout containerImgCL;
    private final ConstraintLayout rootView;

    private BannerCarouselItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.containerImgCL = constraintLayout2;
    }

    public static BannerCarouselItemBinding bind(View object) {
        if (object != null) {
            object = (ConstraintLayout)((Object)object);
            BannerCarouselItemBinding bannerCarouselItemBinding = new BannerCarouselItemBinding((ConstraintLayout)((Object)object), (ConstraintLayout)((Object)object));
            return bannerCarouselItemBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static BannerCarouselItemBinding inflate(LayoutInflater layoutInflater) {
        return BannerCarouselItemBinding.inflate(layoutInflater, null, false);
    }

    public static BannerCarouselItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.banner_carousel_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return BannerCarouselItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

