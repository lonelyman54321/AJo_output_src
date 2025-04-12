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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutVerifyEmailBinding
implements BC3 {
    public final AjioTextView rilEmployeeInfoMsg;
    public final AjioTextView rilEmployeeVerifyEmail;
    private final ConstraintLayout rootView;
    public final AjioImageView statusImage;

    private LayoutVerifyEmailBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioImageView ajioImageView) {
        this.rootView = constraintLayout;
        this.rilEmployeeInfoMsg = ajioTextView;
        this.rilEmployeeVerifyEmail = ajioTextView2;
        this.statusImage = ajioImageView;
    }

    public static LayoutVerifyEmailBinding bind(View object) {
        AjioImageView ajioImageView;
        AjioTextView ajioTextView;
        int n3 = R$id.ril_employee_info_msg;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.ril_employee_verify_email, object)) != null && (ajioImageView = (AjioImageView)dd2_2.a(n3 = R$id.status_image, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutVerifyEmailBinding layoutVerifyEmailBinding = new LayoutVerifyEmailBinding((ConstraintLayout)((Object)object), ajioTextView2, ajioTextView, ajioImageView);
            return layoutVerifyEmailBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutVerifyEmailBinding inflate(LayoutInflater layoutInflater) {
        return LayoutVerifyEmailBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutVerifyEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_verify_email;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutVerifyEmailBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

