/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzdn;

final class zzen {
    private final zzdn zza;
    private final zzap zzb;

    public zzen(zzdn zzdn2, zzap zzap2) {
        this.zza = zzdn2;
        this.zzb = zzap2;
    }

    public final int zza() {
        int n3;
        zzap zzap2 = (zzap)this.zza.zza();
        int n4 = zzap2.zzY();
        zzap zzap3 = this.zzb;
        if (zzap3 == null) {
            n3 = 0;
            zzap3 = null;
        } else {
            n3 = zzap3.zzY();
        }
        return n4 + n3;
    }

    public final zzap zzb() {
        return this.zzb;
    }

    public final zzdn zzc() {
        return this.zza;
    }
}

