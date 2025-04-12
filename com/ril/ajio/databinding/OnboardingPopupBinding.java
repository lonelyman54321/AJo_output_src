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
import com.ril.ajio.customviews.widgets.SquareImageView;

public final class OnboardingPopupBinding
implements BC3 {
    public final SquareImageView closeBtn;
    public final SquareImageView img;
    private final LinearLayout rootView;
    public final AjioTextView text;

    private OnboardingPopupBinding(LinearLayout linearLayout, SquareImageView squareImageView, SquareImageView squareImageView2, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.closeBtn = squareImageView;
        this.img = squareImageView2;
        this.text = ajioTextView;
    }

    public static OnboardingPopupBinding bind(View object) {
        AjioTextView ajioTextView;
        SquareImageView squareImageView;
        int n3 = R$id.close_btn;
        SquareImageView squareImageView2 = (SquareImageView)dd2_2.a(n3, object);
        if (squareImageView2 != null && (squareImageView = (SquareImageView)dd2_2.a(n3 = R$id.img, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.text, object)) != null) {
            object = (LinearLayout)object;
            OnboardingPopupBinding onboardingPopupBinding = new OnboardingPopupBinding((LinearLayout)object, squareImageView2, squareImageView, ajioTextView);
            return onboardingPopupBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OnboardingPopupBinding inflate(LayoutInflater layoutInflater) {
        return OnboardingPopupBinding.inflate(layoutInflater, null, false);
    }

    public static OnboardingPopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.onboarding_popup;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OnboardingPopupBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

