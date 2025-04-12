/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfoe;

public final class zzfod
implements Runnable {
    public final /* synthetic */ zzfoe zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzfmn zzc;

    public /* synthetic */ zzfod(zzfoe zzfoe2, String string2, zzfmn zzfmn2) {
        this.zza = zzfoe2;
        this.zzb = string2;
        this.zzc = zzfmn2;
    }

    public final void run() {
        zzfoe zzfoe2 = this.zza;
        String string2 = this.zzb;
        zzfmn zzfmn2 = this.zzc;
        zzfoe2.zzb(string2, zzfmn2);
    }
}

