/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgr;

public final class zzcbz {
    long zza;
    long zzb;
    int zzc;
    int zzd;
    long zze;
    final String zzf;
    int zzg;
    int zzh;
    int zzi;
    private final Object zzj;
    private final zzg zzk;

    public zzcbz(String string2, zzg zzg2) {
        Object object;
        int n3;
        long l2;
        this.zza = l2 = (long)-1;
        this.zzb = l2;
        this.zzc = n3 = -1;
        this.zzd = n3;
        this.zze = 0L;
        this.zzj = object = new Object();
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzf = string2;
        this.zzk = zzg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzi() {
        Object object = (Boolean)zzbgr.zza.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzj;
            synchronized (object) {
                int n3;
                this.zzc = n3 = this.zzc + -1;
                this.zzd = n3 = this.zzd + -1;
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        Object object = this.zzj;
        synchronized (object) {
            return this.zzi;
        }
    }

    /*
     * Exception decompiling
     */
    public final Bundle zzb(Context var1_1, String var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [6 : 67->71)] java.lang.Throwable
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
    public final void zzc() {
        Object object = this.zzj;
        synchronized (object) {
            int n3;
            this.zzg = n3 = this.zzg + 1;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        Object object = this.zzj;
        synchronized (object) {
            int n3;
            this.zzh = n3 = this.zzh + 1;
            return;
        }
    }

    public final void zze() {
        this.zzi();
    }

    public final void zzf() {
        this.zzi();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(zzl var1_1, long var2_3) {
        var4_4 = this.zzj;
        synchronized (var4_4) {
            block10: {
                block11: {
                    try {
                        var5_5 = this.zzk;
                        var6_6 = var5_5.zzd();
                        var8_7 = zzu.zzB();
                        var9_8 = var8_7.currentTimeMillis();
                        var11_9 = this.zzb;
                    }
                    catch (Throwable var1_2) {
                        break block10;
                    }
                    var13_10 = -1;
                    var15_11 = var11_9 == var13_10 ? 0 : (var11_9 < var13_10 ? -1 : 1);
                    if (var15_11 == false) {
                        var6_6 = var9_8 - var6_6;
                        var16_12 = zzbep.zzaU;
                        var17_13 = zzba.zzc();
                        var16_12 = var17_13.zza((zzbeg)var16_12);
                        var11_9 = (var16_12 = (Long)var16_12).longValue();
                        cfr_temp_0 = var6_6 - var11_9;
                        var18_14 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var18_14 /* !! */  > 0) {
                            this.zzd = var19_15 = -1;
                        } else {
                            var5_5 = this.zzk;
                            this.zzd = var19_15 = var5_5.zzc();
                        }
                        this.zzb = var2_3;
                        this.zza = var2_3;
                    } else {
                        this.zza = var2_3;
                    }
                    var20_16 = zzbep.zzdB;
                    var21_17 = zzba.zzc();
                    var20_16 = var21_17.zza((zzbeg)var20_16);
                    var20_16 = (Boolean)var20_16;
                    var22_18 = var20_16.booleanValue();
                    var23_19 = 1;
                    if (!var22_18 && (var1_1 = var1_1.zzc) != null && (var24_20 = var1_1.getInt((String)(var20_16 = "gw"), var19_15 = 2)) == var23_19) {
                        return;
                    }
                    this.zzc = var24_20 = this.zzc + var23_19;
                    this.zzd = var24_20 = this.zzd + var23_19;
                    if (var24_20 != 0) break block11;
                    this.zze = var25_21 = 0L;
                    var1_1 = this.zzk;
                    var1_1.zzE(var9_8);
                    ** GOTO lbl50
                }
                var1_1 = this.zzk;
                var25_22 = var1_1.zze();
                {
                    this.zze = var9_8 -= var25_22;
lbl50:
                    // 2 sources

                    return;
                }
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh() {
        Object object = this.zzj;
        synchronized (object) {
            int n3;
            this.zzi = n3 = this.zzi + 1;
            return;
        }
    }
}

