/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzepe;
import com.google.android.gms.internal.ads.zzfdy;
import java.util.concurrent.atomic.AtomicReference;

public final class zzepf
implements zzdbw {
    private final AtomicReference zza;

    public zzepf() {
        AtomicReference atomicReference;
        this.zza = atomicReference = new AtomicReference();
    }

    public final void zza(zzdg zzdg2) {
        this.zza.set(zzdg2);
    }

    public final void zzh(zzs zzs2) {
        zzepe zzepe2 = new zzepe(zzs2);
        zzfdy.zza(this.zza, zzepe2);
    }
}

