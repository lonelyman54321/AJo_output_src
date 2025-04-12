/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzzt;

final class zzzr {
    private final Handler zza;
    private final zzzt zzb;
    private boolean zzc;

    public zzzr(Handler handler, zzzt zzzt2) {
        this.zza = handler;
        this.zzb = zzzt2;
    }

    public static /* bridge */ /* synthetic */ Handler zza(zzzr zzzr2) {
        return zzzr2.zza;
    }

    public static /* bridge */ /* synthetic */ zzzt zzb(zzzr zzzr2) {
        return zzzr2.zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzd(zzzr zzzr2) {
        return zzzr2.zzc;
    }

    public final void zzc() {
        this.zzc = true;
    }
}

