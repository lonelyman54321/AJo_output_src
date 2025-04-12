/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCartBannerRefreshBinding
implements BC3 {
    public final ImageView cartBannerIv;
    private final LinearLayout rootView;

    private RowCartBannerRefreshBinding(LinearLayout linearLayout, ImageView imageView) {
        this.rootView = linearLayout;
        this.cartBannerIv = imageView;
    }

    public static RowCartBannerRefreshBinding bind(View object) {
        int n3 = R$id.cartBannerIv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (LinearLayout)object;
            RowCartBannerRefreshBinding rowCartBannerRefreshBinding = new RowCartBannerRefreshBinding((LinearLayout)object, imageView);
            return rowCartBannerRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCartBannerRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCartBannerRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartBannerRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_banner_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartBannerRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

