/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcDividerBinding
implements BC3 {
    private final FrameLayout rootView;
    public final TextView rowCcDivider;

    private RowCcDividerBinding(FrameLayout frameLayout, TextView textView) {
        this.rootView = frameLayout;
        this.rowCcDivider = textView;
    }

    public static RowCcDividerBinding bind(View object) {
        int n3 = R$id.row_cc_divider;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (FrameLayout)object;
            RowCcDividerBinding rowCcDividerBinding = new RowCcDividerBinding((FrameLayout)object, textView);
            return rowCcDividerBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcDividerBinding inflate(LayoutInflater layoutInflater) {
        return RowCcDividerBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_divider;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcDividerBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

