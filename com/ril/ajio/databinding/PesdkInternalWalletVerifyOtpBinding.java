/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PesdkInternalWalletVerifyOtpBinding
implements BC3 {
    public final TextView redemptionTv;
    private final FrameLayout rootView;
    public final FrameLayout verifyOtpLayout;
    public final TextView verifyOtpTv;

    private PesdkInternalWalletVerifyOtpBinding(FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, TextView textView2) {
        this.rootView = frameLayout;
        this.redemptionTv = textView;
        this.verifyOtpLayout = frameLayout2;
        this.verifyOtpTv = textView2;
    }

    public static PesdkInternalWalletVerifyOtpBinding bind(View object) {
        Object object2;
        int n3 = R$id.redemption_tv;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object2 = object;
            object2 = (FrameLayout)object;
            int n4 = R$id.verify_otp_Tv;
            TextView textView2 = (TextView)dd2_2.a(n4, object);
            if (textView2 != null) {
                object = new PesdkInternalWalletVerifyOtpBinding((FrameLayout)object2, textView, (FrameLayout)object2, textView2);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static PesdkInternalWalletVerifyOtpBinding inflate(LayoutInflater layoutInflater) {
        return PesdkInternalWalletVerifyOtpBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkInternalWalletVerifyOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_internal_wallet_verify_otp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkInternalWalletVerifyOtpBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

