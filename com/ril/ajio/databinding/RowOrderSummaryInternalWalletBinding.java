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

public final class RowOrderSummaryInternalWalletBinding
implements BC3 {
    public final TextView checkoutTvCredit;
    public final TextView creditText;
    private final ConstraintLayout rootView;

    private RowOrderSummaryInternalWalletBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.checkoutTvCredit = textView;
        this.creditText = textView2;
    }

    public static RowOrderSummaryInternalWalletBinding bind(View object) {
        TextView textView;
        int n3 = R$id.checkout_tv_credit;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (textView = (TextView)dd2_2.a(n3 = R$id.credit_text, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowOrderSummaryInternalWalletBinding rowOrderSummaryInternalWalletBinding = new RowOrderSummaryInternalWalletBinding((ConstraintLayout)((Object)object), textView2, textView);
            return rowOrderSummaryInternalWalletBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowOrderSummaryInternalWalletBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderSummaryInternalWalletBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderSummaryInternalWalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_order_summary_internal_wallet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderSummaryInternalWalletBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

