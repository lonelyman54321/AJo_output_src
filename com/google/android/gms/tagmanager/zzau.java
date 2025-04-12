/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.zzaz;
import java.util.List;

final class zzau
implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaz zzc;

    public zzau(zzaz zzaz2, List list, long l2) {
        this.zza = list;
        this.zzb = l2;
        this.zzc = zzaz2;
    }

    public final void run() {
        zzaz zzaz2 = this.zzc;
        List list = this.zza;
        long l2 = this.zzb;
        zzaz.zzh(zzaz2, list, l2);
    }
}

