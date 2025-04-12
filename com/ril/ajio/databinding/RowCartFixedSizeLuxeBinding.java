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

public final class RowCartFixedSizeLuxeBinding
implements BC3 {
    private final TextView rootView;
    public final TextView rowCartFixedSizeTv;

    private RowCartFixedSizeLuxeBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.rowCartFixedSizeTv = textView2;
    }

    public static RowCartFixedSizeLuxeBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            RowCartFixedSizeLuxeBinding rowCartFixedSizeLuxeBinding = new RowCartFixedSizeLuxeBinding((TextView)object, (TextView)object);
            return rowCartFixedSizeLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowCartFixedSizeLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowCartFixedSizeLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartFixedSizeLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_fixed_size_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartFixedSizeLuxeBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

