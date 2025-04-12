/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzds;
import com.google.android.gms.internal.auth.zzel;
import com.google.android.gms.internal.auth.zzes;
import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzeu;
import com.google.android.gms.internal.auth.zzfw;
import com.google.android.gms.internal.auth.zzgh;
import com.google.android.gms.internal.auth.zzgj;
import com.google.android.gms.internal.auth.zzgy;
import com.google.android.gms.internal.auth.zzgz;

final class zzga
implements zzgh {
    private final zzfw zza;
    private final zzgy zzb;
    private final zzel zzc;

    private zzga(zzgy zzgy2, zzel zzel2, zzfw zzfw2) {
        this.zzb = zzgy2;
        this.zzc = zzel2;
        this.zza = zzfw2;
    }

    public static zzga zzb(zzgy zzgy2, zzel zzel2, zzfw zzfw2) {
        zzga zzga2 = new zzga(zzgy2, zzel2, zzfw2);
        return zzga2;
    }

    public final int zza(Object object) {
        return this.zzb.zza(object).hashCode();
    }

    public final Object zzd() {
        return ((zzes)((zzeu)this.zza).zzi(5, null, null)).zzg();
    }

    public final void zze(Object object) {
        this.zzb.zze(object);
        this.zzc.zzb(object);
    }

    public final void zzf(Object object, Object object2) {
        zzgj.zzf(this.zzb, object, object2);
    }

    public final void zzg(Object object, byte[] object2, int n3, int n4, zzds zzds2) {
        object2 = object;
        object2 = (zzeu)object;
        zzgz zzgz2 = object2.zzc;
        zzgz zzgz3 = zzgz.zza();
        if (zzgz2 == zzgz3) {
            object2.zzc = zzgz2 = zzgz.zzc();
        }
        object = (zzet)object;
        throw null;
    }

    public final boolean zzh(Object object, Object object2) {
        zzgy zzgy2;
        boolean bl2 = (object = this.zzb.zza(object)).equals(object2 = (zzgy2 = this.zzb).zza(object2));
        return bl2;
    }

    public final boolean zzi(Object object) {
        this.zzc.zza(object);
        throw null;
    }
}

