/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzcpy
implements zzgfa {
    public final /* synthetic */ zzcqd zza;
    public final /* synthetic */ Uri.Builder zzb;

    public /* synthetic */ zzcpy(zzcqd zzcqd2, Uri.Builder builder) {
        this.zza = zzcqd2;
        this.zzb = builder;
    }

    public final ListenableFuture zza(Object object) {
        zzcqd zzcqd2 = this.zza;
        Uri.Builder builder = this.zzb;
        object = (Throwable)object;
        return zzcqd2.zze(builder, (Throwable)object);
    }
}

