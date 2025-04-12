/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzkk;

public class zzjt {
    private static final zzio zza = zzio.zzb();
    private zzht zzb;
    private volatile zzkk zzc;
    private volatile zzht zzd;

    /*
     * Exception decompiling
     */
    private final zzkk zzb(zzkk var1_1) {
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
        boolean bl2 = object instanceof zzjt;
        if (!bl2) {
            return false;
        }
        object = (zzjt)object;
        Object object2 = this.zzc;
        zzkk zzkk2 = ((zzjt)object).zzc;
        if (object2 == null && zzkk2 == null) {
            object2 = this.zzc();
            object = ((zzjt)object).zzc();
            return ((zzht)object2).equals(object);
        }
        if (object2 != null && zzkk2 != null) {
            return object2.equals(zzkk2);
        }
        if (object2 != null) {
            zzkk2 = object2.zzr();
            object = super.zzb(zzkk2);
            return object2.equals(object);
        }
        object = zzkk2.zzr();
        return this.zzb((zzkk)object).equals(zzkk2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzkk zza(zzkk zzkk2) {
        zzkk zzkk3 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzkk2;
        return zzkk3;
    }

    public final int zzb() {
        Object object = this.zzd;
        if (object != null) {
            return this.zzd.zza();
        }
        object = this.zzc;
        if (object != null) {
            return this.zzc.zzm();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzht zzc() {
        Object object = this.zzd;
        if (object != null) {
            return this.zzd;
        }
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    object = this.zzd;
                    if (object != null) {
                        return this.zzd;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object = this.zzc;
                if (object == null) {
                    this.zzd = object = zzht.zza;
                    return this.zzd;
                } else {
                    object = this.zzc;
                    this.zzd = object = object.zzg();
                }
                return this.zzd;
            }
            throw throwable2;
        }
    }
}

