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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnFeeStripBinding
implements BC3 {
    public final AjioImageView ivInfo;
    private final ConstraintLayout rootView;
    public final ConstraintLayout stripLayout;
    public final AjioTextView tvReturnFeeInfo;

    private ReturnFeeStripBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.ivInfo = ajioImageView;
        this.stripLayout = constraintLayout2;
        this.tvReturnFeeInfo = ajioTextView;
    }

    public static ReturnFeeStripBinding bind(View object) {
        Object object2;
        int n3 = R$id.iv_info;
        AjioImageView ajioImageView = (AjioImageView)dd2_2.a(n3, object);
        if (ajioImageView != null) {
            object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            int n4 = R$id.tv_return_fee_info;
            AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n4, object);
            if (ajioTextView != null) {
                object = new ReturnFeeStripBinding((ConstraintLayout)((Object)object2), ajioImageView, (ConstraintLayout)((Object)object2), ajioTextView);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static ReturnFeeStripBinding inflate(LayoutInflater layoutInflater) {
        return ReturnFeeStripBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnFeeStripBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_fee_strip;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnFeeStripBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

