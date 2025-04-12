/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabo;
import com.google.android.gms.internal.gtm.zzacd;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzaey;

public final class zzace
extends zzabo {
    final zzadl zza;
    final Object zzb;
    final zzadl zzc;
    final zzacd zzd;

    public zzace(zzadl object, Object object2, zzadl zzadl2, zzacd zzacd2, Class object3) {
        if (object != null) {
            object3 = zzacd2.zzc;
            zzaex zzaex2 = zzaex.zzk;
            if (object3 == zzaex2 && zzadl2 == null) {
                object = new IllegalArgumentException("Null messageDefaultInstance");
                throw object;
            }
            this.zza = object;
            this.zzb = object2;
            this.zzc = zzadl2;
            this.zzd = zzacd2;
            return;
        }
        object = new IllegalArgumentException("Null containingTypeDefaultInstance");
        throw object;
    }

    public final Object zza(Object object) {
        zzaey zzaey2;
        Object object2 = this.zzd.zzc.zza();
        if (object2 == (zzaey2 = zzaey.zzh)) {
            object2 = this.zzd;
            int n3 = (Integer)object;
            object2 = ((zzacd)object2).zza;
            object = object2.zza(n3);
        }
        return object;
    }
}

