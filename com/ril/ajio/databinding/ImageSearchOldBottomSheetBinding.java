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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class ImageSearchOldBottomSheetBinding
extends ViewDataBinding {
    public final AppCompatImageView idImageSearchCloseDialog;
    public final TextView idImageSearchSubText;
    public final TextView idImageSearchTitle;
    public final LinearLayout layoutClickPhoto;
    public final ImageView layoutClickPhotoImg;
    public final TextView layoutClickPhotoTitle;
    public final ConstraintLayout layoutParentImageSearch;
    public final LinearLayout layoutUploadPhoto;
    public final ImageView layoutUploadPhotoImg;
    public final TextView layoutUploadPhotoTitle;

    public ImageSearchOldBottomSheetBinding(Object object, View view, int n3, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, LinearLayout linearLayout, ImageView imageView, TextView textView3, ConstraintLayout constraintLayout, LinearLayout linearLayout2, ImageView imageView2, TextView textView4) {
        super(object, view, n3);
        this.idImageSearchCloseDialog = appCompatImageView;
        this.idImageSearchSubText = textView;
        this.idImageSearchTitle = textView2;
        this.layoutClickPhoto = linearLayout;
        this.layoutClickPhotoImg = imageView;
        this.layoutClickPhotoTitle = textView3;
        this.layoutParentImageSearch = constraintLayout;
        this.layoutUploadPhoto = linearLayout2;
        this.layoutUploadPhotoImg = imageView2;
        this.layoutUploadPhotoTitle = textView4;
    }

    public static ImageSearchOldBottomSheetBinding bind(View view) {
        return ImageSearchOldBottomSheetBinding.bind(view, null);
    }

    public static ImageSearchOldBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.image_search_old_bottom_sheet;
        return (ImageSearchOldBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static ImageSearchOldBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return ImageSearchOldBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static ImageSearchOldBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return ImageSearchOldBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static ImageSearchOldBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.image_search_old_bottom_sheet;
        return (ImageSearchOldBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static ImageSearchOldBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.image_search_old_bottom_sheet;
        return (ImageSearchOldBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

