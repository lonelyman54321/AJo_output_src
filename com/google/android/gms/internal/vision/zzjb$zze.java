/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzim;
import com.google.android.gms.internal.vision.zzjb$zzf;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzml;
import com.google.android.gms.internal.vision.zzmo;

public final class zzjb$zze
extends zzim {
    final zzkk zza;
    final Object zzb;
    final zzkk zzc;
    final zzjb$zzf zzd;

    public zzjb$zze(zzkk object, Object object2, zzkk zzkk2, zzjb$zzf zzjb$zzf, Class object3) {
        if (object != null) {
            object3 = zzjb$zzf.zzc;
            zzml zzml2 = zzml.zzk;
            if (object3 == zzml2 && zzkk2 == null) {
                object = new IllegalArgumentException("Null messageDefaultInstance");
                throw object;
            }
            this.zza = object;
            this.zzb = object2;
            this.zzc = zzkk2;
            this.zzd = zzjb$zzf;
            return;
        }
        object = new IllegalArgumentException("Null containingTypeDefaultInstance");
        throw object;
    }

    public final Object zza(Object object) {
        zzmo zzmo2;
        zzmo zzmo3 = this.zzd.zzc.zza();
        if (zzmo3 != (zzmo2 = zzmo.zzh)) {
            return object;
        }
        ((Integer)object).intValue();
        throw null;
    }
}

