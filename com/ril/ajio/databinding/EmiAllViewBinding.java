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

public final class EmiAllViewBinding
implements BC3 {
    public final TextView emiAllTv;
    private final TextView rootView;

    private EmiAllViewBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.emiAllTv = textView2;
    }

    public static EmiAllViewBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            EmiAllViewBinding emiAllViewBinding = new EmiAllViewBinding((TextView)object, (TextView)object);
            return emiAllViewBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static EmiAllViewBinding inflate(LayoutInflater layoutInflater) {
        return EmiAllViewBinding.inflate(layoutInflater, null, false);
    }

    public static EmiAllViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.emi_all_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EmiAllViewBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

