/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzach;

public final class zzaca
implements Runnable {
    public final /* synthetic */ zzach zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzaca(zzach zzach2, Object object, long l2) {
        this.zza = zzach2;
        this.zzb = object;
        this.zzc = l2;
    }

    public final void run() {
        zzach zzach2 = this.zza;
        Object object = this.zzb;
        long l2 = this.zzc;
        zzach2.zzm(object, l2);
    }
}

