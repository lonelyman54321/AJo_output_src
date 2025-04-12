/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowOrderRevampPaymentBinding
implements BC3 {
    public final CardView cardView;
    private final RelativeLayout rootView;
    public final ImageView rowOrderPaymentImvArrow;
    public final ImageView rowOrderPaymentImvFive;
    public final ImageView rowOrderPaymentImvFour;
    public final ImageView rowOrderPaymentImvOne;
    public final ImageView rowOrderPaymentImvThree;
    public final ImageView rowOrderPaymentImvTwo;
    public final FrameLayout rowOrderPaymentLayoutClick;
    public final RelativeLayout rowOrderPaymentLayoutImv;
    public final RelativeLayout rowOrderPaymentLayoutInfo;
    public final AjioTextView rowOrderPaymentTvInfo;
    public final AjioTextView rowOrderPaymentTvMore;
    public final AjioTextView rowOrderPaymentTvOrderTotal;
    public final AjioTextView rowOrderPaymentTvStatus;

    private RowOrderRevampPaymentBinding(RelativeLayout relativeLayout, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, FrameLayout frameLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = relativeLayout;
        this.cardView = cardView;
        this.rowOrderPaymentImvArrow = imageView;
        this.rowOrderPaymentImvFive = imageView2;
        this.rowOrderPaymentImvFour = imageView3;
        this.rowOrderPaymentImvOne = imageView4;
        this.rowOrderPaymentImvThree = imageView5;
        this.rowOrderPaymentImvTwo = imageView6;
        this.rowOrderPaymentLayoutClick = frameLayout;
        this.rowOrderPaymentLayoutImv = relativeLayout2;
        this.rowOrderPaymentLayoutInfo = relativeLayout3;
        this.rowOrderPaymentTvInfo = ajioTextView;
        this.rowOrderPaymentTvMore = ajioTextView2;
        this.rowOrderPaymentTvOrderTotal = ajioTextView3;
        this.rowOrderPaymentTvStatus = ajioTextView4;
    }

    public static RowOrderRevampPaymentBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.card_view;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (CardView)view2;
        if (object2 != null) {
            n3 = R$id.row_order_payment_imv_arrow;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.row_order_payment_imv_five;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (ImageView)view2;
                if (view4 != null) {
                    n3 = R$id.row_order_payment_imv_four;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (ImageView)view2;
                    if (view5 != null) {
                        n3 = R$id.row_order_payment_imv_one;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (ImageView)view2;
                        if (view6 != null) {
                            n3 = R$id.row_order_payment_imv_three;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (ImageView)view2;
                            if (view7 != null) {
                                n3 = R$id.row_order_payment_imv_two;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (ImageView)view2;
                                if (view8 != null) {
                                    n3 = R$id.row_order_payment_layout_click;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (FrameLayout)view2;
                                    if (view9 != null) {
                                        n3 = R$id.row_order_payment_layout_imv;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (RelativeLayout)view2;
                                        if (view10 != null) {
                                            n3 = R$id.row_order_payment_layout_info;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (RelativeLayout)view2;
                                            if (view11 != null) {
                                                n3 = R$id.row_order_payment_tv_info;
                                                Object object3 = view2 = dd2_2.a(n3, view);
                                                object3 = (AjioTextView)view2;
                                                if (object3 != null) {
                                                    n3 = R$id.row_order_payment_tv_more;
                                                    Object object4 = view2 = dd2_2.a(n3, view);
                                                    object4 = (AjioTextView)view2;
                                                    if (object4 != null) {
                                                        n3 = R$id.row_order_payment_tv_orderTotal;
                                                        Object object5 = view2 = dd2_2.a(n3, view);
                                                        object5 = (AjioTextView)view2;
                                                        if (object5 != null) {
                                                            n3 = R$id.row_order_payment_tv_status;
                                                            Object object6 = view2 = dd2_2.a(n3, view);
                                                            object6 = (AjioTextView)view2;
                                                            if (object6 != null) {
                                                                View view12 = view;
                                                                view12 = (RelativeLayout)view;
                                                                RowOrderRevampPaymentBinding rowOrderRevampPaymentBinding = new RowOrderRevampPaymentBinding((RelativeLayout)view12, (CardView)((Object)object2), (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (ImageView)view8, (FrameLayout)view9, (RelativeLayout)view10, (RelativeLayout)view11, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
                                                                return rowOrderRevampPaymentBinding;
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

    public static RowOrderRevampPaymentBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderRevampPaymentBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderRevampPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_order_revamp_payment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderRevampPaymentBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

