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
import com.ril.ajio.databinding.ConvenienceFeeDescLayoutBinding;
import com.ril.ajio.databinding.EachConveniencePopupRowLayoutBinding;
import com.ril.ajio.databinding.TotalConvenienceLayoutBinding;

public abstract class ConvenienceFeeInfoBottomSheetLayoutBinding
extends ViewDataBinding {
    public final View accPageNameLyt;
    public final AppCompatImageView closeDialog;
    public final ConvenienceFeeDescLayoutBinding codFeeDescLayout;
    public final EachConveniencePopupRowLayoutBinding codFeeLayout;
    public final AjioTextView convFeeValue;
    public final ConvenienceFeeDescLayoutBinding deliveryFeeDescLayout;
    public final EachConveniencePopupRowLayoutBinding deliveryLayout;
    public final AjioTextView noteTv;
    public final AjioTextView okayBtn;
    public final ConstraintLayout parentLayout;
    public final LinearLayout parentSummaryLayout;
    public final ConvenienceFeeDescLayoutBinding pcfFeeDescLayout;
    public final EachConveniencePopupRowLayoutBinding platformConvenienceFeeLayout;
    public final AjioTextView policyText;
    public final ConvenienceFeeDescLayoutBinding priorityDeliveryFeeDescLayout;
    public final EachConveniencePopupRowLayoutBinding priorityDeliveryFeeLayout;
    public final AjioTextView topTitle;
    public final TotalConvenienceLayoutBinding totalFeeLayout;

    public ConvenienceFeeInfoBottomSheetLayoutBinding(Object object, View view, int n3, View view2, AppCompatImageView appCompatImageView, ConvenienceFeeDescLayoutBinding convenienceFeeDescLayoutBinding, EachConveniencePopupRowLayoutBinding eachConveniencePopupRowLayoutBinding, AjioTextView ajioTextView, ConvenienceFeeDescLayoutBinding convenienceFeeDescLayoutBinding2, EachConveniencePopupRowLayoutBinding eachConveniencePopupRowLayoutBinding2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ConstraintLayout constraintLayout, LinearLayout linearLayout, ConvenienceFeeDescLayoutBinding convenienceFeeDescLayoutBinding3, EachConveniencePopupRowLayoutBinding eachConveniencePopupRowLayoutBinding3, AjioTextView ajioTextView4, ConvenienceFeeDescLayoutBinding convenienceFeeDescLayoutBinding4, EachConveniencePopupRowLayoutBinding eachConveniencePopupRowLayoutBinding4, AjioTextView ajioTextView5, TotalConvenienceLayoutBinding totalConvenienceLayoutBinding) {
        super(object, view, n3);
        this.accPageNameLyt = view2;
        this.closeDialog = appCompatImageView;
        this.codFeeDescLayout = convenienceFeeDescLayoutBinding;
        this.codFeeLayout = eachConveniencePopupRowLayoutBinding;
        this.convFeeValue = ajioTextView;
        this.deliveryFeeDescLayout = convenienceFeeDescLayoutBinding2;
        this.deliveryLayout = eachConveniencePopupRowLayoutBinding2;
        this.noteTv = ajioTextView2;
        this.okayBtn = ajioTextView3;
        this.parentLayout = constraintLayout;
        this.parentSummaryLayout = linearLayout;
        this.pcfFeeDescLayout = convenienceFeeDescLayoutBinding3;
        this.platformConvenienceFeeLayout = eachConveniencePopupRowLayoutBinding3;
        this.policyText = ajioTextView4;
        this.priorityDeliveryFeeDescLayout = convenienceFeeDescLayoutBinding4;
        this.priorityDeliveryFeeLayout = eachConveniencePopupRowLayoutBinding4;
        this.topTitle = ajioTextView5;
        this.totalFeeLayout = totalConvenienceLayoutBinding;
    }

    public static ConvenienceFeeInfoBottomSheetLayoutBinding bind(View view) {
        return ConvenienceFeeInfoBottomSheetLayoutBinding.bind(view, null);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutBinding bind(View view, Object object) {
        int n3 = R$layout.convenience_fee_info_bottom_sheet_layout;
        return (ConvenienceFeeInfoBottomSheetLayoutBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ConvenienceFeeInfoBottomSheetLayoutBinding.inflate(layoutInflater, null);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return ConvenienceFeeInfoBottomSheetLayoutBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.convenience_fee_info_bottom_sheet_layout;
        return (ConvenienceFeeInfoBottomSheetLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static ConvenienceFeeInfoBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.convenience_fee_info_bottom_sheet_layout;
        return (ConvenienceFeeInfoBottomSheetLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

