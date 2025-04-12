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
import com.ril.ajio.databinding.AddressBarUiBinding;
import com.ril.ajio.databinding.LayoutSaleHeaderCollapsedBinding;

public final class LayoutPlpSaleBinding
implements BC3 {
    public final AddressBarUiBinding addressBarUiSale;
    public final LayoutSaleHeaderCollapsedBinding collapsedHeaderContainer;
    public final LinearLayout layoutSelectedFilterSale;
    private final LinearLayout rootView;
    public final Toolbar saleToolbar;
    public final RecyclerView stickySelectedQuickFiltersRvSale;

    private LayoutPlpSaleBinding(LinearLayout linearLayout, AddressBarUiBinding addressBarUiBinding, LayoutSaleHeaderCollapsedBinding layoutSaleHeaderCollapsedBinding, LinearLayout linearLayout2, Toolbar toolbar, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.addressBarUiSale = addressBarUiBinding;
        this.collapsedHeaderContainer = layoutSaleHeaderCollapsedBinding;
        this.layoutSelectedFilterSale = linearLayout2;
        this.saleToolbar = toolbar;
        this.stickySelectedQuickFiltersRvSale = recyclerView;
    }

    public static LayoutPlpSaleBinding bind(View object) {
        int n3 = R$id.address_bar_ui_sale;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            AddressBarUiBinding addressBarUiBinding = AddressBarUiBinding.bind(view);
            n3 = R$id.collapsedHeaderContainer;
            view = dd2_2.a(n3, object);
            if (view != null) {
                LayoutSaleHeaderCollapsedBinding layoutSaleHeaderCollapsedBinding = LayoutSaleHeaderCollapsedBinding.bind(view);
                n3 = R$id.layout_selected_filter_sale;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.saleToolbar;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (Toolbar)view;
                    if (object2 != null) {
                        n3 = R$id.sticky_selected_quick_filters_rv_sale;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (RecyclerView)view;
                        if (object3 != null) {
                            Object object4 = object;
                            object4 = (LinearLayout)object;
                            LayoutPlpSaleBinding layoutPlpSaleBinding = new LayoutPlpSaleBinding((LinearLayout)object4, addressBarUiBinding, layoutSaleHeaderCollapsedBinding, (LinearLayout)view2, (Toolbar)object2, (RecyclerView)object3);
                            return layoutPlpSaleBinding;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutPlpSaleBinding inflate(LayoutInflater layoutInflater) {
        return LayoutPlpSaleBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutPlpSaleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_plp_sale;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutPlpSaleBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

