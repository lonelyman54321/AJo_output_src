/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzmq;
import com.google.android.gms.internal.ads.zzzg;

public final class zzzn {
    public final int zza;
    public final zzmq[] zzb;
    public final zzzg[] zzc;
    public final zzdp zzd;
    public final Object zze;

    public zzzn(zzmq[] zzmqArray, zzzg[] zzzgArray, zzdp zzdp2, Object object) {
        int n3;
        this.zzb = zzmqArray;
        zzzgArray = (zzzg[])zzzgArray.clone();
        this.zzc = zzzgArray;
        this.zzd = zzdp2;
        this.zze = object;
        this.zza = n3 = zzmqArray.length;
    }

    public final boolean zza(zzzn object, int n3) {
        boolean bl2;
        if (object == null) {
            return false;
        }
        Object object2 = this.zzb[n3];
        zzmq zzmq2 = ((zzzn)object).zzb[n3];
        boolean bl3 = zzgd.zzG(object2, zzmq2);
        return bl3 && (bl2 = zzgd.zzG(object2 = this.zzc[n3], object = ((zzzn)object).zzc[n3]));
    }

    public final boolean zzb(int n3) {
        zzmq[] zzmqArray = this.zzb;
        zzmq zzmq2 = zzmqArray[n3];
        return zzmq2 != null;
    }
}

