/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzu;
import com.google.android.gms.internal.consent_sdk.zzz;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateSuccessListener;

public final class zzp
implements Runnable {
    public final /* synthetic */ zzu zza;
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener zzb;
    public final /* synthetic */ zzz zzc;

    public /* synthetic */ zzp(zzu zzu2, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzz zzz2) {
        this.zza = zzu2;
        this.zzb = onConsentInfoUpdateSuccessListener;
        this.zzc = zzz2;
    }

    public final void run() {
        zzu zzu2 = this.zza;
        ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener = this.zzb;
        zzz zzz2 = this.zzc;
        zzu2.zza(onConsentInfoUpdateSuccessListener, zzz2);
    }
}

