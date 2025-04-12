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

public final class AppliedFilterSizeExceedLayoutBinding
implements BC3 {
    public final TextView moreAppliedFilterButton;
    private final TextView rootView;

    private AppliedFilterSizeExceedLayoutBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.moreAppliedFilterButton = textView2;
    }

    public static AppliedFilterSizeExceedLayoutBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            AppliedFilterSizeExceedLayoutBinding appliedFilterSizeExceedLayoutBinding = new AppliedFilterSizeExceedLayoutBinding((TextView)object, (TextView)object);
            return appliedFilterSizeExceedLayoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static AppliedFilterSizeExceedLayoutBinding inflate(LayoutInflater layoutInflater) {
        return AppliedFilterSizeExceedLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static AppliedFilterSizeExceedLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.applied_filter_size_exceed_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AppliedFilterSizeExceedLayoutBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

