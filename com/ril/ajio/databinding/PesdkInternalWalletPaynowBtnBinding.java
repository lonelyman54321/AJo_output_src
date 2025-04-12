/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkInternalWalletPaynowBtnBinding
implements BC3 {
    public final AjioTextView proceedBtnTv;
    private final FrameLayout rootView;

    private PesdkInternalWalletPaynowBtnBinding(FrameLayout frameLayout, AjioTextView ajioTextView) {
        this.rootView = frameLayout;
        this.proceedBtnTv = ajioTextView;
    }

    public static PesdkInternalWalletPaynowBtnBinding bind(View object) {
        int n3 = R$id.proceed_btn_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (FrameLayout)object;
            PesdkInternalWalletPaynowBtnBinding pesdkInternalWalletPaynowBtnBinding = new PesdkInternalWalletPaynowBtnBinding((FrameLayout)object, ajioTextView);
            return pesdkInternalWalletPaynowBtnBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkInternalWalletPaynowBtnBinding inflate(LayoutInflater layoutInflater) {
        return PesdkInternalWalletPaynowBtnBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkInternalWalletPaynowBtnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_internal_wallet_paynow_btn;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkInternalWalletPaynowBtnBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

