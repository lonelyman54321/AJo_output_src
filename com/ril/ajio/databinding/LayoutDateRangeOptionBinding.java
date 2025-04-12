/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RadioButton
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.ril.ajio.R$layout;

public final class LayoutDateRangeOptionBinding
implements BC3 {
    private final RadioButton rootView;

    private LayoutDateRangeOptionBinding(RadioButton radioButton) {
        this.rootView = radioButton;
    }

    public static LayoutDateRangeOptionBinding bind(View object) {
        if (object != null) {
            object = (RadioButton)object;
            LayoutDateRangeOptionBinding layoutDateRangeOptionBinding = new LayoutDateRangeOptionBinding((RadioButton)object);
            return layoutDateRangeOptionBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutDateRangeOptionBinding inflate(LayoutInflater layoutInflater) {
        return LayoutDateRangeOptionBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutDateRangeOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_date_range_option;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutDateRangeOptionBinding.bind((View)layoutInflater);
    }

    public RadioButton getRoot() {
        return this.rootView;
    }
}

