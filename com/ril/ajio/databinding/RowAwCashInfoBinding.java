/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.AjioTransferableCashViewBinding;

public final class RowAwCashInfoBinding
implements BC3 {
    public final TextView awAmount;
    public final ImageView awCashIv;
    public final TextView awCashTv;
    public final AppCompatImageView awForward;
    public final TextView awInfoTv;
    public final AjioTransferableCashViewBinding awNonTransferableCashCardView;
    public final TextView awPointAmt;
    public final View awPointBg;
    public final AjioTransferableCashViewBinding awTransferableCashCardView;
    public final Barrier barrier;
    private final ConstraintLayout rootView;

    private RowAwCashInfoBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, AppCompatImageView appCompatImageView, TextView textView3, AjioTransferableCashViewBinding ajioTransferableCashViewBinding, TextView textView4, View view, AjioTransferableCashViewBinding ajioTransferableCashViewBinding2, Barrier barrier) {
        this.rootView = constraintLayout;
        this.awAmount = textView;
        this.awCashIv = imageView;
        this.awCashTv = textView2;
        this.awForward = appCompatImageView;
        this.awInfoTv = textView3;
        this.awNonTransferableCashCardView = ajioTransferableCashViewBinding;
        this.awPointAmt = textView4;
        this.awPointBg = view;
        this.awTransferableCashCardView = ajioTransferableCashViewBinding2;
        this.barrier = barrier;
    }

    public static RowAwCashInfoBinding bind(View object) {
        View view;
        int n3 = R$id.aw_amount;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.aw_cash_iv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.aw_cash_tv;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.aw_forward;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AppCompatImageView)view;
                    if (object2 != null) {
                        n3 = R$id.aw_info_tv;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null && (view = dd2_2.a(n3 = R$id.aw_non_transferable_cash_card_view, object)) != null) {
                            View view6;
                            AjioTransferableCashViewBinding ajioTransferableCashViewBinding = AjioTransferableCashViewBinding.bind(view);
                            n3 = R$id.aw_point_amt;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null && (view6 = dd2_2.a(n3 = R$id.aw_point_bg, object)) != null && (view = dd2_2.a(n3 = R$id.aw_transferable_cash_card_view, object)) != null) {
                                AjioTransferableCashViewBinding ajioTransferableCashViewBinding2 = AjioTransferableCashViewBinding.bind(view);
                                n3 = R$id.barrier;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (Barrier)view;
                                if (view8 != null) {
                                    Object object3 = object;
                                    object3 = (ConstraintLayout)((Object)object);
                                    RowAwCashInfoBinding rowAwCashInfoBinding = new RowAwCashInfoBinding((ConstraintLayout)((Object)object3), (TextView)view2, (ImageView)view3, (TextView)view4, (AppCompatImageView)((Object)object2), (TextView)view5, ajioTransferableCashViewBinding, (TextView)view7, view6, ajioTransferableCashViewBinding2, (Barrier)view8);
                                    return rowAwCashInfoBinding;
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowAwCashInfoBinding inflate(LayoutInflater layoutInflater) {
        return RowAwCashInfoBinding.inflate(layoutInflater, null, false);
    }

    public static RowAwCashInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_aw_cash_info;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAwCashInfoBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

