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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class RowAwAjioGiftAmountCardBinding
extends ViewDataBinding {
    public final AppCompatTextView tvGiftAmount;

    public RowAwAjioGiftAmountCardBinding(Object object, View view, int n3, AppCompatTextView appCompatTextView) {
        super(object, view, n3);
        this.tvGiftAmount = appCompatTextView;
    }

    public static RowAwAjioGiftAmountCardBinding bind(View view) {
        return RowAwAjioGiftAmountCardBinding.bind(view, null);
    }

    public static RowAwAjioGiftAmountCardBinding bind(View view, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_amount_card;
        return (RowAwAjioGiftAmountCardBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RowAwAjioGiftAmountCardBinding inflate(LayoutInflater layoutInflater) {
        return RowAwAjioGiftAmountCardBinding.inflate(layoutInflater, null);
    }

    public static RowAwAjioGiftAmountCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RowAwAjioGiftAmountCardBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RowAwAjioGiftAmountCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_amount_card;
        return (RowAwAjioGiftAmountCardBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RowAwAjioGiftAmountCardBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_amount_card;
        return (RowAwAjioGiftAmountCardBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

