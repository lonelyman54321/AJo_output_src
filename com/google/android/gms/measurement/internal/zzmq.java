/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpm;

final class zzmq
implements Runnable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zzpm zzc;
    private final /* synthetic */ zzme zzd;

    public zzmq(zzme zzme2, zzp zzp2, boolean bl2, zzpm zzpm2) {
        this.zza = zzp2;
        this.zzb = bl2;
        this.zzc = zzpm2;
        this.zzd = zzme2;
    }

    public final void run() {
        zzpm zzpm2;
        zzfz zzfz2 = zzme.zza(this.zzd);
        if (zzfz2 == null) {
            this.zzd.zzj().zzg().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzme zzme2 = this.zzd;
        boolean bl2 = this.zzb;
        if (bl2) {
            bl2 = false;
            zzpm2 = null;
        } else {
            zzpm2 = this.zzc;
        }
        zzp zzp2 = this.zza;
        zzme2.zza(zzfz2, zzpm2, zzp2);
        zzme.zzg(this.zzd);
    }
}

