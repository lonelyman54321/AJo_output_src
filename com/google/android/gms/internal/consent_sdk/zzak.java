/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzag;
import com.google.android.gms.internal.consent_sdk.zzaj;
import com.google.android.gms.internal.consent_sdk.zzam;
import com.google.android.gms.internal.consent_sdk.zzav;
import com.google.android.gms.internal.consent_sdk.zzaw;
import com.google.android.gms.internal.consent_sdk.zzbp;
import com.google.android.gms.internal.consent_sdk.zzdp;

final class zzak
implements zzav {
    private final zzag zza;
    private zzbp zzb;

    public /* synthetic */ zzak(zzag zzag2, zzaj zzaj2) {
        this.zza = zzag2;
    }

    public final /* synthetic */ zzav zza(zzbp zzbp2) {
        this.zzb = zzbp2;
        return this;
    }

    public final zzaw zzb() {
        zzdp.zzb(this.zzb, zzbp.class);
        zzag zzag2 = this.zza;
        zzbp zzbp2 = this.zzb;
        zzam zzam2 = new zzam(zzag2, zzbp2, null);
        return zzam2;
    }
}

