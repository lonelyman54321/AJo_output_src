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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ExchangeReturnCancelDialogLayoutBinding
implements BC3 {
    public final AjioButton btnExchangeReturnCancelDialogNo;
    public final AjioButton btnExchangeReturnCancelDialogYes;
    private final LinearLayout rootView;
    public final AjioTextView textMsg1;
    public final AjioTextView textMsg2;

    private ExchangeReturnCancelDialogLayoutBinding(LinearLayout linearLayout, AjioButton ajioButton, AjioButton ajioButton2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.btnExchangeReturnCancelDialogNo = ajioButton;
        this.btnExchangeReturnCancelDialogYes = ajioButton2;
        this.textMsg1 = ajioTextView;
        this.textMsg2 = ajioTextView2;
    }

    public static ExchangeReturnCancelDialogLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.btn_exchange_return_cancel_dialog_no;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioButton)view;
        if (object2 != null) {
            n3 = R$id.btn_exchange_return_cancel_dialog_yes;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioButton)view;
            if (object3 != null) {
                n3 = R$id.text_msg_1;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.text_msg_2;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (LinearLayout)object;
                        ExchangeReturnCancelDialogLayoutBinding exchangeReturnCancelDialogLayoutBinding = new ExchangeReturnCancelDialogLayoutBinding((LinearLayout)object6, (AjioButton)object2, (AjioButton)object3, (AjioTextView)object4, (AjioTextView)object5);
                        return exchangeReturnCancelDialogLayoutBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ExchangeReturnCancelDialogLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ExchangeReturnCancelDialogLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ExchangeReturnCancelDialogLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exchange_return_cancel_dialog_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExchangeReturnCancelDialogLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

