/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 */
package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzeyw;
import com.google.android.gms.internal.ads.zzeyx;
import com.google.android.gms.internal.ads.zzeyz;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzeyy
implements zzexw {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcbp zzd;

    public zzeyy(zzcbp zzcbp2, Executor executor, String string2, PackageInfo packageInfo, int n3) {
        this.zzd = zzcbp2;
        this.zza = executor;
        this.zzb = string2;
        this.zzc = packageInfo;
    }

    public final int zza() {
        return 41;
    }

    public final ListenableFuture zzb() {
        ListenableFuture listenableFuture = zzgft.zzh(this.zzb);
        Object object = new zzeyw();
        Executor executor = this.zza;
        listenableFuture = zzgft.zzm(listenableFuture, (zzfxu)object, executor);
        object = new zzeyx(this);
        executor = this.zza;
        return zzgft.zzf(listenableFuture, Throwable.class, (zzgfa)object, executor);
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable object) {
        String string2 = this.zzb;
        object = new zzeyz(string2);
        return zzgft.zzh(object);
    }
}

