/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$layout;

public final class OosSimilarShimmer2Binding
implements BC3 {
    private final LinearLayout rootView;

    private OosSimilarShimmer2Binding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static OosSimilarShimmer2Binding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            OosSimilarShimmer2Binding oosSimilarShimmer2Binding = new OosSimilarShimmer2Binding((LinearLayout)object);
            return oosSimilarShimmer2Binding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static OosSimilarShimmer2Binding inflate(LayoutInflater layoutInflater) {
        return OosSimilarShimmer2Binding.inflate(layoutInflater, null, false);
    }

    public static OosSimilarShimmer2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.oos_similar_shimmer_2;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OosSimilarShimmer2Binding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

