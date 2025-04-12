/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCartSummaryRefreshBinding
implements BC3 {
    public final ImageView backgroundIv;
    public final TextView bagSavingTv;
    public final TextView bagTotalTv;
    public final LinearLayout checkoutLayoutCredit;
    public final LinearLayout convenienceFeeCartSummaryView;
    public final TextView couponSavingTv;
    public final TextView orderSummaryTv;
    public final TextView promoSavingTv;
    private final LinearLayout rootView;
    public final ConstraintLayout rowCartLayoutSummary;
    public final ConstraintLayout rowCartSummaryLayoutBagSaving;
    public final ConstraintLayout rowCartSummaryLayoutCouponSaving;
    public final ConstraintLayout rowCartSummaryLayoutDelivery;
    public final ConstraintLayout rowCartSummaryLayoutGst;
    public final ConstraintLayout rowCartSummaryLayoutPromoSaving;
    public final TextView rowCartSummaryLblDelivery;
    public final TextView rowCartSummaryTvBagSaving;
    public final TextView rowCartSummaryTvBagTotal;
    public final TextView rowCartSummaryTvCouponSaving;
    public final TextView rowCartSummaryTvDelivery;
    public final TextView rowCartSummaryTvGst;
    public final TextView rowCartSummaryTvPromoSaving;
    public final TextView rowCartSummaryTvTotal;
    public final TextView totalTv;

    private RowCartSummaryRefreshBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView3, TextView textView4, TextView textView5, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14) {
        this.rootView = linearLayout;
        this.backgroundIv = imageView;
        this.bagSavingTv = textView;
        this.bagTotalTv = textView2;
        this.checkoutLayoutCredit = linearLayout2;
        this.convenienceFeeCartSummaryView = linearLayout3;
        this.couponSavingTv = textView3;
        this.orderSummaryTv = textView4;
        this.promoSavingTv = textView5;
        this.rowCartLayoutSummary = constraintLayout;
        this.rowCartSummaryLayoutBagSaving = constraintLayout2;
        this.rowCartSummaryLayoutCouponSaving = constraintLayout3;
        this.rowCartSummaryLayoutDelivery = constraintLayout4;
        this.rowCartSummaryLayoutGst = constraintLayout5;
        this.rowCartSummaryLayoutPromoSaving = constraintLayout6;
        this.rowCartSummaryLblDelivery = textView6;
        this.rowCartSummaryTvBagSaving = textView7;
        this.rowCartSummaryTvBagTotal = textView8;
        this.rowCartSummaryTvCouponSaving = textView9;
        this.rowCartSummaryTvDelivery = textView10;
        this.rowCartSummaryTvGst = textView11;
        this.rowCartSummaryTvPromoSaving = textView12;
        this.rowCartSummaryTvTotal = textView13;
        this.totalTv = textView14;
    }

    public static RowCartSummaryRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.backgroundIv;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.bagSavingTv;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (TextView)view2;
            if (view4 != null) {
                n3 = R$id.bagTotalTv;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.checkout_layout_credit;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (LinearLayout)view2;
                    if (view6 != null) {
                        n3 = R$id.convenience_fee_cart_summary_view;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (LinearLayout)view2;
                        if (view7 != null) {
                            n3 = R$id.couponSavingTv;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (TextView)view2;
                            if (view8 != null) {
                                n3 = R$id.orderSummaryTv;
                                View view9 = view2 = dd2_2.a(n3, view);
                                view9 = (TextView)view2;
                                if (view9 != null) {
                                    n3 = R$id.promoSavingTv;
                                    View view10 = view2 = dd2_2.a(n3, view);
                                    view10 = (TextView)view2;
                                    if (view10 != null) {
                                        n3 = R$id.row_cart_layout_summary;
                                        Object object2 = view2 = dd2_2.a(n3, view);
                                        object2 = (ConstraintLayout)view2;
                                        if (object2 != null) {
                                            n3 = R$id.row_cart_summary_layout_bag_saving;
                                            Object object3 = view2 = dd2_2.a(n3, view);
                                            object3 = (ConstraintLayout)view2;
                                            if (object3 != null) {
                                                n3 = R$id.row_cart_summary_layout_coupon_saving;
                                                Object object4 = view2 = dd2_2.a(n3, view);
                                                object4 = (ConstraintLayout)view2;
                                                if (object4 != null) {
                                                    n3 = R$id.row_cart_summary_layout_delivery;
                                                    Object object5 = view2 = dd2_2.a(n3, view);
                                                    object5 = (ConstraintLayout)view2;
                                                    if (object5 != null) {
                                                        n3 = R$id.row_cart_summary_layout_gst;
                                                        Object object6 = view2 = dd2_2.a(n3, view);
                                                        object6 = (ConstraintLayout)view2;
                                                        if (object6 != null) {
                                                            n3 = R$id.row_cart_summary_layout_promo_saving;
                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                            object7 = (ConstraintLayout)view2;
                                                            if (object7 != null) {
                                                                n3 = R$id.row_cart_summary_lbl_delivery;
                                                                View view11 = view2 = dd2_2.a(n3, view);
                                                                view11 = (TextView)view2;
                                                                if (view11 != null) {
                                                                    n3 = R$id.row_cart_summary_tv_bag_saving;
                                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                                    view12 = (TextView)view2;
                                                                    if (view12 != null) {
                                                                        n3 = R$id.row_cart_summary_tv_bag_total;
                                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                                        view13 = (TextView)view2;
                                                                        if (view13 != null) {
                                                                            n3 = R$id.row_cart_summary_tv_coupon_saving;
                                                                            View view14 = view2 = dd2_2.a(n3, view);
                                                                            view14 = (TextView)view2;
                                                                            if (view14 != null) {
                                                                                n3 = R$id.row_cart_summary_tv_delivery;
                                                                                View view15 = view2 = dd2_2.a(n3, view);
                                                                                view15 = (TextView)view2;
                                                                                if (view15 != null) {
                                                                                    n3 = R$id.row_cart_summary_tv_gst;
                                                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                                                    view16 = (TextView)view2;
                                                                                    if (view16 != null) {
                                                                                        n3 = R$id.row_cart_summary_tv_promo_saving;
                                                                                        View view17 = view2 = dd2_2.a(n3, view);
                                                                                        view17 = (TextView)view2;
                                                                                        if (view17 != null) {
                                                                                            n3 = R$id.row_cart_summary_tv_total;
                                                                                            View view18 = view2 = dd2_2.a(n3, view);
                                                                                            view18 = (TextView)view2;
                                                                                            if (view18 != null) {
                                                                                                n3 = R$id.totalTv;
                                                                                                View view19 = view2 = dd2_2.a(n3, view);
                                                                                                view19 = (TextView)view2;
                                                                                                if (view19 != null) {
                                                                                                    View view20 = view;
                                                                                                    view20 = (LinearLayout)view;
                                                                                                    RowCartSummaryRefreshBinding rowCartSummaryRefreshBinding = new RowCartSummaryRefreshBinding((LinearLayout)view20, (ImageView)view3, (TextView)view4, (TextView)view5, (LinearLayout)view6, (LinearLayout)view7, (TextView)view8, (TextView)view9, (TextView)view10, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object5), (ConstraintLayout)((Object)object6), (ConstraintLayout)((Object)object7), (TextView)view11, (TextView)view12, (TextView)view13, (TextView)view14, (TextView)view15, (TextView)view16, (TextView)view17, (TextView)view18, (TextView)view19);
                                                                                                    return rowCartSummaryRefreshBinding;
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

    public static RowCartSummaryRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCartSummaryRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartSummaryRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_summary_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartSummaryRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

