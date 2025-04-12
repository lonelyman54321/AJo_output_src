/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowWalletExcProductBinding
implements BC3 {
    public final ImageView idWalletProductImage;
    private final RelativeLayout rootView;

    private RowWalletExcProductBinding(RelativeLayout relativeLayout, ImageView imageView) {
        this.rootView = relativeLayout;
        this.idWalletProductImage = imageView;
    }

    public static RowWalletExcProductBinding bind(View object) {
        int n3 = R$id.id_wallet_product_image;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (RelativeLayout)object;
            RowWalletExcProductBinding rowWalletExcProductBinding = new RowWalletExcProductBinding((RelativeLayout)object, imageView);
            return rowWalletExcProductBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowWalletExcProductBinding inflate(LayoutInflater layoutInflater) {
        return RowWalletExcProductBinding.inflate(layoutInflater, null, false);
    }

    public static RowWalletExcProductBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_wallet_exc_product;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowWalletExcProductBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

