/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdz;

public final class zzjs {
    final Context zza;
    String zzb;
    String zzc;
    String zzd;
    Boolean zze;
    long zzf;
    zzdz zzg;
    boolean zzh;
    Long zzi;
    String zzj;

    public zzjs(Context object, zzdz object2, Long l2) {
        boolean bl2;
        this.zzh = bl2 = true;
        Preconditions.checkNotNull(object);
        object = object.getApplicationContext();
        Preconditions.checkNotNull(object);
        this.zza = object;
        this.zzi = l2;
        if (object2 != null) {
            long l3;
            boolean bl3;
            this.zzg = object2;
            object = ((zzdz)object2).zzf;
            this.zzb = object;
            object = ((zzdz)object2).zze;
            this.zzc = object;
            object = ((zzdz)object2).zzd;
            this.zzd = object;
            this.zzh = bl3 = ((zzdz)object2).zzc;
            this.zzf = l3 = ((zzdz)object2).zzb;
            object = ((zzdz)object2).zzh;
            this.zzj = object;
            object = ((zzdz)object2).zzg;
            if (object != null) {
                object2 = "dataCollectionDefaultEnabled";
                bl3 = object.getBoolean((String)object2, bl2);
                object = bl3;
                this.zze = object;
            }
        }
    }
}

