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

public final class PesdkLuxRowSpaceBinding
implements BC3 {
    private final TextView rootView;

    private PesdkLuxRowSpaceBinding(TextView textView) {
        this.rootView = textView;
    }

    public static PesdkLuxRowSpaceBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            PesdkLuxRowSpaceBinding pesdkLuxRowSpaceBinding = new PesdkLuxRowSpaceBinding((TextView)object);
            return pesdkLuxRowSpaceBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PesdkLuxRowSpaceBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxRowSpaceBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxRowSpaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_row_space;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxRowSpaceBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

