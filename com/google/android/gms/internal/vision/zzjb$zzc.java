/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzim;
import com.google.android.gms.internal.vision.zziu;
import com.google.android.gms.internal.vision.zziw;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zze;
import com.google.android.gms.internal.vision.zzjb$zzf;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzmo;
import java.util.ArrayList;
import java.util.List;

public abstract class zzjb$zzc
extends zzjb
implements zzkm {
    protected zziu zzc;

    public zzjb$zzc() {
        zziu zziu2;
        this.zzc = zziu2 = zziu.zza();
    }

    public final zziu zza() {
        zziu zziu2 = this.zzc;
        boolean bl2 = zziu2.zzc();
        if (bl2) {
            this.zzc = zziu2 = (zziu)this.zzc.clone();
        }
        return this.zzc;
    }

    public final Object zzb(zzim object) {
        object = zzjb.zza((zzim)object);
        Object object2 = ((zzjb$zze)object).zza;
        Object object3 = (zzjb)this.zzr();
        if (object2 == object3) {
            object2 = this.zzc;
            object3 = ((zzjb$zze)object).zzd;
            if ((object2 = ((zziu)object2).zza((zziw)object3)) == null) {
                return ((zzjb$zze)object).zzb;
            }
            object3 = ((zzjb$zze)object).zzd;
            boolean bl2 = ((zzjb$zzf)object3).zzd;
            if (bl2) {
                Object object4;
                object3 = ((zzjb$zzf)object3).zzc.zza();
                if (object3 == (object4 = zzmo.zzh)) {
                    object3 = new ArrayList();
                    object2 = ((List)object2).iterator();
                    while (bl2 = object2.hasNext()) {
                        object4 = object2.next();
                        object4 = ((zzjb$zze)object).zza(object4);
                        ((ArrayList)object3).add(object4);
                    }
                    return object3;
                }
                return object2;
            }
            return ((zzjb$zze)object).zza(object2);
        }
        object = new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        throw object;
    }
}

