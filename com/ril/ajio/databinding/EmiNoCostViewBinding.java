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
import com.ril.ajio.R$layout;

public final class EmiNoCostViewBinding
implements BC3 {
    public final TextView emiAllTv;
    private final TextView rootView;

    private EmiNoCostViewBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.emiAllTv = textView2;
    }

    public static EmiNoCostViewBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            EmiNoCostViewBinding emiNoCostViewBinding = new EmiNoCostViewBinding((TextView)object, (TextView)object);
            return emiNoCostViewBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static EmiNoCostViewBinding inflate(LayoutInflater layoutInflater) {
        return EmiNoCostViewBinding.inflate(layoutInflater, null, false);
    }

    public static EmiNoCostViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.emi_no_cost_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EmiNoCostViewBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

