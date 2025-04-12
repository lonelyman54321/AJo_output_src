/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewRowFeedbackCategoriesListBinding
implements BC3 {
    public final AjioTextView feedbackCategoryName;
    public final ImageView ivAjioChevronRightAccount;
    private final RelativeLayout rootView;

    private NewRowFeedbackCategoriesListBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, ImageView imageView) {
        this.rootView = relativeLayout;
        this.feedbackCategoryName = ajioTextView;
        this.ivAjioChevronRightAccount = imageView;
    }

    public static NewRowFeedbackCategoriesListBinding bind(View object) {
        ImageView imageView;
        int n3 = R$id.feedback_category_name;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.iv_ajio_chevron_right_account, object)) != null) {
            object = (RelativeLayout)object;
            NewRowFeedbackCategoriesListBinding newRowFeedbackCategoriesListBinding = new NewRowFeedbackCategoriesListBinding((RelativeLayout)object, ajioTextView, imageView);
            return newRowFeedbackCategoriesListBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewRowFeedbackCategoriesListBinding inflate(LayoutInflater layoutInflater) {
        return NewRowFeedbackCategoriesListBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowFeedbackCategoriesListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_feedback_categories_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowFeedbackCategoriesListBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

