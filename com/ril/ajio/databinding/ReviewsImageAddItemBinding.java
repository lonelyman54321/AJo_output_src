/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$layout;

public final class ReviewsImageAddItemBinding
implements BC3 {
    public final RelativeLayout reviewAddImageRoot;
    private final RelativeLayout rootView;

    private ReviewsImageAddItemBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.reviewAddImageRoot = relativeLayout2;
    }

    public static ReviewsImageAddItemBinding bind(View object) {
        if (object != null) {
            object = (RelativeLayout)object;
            ReviewsImageAddItemBinding reviewsImageAddItemBinding = new ReviewsImageAddItemBinding((RelativeLayout)object, (RelativeLayout)object);
            return reviewsImageAddItemBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ReviewsImageAddItemBinding inflate(LayoutInflater layoutInflater) {
        return ReviewsImageAddItemBinding.inflate(layoutInflater, null, false);
    }

    public static ReviewsImageAddItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.reviews_image_add_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReviewsImageAddItemBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

