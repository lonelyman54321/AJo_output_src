/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 */
package com.google.android.gms.analytics;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.analytics.zzg;
import com.google.android.gms.analytics.zzh;
import com.google.android.gms.analytics.zzl;
import com.google.android.gms.analytics.zzn;
import com.google.android.gms.analytics.zzp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaz;
import com.google.android.gms.internal.gtm.zzff;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public final class zzr {
    private static volatile zzr zza;
    private final Context zzb;
    private final List zzc;
    private final zzn zzd;
    private volatile zzau zze;
    private Thread.UncaughtExceptionHandler zzf;

    public zzr(Context object) {
        object = object.getApplicationContext();
        Preconditions.checkNotNull(object);
        this.zzb = object;
        super(this);
        this.zzd = object;
        super();
        this.zzc = object;
        new zzg();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzr zzb(Context context) {
        Preconditions.checkNotNull(context);
        Object object = zza;
        if (object != null) return zza;
        object = zzr.class;
        synchronized (object) {
            try {
                zzr zzr2 = zza;
                if (zzr2 != null) return zza;
                zza = zzr2 = new zzr(context);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* bridge */ /* synthetic */ Thread.UncaughtExceptionHandler zze(zzr zzr2) {
        return zzr2.zzf;
    }

    public static /* bridge */ /* synthetic */ List zzf(zzr zzr2) {
        return zzr2.zzc;
    }

    public static void zzh() {
        Object object = Thread.currentThread();
        boolean bl2 = object instanceof zzp;
        if (bl2) {
            return;
        }
        object = new IllegalStateException("Call expected from worker thread");
        throw object;
    }

    public final Context zza() {
        return this.zzb;
    }

    /*
     * Exception decompiling
     */
    public final zzau zzc() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [25, 24 : 139->144)] java.lang.Throwable
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

    public final zzaz zzd() {
        int n3;
        int n4;
        DisplayMetrics displayMetrics = this.zzb.getResources().getDisplayMetrics();
        zzaz zzaz2 = new zzaz();
        String string2 = zzff.zzd(Locale.getDefault());
        zzaz2.zze(string2);
        zzaz2.zza = n4 = displayMetrics.widthPixels;
        zzaz2.zzb = n3 = displayMetrics.heightPixels;
        return zzaz2;
    }

    public final Future zzg(Callable callable) {
        Preconditions.checkNotNull(callable);
        Runnable runnable2 = Thread.currentThread();
        boolean bl2 = runnable2 instanceof zzp;
        if (bl2) {
            runnable2 = new FutureTask(callable);
            ((FutureTask)runnable2).run();
            return runnable2;
        }
        return this.zzd.submit(callable);
    }

    public final void zzi(Runnable runnable2) {
        Preconditions.checkNotNull(runnable2);
        this.zzd.submit(runnable2);
    }

    public final void zzj(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzf = uncaughtExceptionHandler;
    }

    public final void zzk(zzh object) {
        boolean bl2 = ((zzh)object).zzl();
        if (!bl2) {
            bl2 = ((zzh)object).zzm();
            if (!bl2) {
                zzh zzh2 = new zzh((zzh)object);
                zzh2.zzi();
                object = this.zzd;
                zzl zzl2 = new zzl(this, zzh2);
                ((ThreadPoolExecutor)object).execute(zzl2);
                return;
            }
            object = new IllegalStateException("Measurement can only be submitted once");
            throw object;
        }
        object = new IllegalStateException("Measurement prototype can't be submitted");
        throw object;
    }
}

