/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdo;
import com.google.android.gms.internal.auth.zzdp;
import com.google.android.gms.internal.auth.zzeu;
import com.google.android.gms.internal.auth.zzfw;
import com.google.android.gms.internal.auth.zzge;

public class zzes
extends zzdo {
    protected zzeu zza;
    protected boolean zzb;
    private final zzeu zzc;

    public zzes(zzeu zzeu2) {
        this.zzc = zzeu2;
        this.zza = zzeu2 = (zzeu)zzeu2.zzi(4, null, null);
        this.zzb = false;
    }

    private static final void zzj(zzeu zzeu2, zzeu zzeu3) {
        zzge zzge2 = zzge.zza();
        Class<?> clazz = zzeu2.getClass();
        zzge2.zzb(clazz).zzf(zzeu2, zzeu3);
    }

    public final /* synthetic */ zzdo zzb(zzdp zzdp2) {
        zzdp2 = (zzeu)zzdp2;
        this.zze((zzeu)zzdp2);
        return this;
    }

    public final zzes zzd() {
        zzes zzes2 = (zzes)this.zzc.zzi(5, null, null);
        zzeu zzeu2 = this.zzf();
        zzes2.zze(zzeu2);
        return zzes2;
    }

    public final zzes zze(zzeu zzeu2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzi();
            bl2 = false;
            this.zzb = false;
        }
        zzes.zzj(this.zza, zzeu2);
        return this;
    }

    public zzeu zzf() {
        boolean bl2 = this.zzb;
        if (bl2) {
            return this.zza;
        }
        zzeu zzeu2 = this.zza;
        zzge zzge2 = zzge.zza();
        Class<?> clazz = zzeu2.getClass();
        zzge2.zzb(clazz).zze(zzeu2);
        this.zzb = true;
        return this.zza;
    }

    public final /* synthetic */ zzfw zzh() {
        return this.zzc;
    }

    public void zzi() {
        zzeu zzeu2 = (zzeu)this.zza.zzi(4, null, null);
        zzeu zzeu3 = this.zza;
        zzes.zzj(zzeu2, zzeu3);
        this.zza = zzeu2;
    }
}

