/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzd;
import java.util.concurrent.Executor;

public final class zze {
    private final Executor zza;

    public zze(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(String string2, String string3, zzd ... zzdArray) {
        zzc zzc2 = new zzc(string2, string3, zzdArray);
        this.zza.execute(zzc2);
    }
}

