/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzcal
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcal(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzcak zza() {
        Clock clock = (Clock)this.zza.zzb();
        Object object = this.zzb.zzb();
        object = (zzcai)object;
        zzcak zzcak2 = new zzcak(clock, (zzcai)object);
        return zzcak2;
    }
}

