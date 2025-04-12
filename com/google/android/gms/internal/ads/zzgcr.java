/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgdi;
import java.util.Iterator;

final class zzgcr
extends zzgbh {
    private final transient zzgbf zza;
    private final transient zzgbc zzb;

    public zzgcr(zzgbf zzgbf2, zzgbc zzgbc2) {
        this.zza = zzgbf2;
        this.zzb = zzgbc2;
    }

    public final boolean contains(Object object) {
        zzgbf zzgbf2 = this.zza;
        return (object = zzgbf2.get(object)) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.zzu(0);
    }

    public final int size() {
        return this.zza.size();
    }

    public final int zza(Object[] objectArray, int n3) {
        return this.zzb.zza(objectArray, n3);
    }

    public final zzgbc zzd() {
        return this.zzb;
    }

    public final zzgdi zze() {
        return this.zzb.zzu(0);
    }

    public final boolean zzf() {
        return true;
    }
}

