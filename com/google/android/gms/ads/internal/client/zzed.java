/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzej;

public final class zzed
implements Runnable {
    public final /* synthetic */ zzej zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzed(zzej zzej2, Context context, String string2) {
        this.zza = zzej2;
        this.zzb = context;
    }

    public final void run() {
        zzej zzej2 = this.zza;
        Context context = this.zzb;
        zzej2.zzo(context, null);
    }
}

