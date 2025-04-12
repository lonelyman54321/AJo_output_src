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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnOrderDeliveryAddressBinding
implements BC3 {
    public final AjioTextView addressCustomerName;
    public final LinearLayout mobileNumberDetails;
    public final AjioTextView mobileNumberTitle;
    public final AjioTextView mobileNumberValue;
    public final AjioTextView pickupaddress;
    public final LinearLayout returnItemsListChilditemAddress;
    private final LinearLayout rootView;

    private ReturnOrderDeliveryAddressBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.addressCustomerName = ajioTextView;
        this.mobileNumberDetails = linearLayout2;
        this.mobileNumberTitle = ajioTextView2;
        this.mobileNumberValue = ajioTextView3;
        this.pickupaddress = ajioTextView4;
        this.returnItemsListChilditemAddress = linearLayout3;
    }

    public static ReturnOrderDeliveryAddressBinding bind(View object) {
        View view;
        int n3 = R$id.address_customer_name;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.mobile_number_details;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                n3 = R$id.mobile_number_title;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.mobile_number_value;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.pickupaddress;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.return_items_list_childitem_address;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (LinearLayout)view;
                            if (view3 != null) {
                                Object object6 = object;
                                object6 = (LinearLayout)object;
                                ReturnOrderDeliveryAddressBinding returnOrderDeliveryAddressBinding = new ReturnOrderDeliveryAddressBinding((LinearLayout)object6, (AjioTextView)object2, (LinearLayout)view2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (LinearLayout)view3);
                                return returnOrderDeliveryAddressBinding;
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

    public static ReturnOrderDeliveryAddressBinding inflate(LayoutInflater layoutInflater) {
        return ReturnOrderDeliveryAddressBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnOrderDeliveryAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_order_delivery_address;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnOrderDeliveryAddressBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

