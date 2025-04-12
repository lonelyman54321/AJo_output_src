/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowShippingAddressLuxBinding
implements BC3 {
    public final Guideline labBarrier;
    public final LinearLayout labLayout;
    public final View labVSep;
    private final LinearLayout rootView;
    public final CardView rowShippingAddress;
    public final TextView shippingAddressGap;
    public final AjioTextView shippingAddressLblDefault;
    public final AjioTextView shippingAddressLblEdit;
    public final AjioTextView shippingAddressLblMobile;
    public final RadioButton shippingAddressRadioBtn;
    public final AjioTextView shippingAddressTvAddress;
    public final AjioTextView shippingAddressTvMobile;
    public final AjioTextView shippingAddressTvName;

    private RowShippingAddressLuxBinding(LinearLayout linearLayout, Guideline guideline, LinearLayout linearLayout2, View view, CardView cardView, TextView textView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, RadioButton radioButton, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = linearLayout;
        this.labBarrier = guideline;
        this.labLayout = linearLayout2;
        this.labVSep = view;
        this.rowShippingAddress = cardView;
        this.shippingAddressGap = textView;
        this.shippingAddressLblDefault = ajioTextView;
        this.shippingAddressLblEdit = ajioTextView2;
        this.shippingAddressLblMobile = ajioTextView3;
        this.shippingAddressRadioBtn = radioButton;
        this.shippingAddressTvAddress = ajioTextView4;
        this.shippingAddressTvMobile = ajioTextView5;
        this.shippingAddressTvName = ajioTextView6;
    }

    public static RowShippingAddressLuxBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.labBarrier;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (Guideline)view2;
        if (view3 != null) {
            View view4 = view;
            view4 = (LinearLayout)view;
            n3 = R$id.labVSep;
            View view5 = dd2_2.a(n3, view);
            if (view5 != null) {
                n3 = R$id.row_shipping_address;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (CardView)view2;
                if (object2 != null) {
                    n3 = R$id.shipping_address_gap;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.shipping_address_lbl_default;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioTextView)view2;
                        if (object3 != null) {
                            n3 = R$id.shipping_address_lbl_edit;
                            Object object4 = view2 = dd2_2.a(n3, view);
                            object4 = (AjioTextView)view2;
                            if (object4 != null) {
                                n3 = R$id.shipping_address_lbl_mobile;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (AjioTextView)view2;
                                if (object5 != null) {
                                    n3 = R$id.shipping_address_radioBtn;
                                    View view7 = view2 = dd2_2.a(n3, view);
                                    view7 = (RadioButton)view2;
                                    if (view7 != null) {
                                        n3 = R$id.shipping_address_tv_address;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (AjioTextView)view2;
                                        if (object6 != null) {
                                            n3 = R$id.shipping_address_tv_mobile;
                                            Object object7 = view2 = dd2_2.a(n3, view);
                                            object7 = (AjioTextView)view2;
                                            if (object7 != null) {
                                                n3 = R$id.shipping_address_tv_name;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (AjioTextView)view2;
                                                if (object8 != null) {
                                                    object = new RowShippingAddressLuxBinding((LinearLayout)view4, (Guideline)view3, (LinearLayout)view4, view5, (CardView)((Object)object2), (TextView)view6, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (RadioButton)view7, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8);
                                                    return object;
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

    public static RowShippingAddressLuxBinding inflate(LayoutInflater layoutInflater) {
        return RowShippingAddressLuxBinding.inflate(layoutInflater, null, false);
    }

    public static RowShippingAddressLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_shipping_address_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowShippingAddressLuxBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

