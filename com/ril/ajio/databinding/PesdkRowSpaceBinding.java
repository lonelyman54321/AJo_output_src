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

public final class PesdkRowSpaceBinding
implements BC3 {
    private final TextView rootView;

    private PesdkRowSpaceBinding(TextView textView) {
        this.rootView = textView;
    }

    public static PesdkRowSpaceBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            PesdkRowSpaceBinding pesdkRowSpaceBinding = new PesdkRowSpaceBinding((TextView)object);
            return pesdkRowSpaceBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PesdkRowSpaceBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRowSpaceBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRowSpaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_row_space;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRowSpaceBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

