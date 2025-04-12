/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.vision;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;

public abstract class zzt {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private boolean zzf;
    private boolean zzg;
    private Object zzh;

    public zzt(Context object, String string2, String string3) {
        Object object2;
        this.zzb = object2 = new Object();
        this.zzf = false;
        this.zzg = false;
        this.zza = object;
        this.zzc = string2;
        object = String.valueOf(string3);
        int n3 = ((String)object).length();
        object2 = "com.google.android.gms.vision.dynamite.";
        object = n3 != 0 ? ((String)object2).concat((String)object) : new String((String)object2);
        this.zzd = object;
        this.zze = string3;
    }

    public abstract Object zza(DynamiteModule var1, Context var2);

    public abstract void zza();

    public final boolean zzb() {
        Object object = this.zzd();
        return object != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        Object object = this.zzb;
        synchronized (object) {
            block6: {
                Throwable throwable2;
                block7: {
                    try {
                        Object object2 = this.zzh;
                        if (object2 == null) {
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    try {
                        this.zza();
                        break block6;
                    }
                    catch (RemoteException remoteException) {}
                }
                throw throwable2;
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final Object zzd() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3, 2 : 40->44)] java.lang.Throwable
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

