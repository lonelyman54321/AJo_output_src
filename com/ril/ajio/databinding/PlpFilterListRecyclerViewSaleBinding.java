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

public final class PlpFilterListRecyclerViewSaleBinding
implements BC3 {
    public final RecyclerView plpFilterRvSale;
    private final RecyclerView rootView;

    private PlpFilterListRecyclerViewSaleBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.plpFilterRvSale = recyclerView2;
    }

    public static PlpFilterListRecyclerViewSaleBinding bind(View object) {
        if (object != null) {
            object = (RecyclerView)object;
            PlpFilterListRecyclerViewSaleBinding plpFilterListRecyclerViewSaleBinding = new PlpFilterListRecyclerViewSaleBinding((RecyclerView)object, (RecyclerView)object);
            return plpFilterListRecyclerViewSaleBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PlpFilterListRecyclerViewSaleBinding inflate(LayoutInflater layoutInflater) {
        return PlpFilterListRecyclerViewSaleBinding.inflate(layoutInflater, null, false);
    }

    public static PlpFilterListRecyclerViewSaleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_filter_list_recycler_view_sale;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpFilterListRecyclerViewSaleBinding.bind((View)layoutInflater);
    }

    public RecyclerView getRoot() {
        return this.rootView;
    }
}

