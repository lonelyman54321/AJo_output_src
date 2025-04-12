/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public abstract class RtoBottomSheetLuxeBinding
extends ViewDataBinding {
    public final EditText editReason;
    public final ImageView imgSuccess;
    public final ImageView ivClose;
    public final ConstraintLayout layoutReason;
    public final ConstraintLayout layoutSuccess;
    public final RecyclerView rvProductImages;
    public final RecyclerView rvReasons;
    public final NestedScrollView scrollRto;
    public final TextView tvCount;
    public final TextView tvDescription;
    public final TextView tvError;
    public final TextView tvReason;
    public final TextView tvTitle;
    public final AjioTextView txtSubmit;
    public final TextView txtSuccess;

    public RtoBottomSheetLuxeBinding(Object object, View view, int n3, EditText editText, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, AjioTextView ajioTextView, TextView textView6) {
        super(object, view, n3);
        this.editReason = editText;
        this.imgSuccess = imageView;
        this.ivClose = imageView2;
        this.layoutReason = constraintLayout;
        this.layoutSuccess = constraintLayout2;
        this.rvProductImages = recyclerView;
        this.rvReasons = recyclerView2;
        this.scrollRto = nestedScrollView;
        this.tvCount = textView;
        this.tvDescription = textView2;
        this.tvError = textView3;
        this.tvReason = textView4;
        this.tvTitle = textView5;
        this.txtSubmit = ajioTextView;
        this.txtSuccess = textView6;
    }

    public static RtoBottomSheetLuxeBinding bind(View view) {
        return RtoBottomSheetLuxeBinding.bind(view, null);
    }

    public static RtoBottomSheetLuxeBinding bind(View view, Object object) {
        int n3 = R$layout.rto_bottom_sheet_luxe;
        return (RtoBottomSheetLuxeBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RtoBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RtoBottomSheetLuxeBinding.inflate(layoutInflater, null);
    }

    public static RtoBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RtoBottomSheetLuxeBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RtoBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.rto_bottom_sheet_luxe;
        return (RtoBottomSheetLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RtoBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.rto_bottom_sheet_luxe;
        return (RtoBottomSheetLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

