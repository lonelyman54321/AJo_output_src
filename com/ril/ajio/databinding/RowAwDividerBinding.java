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

public final class RowAwDividerBinding
implements BC3 {
    public final View awDivider;
    private final View rootView;

    private RowAwDividerBinding(View view, View view2) {
        this.rootView = view;
        this.awDivider = view2;
    }

    public static RowAwDividerBinding bind(View object) {
        if (object != null) {
            RowAwDividerBinding rowAwDividerBinding = new RowAwDividerBinding((View)object, (View)object);
            return rowAwDividerBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowAwDividerBinding inflate(LayoutInflater layoutInflater) {
        return RowAwDividerBinding.inflate(layoutInflater, null, false);
    }

    public static RowAwDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_aw_divider;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAwDividerBinding.bind((View)layoutInflater);
    }

    public View getRoot() {
        return this.rootView;
    }
}

