/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfs;
import com.google.android.gms.internal.ads.zzzw;
import com.google.android.gms.internal.ads.zzzy;

public final class zzfo
implements Runnable {
    public final /* synthetic */ zzfs zza;
    public final /* synthetic */ zzzw zzb;

    public /* synthetic */ zzfo(zzfs zzfs2, zzzw zzzw2) {
        this.zza = zzfs2;
        this.zzb = zzzw2;
    }

    public final void run() {
        zzfs zzfs2 = this.zza;
        zzzy zzzy2 = this.zzb.zza;
        int n3 = zzfs2.zza();
        zzzy.zzh(zzzy2, n3);
    }
}

