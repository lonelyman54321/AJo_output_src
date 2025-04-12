/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class FilterApplyDiscardBottomSheetBinding
extends ViewDataBinding {
    public final AppCompatImageView idImageSearchCloseDialog;
    public final TextView idImageSearchSubText;
    public final TextView idImageSearchTitle;
    public final LinearLayout layoutApply;
    public final LinearLayout layoutDiscard;
    public final ConstraintLayout layoutParentImageSearch;
    public final ConstraintLayout mainLyt;

    public FilterApplyDiscardBottomSheetBinding(Object object, View view, int n3, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        super(object, view, n3);
        this.idImageSearchCloseDialog = appCompatImageView;
        this.idImageSearchSubText = textView;
        this.idImageSearchTitle = textView2;
        this.layoutApply = linearLayout;
        this.layoutDiscard = linearLayout2;
        this.layoutParentImageSearch = constraintLayout;
        this.mainLyt = constraintLayout2;
    }

    public static FilterApplyDiscardBottomSheetBinding bind(View view) {
        return FilterApplyDiscardBottomSheetBinding.bind(view, null);
    }

    public static FilterApplyDiscardBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.filter_apply_discard_bottom_sheet;
        return (FilterApplyDiscardBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static FilterApplyDiscardBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return FilterApplyDiscardBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static FilterApplyDiscardBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return FilterApplyDiscardBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static FilterApplyDiscardBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.filter_apply_discard_bottom_sheet;
        return (FilterApplyDiscardBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static FilterApplyDiscardBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.filter_apply_discard_bottom_sheet;
        return (FilterApplyDiscardBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

