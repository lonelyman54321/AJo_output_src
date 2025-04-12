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

public final class LayoutFsTextBinding
implements BC3 {
    public final TextView lfstTvText;
    private final TextView rootView;

    private LayoutFsTextBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.lfstTvText = textView2;
    }

    public static LayoutFsTextBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            LayoutFsTextBinding layoutFsTextBinding = new LayoutFsTextBinding((TextView)object, (TextView)object);
            return layoutFsTextBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutFsTextBinding inflate(LayoutInflater layoutInflater) {
        return LayoutFsTextBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutFsTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_fs_text;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutFsTextBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

