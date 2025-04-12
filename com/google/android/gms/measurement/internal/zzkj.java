/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzki;
import java.util.Objects;

final class zzkj
extends zzbb {
    private final /* synthetic */ zzju zza;

    public zzkj(zzju zzju2, zzjh zzjh2) {
        this.zza = zzju2;
        super(zzjh2);
    }

    public final void zzb() {
        zzju zzju2 = this.zza.zzm();
        Objects.requireNonNull(zzju2);
        zzki zzki2 = new zzki(zzju2);
        Thread thread2 = new Thread(zzki2);
        thread2.start();
    }
}

