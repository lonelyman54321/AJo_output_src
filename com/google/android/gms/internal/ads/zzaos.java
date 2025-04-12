/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;

public final class zzaos
implements zzapb {
    private zzan zza;
    private zzgb zzb;
    private zzafa zzc;

    public zzaos(String object) {
        zzal zzal2 = new zzal();
        zzal2.zzX((String)object);
        this.zza = object = zzal2.zzad();
    }

    public final void zza(zzfu zzfu2) {
        zzeq.zzb(this.zzb);
        long l2 = this.zzb.zze();
        Object object = this.zzb;
        long l3 = ((zzgb)object).zzf();
        long l4 = -9223372036854775807L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 != false && (l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) != false) {
            zzafa zzafa2;
            Object object2 = this.zza;
            long l8 = ((zzan)object2).zzr;
            long l12 = l3 - l8;
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 != false) {
                object2 = ((zzan)object2).zzb();
                ((zzal)object2).zzab(l3);
                this.zza = object = ((zzal)object2).zzad();
                zzafa2 = this.zzc;
                zzafa2.zzl((zzan)object);
            }
            int n3 = zzfu2.zzb();
            object = this.zzc;
            object.zzq(zzfu2, n3);
            zzafa2 = this.zzc;
            l7 = 0;
            object3 = 0;
            int n4 = 1;
            zzafa2.zzs(l2, n4, n3, 0, null);
        }
    }

    public final void zzb(zzgb object, zzadx object2, zzapo zzapo2) {
        this.zzb = object;
        zzapo2.zzc();
        int n3 = zzapo2.zza();
        this.zzc = object = object2.zzw(n3, 5);
        object2 = this.zza;
        object.zzl((zzan)object2);
    }
}

