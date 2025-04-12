/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.ScrollView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioNonScrollableListView;
import com.ril.ajio.customviews.widgets.AjioOrderSummaryView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentOrderListDetailBinding
implements BC3 {
    public final AjioTextView addressLine1;
    public final AjioTextView addressLine2;
    public final AjioOrderSummaryView ajiobillview;
    public final AjioTextView customerName;
    public final AjioTextView dateOfOrder;
    public final View divider;
    public final AjioNonScrollableListView nonScrollListConsignment;
    public final AjioNonScrollableListView nonScrollListUnconsigned;
    public final AjioTextView orderCcHelp;
    public final AjioTextView orderCount;
    public final ScrollView orderDetailScrollview;
    public final AjioTextView orderId;
    public final LinearLayout orderIdDetails;
    public final LinearLayout orderInfoDetails;
    public final AjioTextView orderPaymentFailed;
    public final AjioTextView orderTotalCost;
    public final AjioProgressView orderitemdetailsProgressBar;
    public final AjioTextView paidThroughCod;
    public final LinearLayout paymentCodeLayout;
    public final AjioButton retryPayment;
    private final FrameLayout rootView;

    private FragmentOrderListDetailBinding(FrameLayout frameLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioOrderSummaryView ajioOrderSummaryView, AjioTextView ajioTextView3, AjioTextView ajioTextView4, View view, AjioNonScrollableListView ajioNonScrollableListView, AjioNonScrollableListView ajioNonScrollableListView2, AjioTextView ajioTextView5, AjioTextView ajioTextView6, ScrollView scrollView, AjioTextView ajioTextView7, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioProgressView ajioProgressView, AjioTextView ajioTextView10, LinearLayout linearLayout3, AjioButton ajioButton) {
        this.rootView = frameLayout;
        this.addressLine1 = ajioTextView;
        this.addressLine2 = ajioTextView2;
        this.ajiobillview = ajioOrderSummaryView;
        this.customerName = ajioTextView3;
        this.dateOfOrder = ajioTextView4;
        this.divider = view;
        this.nonScrollListConsignment = ajioNonScrollableListView;
        this.nonScrollListUnconsigned = ajioNonScrollableListView2;
        this.orderCcHelp = ajioTextView5;
        this.orderCount = ajioTextView6;
        this.orderDetailScrollview = scrollView;
        this.orderId = ajioTextView7;
        this.orderIdDetails = linearLayout;
        this.orderInfoDetails = linearLayout2;
        this.orderPaymentFailed = ajioTextView8;
        this.orderTotalCost = ajioTextView9;
        this.orderitemdetailsProgressBar = ajioProgressView;
        this.paidThroughCod = ajioTextView10;
        this.paymentCodeLayout = linearLayout3;
        this.retryPayment = ajioButton;
    }

    public static FragmentOrderListDetailBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.address_line1;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.address_line2;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.ajiobillview;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioOrderSummaryView)view2;
                if (object4 != null) {
                    n3 = R$id.customer_name;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        View view3;
                        n3 = R$id.date_of_order;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null && (view3 = dd2_2.a(n3 = R$id.divider, view)) != null) {
                            n3 = R$id.non_scroll_list_consignment;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioNonScrollableListView)view2;
                            if (object7 != null) {
                                n3 = R$id.non_scroll_list_unconsigned;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioNonScrollableListView)view2;
                                if (object8 != null) {
                                    n3 = R$id.order_cc_help;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.order_count;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.order_detail_scrollview;
                                            View view4 = view2 = dd2_2.a(n3, view);
                                            view4 = (ScrollView)view2;
                                            if (view4 != null) {
                                                n3 = R$id.order_id;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioTextView)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.order_id_details;
                                                    View view5 = view2 = dd2_2.a(n3, view);
                                                    view5 = (LinearLayout)view2;
                                                    if (view5 != null) {
                                                        n3 = R$id.order_info_details;
                                                        View view6 = view2 = dd2_2.a(n3, view);
                                                        view6 = (LinearLayout)view2;
                                                        if (view6 != null) {
                                                            n3 = R$id.order_payment_failed;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioTextView)view2;
                                                            if (object12 != null) {
                                                                n3 = R$id.order_total_cost;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioTextView)view2;
                                                                if (object13 != null) {
                                                                    n3 = R$id.orderitemdetails_progress_bar;
                                                                    Object object14 = view2 = dd2_2.a(n3, view);
                                                                    object14 = (AjioProgressView)view2;
                                                                    if (object14 != null) {
                                                                        n3 = R$id.paid_through_cod;
                                                                        Object object15 = view2 = dd2_2.a(n3, view);
                                                                        object15 = (AjioTextView)view2;
                                                                        if (object15 != null) {
                                                                            n3 = R$id.payment_code_layout;
                                                                            View view7 = view2 = dd2_2.a(n3, view);
                                                                            view7 = (LinearLayout)view2;
                                                                            if (view7 != null) {
                                                                                n3 = R$id.retry_payment;
                                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                                object16 = (AjioButton)view2;
                                                                                if (object16 != null) {
                                                                                    View view8 = view;
                                                                                    view8 = (FrameLayout)view;
                                                                                    FragmentOrderListDetailBinding fragmentOrderListDetailBinding = new FragmentOrderListDetailBinding((FrameLayout)view8, (AjioTextView)object2, (AjioTextView)object3, (AjioOrderSummaryView)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, view3, (AjioNonScrollableListView)((Object)object7), (AjioNonScrollableListView)((Object)object8), (AjioTextView)object9, (AjioTextView)object10, (ScrollView)view4, (AjioTextView)object11, (LinearLayout)view5, (LinearLayout)view6, (AjioTextView)object12, (AjioTextView)object13, (AjioProgressView)((Object)object14), (AjioTextView)object15, (LinearLayout)view7, (AjioButton)object16);
                                                                                    return fragmentOrderListDetailBinding;
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

    public static FragmentOrderListDetailBinding inflate(LayoutInflater layoutInflater) {
        return FragmentOrderListDetailBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentOrderListDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_order_list_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentOrderListDetailBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

