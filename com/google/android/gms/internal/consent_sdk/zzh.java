/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateSuccessListener;

public final class zzh
implements ConsentInformation$OnConsentInfoUpdateSuccessListener {
    public final /* synthetic */ zzj zza;

    public /* synthetic */ zzh(zzj zzj2) {
        this.zza = zzj2;
    }

    public final void onConsentInfoUpdateSuccess() {
        this.zza.zzb(false);
    }
}

