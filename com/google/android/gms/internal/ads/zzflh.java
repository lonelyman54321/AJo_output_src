/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfky;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzflm;

public final class zzflh
implements Runnable {
    public final /* synthetic */ zzflk zza;
    public final /* synthetic */ zzfky zzb;

    public /* synthetic */ zzflh(zzflk zzflk2, zzfky zzfky2) {
        this.zza = zzflk2;
        this.zzb = zzfky2;
    }

    public final void run() {
        zzflm zzflm2 = zzfll.zzc(this.zza.zza);
        zzfky zzfky2 = this.zzb;
        zzflm2.zzc(zzfky2);
    }
}

