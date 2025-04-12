/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfz;
import com.google.android.gms.internal.ads.zzggb;
import com.google.android.gms.internal.ads.zzggl;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class zzggc
extends AtomicReference
implements Runnable {
    private static final Runnable zza;
    private static final Runnable zzb;

    static {
        zzggb zzggb2 = new zzggb(null);
        zza = zzggb2;
        zzggb2 = new zzggb(null);
        zzb = zzggb2;
    }

    private final void zzc(Thread thread2) {
        Runnable runnable2 = (Runnable)this.get();
        Runnable runnable3 = null;
        boolean bl2 = false;
        int n3 = 0;
        while (true) {
            int n4;
            int n7;
            if ((n7 = runnable2 instanceof zzgfz) == 0) {
                Runnable runnable4 = zzb;
                if (runnable2 != runnable4) {
                    if (bl2) {
                        thread2.interrupt();
                    }
                    return;
                }
            } else {
                runnable3 = runnable2;
                runnable3 = (zzgfz)runnable2;
            }
            if ((n3 += (n7 = 1)) > (n4 = 1000)) {
                boolean bl3;
                Runnable runnable5 = zzb;
                if (runnable2 == runnable5 || (bl3 = this.compareAndSet(runnable2, runnable5))) {
                    bl3 = Thread.interrupted();
                    bl2 = bl3 || bl2;
                    LockSupport.park(runnable3);
                }
            } else {
                Thread.yield();
            }
            runnable2 = (Runnable)this.get();
        }
    }

    public final void run() {
        Thread thread2 = Thread.currentThread();
        boolean bl2 = false;
        Object object = null;
        boolean bl3 = this.compareAndSet(null, thread2);
        if (bl3) {
            Runnable runnable2;
            boolean bl4;
            bl3 = this.zzg() ^ true;
            if (bl3) {
                try {
                    object = this.zza();
                }
                catch (Throwable throwable) {
                    try {
                        zzggl.zza(throwable);
                        object = zza;
                        bl2 = this.compareAndSet(thread2, object);
                        if (!bl2) {
                            this.zzc(thread2);
                        }
                        this.zzd(throwable);
                        return;
                    }
                    catch (Throwable throwable2) {
                        Runnable runnable3 = zza;
                        boolean bl5 = this.compareAndSet(thread2, runnable3);
                        if (!bl5) {
                            this.zzc(thread2);
                        }
                        this.zze(null);
                        throw throwable2;
                    }
                }
            }
            if (!(bl4 = this.compareAndSet(thread2, runnable2 = zza))) {
                this.zzc(thread2);
            }
            if (bl3) {
                this.zze(object);
            }
        }
    }

    public final String toString() {
        Object object;
        Object object2 = (Runnable)this.get();
        if (object2 == (object = zza)) {
            object2 = "running=[DONE]";
        } else {
            boolean bl2 = object2 instanceof zzgfz;
            if (bl2) {
                object2 = "running=[INTERRUPTED]";
            } else {
                bl2 = object2 instanceof Thread;
                if (bl2) {
                    object2 = ((Thread)object2).getName();
                    object = "running=[RUNNING ON ";
                    String string2 = "]";
                    object2 = cP.a((String)object, (String)object2, string2);
                } else {
                    object2 = "running=[NOT STARTED YET]";
                }
            }
        }
        object = this.zzb();
        return n1.a((String)object2, ", ", (String)object);
    }

    public abstract Object zza();

    public abstract String zzb();

    public abstract void zzd(Throwable var1);

    public abstract void zze(Object var1);

    public abstract boolean zzg();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzh() {
        Runnable runnable2 = (Runnable)this.get();
        boolean bl2 = runnable2 instanceof Thread;
        if (!bl2) return;
        Runnable runnable3 = new zzgfz(this, null);
        Thread thread2 = Thread.currentThread();
        zzgfz.zza((zzgfz)runnable3, thread2);
        bl2 = this.compareAndSet(runnable2, runnable3);
        if (!bl2) return;
        runnable3 = runnable2;
        try {
            runnable3 = (Thread)runnable2;
        }
        catch (Throwable throwable) {
            Runnable runnable5 = zza;
            runnable5 = this.getAndSet(runnable5);
            Runnable runnable6 = zzb;
            if (runnable5 != runnable6) throw throwable;
            runnable2 = (Thread)runnable2;
            LockSupport.unpark((Thread)runnable2);
            throw throwable;
        }
        ((Thread)runnable3).interrupt();
        runnable2 = zza;
        runnable2 = this.getAndSet(runnable2);
        Runnable runnable7 = zzb;
        if (runnable2 != runnable7) return;
        LockSupport.unpark((Thread)runnable3);
    }
}

