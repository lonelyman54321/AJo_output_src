/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FsPlpFilterItemBinding
implements BC3 {
    public final LinearLayout fsFilterContainer;
    public final ImageView fsFilterImg;
    public final TextView fsFilterName;
    private final LinearLayout rootView;

    private FsPlpFilterItemBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.fsFilterContainer = linearLayout2;
        this.fsFilterImg = imageView;
        this.fsFilterName = textView;
    }

    public static FsPlpFilterItemBinding bind(View object) {
        TextView textView;
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.fsFilterImg;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (textView = (TextView)dd2_2.a(n3 = R$id.fsFilterName, object)) != null) {
            object = new FsPlpFilterItemBinding((LinearLayout)object2, (LinearLayout)object2, imageView, textView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static FsPlpFilterItemBinding inflate(LayoutInflater layoutInflater) {
        return FsPlpFilterItemBinding.inflate(layoutInflater, null, false);
    }

    public static FsPlpFilterItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fs_plp_filter_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FsPlpFilterItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

