/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfoe;

public final class zzcqb
implements Runnable {
    public final /* synthetic */ zzfoe zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcqb(zzfoe zzfoe2, String string2) {
        this.zza = zzfoe2;
        this.zzb = string2;
    }

    public final void run() {
        zzfoe zzfoe2 = this.zza;
        String string2 = this.zzb;
        zzfoe2.zzc(string2, null);
    }
}

