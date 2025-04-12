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

public final class RowCartVariableSizeLuxeBinding
implements BC3 {
    private final TextView rootView;
    public final TextView rowCartVariableSizeTv;

    private RowCartVariableSizeLuxeBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.rowCartVariableSizeTv = textView2;
    }

    public static RowCartVariableSizeLuxeBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            RowCartVariableSizeLuxeBinding rowCartVariableSizeLuxeBinding = new RowCartVariableSizeLuxeBinding((TextView)object, (TextView)object);
            return rowCartVariableSizeLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowCartVariableSizeLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowCartVariableSizeLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartVariableSizeLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_variable_size_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartVariableSizeLuxeBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

