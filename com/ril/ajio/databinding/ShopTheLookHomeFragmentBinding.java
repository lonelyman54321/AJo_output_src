/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ShopTheLookHomeFragmentBinding
implements BC3 {
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final ImageView stlCloseIv;
    public final RecyclerView stlHomeRv;

    private ShopTheLookHomeFragmentBinding(RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView, RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.progressBar = progressBar;
        this.stlCloseIv = imageView;
        this.stlHomeRv = recyclerView;
    }

    public static ShopTheLookHomeFragmentBinding bind(View object) {
        RecyclerView recyclerView;
        ImageView imageView;
        int n3 = R$id.progress_bar;
        ProgressBar progressBar = (ProgressBar)dd2_2.a(n3, object);
        if (progressBar != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.stlCloseIv, object)) != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.stlHomeRv, object)) != null) {
            object = (RelativeLayout)object;
            ShopTheLookHomeFragmentBinding shopTheLookHomeFragmentBinding = new ShopTheLookHomeFragmentBinding((RelativeLayout)object, progressBar, imageView, recyclerView);
            return shopTheLookHomeFragmentBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShopTheLookHomeFragmentBinding inflate(LayoutInflater layoutInflater) {
        return ShopTheLookHomeFragmentBinding.inflate(layoutInflater, null, false);
    }

    public static ShopTheLookHomeFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shop_the_look_home_fragment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShopTheLookHomeFragmentBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

