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

public final class LayoutFsGenderImageBinding
implements BC3 {
    public final ImageView lfsgiIvImage;
    private final ConstraintLayout rootView;

    private LayoutFsGenderImageBinding(ConstraintLayout constraintLayout, ImageView imageView) {
        this.rootView = constraintLayout;
        this.lfsgiIvImage = imageView;
    }

    public static LayoutFsGenderImageBinding bind(View object) {
        int n3 = R$id.lfsgiIvImage;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutFsGenderImageBinding layoutFsGenderImageBinding = new LayoutFsGenderImageBinding((ConstraintLayout)((Object)object), imageView);
            return layoutFsGenderImageBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutFsGenderImageBinding inflate(LayoutInflater layoutInflater) {
        return LayoutFsGenderImageBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutFsGenderImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_fs_gender_image;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutFsGenderImageBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

