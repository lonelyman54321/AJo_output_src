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

public final class OrderSummaryEarnpointsLayoutLuxeBinding
implements BC3 {
    public final TextView ajioWalletAmount;
    public final LinearLayout ajioWalletContainer;
    public final TextView ajioWalletInTxt;
    public final TextView ajioWalletTxt;
    public final LinearLayout detailsContainer;
    public final TextView loyaltyAmount;
    public final TextView loyaltyAmountTxt;
    public final LinearLayout loyaltyContainer;
    public final ImageView oselrIvLogo;
    public final TextView oselrTvEarnPoint;
    public final TextView oselrTvMoreDetails;
    private final ConstraintLayout rootView;

    private OrderSummaryEarnpointsLayoutLuxeBinding(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, LinearLayout linearLayout2, TextView textView4, TextView textView5, LinearLayout linearLayout3, ImageView imageView, TextView textView6, TextView textView7) {
        this.rootView = constraintLayout;
        this.ajioWalletAmount = textView;
        this.ajioWalletContainer = linearLayout;
        this.ajioWalletInTxt = textView2;
        this.ajioWalletTxt = textView3;
        this.detailsContainer = linearLayout2;
        this.loyaltyAmount = textView4;
        this.loyaltyAmountTxt = textView5;
        this.loyaltyContainer = linearLayout3;
        this.oselrIvLogo = imageView;
        this.oselrTvEarnPoint = textView6;
        this.oselrTvMoreDetails = textView7;
    }

    public static OrderSummaryEarnpointsLayoutLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_wallet_amount;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.ajioWalletContainer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.ajio_wallet_in_txt;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.ajio_wallet_txt;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.detailsContainer;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (LinearLayout)view;
                        if (view6 != null) {
                            n3 = R$id.loyalty_amount;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                n3 = R$id.loyalty_amount_txt;
                                View view8 = view = dd2_2.a(n3, object);
                                view8 = (TextView)view;
                                if (view8 != null) {
                                    n3 = R$id.loyaltyContainer;
                                    View view9 = view = dd2_2.a(n3, object);
                                    view9 = (LinearLayout)view;
                                    if (view9 != null) {
                                        n3 = R$id.oselrIvLogo;
                                        View view10 = view = dd2_2.a(n3, object);
                                        view10 = (ImageView)view;
                                        if (view10 != null) {
                                            n3 = R$id.oselrTvEarnPoint;
                                            View view11 = view = dd2_2.a(n3, object);
                                            view11 = (TextView)view;
                                            if (view11 != null) {
                                                n3 = R$id.oselrTvMoreDetails;
                                                View view12 = view = dd2_2.a(n3, object);
                                                view12 = (TextView)view;
                                                if (view12 != null) {
                                                    Object object2 = object;
                                                    object2 = (ConstraintLayout)((Object)object);
                                                    OrderSummaryEarnpointsLayoutLuxeBinding orderSummaryEarnpointsLayoutLuxeBinding = new OrderSummaryEarnpointsLayoutLuxeBinding((ConstraintLayout)((Object)object2), (TextView)view2, (LinearLayout)view3, (TextView)view4, (TextView)view5, (LinearLayout)view6, (TextView)view7, (TextView)view8, (LinearLayout)view9, (ImageView)view10, (TextView)view11, (TextView)view12);
                                                    return orderSummaryEarnpointsLayoutLuxeBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderSummaryEarnpointsLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return OrderSummaryEarnpointsLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static OrderSummaryEarnpointsLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_summary_earnpoints_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderSummaryEarnpointsLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

