/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdly;
import com.google.android.gms.internal.ads.zzdnq;
import com.google.android.gms.internal.ads.zzdnr;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzdns
implements zzdaf {
    private final zzdlt zza;
    private final zzdly zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdns(zzdlt zzdlt2, zzdly zzdly2, Executor executor, Executor executor2) {
        this.zza = zzdlt2;
        this.zzb = zzdly2;
        this.zzc = executor;
        this.zzd = executor2;
    }

    public static /* bridge */ /* synthetic */ void zza(zzdns zzdns2, zzchd zzchd2) {
        zzdns2.zzb(zzchd2);
    }

    private final void zzb(zzchd zzchd2) {
        zzdnq zzdnq2 = new zzdnq(zzchd2);
        this.zzc.execute(zzdnq2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzr() {
        Object object = this.zzb;
        boolean bl2 = ((zzdly)object).zzd();
        if (!bl2) return;
        object = this.zza;
        Object object2 = ((zzdlt)object).zzu();
        if (object2 == null && (object = ((zzdlt)object).zzw()) != null) {
            object = zzbep.zzfi;
            zzben zzben2 = zzba.zzc();
            object = (Boolean)zzben2.zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (bl2) {
                object = this.zza;
                object2 = ((zzdlt)object).zzw();
                object = ((zzdlt)object).zzp();
                if (object2 == null) return;
                if (object == null) return;
                ListenableFuture[] listenableFutureArray = new ListenableFuture[]{object2, object};
                object = zzgft.zzl(listenableFutureArray);
                object2 = new zzdnr(this);
                Executor executor = this.zzd;
                zzgft.zzr((ListenableFuture)object, (zzgfp)object2, executor);
                return;
            }
        }
        if (object2 == null) return;
        object = this.zza;
        object2 = ((zzdlt)object).zzr();
        object = ((zzdlt)object).zzs();
        if (object2 == null) {
            if (object == null) return;
            object2 = object;
        }
        if (object2 == null) return;
        this.zzb((zzchd)object2);
    }
}

