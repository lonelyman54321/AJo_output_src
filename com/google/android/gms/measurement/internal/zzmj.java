/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;

public final class zzmj
implements Runnable {
    private /* synthetic */ zzme zza;
    private /* synthetic */ zzp zzb;
    private /* synthetic */ zzae zzc;

    public /* synthetic */ zzmj(zzme zzme2, zzp zzp2, zzae zzae2) {
        this.zza = zzme2;
        this.zzb = zzp2;
        this.zzc = zzae2;
    }

    public final void run() {
        zzme zzme2 = this.zza;
        zzp zzp2 = this.zzb;
        zzae zzae2 = this.zzc;
        zzme.zza(zzme2, zzp2, zzae2);
    }
}

