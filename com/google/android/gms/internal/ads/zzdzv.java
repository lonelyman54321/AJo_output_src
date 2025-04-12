/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdzv
implements zzhkp {
    private final zzhlg zza;

    public zzdzv(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final String zza() {
        String string2 = ((zzcjj)this.zza).zza().getPackageName();
        zzhkx.zzb(string2);
        return string2;
    }
}

