/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzaae;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhf;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzid;
import com.google.android.gms.internal.ads.zzvd;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwr;
import java.util.Map;

final class zzwm
implements zzaae,
zzvd {
    final /* synthetic */ zzwr zza;
    private final long zzb;
    private final Uri zzc;
    private final zzid zzd;
    private final zzwg zze;
    private final zzadx zzf;
    private final zzeu zzg;
    private final zzaeq zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhh zzl;
    private zzafa zzm;
    private boolean zzn;

    public zzwm(zzwr object, Uri uri, zzhb zzhb2, zzwg zzwg2, zzadx zzadx2, zzeu zzeu2) {
        long l2;
        this.zza = object;
        this.zzc = uri;
        this.zzd = object = new zzid(zzhb2);
        this.zze = zzwg2;
        this.zzf = zzadx2;
        this.zzg = zzeu2;
        this.zzh = object = new zzaeq();
        this.zzj = true;
        this.zzb = l2 = zzvf.zza();
        this.zzl = object = this.zzi(0L);
    }

    public static /* bridge */ /* synthetic */ long zzb(zzwm zzwm2) {
        return zzwm2.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzc(zzwm zzwm2) {
        return zzwm2.zzk;
    }

    public static /* bridge */ /* synthetic */ zzhh zzd(zzwm zzwm2) {
        return zzwm2.zzl;
    }

    public static /* bridge */ /* synthetic */ zzid zze(zzwm zzwm2) {
        return zzwm2.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzwm zzwm2, long l2, long l3) {
        zzwm2.zzh.zza = l2;
        zzwm2.zzk = l3;
        zzwm2.zzj = true;
        zzwm2.zzn = false;
    }

    private final zzhh zzi(long l2) {
        zzhf zzhf2 = new zzhf();
        Uri uri = this.zzc;
        zzhf2.zzd(uri);
        zzhf2.zzc(l2);
        zzhf2.zza(6);
        Map map2 = zzwr.zzz();
        zzhf2.zzb(map2);
        return zzhf2.zze();
    }

    public final void zza(zzfu zzfu2) {
        long l2;
        boolean bl2 = this.zzn;
        boolean bl3 = true;
        if (!bl2) {
            l2 = this.zzk;
        } else {
            zzwr zzwr2 = this.zza;
            l2 = zzwr.zzr(zzwr2, bl3);
            long l3 = this.zzk;
            l2 = Math.max(l2, l3);
        }
        int n3 = zzfu2.zzb();
        zzafa zzafa2 = this.zzm;
        zzafa2.getClass();
        zzaey.zzb(zzafa2, zzfu2, n3);
        zzafa2.zzs(l2, 1, n3, 0, null);
        this.zzn = bl3;
    }

    public final void zzg() {
        this.zzi = true;
    }

    /*
     * Exception decompiling
     */
    public final void zzh() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [9 : 177->181)] java.lang.Throwable
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

