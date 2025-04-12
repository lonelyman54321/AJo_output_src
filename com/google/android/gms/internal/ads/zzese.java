/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzesc;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzese
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzese(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzesc zza() {
        VersionInfoParcel versionInfoParcel = ((zzcjv)this.zza).zza();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzesc zzesc2 = new zzesc(versionInfoParcel, zzgge2);
        return zzesc2;
    }
}

