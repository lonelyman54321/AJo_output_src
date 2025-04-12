/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhx;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzia;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzji;
import java.util.AbstractCollection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zzhv
extends zzji {
    private static final AtomicLong zza;
    private zzhz zzb;
    private zzhz zzc;
    private final PriorityBlockingQueue zzd;
    private final BlockingQueue zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    static {
        AtomicLong atomicLong;
        zza = atomicLong = new AtomicLong(Long.MIN_VALUE);
    }

    public zzhv(zzic object) {
        super((zzic)object);
        this.zzh = object = new Object();
        this.zzi = object = new Semaphore(2);
        object = new PriorityBlockingQueue();
        this.zzd = object;
        super();
        this.zze = object;
        this.zzf = object = new zzhx(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = object = new zzhx(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ zzhz zza(zzhv zzhv2) {
        return zzhv2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zza(zzhv zzhv2, zzhz zzhz2) {
        zzhv2.zzc = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zza(zzia runnable2) {
        Object object = this.zzh;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            Object object2 = this.zzd;
                            ((PriorityBlockingQueue)object2).add(runnable2);
                            runnable2 = this.zzb;
                            if (runnable2 != null) break block3;
                            object2 = "Measurement Worker";
                            PriorityBlockingQueue priorityBlockingQueue = this.zzd;
                            runnable2 = new zzhz(this, (String)object2, priorityBlockingQueue);
                            this.zzb = runnable2;
                            object2 = this.zzf;
                            ((Thread)runnable2).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object2);
                            runnable2 = this.zzb;
                            ((Thread)runnable2).start();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    ((zzhz)runnable2).zza();
                }
                return;
            }
            throw throwable2;
        }
    }

    public static /* bridge */ /* synthetic */ zzhz zzb(zzhv zzhv2) {
        return zzhv2.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzhv zzhv2, zzhz zzhz2) {
        zzhv2.zzb = null;
    }

    public static /* bridge */ /* synthetic */ Object zzc(zzhv zzhv2) {
        return zzhv2.zzh;
    }

    public static /* bridge */ /* synthetic */ AtomicLong zzc() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ Semaphore zzd(zzhv zzhv2) {
        return zzhv2.zzi;
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzhv zzhv2) {
        return zzhv2.zzj;
    }

    /*
     * Exception decompiling
     */
    public final Object zza(AtomicReference var1_1, long var2_2, String var4_3, Runnable var5_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [5 : 86->90)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Future zza(Callable object) {
        this.zzad();
        Preconditions.checkNotNull(object);
        String string2 = "Task exception on worker thread";
        zzia zzia2 = new zzia(this, (Callable)object, false, string2);
        object = Thread.currentThread();
        Object object2 = this.zzb;
        if (object == object2) {
            object = this.zzd;
            boolean bl2 = ((AbstractCollection)object).isEmpty();
            if (!bl2) {
                object = this.zzj().zzr();
                object2 = "Callable skipped the worker queue.";
                ((zzgq)object).zza((String)object2);
            }
            zzia2.run();
        } else {
            this.zza(zzia2);
        }
        return zzia2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Runnable object) {
        this.zzad();
        Preconditions.checkNotNull(object);
        Object object2 = null;
        Object object3 = "Task exception on network thread";
        Runnable runnable2 = new zzia(this, (Runnable)object, false, (String)object3);
        object = this.zzh;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            object2 = this.zze;
                            object2.add(runnable2);
                            runnable2 = this.zzc;
                            if (runnable2 != null) break block3;
                            object2 = "Measurement Network";
                            object3 = this.zze;
                            runnable2 = new zzhz(this, (String)object2, (BlockingQueue)object3);
                            this.zzc = runnable2;
                            object2 = this.zzg;
                            ((Thread)runnable2).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object2);
                            runnable2 = this.zzc;
                            ((Thread)runnable2).start();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    ((zzhz)runnable2).zza();
                }
                return;
            }
            throw throwable2;
        }
    }

    public final Future zzb(Callable object) {
        this.zzad();
        Preconditions.checkNotNull(object);
        boolean bl2 = true;
        String string2 = "Task exception on worker thread";
        zzia zzia2 = new zzia(this, (Callable)object, bl2, string2);
        object = Thread.currentThread();
        zzhz zzhz2 = this.zzb;
        if (object == zzhz2) {
            zzia2.run();
        } else {
            this.zza(zzia2);
        }
        return zzia2;
    }

    public final void zzb(Runnable runnable2) {
        this.zzad();
        Preconditions.checkNotNull(runnable2);
        zzia zzia2 = new zzia(this, runnable2, false, "Task exception on worker thread");
        this.zza(zzia2);
    }

    public final void zzc(Runnable runnable2) {
        this.zzad();
        Preconditions.checkNotNull(runnable2);
        zzia zzia2 = new zzia(this, runnable2, true, "Task exception on worker thread");
        this.zza(zzia2);
    }

    public final boolean zzg() {
        zzhz zzhz2;
        Thread thread2 = Thread.currentThread();
        return thread2 == (zzhz2 = this.zzc);
    }

    public final boolean zzh() {
        return false;
    }

    public final boolean zzm() {
        zzhz zzhz2;
        Thread thread2 = Thread.currentThread();
        return thread2 == (zzhz2 = this.zzb);
    }

    public final void zzt() {
        zzhz zzhz2;
        Object object = Thread.currentThread();
        if (object == (zzhz2 = this.zzc)) {
            return;
        }
        object = new IllegalStateException("Call expected from network thread");
        throw object;
    }

    public final void zzv() {
        zzhz zzhz2;
        Object object = Thread.currentThread();
        if (object == (zzhz2 = this.zzb)) {
            return;
        }
        object = new IllegalStateException("Call expected from worker thread");
        throw object;
    }
}

