/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfx;
import com.google.android.gms.internal.gtm.zzrc;
import com.google.android.gms.internal.gtm.zzrg;
import com.google.android.gms.tagmanager.zzae;
import com.google.android.gms.tagmanager.zzdb;
import com.google.android.gms.tagmanager.zzef;
import com.google.android.gms.tagmanager.zzeg;
import java.io.File;
import java.util.concurrent.ExecutorService;

final class zzeh
implements zzae {
    private final Context zza;
    private final String zzb;
    private final ExecutorService zzc;
    private zzdb zzd;

    public zzeh(Context object, String string2) {
        this.zza = object;
        this.zzb = string2;
        object = zzfx.zza().zza(2);
        this.zzc = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        synchronized (this) {
            ExecutorService executorService = this.zzc;
            executorService.shutdown();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final zzrg zza(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 29[TRYBLOCK] [91, 90, 92 : 338->343)] org.json.JSONException
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

    public final void zzb() {
        zzef zzef2 = new zzef(this);
        this.zzc.execute(zzef2);
    }

    public final void zzc(zzrc zzrc2) {
        zzeg zzeg2 = new zzeg(this, zzrc2);
        this.zzc.execute(zzeg2);
    }

    public final void zzd(zzdb zzdb2) {
        this.zzd = zzdb2;
    }

    public final File zze() {
        Object object = this.zza.getDir("google_tagmanager", 0);
        zzfm.zza();
        String string2 = String.valueOf(this.zzb);
        string2 = "resource_".concat(string2);
        File file = new File((File)object, string2);
        object = file.getPath();
        File file2 = new File((String)object);
        return file2;
    }

    /*
     * Exception decompiling
     */
    public final void zzf() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [26, 25, 24 : 162->166)] java.lang.Throwable
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

