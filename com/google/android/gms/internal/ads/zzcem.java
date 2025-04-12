/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcew;

public final class zzcem
implements Runnable {
    public final /* synthetic */ zzcew zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzcem(zzcew zzcew2, int n3) {
        this.zza = zzcew2;
        this.zzb = n3;
    }

    public final void run() {
        zzcew zzcew2 = this.zza;
        int n3 = this.zzb;
        zzcew2.zzQ(n3);
    }
}

