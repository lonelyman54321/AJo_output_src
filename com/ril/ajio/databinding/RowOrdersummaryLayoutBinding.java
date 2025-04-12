/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowOrdersummaryLayoutBinding
implements BC3 {
    public final AjioTextView bankOfferText;
    public final AjioTextView creditText;
    public final AjioTextView loyaltyText;
    private final LinearLayout rootView;
    public final AjioAspectRatioImageView rowCartSummaryImvDeliveryInfo;
    public final LinearLayout rowCartSummaryLayoutActualPaid;
    public final LinearLayout rowCartSummaryLayoutBagSaving;
    public final LinearLayout rowCartSummaryLayoutBankOffer;
    public final LinearLayout rowCartSummaryLayoutCouponSaving;
    public final LinearLayout rowCartSummaryLayoutCredit;
    public final RelativeLayout rowCartSummaryLayoutDelivery;
    public final LinearLayout rowCartSummaryLayoutGiftwrap;
    public final LinearLayout rowCartSummaryLayoutGst;
    public final LinearLayout rowCartSummaryLayoutLoyalty;
    public final LinearLayout rowCartSummaryLayoutPromoSaving;
    public final AjioTextView rowCartSummaryLblDelivery;
    public final AjioTextView rowCartSummaryTvActual;
    public final AjioTextView rowCartSummaryTvActualTxt;
    public final AjioTextView rowCartSummaryTvBagSaving;
    public final AjioTextView rowCartSummaryTvBagTotal;
    public final AjioTextView rowCartSummaryTvBankOffer;
    public final AjioTextView rowCartSummaryTvCouponSaving;
    public final AjioTextView rowCartSummaryTvCredit;
    public final AjioTextView rowCartSummaryTvDelivery;
    public final AjioTextView rowCartSummaryTvGiftwrap;
    public final AjioTextView rowCartSummaryTvGst;
    public final AjioTextView rowCartSummaryTvLoyalty;
    public final AjioTextView rowCartSummaryTvPromoSaving;
    public final AjioTextView rowCartSummaryTvTotal;
    public final AjioTextView tvOrdersummaryLabel;

    private RowOrdersummaryLayoutBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioAspectRatioImageView ajioAspectRatioImageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, RelativeLayout relativeLayout, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12, AjioTextView ajioTextView13, AjioTextView ajioTextView14, AjioTextView ajioTextView15, AjioTextView ajioTextView16, AjioTextView ajioTextView17, AjioTextView ajioTextView18) {
        this.rootView = linearLayout;
        this.bankOfferText = ajioTextView;
        this.creditText = ajioTextView2;
        this.loyaltyText = ajioTextView3;
        this.rowCartSummaryImvDeliveryInfo = ajioAspectRatioImageView;
        this.rowCartSummaryLayoutActualPaid = linearLayout2;
        this.rowCartSummaryLayoutBagSaving = linearLayout3;
        this.rowCartSummaryLayoutBankOffer = linearLayout4;
        this.rowCartSummaryLayoutCouponSaving = linearLayout5;
        this.rowCartSummaryLayoutCredit = linearLayout6;
        this.rowCartSummaryLayoutDelivery = relativeLayout;
        this.rowCartSummaryLayoutGiftwrap = linearLayout7;
        this.rowCartSummaryLayoutGst = linearLayout8;
        this.rowCartSummaryLayoutLoyalty = linearLayout9;
        this.rowCartSummaryLayoutPromoSaving = linearLayout10;
        this.rowCartSummaryLblDelivery = ajioTextView4;
        this.rowCartSummaryTvActual = ajioTextView5;
        this.rowCartSummaryTvActualTxt = ajioTextView6;
        this.rowCartSummaryTvBagSaving = ajioTextView7;
        this.rowCartSummaryTvBagTotal = ajioTextView8;
        this.rowCartSummaryTvBankOffer = ajioTextView9;
        this.rowCartSummaryTvCouponSaving = ajioTextView10;
        this.rowCartSummaryTvCredit = ajioTextView11;
        this.rowCartSummaryTvDelivery = ajioTextView12;
        this.rowCartSummaryTvGiftwrap = ajioTextView13;
        this.rowCartSummaryTvGst = ajioTextView14;
        this.rowCartSummaryTvLoyalty = ajioTextView15;
        this.rowCartSummaryTvPromoSaving = ajioTextView16;
        this.rowCartSummaryTvTotal = ajioTextView17;
        this.tvOrdersummaryLabel = ajioTextView18;
    }

    public static RowOrdersummaryLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.bankOffer_text;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.credit_text;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.loyalty_text;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.row_cart_summary_imv_delivery_info;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioAspectRatioImageView)view2;
                    if (object5 != null) {
                        n3 = R$id.row_cart_summary_layout_actual_paid;
                        View view3 = view2 = dd2_2.a(n3, view);
                        view3 = (LinearLayout)view2;
                        if (view3 != null) {
                            n3 = R$id.row_cart_summary_layout_bag_saving;
                            View view4 = view2 = dd2_2.a(n3, view);
                            view4 = (LinearLayout)view2;
                            if (view4 != null) {
                                n3 = R$id.row_cart_summary_layout_bankOffer;
                                View view5 = view2 = dd2_2.a(n3, view);
                                view5 = (LinearLayout)view2;
                                if (view5 != null) {
                                    n3 = R$id.row_cart_summary_layout_coupon_saving;
                                    View view6 = view2 = dd2_2.a(n3, view);
                                    view6 = (LinearLayout)view2;
                                    if (view6 != null) {
                                        n3 = R$id.row_cart_summary_layout_credit;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (LinearLayout)view2;
                                        if (view7 != null) {
                                            n3 = R$id.row_cart_summary_layout_delivery;
                                            View view8 = view2 = dd2_2.a(n3, view);
                                            view8 = (RelativeLayout)view2;
                                            if (view8 != null) {
                                                n3 = R$id.row_cart_summary_layout_giftwrap;
                                                View view9 = view2 = dd2_2.a(n3, view);
                                                view9 = (LinearLayout)view2;
                                                if (view9 != null) {
                                                    n3 = R$id.row_cart_summary_layout_gst;
                                                    View view10 = view2 = dd2_2.a(n3, view);
                                                    view10 = (LinearLayout)view2;
                                                    if (view10 != null) {
                                                        n3 = R$id.row_cart_summary_layout_loyalty;
                                                        View view11 = view2 = dd2_2.a(n3, view);
                                                        view11 = (LinearLayout)view2;
                                                        if (view11 != null) {
                                                            n3 = R$id.row_cart_summary_layout_promo_saving;
                                                            View view12 = view2 = dd2_2.a(n3, view);
                                                            view12 = (LinearLayout)view2;
                                                            if (view12 != null) {
                                                                n3 = R$id.row_cart_summary_lbl_delivery;
                                                                Object object6 = view2 = dd2_2.a(n3, view);
                                                                object6 = (AjioTextView)view2;
                                                                if (object6 != null) {
                                                                    n3 = R$id.row_cart_summary_tv_actual;
                                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                                    object7 = (AjioTextView)view2;
                                                                    if (object7 != null) {
                                                                        n3 = R$id.row_cart_summary_tv_actual_txt;
                                                                        Object object8 = view2 = dd2_2.a(n3, view);
                                                                        object8 = (AjioTextView)view2;
                                                                        if (object8 != null) {
                                                                            n3 = R$id.row_cart_summary_tv_bag_saving;
                                                                            Object object9 = view2 = dd2_2.a(n3, view);
                                                                            object9 = (AjioTextView)view2;
                                                                            if (object9 != null) {
                                                                                n3 = R$id.row_cart_summary_tv_bag_total;
                                                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                                                object10 = (AjioTextView)view2;
                                                                                if (object10 != null) {
                                                                                    n3 = R$id.row_cart_summary_tv_bankOffer;
                                                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                                                    object11 = (AjioTextView)view2;
                                                                                    if (object11 != null) {
                                                                                        n3 = R$id.row_cart_summary_tv_coupon_saving;
                                                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                                                        object12 = (AjioTextView)view2;
                                                                                        if (object12 != null) {
                                                                                            n3 = R$id.row_cart_summary_tv_credit;
                                                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                                                            object13 = (AjioTextView)view2;
                                                                                            if (object13 != null) {
                                                                                                n3 = R$id.row_cart_summary_tv_delivery;
                                                                                                Object object14 = view2 = dd2_2.a(n3, view);
                                                                                                object14 = (AjioTextView)view2;
                                                                                                if (object14 != null) {
                                                                                                    n3 = R$id.row_cart_summary_tv_giftwrap;
                                                                                                    Object object15 = view2 = dd2_2.a(n3, view);
                                                                                                    object15 = (AjioTextView)view2;
                                                                                                    if (object15 != null) {
                                                                                                        n3 = R$id.row_cart_summary_tv_gst;
                                                                                                        Object object16 = view2 = dd2_2.a(n3, view);
                                                                                                        object16 = (AjioTextView)view2;
                                                                                                        if (object16 != null) {
                                                                                                            n3 = R$id.row_cart_summary_tv_loyalty;
                                                                                                            Object object17 = view2 = dd2_2.a(n3, view);
                                                                                                            object17 = (AjioTextView)view2;
                                                                                                            if (object17 != null) {
                                                                                                                n3 = R$id.row_cart_summary_tv_promo_saving;
                                                                                                                Object object18 = view2 = dd2_2.a(n3, view);
                                                                                                                object18 = (AjioTextView)view2;
                                                                                                                if (object18 != null) {
                                                                                                                    n3 = R$id.row_cart_summary_tv_total;
                                                                                                                    Object object19 = view2 = dd2_2.a(n3, view);
                                                                                                                    object19 = (AjioTextView)view2;
                                                                                                                    if (object19 != null) {
                                                                                                                        n3 = R$id.tv_ordersummary_label;
                                                                                                                        Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                                        object20 = (AjioTextView)view2;
                                                                                                                        if (object20 != null) {
                                                                                                                            View view13 = view;
                                                                                                                            view13 = (LinearLayout)view;
                                                                                                                            RowOrdersummaryLayoutBinding rowOrdersummaryLayoutBinding = new RowOrdersummaryLayoutBinding((LinearLayout)view13, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioAspectRatioImageView)((Object)object5), (LinearLayout)view3, (LinearLayout)view4, (LinearLayout)view5, (LinearLayout)view6, (LinearLayout)view7, (RelativeLayout)view8, (LinearLayout)view9, (LinearLayout)view10, (LinearLayout)view11, (LinearLayout)view12, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19, (AjioTextView)object20);
                                                                                                                            return rowOrdersummaryLayoutBinding;
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

    public static RowOrdersummaryLayoutBinding inflate(LayoutInflater layoutInflater) {
        return RowOrdersummaryLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrdersummaryLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_ordersummary_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrdersummaryLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

