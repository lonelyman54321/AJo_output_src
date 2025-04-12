/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ProgressViewLayoutBinding
implements BC3 {
    public final ImageView ajioProgressImv;
    public final AjioTextView ajioProgressTv;
    private final FrameLayout rootView;

    private ProgressViewLayoutBinding(FrameLayout frameLayout, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = frameLayout;
        this.ajioProgressImv = imageView;
        this.ajioProgressTv = ajioTextView;
    }

    public static ProgressViewLayoutBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.ajio_progress_imv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.ajio_progress_tv, object)) != null) {
            object = (FrameLayout)object;
            ProgressViewLayoutBinding progressViewLayoutBinding = new ProgressViewLayoutBinding((FrameLayout)object, imageView, ajioTextView);
            return progressViewLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ProgressViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ProgressViewLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ProgressViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.progress_view_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ProgressViewLayoutBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

