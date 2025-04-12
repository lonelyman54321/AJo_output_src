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

public final class CustomRevampToastBinding
implements BC3 {
    private final AjioTextView rootView;
    public final AjioTextView toastText;

    private CustomRevampToastBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.toastText = ajioTextView2;
    }

    public static CustomRevampToastBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            CustomRevampToastBinding customRevampToastBinding = new CustomRevampToastBinding((AjioTextView)object, (AjioTextView)object);
            return customRevampToastBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CustomRevampToastBinding inflate(LayoutInflater layoutInflater) {
        return CustomRevampToastBinding.inflate(layoutInflater, null, false);
    }

    public static CustomRevampToastBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.custom_revamp_toast;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CustomRevampToastBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

