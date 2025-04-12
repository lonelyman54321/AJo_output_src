/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbdv$zzt;
import com.google.android.gms.internal.ads.zzbdv$zzt$zza;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhbi;

public final class zzbdm {
    private final zzbdu zza;
    private final zzbdv$zzt$zza zzb;
    private final boolean zzc;

    private zzbdm() {
        Object object = zzbdv$zzt.zzj();
        this.zzb = object;
        this.zzc = false;
        this.zza = object = new zzbdu();
    }

    public zzbdm(zzbdu object) {
        boolean bl2;
        zzbdv$zzt$zza zzbdv$zzt$zza;
        this.zzb = zzbdv$zzt$zza = zzbdv$zzt.zzj();
        this.zza = object;
        object = zzbep.zzeT;
        this.zzc = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
    }

    public static zzbdm zza() {
        zzbdm zzbdm2 = new zzbdm();
        return zzbdm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String zzd(zzbdo object) {
        String string2 = "id=";
        synchronized (this) {
            Object object2 = this.zzb;
            object2 = ((zzbdv$zzt$zza)object2).zzah();
            Clock clock = zzu.zzB();
            long l2 = clock.elapsedRealtime();
            int n3 = ((zzbdo)object).zza();
            Object object3 = this.zzb;
            object3 = ((zzhbi)object3).zzbn();
            object3 = (zzbdv$zzt)object3;
            object3 = ((zzgzi)object3).zzaV();
            int n4 = 3;
            object3 = Base64.encodeToString((byte[])object3, (int)n4);
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append((String)object2);
            string2 = ",timestamp=";
            stringBuilder.append(string2);
            stringBuilder.append(l2);
            string2 = ",event=";
            stringBuilder.append(string2);
            stringBuilder.append(n3);
            object = ",data=";
            stringBuilder.append((String)object);
            stringBuilder.append((String)object3);
            object = "\n";
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
    }

    /*
     * Exception decompiling
     */
    private final void zze(zzbdo var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [18, 17 : 86->93)] java.lang.Throwable
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
    private final void zzf(zzbdo object) {
        synchronized (this) {
            Object object2 = this.zzb;
            ((zzbdv$zzt$zza)object2).zzq();
            Object object3 = zzt.zzd();
            ((zzbdv$zzt$zza)object2).zzj((Iterable)object3);
            object2 = this.zzb;
            object2 = ((zzhbi)object2).zzbn();
            object2 = (zzbdv$zzt)object2;
            object2 = ((zzgzi)object2).zzaV();
            zzbdu zzbdu2 = this.zza;
            object3 = new zzbdt(zzbdu2, (byte[])object2, null);
            int n3 = ((zzbdo)object).zza();
            ((zzbdt)object3).zza(n3);
            ((zzbdt)object3).zzc();
            int n4 = ((zzbdo)object).zza();
            n3 = 10;
            object = Integer.toString(n4, n3);
            object = String.valueOf(object);
            object2 = "Logging Event with event code : ";
            object = ((String)object2).concat((String)object);
            zze.zza((String)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzbdo zzbdo2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                block5: {
                    try {
                        bl2 = this.zzc;
                        if (bl2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                Object object = zzbep.zzeU;
                zzben zzben2 = zzba.zzc();
                object = zzben2.zza((zzbeg)object);
                bl2 = (Boolean)(object = (Boolean)object);
                if (bl2) {
                    this.zze(zzbdo2);
                    return;
                }
                this.zzf(zzbdo2);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(zzbdl zzbdl2) {
        synchronized (this) {
            try {
                boolean bl2 = this.zzc;
                if (!bl2) {
                    return;
                }
                try {
                    zzbdv$zzt$zza zzbdv$zzt$zza = this.zzb;
                    zzbdl2.zza(zzbdv$zzt$zza);
                    return;
                }
                catch (NullPointerException nullPointerException) {
                    String string2 = "AdMobClearcutLogger.modify";
                    zzcby zzcby2 = zzu.zzo();
                    zzcby2.zzw(nullPointerException, string2);
                    return;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

