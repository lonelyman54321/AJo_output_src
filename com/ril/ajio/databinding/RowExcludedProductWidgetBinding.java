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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowExcludedProductWidgetBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView tvWalletExProductTitle;
    public final RecyclerView walletExcludedProducts;

    private RowExcludedProductWidgetBinding(LinearLayout linearLayout, AjioTextView ajioTextView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.tvWalletExProductTitle = ajioTextView;
        this.walletExcludedProducts = recyclerView;
    }

    public static RowExcludedProductWidgetBinding bind(View object) {
        RecyclerView recyclerView;
        int n3 = R$id.tvWalletExProductTitle;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.wallet_excluded_products, object)) != null) {
            object = (LinearLayout)object;
            RowExcludedProductWidgetBinding rowExcludedProductWidgetBinding = new RowExcludedProductWidgetBinding((LinearLayout)object, ajioTextView, recyclerView);
            return rowExcludedProductWidgetBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowExcludedProductWidgetBinding inflate(LayoutInflater layoutInflater) {
        return RowExcludedProductWidgetBinding.inflate(layoutInflater, null, false);
    }

    public static RowExcludedProductWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_excluded_product_widget;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowExcludedProductWidgetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

