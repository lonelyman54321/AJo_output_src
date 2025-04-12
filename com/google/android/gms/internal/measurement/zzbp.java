/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzh;

final class zzbp
implements zzbm {
    private final zzh zza;
    private final String zzb;

    public zzbp(zzh zzh2, String string2) {
        this.zza = zzh2;
        this.zzb = string2;
    }

    public final zzh zza(zzaq zzaq2) {
        zzh zzh2 = this.zza;
        String string2 = this.zzb;
        zzh2.zza(string2, zzaq2);
        return this.zza;
    }
}

