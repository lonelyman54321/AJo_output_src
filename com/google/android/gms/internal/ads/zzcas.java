/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcau;
import java.util.concurrent.Callable;

public final class zzcas
implements Callable {
    public final /* synthetic */ zzcau zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzcas(zzcau zzcau2, Context context) {
        this.zza = zzcau2;
        this.zzb = context;
    }

    public final Object call() {
        zzcau zzcau2 = this.zza;
        Context context = this.zzb;
        return zzcau2.zze(context);
    }
}

