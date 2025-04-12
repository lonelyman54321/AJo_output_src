/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhaw;
import com.google.android.gms.internal.ads.zzhbl;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhfg;

public final class zzhbm
extends zzhaw {
    final zzhde zza;
    final Object zzb;
    final zzhde zzc;
    final zzhbl zzd;

    public zzhbm(zzhde object, Object object2, zzhde zzhde2, zzhbl zzhbl2, Class object3) {
        if (object != null) {
            object3 = zzhbl2.zzc;
            zzhfg zzhfg2 = zzhfg.zzk;
            if (object3 == zzhfg2 && zzhde2 == null) {
                object = new IllegalArgumentException("Null messageDefaultInstance");
                throw object;
            }
            this.zza = object;
            this.zzb = object2;
            this.zzc = zzhde2;
            this.zzd = zzhbl2;
            return;
        }
        object = new IllegalArgumentException("Null containingTypeDefaultInstance");
        throw object;
    }
}

