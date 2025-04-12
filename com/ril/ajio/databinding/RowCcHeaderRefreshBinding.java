/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcHeaderRefreshBinding
implements BC3 {
    private final LinearLayout rootView;
    public final TextView rowCcHeaderLbl;
    public final RecyclerView rowCcHeaderRv;

    private RowCcHeaderRefreshBinding(LinearLayout linearLayout, TextView textView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.rowCcHeaderLbl = textView;
        this.rowCcHeaderRv = recyclerView;
    }

    public static RowCcHeaderRefreshBinding bind(View object) {
        RecyclerView recyclerView;
        int n3 = R$id.row_cc_header_lbl;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.row_cc_header_rv, object)) != null) {
            object = (LinearLayout)object;
            RowCcHeaderRefreshBinding rowCcHeaderRefreshBinding = new RowCcHeaderRefreshBinding((LinearLayout)object, textView, recyclerView);
            return rowCcHeaderRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcHeaderRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcHeaderRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcHeaderRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_header_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcHeaderRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

