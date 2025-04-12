/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzlp;
import com.google.android.gms.measurement.internal.zzlq;
import java.net.URL;
import java.util.Map;

final class zzlr
implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzlo zzc;
    private final String zzd;
    private final Map zze;
    private final /* synthetic */ zzlp zzf;

    public zzlr(zzlp zzlp2, String string2, URL uRL, byte[] byArray, Map map2, zzlo zzlo2) {
        this.zzf = zzlp2;
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(uRL);
        Preconditions.checkNotNull(zzlo2);
        this.zza = uRL;
        this.zzb = byArray;
        this.zzc = zzlo2;
        this.zzd = string2;
        this.zze = map2;
    }

    private final void zza(int n3, Exception exception, byte[] byArray, Map map2) {
        zzhv zzhv2 = this.zzf.zzl();
        zzlq zzlq2 = new zzlq(this, n3, exception, byArray, map2);
        zzhv2.zzb(zzlq2);
    }

    public static /* synthetic */ void zza(zzlr zzlr2, int n3, Exception exception, byte[] byArray, Map map2) {
        zzlo zzlo2 = zzlr2.zzc;
        String string2 = zzlr2.zzd;
        zzlo2.zza(string2, n3, exception, byArray, map2);
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 20[TRYBLOCK] [41, 40 : 220->224)] java.lang.Throwable
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
}

