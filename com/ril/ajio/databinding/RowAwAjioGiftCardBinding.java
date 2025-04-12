/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class RowAwAjioGiftCardBinding
extends ViewDataBinding {
    public final TextView agAddTv;
    public final TextView agBalanceTv;
    public final ImageView agCashIv;
    public final TextView agCashTv;
    public final TextView agInfoTv;
    public final TextView agTeamsCondition;

    public RowAwAjioGiftCardBinding(Object object, View view, int n3, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5) {
        super(object, view, n3);
        this.agAddTv = textView;
        this.agBalanceTv = textView2;
        this.agCashIv = imageView;
        this.agCashTv = textView3;
        this.agInfoTv = textView4;
        this.agTeamsCondition = textView5;
    }

    public static RowAwAjioGiftCardBinding bind(View view) {
        return RowAwAjioGiftCardBinding.bind(view, null);
    }

    public static RowAwAjioGiftCardBinding bind(View view, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_card;
        return (RowAwAjioGiftCardBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RowAwAjioGiftCardBinding inflate(LayoutInflater layoutInflater) {
        return RowAwAjioGiftCardBinding.inflate(layoutInflater, null);
    }

    public static RowAwAjioGiftCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RowAwAjioGiftCardBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RowAwAjioGiftCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_card;
        return (RowAwAjioGiftCardBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RowAwAjioGiftCardBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.row_aw_ajio_gift_card;
        return (RowAwAjioGiftCardBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

