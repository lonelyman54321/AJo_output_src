/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcee;
import java.util.Map;

public final class zzcgm
implements Runnable {
    public final /* synthetic */ zzcee zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcgm(zzcee zzcee2, Map map2) {
        this.zza = zzcee2;
        this.zzb = map2;
    }

    public final void run() {
        zzcee zzcee2 = this.zza;
        Map map2 = this.zzb;
        zzcee2.zzd("onGcacheInfoEvent", map2);
    }
}

