/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class CancelRequestBottomSheetBinding
extends ViewDataBinding {
    public final ConstraintLayout dlprLayoutContent;
    public final Guideline guideline;
    public final TextView idCancelRequestText;
    public final TextView idNoButton;
    public final TextView idYesButton;

    public CancelRequestBottomSheetBinding(Object object, View view, int n3, ConstraintLayout constraintLayout, Guideline guideline, TextView textView, TextView textView2, TextView textView3) {
        super(object, view, n3);
        this.dlprLayoutContent = constraintLayout;
        this.guideline = guideline;
        this.idCancelRequestText = textView;
        this.idNoButton = textView2;
        this.idYesButton = textView3;
    }

    public static CancelRequestBottomSheetBinding bind(View view) {
        return CancelRequestBottomSheetBinding.bind(view, null);
    }

    public static CancelRequestBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.cancel_request_bottom_sheet;
        return (CancelRequestBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static CancelRequestBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return CancelRequestBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static CancelRequestBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return CancelRequestBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static CancelRequestBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.cancel_request_bottom_sheet;
        return (CancelRequestBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static CancelRequestBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.cancel_request_bottom_sheet;
        return (CancelRequestBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

