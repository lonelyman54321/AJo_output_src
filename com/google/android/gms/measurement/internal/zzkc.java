/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzon;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class zzkc
implements zzlo {
    private /* synthetic */ zzju zza;
    private /* synthetic */ AtomicReference zzb;
    private /* synthetic */ zzon zzc;

    public /* synthetic */ zzkc(zzju zzju2, AtomicReference atomicReference, zzon zzon2) {
        this.zza = zzju2;
        this.zzb = atomicReference;
        this.zzc = zzon2;
    }

    public final void zza(String string2, int n3, Throwable throwable, byte[] byArray, Map map2) {
        zzju zzju2 = this.zza;
        AtomicReference atomicReference = this.zzb;
        zzon zzon2 = this.zzc;
        zzju.zza(zzju2, atomicReference, zzon2, string2, n3, throwable, byArray, map2);
    }
}

