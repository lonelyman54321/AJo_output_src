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

public final class FragmentCheckoutStoreAddressRevampBinding
implements BC3 {
    public final RecyclerView checkoutStoreRv;
    private final RecyclerView rootView;

    private FragmentCheckoutStoreAddressRevampBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.checkoutStoreRv = recyclerView2;
    }

    public static FragmentCheckoutStoreAddressRevampBinding bind(View object) {
        if (object != null) {
            object = (RecyclerView)object;
            FragmentCheckoutStoreAddressRevampBinding fragmentCheckoutStoreAddressRevampBinding = new FragmentCheckoutStoreAddressRevampBinding((RecyclerView)object, (RecyclerView)object);
            return fragmentCheckoutStoreAddressRevampBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static FragmentCheckoutStoreAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCheckoutStoreAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCheckoutStoreAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_checkout_store_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCheckoutStoreAddressRevampBinding.bind((View)layoutInflater);
    }

    public RecyclerView getRoot() {
        return this.rootView;
    }
}

