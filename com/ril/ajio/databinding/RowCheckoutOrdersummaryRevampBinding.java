/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowCheckoutOrdersummaryRevampBinding
implements BC3 {
    public final AjioTextView bankOfferText;
    public final LinearLayout checkoutLayoutActualPaid;
    public final LinearLayout checkoutLayoutBagSaving;
    public final LinearLayout checkoutLayoutBankOffer;
    public final LinearLayout checkoutLayoutCouponSaving;
    public final LinearLayout checkoutLayoutCredit;
    public final RelativeLayout checkoutLayoutDelivery;
    public final LinearLayout checkoutLayoutGiftwrap;
    public final LinearLayout checkoutLayoutGst;
    public final LinearLayout checkoutLayoutLoyalty;
    public final LinearLayout checkoutLayoutPromoSaving;
    public final AjioTextView checkoutLblDelivery;
    public final AjioTextView checkoutTvActualTxt;
    public final TextView checkoutTvBagTotal;
    public final TextView checkoutTvBagTotalHeader;
    public final AjioTextView checkoutTvBalance;
    public final AjioTextView checkoutTvBankOffer;
    public final AjioTextView checkoutTvCoupon;
    public final AjioTextView checkoutTvDelivery;
    public final AjioTextView checkoutTvDiscount;
    public final AjioTextView checkoutTvGiftwrap;
    public final AjioTextView checkoutTvGst;
    public final AjioTextView checkoutTvLoyalty;
    public final AjioTextView checkoutTvPromo;
    public final AjioTextView checkoutTvTotal;
    public final LinearLayout convenienceFeeCartSummaryView;
    public final AjioTextView loyaltyText;
    private final LinearLayout rootView;

    private RowCheckoutOrdersummaryRevampBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, RelativeLayout relativeLayout, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, AjioTextView ajioTextView2, AjioTextView ajioTextView3, TextView textView, TextView textView2, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12, AjioTextView ajioTextView13, LinearLayout linearLayout11, AjioTextView ajioTextView14) {
        this.rootView = linearLayout;
        this.bankOfferText = ajioTextView;
        this.checkoutLayoutActualPaid = linearLayout2;
        this.checkoutLayoutBagSaving = linearLayout3;
        this.checkoutLayoutBankOffer = linearLayout4;
        this.checkoutLayoutCouponSaving = linearLayout5;
        this.checkoutLayoutCredit = linearLayout6;
        this.checkoutLayoutDelivery = relativeLayout;
        this.checkoutLayoutGiftwrap = linearLayout7;
        this.checkoutLayoutGst = linearLayout8;
        this.checkoutLayoutLoyalty = linearLayout9;
        this.checkoutLayoutPromoSaving = linearLayout10;
        this.checkoutLblDelivery = ajioTextView2;
        this.checkoutTvActualTxt = ajioTextView3;
        this.checkoutTvBagTotal = textView;
        this.checkoutTvBagTotalHeader = textView2;
        this.checkoutTvBalance = ajioTextView4;
        this.checkoutTvBankOffer = ajioTextView5;
        this.checkoutTvCoupon = ajioTextView6;
        this.checkoutTvDelivery = ajioTextView7;
        this.checkoutTvDiscount = ajioTextView8;
        this.checkoutTvGiftwrap = ajioTextView9;
        this.checkoutTvGst = ajioTextView10;
        this.checkoutTvLoyalty = ajioTextView11;
        this.checkoutTvPromo = ajioTextView12;
        this.checkoutTvTotal = ajioTextView13;
        this.convenienceFeeCartSummaryView = linearLayout11;
        this.loyaltyText = ajioTextView14;
    }

    public static RowCheckoutOrdersummaryRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.bankOffer_text;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.checkout_layout_actual_paid;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (LinearLayout)view2;
            if (view3 != null) {
                n3 = R$id.checkout_layout_bag_saving;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (LinearLayout)view2;
                if (view4 != null) {
                    n3 = R$id.checkout_layout_bankOffer;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (LinearLayout)view2;
                    if (view5 != null) {
                        n3 = R$id.checkout_layout_coupon_saving;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (LinearLayout)view2;
                        if (view6 != null) {
                            n3 = R$id.checkout_layout_credit;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (LinearLayout)view2;
                            if (view7 != null) {
                                n3 = R$id.checkout_layout_delivery;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (RelativeLayout)view2;
                                if (view8 != null) {
                                    n3 = R$id.checkout_layout_giftwrap;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (LinearLayout)view2;
                                    if (view9 != null) {
                                        n3 = R$id.checkout_layout_gst;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (LinearLayout)view2;
                                        if (view10 != null) {
                                            n3 = R$id.checkout_layout_loyalty;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (LinearLayout)view2;
                                            if (view11 != null) {
                                                n3 = R$id.checkout_layout_promo_saving;
                                                View view12 = view2 = dd2_2.a(n3, view);
                                                view12 = (LinearLayout)view2;
                                                if (view12 != null) {
                                                    n3 = R$id.checkout_lbl_delivery;
                                                    Object object3 = view2 = dd2_2.a(n3, view);
                                                    object3 = (AjioTextView)view2;
                                                    if (object3 != null) {
                                                        n3 = R$id.checkout_tv_actual_txt;
                                                        Object object4 = view2 = dd2_2.a(n3, view);
                                                        object4 = (AjioTextView)view2;
                                                        if (object4 != null) {
                                                            n3 = R$id.checkout_tv_bag_total;
                                                            View view13 = view2 = dd2_2.a(n3, view);
                                                            view13 = (TextView)view2;
                                                            if (view13 != null) {
                                                                n3 = R$id.checkout_tv_bag_total_header;
                                                                View view14 = view2 = dd2_2.a(n3, view);
                                                                view14 = (TextView)view2;
                                                                if (view14 != null) {
                                                                    n3 = R$id.checkout_tv_balance;
                                                                    Object object5 = view2 = dd2_2.a(n3, view);
                                                                    object5 = (AjioTextView)view2;
                                                                    if (object5 != null) {
                                                                        n3 = R$id.checkout_tv_bankOffer;
                                                                        Object object6 = view2 = dd2_2.a(n3, view);
                                                                        object6 = (AjioTextView)view2;
                                                                        if (object6 != null) {
                                                                            n3 = R$id.checkout_tv_coupon;
                                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                                            object7 = (AjioTextView)view2;
                                                                            if (object7 != null) {
                                                                                n3 = R$id.checkout_tv_delivery;
                                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                                object8 = (AjioTextView)view2;
                                                                                if (object8 != null) {
                                                                                    n3 = R$id.checkout_tv_discount;
                                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                                    object9 = (AjioTextView)view2;
                                                                                    if (object9 != null) {
                                                                                        n3 = R$id.checkout_tv_giftwrap;
                                                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                                                        object10 = (AjioTextView)view2;
                                                                                        if (object10 != null) {
                                                                                            n3 = R$id.checkout_tv_gst;
                                                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                                                            object11 = (AjioTextView)view2;
                                                                                            if (object11 != null) {
                                                                                                n3 = R$id.checkout_tv_loyalty;
                                                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                                                object12 = (AjioTextView)view2;
                                                                                                if (object12 != null) {
                                                                                                    n3 = R$id.checkout_tv_promo;
                                                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                                                    object13 = (AjioTextView)view2;
                                                                                                    if (object13 != null) {
                                                                                                        n3 = R$id.checkout_tv_total;
                                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                                        object14 = (AjioTextView)view2;
                                                                                                        if (object14 != null) {
                                                                                                            n3 = R$id.convenience_fee_cart_summary_view;
                                                                                                            View view15 = view2 = dd2_2.a(n3, view);
                                                                                                            view15 = (LinearLayout)view2;
                                                                                                            if (view15 != null) {
                                                                                                                n3 = R$id.loyalty_text;
                                                                                                                Object object15 = view2 = dd2_2.a(n3, view);
                                                                                                                object15 = (AjioTextView)view2;
                                                                                                                if (object15 != null) {
                                                                                                                    View view16 = view;
                                                                                                                    view16 = (LinearLayout)view;
                                                                                                                    RowCheckoutOrdersummaryRevampBinding rowCheckoutOrdersummaryRevampBinding = new RowCheckoutOrdersummaryRevampBinding((LinearLayout)view16, (AjioTextView)object2, (LinearLayout)view3, (LinearLayout)view4, (LinearLayout)view5, (LinearLayout)view6, (LinearLayout)view7, (RelativeLayout)view8, (LinearLayout)view9, (LinearLayout)view10, (LinearLayout)view11, (LinearLayout)view12, (AjioTextView)object3, (AjioTextView)object4, (TextView)view13, (TextView)view14, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (LinearLayout)view15, (AjioTextView)object15);
                                                                                                                    return rowCheckoutOrdersummaryRevampBinding;
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

    public static RowCheckoutOrdersummaryRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowCheckoutOrdersummaryRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowCheckoutOrdersummaryRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_checkout_ordersummary_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCheckoutOrdersummaryRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

