/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzdn;
import com.google.android.gms.internal.consent_sdk.zzdp;
import com.google.android.gms.internal.consent_sdk.zzdr;
import java.util.concurrent.Executor;

public final class zzbo
implements zzdn {
    private final zzdr zza;
    private final zzdr zzb;

    public zzbo(zzdr zzdr2, zzdr zzdr3) {
        this.zza = zzdr2;
        this.zzb = zzdr3;
    }

    public final /* synthetic */ Object zza() {
        Executor executor = zzcr.zzb;
        zzdp.zza(executor);
        zzdr zzdr2 = this.zza;
        zzbn zzbn2 = new zzbn(zzdr2, executor);
        return zzbn2;
    }
}

