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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.RvpBottomSheetItemBinding;

public final class ReturnFeeBottomSheetLayoutBinding
implements BC3 {
    public final AjioTextView btnOkay;
    public final LinearLayout parentRvpLayout;
    private final ConstraintLayout rootView;
    public final RvpBottomSheetItemBinding rvpBottomSheetItem;
    public final AppCompatImageView rvpCloseDialog;

    private ReturnFeeBottomSheetLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, LinearLayout linearLayout, RvpBottomSheetItemBinding rvpBottomSheetItemBinding, AppCompatImageView appCompatImageView) {
        this.rootView = constraintLayout;
        this.btnOkay = ajioTextView;
        this.parentRvpLayout = linearLayout;
        this.rvpBottomSheetItem = rvpBottomSheetItemBinding;
        this.rvpCloseDialog = appCompatImageView;
    }

    public static ReturnFeeBottomSheetLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.btn_okay;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.parent_rvp_layout;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null && (view = dd2_2.a(n3 = R$id.rvp_bottom_sheet_item, object)) != null) {
                RvpBottomSheetItemBinding rvpBottomSheetItemBinding = RvpBottomSheetItemBinding.bind(view);
                n3 = R$id.rvp_close_dialog;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AppCompatImageView)view;
                if (object3 != null) {
                    Object object4 = object;
                    object4 = (ConstraintLayout)((Object)object);
                    ReturnFeeBottomSheetLayoutBinding returnFeeBottomSheetLayoutBinding = new ReturnFeeBottomSheetLayoutBinding((ConstraintLayout)((Object)object4), (AjioTextView)object2, (LinearLayout)view2, rvpBottomSheetItemBinding, (AppCompatImageView)((Object)object3));
                    return returnFeeBottomSheetLayoutBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReturnFeeBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ReturnFeeBottomSheetLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnFeeBottomSheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_fee_bottom_sheet_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnFeeBottomSheetLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

