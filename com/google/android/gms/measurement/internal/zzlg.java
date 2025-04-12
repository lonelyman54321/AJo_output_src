/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzme;

final class zzlg
implements Runnable {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ zzju zzb;

    public zzlg(zzju zzju2, zzbd zzbd2) {
        this.zza = zzbd2;
        this.zzb = zzju2;
    }

    public final void run() {
        Object object;
        Object object2 = this.zzb.zzk();
        boolean bl2 = ((zzha)object2).zza((zzbd)(object = this.zza));
        if (bl2) {
            object2 = this.zzb.zzj().zzq();
            object = "Setting DMA consent(FE)";
            zzbd zzbd2 = this.zza;
            ((zzgq)object2).zza((String)object, zzbd2);
            object2 = this.zzb.zzq();
            bl2 = ((zzme)object2).zzao();
            if (bl2) {
                this.zzb.zzq().zzaj();
                return;
            }
            this.zzb.zzq().zza(false);
            return;
        }
        object2 = this.zzb.zzj().zzp();
        object = this.zza.zza();
        ((zzgq)object2).zza("Lower precedence consent source ignored, proposed source", object);
    }
}

