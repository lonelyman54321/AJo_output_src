/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzfky;
import com.google.android.gms.internal.ads.zzflf;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzflh;
import com.google.android.gms.internal.ads.zzfli;
import com.google.android.gms.internal.ads.zzflj;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzflk {
    final /* synthetic */ zzfll zza;
    private final Object zzb;
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzflk(zzfll zzfll2, Object object, String string2, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        this.zza = zzfll2;
        this.zzb = object;
        this.zzc = string2;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    public /* synthetic */ zzflk(zzfll zzfll2, Object object, String string2, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2, zzflj zzflj2) {
        this(zzfll2, object, null, listenableFuture, list, listenableFuture2);
    }

    public final zzfky zza() {
        Object object = this.zzb;
        Object object2 = this.zzc;
        if (object2 == null) {
            object2 = this.zza.zzf(object);
        }
        Object object3 = this.zzf;
        zzfky zzfky2 = new zzfky(object, (String)object2, (ListenableFuture)object3);
        zzfll.zzc(this.zza).zza(zzfky2);
        object = this.zzd;
        object2 = new zzflh(this, zzfky2);
        object3 = zzcci.zzf;
        object.addListener((Runnable)object2, (Executor)object3);
        object = new zzfli(this, zzfky2);
        zzgft.zzr(zzfky2, (zzgfp)object, (Executor)object3);
        return zzfky2;
    }

    public final zzflk zzb(Object object) {
        zzfll zzfll2 = this.zza;
        zzfky zzfky2 = this.zza();
        return zzfll2.zzb(object, zzfky2);
    }

    public final zzflk zzc(Class clazz, zzgfa zzgfa2) {
        Object object = this.zza;
        object = zzfll.zze((zzfll)object);
        ListenableFuture listenableFuture = zzgft.zzf(this.zzf, clazz, zzgfa2, (Executor)object);
        zzfll zzfll2 = this.zza;
        Object object2 = this.zzb;
        String string2 = this.zzc;
        ListenableFuture listenableFuture2 = this.zzd;
        List list = this.zze;
        zzflk zzflk2 = new zzflk(zzfll2, object2, string2, listenableFuture2, list, listenableFuture);
        return zzflk2;
    }

    public final zzflk zzd(ListenableFuture object) {
        zzflg zzflg2 = new zzflg((ListenableFuture)object);
        object = zzcci.zzf;
        return this.zzg(zzflg2, (Executor)object);
    }

    public final zzflk zze(zzfkw zzfkw2) {
        zzflf zzflf2 = new zzflf(zzfkw2);
        return this.zzf(zzflf2);
    }

    public final zzflk zzf(zzgfa zzgfa2) {
        zzgge zzgge2 = zzfll.zze(this.zza);
        return this.zzg(zzgfa2, zzgge2);
    }

    public final zzflk zzg(zzgfa zzgfa2, Executor executor) {
        zzflk zzflk2;
        Object object = this.zzf;
        zzfll zzfll2 = this.zza;
        Object object2 = this.zzb;
        String string2 = this.zzc;
        ListenableFuture listenableFuture = this.zzd;
        List list = this.zze;
        ListenableFuture listenableFuture2 = zzgft.zzn((ListenableFuture)object, zzgfa2, executor);
        object = zzflk2;
        zzflk2 = new zzflk(zzfll2, object2, string2, listenableFuture, list, listenableFuture2);
        return zzflk2;
    }

    public final zzflk zzh(String string2) {
        ListenableFuture listenableFuture = this.zzd;
        List list = this.zze;
        ListenableFuture listenableFuture2 = this.zzf;
        zzfll zzfll2 = this.zza;
        Object object = this.zzb;
        zzflk zzflk2 = new zzflk(zzfll2, object, string2, listenableFuture, list, listenableFuture2);
        return zzflk2;
    }

    public final zzflk zzi(long l2, TimeUnit timeUnit) {
        Object object = this.zza;
        object = zzfll.zzg((zzfll)object);
        ListenableFuture listenableFuture = zzgft.zzo(this.zzf, l2, timeUnit, (ScheduledExecutorService)object);
        zzfll zzfll2 = this.zza;
        Object object2 = this.zzb;
        String string2 = this.zzc;
        ListenableFuture listenableFuture2 = this.zzd;
        List list = this.zze;
        zzflk zzflk2 = new zzflk(zzfll2, object2, string2, listenableFuture2, list, listenableFuture);
        return zzflk2;
    }
}

