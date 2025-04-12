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
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class ImageSearchUploadLayoutBinding
extends ViewDataBinding {
    public final TextView idImageSearchSubText;
    public final TextView idImageSearchTitle;
    public final ImageView ivSearchImage;
    public final ConstraintLayout layoutParentImageSearch;

    public ImageSearchUploadLayoutBinding(Object object, View view, int n3, TextView textView, TextView textView2, ImageView imageView, ConstraintLayout constraintLayout) {
        super(object, view, n3);
        this.idImageSearchSubText = textView;
        this.idImageSearchTitle = textView2;
        this.ivSearchImage = imageView;
        this.layoutParentImageSearch = constraintLayout;
    }

    public static ImageSearchUploadLayoutBinding bind(View view) {
        return ImageSearchUploadLayoutBinding.bind(view, null);
    }

    public static ImageSearchUploadLayoutBinding bind(View view, Object object) {
        int n3 = R$layout.image_search_upload_layout;
        return (ImageSearchUploadLayoutBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static ImageSearchUploadLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ImageSearchUploadLayoutBinding.inflate(layoutInflater, null);
    }

    public static ImageSearchUploadLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return ImageSearchUploadLayoutBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static ImageSearchUploadLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.image_search_upload_layout;
        return (ImageSearchUploadLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static ImageSearchUploadLayoutBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.image_search_upload_layout;
        return (ImageSearchUploadLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

