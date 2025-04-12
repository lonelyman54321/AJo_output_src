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
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundWindowClosedBinding
implements BC3 {
    public final AjioTextView returnWindowClosedTv;
    private final AjioTextView rootView;

    private ReturnRefundWindowClosedBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.returnWindowClosedTv = ajioTextView2;
    }

    public static ReturnRefundWindowClosedBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            ReturnRefundWindowClosedBinding returnRefundWindowClosedBinding = new ReturnRefundWindowClosedBinding((AjioTextView)object, (AjioTextView)object);
            return returnRefundWindowClosedBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ReturnRefundWindowClosedBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundWindowClosedBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundWindowClosedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_window_closed;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundWindowClosedBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

