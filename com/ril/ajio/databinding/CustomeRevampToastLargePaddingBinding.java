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
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CustomeRevampToastLargePaddingBinding
implements BC3 {
    private final AjioTextView rootView;
    public final AjioTextView toastText;

    private CustomeRevampToastLargePaddingBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.toastText = ajioTextView2;
    }

    public static CustomeRevampToastLargePaddingBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            CustomeRevampToastLargePaddingBinding customeRevampToastLargePaddingBinding = new CustomeRevampToastLargePaddingBinding((AjioTextView)object, (AjioTextView)object);
            return customeRevampToastLargePaddingBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CustomeRevampToastLargePaddingBinding inflate(LayoutInflater layoutInflater) {
        return CustomeRevampToastLargePaddingBinding.inflate(layoutInflater, null, false);
    }

    public static CustomeRevampToastLargePaddingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.custome_revamp_toast_large_padding;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CustomeRevampToastLargePaddingBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

