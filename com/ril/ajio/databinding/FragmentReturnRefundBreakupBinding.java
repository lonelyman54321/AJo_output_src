/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentReturnRefundBreakupBinding
implements BC3 {
    public final AjioTextView bankDiscountLabelTv;
    public final AjioTextView bankDiscountTv;
    public final FrameLayout cancelContainer;
    public final AjioTextView codFeeTv;
    public final AjioTextView codLableTvFee;
    public final ConstraintLayout constraintBankFee;
    public final ConstraintLayout constraintConvFee;
    public final RelativeLayout convenienceLabelRl;
    public final AjioTextView convenienceLabelTv;
    public final AjioTextView convenienceLabelTvFee;
    public final AjioTextView convenienceLabelTypeTv;
    public final AjioTextView deliveryFeeTv;
    public final AjioTextView deliveryLableTvFee;
    public final View divider;
    public final AjioTextView feeValueFreeTv;
    public final ImageView imCancelBtn;
    public final LinearLayout linearLayout1;
    public final TextView listHeader;
    public final AjioTextView okayButton;
    public final RecyclerView orderList;
    public final AjioTextView platformFeeTv;
    public final AjioTextView platformLableTvFee;
    public final AjioTextView policyText;
    public final AjioTextView priorityDeliveryFeeTv;
    public final AjioTextView priorityDeliveryLabelTvFee;
    public final ConstraintLayout priorityDeliveryRefundedConstaintlayout;
    public final AjioTextView priorityDeliveryTitleTv;
    public final ConstraintLayout returnFeeConstaintlayout;
    private final ConstraintLayout rootView;
    public final ConstraintLayout selfShipConstaintlayout;
    public final TextView titleHeader;
    public final AjioTextView titleHeaderTotalAmount;
    public final RelativeLayout titleRl;
    public final AjioTextView tvPriorityDeliveryAmount;
    public final AjioTextView tvReturnFeeAmount;
    public final AjioTextView tvReturnFeeCta;
    public final AjioTextView tvReturnFeeDescription;
    public final AjioTextView tvReturnFeeLabel;
    public final AjioTextView tvSelfShipAmount;
    public final AjioTextView tvTotalRefundAmount;

    private FragmentReturnRefundBreakupBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, FrameLayout frameLayout, AjioTextView ajioTextView3, AjioTextView ajioTextView4, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RelativeLayout relativeLayout, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, View view, AjioTextView ajioTextView10, ImageView imageView, LinearLayout linearLayout, TextView textView, AjioTextView ajioTextView11, RecyclerView recyclerView, AjioTextView ajioTextView12, AjioTextView ajioTextView13, AjioTextView ajioTextView14, AjioTextView ajioTextView15, AjioTextView ajioTextView16, ConstraintLayout constraintLayout4, AjioTextView ajioTextView17, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, TextView textView2, AjioTextView ajioTextView18, RelativeLayout relativeLayout2, AjioTextView ajioTextView19, AjioTextView ajioTextView20, AjioTextView ajioTextView21, AjioTextView ajioTextView22, AjioTextView ajioTextView23, AjioTextView ajioTextView24, AjioTextView ajioTextView25) {
        this.rootView = constraintLayout;
        this.bankDiscountLabelTv = ajioTextView;
        this.bankDiscountTv = ajioTextView2;
        this.cancelContainer = frameLayout;
        this.codFeeTv = ajioTextView3;
        this.codLableTvFee = ajioTextView4;
        this.constraintBankFee = constraintLayout2;
        this.constraintConvFee = constraintLayout3;
        this.convenienceLabelRl = relativeLayout;
        this.convenienceLabelTv = ajioTextView5;
        this.convenienceLabelTvFee = ajioTextView6;
        this.convenienceLabelTypeTv = ajioTextView7;
        this.deliveryFeeTv = ajioTextView8;
        this.deliveryLableTvFee = ajioTextView9;
        this.divider = view;
        this.feeValueFreeTv = ajioTextView10;
        this.imCancelBtn = imageView;
        this.linearLayout1 = linearLayout;
        this.listHeader = textView;
        this.okayButton = ajioTextView11;
        this.orderList = recyclerView;
        this.platformFeeTv = ajioTextView12;
        this.platformLableTvFee = ajioTextView13;
        this.policyText = ajioTextView14;
        this.priorityDeliveryFeeTv = ajioTextView15;
        this.priorityDeliveryLabelTvFee = ajioTextView16;
        this.priorityDeliveryRefundedConstaintlayout = constraintLayout4;
        this.priorityDeliveryTitleTv = ajioTextView17;
        this.returnFeeConstaintlayout = constraintLayout5;
        this.selfShipConstaintlayout = constraintLayout6;
        this.titleHeader = textView2;
        this.titleHeaderTotalAmount = ajioTextView18;
        this.titleRl = relativeLayout2;
        this.tvPriorityDeliveryAmount = ajioTextView19;
        this.tvReturnFeeAmount = ajioTextView20;
        this.tvReturnFeeCta = ajioTextView21;
        this.tvReturnFeeDescription = ajioTextView22;
        this.tvReturnFeeLabel = ajioTextView23;
        this.tvSelfShipAmount = ajioTextView24;
        this.tvTotalRefundAmount = ajioTextView25;
    }

    public static FragmentReturnRefundBreakupBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.bank_discount_label_tv;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.bank_discount_tv;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.cancelContainer;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (FrameLayout)view2;
                if (view3 != null) {
                    n3 = R$id.cod_fee_tv;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.cod_lable_tv_fee;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioTextView)view2;
                        if (object5 != null) {
                            n3 = R$id.constraint_bank_fee;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (ConstraintLayout)view2;
                            if (object6 != null) {
                                n3 = R$id.constraint_conv_fee;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (ConstraintLayout)view2;
                                if (object7 != null) {
                                    n3 = R$id.convenience_label_rl;
                                    View view4 = view2 = dd2_2.a(n3, view);
                                    view4 = (RelativeLayout)view2;
                                    if (view4 != null) {
                                        n3 = R$id.convenience_label_tv;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioTextView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.convenience_label_tv_fee;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AjioTextView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.convenience_label_type_tv;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (AjioTextView)view2;
                                                if (object10 != null) {
                                                    n3 = R$id.delivery_fee_tv;
                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                    object11 = (AjioTextView)view2;
                                                    if (object11 != null) {
                                                        View view5;
                                                        n3 = R$id.delivery_lable_tv_fee;
                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                        object12 = (AjioTextView)view2;
                                                        if (object12 != null && (view5 = dd2_2.a(n3 = R$id.divider, view)) != null) {
                                                            n3 = R$id.fee_value_free_tv;
                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                            object13 = (AjioTextView)view2;
                                                            if (object13 != null) {
                                                                n3 = R$id.im_cancelBtn;
                                                                View view6 = view2 = dd2_2.a(n3, view);
                                                                view6 = (ImageView)view2;
                                                                if (view6 != null) {
                                                                    n3 = R$id.linearLayout1;
                                                                    View view7 = view2 = dd2_2.a(n3, view);
                                                                    view7 = (LinearLayout)view2;
                                                                    if (view7 != null) {
                                                                        n3 = R$id.listHeader;
                                                                        View view8 = view2 = dd2_2.a(n3, view);
                                                                        view8 = (TextView)view2;
                                                                        if (view8 != null) {
                                                                            n3 = R$id.okay_button;
                                                                            Object object14 = view2 = dd2_2.a(n3, view);
                                                                            object14 = (AjioTextView)view2;
                                                                            if (object14 != null) {
                                                                                n3 = R$id.orderList;
                                                                                Object object15 = view2 = dd2_2.a(n3, view);
                                                                                object15 = (RecyclerView)view2;
                                                                                if (object15 != null) {
                                                                                    n3 = R$id.platform_fee_tv;
                                                                                    Object object16 = view2 = dd2_2.a(n3, view);
                                                                                    object16 = (AjioTextView)view2;
                                                                                    if (object16 != null) {
                                                                                        n3 = R$id.platform_lable_tv_fee;
                                                                                        Object object17 = view2 = dd2_2.a(n3, view);
                                                                                        object17 = (AjioTextView)view2;
                                                                                        if (object17 != null) {
                                                                                            n3 = R$id.policy_text;
                                                                                            Object object18 = view2 = dd2_2.a(n3, view);
                                                                                            object18 = (AjioTextView)view2;
                                                                                            if (object18 != null) {
                                                                                                n3 = R$id.priority_delivery_fee_tv;
                                                                                                Object object19 = view2 = dd2_2.a(n3, view);
                                                                                                object19 = (AjioTextView)view2;
                                                                                                if (object19 != null) {
                                                                                                    n3 = R$id.priority_delivery_label_tv_fee;
                                                                                                    Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                    object20 = (AjioTextView)view2;
                                                                                                    if (object20 != null) {
                                                                                                        n3 = R$id.priority_delivery_refunded_constaintlayout;
                                                                                                        Object object21 = view2 = dd2_2.a(n3, view);
                                                                                                        object21 = (ConstraintLayout)view2;
                                                                                                        if (object21 != null) {
                                                                                                            n3 = R$id.priority_delivery_title_tv;
                                                                                                            Object object22 = view2 = dd2_2.a(n3, view);
                                                                                                            object22 = (AjioTextView)view2;
                                                                                                            if (object22 != null) {
                                                                                                                n3 = R$id.return_fee_constaintlayout;
                                                                                                                Object object23 = view2 = dd2_2.a(n3, view);
                                                                                                                object23 = (ConstraintLayout)view2;
                                                                                                                if (object23 != null) {
                                                                                                                    n3 = R$id.self_ship_constaintlayout;
                                                                                                                    Object object24 = view2 = dd2_2.a(n3, view);
                                                                                                                    object24 = (ConstraintLayout)view2;
                                                                                                                    if (object24 != null) {
                                                                                                                        n3 = R$id.titleHeader;
                                                                                                                        View view9 = view2 = dd2_2.a(n3, view);
                                                                                                                        view9 = (TextView)view2;
                                                                                                                        if (view9 != null) {
                                                                                                                            n3 = R$id.titleHeaderTotalAmount;
                                                                                                                            Object object25 = view2 = dd2_2.a(n3, view);
                                                                                                                            object25 = (AjioTextView)view2;
                                                                                                                            if (object25 != null) {
                                                                                                                                n3 = R$id.titleRl;
                                                                                                                                View view10 = view2 = dd2_2.a(n3, view);
                                                                                                                                view10 = (RelativeLayout)view2;
                                                                                                                                if (view10 != null) {
                                                                                                                                    n3 = R$id.tv_priority_delivery_amount;
                                                                                                                                    Object object26 = view2 = dd2_2.a(n3, view);
                                                                                                                                    object26 = (AjioTextView)view2;
                                                                                                                                    if (object26 != null) {
                                                                                                                                        n3 = R$id.tv_return_fee_amount;
                                                                                                                                        Object object27 = view2 = dd2_2.a(n3, view);
                                                                                                                                        object27 = (AjioTextView)view2;
                                                                                                                                        if (object27 != null) {
                                                                                                                                            n3 = R$id.tv_return_fee_cta;
                                                                                                                                            Object object28 = view2 = dd2_2.a(n3, view);
                                                                                                                                            object28 = (AjioTextView)view2;
                                                                                                                                            if (object28 != null) {
                                                                                                                                                n3 = R$id.tv_return_fee_description;
                                                                                                                                                Object object29 = view2 = dd2_2.a(n3, view);
                                                                                                                                                object29 = (AjioTextView)view2;
                                                                                                                                                if (object29 != null) {
                                                                                                                                                    n3 = R$id.tv_return_fee_label;
                                                                                                                                                    Object object30 = view2 = dd2_2.a(n3, view);
                                                                                                                                                    object30 = (AjioTextView)view2;
                                                                                                                                                    if (object30 != null) {
                                                                                                                                                        n3 = R$id.tv_self_ship_amount;
                                                                                                                                                        Object object31 = view2 = dd2_2.a(n3, view);
                                                                                                                                                        object31 = (AjioTextView)view2;
                                                                                                                                                        if (object31 != null) {
                                                                                                                                                            n3 = R$id.tv_total_refund_amount;
                                                                                                                                                            Object object32 = view2 = dd2_2.a(n3, view);
                                                                                                                                                            object32 = (AjioTextView)view2;
                                                                                                                                                            if (object32 != null) {
                                                                                                                                                                Object object33 = view;
                                                                                                                                                                object33 = (ConstraintLayout)view;
                                                                                                                                                                FragmentReturnRefundBreakupBinding fragmentReturnRefundBreakupBinding = new FragmentReturnRefundBreakupBinding((ConstraintLayout)((Object)object33), (AjioTextView)object2, (AjioTextView)object3, (FrameLayout)view3, (AjioTextView)object4, (AjioTextView)object5, (ConstraintLayout)((Object)object6), (ConstraintLayout)((Object)object7), (RelativeLayout)view4, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, view5, (AjioTextView)object13, (ImageView)view6, (LinearLayout)view7, (TextView)view8, (AjioTextView)object14, (RecyclerView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19, (AjioTextView)object20, (ConstraintLayout)((Object)object21), (AjioTextView)object22, (ConstraintLayout)((Object)object23), (ConstraintLayout)((Object)object24), (TextView)view9, (AjioTextView)object25, (RelativeLayout)view10, (AjioTextView)object26, (AjioTextView)object27, (AjioTextView)object28, (AjioTextView)object29, (AjioTextView)object30, (AjioTextView)object31, (AjioTextView)object32);
                                                                                                                                                                return fragmentReturnRefundBreakupBinding;
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

    public static FragmentReturnRefundBreakupBinding inflate(LayoutInflater layoutInflater) {
        return FragmentReturnRefundBreakupBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentReturnRefundBreakupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_return_refund_breakup;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentReturnRefundBreakupBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

