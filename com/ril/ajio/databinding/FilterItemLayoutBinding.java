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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FilterItemLayoutBinding
implements BC3 {
    public final AppCompatTextView filterItem;
    public final AppCompatImageButton removeFilterBtn;
    private final ConstraintLayout rootView;

    private FilterItemLayoutBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageButton appCompatImageButton) {
        this.rootView = constraintLayout;
        this.filterItem = appCompatTextView;
        this.removeFilterBtn = appCompatImageButton;
    }

    public static FilterItemLayoutBinding bind(View object) {
        AppCompatImageButton appCompatImageButton;
        int n3 = R$id.filterItem;
        AppCompatTextView appCompatTextView = (AppCompatTextView)dd2_2.a(n3, object);
        if (appCompatTextView != null && (appCompatImageButton = (AppCompatImageButton)dd2_2.a(n3 = R$id.removeFilterBtn, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            FilterItemLayoutBinding filterItemLayoutBinding = new FilterItemLayoutBinding((ConstraintLayout)((Object)object), appCompatTextView, appCompatImageButton);
            return filterItemLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FilterItemLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FilterItemLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FilterItemLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.filter_item_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FilterItemLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

