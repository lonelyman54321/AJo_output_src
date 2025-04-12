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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.IncentiviseSeekBarLayoutBinding;

public abstract class IncentivizeBottomSheetBinding
extends ViewDataBinding {
    public final Barrier barrierButtons;
    public final ConstraintLayout clDiscountFee;
    public final ConstraintLayout clDiscountFeeDetails;
    public final ConstraintLayout clHorizentalRefundableDetails;
    public final ConstraintLayout clHorizentalRefundableFeeView;
    public final ConstraintLayout clNonRefundFeeDetails;
    public final ConstraintLayout clReturnFeeLayout;
    public final ConstraintLayout clSeekBarLayout;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout cvNonRefundFee;
    public final ConstraintLayout dlprLayoutContent;
    public final Guideline guideline1;
    public final AjioTextView horizentalRefundableViewless;
    public final AjioTextView horizontalRefundablePrice;
    public final AjioTextView horizontalRefundableText;
    public final AjioTextView horizontalViewmore;
    public final AjioTextView idDiscountViewless;
    public final AjioTextView idDiscountViewmore;
    public final AjioTextView idLossText;
    public final AjioTextView idRefundableText;
    public final AjioTextView idRefundableViewless;
    public final AjioTextView idRefundableViewmore;
    public final AjioTextView idSubTitle;
    public final AjioTextView idTitle;
    public final LottieAnimationView lottieAnimation;
    public final AjioTextView nonRefundablePrice;
    public final CardView returnsBreakupView;
    public final RecyclerView rvDiscountFee;
    public final RecyclerView rvHorizentalRefundableDetails;
    public final RecyclerView rvNonRefund;
    public final IncentiviseSeekBarLayoutBinding rvpSeekBarLayoutView;
    public final ShimmerFrameLayout shimmerView;
    public final AjioTextView tvConsiderHigh;
    public final AjioTextView tvDiscountPrice;
    public final AjioTextView tvDiscountText;
    public final AjioTextView tvPerProductReturnFee;
    public final AjioTextView tvProceedExchange;
    public final AjioTextView tvProceedReturn;
    public final AjioTextView tvReturnFeeDesc;
    public final AjioTextView tvReturnFeeTitle;
    public final View view1;
    public final View view2;
    public final View view3;
    public final View view4;
    public final View view5;

    public IncentivizeBottomSheetBinding(Object object, View view, int n3, Barrier barrier, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout8, ConstraintLayout constraintLayout9, Guideline guideline, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12, LottieAnimationView lottieAnimationView, AjioTextView ajioTextView13, CardView cardView, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, IncentiviseSeekBarLayoutBinding incentiviseSeekBarLayoutBinding, ShimmerFrameLayout shimmerFrameLayout, AjioTextView ajioTextView14, AjioTextView ajioTextView15, AjioTextView ajioTextView16, AjioTextView ajioTextView17, AjioTextView ajioTextView18, AjioTextView ajioTextView19, AjioTextView ajioTextView20, AjioTextView ajioTextView21, View view2, View view3, View view4, View view5, View view6) {
        super(object, view, n3);
        this.barrierButtons = barrier;
        this.clDiscountFee = constraintLayout;
        this.clDiscountFeeDetails = constraintLayout2;
        this.clHorizentalRefundableDetails = constraintLayout3;
        this.clHorizentalRefundableFeeView = constraintLayout4;
        this.clNonRefundFeeDetails = constraintLayout5;
        this.clReturnFeeLayout = constraintLayout6;
        this.clSeekBarLayout = constraintLayout7;
        this.closeDialog = appCompatImageView;
        this.cvNonRefundFee = constraintLayout8;
        this.dlprLayoutContent = constraintLayout9;
        this.guideline1 = guideline;
        this.horizentalRefundableViewless = ajioTextView;
        this.horizontalRefundablePrice = ajioTextView2;
        this.horizontalRefundableText = ajioTextView3;
        this.horizontalViewmore = ajioTextView4;
        this.idDiscountViewless = ajioTextView5;
        this.idDiscountViewmore = ajioTextView6;
        this.idLossText = ajioTextView7;
        this.idRefundableText = ajioTextView8;
        this.idRefundableViewless = ajioTextView9;
        this.idRefundableViewmore = ajioTextView10;
        this.idSubTitle = ajioTextView11;
        this.idTitle = ajioTextView12;
        this.lottieAnimation = lottieAnimationView;
        this.nonRefundablePrice = ajioTextView13;
        this.returnsBreakupView = cardView;
        this.rvDiscountFee = recyclerView;
        this.rvHorizentalRefundableDetails = recyclerView2;
        this.rvNonRefund = recyclerView3;
        this.rvpSeekBarLayoutView = incentiviseSeekBarLayoutBinding;
        this.shimmerView = shimmerFrameLayout;
        this.tvConsiderHigh = ajioTextView14;
        this.tvDiscountPrice = ajioTextView15;
        this.tvDiscountText = ajioTextView16;
        this.tvPerProductReturnFee = ajioTextView17;
        this.tvProceedExchange = ajioTextView18;
        this.tvProceedReturn = ajioTextView19;
        this.tvReturnFeeDesc = ajioTextView20;
        this.tvReturnFeeTitle = ajioTextView21;
        this.view1 = view2;
        this.view2 = view3;
        this.view3 = view4;
        this.view4 = view5;
        this.view5 = view6;
    }

    public static IncentivizeBottomSheetBinding bind(View view) {
        return IncentivizeBottomSheetBinding.bind(view, null);
    }

    public static IncentivizeBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.incentivize_bottom_sheet;
        return (IncentivizeBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static IncentivizeBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return IncentivizeBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static IncentivizeBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return IncentivizeBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static IncentivizeBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.incentivize_bottom_sheet;
        return (IncentivizeBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static IncentivizeBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.incentivize_bottom_sheet;
        return (IncentivizeBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

