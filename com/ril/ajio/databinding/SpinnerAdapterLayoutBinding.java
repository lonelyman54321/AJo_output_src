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

public final class SpinnerAdapterLayoutBinding
implements BC3 {
    private final AjioTextView rootView;

    private SpinnerAdapterLayoutBinding(AjioTextView ajioTextView) {
        this.rootView = ajioTextView;
    }

    public static SpinnerAdapterLayoutBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            SpinnerAdapterLayoutBinding spinnerAdapterLayoutBinding = new SpinnerAdapterLayoutBinding((AjioTextView)object);
            return spinnerAdapterLayoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static SpinnerAdapterLayoutBinding inflate(LayoutInflater layoutInflater) {
        return SpinnerAdapterLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static SpinnerAdapterLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.spinner_adapter_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SpinnerAdapterLayoutBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

