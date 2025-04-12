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

public final class RowKnowTheProductImageBinding
implements BC3 {
    public final AjioImageView ivKypBanner;
    public final ConstraintLayout pdpImageMainCl;
    private final ConstraintLayout rootView;

    private RowKnowTheProductImageBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.ivKypBanner = ajioImageView;
        this.pdpImageMainCl = constraintLayout2;
    }

    public static RowKnowTheProductImageBinding bind(View object) {
        int n3 = R$id.iv_kyp_banner;
        AjioImageView ajioImageView = (AjioImageView)dd2_2.a(n3, object);
        if (ajioImageView != null) {
            object = (ConstraintLayout)((Object)object);
            RowKnowTheProductImageBinding rowKnowTheProductImageBinding = new RowKnowTheProductImageBinding((ConstraintLayout)((Object)object), ajioImageView, (ConstraintLayout)((Object)object));
            return rowKnowTheProductImageBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowKnowTheProductImageBinding inflate(LayoutInflater layoutInflater) {
        return RowKnowTheProductImageBinding.inflate(layoutInflater, null, false);
    }

    public static RowKnowTheProductImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_know_the_product_image;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowKnowTheProductImageBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

