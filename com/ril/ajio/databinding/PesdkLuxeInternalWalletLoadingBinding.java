/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PesdkLuxeInternalWalletLoadingBinding
implements BC3 {
    public final TextView loyaltyPtTV;
    public final ProgressBar pbWallet;
    private final ConstraintLayout rootView;
    public final TextView tryAgainTV;

    private PesdkLuxeInternalWalletLoadingBinding(ConstraintLayout constraintLayout, TextView textView, ProgressBar progressBar, TextView textView2) {
        this.rootView = constraintLayout;
        this.loyaltyPtTV = textView;
        this.pbWallet = progressBar;
        this.tryAgainTV = textView2;
    }

    public static PesdkLuxeInternalWalletLoadingBinding bind(View object) {
        TextView textView;
        ProgressBar progressBar;
        int n3 = R$id.loyaltyPtTV;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (progressBar = (ProgressBar)dd2_2.a(n3 = R$id.pbWallet, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.tryAgainTV, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            PesdkLuxeInternalWalletLoadingBinding pesdkLuxeInternalWalletLoadingBinding = new PesdkLuxeInternalWalletLoadingBinding((ConstraintLayout)((Object)object), textView2, progressBar, textView);
            return pesdkLuxeInternalWalletLoadingBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxeInternalWalletLoadingBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxeInternalWalletLoadingBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxeInternalWalletLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_luxe_internal_wallet_loading;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxeInternalWalletLoadingBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

