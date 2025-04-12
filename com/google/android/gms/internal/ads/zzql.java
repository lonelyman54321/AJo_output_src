/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzqn;

public final class zzql
implements Runnable {
    public final /* synthetic */ zzqn zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzql(zzqn zzqn2, String string2, long l2, long l3) {
        this.zza = zzqn2;
        this.zzb = string2;
        this.zzc = l2;
        this.zzd = l3;
    }

    public final void run() {
        zzqn zzqn2 = this.zza;
        String string2 = this.zzb;
        long l2 = this.zzc;
        long l3 = this.zzd;
        zzqn2.zzn(string2, l2, l3);
    }
}

