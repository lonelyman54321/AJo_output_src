/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzcfw;
import com.google.android.gms.internal.ads.zzcfx;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzgge;
import java.io.IOException;
import java.lang.ref.Reference;

public final class zzcfy
extends zzcfp
implements zzcdu {
    public static final /* synthetic */ int zzd;
    private zzcdv zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcfh zzi;
    private long zzj;
    private long zzk;

    public zzcfy(zzcee zzcee2, zzced zzced2) {
        super(zzcee2);
        zzcee2 = zzcee2.getContext();
        zzcee zzcee3 = (zzcee)this.zzc.get();
        zzcgq zzcgq2 = new zzcgq((Context)zzcee2, zzced2, zzcee3, null);
        zzm.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcgq2;
        ((zzcdv)zzcgq2).zzL(this);
    }

    public static final String zzc(String string2) {
        string2 = String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(string2));
        return "cache:".concat(string2);
    }

    private static String zzd(String string2, Exception object) {
        String string3 = object.getClass().getCanonicalName();
        object = ((Throwable)object).getMessage();
        return KW.a(string2, "/", string3, ":", (String)object);
    }

    private final void zzx(long l2) {
        zzfuv zzfuv2 = zzt.zza;
        zzcfx zzcfx2 = new zzcfx(this);
        zzfuv2.postDelayed(zzcfx2, l2);
    }

    public final void release() {
        zzcdv zzcdv2 = this.zze;
        if (zzcdv2 != null) {
            zzcdv2.zzL(null);
            zzcdv2 = this.zze;
            zzcdv2.zzH();
        }
    }

    public final void zzD(int n3, int n4) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcdv zza() {
        synchronized (this) {
            boolean bl2;
            this.zzh = bl2 = true;
            this.notify();
        }
        this.zze.zzL(null);
        zzcdv zzcdv2 = this.zze;
        this.zze = null;
        return zzcdv2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzb() {
        block33: {
            block30: {
                var1_1 = this;
                var2_2 = "Timeout reached. Limit: ";
                var3_11 = this.zzf;
                var4_12 = zzcfy.zzc((String)var3_11);
                var5_13 = "error";
                var3_11 = zzbep.zzx;
                var6_14 = zzba.zzc();
                var3_11 = var6_14.zza((zzbeg)var3_11);
                var3_11 = (Long)var3_11;
                var7_15 = var3_11.longValue();
                var9_16 = 1000L;
                var7_15 *= var9_16;
                var11_17 = zzbep.zzw;
                var12_18 = zzba.zzc();
                var11_17 = var12_18.zza((zzbeg)var11_17);
                var11_17 = (Integer)var11_17;
                var13_19 = var11_17.intValue();
                var14_20 = var13_19;
                var11_17 = zzbep.zzbR;
                var12_18 = zzba.zzc();
                var11_17 = var12_18.zza((zzbeg)var11_17);
                var11_17 = (Boolean)var11_17;
                var13_19 = (int)var11_17.booleanValue();
                ** synchronized (this)
lbl-1000:
                // 1 sources

                {
                    var12_18 = zzu.zzB();
                    var16_21 = var12_18.currentTimeMillis();
                    var18_22 = this.zzj;
                    cfr_temp_0 = (var16_21 -= var18_22) - var7_15;
                    var20_23 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    if (var20_23 > 0) break block27;
                    var21_24 /* !! */  = this.zzg;
                    if (var21_24 /* !! */  != 0) break block28;
                    var21_24 /* !! */  = this.zzh;
                    if (var21_24 /* !! */  == 0) break block29;
                    // MONITOREXIT @DISABLED, blocks:[2, 12] lbl37 : MonitorExitStatement: MONITOREXIT : this
                    var11_17 = this;
                }
lbl39:
                // 4 sources

                while (true) {
                    var2_2 = zzu.zzy();
                    var3_11 = var11_17.zzi;
                    var2_2.zzc((zzcfh)var3_11);
                    return;
                }
                {
                    block27: {
                        block28: {
                            block34: {
                                block37: {
                                    block32: {
                                        block35: {
                                            block31: {
                                                block29: {
                                                    catch (Throwable var2_3) {
                                                        var22_25 = var4_12;
                                                        var11_17 = var1_1;
                                                        break block30;
                                                    }
                                                }
                                                var2_2 = this.zze;
                                                var21_24 /* !! */  = var2_2.zzV();
                                                if (var21_24 /* !! */  == 0) break block34;
                                                var2_2 = this.zze;
                                                var23_30 = var2_2.zzz();
                                                cfr_temp_1 = var23_30 - (var25_31 = 0L);
                                                var21_24 /* !! */  = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                if (var21_24 /* !! */  <= 0) ** GOTO lbl139
                                                var2_2 = this.zze;
                                                var18_22 = var2_2.zzv();
                                                cfr_temp_2 = var18_22 - (var27_32 = this.zzk);
                                                var29_33 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                                if (var29_33 /* !! */  == false) break block35;
                                                var21_24 /* !! */  = (int)(var18_22 == var25_31 ? 0 : (var18_22 < var25_31 ? -1 : 1));
                                                if (var21_24 /* !! */  > 0) {
                                                    var21_24 /* !! */  = 1;
                                                    var30_34 = true;
                                                } else {
                                                    var21_24 /* !! */  = 0;
                                                    var2_2 = null;
                                                    var30_34 = false;
                                                }
                                                var6_14 = var1_1.zzf;
                                                var27_32 = -1;
                                                if (var13_19 == 0) ** GOTO lbl77
                                                {
                                                    block36: {
                                                        var12_18 = var1_1.zze;
                                                        var31_35 = var16_21 = var12_18.zzA();
                                                        break block36;
lbl77:
                                                        // 1 sources

                                                        var31_35 = var27_32;
                                                    }
                                                    if (var13_19 != 0) {
                                                        var12_18 = var1_1.zze;
                                                        var33_36 = var16_21 = var12_18.zzx();
                                                    } else {
                                                        var33_36 = var27_32;
                                                    }
                                                    if (var13_19 == 0) break block31;
                                                    var2_2 = var1_1.zze;
                                                    var27_32 = var2_2.zzB();
                                                }
                                            }
                                            var21_24 /* !! */  = zzcdv.zzs();
                                            var35_37 = zzcdv.zzu();
                                            var3_11 = this;
                                            var11_17 = var4_12;
                                            var16_21 = var18_22;
                                            var18_22 = var23_30;
                                            var23_30 = var31_35;
                                            var31_35 = var14_20;
                                            var14_20 = var33_36;
                                            var36_38 = var4_12;
                                            this.zzo((String)var6_14, var4_12, var16_21, var18_22, var30_34, var23_30, var33_36, var27_32, var21_24 /* !! */ , var35_37);
                                            var11_17 = this;
                                            var27_32 = var16_21;
                                            try {
                                                this.zzk = var16_21;
                                                var16_21 = var18_22;
                                                break block32;
                                            }
                                            catch (Throwable var2_4) lbl-1000:
                                            // 3 sources

                                            {
                                                while (true) {
                                                    var22_25 = var36_38;
                                                    break block30;
                                                    break;
                                                }
                                            }
                                            catch (Throwable var2_6) {
                                                var11_17 = this;
                                                ** GOTO lbl-1000
                                            }
                                            catch (Throwable var2_7) {
                                                var36_38 = var4_12;
                                                var11_17 = var1_1;
                                                ** continue;
                                            }
                                        }
                                        var27_32 = var18_22;
                                        var31_35 = var14_20;
                                        var36_38 = var4_12;
                                        var11_17 = this;
                                        var16_21 = var23_30;
                                    }
                                    var29_33 /* !! */  = var27_32 == var16_21 ? 0 : (var27_32 < var16_21 ? -1 : 1);
                                    if (var29_33 /* !! */  < 0) ** GOTO lbl132
                                    var2_2 = var11_17.zzf;
                                    var22_25 = var36_38;
                                    var11_17.zzj((String)var2_2, var36_38, var16_21);
                                    ** GOTO lbl39
lbl132:
                                    // 1 sources

                                    var22_26 = var36_38;
                                    var6_14 = var11_17.zze;
                                    var16_21 = var6_14.zzw();
                                    cfr_temp_3 = var16_21 - var31_35;
                                    var29_33 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                    if (var29_33 /* !! */  < 0 || (var29_33 /* !! */  = var27_32 == var25_31 ? 0 : (var27_32 < var25_31 ? -1 : 1)) <= 0) break block37;
                                    ** GOTO lbl39
lbl139:
                                    // 1 sources

                                    var22_27 = var4_12;
                                    var11_17 = this;
                                }
                                // MONITOREXIT @DISABLED, blocks:[9, 12] lbl138 : MonitorExitStatement: MONITOREXIT : this
                                var2_2 = zzbep.zzy;
                                var27_32 = (Long)zzba.zzc().zza((zzbeg)var2_2);
                                super.zzx(var27_32);
                                return;
                            }
                            var22_25 = var4_12;
                            var11_17 = this;
                            var5_13 = "exoPlayerReleased";
                            try {
                                var3_11 = "ExoPlayer was released during preloading.";
                                var2_2 = new IOException((String)var3_11);
                                throw var2_2;
                            }
                            catch (Throwable var2_8) {}
                            break block30;
                        }
                        var22_28 = var4_12;
                        var11_17 = this;
                        var5_13 = "externalAbort";
                        var3_11 = "Abort requested before buffering finished. ";
                        var2_2 = new IOException((String)var3_11);
                        throw var2_2;
                    }
                    var22_29 = var4_12;
                    var11_17 = var1_1;
                    var5_13 = "downloadTimeout";
                    var37_39 = new StringBuilder((String)var2_2);
                    var37_39.append(var7_15);
                    var2_2 = " ms";
                    var37_39.append((String)var2_2);
                    var2_2 = var37_39.toString();
                    var12_18 = new IOException((String)var2_2);
                    throw var12_18;
                }
            }
            try {
                throw var2_5;
            }
            catch (Exception var2_9) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_11 = var5_13;
                    break block33;
                    break;
                }
            }
            catch (Exception var2_10) {
                var22_25 = var4_12;
                var11_17 = var1_1;
                ** continue;
            }
        }
        var6_14 = var11_17.zzf;
        var12_18 = var2_2.getMessage();
        var38_41 = "Failed to preload url ";
        var37_40 = new StringBuilder(var38_41);
        var37_40.append((String)var6_14);
        var37_40.append(" Exception: ");
        var37_40.append((String)var12_18);
        zzm.zzj(var37_40.toString());
        var12_18 = zzu.zzo();
        var12_18.zzv((Throwable)var2_2, "VideoStreamExoPlayerCache.preload");
        this.release();
        var2_2 = zzcfy.zzd(var5_13, (Exception)var2_2);
        var6_14 = var11_17.zzf;
        var11_17.zzg((String)var6_14, var22_25, var5_13, (String)var2_2);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf() {
        synchronized (this) {
            boolean bl2;
            this.zzg = bl2 = true;
            this.notify();
            this.release();
        }
        String string2 = this.zzf;
        if (string2 != null) {
            string2 = zzcfy.zzc(string2);
            String string3 = this.zzf;
            String string4 = "externalAbort";
            String string5 = "Programmatic precache abort.";
            this.zzg(string3, string2, string4, string5);
        }
    }

    public final void zzi(boolean bl2, long l2) {
        zzcee zzcee2 = (zzcee)this.zzc.get();
        if (zzcee2 != null) {
            zzgge zzgge2 = zzcci.zze;
            zzcfw zzcfw2 = new zzcfw(zzcee2, bl2, l2);
            zzgge2.execute(zzcfw2);
        }
    }

    public final void zzk(String string2, Exception exception) {
        zzm.zzk("Precache error", exception);
        zzu.zzo().zzv(exception, "VideoStreamExoPlayerCache.onError");
    }

    public final void zzl(String string2, Exception exception) {
        zzm.zzk("Precache exception", exception);
        zzu.zzo().zzv(exception, "VideoStreamExoPlayerCache.onException");
    }

    public final void zzm(int n3) {
    }

    public final void zzp(int n3) {
        this.zze.zzJ(n3);
    }

    public final void zzq(int n3) {
        this.zze.zzK(n3);
    }

    public final void zzr(int n3) {
        this.zze.zzM(n3);
    }

    public final void zzs(int n3) {
        this.zze.zzN(n3);
    }

    public final boolean zzt(String string2) {
        String[] stringArray = new String[]{string2};
        return this.zzu(string2, stringArray);
    }

    /*
     * Exception decompiling
     */
    public final boolean zzu(String var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 98->102)] java.lang.Exception
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

    public final void zzv() {
        zzm.zzj("Precache onRenderedFirstFrame");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzw(String string2, String[] object, zzcfh object2) {
        Exception exception2;
        block4: {
            long l2;
            String string3;
            Uri[] uriArray;
            this.zzf = string2;
            this.zzi = object2;
            object2 = zzcfy.zzc(string2);
            try {
                int n3;
                int n4 = ((String[])object).length;
                uriArray = new Uri[n4];
                string3 = null;
                for (int i3 = 0; i3 < (n3 = ((String[])object).length); ++i3) {
                    String string4 = object[i3];
                    string4 = Uri.parse((String)string4);
                    uriArray[i3] = string4;
                }
            }
            catch (Exception exception2) {
                break block4;
            }
            object = this.zze;
            string3 = this.zzb;
            ((zzcdv)object).zzF(uriArray, string3);
            object = this.zzc;
            object = ((Reference)object).get();
            object = (zzcee)object;
            if (object != null) {
                object.zzt((String)object2, this);
            }
            object = zzu.zzB();
            this.zzj = l2 = object.currentTimeMillis();
            this.zzk = l2 = (long)-1;
            l2 = 0L;
            this.zzx(l2);
            return true;
        }
        String string5 = exception2.getMessage();
        StringBuilder stringBuilder = new StringBuilder("Failed to preload url ");
        stringBuilder.append(string2);
        stringBuilder.append(" Exception: ");
        stringBuilder.append(string5);
        zzm.zzj(stringBuilder.toString());
        zzu.zzo().zzv(exception2, "VideoStreamExoPlayerCache.preload");
        this.release();
        string5 = "error";
        String string6 = zzcfy.zzd(string5, exception2);
        this.zzg(string2, (String)object2, string5, string6);
        return false;
    }
}

