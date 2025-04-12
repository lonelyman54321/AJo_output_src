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
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutClosetSaleBinding
implements BC3 {
    public final RecyclerView closetGrid;
    private final LinearLayout rootView;
    public final Toolbar saleToolbar;

    private LayoutClosetSaleBinding(LinearLayout linearLayout, RecyclerView recyclerView, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.closetGrid = recyclerView;
        this.saleToolbar = toolbar;
    }

    public static LayoutClosetSaleBinding bind(View object) {
        Toolbar toolbar;
        int n3 = R$id.closet_grid;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null && (toolbar = (Toolbar)dd2_2.a(n3 = R$id.saleToolbar, object)) != null) {
            object = (LinearLayout)object;
            LayoutClosetSaleBinding layoutClosetSaleBinding = new LayoutClosetSaleBinding((LinearLayout)object, recyclerView, toolbar);
            return layoutClosetSaleBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutClosetSaleBinding inflate(LayoutInflater layoutInflater) {
        return LayoutClosetSaleBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutClosetSaleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_closet_sale;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutClosetSaleBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

