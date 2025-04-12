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
import com.ril.ajio.databinding.RowAwCashInfoAccountPageBinding;

public final class LayoutRowWalletAccountBinding
implements BC3 {
    public final RowAwCashInfoAccountPageBinding awInfoCash;
    public final RowAwCashInfoAccountPageBinding awInfoPoint;
    public final TextView awPointAmt;
    public final View awPointBg;
    public final View divider;
    private final ConstraintLayout rootView;
    public final ConstraintLayout walletLayout;

    private LayoutRowWalletAccountBinding(ConstraintLayout constraintLayout, RowAwCashInfoAccountPageBinding rowAwCashInfoAccountPageBinding, RowAwCashInfoAccountPageBinding rowAwCashInfoAccountPageBinding2, TextView textView, View view, View view2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.awInfoCash = rowAwCashInfoAccountPageBinding;
        this.awInfoPoint = rowAwCashInfoAccountPageBinding2;
        this.awPointAmt = textView;
        this.awPointBg = view;
        this.divider = view2;
        this.walletLayout = constraintLayout2;
    }

    public static LayoutRowWalletAccountBinding bind(View object) {
        int n3 = R$id.aw_info_cash;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            RowAwCashInfoAccountPageBinding rowAwCashInfoAccountPageBinding = RowAwCashInfoAccountPageBinding.bind(view);
            n3 = R$id.aw_info_point;
            view = dd2_2.a(n3, object);
            if (view != null) {
                View view2;
                View view3;
                RowAwCashInfoAccountPageBinding rowAwCashInfoAccountPageBinding2 = RowAwCashInfoAccountPageBinding.bind(view);
                n3 = R$id.aw_point_amt;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null && (view3 = dd2_2.a(n3 = R$id.aw_point_bg, object)) != null && (view2 = dd2_2.a(n3 = R$id.divider, object)) != null) {
                    Object object2 = object;
                    object2 = (ConstraintLayout)((Object)object);
                    object = new LayoutRowWalletAccountBinding((ConstraintLayout)((Object)object2), rowAwCashInfoAccountPageBinding, rowAwCashInfoAccountPageBinding2, (TextView)view4, view3, view2, (ConstraintLayout)((Object)object2));
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutRowWalletAccountBinding inflate(LayoutInflater layoutInflater) {
        return LayoutRowWalletAccountBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutRowWalletAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_row_wallet_account;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutRowWalletAccountBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

