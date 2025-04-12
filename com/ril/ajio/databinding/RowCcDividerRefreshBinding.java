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

public final class RowCcDividerRefreshBinding
implements BC3 {
    private final View rootView;

    private RowCcDividerRefreshBinding(View view) {
        this.rootView = view;
    }

    public static RowCcDividerRefreshBinding bind(View object) {
        if (object != null) {
            RowCcDividerRefreshBinding rowCcDividerRefreshBinding = new RowCcDividerRefreshBinding((View)object);
            return rowCcDividerRefreshBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowCcDividerRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcDividerRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcDividerRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_divider_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcDividerRefreshBinding.bind((View)layoutInflater);
    }

    public View getRoot() {
        return this.rootView;
    }
}

