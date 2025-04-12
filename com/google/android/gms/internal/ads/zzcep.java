/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcew;

public final class zzcep
implements Runnable {
    public final /* synthetic */ zzcew zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcep(zzcew zzcew2, boolean bl2, long l2) {
        this.zza = zzcew2;
        this.zzb = bl2;
        this.zzc = l2;
    }

    public final void run() {
        zzcew zzcew2 = this.zza;
        boolean bl2 = this.zzb;
        long l2 = this.zzc;
        zzcew2.zzJ(bl2, l2);
    }
}

