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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$layout;

public final class FragmentCheckoutHomeAddressLuxBinding
implements BC3 {
    public final RecyclerView checkoutAddressRv;
    private final RecyclerView rootView;

    private FragmentCheckoutHomeAddressLuxBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.checkoutAddressRv = recyclerView2;
    }

    public static FragmentCheckoutHomeAddressLuxBinding bind(View object) {
        if (object != null) {
            object = (RecyclerView)object;
            FragmentCheckoutHomeAddressLuxBinding fragmentCheckoutHomeAddressLuxBinding = new FragmentCheckoutHomeAddressLuxBinding((RecyclerView)object, (RecyclerView)object);
            return fragmentCheckoutHomeAddressLuxBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static FragmentCheckoutHomeAddressLuxBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCheckoutHomeAddressLuxBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCheckoutHomeAddressLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_checkout_home_address_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCheckoutHomeAddressLuxBinding.bind((View)layoutInflater);
    }

    public RecyclerView getRoot() {
        return this.rootView;
    }
}

