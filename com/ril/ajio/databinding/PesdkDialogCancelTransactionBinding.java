/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkDialogCancelTransactionBinding
implements BC3 {
    public final ImageView imvDialogClose;
    private final LinearLayout rootView;
    public final AjioTextView tvCancel;
    public final AjioTextView tvConfirm;

    private PesdkDialogCancelTransactionBinding(LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.imvDialogClose = imageView;
        this.tvCancel = ajioTextView;
        this.tvConfirm = ajioTextView2;
    }

    public static PesdkDialogCancelTransactionBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.imv_dialog_close;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.tv_cancel, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_confirm, object)) != null) {
            object = (LinearLayout)object;
            PesdkDialogCancelTransactionBinding pesdkDialogCancelTransactionBinding = new PesdkDialogCancelTransactionBinding((LinearLayout)object, imageView, ajioTextView2, ajioTextView);
            return pesdkDialogCancelTransactionBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkDialogCancelTransactionBinding inflate(LayoutInflater layoutInflater) {
        return PesdkDialogCancelTransactionBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkDialogCancelTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_dialog_cancel_transaction;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkDialogCancelTransactionBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

