/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcif;
import java.util.Map;

public final class zzcid
implements Runnable {
    public final /* synthetic */ zzcif zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcid(zzcif zzcif2, Map map2) {
        this.zza = zzcif2;
        this.zzb = map2;
    }

    public final void run() {
        zzcif zzcif2 = this.zza;
        Map map2 = this.zzb;
        zzcif2.zzr(map2);
    }
}

