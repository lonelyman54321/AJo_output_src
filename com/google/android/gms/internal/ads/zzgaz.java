/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgav;
import com.google.android.gms.internal.ads.zzgaw;
import com.google.android.gms.internal.ads.zzgbc;

public final class zzgaz
extends zzgav {
    public zzgaz() {
        super(4);
    }

    public zzgaz(int n3) {
        super(n3);
    }

    public final /* synthetic */ zzgaw zzb(Object object) {
        this.zza(object);
        return this;
    }

    public final zzgaz zzf(Object object) {
        this.zza(object);
        return this;
    }

    public final zzgaz zzg(Object ... objectArray) {
        this.zzd(objectArray, 2);
        return this;
    }

    public final zzgaz zzh(Iterable iterable) {
        this.zzc(iterable);
        return this;
    }

    public final zzgbc zzi() {
        this.zzc = true;
        Object[] objectArray = this.zza;
        int n3 = this.zzb;
        return zzgbc.zzj(objectArray, n3);
    }
}

