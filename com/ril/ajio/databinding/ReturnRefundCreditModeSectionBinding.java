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

public final class ReturnRefundCreditModeSectionBinding
implements BC3 {
    public final AjioTextView refundBreakupModeAmount;
    public final AppCompatImageView refundBreakupModeIv;
    public final AjioTextView refundBreakupModeMaskTv;
    public final AjioTextView refundBreakupModeTv;
    private final ConstraintLayout rootView;

    private ReturnRefundCreditModeSectionBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AppCompatImageView appCompatImageView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.refundBreakupModeAmount = ajioTextView;
        this.refundBreakupModeIv = appCompatImageView;
        this.refundBreakupModeMaskTv = ajioTextView2;
        this.refundBreakupModeTv = ajioTextView3;
    }

    public static ReturnRefundCreditModeSectionBinding bind(View object) {
        View view;
        int n3 = R$id.refund_breakup_mode_amount;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.refund_breakup_mode_iv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppCompatImageView)view;
            if (object3 != null) {
                n3 = R$id.refund_breakup_mode_mask_tv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.refund_breakup_mode_tv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (ConstraintLayout)((Object)object);
                        ReturnRefundCreditModeSectionBinding returnRefundCreditModeSectionBinding = new ReturnRefundCreditModeSectionBinding((ConstraintLayout)((Object)object6), (AjioTextView)object2, (AppCompatImageView)((Object)object3), (AjioTextView)object4, (AjioTextView)object5);
                        return returnRefundCreditModeSectionBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReturnRefundCreditModeSectionBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundCreditModeSectionBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundCreditModeSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_credit_mode_section;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundCreditModeSectionBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

