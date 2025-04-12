/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzbb;
import com.google.android.gms.internal.measurement.zze;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzgr$zzd;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzj;
import com.google.android.gms.internal.measurement.zzl;
import com.google.android.gms.internal.measurement.zzz;
import java.util.concurrent.Callable;

public final class zzf {
    final zzh zza;
    final zzh zzb;
    private final zzbb zzc;
    private final zzl zzd;

    public zzf() {
        zzh zzh2;
        Object object = new zzbb();
        this.zzc = object;
        this.zzb = zzh2 = new zzh(null, (zzbb)object);
        this.zza = object = zzh2.zza();
        this.zzd = object = new zzl();
        Object object2 = new zzz((zzl)object);
        zzh2.zzc("require", (zzaq)object2);
        object2 = new zze();
        ((zzl)object).zza("internal.platform", (Callable)object2);
        object2 = 0.0;
        object = new zzai((Double)object2);
        zzh2.zzc("runtime.counter", (zzaq)object);
    }

    public final zzaq zza(zzh zzh2, zzgr$zzd ... zzgr$zzdArray) {
        zzaq zzaq2 = zzaq.zzc;
        int n3 = zzgr$zzdArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            zzaq2 = zzj.zza(zzgr$zzdArray[i3]);
            Object object = this.zzb;
            zzg.zza((zzh)object);
            boolean bl2 = zzaq2 instanceof zzat;
            if (!bl2 && !(bl2 = zzaq2 instanceof zzar)) continue;
            object = this.zzc;
            zzaq2 = ((zzbb)object).zza(zzh2, zzaq2);
        }
        return zzaq2;
    }

    public final void zza(String string2, Callable callable) {
        this.zzd.zza(string2, callable);
    }
}

