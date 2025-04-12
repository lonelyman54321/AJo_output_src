/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class AjioCashTransferStatusLayoutBinding
implements BC3 {
    public final AjioTextView ajioCashMsg;
    public final AjioTextView ajioCashStatusMessage;
    public final RelativeLayout continueBtn;
    public final AjioTextView continueShopping;
    private final RelativeLayout rootView;
    public final LinearLayout successLayout;
    public final AjioTextView transferDetails;

    private AjioCashTransferStatusLayoutBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RelativeLayout relativeLayout2, AjioTextView ajioTextView3, LinearLayout linearLayout, AjioTextView ajioTextView4) {
        this.rootView = relativeLayout;
        this.ajioCashMsg = ajioTextView;
        this.ajioCashStatusMessage = ajioTextView2;
        this.continueBtn = relativeLayout2;
        this.continueShopping = ajioTextView3;
        this.successLayout = linearLayout;
        this.transferDetails = ajioTextView4;
    }

    public static AjioCashTransferStatusLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_cash_msg;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.ajio_cash_status_message;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.continue_btn;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (RelativeLayout)view;
                if (view2 != null) {
                    n3 = R$id.continue_shopping;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.success_layout;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (LinearLayout)view;
                        if (view3 != null) {
                            n3 = R$id.transfer_details;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                Object object6 = object;
                                object6 = (RelativeLayout)object;
                                AjioCashTransferStatusLayoutBinding ajioCashTransferStatusLayoutBinding = new AjioCashTransferStatusLayoutBinding((RelativeLayout)object6, (AjioTextView)object2, (AjioTextView)object3, (RelativeLayout)view2, (AjioTextView)object4, (LinearLayout)view3, (AjioTextView)object5);
                                return ajioCashTransferStatusLayoutBinding;
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

    public static AjioCashTransferStatusLayoutBinding inflate(LayoutInflater layoutInflater) {
        return AjioCashTransferStatusLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static AjioCashTransferStatusLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ajio_cash_transfer_status_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AjioCashTransferStatusLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

