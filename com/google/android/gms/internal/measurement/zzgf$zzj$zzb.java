/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzj;
import com.google.android.gms.internal.measurement.zzgf$zzk;
import com.google.android.gms.internal.measurement.zzgf$zzk$zza;
import com.google.android.gms.internal.measurement.zzgp;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzlo;
import java.util.Collections;
import java.util.List;

public final class zzgf$zzj$zzb
extends zzkg$zza
implements zzlo {
    private zzgf$zzj$zzb() {
        zzgf$zzj zzgf$zzj = zzgf$zzj.zzc();
        super(zzgf$zzj);
    }

    public /* synthetic */ zzgf$zzj$zzb(zzgp zzgp2) {
        this();
    }

    public final int zza() {
        return ((zzgf$zzj)this.zza).zza();
    }

    public final zzgf$zzj$zzb zza(int n3, zzgf$zzk$zza zzlo2) {
        this.zzam();
        zzgf$zzj zzgf$zzj = (zzgf$zzj)this.zza;
        zzlo2 = (zzgf$zzk)((zzkg)zzlo2.zzaj());
        zzgf$zzj.zza(zzgf$zzj, n3, (zzgf$zzk)zzlo2);
        return this;
    }

    public final zzgf$zzj$zzb zza(zzgf$zzk$zza zzlo2) {
        this.zzam();
        zzgf$zzj zzgf$zzj = (zzgf$zzj)this.zza;
        zzlo2 = (zzgf$zzk)((zzkg)zzlo2.zzaj());
        zzgf$zzj.zza(zzgf$zzj, (zzgf$zzk)zzlo2);
        return this;
    }

    public final zzgf$zzj$zzb zza(Iterable iterable) {
        this.zzam();
        zzgf$zzj.zza((zzgf$zzj)this.zza, iterable);
        return this;
    }

    public final zzgf$zzj$zzb zza(String string2) {
        this.zzam();
        zzgf$zzj.zza((zzgf$zzj)this.zza, string2);
        return this;
    }

    public final zzgf$zzk zza(int n3) {
        return ((zzgf$zzj)this.zza).zza(n3);
    }

    public final zzgf$zzj$zzb zzb() {
        this.zzam();
        zzgf$zzj.zzb((zzgf$zzj)this.zza);
        return this;
    }

    public final zzgf$zzj$zzb zzb(String string2) {
        this.zzam();
        zzgf$zzj.zzb((zzgf$zzj)this.zza, string2);
        return this;
    }

    public final String zzc() {
        return ((zzgf$zzj)this.zza).zzd();
    }

    public final List zzd() {
        return Collections.unmodifiableList(((zzgf$zzj)this.zza).zzf());
    }
}

