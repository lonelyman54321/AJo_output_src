/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzfg;

public final class zzce
extends zzbr {
    private final zzau zza;

    public zzce(zzbu object) {
        super((zzbu)object);
        this.zza = object = new zzau();
    }

    public final zzau zza() {
        this.zzV();
        return this.zza;
    }

    public final void zzd() {
        Object object = this.zzq().zzc();
        Object object2 = this.zza;
        ((zzau)object).zzh((zzau)object2);
        object = this.zzB();
        ((zzbr)object).zzV();
        object2 = ((zzfg)object).zzb;
        if (object2 != null) {
            zzau zzau2 = this.zza;
            zzau2.zzk((String)object2);
        }
        ((zzbr)object).zzV();
        object = ((zzfg)object).zza;
        if (object != null) {
            object2 = this.zza;
            ((zzau)object2).zzl((String)object);
        }
    }
}

