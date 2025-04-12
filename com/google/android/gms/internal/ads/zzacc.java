/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzach;

public final class zzacc
implements Runnable {
    public final /* synthetic */ zzach zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzacc(zzach zzach2, Exception exception) {
        this.zza = zzach2;
        this.zzb = exception;
    }

    public final void run() {
        zzach zzach2 = this.zza;
        Exception exception = this.zzb;
        zzach2.zzo(exception);
    }
}

