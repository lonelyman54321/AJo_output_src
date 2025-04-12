/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ReferralSnackbarBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final AppCompatImageView rsCancel;
    public final TextView rsErrorTv;
    public final TextView rsReload;

    private ReferralSnackbarBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.rsCancel = appCompatImageView;
        this.rsErrorTv = textView;
        this.rsReload = textView2;
    }

    public static ReferralSnackbarBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.rs_cancel;
        AppCompatImageView appCompatImageView = (AppCompatImageView)dd2_2.a(n3, object);
        if (appCompatImageView != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.rs_error_tv, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.rs_reload, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ReferralSnackbarBinding referralSnackbarBinding = new ReferralSnackbarBinding((ConstraintLayout)((Object)object), appCompatImageView, textView2, textView);
            return referralSnackbarBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReferralSnackbarBinding inflate(LayoutInflater layoutInflater) {
        return ReferralSnackbarBinding.inflate(layoutInflater, null, false);
    }

    public static ReferralSnackbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.referral_snackbar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReferralSnackbarBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

