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
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$layout;

public abstract class RvpBottomSheetLayoutBinding
extends ViewDataBinding {
    public final ConstraintLayout parentRvpLayout;
    public final AppCompatImageView rvpCloseDialog;
    public final RecyclerView rvpLayoutRv;

    public RvpBottomSheetLayoutBinding(Object object, View view, int n3, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, RecyclerView recyclerView) {
        super(object, view, n3);
        this.parentRvpLayout = constraintLayout;
        this.rvpCloseDialog = appCompatImageView;
        this.rvpLayoutRv = recyclerView;
    }

    public static RvpBottomSheetLayoutBinding bind(View view) {
        return RvpBottomSheetLayoutBinding.bind(view, null);
    }

    public static RvpBottomSheetLayoutBinding bind(View view, Object object) {
        int n3 = R$layout.rvp_bottom_sheet_layout;
        return (RvpBottomSheetLayoutBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RvpBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater) {
        return RvpBottomSheetLayoutBinding.inflate(layoutInflater, null);
    }

    public static RvpBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RvpBottomSheetLayoutBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RvpBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.rvp_bottom_sheet_layout;
        return (RvpBottomSheetLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RvpBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.rvp_bottom_sheet_layout;
        return (RvpBottomSheetLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

