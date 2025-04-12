/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRedirectingProgressView;

public final class CartListBinding
implements BC3 {
    public final FrameLayout cartContainer;
    public final AjioRedirectingProgressView redirectingProgressBar;
    private final RelativeLayout rootView;

    private CartListBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, AjioRedirectingProgressView ajioRedirectingProgressView) {
        this.rootView = relativeLayout;
        this.cartContainer = frameLayout;
        this.redirectingProgressBar = ajioRedirectingProgressView;
    }

    public static CartListBinding bind(View object) {
        AjioRedirectingProgressView ajioRedirectingProgressView;
        int n3 = R$id.cart_container;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null && (ajioRedirectingProgressView = (AjioRedirectingProgressView)dd2_2.a(n3 = R$id.redirecting_progress_bar, object)) != null) {
            object = (RelativeLayout)object;
            CartListBinding cartListBinding = new CartListBinding((RelativeLayout)object, frameLayout, ajioRedirectingProgressView);
            return cartListBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartListBinding inflate(LayoutInflater layoutInflater) {
        return CartListBinding.inflate(layoutInflater, null, false);
    }

    public static CartListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartListBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

