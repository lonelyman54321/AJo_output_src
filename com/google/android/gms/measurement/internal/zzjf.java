/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlp;
import com.google.android.gms.measurement.internal.zzpn;

class zzjf
implements zzjh {
    protected final zzic zzu;

    public zzjf(zzic zzic2) {
        Preconditions.checkNotNull(zzic2);
        this.zzu = zzic2;
    }

    public Context zza() {
        return this.zzu.zza();
    }

    public Clock zzb() {
        return this.zzu.zzb();
    }

    public zzaf zzd() {
        return this.zzu.zzd();
    }

    public zzai zze() {
        return this.zzu.zzf();
    }

    public zzbf zzf() {
        return this.zzu.zzg();
    }

    public zzgl zzi() {
        return this.zzu.zzk();
    }

    public zzgo zzj() {
        return this.zzu.zzj();
    }

    public zzha zzk() {
        return this.zzu.zzn();
    }

    public zzhv zzl() {
        return this.zzu.zzl();
    }

    public zzlp zzn() {
        return this.zzu.zzq();
    }

    public zzpn zzs() {
        return this.zzu.zzv();
    }

    public void zzt() {
        this.zzu.zzl().zzt();
    }

    public void zzu() {
        this.zzu.zzaa();
    }

    public void zzv() {
        this.zzu.zzl().zzv();
    }
}

