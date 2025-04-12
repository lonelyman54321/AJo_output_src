/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzabo;
import com.google.android.gms.internal.ads.zzabq;
import com.google.android.gms.internal.ads.zzabv;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzga;

final class zzabw {
    private final zzabv zza;
    private final zzabq zzb;
    private final zzabo zzc;
    private final zzga zzd;
    private final zzga zze;
    private final zzfm zzf;
    private zzdv zzg;
    private zzdv zzh;
    private long zzi;
    private long zzj;

    public zzabw(zzabv object, zzabq zzabq2) {
        this.zza = object;
        this.zzb = zzabq2;
        this.zzc = object = new zzabo();
        int n3 = 10;
        this.zzd = object = new zzga(n3);
        this.zze = object = new zzga(n3);
        this.zzf = object = new zzfm(16);
        this.zzh = object = zzdv.zza;
        this.zzj = -9223372036854775807L;
    }

    private static Object zzf(zzga object) {
        int n3 = ((zzga)object).zza();
        int n4 = 1;
        n3 = n3 > 0 ? 1 : 0;
        zzeq.zzd(n3 != 0);
        while ((n3 = ((zzga)object).zza()) > n4) {
            ((zzga)object).zzb();
        }
        object = ((zzga)object).zzb();
        object.getClass();
        return object;
    }

    public final void zza() {
        long l2;
        this.zzf.zzc();
        this.zzj = l2 = -9223372036854775807L;
        Object object = this.zze;
        int n3 = ((zzga)object).zza();
        if (n3 > 0) {
            object = (Long)zzabw.zzf((zzga)object);
            ((Long)object).longValue();
            zzga zzga2 = this.zze;
            long l3 = 0L;
            zzga2.zzd(l3, object);
        }
        if ((object = this.zzg) == null) {
            object = this.zzd;
            n3 = ((zzga)object).zza();
            if (n3 > 0) {
                this.zzg = object = (zzdv)zzabw.zzf((zzga)object);
            }
            return;
        }
        this.zzd.zze();
    }

    public final void zzb(long l2, long l3) {
        Long l4 = l3;
        this.zze.zzd(l2, l4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzc(long l2, long l3) {
        Object object;
        int n3;
        zzabw zzabw2 = this;
        while ((n3 = ((zzfm)(object = zzabw2.zzf)).zzd()) == 0) {
            boolean bl2;
            long l4;
            long l7;
            long l8;
            long l12;
            long l14;
            Object object2 = zzabw2.zze;
            long l15 = ((zzfm)object).zza();
            if ((object = (Long)((zzga)object2).zzc(l15)) != null && (l14 = (l12 = (l8 = ((Long)object).longValue()) - (l7 = zzabw2.zzi)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false) {
                zzabw2.zzi = l4 = ((Long)object).longValue();
                object = zzabw2.zzb;
                ((zzabq)object).zzf();
            }
            Object object3 = zzabw2.zzb;
            long l16 = zzabw2.zzi;
            zzabo zzabo2 = zzabw2.zzc;
            l7 = l15;
            long l17 = l2;
            long l18 = l3;
            int n4 = ((zzabq)object3).zza(l15, l2, l3, l16, false, zzabo2);
            if (n4 != 0 && n4 != (n3 = 1)) {
                n3 = 2;
                if (n4 != n3 && n4 != (n3 = 3) && n4 != (n3 = 4)) {
                    return;
                }
                zzabw2.zzj = l15;
                zzabw2.zzf.zzb();
                object = zzabw2.zza;
                object.zzl();
                continue;
            }
            zzabw2.zzj = l15;
            l17 = zzabw2.zzf.zzb();
            object2 = (zzdv)zzabw2.zzd.zzc(l17);
            if (object2 != null && !(bl2 = ((zzdv)object2).equals(object3 = zzdv.zza)) && !(bl2 = ((zzdv)object2).equals(object3 = zzabw2.zzh))) {
                zzabw2.zzh = object2;
                object3 = zzabw2.zza;
                object3.zzm((zzdv)object2);
            }
            if (n4 == 0) {
                l4 = -1;
            } else {
                object = zzabw2.zzc;
                l4 = ((zzabo)object).zzd();
            }
            l7 = l4;
            object3 = zzabw2.zza;
            l18 = zzabw2.zzi;
            object = zzabw2.zzb;
            boolean bl3 = ((zzabq)object).zzp();
            object3.zzp(l4, l17, l18, bl3);
        }
    }

    public final void zzd(float f5) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        object = object > 0 ? (Object)true : (Object)false;
        zzeq.zzd((boolean)object);
        this.zzb.zzn(f5);
    }

    public final boolean zze(long l2) {
        long l3;
        long l4 = this.zzj;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        return object != false && (l3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) >= 0;
    }
}

