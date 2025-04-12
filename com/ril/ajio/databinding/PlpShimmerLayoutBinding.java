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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpShimmerLayoutBinding
implements BC3 {
    public final LinearLayout midContainer;
    private final LinearLayout rootView;
    public final LinearLayout topContainer;

    private PlpShimmerLayoutBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.midContainer = linearLayout2;
        this.topContainer = linearLayout3;
    }

    public static PlpShimmerLayoutBinding bind(View object) {
        LinearLayout linearLayout;
        int n3 = R$id.mid_container;
        LinearLayout linearLayout2 = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout2 != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.top_container, object)) != null) {
            object = (LinearLayout)object;
            PlpShimmerLayoutBinding plpShimmerLayoutBinding = new PlpShimmerLayoutBinding((LinearLayout)object, linearLayout2, linearLayout);
            return plpShimmerLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpShimmerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PlpShimmerLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PlpShimmerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_shimmer_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpShimmerLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

