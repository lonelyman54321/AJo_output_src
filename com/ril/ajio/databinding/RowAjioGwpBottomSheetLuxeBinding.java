/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public abstract class RowAjioGwpBottomSheetLuxeBinding
extends ViewDataBinding {
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout dlprLayoutContent;
    public final AjioTextView idCartGwpCombo;
    public final RecyclerView idCartGwpComboList;
    public final ImageView idCartGwpImg;
    public final RecyclerView idCartGwpList;
    public final AjioTextView idCartGwpTitle;
    public final ConstraintLayout idComboRootView;
    public final ConstraintLayout idConstraintGwpList;

    public RowAjioGwpBottomSheetLuxeBinding(Object object, View view, int n3, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AjioTextView ajioTextView, RecyclerView recyclerView, ImageView imageView, RecyclerView recyclerView2, AjioTextView ajioTextView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        super(object, view, n3);
        this.closeDialog = appCompatImageView;
        this.dlprLayoutContent = constraintLayout;
        this.idCartGwpCombo = ajioTextView;
        this.idCartGwpComboList = recyclerView;
        this.idCartGwpImg = imageView;
        this.idCartGwpList = recyclerView2;
        this.idCartGwpTitle = ajioTextView2;
        this.idComboRootView = constraintLayout2;
        this.idConstraintGwpList = constraintLayout3;
    }

    public static RowAjioGwpBottomSheetLuxeBinding bind(View view) {
        return RowAjioGwpBottomSheetLuxeBinding.bind(view, null);
    }

    public static RowAjioGwpBottomSheetLuxeBinding bind(View view, Object object) {
        int n3 = R$layout.row_ajio_gwp_bottom_sheet_luxe;
        return (RowAjioGwpBottomSheetLuxeBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RowAjioGwpBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowAjioGwpBottomSheetLuxeBinding.inflate(layoutInflater, null);
    }

    public static RowAjioGwpBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RowAjioGwpBottomSheetLuxeBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RowAjioGwpBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.row_ajio_gwp_bottom_sheet_luxe;
        return (RowAjioGwpBottomSheetLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RowAjioGwpBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.row_ajio_gwp_bottom_sheet_luxe;
        return (RowAjioGwpBottomSheetLuxeBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

