/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.clevertap.android.sdk.inapp;

import android.view.View;
import com.clevertap.android.sdk.inapp.CTInAppNativeInterstitialImageFragment;

public final class CTInAppNativeInterstitialImageFragment$a
implements View.OnClickListener {
    public final /* synthetic */ CTInAppNativeInterstitialImageFragment a;

    public CTInAppNativeInterstitialImageFragment$a(CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment) {
        this.a = cTInAppNativeInterstitialImageFragment;
    }

    public final void onClick(View view) {
        CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment = this.a;
        cTInAppNativeInterstitialImageFragment.Pa(null);
        cTInAppNativeInterstitialImageFragment.getActivity().finish();
    }
}

