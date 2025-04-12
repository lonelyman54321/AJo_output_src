/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateFailureListener;
import com.google.android.ump.FormError;

public final class zzi
implements ConsentInformation$OnConsentInfoUpdateFailureListener {
    public final /* synthetic */ zzj zza;

    public /* synthetic */ zzi(zzj zzj2) {
        this.zza = zzj2;
    }

    public final void onConsentInfoUpdateFailure(FormError formError) {
        this.zza.zzb(false);
    }
}

