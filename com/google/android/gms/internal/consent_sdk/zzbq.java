/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzbu;
import com.google.android.gms.internal.consent_sdk.zzcs;

public final class zzbq
implements Runnable {
    public final /* synthetic */ zzbu zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbq(zzbu zzbu2, String string2) {
        this.zza = zzbu2;
        this.zzb = string2;
    }

    public final void run() {
        zzbu zzbu2 = this.zza;
        String string2 = this.zzb;
        zzcs.zza(zzbu2, string2);
    }
}

