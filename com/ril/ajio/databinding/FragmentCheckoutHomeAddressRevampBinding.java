/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentCheckoutHomeAddressRevampBinding
implements BC3 {
    public final RecyclerView checkoutAddressRv;
    private final FrameLayout rootView;

    private FragmentCheckoutHomeAddressRevampBinding(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.checkoutAddressRv = recyclerView;
    }

    public static FragmentCheckoutHomeAddressRevampBinding bind(View object) {
        int n3 = R$id.checkout_address_rv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null) {
            object = (FrameLayout)object;
            FragmentCheckoutHomeAddressRevampBinding fragmentCheckoutHomeAddressRevampBinding = new FragmentCheckoutHomeAddressRevampBinding((FrameLayout)object, recyclerView);
            return fragmentCheckoutHomeAddressRevampBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentCheckoutHomeAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCheckoutHomeAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCheckoutHomeAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_checkout_home_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCheckoutHomeAddressRevampBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

