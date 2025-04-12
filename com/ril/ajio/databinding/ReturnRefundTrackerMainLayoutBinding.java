/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundTrackerMainLayoutBinding
implements BC3 {
    public final AjioTextView cancelReturn;
    public final LinearLayout mainTrackerLayout;
    public final TextView returnCancelRequestUnderProcessTv;
    private final LinearLayout rootView;

    private ReturnRefundTrackerMainLayoutBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.cancelReturn = ajioTextView;
        this.mainTrackerLayout = linearLayout2;
        this.returnCancelRequestUnderProcessTv = textView;
    }

    public static ReturnRefundTrackerMainLayoutBinding bind(View object) {
        TextView textView;
        LinearLayout linearLayout;
        int n3 = R$id.cancelReturn;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.main_tracker_layout, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.return_cancel_request_under_process_tv, object)) != null) {
            object = (LinearLayout)object;
            ReturnRefundTrackerMainLayoutBinding returnRefundTrackerMainLayoutBinding = new ReturnRefundTrackerMainLayoutBinding((LinearLayout)object, ajioTextView, linearLayout, textView);
            return returnRefundTrackerMainLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReturnRefundTrackerMainLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundTrackerMainLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundTrackerMainLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_tracker_main_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundTrackerMainLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

