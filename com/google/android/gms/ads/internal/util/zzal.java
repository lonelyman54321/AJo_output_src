/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.internal.ads.zzgge;

public final class zzal
implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzgge zzb;

    public /* synthetic */ zzal(zzau zzau2, zzgge zzgge2) {
        this.zza = zzau2;
        this.zzb = zzgge2;
    }

    public final void run() {
        zzau zzau2 = this.zza;
        zzgge zzgge2 = this.zzb;
        zzau2.zzc(zzgge2);
    }
}

