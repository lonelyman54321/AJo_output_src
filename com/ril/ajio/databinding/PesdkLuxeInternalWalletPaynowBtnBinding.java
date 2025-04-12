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

public final class PesdkLuxeInternalWalletPaynowBtnBinding
implements BC3 {
    public final TextView proceedBtnTv;
    private final FrameLayout rootView;

    private PesdkLuxeInternalWalletPaynowBtnBinding(FrameLayout frameLayout, TextView textView) {
        this.rootView = frameLayout;
        this.proceedBtnTv = textView;
    }

    public static PesdkLuxeInternalWalletPaynowBtnBinding bind(View object) {
        int n3 = R$id.proceed_btn_tv;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (FrameLayout)object;
            PesdkLuxeInternalWalletPaynowBtnBinding pesdkLuxeInternalWalletPaynowBtnBinding = new PesdkLuxeInternalWalletPaynowBtnBinding((FrameLayout)object, textView);
            return pesdkLuxeInternalWalletPaynowBtnBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxeInternalWalletPaynowBtnBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxeInternalWalletPaynowBtnBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxeInternalWalletPaynowBtnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_luxe_internal_wallet_paynow_btn;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxeInternalWalletPaynowBtnBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

