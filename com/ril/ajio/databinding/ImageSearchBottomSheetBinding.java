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

public abstract class ImageSearchBottomSheetBinding
extends ViewDataBinding {
    public final AppCompatImageView idImageSearchCloseDialog;
    public final TextView idImageSearchTitle;
    public final ImageView imageView2;
    public final TextView imgHeading;
    public final TextView imgHeading2;
    public final LinearLayout layoutClickPhoto;
    public final ConstraintLayout layoutParentImageSearch;
    public final LinearLayout layoutUploadPhoto;
    public final View viewTop;

    public ImageSearchBottomSheetBinding(Object object, View view, int n3, AppCompatImageView appCompatImageView, TextView textView, ImageView imageView, TextView textView2, TextView textView3, LinearLayout linearLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout2, View view2) {
        super(object, view, n3);
        this.idImageSearchCloseDialog = appCompatImageView;
        this.idImageSearchTitle = textView;
        this.imageView2 = imageView;
        this.imgHeading = textView2;
        this.imgHeading2 = textView3;
        this.layoutClickPhoto = linearLayout;
        this.layoutParentImageSearch = constraintLayout;
        this.layoutUploadPhoto = linearLayout2;
        this.viewTop = view2;
    }

    public static ImageSearchBottomSheetBinding bind(View view) {
        return ImageSearchBottomSheetBinding.bind(view, null);
    }

    public static ImageSearchBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.image_search_bottom_sheet;
        return (ImageSearchBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static ImageSearchBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return ImageSearchBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static ImageSearchBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return ImageSearchBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static ImageSearchBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.image_search_bottom_sheet;
        return (ImageSearchBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static ImageSearchBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.image_search_bottom_sheet;
        return (ImageSearchBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

