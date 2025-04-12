/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfj;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzggl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

abstract class zzgep
extends zzgfj
implements Runnable {
    public static final /* synthetic */ int zzc;
    ListenableFuture zza;
    Object zzb;

    public zzgep(ListenableFuture listenableFuture, Object object) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = this.zza;
        Object object2 = this.zzb;
        boolean bl2 = this.isCancelled();
        boolean bl3 = true;
        boolean bl4 = object == null;
        bl2 |= bl4;
        if (object2 != null) {
            bl3 = false;
        }
        if (bl2 |= bl3) {
            return;
        }
        bl2 = false;
        this.zza = null;
        bl3 = object.isCancelled();
        if (bl3) {
            this.zzs((ListenableFuture)object);
            return;
        }
        try {
            object = zzgft.zzp((Future)object);
        }
        catch (Error error) {
            this.zzd(error);
            return;
        }
        catch (Exception exception) {
            this.zzd(exception);
            return;
        }
        catch (ExecutionException executionException) {
            object = executionException.getCause();
            this.zzd((Throwable)object);
            return;
        }
        catch (CancellationException cancellationException) {
            this.cancel(false);
            return;
        }
        try {
            object = this.zze(object2, object);
            this.zzb = null;
            this.zzf(object);
            return;
        }
        catch (Throwable throwable) {
            try {
                zzggl.zza(throwable);
                this.zzd(throwable);
                return;
            }
            finally {
                this.zzb = null;
            }
        }
    }

    public final String zza() {
        Object object = this.zza;
        Object object2 = this.zzb;
        String string2 = super.zza();
        if (object != null) {
            object = object.toString();
            String string3 = "inputFuture=[";
            String string4 = "], ";
            object = cP.a(string3, (String)object, string4);
        } else {
            object = "";
        }
        if (object2 != null) {
            object2 = object2.toString();
            return y02.a((String)object, "function=[", (String)object2, "]");
        }
        if (string2 != null) {
            return ((String)object).concat(string2);
        }
        return null;
    }

    public final void zzb() {
        ListenableFuture listenableFuture = this.zza;
        this.zzr(listenableFuture);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object var1, Object var2);

    public abstract void zzf(Object var1);
}

