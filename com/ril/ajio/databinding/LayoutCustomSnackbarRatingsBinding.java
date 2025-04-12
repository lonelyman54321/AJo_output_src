/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.FeedbackRatingSnackbarView;

public final class LayoutCustomSnackbarRatingsBinding
implements BC3 {
    private final FeedbackRatingSnackbarView rootView;

    private LayoutCustomSnackbarRatingsBinding(FeedbackRatingSnackbarView feedbackRatingSnackbarView) {
        this.rootView = feedbackRatingSnackbarView;
    }

    public static LayoutCustomSnackbarRatingsBinding bind(View object) {
        if (object != null) {
            object = (FeedbackRatingSnackbarView)object;
            LayoutCustomSnackbarRatingsBinding layoutCustomSnackbarRatingsBinding = new LayoutCustomSnackbarRatingsBinding((FeedbackRatingSnackbarView)object);
            return layoutCustomSnackbarRatingsBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutCustomSnackbarRatingsBinding inflate(LayoutInflater layoutInflater) {
        return LayoutCustomSnackbarRatingsBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutCustomSnackbarRatingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_custom_snackbar_ratings;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutCustomSnackbarRatingsBinding.bind((View)layoutInflater);
    }

    public FeedbackRatingSnackbarView getRoot() {
        return this.rootView;
    }
}

