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

public final class LayoutContextTitleBinding
implements BC3 {
    private final TextView rootView;

    private LayoutContextTitleBinding(TextView textView) {
        this.rootView = textView;
    }

    public static LayoutContextTitleBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            LayoutContextTitleBinding layoutContextTitleBinding = new LayoutContextTitleBinding((TextView)object);
            return layoutContextTitleBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutContextTitleBinding inflate(LayoutInflater layoutInflater) {
        return LayoutContextTitleBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutContextTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_context_title;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutContextTitleBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

