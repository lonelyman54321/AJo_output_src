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

public final class PlpFilterListRecyclerViewBinding
implements BC3 {
    public final RecyclerView plpFilterRv;
    private final RecyclerView rootView;

    private PlpFilterListRecyclerViewBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.plpFilterRv = recyclerView2;
    }

    public static PlpFilterListRecyclerViewBinding bind(View object) {
        if (object != null) {
            object = (RecyclerView)object;
            PlpFilterListRecyclerViewBinding plpFilterListRecyclerViewBinding = new PlpFilterListRecyclerViewBinding((RecyclerView)object, (RecyclerView)object);
            return plpFilterListRecyclerViewBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PlpFilterListRecyclerViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpFilterListRecyclerViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpFilterListRecyclerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_filter_list_recycler_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpFilterListRecyclerViewBinding.bind((View)layoutInflater);
    }

    public RecyclerView getRoot() {
        return this.rootView;
    }
}

