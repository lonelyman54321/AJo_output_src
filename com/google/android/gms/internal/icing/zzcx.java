/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbr;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzem;
import com.google.android.gms.internal.icing.zzfc;

public class zzcx
extends zzbr {
    protected zzda zza;
    protected boolean zzb;
    private final zzda zzc;

    public zzcx(zzda zzda2) {
        this.zzc = zzda2;
        this.zza = zzda2 = (zzda)zzda2.zzf(4, null, null);
        this.zzb = false;
    }

    private static final void zza(zzda zzda2, zzda zzda3) {
        zzem zzem2 = zzem.zza();
        Class<?> clazz = zzda2.getClass();
        zzem2.zzb(clazz).zzc(zzda2, zzda3);
    }

    public void zzg() {
        zzda zzda2 = (zzda)this.zza.zzf(4, null, null);
        zzda zzda3 = this.zza;
        zzcx.zza(zzda2, zzda3);
        this.zza = zzda2;
    }

    public final zzcx zzh() {
        zzcx zzcx2 = (zzcx)this.zzc.zzf(5, null, null);
        zzda zzda2 = this.zzi();
        zzcx2.zzk(zzda2);
        return zzcx2;
    }

    public zzda zzi() {
        boolean bl2 = this.zzb;
        if (bl2) {
            return this.zza;
        }
        zzda zzda2 = this.zza;
        zzem zzem2 = zzem.zza();
        Class<?> clazz = zzda2.getClass();
        zzem2.zzb(clazz).zze(zzda2);
        this.zzb = true;
        return this.zza;
    }

    public final zzda zzj() {
        Object object;
        byte by2;
        zzda zzda2 = this.zzi();
        Object object2 = (Byte)zzda2.zzf(by2 = 1, null, null);
        byte by4 = (Byte)object2;
        if (by4 != by2) {
            if (by4 == 0) {
                by2 = 0;
                object = null;
            } else {
                object2 = zzem.zza();
                Class<?> clazz = zzda2.getClass();
                by4 = (byte)((object2 = ((zzem)object2).zzb(clazz)).zzf(zzda2) ? 1 : 0);
                if (by2 != by4) {
                    by2 = 0;
                    object = null;
                } else {
                    object = zzda2;
                }
                int n3 = 2;
                zzda2.zzf(n3, object, null);
                by2 = by4;
            }
        }
        if (by2 != 0) {
            return zzda2;
        }
        object = new zzfc(zzda2);
        throw object;
    }

    public final zzcx zzk(zzda zzda2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzcx.zza(this.zza, zzda2);
        return this;
    }
}

