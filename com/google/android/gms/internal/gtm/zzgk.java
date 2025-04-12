/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzgm;
import com.google.android.gms.internal.gtm.zzgo;
import com.google.android.gms.internal.gtm.zzgt;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhv;
import com.google.android.gms.internal.gtm.zzpk;
import com.google.android.gms.internal.gtm.zzpl;
import com.google.android.gms.internal.gtm.zzpy;
import com.google.android.gms.internal.gtm.zzqh;

final class zzgk
implements Runnable {
    final /* synthetic */ zzgm zza;
    private final zzpl zzb;

    public zzgk(zzgm zzgm2, zzpl zzpl2) {
        this.zza = zzgm2;
        this.zzb = zzpl2;
    }

    public final void run() {
        long l2;
        int n3;
        Object object = this.zzb.zzb().zzc();
        Object object2 = this.zza;
        Object object3 = this.zzb.zzc();
        zzhv zzhv2 = zzgm.zzf((zzgm)object2);
        object = zzgm.zzg((zzgm)object2).zza((zzpy)object, (zzqh)object3);
        zzgm.zzp(this.zza, (zzhv)object);
        object = this.zza;
        int n4 = 2;
        zzgm.zzq((zzgm)object, n4);
        object = zzgm.zzi(this.zza);
        object3 = "Container ";
        object2 = new StringBuilder((String)object3);
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" loaded during runtime initialization.");
        zzhi.zzd(((StringBuilder)object2).toString());
        object = this.zza;
        object2 = zzgm.zzl((zzgm)object);
        if (object2 != null) {
            object = zzgm.zzl((zzgm)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (zzgt)object.next();
                object3 = String.valueOf(((zzgt)object2).zzb());
                String string2 = "Evaluating tags for pending event ";
                zzhi.zzd(string2.concat((String)object3));
                object3 = zzgm.zzf(this.zza);
                ((zzhv)object3).zzf((zzgt)object2);
            }
            object = this.zza;
            n4 = 0;
            object2 = null;
            zzgm.zzo((zzgm)object, null);
        }
        zzgm.zzf(this.zza).zze();
        object = String.valueOf(zzgm.zzi(this.zza));
        object2 = "Runtime initialized successfully for container ";
        zzhi.zzd(((String)object2).concat((String)object));
        object = this.zzb.zzb();
        long l3 = ((zzpk)object).zza();
        object3 = zzgm.zze(this.zza);
        long l4 = ((zzgo)object3).zzb() + l3;
        if (zzhv2 == null && (n4 = (int)(zzgm.zzu((zzgm)(object = this.zza)) ? 1 : 0)) != 0 && (n4 = ((zzpl)(object2 = this.zzb)).zza()) == (n3 = 1) && (n3 = (int)((l2 = l4 - (l3 = (object = zzgm.zzc((zzgm)object)).currentTimeMillis())) == 0L ? 0 : (l2 < 0L ? -1 : 1))) < 0) {
            object = this.zza;
            long l7 = zzgm.zze((zzgm)object).zza();
            zzgm.zzr((zzgm)object, l7);
            return;
        }
        object = this.zza;
        long l8 = zzgm.zzc((zzgm)object).currentTimeMillis();
        l4 -= l8;
        l8 = Math.max(900000L, l4);
        zzgm.zzr((zzgm)object, l8);
    }
}

