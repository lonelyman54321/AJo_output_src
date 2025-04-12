/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeev;
import com.google.android.gms.internal.ads.zzeez;
import com.google.android.gms.internal.ads.zzefa;
import com.google.android.gms.internal.ads.zzefh;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzefi
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzefi(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzefh zza() {
        zzeev zzeev2 = (zzeev)this.zza.zzb();
        zzeez zzeez2 = ((zzefa)this.zzb).zza();
        zzefh zzefh2 = new zzefh(zzeev2, zzeez2);
        return zzefh2;
    }
}

