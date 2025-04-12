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

public final class zzagi
implements zzadu {
    private final zzfu zza;
    private final zzaev zzb;

    public zzagi() {
        Object object = new zzfu(4);
        this.zza = object;
        int n3 = -1;
        this.zzb = object = new zzaev(n3, n3, "image/heif");
    }

    private final boolean zza(zzadv object, int n3) {
        Object object2 = this.zza;
        int n4 = 4;
        ((zzfu)object2).zzH(n4);
        object2 = this.zza.zzM();
        ((zzadi)object).zzm((byte[])object2, 0, n4, false);
        object = this.zza;
        long l2 = ((zzfu)object).zzu();
        long l3 = n3;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        return l4 == false;
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

    public final boolean zzf(zzadv zzadv2) {
        boolean bl2;
        zzadv zzadv3 = zzadv2;
        zzadv3 = (zzadi)zzadv2;
        int n3 = 4;
        ((zzadi)zzadv3).zzl(n3, false);
        int n4 = this.zza(zzadv2, 1718909296);
        return n4 != 0 && (bl2 = this.zza(zzadv2, n4 = 1751476579));
    }
}

