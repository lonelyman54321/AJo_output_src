/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgeq;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzgey;
import com.google.android.gms.internal.ads.zzgfh;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzggd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.AbstractCollection;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzges
extends zzgey {
    private static final zzggd zza;
    private zzgax zzb;
    private final boolean zzc;
    private final boolean zzf;

    static {
        zzggd zzggd2;
        zza = zzggd2 = new zzggd(zzges.class);
    }

    public zzges(zzgax zzgax2, boolean bl2, boolean bl3) {
        int n3 = zzgax2.size();
        super(n3);
        this.zzb = zzgax2;
        this.zzc = bl2;
        this.zzf = bl3;
    }

    /*
     * Unable to fully structure code
     */
    private final void zzG(int var1_1, Future var2_2) {
        try {
            var2_2 = zzgft.zzp((Future)var2_2);
            this.zzf(var1_1, var2_2);
            return;
        }
        catch (ExecutionException var3_4) {}
        ** finally { 
lbl7:
        // 1 sources

        this.zzI(var3_3);
    }

    private final void zzH(zzgax object) {
        int n3 = this.zzA();
        int n4 = 0;
        boolean bl2 = n3 >= 0;
        String string2 = "Less than 0 remaining futures";
        zzfyg.zzk(bl2, string2);
        if (n3 == 0) {
            if (object != null) {
                object = ((zzgax)object).zze();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    Future future = (Future)object.next();
                    bl2 = future.isCancelled();
                    if (!bl2) {
                        this.zzG(n4, future);
                    }
                    ++n4;
                }
            }
            this.zzF();
            this.zzu();
            int n7 = 2;
            this.zzy(n7);
        }
    }

    private final void zzI(Throwable throwable) {
        Set set;
        throwable.getClass();
        boolean bl2 = this.zzc;
        if (bl2 && !(bl2 = this.zzd(throwable)) && (bl2 = zzges.zzK(set = this.zzC(), throwable))) {
            zzges.zzJ(throwable);
            return;
        }
        bl2 = throwable instanceof Error;
        if (bl2) {
            zzges.zzJ(throwable);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void zzJ(Throwable throwable) {
        boolean bl2 = true;
        boolean bl3 = throwable instanceof Error;
        String string2 = bl2 != bl3 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error";
        String string3 = string2;
        Logger logger = zza.zza();
        Level level = Level.SEVERE;
        logger.logp(level, "com.google.common.util.concurrent.AggregateFuture", "log", string3, throwable);
    }

    private static boolean zzK(Set set, Throwable throwable) {
        while (throwable != null) {
            boolean bl2 = set.add(throwable);
            if (!bl2) {
                return false;
            }
            throwable = throwable.getCause();
        }
        return true;
    }

    public final String zza() {
        Object object = this.zzb;
        if (object != null) {
            object = object.toString();
            return "futures=".concat((String)object);
        }
        return super.zza();
    }

    public final void zzb() {
        Object object = this.zzb;
        boolean bl2 = true;
        this.zzy((int)(bl2 ? 1 : 0));
        int n3 = this.isCancelled();
        if (object == null) {
            bl2 = false;
        }
        if (bl2 &= n3) {
            boolean bl3;
            bl2 = this.zzt();
            object = ((zzgax)object).zze();
            while (bl3 = object.hasNext()) {
                Future future = (Future)object.next();
                future.cancel(bl2);
            }
        }
    }

    public final void zze(Set set) {
        set.getClass();
        boolean bl2 = this.isCancelled();
        if (!bl2) {
            Throwable throwable = this.zzl();
            Objects.requireNonNull(throwable);
            zzges.zzK(set, throwable);
        }
    }

    public abstract void zzf(int var1, Object var2);

    public abstract void zzu();

    public final void zzv() {
        Objects.requireNonNull(this.zzb);
        Object object = this.zzb;
        boolean bl2 = ((AbstractCollection)object).isEmpty();
        if (bl2) {
            this.zzu();
            return;
        }
        bl2 = this.zzc;
        if (bl2) {
            boolean bl3;
            object = this.zzb.zze();
            int n3 = 0;
            zzgfh zzgfh2 = null;
            while (bl3 = object.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture)object.next();
                int n4 = n3 + 1;
                zzgeq zzgeq2 = new zzgeq(this, listenableFuture, n3);
                zzgfh2 = zzgfh.zza;
                listenableFuture.addListener(zzgeq2, zzgfh2);
                n3 = n4;
            }
        } else {
            boolean bl4;
            bl2 = this.zzf;
            if (bl2) {
                object = this.zzb;
            } else {
                bl2 = false;
                object = null;
            }
            zzger zzger2 = new zzger(this, (zzgax)object);
            object = this.zzb.zze();
            while (bl4 = object.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture)object.next();
                zzgfh zzgfh3 = zzgfh.zza;
                listenableFuture.addListener(zzger2, zzgfh3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzw(ListenableFuture listenableFuture, int n3) {
        Throwable throwable2;
        block4: {
            block3: {
                block2: {
                    try {
                        boolean bl2 = listenableFuture.isCancelled();
                        if (!bl2) break block2;
                        this.zzb = null;
                        listenableFuture = null;
                        this.cancel(false);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.zzG(n3, listenableFuture);
            }
            this.zzH(null);
            return;
        }
        this.zzH(null);
        throw throwable2;
    }

    public final /* synthetic */ void zzx(zzgax zzgax2) {
        this.zzH(zzgax2);
    }

    public void zzy(int n3) {
        this.zzb = null;
    }
}

