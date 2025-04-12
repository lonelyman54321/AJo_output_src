/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzqn;

public final class zzqi
implements Runnable {
    public final /* synthetic */ zzqn zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzqi(zzqn zzqn2, Exception exception) {
        this.zza = zzqn2;
        this.zzb = exception;
    }

    public final void run() {
        zzqn zzqn2 = this.zza;
        Exception exception = this.zzb;
        zzqn2.zzk(exception);
    }
}

