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
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;

public final class PlpShimmerItemViewBinding
implements BC3 {
    public final AjioRoundedCornerImageView plpShimmerIv;
    public final View plpShimmerView1;
    public final View plpShimmerView2;
    private final ConstraintLayout rootView;

    private PlpShimmerItemViewBinding(ConstraintLayout constraintLayout, AjioRoundedCornerImageView ajioRoundedCornerImageView, View view, View view2) {
        this.rootView = constraintLayout;
        this.plpShimmerIv = ajioRoundedCornerImageView;
        this.plpShimmerView1 = view;
        this.plpShimmerView2 = view2;
    }

    public static PlpShimmerItemViewBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.plp_shimmer_iv;
        AjioRoundedCornerImageView ajioRoundedCornerImageView = (AjioRoundedCornerImageView)dd2_2.a(n3, object);
        if (ajioRoundedCornerImageView != null && (view2 = dd2_2.a(n3 = R$id.plp_shimmer_view1, object)) != null && (view = dd2_2.a(n3 = R$id.plp_shimmer_view2, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            PlpShimmerItemViewBinding plpShimmerItemViewBinding = new PlpShimmerItemViewBinding((ConstraintLayout)((Object)object), ajioRoundedCornerImageView, view2, view);
            return plpShimmerItemViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpShimmerItemViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpShimmerItemViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpShimmerItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_shimmer_item_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpShimmerItemViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

