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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FsPlpSelectedFilterBinding
implements BC3 {
    private final LinearLayout rootView;
    public final LinearLayout selectedFilterContainer;
    public final RecyclerView selectedFilterList;

    private FsPlpSelectedFilterBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.selectedFilterContainer = linearLayout2;
        this.selectedFilterList = recyclerView;
    }

    public static FsPlpSelectedFilterBinding bind(View object) {
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.selectedFilterList;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null) {
            object = new FsPlpSelectedFilterBinding((LinearLayout)object2, (LinearLayout)object2, recyclerView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static FsPlpSelectedFilterBinding inflate(LayoutInflater layoutInflater) {
        return FsPlpSelectedFilterBinding.inflate(layoutInflater, null, false);
    }

    public static FsPlpSelectedFilterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fs_plp_selected_filter;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FsPlpSelectedFilterBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

