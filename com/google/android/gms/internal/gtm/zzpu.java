/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzpa;
import com.google.android.gms.internal.gtm.zzpj;
import com.google.android.gms.internal.gtm.zzpr;

public final class zzpu
implements Runnable {
    private final Context zza;
    private final zzpa zzb;
    private final zzpj zzc;
    private final zzpr zzd;

    public zzpu(Context object, zzpj zzpj2, zzpa zzpa2) {
        zzpr zzpr2 = new zzpr();
        this.zza = object = (Context)Preconditions.checkNotNull(object);
        object = (zzpa)Preconditions.checkNotNull(zzpa2);
        this.zzb = object;
        this.zzc = zzpj2;
        this.zzd = zzpr2;
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [13 : 216->220)] java.lang.Throwable
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

    public final boolean zza(String string2) {
        Object object = this.zza;
        PackageManager packageManager = object.getPackageManager();
        int n3 = packageManager.checkPermission(string2, (String)(object = object.getPackageName()));
        return n3 == 0;
    }
}

