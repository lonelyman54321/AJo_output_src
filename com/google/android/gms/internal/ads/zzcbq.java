/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzcbr;

final class zzcbq {
    final /* synthetic */ zzcbr zza;
    private long zzb;
    private long zzc;

    public zzcbq(zzcbr zzcbr2) {
        long l2;
        this.zza = zzcbr2;
        this.zzb = l2 = (long)-1;
        this.zzc = l2;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        long l2 = this.zzb;
        bundle.putLong("topen", l2);
        l2 = this.zzc;
        bundle.putLong("tclose", l2);
        return bundle;
    }

    public final void zzc() {
        long l2;
        this.zzc = l2 = zzcbr.zzb(this.zza).elapsedRealtime();
    }

    public final void zzd() {
        long l2;
        this.zzb = l2 = zzcbr.zzb(this.zza).elapsedRealtime();
    }
}

