/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzgv;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhm;
import com.google.android.gms.internal.gtm.zzih;

final class zzhk
implements zzih {
    final /* synthetic */ zzhm zza;

    public zzhk(zzhm zzhm2) {
        this.zza = zzhm2;
    }

    public final void zza(zzgv object) {
        zzhm zzhm2 = this.zza;
        long l2 = ((zzgv)object).zzb();
        zzhm.zzk(zzhm2, l2);
        long l3 = ((zzgv)object).zzb();
        object = new StringBuilder("Permanent failure dispatching hitId: ");
        ((StringBuilder)object).append(l3);
        zzhi.zzd(((StringBuilder)object).toString());
    }

    public final void zzb(zzgv object) {
        long l2;
        long l3 = ((zzgv)object).zza();
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            zzhm zzhm2 = this.zza;
            long l7 = ((zzgv)object).zzb();
            long l8 = zzhm.zze(this.zza).currentTimeMillis();
            zzhm.zzl(zzhm2, l7, l8);
            return;
        }
        Object object3 = zzhm.zze(this.zza);
        l2 = object3.currentTimeMillis();
        long l12 = (l3 += 14400000L) - l2;
        object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 < 0) {
            zzhm zzhm3 = this.zza;
            long l14 = ((zzgv)object).zzb();
            zzhm.zzk(zzhm3, l14);
            l3 = ((zzgv)object).zzb();
            object3 = "Giving up on failed hitId: ";
            object = new StringBuilder((String)object3);
            ((StringBuilder)object).append(l3);
            object = ((StringBuilder)object).toString();
            zzhi.zzd((String)object);
        }
    }
}

