/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzlr;
import java.util.Map;

public final class zzlq
implements Runnable {
    private /* synthetic */ zzlr zza;
    private /* synthetic */ int zzb;
    private /* synthetic */ Exception zzc;
    private /* synthetic */ byte[] zzd;
    private /* synthetic */ Map zze;

    public /* synthetic */ zzlq(zzlr zzlr2, int n3, Exception exception, byte[] byArray, Map map2) {
        this.zza = zzlr2;
        this.zzb = n3;
        this.zzc = exception;
        this.zzd = byArray;
        this.zze = map2;
    }

    public final void run() {
        zzlr zzlr2 = this.zza;
        int n3 = this.zzb;
        Exception exception = this.zzc;
        byte[] byArray = this.zzd;
        Map map2 = this.zze;
        zzlr.zza(zzlr2, n3, exception, byArray, map2);
    }
}

