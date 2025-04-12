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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewFeedbackCategoriesListFooterBinding
implements BC3 {
    private final AjioTextView rootView;
    public final AjioTextView tvFeedbackCategoryFooter;

    private NewFeedbackCategoriesListFooterBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.tvFeedbackCategoryFooter = ajioTextView2;
    }

    public static NewFeedbackCategoriesListFooterBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            NewFeedbackCategoriesListFooterBinding newFeedbackCategoriesListFooterBinding = new NewFeedbackCategoriesListFooterBinding((AjioTextView)object, (AjioTextView)object);
            return newFeedbackCategoriesListFooterBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static NewFeedbackCategoriesListFooterBinding inflate(LayoutInflater layoutInflater) {
        return NewFeedbackCategoriesListFooterBinding.inflate(layoutInflater, null, false);
    }

    public static NewFeedbackCategoriesListFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_feedback_categories_list_footer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewFeedbackCategoriesListFooterBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

