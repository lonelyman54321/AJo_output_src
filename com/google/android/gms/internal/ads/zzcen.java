/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcew;

public final class zzcen
implements Runnable {
    public final /* synthetic */ zzcew zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcen(zzcew zzcew2, int n3, int n4) {
        this.zza = zzcew2;
        this.zzb = n3;
        this.zzc = n4;
    }

    public final void run() {
        zzcew zzcew2 = this.zza;
        int n3 = this.zzb;
        int n4 = this.zzc;
        zzcew2.zzO(n3, n4);
    }
}

