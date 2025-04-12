/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.clevertap.android.sdk.inapp;

import android.view.View;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment;

public final class CTInAppNativeHalfInterstitialImageFragment$a
implements View.OnClickListener {
    public final /* synthetic */ CTInAppNativeHalfInterstitialImageFragment a;

    public CTInAppNativeHalfInterstitialImageFragment$a(CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment) {
        this.a = cTInAppNativeHalfInterstitialImageFragment;
    }

    public final void onClick(View view) {
        CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment = this.a;
        cTInAppNativeHalfInterstitialImageFragment.Pa(null);
        cTInAppNativeHalfInterstitialImageFragment.getActivity().finish();
    }
}

