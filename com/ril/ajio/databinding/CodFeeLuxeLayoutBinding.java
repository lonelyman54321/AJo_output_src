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

public abstract class CodFeeLuxeLayoutBinding
extends ViewDataBinding {
    public final AppCompatImageView closeDialog;
    public final AjioTextView idAmountPayable;
    public final AjioTextView idCashOnDeliveryFee;
    public final AjioTextView idCashOnDeliveryFeeFree;
    public final AjioTextView idCashOnDeliveryFeeStrike;
    public final TextView idCodChooseOtherPaymode;
    public final TextView idCodConfirmOrder;
    public final TextView idCodSubText;
    public final TextView idCodTitle;
    public final TextView idItemTotal;
    public final LinearLayout idLayout1;
    public final LinearLayout idLayout2;
    public final LinearLayout idLayout3;

    public CodFeeLuxeLayoutBinding(Object object, View view, int n3, AppCompatImageView appCompatImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        super(object, view, n3);
        this.closeDialog = appCompatImageView;
        this.idAmountPayable = ajioTextView;
        this.idCashOnDeliveryFee = ajioTextView2;
        this.idCashOnDeliveryFeeFree = ajioTextView3;
        this.idCashOnDeliveryFeeStrike = ajioTextView4;
        this.idCodChooseOtherPaymode = textView;
        this.idCodConfirmOrder = textView2;
        this.idCodSubText = textView3;
        this.idCodTitle = textView4;
        this.idItemTotal = textView5;
        this.idLayout1 = linearLayout;
        this.idLayout2 = linearLayout2;
        this.idLayout3 = linearLayout3;
    }

    public static CodFeeLuxeLayoutBinding bind(View view) {
        return CodFeeLuxeLayoutBinding.bind(view, null);
    }

    public static CodFeeLuxeLayoutBinding bind(View view, Object object) {
        int n3 = R$layout.cod_fee_luxe_layout;
        return (CodFeeLuxeLayoutBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static CodFeeLuxeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return CodFeeLuxeLayoutBinding.inflate(layoutInflater, null);
    }

    public static CodFeeLuxeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return CodFeeLuxeLayoutBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static CodFeeLuxeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.cod_fee_luxe_layout;
        return (CodFeeLuxeLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static CodFeeLuxeLayoutBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.cod_fee_luxe_layout;
        return (CodFeeLuxeLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

