/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zziu;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zzb;
import com.google.android.gms.internal.vision.zzjb$zzc;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;

public class zzjb$zzd
extends zzjb$zzb
implements zzkm {
    public zzjb$zzd(zzjb$zzc zzjb$zzc) {
        super(zzjb$zzc);
    }

    public void zzb() {
        super.zzb();
        Object object = this.zza;
        zzjb zzjb2 = object;
        zzjb2 = (zzjb$zzc)object;
        ((zzjb$zzc)zzjb2).zzc = object = (zziu)((zzjb$zzc)object).zzc.clone();
    }

    public /* synthetic */ zzjb zzc() {
        return (zzjb$zzc)this.zze();
    }

    public /* synthetic */ zzkk zze() {
        boolean bl2 = this.zzb;
        if (bl2) {
            return (zzjb$zzc)this.zza;
        }
        ((zzjb$zzc)this.zza).zzc.zzb();
        return (zzjb$zzc)super.zzc();
    }
}

