/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzexv;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzewf
implements zzexw,
zzexv {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;
    private final zzdux zzd;

    public zzewf(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context, zzdux zzdux2) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
        this.zzd = zzdux2;
    }

    public final int zza() {
        return 29;
    }

    public final ListenableFuture zzb() {
        return zzgft.zzh(this);
    }
}

