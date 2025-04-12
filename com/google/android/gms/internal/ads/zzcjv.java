/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzcjg;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;

public final class zzcjv
implements zzhkp {
    private final zzcjg zza;

    public zzcjv(zzcjg zzcjg2) {
        this.zza = zzcjg2;
    }

    public final VersionInfoParcel zza() {
        VersionInfoParcel versionInfoParcel = this.zza.zze();
        zzhkx.zzb(versionInfoParcel);
        return versionInfoParcel;
    }

    public final /* synthetic */ Object zzb() {
        VersionInfoParcel versionInfoParcel = this.zza.zze();
        zzhkx.zzb(versionInfoParcel);
        return versionInfoParcel;
    }
}

