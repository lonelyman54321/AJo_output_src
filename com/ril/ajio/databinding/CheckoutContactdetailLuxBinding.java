/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CheckoutContactdetailLuxBinding
implements BC3 {
    public final AjioTextView lblContactDetail;
    public final AjioTextView lblContactDetailInfo;
    public final AjioEditText mobileEt;
    public final AjioEditText nameEt;
    private final LinearLayout rootView;
    public final AjioTextView tvNameError;
    public final AjioTextView tvPhoneError;

    private CheckoutContactdetailLuxBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioEditText ajioEditText, AjioEditText ajioEditText2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = linearLayout;
        this.lblContactDetail = ajioTextView;
        this.lblContactDetailInfo = ajioTextView2;
        this.mobileEt = ajioEditText;
        this.nameEt = ajioEditText2;
        this.tvNameError = ajioTextView3;
        this.tvPhoneError = ajioTextView4;
    }

    public static CheckoutContactdetailLuxBinding bind(View object) {
        View view;
        int n3 = R$id.lbl_contact_detail;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.lbl_contact_detail_info;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.mobile_et;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioEditText)view;
                if (object4 != null) {
                    n3 = R$id.name_et;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioEditText)view;
                    if (object5 != null) {
                        n3 = R$id.tv_name_error;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.tv_phone_error;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                Object object8 = object;
                                object8 = (LinearLayout)object;
                                CheckoutContactdetailLuxBinding checkoutContactdetailLuxBinding = new CheckoutContactdetailLuxBinding((LinearLayout)object8, (AjioTextView)object2, (AjioTextView)object3, (AjioEditText)object4, (AjioEditText)object5, (AjioTextView)object6, (AjioTextView)object7);
                                return checkoutContactdetailLuxBinding;
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

    public static CheckoutContactdetailLuxBinding inflate(LayoutInflater layoutInflater) {
        return CheckoutContactdetailLuxBinding.inflate(layoutInflater, null, false);
    }

    public static CheckoutContactdetailLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.checkout_contactdetail_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CheckoutContactdetailLuxBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

