/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaev;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

public final class zzaqb
implements zzadu {
    private final zzfu zza;
    private final zzaev zzb;

    public zzaqb() {
        Object object = new zzfu(4);
        this.zza = object;
        int n3 = -1;
        this.zzb = object = new zzaev(n3, n3, "image/webp");
    }

    public final int zzb(zzadv zzadv2, zzaeq zzaeq2) {
        return this.zzb.zzb(zzadv2, zzaeq2);
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        this.zzb.zzd(zzadx2);
    }

    public final void zze(long l2, long l3) {
        this.zzb.zze(l2, l3);
    }

    public final boolean zzf(zzadv object) {
        Object object2 = this.zza;
        int n3 = 4;
        ((zzfu)object2).zzH(n3);
        object2 = this.zza.zzM();
        object = (zzadi)object;
        ((zzadi)object).zzm((byte[])object2, 0, n3, false);
        object2 = this.zza;
        long l2 = ((zzfu)object2).zzu();
        long l3 = 1380533830L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            ((zzadi)object).zzl(n3, false);
            this.zza.zzH(n3);
            object2 = this.zza.zzM();
            ((zzadi)object).zzm((byte[])object2, 0, n3, false);
            object = this.zza;
            long l7 = ((zzfu)object).zzu();
            l2 = 1464156752L;
            long l8 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
            if (l8 == false) {
                return true;
            }
        }
        return false;
    }
}

