/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitcompat.zze;
import com.google.android.play.core.splitcompat.zzs;
import com.google.android.play.core.splitinstall.internal.zzaj;
import com.google.android.play.core.splitinstall.internal.zzam;
import com.google.android.play.core.splitinstall.internal.zzbr;
import com.google.android.play.core.splitinstall.zzf;
import com.google.android.play.core.splitinstall.zzh;
import java.util.List;
import java.util.concurrent.Executor;

public final class zzak
implements zzh {
    private final Context zza;
    private final zze zzb;
    private final zzam zzc;
    private final Executor zzd;
    private final zzs zze;

    public zzak(Context context, Executor executor, zzam zzam2, zze zze2, zzs zzs2) {
        this.zza = context;
        this.zzb = zze2;
        this.zzc = zzam2;
        this.zzd = executor;
        this.zze = zzs2;
    }

    public static /* bridge */ /* synthetic */ zzam zza(zzak zzak2) {
        return zzak2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzak object, List list, zzf zzf2) {
        if ((object = ((zzak)object).zze(list)) == null) {
            return;
        }
        int n3 = (Integer)object;
        if (n3 == 0) {
            zzf2.zzc();
            return;
        }
        int n4 = (Integer)object;
        zzf2.zzb(n4);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzak zzak2, zzf zzf2) {
        int n3 = -12;
        try {
            zzak2 = zzak2.zza;
        }
        catch (Exception exception) {
            zzf2.zzb(n3);
            return;
        }
        zzak2 = zzbr.zza((Context)zzak2);
        boolean bl2 = SplitCompat.zzd((Context)zzak2);
        if (!bl2) {
            zzf2.zzb(n3);
            return;
        }
        zzf2.zza();
    }

    /*
     * Exception decompiling
     */
    private final Integer zze(List var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [8, 7 : 65->71)] java.lang.Throwable
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

    public final void zzd(List object, zzf zzf2) {
        boolean bl2 = SplitCompat.zze();
        if (bl2) {
            Executor executor = this.zzd;
            zzaj zzaj2 = new zzaj(this, (List)object, zzf2);
            executor.execute(zzaj2);
            return;
        }
        object = new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        throw object;
    }
}

