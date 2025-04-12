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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowSpendHistoryBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final TextView shAmount;
    public final TextView shOrderID;
    public final TextView shTransactionDate;
    public final TextView shViewDetails;

    private RowSpendHistoryBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.shAmount = textView;
        this.shOrderID = textView2;
        this.shTransactionDate = textView3;
        this.shViewDetails = textView4;
    }

    public static RowSpendHistoryBinding bind(View object) {
        View view;
        int n3 = R$id.shAmount;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.shOrderID;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.shTransactionDate;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.shViewDetails;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        RowSpendHistoryBinding rowSpendHistoryBinding = new RowSpendHistoryBinding((ConstraintLayout)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                        return rowSpendHistoryBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowSpendHistoryBinding inflate(LayoutInflater layoutInflater) {
        return RowSpendHistoryBinding.inflate(layoutInflater, null, false);
    }

    public static RowSpendHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_spend_history;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowSpendHistoryBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

