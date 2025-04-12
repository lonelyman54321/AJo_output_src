/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundAmountSectionBinding
implements BC3 {
    public final View breakupDivider;
    public final View divider;
    public final AjioTextView errorMsg;
    public final LinearLayout linkContainer;
    public final AjioTextView linkTwo;
    public final AjioTextView refundAmount;
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
    public final AjioTextView refundBreakupTotalTv;
    public final AjioTextView refundBreakupTotalValTv;
    public final ConstraintLayout refundDetailContainer;
    public final AjioTextView refundDetailTv;
    public final AjioTextView refundInfo;
    public final AjioTextView refundVia;
    public final RecyclerView returnRefundModeRv;
    private final CardView rootView;
    public final AjioTextView rowOdReturnLblTransfer;
    public final AjioTextView tvRefundBreakup;

    private ReturnRefundAmountSectionBinding(CardView cardView, View view, View view2, AjioTextView ajioTextView, LinearLayout linearLayout, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AppCompatImageView appCompatImageView, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AppCompatImageView appCompatImageView2, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12, AjioTextView ajioTextView13, AjioTextView ajioTextView14, AjioTextView ajioTextView15, AjioTextView ajioTextView16, AjioTextView ajioTextView17, AjioTextView ajioTextView18, AjioTextView ajioTextView19, AjioTextView ajioTextView20, AjioTextView ajioTextView21, ConstraintLayout constraintLayout, AjioTextView ajioTextView22, AjioTextView ajioTextView23, AjioTextView ajioTextView24, RecyclerView recyclerView, AjioTextView ajioTextView25, AjioTextView ajioTextView26) {
        this.rootView = cardView;
        this.breakupDivider = view;
        this.divider = view2;
        this.errorMsg = ajioTextView;
        this.linkContainer = linearLayout;
        this.linkTwo = ajioTextView2;
        this.refundAmount = ajioTextView3;
        this.refundBreakupAjioCashAmtTv = ajioTextView4;
        this.refundBreakupAjioCashIv = appCompatImageView;
        this.refundBreakupAjioCashValTv = ajioTextView5;
        this.refundBreakupAjioPointsAmtTv = ajioTextView6;
        this.refundBreakupAjioPointsIv = appCompatImageView2;
        this.refundBreakupAjioPointsValTv = ajioTextView7;
        this.refundBreakupAjioWalletHeaderTv = ajioTextView8;
        this.refundBreakupBankTransferAmtTv = ajioTextView9;
        this.refundBreakupBankTransferAmtValTv = ajioTextView10;
        this.refundBreakupHeaderTv = ajioTextView11;
        this.refundBreakupLrAmtTv = ajioTextView12;
        this.refundBreakupLrAmtValTv = ajioTextView13;
        this.refundBreakupMahacashbackAmtTv = ajioTextView14;
        this.refundBreakupMahacashbackAmtValTv = ajioTextView15;
        this.refundBreakupPrepaidAmtTv = ajioTextView16;
        this.refundBreakupPrepaidAmtValTv = ajioTextView17;
        this.refundBreakupR1AmtTv = ajioTextView18;
        this.refundBreakupR1AmtValTv = ajioTextView19;
        this.refundBreakupTotalTv = ajioTextView20;
        this.refundBreakupTotalValTv = ajioTextView21;
        this.refundDetailContainer = constraintLayout;
        this.refundDetailTv = ajioTextView22;
        this.refundInfo = ajioTextView23;
        this.refundVia = ajioTextView24;
        this.returnRefundModeRv = recyclerView;
        this.rowOdReturnLblTransfer = ajioTextView25;
        this.tvRefundBreakup = ajioTextView26;
    }

    public static ReturnRefundAmountSectionBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.breakup_divider;
        View view3 = dd2_2.a(n3, view);
        if (view3 != null && (view2 = dd2_2.a(n3 = R$id.divider, view)) != null) {
            Object object2;
            n3 = R$id.error_msg;
            Object object3 = object2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)object2;
            if (object3 != null) {
                n3 = R$id.link_container;
                View view4 = object2 = dd2_2.a(n3, view);
                view4 = (LinearLayout)object2;
                if (view4 != null) {
                    n3 = R$id.link_two;
                    Object object4 = object2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)object2;
                    if (object4 != null) {
                        n3 = R$id.refund_amount;
                        Object object5 = object2 = dd2_2.a(n3, view);
                        object5 = (AjioTextView)object2;
                        if (object5 != null) {
                            n3 = R$id.refund_breakup_ajio_cash_amt_tv;
                            Object object6 = object2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)object2;
                            if (object6 != null) {
                                n3 = R$id.refund_breakup_ajio_cash_iv;
                                Object object7 = object2 = dd2_2.a(n3, view);
                                object7 = (AppCompatImageView)((Object)object2);
                                if (object7 != null) {
                                    n3 = R$id.refund_breakup_ajio_cash_val_tv;
                                    Object object8 = object2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)object2;
                                    if (object8 != null) {
                                        n3 = R$id.refund_breakup_ajio_points_amt_tv;
                                        Object object9 = object2 = dd2_2.a(n3, view);
                                        object9 = (AjioTextView)object2;
                                        if (object9 != null) {
                                            n3 = R$id.refund_breakup_ajio_points_iv;
                                            Object object10 = object2 = dd2_2.a(n3, view);
                                            object10 = (AppCompatImageView)((Object)object2);
                                            if (object10 != null) {
                                                n3 = R$id.refund_breakup_ajio_points_val_tv;
                                                Object object11 = object2 = dd2_2.a(n3, view);
                                                object11 = (AjioTextView)object2;
                                                if (object11 != null) {
                                                    n3 = R$id.refund_breakup_ajio_wallet_header_tv;
                                                    Object object12 = object2 = dd2_2.a(n3, view);
                                                    object12 = (AjioTextView)object2;
                                                    if (object12 != null) {
                                                        n3 = R$id.refund_breakup_bank_transfer_amt_tv;
                                                        Object object13 = object2 = dd2_2.a(n3, view);
                                                        object13 = (AjioTextView)object2;
                                                        if (object13 != null) {
                                                            n3 = R$id.refund_breakup_bank_transfer_amt_val_tv;
                                                            Object object14 = object2 = dd2_2.a(n3, view);
                                                            object14 = (AjioTextView)object2;
                                                            if (object14 != null) {
                                                                n3 = R$id.refund_breakup_header_tv;
                                                                Object object15 = object2 = dd2_2.a(n3, view);
                                                                object15 = (AjioTextView)object2;
                                                                if (object15 != null) {
                                                                    n3 = R$id.refund_breakup_lr_amt_tv;
                                                                    Object object16 = object2 = dd2_2.a(n3, view);
                                                                    object16 = (AjioTextView)object2;
                                                                    if (object16 != null) {
                                                                        n3 = R$id.refund_breakup_lr_amt_val_tv;
                                                                        Object object17 = object2 = dd2_2.a(n3, view);
                                                                        object17 = (AjioTextView)object2;
                                                                        if (object17 != null) {
                                                                            n3 = R$id.refund_breakup_mahacashback_amt_tv;
                                                                            Object object18 = object2 = dd2_2.a(n3, view);
                                                                            object18 = (AjioTextView)object2;
                                                                            if (object18 != null) {
                                                                                n3 = R$id.refund_breakup_mahacashback_amt_val_tv;
                                                                                Object object19 = object2 = dd2_2.a(n3, view);
                                                                                object19 = (AjioTextView)object2;
                                                                                if (object19 != null) {
                                                                                    n3 = R$id.refund_breakup_prepaid_amt_tv;
                                                                                    Object object20 = object2 = dd2_2.a(n3, view);
                                                                                    object20 = (AjioTextView)object2;
                                                                                    if (object20 != null) {
                                                                                        n3 = R$id.refund_breakup_prepaid_amt_val_tv;
                                                                                        Object object21 = object2 = dd2_2.a(n3, view);
                                                                                        object21 = (AjioTextView)object2;
                                                                                        if (object21 != null) {
                                                                                            n3 = R$id.refund_breakup_r1_amt_tv;
                                                                                            Object object22 = object2 = dd2_2.a(n3, view);
                                                                                            object22 = (AjioTextView)object2;
                                                                                            if (object22 != null) {
                                                                                                n3 = R$id.refund_breakup_r1_amt_val_tv;
                                                                                                Object object23 = object2 = dd2_2.a(n3, view);
                                                                                                object23 = (AjioTextView)object2;
                                                                                                if (object23 != null) {
                                                                                                    n3 = R$id.refund_breakup_total_tv;
                                                                                                    Object object24 = object2 = dd2_2.a(n3, view);
                                                                                                    object24 = (AjioTextView)object2;
                                                                                                    if (object24 != null) {
                                                                                                        n3 = R$id.refund_breakup_total_val_tv;
                                                                                                        Object object25 = object2 = dd2_2.a(n3, view);
                                                                                                        object25 = (AjioTextView)object2;
                                                                                                        if (object25 != null) {
                                                                                                            n3 = R$id.refundDetailContainer;
                                                                                                            Object object26 = object2 = dd2_2.a(n3, view);
                                                                                                            object26 = (ConstraintLayout)((Object)object2);
                                                                                                            if (object26 != null) {
                                                                                                                n3 = R$id.refund_detail_tv;
                                                                                                                Object object27 = object2 = dd2_2.a(n3, view);
                                                                                                                object27 = (AjioTextView)object2;
                                                                                                                if (object27 != null) {
                                                                                                                    n3 = R$id.refund_info;
                                                                                                                    Object object28 = object2 = dd2_2.a(n3, view);
                                                                                                                    object28 = (AjioTextView)object2;
                                                                                                                    if (object28 != null) {
                                                                                                                        n3 = R$id.refund_via;
                                                                                                                        Object object29 = object2 = dd2_2.a(n3, view);
                                                                                                                        object29 = (AjioTextView)object2;
                                                                                                                        if (object29 != null) {
                                                                                                                            n3 = R$id.return_refund_mode_rv;
                                                                                                                            Object object30 = object2 = dd2_2.a(n3, view);
                                                                                                                            object30 = (RecyclerView)object2;
                                                                                                                            if (object30 != null) {
                                                                                                                                n3 = R$id.row_od_return_lbl_transfer;
                                                                                                                                Object object31 = object2 = dd2_2.a(n3, view);
                                                                                                                                object31 = (AjioTextView)object2;
                                                                                                                                if (object31 != null) {
                                                                                                                                    n3 = R$id.tv_refund_breakup;
                                                                                                                                    Object object32 = object2 = dd2_2.a(n3, view);
                                                                                                                                    object32 = (AjioTextView)object2;
                                                                                                                                    if (object32 != null) {
                                                                                                                                        ReturnRefundAmountSectionBinding returnRefundAmountSectionBinding;
                                                                                                                                        object2 = returnRefundAmountSectionBinding;
                                                                                                                                        Object object33 = view;
                                                                                                                                        object33 = (CardView)view;
                                                                                                                                        returnRefundAmountSectionBinding = new ReturnRefundAmountSectionBinding((CardView)((Object)object33), view3, view2, (AjioTextView)object3, (LinearLayout)view4, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AppCompatImageView)((Object)object7), (AjioTextView)object8, (AjioTextView)object9, (AppCompatImageView)((Object)object10), (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19, (AjioTextView)object20, (AjioTextView)object21, (AjioTextView)object22, (AjioTextView)object23, (AjioTextView)object24, (AjioTextView)object25, (ConstraintLayout)((Object)object26), (AjioTextView)object27, (AjioTextView)object28, (AjioTextView)object29, (RecyclerView)object30, (AjioTextView)object31, (AjioTextView)object32);
                                                                                                                                        return returnRefundAmountSectionBinding;
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

    public static ReturnRefundAmountSectionBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundAmountSectionBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundAmountSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_amount_section;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundAmountSectionBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

