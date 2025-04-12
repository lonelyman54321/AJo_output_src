/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhde;

public class zzhck {
    private static final zzhay zzb = zzhay.zza;
    protected volatile zzhde zza;
    private volatile zzhac zzc;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzhck;
        if (!bl2) {
            return false;
        }
        object = (zzhck)object;
        Object object2 = this.zza;
        zzhde zzhde2 = ((zzhck)object).zza;
        if (object2 == null && zzhde2 == null) {
            object2 = this.zzb();
            object = ((zzhck)object).zzb();
            return ((zzhac)object2).equals(object);
        }
        if (object2 != null && zzhde2 != null) {
            return object2.equals(zzhde2);
        }
        if (object2 != null) {
            zzhde2 = object2.zzbt();
            ((zzhck)object).zzd(zzhde2);
            object = ((zzhck)object).zza;
            return object2.equals(object);
        }
        object = zzhde2.zzbt();
        this.zzd((zzhde)object);
        return this.zza.equals(zzhde2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        Object object = this.zzc;
        if (object != null) {
            return ((zzgzy)this.zzc).zza.length;
        }
        object = this.zza;
        if (object != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzhac zzb() {
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
                    this.zzc = object = zzhac.zzb;
                    return this.zzc;
                } else {
                    object = this.zza;
                    this.zzc = object = object.zzaN();
                }
                return this.zzc;
            }
            throw throwable2;
        }
    }

    public final zzhde zzc(zzhde zzhde2) {
        zzhde zzhde3 = this.zza;
        this.zzc = null;
        this.zza = zzhde2;
        return zzhde3;
    }

    /*
     * Exception decompiling
     */
    public final void zzd(zzhde var1_1) {
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

