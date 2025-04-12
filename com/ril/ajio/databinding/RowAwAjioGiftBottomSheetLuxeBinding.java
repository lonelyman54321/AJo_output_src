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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$layout;

public abstract class RowAwAjioGiftBottomSheetLuxeBinding
extends ViewDataBinding {
    public final TextView agAddToWallet;
    public final TextInputEditText agCardNumberEditText;
    public final TextInputLayout agCardNumberEditTextInput;
    public final TextView agDialogSubTitle;
    public final TextView agDialogTitle;
    public final TextView agErrorMessage;
    public final ProgressBar agGiftCardProgressBar;
    public final TextView agInvalidCardNumberError;
    public final TextView agInvalidPinNumberError;
    public final TextInputEditText agPinNumberEditText;
    public final TextInputLayout agPinNumberEditTextInput;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout dlprLayoutContent;
    public final ConstraintLayout parentLayout;

    public RowAwAjioGiftBottomSheetLuxeBinding(Object object, View view, int n3, TextView textView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView2, TextView textView3, TextView textView4, ProgressBar progressBar, TextView textView5, TextView textView6, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        super(object, view, n3);
        this.agAddToWallet = textView;
        this.agCardNumberEditText = textInputEditText;
        this.agCardNumberEditTextInput = textInputLayout;
        this.agDialogSubTitle = textView2;
        this.agDialogTitle = textView3;
        this.agErrorMessage = textView4;
        this.agGiftCardProgressBar = progressBar;
        this.agInvalidCardNumberError = textView5;
        this.agInvalidPinNumberError = textView6;
        this.agPinNumberEditText = textInputEditText2;
        this.agPinNumberEditTextInput = textInputLayout2;
        this.closeDialog = appCompatImageView;
        this.dlprLayoutContent = constraintLayout;
        this.parentLayout = constraintLayout2;
    }

    public static RowAwAjioGiftBottomSheetLuxeBinding bind(View view) {
        return RowAwAjioGiftBottomSheetLuxeBinding.bind(view, null);
    }

    public static RowAwAjioGiftBottomSheetLuxeBinding bind(View view, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_bottom_sheet_luxe;
        return (RowAwAjioGiftBottomSheetLuxeBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RowAwAjioGiftBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowAwAjioGiftBottomSheetLuxeBinding.inflate(layoutInflater, null);
    }

    public static RowAwAjioGiftBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RowAwAjioGiftBottomSheetLuxeBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RowAwAjioGiftBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_bottom_sheet_luxe;
        return (RowAwAjioGiftBottomSheetLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RowAwAjioGiftBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_bottom_sheet_luxe;
        return (RowAwAjioGiftBottomSheetLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

