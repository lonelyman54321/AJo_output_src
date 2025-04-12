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

public final class OosSimilarShimmer1Binding
implements BC3 {
    private final ConstraintLayout rootView;
    public final View shimmerDummyTxt1;
    public final View shimmerDummyTxt2;
    public final View shimmerDummyTxt3;
    public final View shimmerDummyTxt4;
    public final View shimmerDummyTxt5;
    public final View shimmerProductImg;

    private OosSimilarShimmer1Binding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5, View view6) {
        this.rootView = constraintLayout;
        this.shimmerDummyTxt1 = view;
        this.shimmerDummyTxt2 = view2;
        this.shimmerDummyTxt3 = view3;
        this.shimmerDummyTxt4 = view4;
        this.shimmerDummyTxt5 = view5;
        this.shimmerProductImg = view6;
    }

    public static OosSimilarShimmer1Binding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        int n3 = R$id.shimmerDummyTxt1;
        View view6 = dd2_2.a(n3, object);
        if (view6 != null && (view5 = dd2_2.a(n3 = R$id.shimmerDummyTxt2, object)) != null && (view4 = dd2_2.a(n3 = R$id.shimmerDummyTxt3, object)) != null && (view3 = dd2_2.a(n3 = R$id.shimmerDummyTxt4, object)) != null && (view2 = dd2_2.a(n3 = R$id.shimmerDummyTxt5, object)) != null && (view = dd2_2.a(n3 = R$id.shimmerProductImg, object)) != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            OosSimilarShimmer1Binding oosSimilarShimmer1Binding = new OosSimilarShimmer1Binding((ConstraintLayout)((Object)object2), view6, view5, view4, view3, view2, view);
            return oosSimilarShimmer1Binding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OosSimilarShimmer1Binding inflate(LayoutInflater layoutInflater) {
        return OosSimilarShimmer1Binding.inflate(layoutInflater, null, false);
    }

    public static OosSimilarShimmer1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.oos_similar_shimmer_1;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OosSimilarShimmer1Binding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

