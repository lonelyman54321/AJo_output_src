/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzfhy;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzfhw
implements zzblp {
    public final /* synthetic */ zzdhi zza;
    public final /* synthetic */ zzcqd zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ zzefz zzd;

    public /* synthetic */ zzfhw(zzdhi zzdhi2, zzcqd zzcqd2, zzfoe zzfoe2, zzefz zzefz2) {
        this.zza = zzdhi2;
        this.zzb = zzcqd2;
        this.zzc = zzfoe2;
        this.zzd = zzefz2;
    }

    public final void zza(Object object, Map object2) {
        Object object3 = this.zza;
        object = (zzchd)object;
        zzblo.zzc((Map)object2, (zzdhi)object3);
        object3 = "u";
        object2 = (String)object2.get(object3);
        if (object2 == null) {
            zzm.zzj("URL missing from click GMSG.");
            return;
        }
        object3 = this.zzd;
        zzfoe zzfoe2 = this.zzc;
        zzcqd zzcqd2 = this.zzb;
        object2 = zzblo.zza((zzchd)object, (String)object2);
        zzfhy zzfhy2 = new zzfhy((zzchd)object, zzcqd2, zzfoe2, (zzefz)((Object)object3));
        object = zzcci.zza;
        zzgft.zzr((ListenableFuture)object2, zzfhy2, (Executor)object);
    }
}

