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
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ShimmerProductExitIntentBinding
implements BC3 {
    public final ShimmerFrameLayout productShimmerPdp;
    private final LinearLayout rootView;

    private ShimmerProductExitIntentBinding(LinearLayout linearLayout, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = linearLayout;
        this.productShimmerPdp = shimmerFrameLayout;
    }

    public static ShimmerProductExitIntentBinding bind(View object) {
        int n3 = R$id.product_shimmer_pdp;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout)dd2_2.a(n3, object);
        if (shimmerFrameLayout != null) {
            object = (LinearLayout)object;
            ShimmerProductExitIntentBinding shimmerProductExitIntentBinding = new ShimmerProductExitIntentBinding((LinearLayout)object, shimmerFrameLayout);
            return shimmerProductExitIntentBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShimmerProductExitIntentBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerProductExitIntentBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerProductExitIntentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_product_exit_intent;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerProductExitIntentBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

