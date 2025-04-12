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
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ExlamationErrorBinding
implements BC3 {
    public final AjioTextView alertText;
    public final AjioAspectRatioImageView imvSizeError;
    private final ConstraintLayout rootView;
    public final ConstraintLayout sizeAlertViewCL;

    private ExlamationErrorBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioAspectRatioImageView ajioAspectRatioImageView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.alertText = ajioTextView;
        this.imvSizeError = ajioAspectRatioImageView;
        this.sizeAlertViewCL = constraintLayout2;
    }

    public static ExlamationErrorBinding bind(View object) {
        AjioAspectRatioImageView ajioAspectRatioImageView;
        int n3 = R$id.alert_text;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (ajioAspectRatioImageView = (AjioAspectRatioImageView)dd2_2.a(n3 = R$id.imvSizeError, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ExlamationErrorBinding exlamationErrorBinding = new ExlamationErrorBinding((ConstraintLayout)((Object)object), ajioTextView, ajioAspectRatioImageView, (ConstraintLayout)((Object)object));
            return exlamationErrorBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ExlamationErrorBinding inflate(LayoutInflater layoutInflater) {
        return ExlamationErrorBinding.inflate(layoutInflater, null, false);
    }

    public static ExlamationErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exlamation_error;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExlamationErrorBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

