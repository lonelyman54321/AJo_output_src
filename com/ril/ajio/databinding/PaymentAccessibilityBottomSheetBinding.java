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
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;

public abstract class PaymentAccessibilityBottomSheetBinding
extends ViewDataBinding {
    public final TextView accBottomSheetTitle;
    public final ConstraintLayout accPaymentParentLayout;

    public PaymentAccessibilityBottomSheetBinding(Object object, View view, int n3, TextView textView, ConstraintLayout constraintLayout) {
        super(object, view, n3);
        this.accBottomSheetTitle = textView;
        this.accPaymentParentLayout = constraintLayout;
    }

    public static PaymentAccessibilityBottomSheetBinding bind(View view) {
        return PaymentAccessibilityBottomSheetBinding.bind(view, null);
    }

    public static PaymentAccessibilityBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.payment_accessibility_bottom_sheet;
        return (PaymentAccessibilityBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static PaymentAccessibilityBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return PaymentAccessibilityBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static PaymentAccessibilityBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return PaymentAccessibilityBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static PaymentAccessibilityBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.payment_accessibility_bottom_sheet;
        return (PaymentAccessibilityBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static PaymentAccessibilityBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.payment_accessibility_bottom_sheet;
        return (PaymentAccessibilityBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

