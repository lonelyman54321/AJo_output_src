/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzect;
import com.google.android.gms.internal.ads.zzeda;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzecu
extends zzeda {
    private zzbwz zzh;

    public zzecu(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        context = zzu.zzt().zzb();
        this.zzf = context;
        this.zzg = scheduledExecutorService;
    }

    /*
     * Exception decompiling
     */
    public final void onConnected(Bundle var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [18 : 93->97)] java.lang.Throwable
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza(zzbwz object, long l2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                try {
                    bl2 = this.zzb;
                    if (bl2) {
                        object = this.zza;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        ScheduledExecutorService scheduledExecutorService = this.zzg;
                        return zzgft.zzo((ListenableFuture)object, l2, timeUnit, scheduledExecutorService);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                bl2 = true;
                {
                    this.zzb = bl2;
                    this.zzh = object;
                    this.zzb();
                    object = this.zza;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    ScheduledExecutorService scheduledExecutorService = this.zzg;
                    object = zzgft.zzo((ListenableFuture)object, l2, timeUnit, scheduledExecutorService);
                    zzect zzect2 = new zzect(this);
                    zzgge zzgge2 = zzcci.zzf;
                    object.addListener(zzect2, zzgge2);
                    return object;
                }
            }
            throw throwable2;
        }
    }
}

