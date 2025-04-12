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

public final class ReviewImageRowBinding
implements BC3 {
    public final ImageView ivReview;
    public final ConstraintLayout layoutParentReviewImage;
    private final ConstraintLayout rootView;

    private ReviewImageRowBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.ivReview = imageView;
        this.layoutParentReviewImage = constraintLayout2;
    }

    public static ReviewImageRowBinding bind(View object) {
        int n3 = R$id.iv_review;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (ConstraintLayout)((Object)object);
            ReviewImageRowBinding reviewImageRowBinding = new ReviewImageRowBinding((ConstraintLayout)((Object)object), imageView, (ConstraintLayout)((Object)object));
            return reviewImageRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReviewImageRowBinding inflate(LayoutInflater layoutInflater) {
        return ReviewImageRowBinding.inflate(layoutInflater, null, false);
    }

    public static ReviewImageRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.review_image_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReviewImageRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

