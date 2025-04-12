/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CartRowShippingAddressRevampBinding
implements BC3 {
    public final AppCompatImageView ivArrow;
    public final View labVSep;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowShippingAddress;
    public final AjioTextView shippingAddressAddressPincode;
    public final AjioTextView shippingAddressLblDefault;
    public final AjioTextView shippingAddressTvAddress;
    public final AjioTextView shippingAddressTvMobile;
    public final AjioTextView shippingAddressTvName;
    public final View viewEmptySpace;

    private CartRowShippingAddressRevampBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, View view2) {
        this.rootView = constraintLayout;
        this.ivArrow = appCompatImageView;
        this.labVSep = view;
        this.rowShippingAddress = constraintLayout2;
        this.shippingAddressAddressPincode = ajioTextView;
        this.shippingAddressLblDefault = ajioTextView2;
        this.shippingAddressTvAddress = ajioTextView3;
        this.shippingAddressTvMobile = ajioTextView4;
        this.shippingAddressTvName = ajioTextView5;
        this.viewEmptySpace = view2;
    }

    public static CartRowShippingAddressRevampBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.iv_arrow;
        Object object2 = view2 = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view2;
        if (object2 != null && (view = dd2_2.a(n3 = R$id.labVSep, object)) != null) {
            Object object3 = object;
            object3 = (ConstraintLayout)((Object)object);
            n3 = R$id.shipping_address_address_pincode;
            Object object4 = view2 = dd2_2.a(n3, object);
            object4 = (AjioTextView)view2;
            if (object4 != null) {
                n3 = R$id.shipping_address_lbl_default;
                Object object5 = view2 = dd2_2.a(n3, object);
                object5 = (AjioTextView)view2;
                if (object5 != null) {
                    n3 = R$id.shipping_address_tv_address;
                    Object object6 = view2 = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view2;
                    if (object6 != null) {
                        n3 = R$id.shipping_address_tv_mobile;
                        Object object7 = view2 = dd2_2.a(n3, object);
                        object7 = (AjioTextView)view2;
                        if (object7 != null) {
                            View view3;
                            n3 = R$id.shipping_address_tv_name;
                            Object object8 = view2 = dd2_2.a(n3, object);
                            object8 = (AjioTextView)view2;
                            if (object8 != null && (view3 = dd2_2.a(n3 = R$id.view_empty_space, object)) != null) {
                                object = new CartRowShippingAddressRevampBinding((ConstraintLayout)((Object)object3), (AppCompatImageView)((Object)object2), view, (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, view3);
                                return object;
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

    public static CartRowShippingAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return CartRowShippingAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static CartRowShippingAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_row_shipping_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartRowShippingAddressRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

