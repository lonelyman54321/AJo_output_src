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
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public abstract class CodFeeAjioLayoutBinding
extends ViewDataBinding {
    public final AjioTextView idAmountPayable;
    public final AjioTextView idCashOnDeliveryFee;
    public final AjioTextView idCashOnDeliveryFeeFree;
    public final AjioTextView idCashOnDeliveryFeeStrike;
    public final TextView idCodChooseOtherPaymode;
    public final AppCompatImageView idCodCloseDialog;
    public final TextView idCodConfirmOrder;
    public final TextView idCodSubText;
    public final TextView idCodTitle;
    public final TextView idItemTotal;
    public final LinearLayout idLayout1;
    public final LinearLayout idLayout2;
    public final LinearLayout idLayout3;

    public CodFeeAjioLayoutBinding(Object object, View view, int n3, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        super(object, view, n3);
        this.idAmountPayable = ajioTextView;
        this.idCashOnDeliveryFee = ajioTextView2;
        this.idCashOnDeliveryFeeFree = ajioTextView3;
        this.idCashOnDeliveryFeeStrike = ajioTextView4;
        this.idCodChooseOtherPaymode = textView;
        this.idCodCloseDialog = appCompatImageView;
        this.idCodConfirmOrder = textView2;
        this.idCodSubText = textView3;
        this.idCodTitle = textView4;
        this.idItemTotal = textView5;
        this.idLayout1 = linearLayout;
        this.idLayout2 = linearLayout2;
        this.idLayout3 = linearLayout3;
    }

    public static CodFeeAjioLayoutBinding bind(View view) {
        return CodFeeAjioLayoutBinding.bind(view, null);
    }

    public static CodFeeAjioLayoutBinding bind(View view, Object object) {
        int n3 = R$layout.cod_fee_ajio_layout;
        return (CodFeeAjioLayoutBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static CodFeeAjioLayoutBinding inflate(LayoutInflater layoutInflater) {
        return CodFeeAjioLayoutBinding.inflate(layoutInflater, null);
    }

    public static CodFeeAjioLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return CodFeeAjioLayoutBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static CodFeeAjioLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.cod_fee_ajio_layout;
        return (CodFeeAjioLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static CodFeeAjioLayoutBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.cod_fee_ajio_layout;
        return (CodFeeAjioLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

