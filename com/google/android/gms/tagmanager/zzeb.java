/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.tagmanager.zzak;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzdb;
import com.google.android.gms.tagmanager.zzdc;

final class zzeb
implements Runnable {
    private final Context zza;
    private final String zzb;
    private final String zzc;
    private zzdb zzd;
    private volatile zzak zze;
    private volatile String zzf;
    private volatile String zzg;

    public zzeb(Context object, String string2, zzak zzak2) {
        this.zza = object;
        this.zzb = string2;
        this.zze = zzak2;
        object = String.valueOf(string2);
        object = "/r?id=".concat((String)object);
        this.zzc = object;
        this.zzf = object;
        this.zzg = null;
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [4 : 223->232)] java.lang.Throwable
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
     * Enabled aggressive block sorting
     */
    public final void zza(String string2) {
        if (string2 == null) {
            string2 = this.zzc;
        } else {
            zzbb zzbb2 = zzdc.zzb;
            String string3 = "Setting CTFE URL path: ".concat(string2);
            zzbb2.zza(string3);
        }
        this.zzf = string2;
    }

    public final void zzb(zzdb zzdb2) {
        this.zzd = zzdb2;
    }

    public final void zzc(String string2) {
        String string3 = String.valueOf(string2);
        zzbb zzbb2 = zzdc.zzb;
        string3 = "Setting previous container version: ".concat(string3);
        zzbb2.zza(string3);
        this.zzg = string2;
    }
}

