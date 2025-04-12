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

public final class RowReferralCashBinding
implements BC3 {
    public final TextView cashAmount;
    private final ConstraintLayout rootView;
    public final TextView viewWallet;

    private RowReferralCashBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.cashAmount = textView;
        this.viewWallet = textView2;
    }

    public static RowReferralCashBinding bind(View object) {
        TextView textView;
        int n3 = R$id.cash_amount;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (textView = (TextView)dd2_2.a(n3 = R$id.view_wallet, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowReferralCashBinding rowReferralCashBinding = new RowReferralCashBinding((ConstraintLayout)((Object)object), textView2, textView);
            return rowReferralCashBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowReferralCashBinding inflate(LayoutInflater layoutInflater) {
        return RowReferralCashBinding.inflate(layoutInflater, null, false);
    }

    public static RowReferralCashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_referral_cash;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReferralCashBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

