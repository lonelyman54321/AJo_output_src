/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzf;
import com.google.android.gms.internal.measurement.zzgr$zzc;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzk;
import com.google.android.gms.internal.measurement.zzw;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzb {
    private final zzf zza;
    private zzh zzb;
    private zzac zzc;
    private final zzaa zzd;

    public zzb() {
        zzf zzf2 = new zzf();
        this(zzf2);
    }

    private zzb(zzf zzf2) {
        this.zza = zzf2;
        Object object = zzf2.zza.zza();
        this.zzb = object;
        this.zzc = object = new zzac();
        this.zzd = object = new zzaa();
        object = new zza(this);
        zzf2.zza("internal.registerCallback", (Callable)object);
        object = new zzd(this);
        zzf2.zza("internal.eventLogger", (Callable)object);
    }

    public static /* synthetic */ zzal zza(zzb object) {
        object = ((zzb)object).zzc;
        zzk zzk2 = new zzk((zzac)object);
        return zzk2;
    }

    public static /* synthetic */ zzal zzb(zzb object) {
        object = ((zzb)object).zzd;
        zzw zzw2 = new zzw((zzaa)object);
        return zzw2;
    }

    public final zzac zza() {
        return this.zzc;
    }

    /*
     * Exception decompiling
     */
    public final void zza(zzgr$zzc var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 34[TRYBLOCK] [35 : 312->315)] java.lang.Throwable
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

    public final void zza(String string2, Callable callable) {
        this.zza.zza(string2, callable);
    }

    public final boolean zza(zzad object) {
        Throwable throwable2;
        Object object2;
        block15: {
            block14: {
                try {
                    object2 = this.zzc;
                }
                catch (Throwable throwable2) {}
                ((zzac)object2).zza((zzad)object);
                object = this.zza;
                object = ((zzf)object).zzb;
                object2 = "runtime.counter";
                double d2 = 0.0;
                Double d5 = d2;
                Object object3 = new zzai(d5);
                ((zzh)object).zzc((String)object2, (zzaq)object3);
                object = this.zzd;
                object2 = this.zzb;
                object2 = ((zzh)object2).zza();
                object3 = this.zzc;
                ((zzaa)object).zza((zzh)object2, (zzac)object3);
                boolean bl2 = this.zzc();
                if (bl2) break block14;
                bl2 = this.zzb();
                if (!bl2) {
                    return false;
                }
                break block15;
            }
            return true;
        }
        object2 = new zzc(throwable2);
        throw object2;
    }

    public final boolean zzb() {
        List list = this.zzc.zzc();
        boolean bl2 = list.isEmpty();
        return !bl2;
    }

    public final boolean zzc() {
        zzad zzad2;
        zzad zzad3 = this.zzc.zzb();
        boolean bl2 = zzad3.equals(zzad2 = this.zzc.zza());
        return !bl2;
    }
}

