/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgc$zzc;
import com.google.android.gms.internal.measurement.zzgc$zzc$zza;
import com.google.android.gms.internal.measurement.zzgc$zzd;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzlo;
import java.util.Collections;
import java.util.List;

public final class zzgc$zzd$zza
extends zzkg$zza
implements zzlo {
    private zzgc$zzd$zza() {
        zzgc$zzd zzgc$zzd = zzgc$zzd.zzf();
        super(zzgc$zzd);
    }

    public /* synthetic */ zzgc$zzd$zza(zzgg zzgg2) {
        this();
    }

    public final int zza() {
        return ((zzgc$zzd)this.zza).zzb();
    }

    public final zzgc$zzc zza(int n3) {
        return ((zzgc$zzd)this.zza).zza(n3);
    }

    public final zzgc$zzd$zza zza(int n3, zzgc$zzc$zza zzlo2) {
        this.zzam();
        zzgc$zzd zzgc$zzd = (zzgc$zzd)this.zza;
        zzlo2 = (zzgc$zzc)((zzkg)zzlo2.zzaj());
        zzgc$zzd.zza(zzgc$zzd, n3, (zzgc$zzc)zzlo2);
        return this;
    }

    public final zzgc$zzd$zza zzb() {
        this.zzam();
        zzgc$zzd.zza((zzgc$zzd)this.zza);
        return this;
    }

    public final String zzc() {
        return ((zzgc$zzd)this.zza).zzj();
    }

    public final List zzd() {
        return Collections.unmodifiableList(((zzgc$zzd)this.zza).zzk());
    }

    public final List zze() {
        return Collections.unmodifiableList(((zzgc$zzd)this.zza).zzl());
    }
}

