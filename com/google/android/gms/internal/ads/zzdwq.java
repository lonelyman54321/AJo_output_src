/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzdwh;
import com.google.android.gms.internal.ads.zzdws;

final class zzdwq
extends zzbzg {
    final /* synthetic */ zzdws zza;

    public zzdwq(zzdws zzdws2) {
        this.zza = zzdws2;
    }

    public final void zze(int n3) {
        zzdws zzdws2 = this.zza;
        zzdwh zzdwh2 = zzdws.zze(zzdws2);
        long l2 = zzdws.zzd(zzdws2);
        zzdwh2.zzm(l2, n3);
    }

    public final void zzf(zze zze2) {
        zzdws zzdws2 = this.zza;
        zzdwh zzdwh2 = zzdws.zze(zzdws2);
        long l2 = zzdws.zzd(zzdws2);
        int n3 = zze2.zza;
        zzdwh2.zzm(l2, n3);
    }

    public final void zzg() {
        zzdws zzdws2 = this.zza;
        zzdwh zzdwh2 = zzdws.zze(zzdws2);
        long l2 = zzdws.zzd(zzdws2);
        zzdwh2.zzp(l2);
    }
}

