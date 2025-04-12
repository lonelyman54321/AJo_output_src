/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcys;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzfeb;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfed;
import com.google.android.gms.internal.ads.zzfef;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfjm;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

final class zzfeg {
    private final zzfjc zza;
    private final zzcys zzb;
    private final Executor zzc;
    private zzfef zzd;

    public zzfeg(zzfjc zzfjc2, zzcys zzcys2, Executor executor) {
        this.zza = zzfjc2;
        this.zzb = zzcys2;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ zzfef zza(zzfeg zzfeg2) {
        return zzfeg2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzfjm zzb(zzfeg zzfeg2) {
        return zzfeg2.zze();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzfeg zzfeg2, zzfef zzfef2) {
        zzfeg2.zzd = zzfef2;
    }

    private final zzfjm zze() {
        Object object = this.zzb.zzg();
        zzl zzl2 = ((zzfho)object).zzd;
        String string2 = ((zzfho)object).zzf;
        object = ((zzfho)object).zzj;
        return this.zza.zzc(zzl2, string2, (zzw)object);
    }

    public final ListenableFuture zzc() {
        Object object = this.zzd;
        if (object == null) {
            Executor executor;
            Object object2;
            object = (Boolean)zzbgr.zza.zze();
            boolean bl2 = (Boolean)object;
            if (!bl2) {
                object2 = this.zze();
                executor = null;
                this.zzd = object = new zzfef(null, (zzfjm)object2, null);
                object = zzgft.zzh(object);
            } else {
                object = this.zzb;
                object2 = this.zza;
                object = object.zzb();
                object2 = object2.zza();
                object = zzgfk.zzu(((zzcvx)object).zze((zzfjj)object2));
                object2 = new zzfed(this);
                executor = this.zzc;
                object = zzgft.zzm((ListenableFuture)object, (zzfxu)object2, executor);
                object2 = new zzfec(this);
                executor = this.zzc;
                Class<zzebh> clazz = zzebh.class;
                object = zzgft.zze((ListenableFuture)object, clazz, (zzfxu)object2, executor);
            }
            object2 = new zzfeb();
            executor = this.zzc;
            return zzgft.zzm((ListenableFuture)object, (zzfxu)object2, executor);
        }
        return zzgft.zzh(object);
    }
}

