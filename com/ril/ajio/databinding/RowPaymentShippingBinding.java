/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowPaymentShippingBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final View rowPaymentShippingDivider;
    public final TextView rowPaymentShippingLblChange;
    public final TextView rowPaymentShippingLblShipping;
    public final TextView rowPaymentShippingTvAddress;
    public final TextView rowPaymentShippingTvCod;
    public final TextView rowPaymentShippingTvExpected;
    public final TextView rowPaymentShippingTvMobile;
    public final TextView rowPaymentShippingTvName;

    private RowPaymentShippingBinding(RelativeLayout relativeLayout, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = relativeLayout;
        this.rowPaymentShippingDivider = view;
        this.rowPaymentShippingLblChange = textView;
        this.rowPaymentShippingLblShipping = textView2;
        this.rowPaymentShippingTvAddress = textView3;
        this.rowPaymentShippingTvCod = textView4;
        this.rowPaymentShippingTvExpected = textView5;
        this.rowPaymentShippingTvMobile = textView6;
        this.rowPaymentShippingTvName = textView7;
    }

    public static RowPaymentShippingBinding bind(View object) {
        int n3 = R$id.row_payment_shipping_divider;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.row_payment_shipping_lbl_change;
            View view2 = object2 = dd2_2.a(n3, object);
            view2 = (TextView)object2;
            if (view2 != null) {
                n3 = R$id.row_payment_shipping_lbl_shipping;
                View view3 = object2 = dd2_2.a(n3, object);
                view3 = (TextView)object2;
                if (view3 != null) {
                    n3 = R$id.row_payment_shipping_tv_address;
                    View view4 = object2 = dd2_2.a(n3, object);
                    view4 = (TextView)object2;
                    if (view4 != null) {
                        n3 = R$id.row_payment_shipping_tv_cod;
                        View view5 = object2 = dd2_2.a(n3, object);
                        view5 = (TextView)object2;
                        if (view5 != null) {
                            n3 = R$id.row_payment_shipping_tv_expected;
                            View view6 = object2 = dd2_2.a(n3, object);
                            view6 = (TextView)object2;
                            if (view6 != null) {
                                n3 = R$id.row_payment_shipping_tv_mobile;
                                View view7 = object2 = dd2_2.a(n3, object);
                                view7 = (TextView)object2;
                                if (view7 != null) {
                                    n3 = R$id.row_payment_shipping_tv_name;
                                    View view8 = object2 = dd2_2.a(n3, object);
                                    view8 = (TextView)object2;
                                    if (view8 != null) {
                                        RowPaymentShippingBinding rowPaymentShippingBinding;
                                        Object object3 = object;
                                        object3 = (RelativeLayout)object;
                                        object2 = rowPaymentShippingBinding;
                                        rowPaymentShippingBinding = new RowPaymentShippingBinding((RelativeLayout)object3, view, (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8);
                                        return rowPaymentShippingBinding;
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

    public static RowPaymentShippingBinding inflate(LayoutInflater layoutInflater) {
        return RowPaymentShippingBinding.inflate(layoutInflater, null, false);
    }

    public static RowPaymentShippingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_payment_shipping;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPaymentShippingBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

