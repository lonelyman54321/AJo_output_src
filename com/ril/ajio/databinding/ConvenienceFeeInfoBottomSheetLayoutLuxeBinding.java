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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ConvenienceFeeDescLayoutLuxeBinding;
import com.ril.ajio.databinding.EachConveniencePopupRowLayoutLuxeBinding;
import com.ril.ajio.databinding.TotalConvenienceLayoutLuxeBinding;

public abstract class ConvenienceFeeInfoBottomSheetLayoutLuxeBinding
extends ViewDataBinding {
    public final View accPageNameLyt;
    public final AppCompatImageView closeDialog;
    public final ConvenienceFeeDescLayoutLuxeBinding codFeeDescLayout;
    public final EachConveniencePopupRowLayoutLuxeBinding codFeeLayout;
    public final AjioTextView convFeeValue;
    public final ConvenienceFeeDescLayoutLuxeBinding deliveryFeeDescLayout;
    public final EachConveniencePopupRowLayoutLuxeBinding deliveryLayout;
    public final AjioTextView noteTv;
    public final AjioTextView okayBtn;
    public final ConstraintLayout parentLayout;
    public final LinearLayout parentSummaryLayout;
    public final ConvenienceFeeDescLayoutLuxeBinding pcfFeeDescLayout;
    public final EachConveniencePopupRowLayoutLuxeBinding pdFeeLayout;
    public final EachConveniencePopupRowLayoutLuxeBinding platformConvenienceFeeLayout;
    public final AjioTextView policyText;
    public final ConvenienceFeeDescLayoutLuxeBinding priorityDeliveryFeeDescLayout;
    public final EachConveniencePopupRowLayoutLuxeBinding priorityDeliveryFeeLayout;
    public final AjioTextView topTitle;
    public final TotalConvenienceLayoutLuxeBinding totalFeeLayout;

    public ConvenienceFeeInfoBottomSheetLayoutLuxeBinding(Object object, View view, int n3, View view2, AppCompatImageView appCompatImageView, ConvenienceFeeDescLayoutLuxeBinding convenienceFeeDescLayoutLuxeBinding, EachConveniencePopupRowLayoutLuxeBinding eachConveniencePopupRowLayoutLuxeBinding, AjioTextView ajioTextView, ConvenienceFeeDescLayoutLuxeBinding convenienceFeeDescLayoutLuxeBinding2, EachConveniencePopupRowLayoutLuxeBinding eachConveniencePopupRowLayoutLuxeBinding2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ConstraintLayout constraintLayout, LinearLayout linearLayout, ConvenienceFeeDescLayoutLuxeBinding convenienceFeeDescLayoutLuxeBinding3, EachConveniencePopupRowLayoutLuxeBinding eachConveniencePopupRowLayoutLuxeBinding3, EachConveniencePopupRowLayoutLuxeBinding eachConveniencePopupRowLayoutLuxeBinding4, AjioTextView ajioTextView4, ConvenienceFeeDescLayoutLuxeBinding convenienceFeeDescLayoutLuxeBinding4, EachConveniencePopupRowLayoutLuxeBinding eachConveniencePopupRowLayoutLuxeBinding5, AjioTextView ajioTextView5, TotalConvenienceLayoutLuxeBinding totalConvenienceLayoutLuxeBinding) {
        super(object, view, n3);
        this.accPageNameLyt = view2;
        this.closeDialog = appCompatImageView;
        this.codFeeDescLayout = convenienceFeeDescLayoutLuxeBinding;
        this.codFeeLayout = eachConveniencePopupRowLayoutLuxeBinding;
        this.convFeeValue = ajioTextView;
        this.deliveryFeeDescLayout = convenienceFeeDescLayoutLuxeBinding2;
        this.deliveryLayout = eachConveniencePopupRowLayoutLuxeBinding2;
        this.noteTv = ajioTextView2;
        this.okayBtn = ajioTextView3;
        this.parentLayout = constraintLayout;
        this.parentSummaryLayout = linearLayout;
        this.pcfFeeDescLayout = convenienceFeeDescLayoutLuxeBinding3;
        this.pdFeeLayout = eachConveniencePopupRowLayoutLuxeBinding3;
        this.platformConvenienceFeeLayout = eachConveniencePopupRowLayoutLuxeBinding4;
        this.policyText = ajioTextView4;
        this.priorityDeliveryFeeDescLayout = convenienceFeeDescLayoutLuxeBinding4;
        this.priorityDeliveryFeeLayout = eachConveniencePopupRowLayoutLuxeBinding5;
        this.topTitle = ajioTextView5;
        this.totalFeeLayout = totalConvenienceLayoutLuxeBinding;
    }

    public static ConvenienceFeeInfoBottomSheetLayoutLuxeBinding bind(View view) {
        return ConvenienceFeeInfoBottomSheetLayoutLuxeBinding.bind(view, null);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutLuxeBinding bind(View view, Object object) {
        int n3 = R$layout.convenience_fee_info_bottom_sheet_layout_luxe;
        return (ConvenienceFeeInfoBottomSheetLayoutLuxeBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return ConvenienceFeeInfoBottomSheetLayoutLuxeBinding.inflate(layoutInflater, null);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return ConvenienceFeeInfoBottomSheetLayoutLuxeBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.convenience_fee_info_bottom_sheet_layout_luxe;
        return (ConvenienceFeeInfoBottomSheetLayoutLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutLuxeBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.convenience_fee_info_bottom_sheet_layout_luxe;
        return (ConvenienceFeeInfoBottomSheetLayoutLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

