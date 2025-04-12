/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaq;
import com.google.android.gms.internal.ads.zzt;

public final class zzao {
    private final zzt zza;
    private final int zzb;
    private final int zzc;
    private float zzd;

    public zzao(zzt zzt2, int n3, int n4) {
        this.zza = zzt2;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = 1.0f;
    }

    public final zzao zza(float f5) {
        this.zzd = f5;
        return this;
    }

    public final zzaq zzb() {
        zzt zzt2 = this.zza;
        int n3 = this.zzb;
        int n4 = this.zzc;
        float f5 = this.zzd;
        zzaq zzaq2 = new zzaq(zzt2, n3, n4, f5, 0L, null);
        return zzaq2;
    }
}

