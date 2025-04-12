/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzcn;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzcq;

public abstract class zzco {
    public static final zzco zza;
    static final zzco zzb;

    static {
        zzcn zzcn2 = new zzcd();
        Object object = "";
        zzcn2 = ((zzcd)zzcn2).zza((String)object).zza(false);
        Enum enum_ = zzcq.zza;
        zzcn2 = zzcn2.zza((zzcq)enum_);
        enum_ = zzcp.zza;
        zza = zzcn2.zza((zzcp)enum_).zza();
        zzcn2 = new zzcd();
        zzcn2 = ((zzcd)zzcn2).zza((String)object).zza(false);
        zzcq zzcq2 = zzcq.zzc;
        zzb = zzcn2.zza(zzcq2).zza((zzcp)enum_).zza();
        zzcn2 = new zzcd();
        zzcn2 = ((zzcd)zzcn2).zza((String)object).zza(false);
        object = zzcq.zzb;
        zzcn2.zza((zzcq)((Object)object)).zza((zzcp)enum_).zza();
    }

    public abstract zzcc zza();

    public abstract zzcb zzb();

    public abstract zzcq zzc();

    public abstract zzcp zzd();

    public abstract String zze();

    public abstract boolean zzf();
}

