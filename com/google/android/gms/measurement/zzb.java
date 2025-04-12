/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement$zza;
import com.google.android.gms.measurement.internal.zza;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzjt;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzpm;
import java.util.List;
import java.util.Map;

final class zzb
extends AppMeasurement$zza {
    private final zzic zza;
    private final zzju zzb;

    public zzb(zzic zzjh2) {
        super(null);
        Preconditions.checkNotNull(zzjh2);
        this.zza = zzjh2;
        zzjh2 = zzjh2.zzp();
        this.zzb = zzjh2;
    }

    public final int zza(String string2) {
        return zzju.zza(string2);
    }

    public final Boolean zza() {
        return this.zzb.zzae();
    }

    public final Object zza(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            return null;
                        }
                        return this.zza();
                    }
                    return this.zzc();
                }
                return this.zzb();
            }
            return this.zzd();
        }
        return this.zze();
    }

    public final List zza(String string2, String string3) {
        return this.zzb.zza(string2, string3);
    }

    public final Map zza(String string2, String string3, boolean bl2) {
        return this.zzb.zza(string2, string3, bl2);
    }

    public final Map zza(boolean bl2) {
        Object object = this.zzb.zza(bl2);
        int n3 = object.size();
        Jp jp = new a53(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (zzpm)object.next();
            Object object3 = ((zzpm)object2).zza();
            if (object3 == null) continue;
            object2 = ((zzpm)object2).zza;
            jp.put(object2, object3);
        }
        return jp;
    }

    public final void zza(Bundle bundle) {
        this.zzb.zza(bundle);
    }

    public final void zza(zzjq zzjq2) {
        this.zzb.zza(zzjq2);
    }

    public final void zza(zzjt zzjt2) {
        this.zzb.zza(zzjt2);
    }

    public final void zza(String string2, String string3, Bundle bundle) {
        this.zza.zzp().zza(string2, string3, bundle);
    }

    public final void zza(String string2, String string3, Bundle bundle, long l2) {
        this.zzb.zza(string2, string3, bundle, l2);
    }

    public final Double zzb() {
        return this.zzb.zzaf();
    }

    public final void zzb(zzjt zzjt2) {
        this.zzb.zzb(zzjt2);
    }

    public final void zzb(String string2) {
        zza zza2 = this.zza.zze();
        long l2 = this.zza.zzb().elapsedRealtime();
        zza2.zza(string2, l2);
    }

    public final void zzb(String string2, String string3, Bundle bundle) {
        this.zzb.zzb(string2, string3, bundle);
    }

    public final Integer zzc() {
        return this.zzb.zzag();
    }

    public final void zzc(String string2) {
        zza zza2 = this.zza.zze();
        long l2 = this.zza.zzb().elapsedRealtime();
        zza2.zzb(string2, l2);
    }

    public final Long zzd() {
        return this.zzb.zzah();
    }

    public final String zze() {
        return this.zzb.zzam();
    }

    public final long zzf() {
        return this.zza.zzv().zzo();
    }

    public final String zzg() {
        return this.zzb.zzai();
    }

    public final String zzh() {
        return this.zzb.zzaj();
    }

    public final String zzi() {
        return this.zzb.zzak();
    }

    public final String zzj() {
        return this.zzb.zzai();
    }
}

