/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabu;
import com.google.android.gms.internal.gtm.zzaca;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzaci;
import com.google.android.gms.internal.gtm.zzadk;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadq;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzaey;

final class zzacd
implements zzabu {
    final zzaci zza;
    final int zzb;
    final zzaex zzc;
    final boolean zzd;

    public zzacd(zzaci zzaci2, int n3, zzaex zzaex2, boolean bl2, boolean bl3) {
        this.zza = zzaci2;
        this.zzb = n3;
        this.zzc = zzaex2;
        this.zzd = bl2;
    }

    public final /* synthetic */ int compareTo(Object object) {
        int n3 = ((zzacd)object).zzb;
        return this.zzb - n3;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzadk zzb(zzadk zzadk2, zzadl zzadl2) {
        zzadk2 = (zzaca)zzadk2;
        zzadl2 = (zzacf)zzadl2;
        ((zzaca)zzadk2).zzA((zzacf)zzadl2);
        return zzadk2;
    }

    public final zzadq zzc(zzadq object, zzadq zzadq2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final zzaex zzd() {
        return this.zzc;
    }

    public final zzaey zze() {
        return this.zzc.zza();
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg() {
        return this.zzd;
    }
}

