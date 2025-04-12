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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class RowAwAjioGiftSuccessBottomSheetBinding
extends ViewDataBinding {
    public final AppCompatTextView agSuccessExpiresDate;
    public final AppCompatImageView agSuccessIcon;
    public final AppCompatTextView agSuccessRedeemAmount;
    public final AppCompatTextView agSuccessSubTitle;
    public final AppCompatTextView agSuccessTitle;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout dlprLayoutContent;

    public RowAwAjioGiftSuccessBottomSheetBinding(Object object, View view, int n3, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout) {
        super(object, view, n3);
        this.agSuccessExpiresDate = appCompatTextView;
        this.agSuccessIcon = appCompatImageView;
        this.agSuccessRedeemAmount = appCompatTextView2;
        this.agSuccessSubTitle = appCompatTextView3;
        this.agSuccessTitle = appCompatTextView4;
        this.closeDialog = appCompatImageView2;
        this.dlprLayoutContent = constraintLayout;
    }

    public static RowAwAjioGiftSuccessBottomSheetBinding bind(View view) {
        return RowAwAjioGiftSuccessBottomSheetBinding.bind(view, null);
    }

    public static RowAwAjioGiftSuccessBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_success_bottom_sheet;
        return (RowAwAjioGiftSuccessBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RowAwAjioGiftSuccessBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return RowAwAjioGiftSuccessBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static RowAwAjioGiftSuccessBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RowAwAjioGiftSuccessBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RowAwAjioGiftSuccessBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_success_bottom_sheet;
        return (RowAwAjioGiftSuccessBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RowAwAjioGiftSuccessBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_success_bottom_sheet;
        return (RowAwAjioGiftSuccessBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

