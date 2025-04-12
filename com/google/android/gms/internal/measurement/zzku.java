/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzlm;

public class zzku {
    private volatile zzlm zza;
    private volatile zziy zzb;
    private volatile boolean zzc;

    /*
     * Exception decompiling
     */
    private final zzlm zzb(zzlm var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3, 2 : 30->37)] java.lang.Throwable
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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzku;
        if (!bl2) {
            return false;
        }
        object = (zzku)object;
        Object object2 = this.zza;
        zzlm zzlm2 = ((zzku)object).zza;
        if (object2 == null && zzlm2 == null) {
            object2 = this.zzb();
            object = ((zzku)object).zzb();
            return ((zziy)object2).equals(object);
        }
        if (object2 != null && zzlm2 != null) {
            return object2.equals(zzlm2);
        }
        if (object2 != null) {
            zzlm2 = object2.zzal();
            object = super.zzb(zzlm2);
            return object2.equals(object);
        }
        object = zzlm2.zzal();
        return this.zzb((zzlm)object).equals(zzlm2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        Object object = this.zzb;
        if (object != null) {
            return this.zzb.zzb();
        }
        object = this.zza;
        if (object != null) {
            return this.zza.zzcf();
        }
        return 0;
    }

    public final zzlm zza(zzlm zzlm2) {
        zzlm zzlm3 = this.zza;
        this.zzb = null;
        this.zza = zzlm2;
        return zzlm3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zziy zzb() {
        Object object = this.zzb;
        if (object != null) {
            return this.zzb;
        }
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    object = this.zzb;
                    if (object != null) {
                        return this.zzb;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object = this.zza;
                if (object == null) {
                    this.zzb = object = zziy.zza;
                    return this.zzb;
                } else {
                    object = this.zza;
                    this.zzb = object = object.zzcd();
                }
                return this.zzb;
            }
            throw throwable2;
        }
    }
}

