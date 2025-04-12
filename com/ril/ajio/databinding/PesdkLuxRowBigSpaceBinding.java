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

public final class PesdkLuxRowBigSpaceBinding
implements BC3 {
    private final TextView rootView;

    private PesdkLuxRowBigSpaceBinding(TextView textView) {
        this.rootView = textView;
    }

    public static PesdkLuxRowBigSpaceBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            PesdkLuxRowBigSpaceBinding pesdkLuxRowBigSpaceBinding = new PesdkLuxRowBigSpaceBinding((TextView)object);
            return pesdkLuxRowBigSpaceBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PesdkLuxRowBigSpaceBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxRowBigSpaceBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxRowBigSpaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_row_big_space;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxRowBigSpaceBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

