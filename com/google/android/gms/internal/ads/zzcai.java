/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcau;

final class zzcai {
    private final Clock zza;
    private final zzg zzb;
    private final zzcau zzc;

    public zzcai(Clock clock, zzg zzg2, zzcau zzcau2) {
        this.zza = clock;
        this.zzb = zzg2;
        this.zzc = zzcau2;
    }

    public final void zza(int n3, long l2) {
        Object object = zzbep.zzaq;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            return;
        }
        object = this.zzb;
        long l3 = object.zzf();
        long l4 = 0L;
        long l7 = (l3 = l2 - l3) - l4;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        object = zzbep.zzar;
        zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (!bl2) {
            this.zzb.zzM(-1);
            this.zzb.zzN(l2);
            return;
        }
        this.zzb.zzM(n3);
        this.zzb.zzN(l2);
    }
}

