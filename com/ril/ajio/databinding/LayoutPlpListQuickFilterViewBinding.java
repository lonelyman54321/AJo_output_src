/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutPlpListQuickFilterViewBinding
implements BC3 {
    public final RecyclerView quickFiltersRv;
    private final RelativeLayout rootView;
    public final RecyclerView selectedQuickFiltersRv;

    private LayoutPlpListQuickFilterViewBinding(RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = relativeLayout;
        this.quickFiltersRv = recyclerView;
        this.selectedQuickFiltersRv = recyclerView2;
    }

    public static LayoutPlpListQuickFilterViewBinding bind(View object) {
        RecyclerView recyclerView;
        int n3 = R$id.quick_filters_rv;
        RecyclerView recyclerView2 = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView2 != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.selected_quick_filters_rv, object)) != null) {
            object = (RelativeLayout)object;
            LayoutPlpListQuickFilterViewBinding layoutPlpListQuickFilterViewBinding = new LayoutPlpListQuickFilterViewBinding((RelativeLayout)object, recyclerView2, recyclerView);
            return layoutPlpListQuickFilterViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutPlpListQuickFilterViewBinding inflate(LayoutInflater layoutInflater) {
        return LayoutPlpListQuickFilterViewBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutPlpListQuickFilterViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_plp_list_quick_filter_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutPlpListQuickFilterViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

