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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkDialogErrorBinding
implements BC3 {
    public final AjioTextView dialogErrorTvButton;
    public final AjioTextView dialogErrorTvDesc;
    public final AjioTextView dialogErrorTvTitle;
    private final LinearLayout rootView;

    private PesdkDialogErrorBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = linearLayout;
        this.dialogErrorTvButton = ajioTextView;
        this.dialogErrorTvDesc = ajioTextView2;
        this.dialogErrorTvTitle = ajioTextView3;
    }

    public static PesdkDialogErrorBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.dialog_error_tv_button;
        AjioTextView ajioTextView3 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView3 != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.dialog_error_tv_desc, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.dialog_error_tv_title, object)) != null) {
            object = (LinearLayout)object;
            PesdkDialogErrorBinding pesdkDialogErrorBinding = new PesdkDialogErrorBinding((LinearLayout)object, ajioTextView3, ajioTextView2, ajioTextView);
            return pesdkDialogErrorBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkDialogErrorBinding inflate(LayoutInflater layoutInflater) {
        return PesdkDialogErrorBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkDialogErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_dialog_error;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkDialogErrorBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

