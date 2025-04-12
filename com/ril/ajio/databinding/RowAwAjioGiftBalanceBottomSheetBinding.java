/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class RowAwAjioGiftBalanceBottomSheetBinding
extends ViewDataBinding {
    public final TextView agAddToWallet;
    public final ConstraintLayout agCardConstraintLayout;
    public final AppCompatTextView agDialogTitle;
    public final TextView agErrorMessage;
    public final AppCompatTextView agGiftCardBalance;
    public final AppCompatTextView agGiftCardExpireDate;
    public final ProgressBar agGiftCardProgressBar;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout dlprLayoutContent;

    public RowAwAjioGiftBalanceBottomSheetBinding(Object object, View view, int n3, TextView textView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, TextView textView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, ProgressBar progressBar, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2) {
        super(object, view, n3);
        this.agAddToWallet = textView;
        this.agCardConstraintLayout = constraintLayout;
        this.agDialogTitle = appCompatTextView;
        this.agErrorMessage = textView2;
        this.agGiftCardBalance = appCompatTextView2;
        this.agGiftCardExpireDate = appCompatTextView3;
        this.agGiftCardProgressBar = progressBar;
        this.closeDialog = appCompatImageView;
        this.dlprLayoutContent = constraintLayout2;
    }

    public static RowAwAjioGiftBalanceBottomSheetBinding bind(View view) {
        return RowAwAjioGiftBalanceBottomSheetBinding.bind(view, null);
    }

    public static RowAwAjioGiftBalanceBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_balance_bottom_sheet;
        return (RowAwAjioGiftBalanceBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RowAwAjioGiftBalanceBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return RowAwAjioGiftBalanceBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static RowAwAjioGiftBalanceBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RowAwAjioGiftBalanceBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RowAwAjioGiftBalanceBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_balance_bottom_sheet;
        return (RowAwAjioGiftBalanceBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RowAwAjioGiftBalanceBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_balance_bottom_sheet;
        return (RowAwAjioGiftBalanceBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

