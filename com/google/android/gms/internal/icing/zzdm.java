/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcd;
import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzcp;
import com.google.android.gms.internal.icing.zzee;

public class zzdm {
    private static final zzcp zzb = zzcp.zza();
    protected volatile zzee zza;
    private volatile zzcf zzc;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzdm;
        if (!bl2) {
            return false;
        }
        object = (zzdm)object;
        Object object2 = this.zza;
        zzee zzee2 = ((zzdm)object).zza;
        if (object2 == null && zzee2 == null) {
            object2 = this.zzb();
            object = ((zzdm)object).zzb();
            return ((zzcf)object2).equals(object);
        }
        if (object2 != null && zzee2 != null) {
            return object2.equals(zzee2);
        }
        if (object2 != null) {
            zzee2 = object2.zzm();
            ((zzdm)object).zzc(zzee2);
            object = ((zzdm)object).zza;
            return object2.equals(object);
        }
        object = zzee2.zzm();
        this.zzc((zzee)object);
        return this.zza.equals(zzee2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        Object object = this.zzc;
        if (object != null) {
            return ((zzcd)this.zzc).zza.length;
        }
        object = this.zza;
        if (object != null) {
            return this.zza.zzo();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcf zzb() {
        Object object = this.zzc;
        if (object != null) {
            return this.zzc;
        }
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    object = this.zzc;
                    if (object != null) {
                        return this.zzc;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object = this.zza;
                if (object == null) {
                    this.zzc = object = zzcf.zzb;
                    return this.zzc;
                } else {
                    object = this.zza;
                    this.zzc = object = object.zzg();
                }
                return this.zzc;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void zzc(zzee var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [7 : 44->51)] java.lang.Throwable
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

