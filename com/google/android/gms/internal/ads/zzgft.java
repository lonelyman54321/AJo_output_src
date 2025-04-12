/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyv;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzged;
import com.google.android.gms.internal.ads.zzgee;
import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzgeo;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfb;
import com.google.android.gms.internal.ads.zzgfi;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgfq;
import com.google.android.gms.internal.ads.zzgfs;
import com.google.android.gms.internal.ads.zzgfv;
import com.google.android.gms.internal.ads.zzgfw;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzggk;
import com.google.android.gms.internal.ads.zzggq;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzggu;
import com.google.android.gms.internal.ads.zzggv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzgft
extends zzgfv {
    public static zzgfs zza(Iterable iterable) {
        iterable = zzgbc.zzk((Collection)iterable);
        zzgfs zzgfs2 = new zzgfs(false, (zzgbc)iterable, null);
        return zzgfs2;
    }

    public static zzgfs zzb(Iterable iterable) {
        iterable.getClass();
        iterable = zzgbc.zzk((Collection)iterable);
        zzgfs zzgfs2 = new zzgfs(true, (zzgbc)iterable, null);
        return zzgfs2;
    }

    public static zzgfs zzc(ListenableFuture ... object) {
        object = zzgbc.zzl(object);
        zzgfs zzgfs2 = new zzgfs(true, (zzgbc)object, null);
        return zzgfs2;
    }

    public static ListenableFuture zzd(Iterable iterable) {
        iterable = zzgbc.zzk((Collection)iterable);
        zzgfb zzgfb2 = new zzgfb((zzgax)iterable, true);
        return zzgfb2;
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, Class object, zzfxu zzfxu2, Executor executor) {
        zzgee zzgee2 = new zzgee(listenableFuture, (Class)object, zzfxu2);
        object = zzggk.zzc(executor, zzgee2);
        listenableFuture.addListener(zzgee2, (Executor)object);
        return zzgee2;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, Class object, zzgfa zzgfa2, Executor executor) {
        zzged zzged2 = new zzged(listenableFuture, (Class)object, zzgfa2);
        object = zzggk.zzc(executor, zzged2);
        listenableFuture.addListener(zzged2, (Executor)object);
        return zzged2;
    }

    public static ListenableFuture zzg(Throwable throwable) {
        throwable.getClass();
        zzgfw zzgfw2 = new zzgfw(throwable);
        return zzgfw2;
    }

    public static ListenableFuture zzh(Object object) {
        if (object == null) {
            return zzgfx.zza;
        }
        zzgfx zzgfx2 = new zzgfx(object);
        return zzgfx2;
    }

    public static ListenableFuture zzi() {
        return zzgfx.zza;
    }

    public static ListenableFuture zzj(Callable callable, Executor executor) {
        zzggt zzggt2 = new zzggt(callable);
        executor.execute(zzggt2);
        return zzggt2;
    }

    public static ListenableFuture zzk(zzgez zzgez2, Executor executor) {
        zzggt zzggt2 = new zzggt(zzgez2);
        executor.execute(zzggt2);
        return zzggt2;
    }

    public static ListenableFuture zzl(ListenableFuture ... object) {
        object = zzgbc.zzl(object);
        zzgfb zzgfb2 = new zzgfb((zzgax)object, false);
        return zzgfb2;
    }

    public static ListenableFuture zzm(ListenableFuture listenableFuture, zzfxu object, Executor executor) {
        zzgeo zzgeo2 = new zzgeo(listenableFuture, (zzfxu)object);
        object = zzggk.zzc(executor, zzgeo2);
        listenableFuture.addListener(zzgeo2, (Executor)object);
        return zzgeo2;
    }

    public static ListenableFuture zzn(ListenableFuture listenableFuture, zzgfa object, Executor executor) {
        executor.getClass();
        zzgen zzgen2 = new zzgen(listenableFuture, (zzgfa)object);
        object = zzggk.zzc(executor, zzgen2);
        listenableFuture.addListener(zzgen2, (Executor)object);
        return zzgen2;
    }

    public static ListenableFuture zzo(ListenableFuture listenableFuture, long l2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        boolean bl2 = listenableFuture.isDone();
        if (bl2) {
            return listenableFuture;
        }
        return zzggq.zzf(listenableFuture, l2, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future object) {
        boolean bl2 = object.isDone();
        if (bl2) {
            return zzggv.zza((Future)object);
        }
        Object[] objectArray = new Object[]{object};
        object = zzfyv.zzb("Future was expected to be done: %s", objectArray);
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public static Object zzq(Future object) {
        try {
            return zzggv.zza((Future)object);
        }
        catch (ExecutionException executionException) {
            object = executionException.getCause();
            boolean bl2 = object instanceof Error;
            if (bl2) {
                object = (Error)object;
                zzgfi zzgfi2 = new zzgfi((Error)object);
                throw zzgfi2;
            }
            zzggu zzggu2 = new zzggu((Throwable)object);
            throw zzggu2;
        }
    }

    public static void zzr(ListenableFuture listenableFuture, zzgfp zzgfp2, Executor executor) {
        zzgfp2.getClass();
        zzgfq zzgfq2 = new zzgfq(listenableFuture, zzgfp2);
        listenableFuture.addListener(zzgfq2, executor);
    }
}

