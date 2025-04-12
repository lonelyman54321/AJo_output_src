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

public final class ImpsTransactionLayoutBinding
implements BC3 {
    public final LinearLayout failureLayout;
    public final AjioTextView failureTransactionTv;
    public final AjioTextView impsStatusMessage;
    public final RelativeLayout rcsBankDetailsLayout;
    private final RelativeLayout rootView;
    public final LinearLayout successLayout;
    public final AjioTextView successTransactionTv;

    private ImpsTransactionLayoutBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RelativeLayout relativeLayout2, LinearLayout linearLayout2, AjioTextView ajioTextView3) {
        this.rootView = relativeLayout;
        this.failureLayout = linearLayout;
        this.failureTransactionTv = ajioTextView;
        this.impsStatusMessage = ajioTextView2;
        this.rcsBankDetailsLayout = relativeLayout2;
        this.successLayout = linearLayout2;
        this.successTransactionTv = ajioTextView3;
    }

    public static ImpsTransactionLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.failure_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.failure_transaction_tv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.imps_status_message;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.rcs_bank_details_layout;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (RelativeLayout)view;
                    if (view3 != null) {
                        n3 = R$id.success_layout;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (LinearLayout)view;
                        if (view4 != null) {
                            n3 = R$id.success_transaction_tv;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                Object object5 = object;
                                object5 = (RelativeLayout)object;
                                ImpsTransactionLayoutBinding impsTransactionLayoutBinding = new ImpsTransactionLayoutBinding((RelativeLayout)object5, (LinearLayout)view2, (AjioTextView)object2, (AjioTextView)object3, (RelativeLayout)view3, (LinearLayout)view4, (AjioTextView)object4);
                                return impsTransactionLayoutBinding;
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

    public static ImpsTransactionLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ImpsTransactionLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ImpsTransactionLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.imps_transaction_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ImpsTransactionLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

