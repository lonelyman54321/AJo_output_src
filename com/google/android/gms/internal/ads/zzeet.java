/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzefd;

public final class zzeet
implements zzdaz,
zzczo {
    private static final Object zza;
    private static int zzb;
    private final zzg zzc;
    private final zzefd zzd;

    static {
        Object object;
        zza = object = new Object();
    }

    public zzeet(zzefd zzefd2, zzg zzg2) {
        this.zzd = zzefd2;
        this.zzc = zzg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzb(boolean bl2) {
        int n3;
        int n4;
        Object object = zzbep.zzgs;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (!bl3) {
            return;
        }
        object = this.zzc;
        bl3 = object.zzS();
        if (bl3) return;
        object = zza;
        synchronized (object) {
            n4 = zzb;
            Object object3 = zzbep.zzgt;
            zzben zzben2 = zzba.zzc();
            object3 = zzben2.zza((zzbeg)object3);
            object3 = (Integer)object3;
            n3 = (Integer)object3;
        }
        if (n4 >= n3) return;
        object2 = this.zzd;
        ((zzefd)object2).zzd(bl2);
        synchronized (object) {
            bl2 = zzb + 1;
            zzb = (int)(bl2 ? 1 : 0);
            return;
        }
    }

    public final void zzdB(zze zze2) {
        this.zzb(false);
    }

    public final void zzs() {
        this.zzb(true);
    }
}

