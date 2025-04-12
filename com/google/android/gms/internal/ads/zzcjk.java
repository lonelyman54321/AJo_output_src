/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcjg;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import java.lang.ref.WeakReference;

public final class zzcjk
implements zzhkp {
    private final zzcjg zza;

    public zzcjk(zzcjg zzcjg2) {
        this.zza = zzcjg2;
    }

    public final WeakReference zza() {
        WeakReference weakReference = this.zza.zzg();
        zzhkx.zzb(weakReference);
        return weakReference;
    }

    public final /* synthetic */ Object zzb() {
        WeakReference weakReference = this.zza.zzg();
        zzhkx.zzb(weakReference);
        return weakReference;
    }
}

