/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FsPlpSelectedFilterItemBinding
implements BC3 {
    public final ImageView filterClose;
    public final TextView filterName;
    private final ConstraintLayout rootView;

    private FsPlpSelectedFilterItemBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.filterClose = imageView;
        this.filterName = textView;
    }

    public static FsPlpSelectedFilterItemBinding bind(View object) {
        TextView textView;
        int n3 = R$id.filterClose;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (textView = (TextView)dd2_2.a(n3 = R$id.filterName, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            FsPlpSelectedFilterItemBinding fsPlpSelectedFilterItemBinding = new FsPlpSelectedFilterItemBinding((ConstraintLayout)((Object)object), imageView, textView);
            return fsPlpSelectedFilterItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FsPlpSelectedFilterItemBinding inflate(LayoutInflater layoutInflater) {
        return FsPlpSelectedFilterItemBinding.inflate(layoutInflater, null, false);
    }

    public static FsPlpSelectedFilterItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fs_plp_selected_filter_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FsPlpSelectedFilterItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

