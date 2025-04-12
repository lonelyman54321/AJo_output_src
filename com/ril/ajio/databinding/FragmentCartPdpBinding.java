/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentCartPdpBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final FrameLayout pdpContainer;
    private final LinearLayout rootView;

    private FragmentCartPdpBinding(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = linearLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.pdpContainer = frameLayout2;
    }

    public static FragmentCartPdpBinding bind(View object) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        int n3 = R$id.cancelBtn;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (frameLayout2 = (FrameLayout)dd2_2.a(n3 = R$id.cancelContainer, object)) != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.pdpContainer, object)) != null) {
            object = (LinearLayout)object;
            FragmentCartPdpBinding fragmentCartPdpBinding = new FragmentCartPdpBinding((LinearLayout)object, imageView, frameLayout2, frameLayout);
            return fragmentCartPdpBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentCartPdpBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCartPdpBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCartPdpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cart_pdp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCartPdpBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

