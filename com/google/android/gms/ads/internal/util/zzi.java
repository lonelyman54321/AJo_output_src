/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzj;

public final class zzi
implements Runnable {
    public final /* synthetic */ zzj zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzi(zzj zzj2, Context context, String string2) {
        this.zza = zzj2;
        this.zzb = context;
        this.zzc = "admob";
    }

    public final void run() {
        zzj zzj2 = this.zza;
        Context context = this.zzb;
        String string2 = this.zzc;
        zzj2.zzU(context, string2);
    }
}

