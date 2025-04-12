/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbld;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzbkn
implements zzblp {
    public final /* synthetic */ zzdhi zza;
    public final /* synthetic */ zzcqd zzb;

    public /* synthetic */ zzbkn(zzdhi zzdhi2, zzcqd zzcqd2) {
        this.zza = zzdhi2;
        this.zzb = zzcqd2;
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
        object3 = this.zzb;
        Object object4 = zzgfk.zzu(zzblo.zza((zzchd)object, (String)object2));
        zzbkp zzbkp2 = new zzbkp((zzcqd)object3, (String)object2);
        object2 = zzcci.zza;
        object3 = zzgft.zzn((ListenableFuture)object4, zzbkp2, (Executor)object2);
        object4 = new zzbld((zzchd)object);
        zzgft.zzr((ListenableFuture)object3, (zzgfp)object4, (Executor)object2);
    }
}

