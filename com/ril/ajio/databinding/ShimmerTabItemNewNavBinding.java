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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ShimmerTabItemNewNavBinding
implements BC3 {
    public final View categoryImg;
    public final View categoryLabel;
    private final ShimmerFrameLayout rootView;

    private ShimmerTabItemNewNavBinding(ShimmerFrameLayout shimmerFrameLayout, View view, View view2) {
        this.rootView = shimmerFrameLayout;
        this.categoryImg = view;
        this.categoryLabel = view2;
    }

    public static ShimmerTabItemNewNavBinding bind(View object) {
        View view;
        int n3 = R$id.category_img;
        View view2 = dd2_2.a(n3, object);
        if (view2 != null && (view = dd2_2.a(n3 = R$id.category_label, object)) != null) {
            object = (ShimmerFrameLayout)((Object)object);
            ShimmerTabItemNewNavBinding shimmerTabItemNewNavBinding = new ShimmerTabItemNewNavBinding((ShimmerFrameLayout)((Object)object), view2, view);
            return shimmerTabItemNewNavBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShimmerTabItemNewNavBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerTabItemNewNavBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerTabItemNewNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_tab_item_new_nav;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerTabItemNewNavBinding.bind((View)layoutInflater);
    }

    public ShimmerFrameLayout getRoot() {
        return this.rootView;
    }
}

