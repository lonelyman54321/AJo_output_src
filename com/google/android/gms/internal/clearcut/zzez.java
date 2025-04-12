/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzex;
import com.google.android.gms.internal.clearcut.zzey;
import com.google.android.gms.internal.clearcut.zzfr;

final class zzez
extends zzex {
    private static void zza(Object object, zzey zzey2) {
        ((zzcg)object).zzjp = zzey2;
    }

    public final /* synthetic */ void zza(Object object, int n3, long l2) {
        object = (zzey)object;
        Long l3 = l2;
        ((zzey)object).zzb(n3 <<= 3, l3);
    }

    public final /* synthetic */ void zza(Object object, int n3, zzbb zzbb2) {
        object = (zzey)object;
        n3 = n3 << 3 | 2;
        ((zzey)object).zzb(n3, zzbb2);
    }

    public final /* synthetic */ void zza(Object object, zzfr zzfr2) {
        ((zzey)object).zzb(zzfr2);
    }

    public final void zzc(Object object) {
        ((zzcg)object).zzjp.zzv();
    }

    public final /* synthetic */ void zzc(Object object, zzfr zzfr2) {
        ((zzey)object).zza(zzfr2);
    }

    public final /* synthetic */ Object zzdz() {
        return zzey.zzeb();
    }

    public final /* synthetic */ void zze(Object object, Object object2) {
        object2 = (zzey)object2;
        zzez.zza(object, (zzey)object2);
    }

    public final /* synthetic */ void zzf(Object object, Object object2) {
        object2 = (zzey)object2;
        zzez.zza(object, (zzey)object2);
    }

    public final /* synthetic */ Object zzg(Object object, Object object2) {
        object = (zzey)object;
        zzey zzey2 = zzey.zzea();
        boolean bl2 = ((zzey)(object2 = (zzey)object2)).equals(zzey2);
        if (bl2) {
            return object;
        }
        return zzey.zza((zzey)object, (zzey)object2);
    }

    public final /* synthetic */ int zzm(Object object) {
        return ((zzey)object).zzas();
    }

    public final /* synthetic */ Object zzq(Object object) {
        return ((zzcg)object).zzjp;
    }

    public final /* synthetic */ int zzr(Object object) {
        return ((zzey)object).zzec();
    }
}

