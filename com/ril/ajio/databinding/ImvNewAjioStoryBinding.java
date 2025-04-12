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
import com.ril.ajio.R$layout;

public final class ImvNewAjioStoryBinding
implements BC3 {
    public final ImageView imvNewAjioStory;
    private final ImageView rootView;

    private ImvNewAjioStoryBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.imvNewAjioStory = imageView2;
    }

    public static ImvNewAjioStoryBinding bind(View object) {
        if (object != null) {
            object = (ImageView)object;
            ImvNewAjioStoryBinding imvNewAjioStoryBinding = new ImvNewAjioStoryBinding((ImageView)object, (ImageView)object);
            return imvNewAjioStoryBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ImvNewAjioStoryBinding inflate(LayoutInflater layoutInflater) {
        return ImvNewAjioStoryBinding.inflate(layoutInflater, null, false);
    }

    public static ImvNewAjioStoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.imv_new_ajio_story;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ImvNewAjioStoryBinding.bind((View)layoutInflater);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}

