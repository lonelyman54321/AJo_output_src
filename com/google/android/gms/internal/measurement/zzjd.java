/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjn;

final class zzjd {
    private final zzjn zza;
    private final byte[] zzb;

    private zzjd(int n3) {
        Object object = new byte[n3];
        this.zzb = object;
        object = zzjn.zzb(object);
        this.zza = object;
    }

    public /* synthetic */ zzjd(int n3, zzjh zzjh2) {
        this(n3);
    }

    public final zziy zza() {
        this.zza.zzb();
        byte[] byArray = this.zzb;
        zzjf zzjf2 = new zzjf(byArray);
        return zzjf2;
    }

    public final zzjn zzb() {
        return this.zza;
    }
}

