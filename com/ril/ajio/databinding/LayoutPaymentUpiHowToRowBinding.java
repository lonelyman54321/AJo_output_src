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

public final class LayoutPaymentUpiHowToRowBinding
implements BC3 {
    public final AjioTextView howToRowDescTv;
    public final AjioTextView howToRowHeadingTv;
    public final AppCompatImageView howToRowIconIv;
    private final ConstraintLayout rootView;

    private LayoutPaymentUpiHowToRowBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AppCompatImageView appCompatImageView) {
        this.rootView = constraintLayout;
        this.howToRowDescTv = ajioTextView;
        this.howToRowHeadingTv = ajioTextView2;
        this.howToRowIconIv = appCompatImageView;
    }

    public static LayoutPaymentUpiHowToRowBinding bind(View object) {
        AppCompatImageView appCompatImageView;
        AjioTextView ajioTextView;
        int n3 = R$id.how_to_row_desc_tv;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.how_to_row_heading_tv, object)) != null && (appCompatImageView = (AppCompatImageView)dd2_2.a(n3 = R$id.how_to_row_icon_iv, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutPaymentUpiHowToRowBinding layoutPaymentUpiHowToRowBinding = new LayoutPaymentUpiHowToRowBinding((ConstraintLayout)((Object)object), ajioTextView2, ajioTextView, appCompatImageView);
            return layoutPaymentUpiHowToRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutPaymentUpiHowToRowBinding inflate(LayoutInflater layoutInflater) {
        return LayoutPaymentUpiHowToRowBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutPaymentUpiHowToRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_payment_upi_how_to_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutPaymentUpiHowToRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

