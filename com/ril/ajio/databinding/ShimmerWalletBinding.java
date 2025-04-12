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

public final class ShimmerWalletBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final View view1;
    public final View view2;
    public final View view3;
    public final View view4;

    private ShimmerWalletBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4) {
        this.rootView = constraintLayout;
        this.view1 = view;
        this.view2 = view2;
        this.view3 = view3;
        this.view4 = view4;
    }

    public static ShimmerWalletBinding bind(View object) {
        View view;
        View view2;
        View view3;
        int n3 = R$id.view_1;
        View view4 = dd2_2.a(n3, object);
        if (view4 != null && (view3 = dd2_2.a(n3 = R$id.view_2, object)) != null && (view2 = dd2_2.a(n3 = R$id.view_3, object)) != null && (view = dd2_2.a(n3 = R$id.view_4, object)) != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            ShimmerWalletBinding shimmerWalletBinding = new ShimmerWalletBinding((ConstraintLayout)((Object)object2), view4, view3, view2, view);
            return shimmerWalletBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShimmerWalletBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerWalletBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerWalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_wallet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerWalletBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

