/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzyv;
import com.google.android.gms.internal.gtm.zzyx;

public class zzacw {
    protected volatile zzadl zza;
    private volatile zzyx zzb;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzacw;
        if (!bl2) {
            return false;
        }
        object = (zzacw)object;
        Object object2 = this.zza;
        zzadl zzadl2 = ((zzacw)object).zza;
        if (object2 == null && zzadl2 == null) {
            object2 = this.zzb();
            object = ((zzacw)object).zzb();
            return ((zzyx)object2).equals(object);
        }
        if (object2 != null && zzadl2 != null) {
            return object2.equals(zzadl2);
        }
        if (object2 != null) {
            zzadl2 = object2.zzay();
            ((zzacw)object).zzd(zzadl2);
            object = ((zzacw)object).zza;
            return object2.equals(object);
        }
        object = zzadl2.zzay();
        this.zzd((zzadl)object);
        return this.zza.equals(zzadl2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        Object object = this.zzb;
        if (object != null) {
            return ((zzyv)this.zzb).zza.length;
        }
        object = this.zza;
        if (object != null) {
            return this.zza.zzY();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzyx zzb() {
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
                    this.zzb = object = zzyx.zzb;
                    return this.zzb;
                } else {
                    object = this.zza;
                    this.zzb = object = object.zzR();
                }
                return this.zzb;
            }
            throw throwable2;
        }
    }

    public final zzadl zzc(zzadl zzadl2) {
        zzadl zzadl3 = this.zza;
        this.zzb = null;
        this.zza = zzadl2;
        return zzadl3;
    }

    /*
     * Exception decompiling
     */
    public final void zzd(zzadl var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3, 2 : 29->36)] java.lang.Throwable
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

