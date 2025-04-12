/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RadioGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioRadioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ExchangeReturnsItemslistFooterBinding
implements BC3 {
    public final LinearLayout bankTransferDetailsLayout;
    public final ConstraintLayout clRefundMsg;
    public final ConstraintLayout constraintTotalRefund;
    public final AjioTextView idConvenienceFee;
    public final AjioTextView idReadPolicy;
    public final AjioImageView ivRefundMsg;
    public final LinearLayout liConvenienceFee;
    public final AjioRadioButton rbAjiostorecredits;
    public final AjioRadioButton rbBanktransfer;
    public final LinearLayout refundOptionsContainer;
    public final RadioGroup rgRefundOptions;
    private final LinearLayout rootView;
    public final AjioTextView tvAjioBankMessageTv;
    public final AjioTextView tvAjiostorecreditsMessage;
    public final AjioTextView tvRefundAmount;
    public final AjioTextView tvRefundBreakup;
    public final AjioTextView tvRefundMsgDefult;
    public final AjioTextView tvReturnFeeLabel;
    public final AjioTextView tvSelectrefundtypeLabel;

    private ExchangeReturnsItemslistFooterBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioImageView ajioImageView, LinearLayout linearLayout3, AjioRadioButton ajioRadioButton, AjioRadioButton ajioRadioButton2, LinearLayout linearLayout4, RadioGroup radioGroup, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9) {
        this.rootView = linearLayout;
        this.bankTransferDetailsLayout = linearLayout2;
        this.clRefundMsg = constraintLayout;
        this.constraintTotalRefund = constraintLayout2;
        this.idConvenienceFee = ajioTextView;
        this.idReadPolicy = ajioTextView2;
        this.ivRefundMsg = ajioImageView;
        this.liConvenienceFee = linearLayout3;
        this.rbAjiostorecredits = ajioRadioButton;
        this.rbBanktransfer = ajioRadioButton2;
        this.refundOptionsContainer = linearLayout4;
        this.rgRefundOptions = radioGroup;
        this.tvAjioBankMessageTv = ajioTextView3;
        this.tvAjiostorecreditsMessage = ajioTextView4;
        this.tvRefundAmount = ajioTextView5;
        this.tvRefundBreakup = ajioTextView6;
        this.tvRefundMsgDefult = ajioTextView7;
        this.tvReturnFeeLabel = ajioTextView8;
        this.tvSelectrefundtypeLabel = ajioTextView9;
    }

    public static ExchangeReturnsItemslistFooterBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.bank_transfer_details_layout;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n3 = R$id.cl_refund_msg;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (ConstraintLayout)view2;
            if (object2 != null) {
                n3 = R$id.constraint_total_refund;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (ConstraintLayout)view2;
                if (object3 != null) {
                    n3 = R$id.id_convenience_fee;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.id_read_policy;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioTextView)view2;
                        if (object5 != null) {
                            n3 = R$id.iv_refund_msg;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioImageView)view2;
                            if (object6 != null) {
                                n3 = R$id.li_convenience_fee;
                                View view4 = view2 = dd2_2.a(n3, view);
                                view4 = (LinearLayout)view2;
                                if (view4 != null) {
                                    n3 = R$id.rb_ajiostorecredits;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioRadioButton)view2;
                                    if (object7 != null) {
                                        n3 = R$id.rb_banktransfer;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioRadioButton)view2;
                                        if (object8 != null) {
                                            n3 = R$id.refund_options_container;
                                            View view5 = view2 = dd2_2.a(n3, view);
                                            view5 = (LinearLayout)view2;
                                            if (view5 != null) {
                                                n3 = R$id.rg_refund_options;
                                                View view6 = view2 = dd2_2.a(n3, view);
                                                view6 = (RadioGroup)view2;
                                                if (view6 != null) {
                                                    n3 = R$id.tv_ajio_bank_message_tv;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (AjioTextView)view2;
                                                    if (object9 != null) {
                                                        n3 = R$id.tv_ajiostorecredits_message;
                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                        object10 = (AjioTextView)view2;
                                                        if (object10 != null) {
                                                            n3 = R$id.tv_refund_amount;
                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                            object11 = (AjioTextView)view2;
                                                            if (object11 != null) {
                                                                n3 = R$id.tv_refund_breakup;
                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                object12 = (AjioTextView)view2;
                                                                if (object12 != null) {
                                                                    n3 = R$id.tv_refund_msg_defult;
                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                    object13 = (AjioTextView)view2;
                                                                    if (object13 != null) {
                                                                        n3 = R$id.tv_return_fee_label;
                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                        object14 = (AjioTextView)view2;
                                                                        if (object14 != null) {
                                                                            n3 = R$id.tv_selectrefundtype_label;
                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                            object15 = (AjioTextView)view2;
                                                                            if (object15 != null) {
                                                                                View view7 = view;
                                                                                view7 = (LinearLayout)view;
                                                                                ExchangeReturnsItemslistFooterBinding exchangeReturnsItemslistFooterBinding = new ExchangeReturnsItemslistFooterBinding((LinearLayout)view7, (LinearLayout)view3, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioImageView)((Object)object6), (LinearLayout)view4, (AjioRadioButton)object7, (AjioRadioButton)object8, (LinearLayout)view5, (RadioGroup)view6, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15);
                                                                                return exchangeReturnsItemslistFooterBinding;
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

    public static ExchangeReturnsItemslistFooterBinding inflate(LayoutInflater layoutInflater) {
        return ExchangeReturnsItemslistFooterBinding.inflate(layoutInflater, null, false);
    }

    public static ExchangeReturnsItemslistFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exchange_returns_itemslist_footer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExchangeReturnsItemslistFooterBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

