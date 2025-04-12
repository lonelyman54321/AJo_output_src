/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class ImageSearchLayoutBinding
extends ViewDataBinding {
    public final TextView idImageSearchSubText;
    public final TextView idImageSearchTitle;
    public final LinearLayout layoutClickPhoto;
    public final ConstraintLayout layoutParentImageSearch;
    public final LinearLayout layoutSelectPhoto;

    public ImageSearchLayoutBinding(Object object, View view, int n3, TextView textView, TextView textView2, LinearLayout linearLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout2) {
        super(object, view, n3);
        this.idImageSearchSubText = textView;
        this.idImageSearchTitle = textView2;
        this.layoutClickPhoto = linearLayout;
        this.layoutParentImageSearch = constraintLayout;
        this.layoutSelectPhoto = linearLayout2;
    }

    public static ImageSearchLayoutBinding bind(View view) {
        return ImageSearchLayoutBinding.bind(view, null);
    }

    public static ImageSearchLayoutBinding bind(View view, Object object) {
        int n3 = R$layout.image_search_layout;
        return (ImageSearchLayoutBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static ImageSearchLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ImageSearchLayoutBinding.inflate(layoutInflater, null);
    }

    public static ImageSearchLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return ImageSearchLayoutBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static ImageSearchLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.image_search_layout;
        return (ImageSearchLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static ImageSearchLayoutBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.image_search_layout;
        return (ImageSearchLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

