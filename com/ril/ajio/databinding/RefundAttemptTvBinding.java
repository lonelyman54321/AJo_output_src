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

public final class RefundAttemptTvBinding
implements BC3 {
    public final AjioTextView attempt;
    private final AjioTextView rootView;

    private RefundAttemptTvBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.attempt = ajioTextView2;
    }

    public static RefundAttemptTvBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            RefundAttemptTvBinding refundAttemptTvBinding = new RefundAttemptTvBinding((AjioTextView)object, (AjioTextView)object);
            return refundAttemptTvBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RefundAttemptTvBinding inflate(LayoutInflater layoutInflater) {
        return RefundAttemptTvBinding.inflate(layoutInflater, null, false);
    }

    public static RefundAttemptTvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.refund_attempt_tv;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RefundAttemptTvBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

