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
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$layout;

public final class ShimmerAcProgressBinding
implements BC3 {
    private final ShimmerFrameLayout rootView;

    private ShimmerAcProgressBinding(ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = shimmerFrameLayout;
    }

    public static ShimmerAcProgressBinding bind(View object) {
        if (object != null) {
            object = (ShimmerFrameLayout)((Object)object);
            ShimmerAcProgressBinding shimmerAcProgressBinding = new ShimmerAcProgressBinding((ShimmerFrameLayout)((Object)object));
            return shimmerAcProgressBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ShimmerAcProgressBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerAcProgressBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerAcProgressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_ac_progress;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerAcProgressBinding.bind((View)layoutInflater);
    }

    public ShimmerFrameLayout getRoot() {
        return this.rootView;
    }
}

