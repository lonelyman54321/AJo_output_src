/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$layout;

public final class FleekStylishViewLayoutBinding
implements BC3 {
    private final AppCompatImageView rootView;
    public final AppCompatImageView rowRotateProgressbarOne;

    private FleekStylishViewLayoutBinding(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.rootView = appCompatImageView;
        this.rowRotateProgressbarOne = appCompatImageView2;
    }

    public static FleekStylishViewLayoutBinding bind(View object) {
        if (object != null) {
            object = (AppCompatImageView)((Object)object);
            FleekStylishViewLayoutBinding fleekStylishViewLayoutBinding = new FleekStylishViewLayoutBinding((AppCompatImageView)((Object)object), (AppCompatImageView)((Object)object));
            return fleekStylishViewLayoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static FleekStylishViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FleekStylishViewLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FleekStylishViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fleek_stylish_view_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FleekStylishViewLayoutBinding.bind((View)layoutInflater);
    }

    public AppCompatImageView getRoot() {
        return this.rootView;
    }
}

