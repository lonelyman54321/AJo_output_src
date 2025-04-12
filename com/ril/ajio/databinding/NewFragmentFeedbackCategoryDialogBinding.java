/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class NewFragmentFeedbackCategoryDialogBinding
implements BC3 {
    public final AppCompatImageButton closeDialog;
    private final LinearLayout rootView;
    public final RecyclerView rvFeedbackCategories;

    private NewFragmentFeedbackCategoryDialogBinding(LinearLayout linearLayout, AppCompatImageButton appCompatImageButton, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.closeDialog = appCompatImageButton;
        this.rvFeedbackCategories = recyclerView;
    }

    public static NewFragmentFeedbackCategoryDialogBinding bind(View object) {
        RecyclerView recyclerView;
        int n3 = R$id.close_dialog;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton)dd2_2.a(n3, object);
        if (appCompatImageButton != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.rv_feedback_categories, object)) != null) {
            object = (LinearLayout)object;
            NewFragmentFeedbackCategoryDialogBinding newFragmentFeedbackCategoryDialogBinding = new NewFragmentFeedbackCategoryDialogBinding((LinearLayout)object, appCompatImageButton, recyclerView);
            return newFragmentFeedbackCategoryDialogBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewFragmentFeedbackCategoryDialogBinding inflate(LayoutInflater layoutInflater) {
        return NewFragmentFeedbackCategoryDialogBinding.inflate(layoutInflater, null, false);
    }

    public static NewFragmentFeedbackCategoryDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_fragment_feedback_category_dialog;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewFragmentFeedbackCategoryDialogBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

