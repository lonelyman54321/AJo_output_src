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

public final class AppliedFiltersClearLayoutBinding
implements BC3 {
    public final TextView clearAllAppliedFiltersBtn;
    private final TextView rootView;

    private AppliedFiltersClearLayoutBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.clearAllAppliedFiltersBtn = textView2;
    }

    public static AppliedFiltersClearLayoutBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            AppliedFiltersClearLayoutBinding appliedFiltersClearLayoutBinding = new AppliedFiltersClearLayoutBinding((TextView)object, (TextView)object);
            return appliedFiltersClearLayoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static AppliedFiltersClearLayoutBinding inflate(LayoutInflater layoutInflater) {
        return AppliedFiltersClearLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static AppliedFiltersClearLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.applied_filters_clear_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AppliedFiltersClearLayoutBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

