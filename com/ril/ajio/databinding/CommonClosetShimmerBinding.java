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

public final class CommonClosetShimmerBinding
implements BC3 {
    public final ShimmerFrameLayout closetShimmerView;
    public final LinearLayout closetShimmerViewContainer;
    private final LinearLayout rootView;

    private CommonClosetShimmerBinding(LinearLayout linearLayout, ShimmerFrameLayout shimmerFrameLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.closetShimmerView = shimmerFrameLayout;
        this.closetShimmerViewContainer = linearLayout2;
    }

    public static CommonClosetShimmerBinding bind(View object) {
        int n3 = R$id.closet_shimmer_view;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout)dd2_2.a(n3, object);
        if (shimmerFrameLayout != null) {
            object = (LinearLayout)object;
            CommonClosetShimmerBinding commonClosetShimmerBinding = new CommonClosetShimmerBinding((LinearLayout)object, shimmerFrameLayout, (LinearLayout)object);
            return commonClosetShimmerBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CommonClosetShimmerBinding inflate(LayoutInflater layoutInflater) {
        return CommonClosetShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static CommonClosetShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.common_closet_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CommonClosetShimmerBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

