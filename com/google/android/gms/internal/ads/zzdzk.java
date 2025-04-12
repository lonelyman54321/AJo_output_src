/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxd;
import java.util.concurrent.Callable;

public final class zzdzk
implements Callable {
    public final /* synthetic */ zzaxd zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzdzk(zzaxd zzaxd2, Context context) {
        this.zza = zzaxd2;
        this.zzb = context;
    }

    public final Object call() {
        zzawz zzawz2 = this.zza.zzc();
        Context context = this.zzb;
        return zzawz2.zzg(context);
    }
}

