/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzpn;
import com.google.android.gms.measurement.internal.zzt;
import java.util.Objects;

public final class zzs
implements Runnable {
    private /* synthetic */ zzic zza;

    public /* synthetic */ zzs(zzic zzic2) {
        this.zza = zzic2;
    }

    public final void run() {
        zzjh zzjh2 = this.zza;
        Object object = zzjh2.zzv();
        boolean bl2 = ((zzpn)object).zzx();
        if (!bl2) {
            zzjh2.zzj().zzr().zza("registerTrigger called but app not eligible");
            return;
        }
        zzjh2.zzp().zzaq();
        zzjh2 = zzjh2.zzp();
        Objects.requireNonNull(zzjh2);
        zzt zzt2 = new zzt((zzju)zzjh2);
        object = new Thread(zzt2);
        ((Thread)object).start();
    }
}

