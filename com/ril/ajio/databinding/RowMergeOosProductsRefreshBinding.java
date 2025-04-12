/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowMergeOosProductsRefreshBinding
implements BC3 {
    public final ImageView ivMergeOosProduct;
    private final CardView rootView;

    private RowMergeOosProductsRefreshBinding(CardView cardView, ImageView imageView) {
        this.rootView = cardView;
        this.ivMergeOosProduct = imageView;
    }

    public static RowMergeOosProductsRefreshBinding bind(View object) {
        int n3 = R$id.iv_merge_oos_product;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (CardView)((Object)object);
            RowMergeOosProductsRefreshBinding rowMergeOosProductsRefreshBinding = new RowMergeOosProductsRefreshBinding((CardView)((Object)object), imageView);
            return rowMergeOosProductsRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowMergeOosProductsRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowMergeOosProductsRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowMergeOosProductsRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_merge_oos_products_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowMergeOosProductsRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

