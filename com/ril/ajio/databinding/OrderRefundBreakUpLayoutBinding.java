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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class OrderRefundBreakUpLayoutBinding
implements BC3 {
    public final AjioTextView refundBreakupAjioCashAmtTv;
    public final AppCompatImageView refundBreakupAjioCashIv;
    public final AjioTextView refundBreakupAjioCashValTv;
    public final AjioTextView refundBreakupAjioPointsAmtTv;
    public final AppCompatImageView refundBreakupAjioPointsIv;
    public final AjioTextView refundBreakupAjioPointsValTv;
    public final AjioTextView refundBreakupAjioWalletHeaderTv;
    public final AjioTextView refundBreakupBankTransferAmtTv;
    public final AjioTextView refundBreakupBankTransferAmtValTv;
    public final AjioTextView refundBreakupHeaderTv;
    public final AjioTextView refundBreakupLrAmtTv;
    public final AjioTextView refundBreakupLrAmtValTv;
    public final AjioTextView refundBreakupMahacashbackAmtTv;
    public final AjioTextView refundBreakupMahacashbackAmtValTv;
    public final AjioTextView refundBreakupPrepaidAmtTv;
    public final AjioTextView refundBreakupPrepaidAmtValTv;
    public final AjioTextView refundBreakupR1AmtTv;
    public final AjioTextView refundBreakupR1AmtValTv;
    public final AjioTextView refundBreakupTotalAmtTv;
    public final AjioTextView refundBreakupTotalAmtValTv;
    public final ConstraintLayout refundDetailContainer;
    private final ConstraintLayout rootView;

    private OrderRefundBreakUpLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AppCompatImageView appCompatImageView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AppCompatImageView appCompatImageView2, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12, AjioTextView ajioTextView13, AjioTextView ajioTextView14, AjioTextView ajioTextView15, AjioTextView ajioTextView16, AjioTextView ajioTextView17, AjioTextView ajioTextView18, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.refundBreakupAjioCashAmtTv = ajioTextView;
        this.refundBreakupAjioCashIv = appCompatImageView;
        this.refundBreakupAjioCashValTv = ajioTextView2;
        this.refundBreakupAjioPointsAmtTv = ajioTextView3;
        this.refundBreakupAjioPointsIv = appCompatImageView2;
        this.refundBreakupAjioPointsValTv = ajioTextView4;
        this.refundBreakupAjioWalletHeaderTv = ajioTextView5;
        this.refundBreakupBankTransferAmtTv = ajioTextView6;
        this.refundBreakupBankTransferAmtValTv = ajioTextView7;
        this.refundBreakupHeaderTv = ajioTextView8;
        this.refundBreakupLrAmtTv = ajioTextView9;
        this.refundBreakupLrAmtValTv = ajioTextView10;
        this.refundBreakupMahacashbackAmtTv = ajioTextView11;
        this.refundBreakupMahacashbackAmtValTv = ajioTextView12;
        this.refundBreakupPrepaidAmtTv = ajioTextView13;
        this.refundBreakupPrepaidAmtValTv = ajioTextView14;
        this.refundBreakupR1AmtTv = ajioTextView15;
        this.refundBreakupR1AmtValTv = ajioTextView16;
        this.refundBreakupTotalAmtTv = ajioTextView17;
        this.refundBreakupTotalAmtValTv = ajioTextView18;
        this.refundDetailContainer = constraintLayout2;
    }

    public static OrderRefundBreakUpLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.refund_breakup_ajio_cash_amt_tv;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.refund_breakup_ajio_cash_iv;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AppCompatImageView)view2;
            if (object3 != null) {
                n3 = R$id.refund_breakup_ajio_cash_val_tv;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.refund_breakup_ajio_points_amt_tv;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.refund_breakup_ajio_points_iv;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AppCompatImageView)view2;
                        if (object6 != null) {
                            n3 = R$id.refund_breakup_ajio_points_val_tv;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioTextView)view2;
                            if (object7 != null) {
                                n3 = R$id.refund_breakup_ajio_wallet_header_tv;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.refund_breakup_bank_transfer_amt_tv;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.refund_breakup_bank_transfer_amt_val_tv;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.refund_breakup_header_tv;
                                            Object object11 = view2 = dd2_2.a(n3, view);
                                            object11 = (AjioTextView)view2;
                                            if (object11 != null) {
                                                n3 = R$id.refund_breakup_lr_amt_tv;
                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                object12 = (AjioTextView)view2;
                                                if (object12 != null) {
                                                    n3 = R$id.refund_breakup_lr_amt_val_tv;
                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                    object13 = (AjioTextView)view2;
                                                    if (object13 != null) {
                                                        n3 = R$id.refund_breakup_mahacashback_amt_tv;
                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                        object14 = (AjioTextView)view2;
                                                        if (object14 != null) {
                                                            n3 = R$id.refund_breakup_mahacashback_amt_val_tv;
                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                            object15 = (AjioTextView)view2;
                                                            if (object15 != null) {
                                                                n3 = R$id.refund_breakup_prepaid_amt_tv;
                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                object16 = (AjioTextView)view2;
                                                                if (object16 != null) {
                                                                    n3 = R$id.refund_breakup_prepaid_amt_val_tv;
                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                    object17 = (AjioTextView)view2;
                                                                    if (object17 != null) {
                                                                        n3 = R$id.refund_breakup_r1_amt_tv;
                                                                        Object object18 = view2 = dd2_2.a(n3, view);
                                                                        object18 = (AjioTextView)view2;
                                                                        if (object18 != null) {
                                                                            n3 = R$id.refund_breakup_r1_amt_val_tv;
                                                                            Object object19 = view2 = dd2_2.a(n3, view);
                                                                            object19 = (AjioTextView)view2;
                                                                            if (object19 != null) {
                                                                                n3 = R$id.refund_breakup_total_amt_tv;
                                                                                Object object20 = view2 = dd2_2.a(n3, view);
                                                                                object20 = (AjioTextView)view2;
                                                                                if (object20 != null) {
                                                                                    n3 = R$id.refund_breakup_total_amt_val_tv;
                                                                                    Object object21 = view2 = dd2_2.a(n3, view);
                                                                                    object21 = (AjioTextView)view2;
                                                                                    if (object21 != null) {
                                                                                        Object object22 = view;
                                                                                        object22 = (ConstraintLayout)view;
                                                                                        object = new OrderRefundBreakUpLayoutBinding((ConstraintLayout)((Object)object22), (AjioTextView)object2, (AppCompatImageView)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AppCompatImageView)((Object)object6), (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19, (AjioTextView)object20, (AjioTextView)object21, (ConstraintLayout)((Object)object22));
                                                                                        return object;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderRefundBreakUpLayoutBinding inflate(LayoutInflater layoutInflater) {
        return OrderRefundBreakUpLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static OrderRefundBreakUpLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_refund_break_up_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderRefundBreakUpLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

