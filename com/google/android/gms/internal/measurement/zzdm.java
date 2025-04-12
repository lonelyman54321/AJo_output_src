/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdp;
import java.util.concurrent.atomic.AtomicReference;

public final class zzdm
extends zzdp {
    private final AtomicReference zza;
    private boolean zzb;

    public zzdm() {
        AtomicReference atomicReference;
        this.zza = atomicReference = new AtomicReference();
    }

    public static Object zza(Bundle object, Class object2) {
        String string2;
        Object var2_2 = null;
        if (object != null && (object = object.get(string2 = "r")) != null) {
            try {
                return ((Class)object2).cast(object);
            }
            catch (ClassCastException classCastException) {
                object2 = ((Class)object2).getCanonicalName();
                object = object.getClass().getCanonicalName();
                Object[] objectArray = new Object[]{object2, object};
                String.format("Unexpected object type. Expected, Received: %s, %s", objectArray);
                throw classCastException;
            }
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public final Bundle zza(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [5 : 39->41)] java.lang.Throwable
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Bundle object) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                boolean bl2;
                AtomicReference atomicReference2 = this.zza;
                atomicReference2.set(object);
                this.zzb = bl2 = true;
            }
            catch (Throwable throwable) {
                AtomicReference atomicReference3 = this.zza;
                atomicReference3.notify();
                throw throwable;
            }
            try {
                object = this.zza;
                object.notify();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Long zzb(long l2) {
        return (Long)zzdm.zza(this.zza(l2), Long.class);
    }

    public final String zzc(long l2) {
        return (String)zzdm.zza(this.zza(l2), String.class);
    }
}

