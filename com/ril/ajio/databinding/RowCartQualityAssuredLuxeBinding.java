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

public final class RowCartQualityAssuredLuxeBinding
implements BC3 {
    public final TextView qaText;
    private final TextView rootView;

    private RowCartQualityAssuredLuxeBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.qaText = textView2;
    }

    public static RowCartQualityAssuredLuxeBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            RowCartQualityAssuredLuxeBinding rowCartQualityAssuredLuxeBinding = new RowCartQualityAssuredLuxeBinding((TextView)object, (TextView)object);
            return rowCartQualityAssuredLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowCartQualityAssuredLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowCartQualityAssuredLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartQualityAssuredLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_quality_assured_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartQualityAssuredLuxeBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

