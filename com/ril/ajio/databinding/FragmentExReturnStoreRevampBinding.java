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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentExReturnStoreRevampBinding
implements BC3 {
    public final RecyclerView exReturnStoreRv;
    private final ConstraintLayout rootView;

    private FragmentExReturnStoreRevampBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.exReturnStoreRv = recyclerView;
    }

    public static FragmentExReturnStoreRevampBinding bind(View object) {
        int n3 = R$id.ex_return_store_rv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null) {
            object = (ConstraintLayout)((Object)object);
            FragmentExReturnStoreRevampBinding fragmentExReturnStoreRevampBinding = new FragmentExReturnStoreRevampBinding((ConstraintLayout)((Object)object), recyclerView);
            return fragmentExReturnStoreRevampBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentExReturnStoreRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentExReturnStoreRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentExReturnStoreRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_ex_return_store_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentExReturnStoreRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

