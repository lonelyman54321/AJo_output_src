/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcif;

public final class zzcie
implements Runnable {
    public final /* synthetic */ zzcif zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;

    public /* synthetic */ zzcie(zzcif zzcif2, int n3, int n4, boolean bl2, boolean bl3) {
        this.zza = zzcif2;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = bl2;
        this.zze = bl3;
    }

    public final void run() {
        zzcif zzcif2 = this.zza;
        int n3 = this.zzb;
        int n4 = this.zzc;
        boolean bl2 = this.zzd;
        boolean bl3 = this.zze;
        zzcif2.zzd(n3, n4, bl2, bl3);
    }
}

