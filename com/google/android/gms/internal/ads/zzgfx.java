/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzggd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

final class zzgfx
implements ListenableFuture {
    static final ListenableFuture zza;
    private static final zzggd zzb;
    private final Object zzc;

    static {
        Object object = new zzgfx(null);
        zza = object;
        zzb = object = new zzggd(zzgfx.class);
    }

    public zzgfx(Object object) {
        this.zzc = object;
    }

    public final void addListener(Runnable object, Executor object2) {
        zzfyg.zzc(object, "Runnable was null.");
        String string2 = "Executor was null.";
        zzfyg.zzc(object2, string2);
        try {
            object2.execute((Runnable)object);
            return;
        }
        catch (Exception exception) {
            Logger logger = zzb.zza();
            Level level = Level.SEVERE;
            object = String.valueOf(object);
            object2 = String.valueOf(object2);
            String string3 = UX.c("RuntimeException while executing runnable ", (String)object, " with executor ", (String)object2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", string3, exception);
            return;
        }
    }

    public final boolean cancel(boolean bl2) {
        return false;
    }

    public final Object get() {
        return this.zzc;
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        ((Object)((Object)timeUnit)).getClass();
        return this.zzc;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object object = this.zzc;
        String string2 = super.toString();
        object = String.valueOf(object);
        return y02.a(string2, "[status=SUCCESS, result=[", (String)object, "]]");
    }
}

