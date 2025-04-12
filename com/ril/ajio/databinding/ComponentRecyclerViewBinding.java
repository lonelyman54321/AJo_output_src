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

public final class ComponentRecyclerViewBinding
implements BC3 {
    public final RecyclerView componentRecyclerView;
    private final RecyclerView rootView;

    private ComponentRecyclerViewBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.componentRecyclerView = recyclerView2;
    }

    public static ComponentRecyclerViewBinding bind(View object) {
        if (object != null) {
            object = (RecyclerView)object;
            ComponentRecyclerViewBinding componentRecyclerViewBinding = new ComponentRecyclerViewBinding((RecyclerView)object, (RecyclerView)object);
            return componentRecyclerViewBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ComponentRecyclerViewBinding inflate(LayoutInflater layoutInflater) {
        return ComponentRecyclerViewBinding.inflate(layoutInflater, null, false);
    }

    public static ComponentRecyclerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.component_recycler_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ComponentRecyclerViewBinding.bind((View)layoutInflater);
    }

    public RecyclerView getRoot() {
        return this.rootView;
    }
}

