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

public final class PeDialogErrorBinding
implements BC3 {
    public final AjioTextView dialogErrorTvMsg;
    public final AjioTextView dialogErrorTvOk;
    private final LinearLayout rootView;

    private PeDialogErrorBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.dialogErrorTvMsg = ajioTextView;
        this.dialogErrorTvOk = ajioTextView2;
    }

    public static PeDialogErrorBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.dialog_error_tv_msg;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.dialog_error_tv_ok, object)) != null) {
            object = (LinearLayout)object;
            PeDialogErrorBinding peDialogErrorBinding = new PeDialogErrorBinding((LinearLayout)object, ajioTextView2, ajioTextView);
            return peDialogErrorBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PeDialogErrorBinding inflate(LayoutInflater layoutInflater) {
        return PeDialogErrorBinding.inflate(layoutInflater, null, false);
    }

    public static PeDialogErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pe_dialog_error;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PeDialogErrorBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

