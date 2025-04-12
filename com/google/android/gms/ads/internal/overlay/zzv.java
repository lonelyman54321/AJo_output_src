/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.ads.internal.overlay.zzx;
import java.util.Map;

public final class zzv
implements Runnable {
    public final /* synthetic */ zzx zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Map zzc;

    public /* synthetic */ zzv(zzx zzx2, String string2, Map map2) {
        this.zza = zzx2;
        this.zzb = string2;
        this.zzc = map2;
    }

    public final void run() {
        zzx zzx2 = this.zza;
        String string2 = this.zzb;
        Map map2 = this.zzc;
        zzx2.zzh(string2, map2);
    }
}

