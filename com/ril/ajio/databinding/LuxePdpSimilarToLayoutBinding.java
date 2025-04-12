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

public final class LuxePdpSimilarToLayoutBinding
implements BC3 {
    private final LinearLayout rootView;

    private LuxePdpSimilarToLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static LuxePdpSimilarToLayoutBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            LuxePdpSimilarToLayoutBinding luxePdpSimilarToLayoutBinding = new LuxePdpSimilarToLayoutBinding((LinearLayout)object);
            return luxePdpSimilarToLayoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LuxePdpSimilarToLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxePdpSimilarToLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePdpSimilarToLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_pdp_similar_to_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePdpSimilarToLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

