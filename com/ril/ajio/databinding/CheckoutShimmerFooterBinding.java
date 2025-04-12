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

public final class CheckoutShimmerFooterBinding
implements BC3 {
    private final LinearLayout rootView;
    public final View viewFou;

    private CheckoutShimmerFooterBinding(LinearLayout linearLayout, View view) {
        this.rootView = linearLayout;
        this.viewFou = view;
    }

    public static CheckoutShimmerFooterBinding bind(View object) {
        int n3 = R$id.view_fou;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            object = (LinearLayout)object;
            CheckoutShimmerFooterBinding checkoutShimmerFooterBinding = new CheckoutShimmerFooterBinding((LinearLayout)object, view);
            return checkoutShimmerFooterBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CheckoutShimmerFooterBinding inflate(LayoutInflater layoutInflater) {
        return CheckoutShimmerFooterBinding.inflate(layoutInflater, null, false);
    }

    public static CheckoutShimmerFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.checkout_shimmer_footer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CheckoutShimmerFooterBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

