/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzach;
import com.google.android.gms.internal.ads.zzix;

public final class zzacd
implements Runnable {
    public final /* synthetic */ zzach zza;
    public final /* synthetic */ zzix zzb;

    public /* synthetic */ zzacd(zzach zzach2, zzix zzix2) {
        this.zza = zzach2;
        this.zzb = zzix2;
    }

    public final void run() {
        zzach zzach2 = this.zza;
        zzix zzix2 = this.zzb;
        zzach2.zzk(zzix2);
    }
}

