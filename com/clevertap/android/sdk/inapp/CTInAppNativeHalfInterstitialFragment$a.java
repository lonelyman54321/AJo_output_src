/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.clevertap.android.sdk.inapp;

import android.view.View;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment;

public final class CTInAppNativeHalfInterstitialFragment$a
implements View.OnClickListener {
    public final /* synthetic */ CTInAppNativeHalfInterstitialFragment a;

    public CTInAppNativeHalfInterstitialFragment$a(CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment) {
        this.a = cTInAppNativeHalfInterstitialFragment;
    }

    public final void onClick(View view) {
        CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment = this.a;
        cTInAppNativeHalfInterstitialFragment.Pa(null);
        cTInAppNativeHalfInterstitialFragment.getActivity().finish();
    }
}

