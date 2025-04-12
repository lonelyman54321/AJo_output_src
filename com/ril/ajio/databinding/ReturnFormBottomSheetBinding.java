/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public abstract class ReturnFormBottomSheetBinding
extends ViewDataBinding {
    public final AjioCircularImageView cbGuideline;
    public final CardView cvLayoutFooter;
    public final CardView cvLayoutUpload;
    public final CardView cvParentLayoutFooter;
    public final View divider1;
    public final AppCompatImageView idImageSearchCloseDialog;
    public final ImageView ivGuideline1;
    public final ImageView ivGuideline3;
    public final LinearLayout layoutGuideline1;
    public final LinearLayout layoutGuideline2;
    public final LinearLayout layoutGuideline3;
    public final LinearLayout layoutGuideline4;
    public final ConstraintLayout layoutParentImageSearch;
    public final ConstraintLayout layoutTop;
    public final RecyclerView rvTakeImage;
    public final AjioTextView tvErrorImage;
    public final TextView tvGuideline1Message;
    public final TextView tvGuideline2Message;
    public final TextView tvGuideline2Title;
    public final TextView tvGuideline3Message;
    public final TextView tvGuideline4;
    public final TextView tvGuidelineMessage;
    public final TextView tvHeader;
    public final TextView tvUploadImage;
    public final TextView tvUploadSubTitle;
    public final TextView tvUploadTitle;

    public ReturnFormBottomSheetBinding(Object object, View view, int n3, AjioCircularImageView ajioCircularImageView, CardView cardView, CardView cardView2, CardView cardView3, View view2, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, AjioTextView ajioTextView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        super(object, view, n3);
        this.cbGuideline = ajioCircularImageView;
        this.cvLayoutFooter = cardView;
        this.cvLayoutUpload = cardView2;
        this.cvParentLayoutFooter = cardView3;
        this.divider1 = view2;
        this.idImageSearchCloseDialog = appCompatImageView;
        this.ivGuideline1 = imageView;
        this.ivGuideline3 = imageView2;
        this.layoutGuideline1 = linearLayout;
        this.layoutGuideline2 = linearLayout2;
        this.layoutGuideline3 = linearLayout3;
        this.layoutGuideline4 = linearLayout4;
        this.layoutParentImageSearch = constraintLayout;
        this.layoutTop = constraintLayout2;
        this.rvTakeImage = recyclerView;
        this.tvErrorImage = ajioTextView;
        this.tvGuideline1Message = textView;
        this.tvGuideline2Message = textView2;
        this.tvGuideline2Title = textView3;
        this.tvGuideline3Message = textView4;
        this.tvGuideline4 = textView5;
        this.tvGuidelineMessage = textView6;
        this.tvHeader = textView7;
        this.tvUploadImage = textView8;
        this.tvUploadSubTitle = textView9;
        this.tvUploadTitle = textView10;
    }

    public static ReturnFormBottomSheetBinding bind(View view) {
        return ReturnFormBottomSheetBinding.bind(view, null);
    }

    public static ReturnFormBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.return_form_bottom_sheet;
        return (ReturnFormBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static ReturnFormBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return ReturnFormBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static ReturnFormBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return ReturnFormBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static ReturnFormBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.return_form_bottom_sheet;
        return (ReturnFormBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static ReturnFormBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.return_form_bottom_sheet;
        return (ReturnFormBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

