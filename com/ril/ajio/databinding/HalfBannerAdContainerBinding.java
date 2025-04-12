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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class HalfBannerAdContainerBinding
implements BC3 {
    public final ConstraintLayout adBanner;
    public final ImageView imgBannerAd;
    public final AjioTextView plpAdTv;
    private final ConstraintLayout rootView;

    private HalfBannerAdContainerBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.adBanner = constraintLayout2;
        this.imgBannerAd = imageView;
        this.plpAdTv = ajioTextView;
    }

    public static HalfBannerAdContainerBinding bind(View object) {
        AjioTextView ajioTextView;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.imgBannerAd;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.plp_ad_tv, object)) != null) {
            object = new HalfBannerAdContainerBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), imageView, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static HalfBannerAdContainerBinding inflate(LayoutInflater layoutInflater) {
        return HalfBannerAdContainerBinding.inflate(layoutInflater, null, false);
    }

    public static HalfBannerAdContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.half_banner_ad_container;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HalfBannerAdContainerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

