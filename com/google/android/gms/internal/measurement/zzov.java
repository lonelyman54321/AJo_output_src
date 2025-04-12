/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzif;
import com.google.android.gms.internal.measurement.zzow;

public final class zzov
implements zzow {
    private static final zzhx zza;
    private static final zzhx zzb;
    private static final zzhx zzc;
    private static final zzhx zzd;
    private static final zzhx zze;
    private static final zzhx zzf;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        zza = zzif2.zza("measurement.test.boolean_flag", false);
        long l2 = -1;
        zzb = zzif2.zza("measurement.test.cached_long_flag", l2);
        zzc = zzif2.zza("measurement.test.double_flag", -3.0);
        zzd = zzif2.zza("measurement.test.int_flag", -2);
        zze = zzif2.zza("measurement.test.long_flag", l2);
        zzf = zzif2.zza("measurement.test.string_flag", "---");
    }

    public final double zza() {
        return (Double)zzc.zza();
    }

    public final long zzb() {
        return (Long)zzb.zza();
    }

    public final long zzc() {
        return (Long)zzd.zza();
    }

    public final long zzd() {
        return (Long)zze.zza();
    }

    public final String zze() {
        return (String)zzf.zza();
    }

    public final boolean zzf() {
        return (Boolean)zza.zza();
    }
}

