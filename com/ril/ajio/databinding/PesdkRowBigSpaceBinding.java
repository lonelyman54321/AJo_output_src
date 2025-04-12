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

public final class PesdkRowBigSpaceBinding
implements BC3 {
    private final TextView rootView;

    private PesdkRowBigSpaceBinding(TextView textView) {
        this.rootView = textView;
    }

    public static PesdkRowBigSpaceBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            PesdkRowBigSpaceBinding pesdkRowBigSpaceBinding = new PesdkRowBigSpaceBinding((TextView)object);
            return pesdkRowBigSpaceBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PesdkRowBigSpaceBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRowBigSpaceBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRowBigSpaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_row_big_space;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRowBigSpaceBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

