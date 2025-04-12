/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzach;

public final class zzabx
implements Runnable {
    public final /* synthetic */ zzach zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzabx(zzach zzach2, String string2, long l2, long l3) {
        this.zza = zzach2;
        this.zzb = string2;
        this.zzc = l2;
        this.zzd = l3;
    }

    public final void run() {
        zzach zzach2 = this.zza;
        String string2 = this.zzb;
        long l2 = this.zzc;
        long l3 = this.zzd;
        zzach2.zzg(string2, l2, l3);
    }
}

