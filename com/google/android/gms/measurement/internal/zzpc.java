/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpd;
import com.google.android.gms.measurement.internal.zzpn;

final class zzpc
implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzpd zzd;

    public zzpc(zzpd zzpd2, String string2, String string3, Bundle bundle) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = bundle;
        this.zzd = zzpd2;
    }

    public final void run() {
        zzjh zzjh2 = this.zzd.zza.zzq();
        String string2 = this.zza;
        String string3 = this.zzb;
        Bundle bundle = this.zzc;
        long l2 = this.zzd.zza.zzb().currentTimeMillis();
        zzbl zzbl2 = ((zzpn)zzjh2).zza(string2, string3, bundle, "auto", l2, false, true);
        zzjh2 = this.zzd.zza;
        zzbl2 = (zzbl)Preconditions.checkNotNull(zzbl2);
        string2 = this.zza;
        ((zzou)zzjh2).zza(zzbl2, string2);
    }
}

