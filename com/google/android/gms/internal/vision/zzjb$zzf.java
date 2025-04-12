/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zziw;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zzb;
import com.google.android.gms.internal.vision.zzjh;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkn;
import com.google.android.gms.internal.vision.zzkt;
import com.google.android.gms.internal.vision.zzml;
import com.google.android.gms.internal.vision.zzmo;

final class zzjb$zzf
implements zziw {
    final zzjh zza = null;
    final int zzb;
    final zzml zzc;
    final boolean zzd;
    final boolean zze;

    public zzjb$zzf(zzjh zzjh2, int n3, zzml zzml2, boolean bl2, boolean bl3) {
        this.zzb = 202056002;
        this.zzc = zzml2;
        this.zzd = true;
        this.zze = false;
    }

    public final /* synthetic */ int compareTo(Object object) {
        object = (zzjb$zzf)object;
        int n3 = this.zzb;
        int n4 = ((zzjb$zzf)object).zzb;
        return n3 - n4;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzkn zza(zzkn zzkn2, zzkk zzkk2) {
        zzkn2 = (zzjb$zzb)zzkn2;
        zzkk2 = (zzjb)zzkk2;
        return ((zzjb$zzb)zzkn2).zza((zzjb)zzkk2);
    }

    public final zzkt zza(zzkt object, zzkt zzkt2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final zzml zzb() {
        return this.zzc;
    }

    public final zzmo zzc() {
        return this.zzc.zza();
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return false;
    }
}

