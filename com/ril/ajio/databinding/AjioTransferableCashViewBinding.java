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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class AjioTransferableCashViewBinding
implements BC3 {
    public final AppCompatImageView awForward;
    public final TextView awTransferBankTv;
    public final TextView awTransferableCashBalanceTv;
    public final TextView awTransferableCashTv;
    private final ConstraintLayout rootView;

    private AjioTransferableCashViewBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.awForward = appCompatImageView;
        this.awTransferBankTv = textView;
        this.awTransferableCashBalanceTv = textView2;
        this.awTransferableCashTv = textView3;
    }

    public static AjioTransferableCashViewBinding bind(View object) {
        View view;
        int n3 = R$id.aw_forward;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.aw_transfer_bank_tv;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (TextView)view;
            if (view2 != null) {
                n3 = R$id.aw_transferable_cash_balance_tv;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.aw_transferable_cash_tv;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        AjioTransferableCashViewBinding ajioTransferableCashViewBinding = new AjioTransferableCashViewBinding((ConstraintLayout)((Object)object3), (AppCompatImageView)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4);
                        return ajioTransferableCashViewBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static AjioTransferableCashViewBinding inflate(LayoutInflater layoutInflater) {
        return AjioTransferableCashViewBinding.inflate(layoutInflater, null, false);
    }

    public static AjioTransferableCashViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ajio_transferable_cash_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AjioTransferableCashViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

