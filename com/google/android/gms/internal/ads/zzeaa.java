/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzeac;
import java.util.concurrent.Callable;

public final class zzeaa
implements Callable {
    public final /* synthetic */ zzeac zza;
    public final /* synthetic */ zzbxu zzb;

    public /* synthetic */ zzeaa(zzeac zzeac2, zzbxu zzbxu2) {
        this.zza = zzeac2;
        this.zzb = zzbxu2;
    }

    public final Object call() {
        zzeac zzeac2 = this.zza;
        zzbxu zzbxu2 = this.zzb;
        return zzeac2.zza(zzbxu2);
    }
}

