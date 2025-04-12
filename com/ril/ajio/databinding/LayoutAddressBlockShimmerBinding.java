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

public final class LayoutAddressBlockShimmerBinding
implements BC3 {
    private final LinearLayout rootView;

    private LayoutAddressBlockShimmerBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static LayoutAddressBlockShimmerBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            LayoutAddressBlockShimmerBinding layoutAddressBlockShimmerBinding = new LayoutAddressBlockShimmerBinding((LinearLayout)object);
            return layoutAddressBlockShimmerBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutAddressBlockShimmerBinding inflate(LayoutInflater layoutInflater) {
        return LayoutAddressBlockShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutAddressBlockShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_address_block_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutAddressBlockShimmerBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

