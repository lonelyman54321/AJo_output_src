/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzbv;
import com.google.android.gms.tagmanager.zzdc;
import com.google.android.gms.tagmanager.zzdr;
import com.google.android.gms.tagmanager.zzfc;

final class zzdp
implements zzfc {
    final /* synthetic */ zzdr zza;

    public zzdp(zzdr zzdr2) {
        this.zza = zzdr2;
    }

    public final void zza(zzbv object) {
        long l2;
        long l3 = ((zzbv)object).zza();
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            zzdr zzdr2 = this.zza;
            long l7 = ((zzbv)object).zzb();
            long l8 = zzdr.zze(this.zza).currentTimeMillis();
            zzdr.zzi(zzdr2, l7, l8);
            return;
        }
        Clock clock = zzdr.zze(this.zza);
        l2 = clock.currentTimeMillis();
        long l12 = (l3 += 14400000L) - l2;
        object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 < 0) {
            Object object3 = this.zza;
            long l14 = ((zzbv)object).zzb();
            zzdr.zzh((zzdr)object3, l14);
            l3 = ((zzbv)object).zzb();
            object = Wm2.a(l3, "Giving up on failed hitId: ");
            object3 = zzdc.zzb;
            ((zzbb)object3).zzd((String)object);
        }
    }
}

