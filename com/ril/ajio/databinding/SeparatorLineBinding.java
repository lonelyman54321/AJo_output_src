/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.R$layout;

public final class SeparatorLineBinding
implements BC3 {
    private final View rootView;
    public final View seperatorLine;

    private SeparatorLineBinding(View view, View view2) {
        this.rootView = view;
        this.seperatorLine = view2;
    }

    public static SeparatorLineBinding bind(View object) {
        if (object != null) {
            SeparatorLineBinding separatorLineBinding = new SeparatorLineBinding((View)object, (View)object);
            return separatorLineBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static SeparatorLineBinding inflate(LayoutInflater layoutInflater) {
        return SeparatorLineBinding.inflate(layoutInflater, null, false);
    }

    public static SeparatorLineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.separator_line;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SeparatorLineBinding.bind((View)layoutInflater);
    }

    public View getRoot() {
        return this.rootView;
    }
}

