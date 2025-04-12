/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzarq;
import java.util.ArrayList;
import java.util.List;

final class zzarp {
    public static final boolean zza = zzarq.zzb;
    private final List zzb;
    private boolean zzc;

    public zzarp() {
        ArrayList arrayList;
        this.zzb = arrayList = new ArrayList();
        this.zzc = false;
    }

    public final void finalize() {
        boolean bl2 = this.zzc;
        if (!bl2) {
            this.zzb("Request on the loose");
            bl2 = false;
            Object[] objectArray = new Object[]{};
            String string2 = "Marker log finalized without finish() - uncaught exit point for request";
            zzarq.zzb(string2, objectArray);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(String object, long l2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzc;
                    if (!bl2) {
                        List list = this.zzb;
                        long l3 = SystemClock.elapsedRealtime();
                        zzaro zzaro2 = new zzaro((String)object, l2, l3);
                        list.add(zzaro2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "Marker added to finished log";
                object = new IllegalStateException(string2);
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void zzb(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 34[TRYBLOCK] [36 : 329->331)] java.lang.Throwable
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

