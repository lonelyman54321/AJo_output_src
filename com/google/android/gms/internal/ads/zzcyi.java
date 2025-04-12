/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzcyg;
import com.google.android.gms.internal.ads.zzcyh;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdad;
import com.google.android.gms.internal.ads.zzded;
import com.google.android.gms.internal.ads.zzdgn;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzgeh;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzggm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcyi
implements zzczl,
zzdgn,
zzded,
zzdab,
zzban {
    private final zzdad zza;
    private final zzfgt zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzggm zze;
    private ScheduledFuture zzf;
    private final AtomicBoolean zzg;
    private final String zzh;

    public zzcyi(zzdad zzdad2, zzfgt zzfgt2, ScheduledExecutorService scheduledExecutorService, Executor executor, String string2) {
        Object object = zzggm.zze();
        this.zze = object;
        this.zzg = object = new AtomicBoolean();
        this.zza = zzdad2;
        this.zzb = zzfgt2;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = string2;
    }

    public static /* bridge */ /* synthetic */ zzdad zzg(zzcyi zzcyi2) {
        return zzcyi2.zza;
    }

    private final boolean zzm() {
        String string2 = this.zzh;
        String string3 = "com.google.ads.mediation.admob.AdMobAdapter";
        boolean bl2 = string2.equals(string3);
        return bl2;
    }

    public final void zza() {
    }

    public final void zzb() {
    }

    public final void zzc() {
        block3: {
            block2: {
                int n3;
                Object object = this.zzb;
                int n4 = ((zzfgt)object).zzf;
                int n7 = 3;
                if (n4 == n7 || (n3 = ((zzfgt)object).zzZ) != 0 && n3 != (n4 = 1)) break block2;
                object = zzbep.zzlw;
                zzben zzben2 = zzba.zzc();
                object = (Boolean)zzben2.zza((zzbeg)object);
                n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                if (n3 == 0 || (n3 = (int)(this.zzm() ? 1 : 0)) == 0) break block3;
            }
            return;
        }
        this.zza.zza();
    }

    public final void zzdp(zzbam object) {
        boolean bl2;
        boolean bl3;
        Object object2 = zzbep.zzlw;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean n4 = (Boolean)object2;
        if (n4 && (bl3 = this.zzm()) && (bl2 = ((zzbam)object).zzj)) {
            object = this.zzg;
            boolean bl4 = false;
            object2 = null;
            boolean bl5 = true;
            boolean bl6 = ((AtomicBoolean)object).compareAndSet(false, bl5);
            if (bl6) {
                object = this.zzb;
                int n3 = ((zzfgt)object).zzf;
                int n7 = 3;
                if (n3 != n7) {
                    com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
                    object = this.zza;
                    ((zzdad)object).zza();
                }
            }
        }
    }

    public final void zzds(zzbyh zzbyh2, String string2, String string3) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzh() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                zzggm zzggm2;
                try {
                    zzggm2 = this.zze;
                    boolean bl2 = zzggm2.isDone();
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zzggm2 = this.zze;
                Boolean bl3 = Boolean.TRUE;
                zzggm2.zzc(bl3);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzi() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Future future;
                block5: {
                    try {
                        future = this.zze;
                        boolean bl2 = ((zzgeh)future).isDone();
                        if (!bl2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                future = this.zzf;
                if (future != null) {
                    boolean bl3 = true;
                    future.cancel(bl3);
                }
                future = this.zze;
                Boolean bl4 = Boolean.TRUE;
                ((zzggm)future).zzc(bl4);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzk() {
        Comparable<Delayed> comparable = this.zzb;
        int n3 = ((zzfgt)((Object)comparable)).zzf;
        int n4 = 3;
        if (n3 != n4) {
            comparable = zzbep.zzbx;
            Object object = zzba.zzc();
            comparable = (Boolean)((zzben)object).zza((zzbeg)((Object)comparable));
            n3 = (int)(((Boolean)comparable).booleanValue() ? 1 : 0);
            if (n3 != 0) {
                comparable = this.zzb;
                n4 = ((zzfgt)((Object)comparable)).zzZ;
                int n7 = 2;
                if (n4 == n7) {
                    n3 = ((zzfgt)((Object)comparable)).zzr;
                    if (n3 == 0) {
                        this.zza.zza();
                        return;
                    }
                    comparable = this.zze;
                    object = new zzcyh(this);
                    Object object2 = this.zzd;
                    zzgft.zzr((ListenableFuture)((Object)comparable), (zzgfp)object, (Executor)object2);
                    comparable = this.zzc;
                    object = new zzcyg(this);
                    object2 = this.zzb;
                    n7 = ((zzfgt)object2).zzr;
                    long l2 = n7;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    this.zzf = comparable = comparable.schedule((Runnable)object, l2, timeUnit);
                }
            }
        }
    }

    public final void zzl() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzq(com.google.android.gms.ads.internal.client.zze object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        object = this.zze;
                        boolean bl2 = ((zzgeh)object).isDone();
                        if (!bl2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                object = this.zzf;
                if (object != null) {
                    boolean bl3 = true;
                    object.cancel(bl3);
                }
                object = this.zze;
                Exception exception = new Exception();
                ((zzggm)object).zzd(exception);
                return;
            }
            throw throwable2;
        }
    }
}

