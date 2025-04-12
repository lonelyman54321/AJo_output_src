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
import com.ril.ajio.R$layout;

public final class RowMergeOosProductsLuxeBinding
implements BC3 {
    public final ImageView ivMergeOosProduct;
    private final ImageView rootView;

    private RowMergeOosProductsLuxeBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.ivMergeOosProduct = imageView2;
    }

    public static RowMergeOosProductsLuxeBinding bind(View object) {
        if (object != null) {
            object = (ImageView)object;
            RowMergeOosProductsLuxeBinding rowMergeOosProductsLuxeBinding = new RowMergeOosProductsLuxeBinding((ImageView)object, (ImageView)object);
            return rowMergeOosProductsLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowMergeOosProductsLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowMergeOosProductsLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static RowMergeOosProductsLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_merge_oos_products_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowMergeOosProductsLuxeBinding.bind((View)layoutInflater);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}

