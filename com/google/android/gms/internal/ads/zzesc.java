/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzesb;
import com.google.android.gms.internal.ads.zzesd;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzesc
implements zzexw {
    private final zzgge zza;
    private final VersionInfoParcel zzb;

    public zzesc(VersionInfoParcel versionInfoParcel, zzgge zzgge2) {
        this.zzb = versionInfoParcel;
        this.zza = zzgge2;
    }

    public final int zza() {
        return 54;
    }

    public final ListenableFuture zzb() {
        zzesb zzesb2 = new zzesb(this);
        return this.zza.zzb(zzesb2);
    }

    public final /* synthetic */ zzesd zzc() {
        return zzesd.zzb(this.zzb);
    }
}

