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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;

public final class PlpBannerRowLayoutBinding
implements BC3 {
    public final AjioImageView plpExtendedBannerImage;
    private final ConstraintLayout rootView;

    private PlpBannerRowLayoutBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView) {
        this.rootView = constraintLayout;
        this.plpExtendedBannerImage = ajioImageView;
    }

    public static PlpBannerRowLayoutBinding bind(View object) {
        int n3 = R$id.plpExtendedBannerImage;
        AjioImageView ajioImageView = (AjioImageView)dd2_2.a(n3, object);
        if (ajioImageView != null) {
            object = (ConstraintLayout)((Object)object);
            PlpBannerRowLayoutBinding plpBannerRowLayoutBinding = new PlpBannerRowLayoutBinding((ConstraintLayout)((Object)object), ajioImageView);
            return plpBannerRowLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpBannerRowLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PlpBannerRowLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PlpBannerRowLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_banner_row_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpBannerRowLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

