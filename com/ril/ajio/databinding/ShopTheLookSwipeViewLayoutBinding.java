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

public final class ShopTheLookSwipeViewLayoutBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final ImageView swipeIv;

    private ShopTheLookSwipeViewLayoutBinding(RelativeLayout relativeLayout, ImageView imageView) {
        this.rootView = relativeLayout;
        this.swipeIv = imageView;
    }

    public static ShopTheLookSwipeViewLayoutBinding bind(View object) {
        int n3 = R$id.swipeIv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (RelativeLayout)object;
            ShopTheLookSwipeViewLayoutBinding shopTheLookSwipeViewLayoutBinding = new ShopTheLookSwipeViewLayoutBinding((RelativeLayout)object, imageView);
            return shopTheLookSwipeViewLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShopTheLookSwipeViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ShopTheLookSwipeViewLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ShopTheLookSwipeViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shop_the_look_swipe_view_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShopTheLookSwipeViewLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

