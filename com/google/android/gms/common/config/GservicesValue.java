/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.config;

import com.google.android.gms.common.config.zza;
import com.google.android.gms.common.config.zzb;
import com.google.android.gms.common.config.zzc;
import com.google.android.gms.common.config.zzd;
import com.google.android.gms.common.config.zze;

public abstract class GservicesValue {
    private static final Object zzc;
    protected final String zza;
    protected final Object zzb;
    private Object zzd = null;

    static {
        Object object;
        zzc = object = new Object();
    }

    public GservicesValue(String string2, Object object) {
        this.zza = string2;
        this.zzb = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static boolean isInitialized() {
        Object object = zzc;
        // MONITORENTER : object
        // MONITOREXIT : object
        return false;
    }

    public static GservicesValue value(String string2, Float f5) {
        zzd zzd2 = new zzd(string2, f5);
        return zzd2;
    }

    public static GservicesValue value(String string2, Integer n3) {
        zzc zzc2 = new zzc(string2, n3);
        return zzc2;
    }

    public static GservicesValue value(String string2, Long l2) {
        zzb zzb2 = new zzb(string2, l2);
        return zzb2;
    }

    public static GservicesValue value(String string2, String string3) {
        zze zze2 = new zze(string2, string3);
        return zze2;
    }

    public static GservicesValue value(String string2, boolean bl2) {
        Boolean bl3 = bl2;
        zza zza2 = new zza(string2, bl3);
        return zza2;
    }

    /*
     * Exception decompiling
     */
    public final Object get() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [6 : 46->49)] java.lang.Throwable
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

    public final Object getBinderSafe() {
        return this.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void override(Object object) {
        this.zzd = object;
        object = zzc;
        synchronized (object) {
            synchronized (object) {
                // MONITOREXIT @DISABLED, blocks:[0, 3] lbl6 : MonitorExitStatement: MONITOREXIT : var1_1
                return;
            }
        }
    }

    public void resetOverride() {
        this.zzd = null;
    }

    public abstract Object zza(String var1);
}

