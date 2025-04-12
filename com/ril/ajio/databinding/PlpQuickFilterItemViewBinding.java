/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpQuickFilterItemViewBinding
implements BC3 {
    public final ImageView filterIconIv;
    public final TextView filterNameTv;
    private final RelativeLayout rootView;

    private PlpQuickFilterItemViewBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView) {
        this.rootView = relativeLayout;
        this.filterIconIv = imageView;
        this.filterNameTv = textView;
    }

    public static PlpQuickFilterItemViewBinding bind(View object) {
        TextView textView;
        int n3 = R$id.filter_icon_iv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (textView = (TextView)dd2_2.a(n3 = R$id.filter_name_tv, object)) != null) {
            object = (RelativeLayout)object;
            PlpQuickFilterItemViewBinding plpQuickFilterItemViewBinding = new PlpQuickFilterItemViewBinding((RelativeLayout)object, imageView, textView);
            return plpQuickFilterItemViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpQuickFilterItemViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpQuickFilterItemViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpQuickFilterItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_quick_filter_item_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpQuickFilterItemViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

