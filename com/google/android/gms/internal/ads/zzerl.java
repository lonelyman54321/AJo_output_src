/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzerk;
import com.google.android.gms.internal.ads.zzerm;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzerl
implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;
    private final VersionInfoParcel zzc;
    private final zzccc zzd;

    public zzerl(zzgge zzgge2, zzfho zzfho2, VersionInfoParcel versionInfoParcel, zzccc zzccc2) {
        this.zza = zzgge2;
        this.zzb = zzfho2;
        this.zzc = versionInfoParcel;
        this.zzd = zzccc2;
    }

    public final int zza() {
        return 9;
    }

    public final ListenableFuture zzb() {
        zzerk zzerk2 = new zzerk(this);
        return this.zza.zzb(zzerk2);
    }

    public final /* synthetic */ zzerm zzc() {
        Object object = this.zzb;
        object = ((zzfho)object).zzj;
        zzccc zzccc2 = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzc;
        boolean bl2 = zzccc2.zzm();
        zzerm zzerm2 = new zzerm((zzw)object, versionInfoParcel, bl2);
        return zzerm2;
    }
}

