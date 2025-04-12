/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.simpleCropView.CropImageView;

public final class FragmentImageCropperBinding
implements BC3 {
    public final ImageView backImg;
    public final ImageView cancel;
    public final ImageView centerImage;
    public final CropImageView cropImageView;
    public final ImageView fitToFull;
    public final ConstraintLayout layoutRoot;
    private final ConstraintLayout rootView;

    private FragmentImageCropperBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, CropImageView cropImageView, ImageView imageView4, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.backImg = imageView;
        this.cancel = imageView2;
        this.centerImage = imageView3;
        this.cropImageView = cropImageView;
        this.fitToFull = imageView4;
        this.layoutRoot = constraintLayout2;
    }

    public static FragmentImageCropperBinding bind(View object) {
        View view;
        int n3 = R$id.backImg;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancel;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.centerImage;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.cropImageView;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (CropImageView)view;
                    if (object2 != null) {
                        n3 = R$id.fitToFull;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (ImageView)view;
                        if (view5 != null) {
                            Object object3 = object;
                            object3 = (ConstraintLayout)((Object)object);
                            object = new FragmentImageCropperBinding((ConstraintLayout)((Object)object3), (ImageView)view2, (ImageView)view3, (ImageView)view4, (CropImageView)((Object)object2), (ImageView)view5, (ConstraintLayout)((Object)object3));
                            return object;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentImageCropperBinding inflate(LayoutInflater layoutInflater) {
        return FragmentImageCropperBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentImageCropperBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_image_cropper;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentImageCropperBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

