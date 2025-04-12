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

public final class NewFeedbackCategoriesListHeaderBinding
implements BC3 {
    private final AjioTextView rootView;
    public final AjioTextView tvFeedbackCategoryHeader;

    private NewFeedbackCategoriesListHeaderBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.tvFeedbackCategoryHeader = ajioTextView2;
    }

    public static NewFeedbackCategoriesListHeaderBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            NewFeedbackCategoriesListHeaderBinding newFeedbackCategoriesListHeaderBinding = new NewFeedbackCategoriesListHeaderBinding((AjioTextView)object, (AjioTextView)object);
            return newFeedbackCategoriesListHeaderBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static NewFeedbackCategoriesListHeaderBinding inflate(LayoutInflater layoutInflater) {
        return NewFeedbackCategoriesListHeaderBinding.inflate(layoutInflater, null, false);
    }

    public static NewFeedbackCategoriesListHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_feedback_categories_list_header;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewFeedbackCategoriesListHeaderBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

