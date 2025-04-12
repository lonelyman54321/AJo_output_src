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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcSelectOrderRefreshBinding
implements BC3 {
    private final CardView rootView;
    public final TextView rowCcSelectOrderTv;

    private RowCcSelectOrderRefreshBinding(CardView cardView, TextView textView) {
        this.rootView = cardView;
        this.rowCcSelectOrderTv = textView;
    }

    public static RowCcSelectOrderRefreshBinding bind(View object) {
        int n3 = R$id.row_cc_select_order_tv;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (CardView)((Object)object);
            RowCcSelectOrderRefreshBinding rowCcSelectOrderRefreshBinding = new RowCcSelectOrderRefreshBinding((CardView)((Object)object), textView);
            return rowCcSelectOrderRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcSelectOrderRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcSelectOrderRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcSelectOrderRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_select_order_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcSelectOrderRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

