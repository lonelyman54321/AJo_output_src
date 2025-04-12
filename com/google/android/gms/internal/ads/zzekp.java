/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcus;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzeko;
import com.google.android.gms.internal.ads.zzekq;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzelj;
import com.google.android.gms.internal.ads.zzelm;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhe;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzggm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzekp {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcus zzc;
    private final zzelf zzd;
    private final zzfoa zze;
    private final zzggm zzf;
    private final AtomicBoolean zzg;
    private zzekq zzh;
    private zzfhf zzi;

    public zzekp(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcus zzcus2, zzelf zzelf2, zzfoa zzfoa2) {
        Object object = zzggm.zze();
        this.zzf = object;
        this.zzg = object = new AtomicBoolean();
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcus2;
        this.zzd = zzelf2;
        this.zze = zzfoa2;
    }

    public static /* bridge */ /* synthetic */ zzekq zza(zzekp zzekp2) {
        return zzekp2.zzh;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzekp zzekp2, zzfgt zzfgt2) {
        zzekp2.zze(zzfgt2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final ListenableFuture zzd(zzfgt object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    boolean bl2;
                    Object object2 = ((zzfgt)object).zza;
                    object2 = object2.iterator();
                    while (bl2 = object2.hasNext()) {
                        boolean bl3;
                        Object object3 = object2.next();
                        object3 = (String)object3;
                        Object object4 = this.zzc;
                        int n3 = ((zzfgt)object).zzb;
                        if ((object3 = object4.zza(n3, (String)object3)) == null || !(bl3 = object3.zzb((zzfhf)(object4 = this.zzi), (zzfgt)object))) continue;
                        object2 = this.zzi;
                        object2 = object3.zza((zzfhf)object2, (zzfgt)object);
                        int n4 = ((zzfgt)object).zzS;
                        object3 = this.zzb;
                        long l2 = n4;
                        object = TimeUnit.MILLISECONDS;
                        return zzgft.zzo((ListenableFuture)object2, l2, (TimeUnit)((Object)object), (ScheduledExecutorService)object3);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    int n7 = 3;
                    object = new zzdzd(n7);
                    return zzgft.zzg((Throwable)object);
                }
            }
            throw throwable2;
        }
    }

    private final void zze(zzfgt object) {
        ListenableFuture listenableFuture = this.zzd((zzfgt)object);
        Object object2 = this.zze;
        zzelf zzelf2 = this.zzd;
        zzfhf zzfhf2 = this.zzi;
        zzelf2.zzf(zzfhf2, (zzfgt)object, listenableFuture, (zzfoa)object2);
        object2 = new zzeko(this, (zzfgt)object);
        object = this.zza;
        zzgft.zzr(listenableFuture, (zzgfp)object2, (Executor)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zzb(zzfhf object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                zzekq zzekq2;
                Object object2;
                block5: {
                    try {
                        object2 = this.zzg;
                        boolean bl2 = true;
                        boolean bl3 = ((AtomicBoolean)object2).getAndSet(bl2);
                        if (bl3) return this.zzf;
                        object2 = ((zzfhf)object).zzb;
                        object2 = ((zzfhe)object2).zza;
                        bl3 = object2.isEmpty();
                        if (!bl3) break block5;
                        object2 = this.zzf;
                        object = zzelm.zzc((zzfhf)object);
                        int n3 = 3;
                        zzelj zzelj2 = new zzelj(n3, (String)object);
                        ((zzggm)object2).zzd(zzelj2);
                        return this.zzf;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                this.zzi = object;
                object2 = this.zzd;
                zzggm zzggm2 = this.zzf;
                this.zzh = zzekq2 = new zzekq((zzfhf)object, (zzelf)object2, zzggm2);
                object2 = this.zzd;
                object = ((zzfhf)object).zzb;
                object = ((zzfhe)object).zza;
                ((zzelf)object2).zzk((List)object);
                object = this.zzh;
                object = ((zzekq)object).zza();
                while (object != null) {
                    this.zze((zzfgt)object);
                    object = this.zzh;
                    object = ((zzekq)object).zza();
                }
                return this.zzf;
            }
            throw throwable2;
        }
    }
}

