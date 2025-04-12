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

public final class RowCartQualityAssuredBinding
implements BC3 {
    public final TextView qaText;
    private final TextView rootView;

    private RowCartQualityAssuredBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.qaText = textView2;
    }

    public static RowCartQualityAssuredBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            RowCartQualityAssuredBinding rowCartQualityAssuredBinding = new RowCartQualityAssuredBinding((TextView)object, (TextView)object);
            return rowCartQualityAssuredBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowCartQualityAssuredBinding inflate(LayoutInflater layoutInflater) {
        return RowCartQualityAssuredBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartQualityAssuredBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_quality_assured;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartQualityAssuredBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

