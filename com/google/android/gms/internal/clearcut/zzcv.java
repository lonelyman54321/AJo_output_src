/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbt;
import com.google.android.gms.internal.clearcut.zzdo;

public class zzcv {
    private static final zzbt zzez = zzbt.zzan();
    private zzbb zzln;
    private volatile zzdo zzlo;
    private volatile zzbb zzlp;

    /*
     * Exception decompiling
     */
    private final zzdo zzh(zzdo var1_1) {
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
        boolean bl2 = object instanceof zzcv;
        if (!bl2) {
            return false;
        }
        object = (zzcv)object;
        Object object2 = this.zzlo;
        zzdo zzdo2 = ((zzcv)object).zzlo;
        if (object2 == null && zzdo2 == null) {
            object2 = this.zzr();
            object = ((zzcv)object).zzr();
            return ((zzbb)object2).equals(object);
        }
        if (object2 != null && zzdo2 != null) {
            return object2.equals(zzdo2);
        }
        if (object2 != null) {
            zzdo2 = object2.zzbe();
            object = super.zzh(zzdo2);
            return object2.equals(object);
        }
        object = zzdo2.zzbe();
        return this.zzh((zzdo)object).equals(zzdo2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zzas() {
        Object object = this.zzlp;
        if (object != null) {
            return this.zzlp.size();
        }
        object = this.zzlo;
        if (object != null) {
            return this.zzlo.zzas();
        }
        return 0;
    }

    public final zzdo zzi(zzdo zzdo2) {
        zzdo zzdo3 = this.zzlo;
        this.zzln = null;
        this.zzlp = null;
        this.zzlo = zzdo2;
        return zzdo3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbb zzr() {
        Object object = this.zzlp;
        if (object != null) {
            return this.zzlp;
        }
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    object = this.zzlp;
                    if (object != null) {
                        return this.zzlp;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object = this.zzlo;
                if (object == null) {
                    object = zzbb.zzfi;
                } else {
                    object = this.zzlo;
                    object = object.zzr();
                }
                this.zzlp = object;
                return this.zzlp;
            }
            throw throwable2;
        }
    }
}

