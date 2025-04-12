/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzdey;

public final class zzdex
implements Runnable {
    public final /* synthetic */ zzdey zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzdex(zzdey zzdey2, Object object) {
        this.zza = zzdey2;
        this.zzb = object;
    }

    public final void run() {
        zzdey zzdey2 = this.zza;
        Object object = this.zzb;
        try {
            zzdey2.zza(object);
            return;
        }
        catch (Throwable throwable) {
            zzu.zzo().zzv(throwable, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", throwable);
            return;
        }
    }
}

