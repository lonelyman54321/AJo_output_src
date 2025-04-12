/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzcl;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfyw;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzja;
import com.google.android.gms.internal.ads.zzje;
import com.google.android.gms.internal.ads.zzjf;
import com.google.android.gms.internal.ads.zzjh;
import com.google.android.gms.internal.ads.zzjs;
import com.google.android.gms.internal.ads.zzkx;
import com.google.android.gms.internal.ads.zzkz;
import com.google.android.gms.internal.ads.zzla;
import com.google.android.gms.internal.ads.zzlc;
import com.google.android.gms.internal.ads.zzle;
import com.google.android.gms.internal.ads.zzlf;
import com.google.android.gms.internal.ads.zzlg;
import com.google.android.gms.internal.ads.zzlk;
import com.google.android.gms.internal.ads.zzlq;
import com.google.android.gms.internal.ads.zzlr;
import com.google.android.gms.internal.ads.zzlt;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zzmf;
import com.google.android.gms.internal.ads.zzmg;
import com.google.android.gms.internal.ads.zzmh;
import com.google.android.gms.internal.ads.zzmi;
import com.google.android.gms.internal.ads.zzmj;
import com.google.android.gms.internal.ads.zzml;
import com.google.android.gms.internal.ads.zzmn;
import com.google.android.gms.internal.ads.zzmo;
import com.google.android.gms.internal.ads.zzmp;
import com.google.android.gms.internal.ads.zzmq;
import com.google.android.gms.internal.ads.zzmr;
import com.google.android.gms.internal.ads.zzmx;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxi;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzxv;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzl;
import com.google.android.gms.internal.ads.zzzm;
import com.google.android.gms.internal.ads.zzzn;
import com.google.android.gms.internal.ads.zzzu;
import com.google.android.gms.internal.ads.zzzv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

final class zzlh
implements Handler.Callback,
zzvl,
zzzl,
zzme,
zzje,
zzmh {
    private boolean zzA;
    private long zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private zzlg zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zzjh zzL;
    private long zzM;
    private final zzjs zzN;
    private final zzja zzO;
    private final zzmn[] zza;
    private final Set zzb;
    private final zzmp[] zzc;
    private final zzzm zzd;
    private final zzzn zze;
    private final zzlk zzf;
    private final zzzu zzg;
    private final zzfb zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzdb zzk;
    private final zzcz zzl;
    private final long zzm;
    private final zzjf zzn;
    private final ArrayList zzo;
    private final zzer zzp;
    private final zzlt zzq;
    private final zzmf zzr;
    private final long zzs;
    private final zzpj zzt;
    private zzmr zzu;
    private zzmg zzv;
    private zzlf zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    public zzlh(zzmn[] zzmnArray, zzzm zzzm2, zzzn zzzn2, zzlk zzlk2, zzzu zzzu2, int n3, boolean bl2, zzmx zzmx2, zzmr zzmr2, zzja zzja2, long l2, boolean bl3, Looper looper, zzer zzer2, zzjs zzjs2, zzpj zzpj2, Looper looper2) {
        zzlh zzlh2 = this;
        Object object = zzmnArray;
        Object object2 = zzzm2;
        Object object3 = zzlk2;
        zzzu zzzu3 = zzzu2;
        zzmx zzmx3 = zzmx2;
        zzer zzer3 = zzer2;
        zzpj zzpj3 = zzpj2;
        Object object4 = zzjs2;
        this.zzN = zzjs2;
        this.zza = zzmnArray;
        this.zzd = zzzm2;
        object4 = zzzn2;
        this.zze = zzzn2;
        this.zzf = zzlk2;
        this.zzg = zzzu2;
        this.zzD = 0;
        this.zzE = false;
        Object object5 = zzmr2;
        this.zzu = zzmr2;
        object5 = zzja2;
        this.zzO = zzja2;
        long l3 = l2;
        this.zzs = l2;
        this.zzy = false;
        this.zzp = zzer2;
        this.zzt = zzpj2;
        this.zzM = l3 = -9223372036854775807L;
        this.zzB = l3;
        this.zzm = l3 = zzlk2.zzb(zzpj2);
        zzlk2.zzg(zzpj2);
        this.zzv = object3 = zzmg.zzg(zzzn2);
        object4 = new zzlf((zzmg)object3);
        this.zzw = object4;
        int n4 = zzmnArray.length;
        n4 = 2;
        object4 = new zzmp[n4];
        this.zzc = object4;
        object4 = zzzm2.zze();
        for (int i3 = 0; i3 < n4; ++i3) {
            zzmp zzmp2;
            object[i3].zzu(i3, zzpj3, zzer3);
            object5 = zzlh2.zzc;
            object5[i3] = zzmp2 = object[i3].zzl();
            object5 = zzlh2.zzc[i3];
            object5.zzL((zzmo)object4);
        }
        super(this, zzer3);
        zzlh2.zzn = object;
        super();
        zzlh2.zzo = object;
        super();
        object = Collections.newSetFromMap(object);
        zzlh2.zzb = object;
        super();
        zzlh2.zzk = object;
        super();
        zzlh2.zzl = object;
        zzzm2.zzs(this, zzzu3);
        zzlh2.zzK = true;
        object2 = looper;
        object = zzer3.zzb(looper, null);
        object3 = new zzkz(this);
        zzlh2.zzq = object2 = new zzlt(zzmx3, (zzfb)object, (zzkz)object3);
        zzlh2.zzr = object2 = new zzmf(this, zzmx3, (zzfb)object, zzpj3);
        zzlh2.zzi = object = new HandlerThread("ExoPlayer:Playback", -16);
        object.start();
        object = object.getLooper();
        zzlh2.zzj = object;
        object = zzer3.zzb((Looper)object, this);
        zzlh2.zzh = object;
    }

    private final void zzA(zzmn zzmn2) {
        int n3;
        boolean bl2 = zzlh.zzaf(zzmn2);
        if (!bl2) {
            return;
        }
        this.zzn.zzd(zzmn2);
        zzlh.zzam(zzmn2);
        zzmn2.zzq();
        this.zzG = n3 = this.zzG + -1;
    }

    private final void zzB() {
        int cfr_ignored_0 = this.zza.length;
        zzlt zzlt2 = this.zzq;
        boolean[] blArray = new boolean[2];
        long l2 = zzlt2.zzf().zzf();
        this.zzC(blArray, l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void zzC(boolean[] var1_1, long var2_2) {
        var4_3 = this;
        var5_4 = this.zzq.zzf();
        var6_5 = var5_4.zzi();
        var7_6 = 0;
        while (true) {
            var8_7 = var4_3.zza;
            var9_8 = ((zzmn[])var8_7).length;
            var9_8 = 2;
            if (var7_6 >= var9_8) break;
            var9_8 = (int)var6_5.zzb(var7_6);
            if (var9_8 == 0 && (var9_8 = (int)(var8_7 = var4_3.zzb).remove(var10_9 = var4_3.zza[var7_6])) != 0) {
                var8_7 = var4_3.zza[var7_6];
                var8_7.zzI();
            }
            ++var7_6;
        }
        var7_6 = 0;
        while (true) {
            block6: {
                var10_9 = var4_3.zza;
                var11_10 = ((zzmn[])var10_9).length;
                var11_10 = 1;
                if (var7_6 >= var9_8) break;
                var12_11 = var6_5.zzb(var7_6);
                if (var12_11 == 0) break block6;
                var12_11 = var1_1[var7_6];
                var13_12 = var4_3.zza[var7_6];
                var14_13 = zzlh.zzaf(var13_12);
                if (var14_13 != 0) break block6;
                var15_14 = var4_3.zzq;
                var16_15 = var15_14.zzf();
                var17_16 = var16_15 == (var15_14 = var15_14.zze());
                var15_14 = var16_15.zzi();
                var18_17 = var15_14.zzb[var7_6];
                var15_14 = var15_14.zzc[var7_6];
                var19_18 /* !! */  = zzlh.zzak((zzzg)var15_14);
                var14_13 = this.zzai();
                if (var14_13 == 0) ** GOTO lbl-1000
                var15_14 = var4_3.zzv;
                var14_13 = var15_14.zze;
                var20_19 = 3;
                if (var14_13 == var20_19) {
                    var21_20 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var21_20 = false;
                }
                var22_21 = var12_11 == 0 && var21_20 != false;
                var4_3.zzG = var12_11 = var4_3.zzG + var11_10;
                var4_3.zzb.add(var13_12);
                var10_9 = var16_15.zzc[var7_6];
                var23_22 = var4_3.zzI;
                var25_23 = var16_15.zze();
                var27_24 = var16_15.zzf.zza;
                var15_14 = var13_12;
                var16_15 = var18_17;
                var18_17 = var19_18 /* !! */ ;
                var19_18 /* !! */  = var10_9;
                var13_12.zzr((zzmq)var16_15, var18_17, (zzxf)var10_9, var23_22, var22_21, var17_16, var2_2, var25_23, var27_24);
                var10_9 = new zzla(var4_3);
                var12_11 = 11;
                var13_12.zzt(var12_11, var10_9);
                var10_9 = var4_3.zzn;
                var10_9.zze(var13_12);
                if (var21_20 && var17_16) {
                    var13_12.zzO();
                }
            }
            ++var7_6;
        }
        var5_4.zzg = var11_10;
    }

    private final void zzD(IOException object, int n3) {
        zzlt zzlt2 = this.zzq;
        object = zzjh.zzc((IOException)object, n3);
        Object object2 = zzlt2.zze();
        if (object2 != null) {
            object2 = ((zzlq)object2).zzf.zza;
            object = ((zzjh)object).zza((zzvo)object2);
        }
        zzfk.zzd("ExoPlayerImplInternal", "Playback error", (Throwable)object);
        this.zzW(false, false);
        this.zzv = object = this.zzv.zzd((zzjh)object);
    }

    private final void zzE(boolean bl2) {
        zzvo zzvo2 = this.zzv.zzk;
        Object object = this.zzq.zzd();
        Object object2 = object == null ? this.zzv.zzb : ((zzlq)object).zzf.zza;
        boolean bl3 = zzvo2.equals(object2) ^ true;
        if (bl3) {
            zzmg zzmg2 = this.zzv;
            this.zzv = object2 = zzmg2.zza((zzvo)object2);
        }
        object2 = this.zzv;
        long l2 = object == null ? ((zzmg)object2).zzr : ((zzlq)object).zzc();
        ((zzmg)object2).zzp = l2;
        object2 = this.zzv;
        ((zzmg)object2).zzq = l2 = this.zzt();
        if ((bl3 || bl2) && object != null && (bl2 = ((zzlq)object).zzd)) {
            zzvo zzvo3 = ((zzlq)object).zzf.zza;
            object2 = ((zzlq)object).zzh();
            object = ((zzlq)object).zzi();
            this.zzZ(zzvo3, (zzxr)object2, (zzzn)object);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzF(zzdc var1_1, boolean var2_2) {
        block88: {
            block90: {
                block89: {
                    block87: {
                        block72: {
                            block86: {
                                block85: {
                                    block76: {
                                        block83: {
                                            block74: {
                                                block73: {
                                                    block71: {
                                                        block82: {
                                                            block70: {
                                                                block78: {
                                                                    block69: {
                                                                        block81: {
                                                                            block80: {
                                                                                block68: {
                                                                                    block79: {
                                                                                        block66: {
                                                                                            block67: {
                                                                                                block77: {
                                                                                                    var3_3 = this;
                                                                                                    var4_4 = var1_1;
                                                                                                    var5_5 = this.zzv;
                                                                                                    var6_12 = this.zzH;
                                                                                                    var7_13 = this.zzD;
                                                                                                    var8_14 = this.zzE;
                                                                                                    var9_15 = var1_1.zzo();
                                                                                                    var10_16 = 4;
                                                                                                    var11_17 = -9223372036854775807L;
                                                                                                    if (var9_15 == 0) break block77;
                                                                                                    var5_5 = zzmg.zzh();
                                                                                                    var13_18 /* !! */  = var5_5;
                                                                                                    var14_19 = var11_17;
                                                                                                    var16_20 = 0;
                                                                                                    var17_21 = 0.0f;
                                                                                                    var18_22 = null;
                                                                                                    var19_23 = 1;
                                                                                                    var20_24 = 1.4E-45f;
                                                                                                    var21_25 = 0;
                                                                                                    var22_26 = 0.0f;
                                                                                                    var23_27 = null;
                                                                                                    var10_16 = 1;
                                                                                                    var24_28 = 0L;
                                                                                                    var26_29 = 0L;
                                                                                                    var28_30 = 0.0;
                                                                                                    break block78;
                                                                                                }
                                                                                                var30_31 /* !! */  = this.zzl;
                                                                                                var31_32 /* !! */  = var5_5.zzb;
                                                                                                var32_33 = var31_32 /* !! */ .zza;
                                                                                                var33_34 = zzlh.zzah((zzmg)var5_5, (zzcz)var30_31 /* !! */ );
                                                                                                var18_22 = var5_5.zzb;
                                                                                                var16_20 = var18_22.zzb();
                                                                                                if (var16_20 == 0 && !var33_34) {
                                                                                                    var34_35 = var5_5.zzr;
lbl36:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        var36_36 = var34_35;
                                                                                                        var23_27 = var3_3.zzk;
                                                                                                        if (var6_12 == null) break block66;
                                                                                                        break block67;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var34_35 = var5_5.zzc;
                                                                                                ** while (true)
                                                                                            }
                                                                                            var17_21 = 1.4E-45f;
                                                                                            var38_37 = var32_33;
                                                                                            var32_33 = var1_1;
                                                                                            var39_38 = var31_32 /* !! */ ;
                                                                                            var31_32 /* !! */  = var6_12;
                                                                                            var40_39 = var30_31 /* !! */ ;
                                                                                            var41_40 = 1;
                                                                                            var16_20 = var8_14;
                                                                                            var42_41 = var38_37;
                                                                                            var38_37 = var23_27;
                                                                                            var43_42 = var23_27;
                                                                                            var23_27 = var30_31 /* !! */ ;
                                                                                            var32_33 = zzlh.zzy(var1_1, (zzlg)var6_12, (boolean)var41_40, var7_13, (boolean)var8_14, (zzdb)var38_37, (zzcz)var30_31 /* !! */ );
                                                                                            if (var32_33 == null) {
                                                                                                var21_25 = var9_15 = var4_4.zzg((boolean)var8_14);
                                                                                                var44_43 = var34_35;
                                                                                                var32_33 = var42_41;
                                                                                                var46_44 /* !! */  = 0;
                                                                                                var47_45 = 0.0f;
                                                                                                var31_32 /* !! */  = null;
                                                                                                var16_20 = 0;
                                                                                                var17_21 = 0.0f;
                                                                                                var18_22 = null;
                                                                                                var19_23 = 1;
                                                                                                var20_24 = 1.4E-45f;
                                                                                            } else {
                                                                                                var48_46 = var6_12.zzc;
                                                                                                cfr_temp_0 = var48_46 - var11_17;
                                                                                                var7_13 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                                                if (var7_13 == 0) {
                                                                                                    var32_33 = var32_33.first;
                                                                                                    var21_25 = var4_4.zzn((Object)var32_33, (zzcz)var30_31 /* !! */ ).zzd;
                                                                                                    var44_43 = var34_35;
                                                                                                    var32_33 = var42_41;
                                                                                                    var19_23 = 0;
                                                                                                    var20_24 = 0.0f;
                                                                                                    var38_37 = null;
                                                                                                } else {
                                                                                                    var31_32 /* !! */  = var32_33.first;
                                                                                                    var44_43 = (Long)var32_33.second;
                                                                                                    var32_33 = var31_32 /* !! */ ;
                                                                                                    var19_23 = 1;
                                                                                                    var20_24 = 1.4E-45f;
                                                                                                    var21_25 = -1;
                                                                                                    var22_26 = 0.0f / 0.0f;
                                                                                                }
                                                                                                var46_44 /* !! */  = var5_5.zze;
                                                                                                if (var46_44 /* !! */  == var10_16) {
                                                                                                    var46_44 /* !! */  = 1;
                                                                                                    var47_45 = 1.4E-45f;
                                                                                                } else {
                                                                                                    var46_44 /* !! */  = 0;
                                                                                                    var47_45 = 0.0f;
                                                                                                    var31_32 /* !! */  = null;
                                                                                                }
                                                                                                var16_20 = (int)var46_44 /* !! */ ;
                                                                                                var17_21 = var47_45;
                                                                                                var46_44 /* !! */  = var19_23;
                                                                                                var47_45 = var20_24;
                                                                                                var19_23 = 0;
                                                                                                var20_24 = 0.0f;
                                                                                                var38_37 = null;
                                                                                            }
                                                                                            var50_47 = var16_20;
                                                                                            var51_48 = var17_21;
                                                                                            var8_14 = var19_23;
                                                                                            var52_49 = var20_24;
                                                                                            var16_20 = var21_25;
                                                                                            var23_27 = var43_42;
                                                                                            var10_16 = -1;
                                                                                            var26_29 = 0L;
                                                                                            var28_30 = 0.0;
                                                                                            var53_50 = var46_44 /* !! */ ;
                                                                                            var54_51 = var47_45;
                                                                                            break block68;
                                                                                        }
                                                                                        var42_41 = var32_33;
                                                                                        var39_38 = var31_32 /* !! */ ;
                                                                                        var40_39 = var30_31 /* !! */ ;
                                                                                        var43_42 = var23_27;
                                                                                        var32_33 = var5_5.zza;
                                                                                        var9_15 = var32_33.zzo();
                                                                                        if (var9_15 != 0) {
                                                                                            var16_20 = var9_15 = var4_4.zzg((boolean)var8_14);
                                                                                            var44_43 = var34_35;
                                                                                            var32_33 = var42_41;
                                                                                            var50_47 = 0;
                                                                                            var51_48 = 0.0f;
                                                                                            var6_12 = null;
                                                                                            var8_14 = 0;
                                                                                            var52_49 = 0.0f;
                                                                                            var13_18 /* !! */  = null;
                                                                                            var10_16 = -1;
lbl134:
                                                                                            // 3 sources

                                                                                            while (true) {
                                                                                                var53_50 = 0;
                                                                                                var54_51 = 0.0f;
                                                                                                var43_42 = null;
                                                                                                var26_29 = 0L;
                                                                                                var28_30 = 0.0;
                                                                                                break block68;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var6_12 = var42_41;
                                                                                        var9_15 = var4_4.zza(var42_41);
                                                                                        var21_25 = -1;
                                                                                        var22_26 = 0.0f / 0.0f;
                                                                                        if (var9_15 != var21_25) break block79;
                                                                                        var38_37 = var5_5.zza;
                                                                                        var32_33 = var23_27;
                                                                                        var31_32 /* !! */  = var30_31 /* !! */ ;
                                                                                        var41_40 = var7_13;
                                                                                        var7_13 = var8_14;
                                                                                        var18_22 = var42_41;
                                                                                        var10_16 = -1;
                                                                                        var23_27 = var1_1;
                                                                                        var32_33 = zzlh.zzf(var43_42, (zzcz)var30_31 /* !! */ , var41_40, (boolean)var8_14, var42_41, (zzdc)var38_37, var1_1);
                                                                                        if (var32_33 == null) {
                                                                                            var9_15 = var4_4.zzg((boolean)var8_14);
                                                                                            var19_23 = 1;
                                                                                            var20_24 = 1.4E-45f;
                                                                                        } else {
                                                                                            var32_33 = var4_4.zzn(var32_33, (zzcz)var30_31 /* !! */ );
                                                                                            var9_15 = var32_33.zzd;
                                                                                            var19_23 = 0;
                                                                                            var20_24 = 0.0f;
                                                                                            var38_37 = null;
                                                                                        }
                                                                                        var16_20 = var9_15;
                                                                                        var8_14 = var19_23;
                                                                                        var52_49 = var20_24;
                                                                                        var32_33 = var6_12;
                                                                                        var23_27 = var43_42;
                                                                                        var44_43 = var36_36;
                                                                                        var50_47 = 0;
                                                                                        var51_48 = 0.0f;
                                                                                        var6_12 = null;
                                                                                        ** GOTO lbl134
                                                                                    }
                                                                                    var10_16 = -1;
                                                                                    var9_15 = (int)(var34_35 == var11_17 ? 0 : (var34_35 < var11_17 ? -1 : 1));
                                                                                    if (var9_15 == 0) {
                                                                                        var16_20 = var9_15 = var4_4.zzn((Object)var42_41, (zzcz)var30_31 /* !! */ ).zzd;
                                                                                        var32_33 = var42_41;
                                                                                        var44_43 = var34_35;
                                                                                        var50_47 = 0;
                                                                                        var51_48 = 0.0f;
                                                                                        var6_12 = null;
                                                                                        var8_14 = 0;
                                                                                        var52_49 = 0.0f;
                                                                                        var13_18 /* !! */  = null;
                                                                                        ** continue;
                                                                                    }
                                                                                    if (var33_34) {
                                                                                        var32_33 = var5_5.zza;
                                                                                        var31_32 /* !! */  = var31_32 /* !! */ .zza;
                                                                                        var32_33.zzn(var31_32 /* !! */ , (zzcz)var30_31 /* !! */ );
                                                                                        var32_33 = var5_5.zza;
                                                                                        var46_44 /* !! */  = var30_31 /* !! */ .zzd;
                                                                                        var55_52 = 0L;
                                                                                        var57_53 = 0.0;
                                                                                        var32_33 = var32_33.zze((int)var46_44 /* !! */ , (zzdb)var23_27, var55_52);
                                                                                        var9_15 = var32_33.zzp;
                                                                                        var31_32 /* !! */  = var5_5.zza;
                                                                                        var30_31 /* !! */  = var39_38.zza;
                                                                                        var46_44 /* !! */  = var31_32 /* !! */ .zza(var30_31 /* !! */ );
                                                                                        if (var9_15 == var46_44 /* !! */ ) {
                                                                                            var7_13 = var4_4.zzn((Object)var42_41, (zzcz)var40_39).zzd;
                                                                                            var32_33 = var1_1;
                                                                                            var31_32 /* !! */  = var23_27;
                                                                                            var30_31 /* !! */  = var40_39;
                                                                                            var26_29 = var55_52;
                                                                                            var28_30 = var57_53;
                                                                                            var55_52 = var34_35;
                                                                                            var32_33 = var1_1.zzl((zzdb)var23_27, (zzcz)var40_39, var7_13, var34_35);
                                                                                            var31_32 /* !! */  = var32_33.first;
                                                                                            var44_43 = (Long)var32_33.second;
                                                                                            var32_33 = var31_32 /* !! */ ;
                                                                                        } else {
                                                                                            var26_29 = var55_52;
                                                                                            var28_30 = var57_53;
                                                                                            var32_33 = var42_41;
                                                                                            var44_43 = var34_35;
                                                                                        }
                                                                                        var16_20 = -1;
                                                                                        var17_21 = 0.0f / 0.0f;
                                                                                        var50_47 = 0;
                                                                                        var51_48 = 0.0f;
                                                                                        var6_12 = null;
                                                                                        var8_14 = 0;
                                                                                        var52_49 = 0.0f;
                                                                                        var13_18 /* !! */  = null;
                                                                                        var53_50 = 1;
                                                                                        var54_51 = 1.4E-45f;
                                                                                    } else {
                                                                                        var26_29 = 0L;
                                                                                        var28_30 = 0.0;
                                                                                        var32_33 = var42_41;
                                                                                        var44_43 = var34_35;
                                                                                        var16_20 = -1;
                                                                                        var17_21 = 0.0f / 0.0f;
                                                                                        var50_47 = 0;
                                                                                        var51_48 = 0.0f;
                                                                                        var6_12 = null;
                                                                                        var8_14 = 0;
                                                                                        var52_49 = 0.0f;
                                                                                        var13_18 /* !! */  = null;
                                                                                        var53_50 = 0;
                                                                                        var54_51 = 0.0f;
                                                                                        var43_42 = null;
                                                                                    }
                                                                                }
                                                                                if (var16_20 != var10_16) {
                                                                                    var59_54 = -9223372036854775807L;
                                                                                    var61_55 = -4.9E-324;
                                                                                    var32_33 = var1_1;
                                                                                    var31_32 /* !! */  = var23_27;
                                                                                    var30_31 /* !! */  = var40_39;
                                                                                    var7_13 = var16_20;
                                                                                    var55_52 = var59_54;
                                                                                    var57_53 = var61_55;
                                                                                    var32_33 = var1_1.zzl((zzdb)var23_27, (zzcz)var40_39, var16_20, var59_54);
                                                                                    var31_32 /* !! */  = var32_33.first;
                                                                                    var44_43 = (Long)var32_33.second;
                                                                                    var32_33 = var31_32 /* !! */ ;
                                                                                    var55_52 = var44_43;
                                                                                    var44_43 = var11_17;
                                                                                } else {
                                                                                    var55_52 = var44_43;
                                                                                }
                                                                                var31_32 /* !! */  = var3_3.zzq.zzi(var4_4, var32_33, var55_52);
                                                                                var21_25 = var31_32 /* !! */ .zze;
                                                                                if (var21_25 == var10_16 || (var63_56 = var39_38.zze) != var10_16 && var21_25 >= var63_56) {
                                                                                    var21_25 = 1;
                                                                                    var22_26 = 1.4E-45f;
                                                                                } else {
                                                                                    var21_25 = 0;
                                                                                    var22_26 = 0.0f;
                                                                                    var23_27 = null;
                                                                                }
                                                                                var64_57 = var39_38.zza;
                                                                                var63_56 = (int)var64_57.equals(var32_33);
                                                                                if (var63_56 != 0 && (var63_56 = (int)var39_38.zzb()) == 0 && (var63_56 = (int)var31_32 /* !! */ .zzb()) == 0 && var21_25 != 0) {
                                                                                    var21_25 = 1;
                                                                                    var22_26 = 1.4E-45f;
                                                                                } else {
                                                                                    var21_25 = 0;
                                                                                    var22_26 = 0.0f;
                                                                                    var23_27 = null;
                                                                                }
                                                                                var32_33 = var4_4.zzn(var32_33, (zzcz)var40_39);
                                                                                if (!var33_34 && (var63_56 = (int)(var36_36 == var44_43 ? 0 : (var36_36 < var44_43 ? -1 : 1))) == 0 && (var10_16 = (int)(var64_57 = var39_38.zza).equals(var65_58 /* !! */  = var31_32 /* !! */ .zza)) != 0) break block80;
lbl284:
                                                                                // 3 sources

                                                                                while ((var10_16 = 1) != var21_25) {
                                                                                    break block69;
                                                                                }
                                                                                break block81;
                                                                            }
                                                                            var10_16 = (int)var39_38.zzb();
                                                                            if (var10_16 != 0) {
                                                                                var10_16 = var39_38.zzb;
                                                                                var32_33.zzn(var10_16);
                                                                            }
                                                                            if ((var10_16 = (int)var31_32 /* !! */ .zzb()) == 0) ** GOTO lbl284
                                                                            var10_16 = var31_32 /* !! */ .zzb;
                                                                            var32_33.zzn(var10_16);
                                                                            ** GOTO lbl284
                                                                        }
                                                                        var31_32 /* !! */  = var39_38;
                                                                    }
                                                                    if ((var9_15 = (int)var31_32 /* !! */ .zzb()) != 0) {
                                                                        var9_15 = (int)var31_32 /* !! */ .equals(var39_38);
                                                                        if (var9_15 != 0) {
                                                                            var55_52 = var5_5.zzr;
                                                                        } else {
                                                                            var5_5 = var31_32 /* !! */ .zza;
                                                                            var4_4.zzn(var5_5, (zzcz)var40_39);
                                                                            var66_59 = var31_32 /* !! */ .zzc;
                                                                            var9_15 = var31_32 /* !! */ .zzb;
                                                                            var9_15 = var40_39.zze(var9_15);
                                                                            if (var66_59 == var9_15) {
                                                                                var40_39.zzj();
                                                                            }
                                                                            var55_52 = var26_29;
                                                                            var57_53 = var28_30;
                                                                        }
                                                                    }
                                                                    var24_28 = var55_52;
                                                                    var16_20 = var50_47;
                                                                    var17_21 = var51_48;
                                                                    var19_23 = var8_14;
                                                                    var20_24 = var52_49;
                                                                    var21_25 = var53_50;
                                                                    var22_26 = var54_51;
                                                                    var13_18 /* !! */  = var31_32 /* !! */ ;
                                                                    var14_19 = var44_43;
                                                                }
                                                                var5_5 = var3_3.zzv.zzb;
                                                                var66_59 = var5_5.equals(var13_18 /* !! */ );
                                                                if (var66_59 == 0) ** GOTO lbl-1000
                                                                var5_5 = var3_3.zzv;
                                                                var67_60 = var5_5.zzr;
                                                                cfr_temp_1 = var24_28 - var67_60;
                                                                var46_44 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                                if (var46_44 /* !! */  != false) lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    var63_56 = 1;
                                                                } else {
                                                                    var63_56 = 0;
                                                                    var64_57 = null;
                                                                }
                                                                var69_61 = 3;
                                                                if (var19_23 == 0) break block82;
                                                                var5_5 = var3_3.zzv;
                                                                var66_59 = var5_5.zze;
                                                                if (var66_59 == var10_16) break block70;
                                                                var19_23 = 4;
                                                                var20_24 = 5.6E-45f;
                                                                {
                                                                    catch (Throwable var5_8) {
                                                                        var41_40 = 0;
                                                                        var30_31 /* !! */  = null;
                                                                        var19_23 = 4;
                                                                        var20_24 = 5.6E-45f;
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                    ** try [egrp 1[TRYBLOCK] [2 : 1706->1854)] { 
lbl355:
                                                                    // 1 sources

                                                                    var3_3.zzU(var19_23);
lbl356:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var41_40 = 0;
                                                                        var30_31 /* !! */  = null;
                                                                        var3_3.zzM(false, false, false, (boolean)var10_16);
                                                                        break block71;
                                                                        break;
                                                                    }
                                                                }
lbl361:
                                                                // 1 sources

                                                                catch (Throwable var5_6) lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    var46_44 /* !! */  = var21_25;
                                                                    var47_45 = var22_26;
lbl364:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var50_47 = 0;
                                                                        var51_48 = 0.0f;
                                                                        var6_12 = null;
                                                                        var10_16 = 0;
                                                                        var65_58 /* !! */  = null;
                                                                        var70_62 = 4;
                                                                        break block72;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            var19_23 = 4;
                                                            var20_24 = 5.6E-45f;
                                                            ** while (true)
                                                        }
                                                        var41_40 = 0;
                                                        var30_31 /* !! */  = null;
                                                        var19_23 = 4;
                                                        var20_24 = 5.6E-45f;
                                                    }
                                                    var5_5 = var3_3.zza;
                                                    var9_15 = ((zzmn[])var5_5).length;
                                                    var9_15 = 0;
                                                    var32_33 = null;
                                                    while (true) {
                                                        var46_44 /* !! */  = 2;
                                                        var47_45 = 2.8E-45f;
                                                        if (var9_15 >= var46_44 /* !! */ ) break;
                                                        var31_32 /* !! */  = var5_5[var9_15];
                                                        var31_32 /* !! */ .zzN(var4_4);
                                                        ++var9_15;
                                                    }
                                                    if (var63_56 != 0) break block83;
                                                    try {
                                                        var32_33 = var3_3.zzq;
                                                        var71_67 = var3_3.zzI;
                                                        var5_5 = var32_33.zzf();
                                                        if (var5_5 == null) {
                                                            var73_65 = var21_25;
                                                            var74_66 = var22_26;
                                                            var75_68 = var26_29;
                                                            break block73;
                                                        }
                                                        var36_36 = var5_5.zze();
                                                        var41_40 = var5_5.zzd;
                                                        var73_65 = var21_25;
                                                        var74_66 = var22_26;
                                                        if (var41_40 == 0) break block74;
                                                        var34_35 = var36_36;
                                                        var41_40 = 0;
                                                        var30_31 /* !! */  = null;
                                                    }
                                                    catch (Throwable var5_11) {
                                                        var73_65 = var21_25;
                                                        var74_66 = var22_26;
                                                        var10_16 = 0;
                                                        var65_58 /* !! */  = null;
                                                        var70_63 = 4;
                                                        ** continue;
                                                    }
                                                    while (true) {
                                                        block75: {
                                                            try {
                                                                block84: {
                                                                    var6_12 = var3_3.zza;
                                                                    var10_16 = ((Pair)var6_12).length;
                                                                    if (var41_40 >= var46_44 /* !! */ ) break;
                                                                    var50_47 = (int)zzlh.zzaf((zzmn)(var6_12 = var6_12[var41_40]));
                                                                    if (var50_47 == 0) break block84;
                                                                    var6_12 = var3_3.zza;
                                                                    var6_12 = var6_12[var41_40];
                                                                    var6_12 = var6_12.zzo();
                                                                    var65_58 /* !! */  = var5_5.zzc;
                                                                    if (var6_12 == (var65_58 /* !! */  = var65_58 /* !! */ [var41_40])) ** GOTO lbl-1000
                                                                }
                                                                var70_62 = var41_40;
                                                                break block75;
                                                            }
                                                            catch (Throwable var5_9) {
                                                                var46_44 /* !! */  = var73_65;
                                                                var47_45 = var74_66;
                                                                ** continue;
                                                            }
lbl-1000:
                                                            // 1 sources

                                                            {
                                                                var6_12 = var3_3.zza;
                                                                var6_12 = var6_12[var41_40];
                                                                var70_62 = var41_40;
                                                                var48_46 = var6_12.zzcW();
                                                                cfr_temp_2 = var48_46 - (var75_68 = -9223372036854775808L);
                                                                var50_47 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                                                if (var50_47 == 0) break block73;
                                                                var34_35 = var48_46 = Math.max(var48_46, var34_35);
                                                            }
                                                        }
                                                        var41_40 = var70_62 + 1;
                                                        var46_44 /* !! */  = 2;
                                                        var47_45 = 2.8E-45f;
                                                        var10_16 = 1;
                                                    }
                                                    var75_68 = var34_35;
                                                }
lbl448:
                                                // 2 sources

                                                while (true) {
                                                    var31_32 /* !! */  = var1_1;
                                                    var10_16 = 0;
                                                    var65_58 /* !! */  = null;
                                                    var44_43 = var71_67;
                                                    var70_62 = 4;
                                                    var55_52 = var75_68;
                                                    try {
                                                        var66_59 = (int)var32_33.zzp(var1_1, var71_67, var75_68);
                                                        if (var66_59 == 0) {
                                                            var3_3.zzR(false);
                                                        }
                                                        break block76;
                                                    }
                                                    catch (Throwable var5_10) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        while (true) {
                                                            var46_44 /* !! */  = var73_65;
                                                            var47_45 = var74_66;
                                                            var50_47 = 0;
                                                            var51_48 = 0.0f;
                                                            var6_12 = null;
                                                            var10_16 = 0;
                                                            var65_58 /* !! */  = null;
                                                            break block72;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            var75_68 = var36_36;
                                            ** while (true)
                                        }
                                        var73_65 = var21_25;
                                        var74_66 = var22_26;
                                        var10_16 = 0;
                                        var65_58 /* !! */  = null;
                                        var70_64 = 4;
                                        var66_59 = (int)var1_1.zzo();
                                        if (var66_59 == 0) {
                                            var5_5 = var3_3.zzq;
                                            for (var5_5 = var5_5.zze(); var5_5 != null; var5_5 = var5_5.zzg()) {
                                                var32_33 = var5_5.zzf;
                                                var32_33 = var32_33.zza;
                                                var9_15 = (int)var32_33.equals(var13_18 /* !! */ );
                                                if (var9_15 == 0) continue;
                                                var32_33 = var3_3.zzq;
                                                var31_32 /* !! */  = var5_5.zzf;
                                                var32_33 = var32_33.zzh(var4_4, (zzlr)var31_32 /* !! */ );
                                                var5_5.zzf = var32_33;
                                                var5_5.zzq();
                                            }
                                            var24_28 = var67_60 = var3_3.zzv((zzvo)var13_18 /* !! */ , var24_28, (boolean)var16_20);
                                        }
                                    }
                                    var5_5 = var3_3.zzv;
                                    var77_69 = var5_5.zza;
                                    var18_22 = var5_5.zzb;
                                    var46_44 /* !! */  = var73_65;
                                    var47_45 = var74_66;
                                    var9_15 = 1;
                                    var34_35 = var9_15 != var73_65 ? -9223372036854775807L : var24_28;
                                    var50_47 = 0;
                                    var51_48 = 0.0f;
                                    var6_12 = null;
                                    var32_33 = this;
                                    var31_32 /* !! */  = var1_1;
                                    var30_31 /* !! */  = var13_18 /* !! */ ;
                                    this.zzab(var1_1, (zzvo)var13_18 /* !! */ , var77_69, (zzvo)var18_22, var34_35, false);
                                    if (var63_56 != 0) break block85;
                                    var5_5 = var3_3.zzv;
                                    var67_60 = var5_5.zzc;
                                    cfr_temp_3 = var14_19 - var67_60;
                                    var46_44 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                    if (var46_44 /* !! */  != false) break block85;
                                    var39_38 = null;
                                    break block86;
                                }
                                var5_5 = var3_3.zzv;
                                var32_33 = var5_5.zzb.zza;
                                var5_5 = var5_5.zza;
                                if (var63_56 == 0 || !var2_2 || (var46_44 /* !! */  = (long)var5_5.zzo()) != false) ** GOTO lbl-1000
                                var31_32 /* !! */  = var3_3.zzl;
                                var5_5 = var5_5.zzn(var32_33, (zzcz)var31_32 /* !! */ );
                                var66_59 = (int)var5_5.zzg;
                                if (var66_59 == 0) {
                                    var78_71 = 1;
                                    var79_72 = 1.4E-45f;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var78_71 = 0;
                                    var79_72 = 0.0f;
                                }
                                var5_5 = var3_3.zzv;
                                var80_73 = var5_5.zzd;
                                var66_59 = var4_4.zza(var32_33);
                                var9_15 = -1;
                                if (var66_59 == var9_15) {
                                    var69_61 = 4;
                                }
                                var32_33 = this;
                                var31_32 /* !! */  = var13_18 /* !! */ ;
                                var44_43 = var24_28;
                                var55_52 = var14_19;
                                var8_14 = var78_71;
                                var52_49 = var79_72;
                                var39_38 = null;
                                var10_16 = var69_61;
                                var3_3.zzv = var5_5 = this.zzz((zzvo)var13_18 /* !! */ , var24_28, var14_19, var80_73, (boolean)var78_71, var69_61);
                            }
                            this.zzN();
                            var5_5 = var3_3.zzv.zza;
                            var3_3.zzP(var4_4, (zzdc)var5_5);
                            var3_3.zzv = var5_5 = var3_3.zzv.zzf(var4_4);
                            var66_59 = (int)var1_1.zzo();
                            if (var66_59 == 0) {
                                var10_16 = 0;
                                var65_58 /* !! */  = null;
                                var3_3.zzH = null;
                            }
                            var3_3.zzE(false);
                            return;
                        }
                        var32_33 = var3_3.zzv;
                        var77_70 = var32_33.zza;
                        var18_22 = var32_33.zzb;
                        var19_23 = 1;
                        var20_24 = 1.4E-45f;
                        if (var19_23 != var46_44 /* !! */ ) {
                            var59_54 = -9223372036854775807L;
                            var61_55 = -4.9E-324;
                        } else {
                            var59_54 = var24_28;
                        }
                        var73_65 = 0;
                        var74_66 = 0.0f;
                        var32_33 = this;
                        var31_32 /* !! */  = var1_1;
                        var30_31 /* !! */  = var13_18 /* !! */ ;
                        var82_75 = 1;
                        var83_76 = 1.4E-45f;
                        var34_35 = var59_54;
                        var50_47 = 0;
                        var6_12 = null;
                        var51_48 = 0.0f;
                        this.zzab(var1_1, (zzvo)var13_18 /* !! */ , var77_70, (zzvo)var18_22, var59_54, false);
                        if (var63_56 != 0) break block87;
                        var32_33 = var3_3.zzv;
                        var84_77 = var32_33.zzc;
                        cfr_temp_4 = var14_19 - var84_77;
                        var41_40 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                        if (var41_40 != 0) break block87;
                        var39_38 = null;
                        break block88;
                    }
                    var32_33 = var3_3.zzv;
                    var31_32 /* !! */  = var32_33.zzb.zza;
                    var32_33 = var32_33.zza;
                    if (var63_56 == 0 || !var2_2 || (var41_40 = (int)var32_33.zzo()) != 0) break block89;
                    var30_31 /* !! */  = var3_3.zzl;
                    var32_33 = var32_33.zzn(var31_32 /* !! */ , (zzcz)var30_31 /* !! */ );
                    var9_15 = (int)var32_33.zzg;
                    if (var9_15 == 0) break block90;
                }
                var82_75 = 0;
                var83_76 = 0.0f;
            }
            var32_33 = var3_3.zzv;
            var80_74 = var32_33.zzd;
            var9_15 = var4_4.zza(var31_32 /* !! */ );
            var46_44 /* !! */  = -1;
            var47_45 = 0.0f / 0.0f;
            if (var9_15 == var46_44 /* !! */ ) {
                var69_61 = 4;
            }
            var32_33 = this;
            var31_32 /* !! */  = var13_18 /* !! */ ;
            var44_43 = var24_28;
            var55_52 = var14_19;
            var8_14 = var82_75;
            var52_49 = var83_76;
            var39_38 = null;
            var10_16 = var69_61;
            var3_3.zzv = var32_33 = this.zzz((zzvo)var13_18 /* !! */ , var24_28, var14_19, var80_74, (boolean)var82_75, var69_61);
        }
        this.zzN();
        var32_33 = var3_3.zzv.zza;
        var3_3.zzP(var4_4, (zzdc)var32_33);
        var32_33 = var3_3.zzv.zzf(var4_4);
        var3_3.zzv = var32_33;
        var9_15 = (int)var1_1.zzo();
        if (var9_15 == 0) {
            var3_3.zzH = null;
        }
        var3_3.zzE(false);
        throw var5_7;
    }

    private final void zzG(zzcl zzcl2, boolean bl2) {
        float f5 = zzcl2.zzc;
        this.zzH(zzcl2, f5, true, bl2);
    }

    private final void zzH(zzcl zzcl2, float f5, boolean bl2, boolean bl3) {
        Object object;
        zzvo zzvo2;
        int n3;
        Object object2;
        Object object3 = this;
        Object object4 = zzcl2;
        if (bl2) {
            if (bl3) {
                object2 = this.zzw;
                n3 = 1;
                object2.zza(n3);
            }
            zzmg zzmg2 = ((zzlh)object3).zzv;
            object2 = zzmg2.zza;
            zzvo2 = zzmg2.zzb;
            long l2 = zzmg2.zzc;
            long l3 = zzmg2.zzd;
            int n4 = zzmg2.zze;
            zzjh zzjh2 = zzmg2.zzf;
            boolean bl4 = zzmg2.zzg;
            zzxr zzxr2 = zzmg2.zzh;
            zzzn zzzn2 = zzmg2.zzi;
            List list = zzmg2.zzj;
            zzvo zzvo3 = zzmg2.zzk;
            int n7 = zzmg2.zzl;
            object3 = zzmg2;
            boolean bl5 = n7;
            n7 = zzmg2.zzm;
            long l4 = zzmg2.zzp;
            long l7 = zzmg2.zzq;
            long l8 = zzmg2.zzr;
            long l12 = zzmg2.zzs;
            object4 = new zzmg((zzdc)object2, zzvo2, l2, l3, n4, zzjh2, bl4, zzxr2, zzzn2, list, zzvo3, bl5, n7, zzcl2, l4, l7, l8, l12, false);
            object3 = this;
            this.zzv = object4;
        }
        object4 = zzcl2;
        float cfr_ignored_0 = zzcl2.zzc;
        object2 = ((zzlh)object3).zzq.zze();
        while (true) {
            zzvo2 = null;
            if (object2 == null) break;
            object = object2.zzi().zzc;
            int n8 = ((zzzg[])object).length;
            for (n3 = 0; n3 < n8; ++n3) {
                zzzg cfr_ignored_1 = object[n3];
            }
            object2 = object2.zzg();
        }
        object2 = ((zzlh)object3).zza;
        int n10 = ((zzmn[])object2).length;
        while (n3 < (n10 = 2)) {
            object = object2[n3];
            if (object != null) {
                float f6 = ((zzcl)object4).zzc;
                object.zzM(f5, f6);
            }
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzI() {
        long l2;
        long l3;
        Object object;
        boolean bl2 = this.zzae();
        boolean bl3 = false;
        Object object2 = null;
        if (bl2) {
            long l4;
            long l7;
            long l8;
            long l12;
            long l14;
            Object object3;
            long l15;
            long l16;
            object = this.zzq.zzd();
            l3 = ((zzlq)object).zzd();
            l3 = this.zzu(l3);
            Object object4 = this.zzq.zze();
            if (object == object4) {
                l16 = this.zzI;
                l15 = ((zzlq)object).zze();
            } else {
                l16 = this.zzI;
                l15 = ((zzlq)object).zze();
                l16 -= l15;
                object3 = ((zzlq)object).zzf;
                l15 = ((zzlr)object3).zzb;
            }
            l16 -= l15;
            object4 = this.zzf;
            zzpj zzpj2 = this.zzt;
            object3 = this.zzv.zza;
            zzvo zzvo2 = ((zzlq)object).zzf.zza;
            zzcl zzcl2 = this.zzn.zzc();
            float f5 = zzcl2.zzc;
            boolean bl4 = object4.zzh(zzpj2, (zzdc)object3, zzvo2, l16, l3, f5);
            if (!bl4 && (l14 = (l12 = l3 - (l2 = 500000L)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) < 0 && (l8 = (l7 = (l2 = this.zzm) - (l4 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0) {
                object4 = this.zzq.zze().zza;
                l2 = this.zzv.zzr;
                object4.zzj(l2, false);
                object4 = this.zzf;
                zzpj2 = this.zzt;
                object2 = this.zzv;
                object3 = ((zzmg)object2).zza;
                zzvo2 = ((zzlq)object).zzf.zza;
                object = this.zzn.zzc();
                f5 = ((zzcl)object).zzc;
                bl3 = object4.zzh(zzpj2, (zzdc)object3, zzvo2, l16, l3, f5);
            } else {
                bl3 = bl4;
            }
        }
        this.zzC = bl3;
        if (bl3) {
            object2 = this.zzq.zzd();
            l3 = this.zzI;
            object = this.zzn.zzc();
            float f6 = ((zzcl)object).zzc;
            l2 = this.zzB;
            ((zzlq)object2).zzk(l3, f6, l2);
        }
        this.zzY();
    }

    private final void zzJ() {
        Object object = this.zzw;
        Object object2 = this.zzv;
        ((zzlf)object).zzc((zzmg)object2);
        object = this.zzw;
        boolean bl2 = zzlf.zze((zzlf)object);
        if (bl2) {
            object = this.zzN;
            object2 = this.zzw;
            ((zzjs)object).zza.zzT((zzlf)object2);
            object2 = this.zzv;
            this.zzw = object = new zzlf((zzmg)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzK() {
        int n3;
        int n4;
        int n7;
        int n8;
        Object object;
        int n10;
        Object object2;
        Object object3;
        boolean bl2;
        Object object4;
        Object object5;
        Object object6;
        float f5;
        Object object7;
        zzlh zzlh2;
        block14: {
            zzlh2 = this;
            object7 = this.zzn.zzc();
            f5 = ((zzcl)object7).zzc;
            object6 = this.zzq;
            object5 = ((zzlt)object6).zze();
            object6 = ((zzlt)object6).zzf();
            object4 = null;
            bl2 = true;
            while (object5 != null) {
                int n14;
                boolean bl3 = ((zzlq)object5).zzd;
                if (!bl3) {
                    return;
                }
                object3 = zzlh2.zzv.zza;
                object3 = ((zzlq)object5).zzj(f5, (zzdc)object3);
                zzzg[] zzzgArray = zzlh2.zzq.zze();
                object2 = object5 == zzzgArray ? object3 : object4;
                object4 = ((zzlq)object5).zzi();
                n10 = 0;
                if (object4 == null || (n14 = ((zzzg[])(object = ((zzzn)object4).zzc)).length) != (n8 = (zzzgArray = ((zzzn)object3).zzc).length)) break block14;
                zzzgArray = null;
                for (n8 = 0; n8 < (n14 = ((zzzg[])(object = ((zzzn)object3).zzc)).length); ++n8) {
                    n14 = (int)(((zzzn)object3).zza((zzzn)object4, n8) ? 1 : 0);
                    if (n14 != 0) {
                        continue;
                    }
                    break block14;
                }
                if (object5 != object6) {
                    n10 = 1;
                }
                bl2 &= n10;
                object5 = ((zzlq)object5).zzg();
                object4 = object2;
            }
            return;
        }
        int n15 = 4;
        n8 = 2;
        if (!bl2) {
            n7 = 2;
            object7 = zzlh2.zzq;
            ((zzlt)object7).zzn((zzlq)object5);
            n4 = ((zzlq)object5).zzd;
            if (n4 != 0) {
                object7 = ((zzlq)object5).zzf;
                long l2 = ((zzlr)object7).zzb;
                long l3 = zzlh2.zzI;
                long l4 = ((zzlq)object5).zze();
                l2 = Math.max(l2, l3 -= l4);
                object4 = null;
                ((zzlq)object5).zza((zzzn)object3, l2, false);
            }
        } else {
            long l7;
            long l8;
            long l12;
            object7 = zzlh2.zzq;
            object = ((zzlt)object7).zze();
            boolean bl4 = ((zzlt)object7).zzn((zzlq)object);
            n4 = zzlh2.zza.length;
            boolean[] blArray = new boolean[n8];
            object2.getClass();
            long l14 = zzlh2.zzv.zzr;
            long l15 = ((zzlq)object).zzb((zzzn)object2, l14, bl4, blArray);
            object7 = zzlh2.zzv;
            n3 = ((zzmg)object7).zze;
            int n16 = n3 != n15 && (l12 = (l8 = l15 - (l7 = ((zzmg)object7).zzr)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false ? 1 : 0;
            object7 = zzlh2.zzv;
            object6 = ((zzmg)object7).zzb;
            long l16 = ((zzmg)object7).zzc;
            long l17 = ((zzmg)object7).zzd;
            int n17 = 5;
            object7 = this;
            long l18 = l16;
            l16 = l15;
            boolean[] blArray2 = blArray;
            Object object8 = object;
            n7 = 2;
            n15 = n16;
            n10 = n17;
            zzlh2.zzv = object7 = this.zzz((zzvo)object6, l15, l18, l17, n16 != 0, n17);
            if (n16 != 0) {
                zzlh2.zzO(l15);
            }
            n4 = zzlh2.zza.length;
            object7 = new boolean[n7];
            n10 = 0;
            while (true) {
                object6 = zzlh2.zza;
                l12 = ((zzmn[])object6).length;
                if (n10 >= n7) break;
                object6 = object6[n10];
                l12 = (long)zzlh.zzaf((zzmn)object6);
                object7[n10] = l12;
                object4 = ((zzlq)object8).zzc[n10];
                if (l12 != false) {
                    object5 = object6.zzo();
                    if (object4 != object5) {
                        zzlh2.zzA((zzmn)object6);
                    } else {
                        l12 = blArray2[n10];
                        if (l12 != false) {
                            l16 = zzlh2.zzI;
                            object6.zzJ(l16);
                        }
                    }
                }
                ++n10;
            }
            long l19 = zzlh2.zzI;
            zzlh2.zzC((boolean[])object7, l19);
        }
        n4 = 1;
        f5 = Float.MIN_VALUE;
        zzlh2.zzE(n4 != 0);
        object7 = zzlh2.zzv;
        n4 = ((zzmg)object7).zze;
        n3 = 4;
        if (n4 == n3) return;
        this.zzI();
        this.zzaa();
        object7 = zzlh2.zzh;
        object7.zzi(n7);
    }

    private final void zzL() {
        this.zzK();
        this.zzR(true);
    }

    /*
     * Unable to fully structure code
     */
    private final void zzM(boolean var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        var5_5 = this;
        var6_6 = this.zzh;
        var7_9 = 2;
        var6_6.zzf(var7_9);
        var8_10 = 0;
        var9_11 = null;
        this.zzL = null;
        var10_12 = 0;
        var11_13 = null;
        var12_14 = true;
        this.zzac(false, var12_14);
        var6_6 = this.zzn;
        var6_6.zzi();
        this.zzI = var13_15 = 1000000000000L;
        var15_16 = this.zza;
        var16_17 = ((zzmn[])var15_16).length;
        var17_18 = 0;
        var18_19 = null;
        while (true) {
            block23: {
                var19_20 = "ExoPlayerImplInternal";
                if (var17_18 >= var7_9) break;
                var6_6 = var15_16[var17_18];
                try {
                    var5_5.zzA((zzmn)var6_6);
                    break block23;
                }
                catch (RuntimeException var6_7) {
                }
                catch (zzjh var6_8) {
                    // empty catch block
                }
                var20_21 = "Disable failed.";
                zzfk.zzd((String)var19_20, (String)var20_21, (Throwable)var6_6);
            }
            ++var17_18;
        }
        if (var1_1) {
            var15_16 = var5_5.zza;
            var16_17 = ((zzmn[])var15_16).length;
            var18_19 = null;
            for (var17_18 = 0; var17_18 < var7_9; ++var17_18) {
                var20_21 = var5_5.zzb;
                var6_6 = var15_16[var17_18];
                var21_23 = var20_21.remove(var6_6);
                if (!var21_23) continue;
                try {
                    var6_6.zzI();
                    continue;
                }
                catch (RuntimeException var20_22) {
                    var6_6 = "Reset failed.";
                    zzfk.zzd((String)var19_20, (String)var6_6, var20_22);
                }
            }
        }
        var5_5.zzG = 0;
        var6_6 = var5_5.zzv;
        var22_24 = var6_6.zzb;
        var13_15 = var6_6.zzr;
        var6_6 = var5_5.zzv.zzb;
        var16_17 = (int)var6_6.zzb();
        if (var16_17 == 0 && (var16_17 = (int)zzlh.zzah((zzmg)(var6_6 = var5_5.zzv), (zzcz)(var19_20 = var5_5.zzl))) == 0) {
            var6_6 = var5_5.zzv;
            var23_25 = var6_6.zzr;
        } else {
            var6_6 = var5_5.zzv;
            var23_25 = var6_6.zzc;
        }
        if (!var2_2) ** GOTO lbl-1000
        var5_5.zzH = null;
        var6_6 = var5_5.zzv.zza;
        var6_6 = var5_5.zzx((zzdc)var6_6);
        var22_24 = (zzvo)var6_6.first;
        var13_15 = (Long)var6_6.second;
        var6_6 = var5_5.zzv.zzb;
        var16_17 = (int)var22_24.equals(var6_6);
        var23_25 = -9223372036854775807L;
        if (var16_17 == 0) {
            var25_26 = var13_15;
            var27_27 = var23_25;
        } else lbl-1000:
        // 2 sources

        {
            var25_26 = var13_15;
            var27_27 = var23_25;
            var12_14 = false;
        }
        var5_5.zzq.zzj();
        var5_5.zzC = false;
        var6_6 = var5_5.zzv.zza;
        if (!var3_3 || (var10_12 = var6_6 instanceof zzml) == 0) ** GOTO lbl-1000
        var6_6 = (zzml)var6_6;
        var11_13 = var5_5.zzr.zzq();
        var6_6 = var6_6.zzx((zzxi)var11_13);
        var10_12 = var22_24.zzb;
        var29_28 = -1;
        if (var10_12 == var29_28) ** GOTO lbl-1000
        var11_13 = var22_24.zza;
        var15_16 = var5_5.zzl;
        var6_6.zzn(var11_13, (zzcz)var15_16);
        var11_13 = var5_5.zzl;
        var15_16 = var5_5.zzk;
        var10_12 = var11_13.zzd;
        var30_29 = 0L;
        var6_6.zze(var10_12, (zzdb)var15_16, var30_29);
        var10_12 = (int)var15_16.zzb();
        if (var10_12 != 0) {
            var15_16 = var22_24.zza;
            var30_29 = var22_24.zzd;
            var11_13 = new zzvo(var15_16, var30_29);
            var18_19 = var6_6;
            var32_30 = var11_13;
        } else lbl-1000:
        // 3 sources

        {
            var18_19 = var6_6;
            var32_30 = var22_24;
        }
        var22_24 = var5_5.zzv;
        var33_31 = var22_24.zze;
        if (var4_4) lbl-1000:
        // 2 sources

        {
            while (true) {
                continue;
                break;
            }
        }
        var9_11 = var22_24.zzf;
        ** while (true)
        var34_32 = var9_11;
        if (var12_14) {
            var9_11 = zzxr.zza;
lbl119:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var9_11 = var22_24.zzh;
        ** while (true)
        var35_33 = var9_11;
        if (var12_14) {
            var9_11 = var5_5.zze;
lbl126:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var9_11 = var22_24.zzi;
        ** while (true)
        var36_34 = var9_11;
        if (var12_14) {
            var22_24 = zzgbc.zzm();
lbl133:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var22_24 = var22_24.zzj;
        ** while (true)
        var37_35 = var22_24;
        var22_24 = var5_5.zzv;
        var38_36 = var22_24.zzl;
        var8_10 = var22_24.zzm;
        var22_24 = var22_24.zzn;
        var39_37 = 0L;
        var41_38 = 0L;
        var15_16 = var6_6;
        var19_20 = var32_30;
        var5_5.zzv = var6_6 = new zzmg((zzdc)var18_19, (zzvo)var32_30, var27_27, var25_26, var33_31, var34_32, false, (zzxr)var35_33, (zzzn)var36_34, (List)var37_35, (zzvo)var32_30, var38_36, var8_10, (zzcl)var22_24, var25_26, var41_38, var25_26, var39_37, false);
        if (var3_3) {
            var6_6 = var5_5.zzr;
            var6_6.zzh();
        }
    }

    private final void zzN() {
        Object object = this.zzq.zze();
        boolean bl2 = false;
        if (object != null) {
            object = ((zzlq)object).zzf;
            boolean bl3 = ((zzlr)object).zzh;
            if (bl3 && (bl3 = this.zzy)) {
                bl2 = true;
            }
        }
        this.zzz = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzO(long l2) {
        int n3;
        int n4;
        zzzg[] zzzgArray = this.zzq.zze();
        long l3 = zzzgArray == null ? 1000000000000L : zzzgArray.zze();
        this.zzI = l2 += l3;
        this.zzn.zzf(l2);
        Object object = this.zza;
        int cfr_ignored_0 = ((zzmn[])object).length;
        zzzgArray = null;
        for (int i3 = 0; i3 < (n4 = 2); ++i3) {
            zzmn zzmn2 = object[i3];
            n3 = zzlh.zzaf(zzmn2);
            if (n3 == 0) continue;
            long l4 = this.zzI;
            zzmn2.zzJ(l4);
        }
        object = this.zzq.zze();
        while (object != null) {
            zzzgArray = ((zzlq)object).zzi().zzc;
            n4 = zzzgArray.length;
            for (n3 = 0; n3 < n4; ++n3) {
                zzzg cfr_ignored_1 = zzzgArray[n3];
            }
            object = ((zzlq)object).zzg();
        }
        return;
    }

    private final void zzP(zzdc object, zzdc zzdc2) {
        boolean bl2;
        boolean n3 = ((zzdc)object).zzo();
        if (n3 && (bl2 = zzdc2.zzo())) {
            return;
        }
        object = this.zzo;
        int n4 = ((ArrayList)object).size() + -1;
        if (n4 < 0) {
            Collections.sort(this.zzo);
            return;
        }
        object = ((zzle)this.zzo.get((int)n4)).zzb;
        int n7 = zzgd.zza;
        throw null;
    }

    private final void zzQ(long l2, long l3) {
        this.zzh.zzj(2, l2 += l3);
    }

    private final void zzR(boolean bl2) {
        zzvo zzvo2 = this.zzq.zze().zzf.zza;
        long l2 = this.zzv.zzr;
        Object object = this;
        l2 = this.zzw(zzvo2, l2, true, false);
        object = this.zzv;
        long l3 = ((zzmg)object).zzr;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            zzmg zzmg2;
            object = this.zzv;
            long l7 = ((zzmg)object).zzc;
            long l8 = ((zzmg)object).zzd;
            int n3 = 5;
            object = this;
            this.zzv = zzmg2 = this.zzz(zzvo2, l2, l7, l8, bl2, n3);
        }
    }

    private final void zzS(zzcl zzcl2) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzcl2);
    }

    private final void zzT(boolean bl2, int n3, boolean n4, int n7) {
        Object object;
        zzlf zzlf2 = this.zzw;
        zzlf2.zza(n4);
        this.zzw.zzb(n7);
        zzzg[] zzzgArray = this.zzv;
        Object object2 = zzzgArray.zzc(bl2, n3);
        this.zzv = object2;
        bl2 = false;
        object2 = null;
        this.zzac(false, false);
        for (object = this.zzq.zze(); object != null; object = ((zzlq)object).zzg()) {
            zzzgArray = ((zzlq)object).zzi().zzc;
            n7 = zzzgArray.length;
            zzlf2 = null;
            for (int i3 = 0; i3 < n7; ++i3) {
                zzzg cfr_ignored_0 = zzzgArray[i3];
            }
        }
        n3 = (int)(this.zzai() ? 1 : 0);
        if (n3 == 0) {
            this.zzX();
            this.zzaa();
            return;
        }
        object = this.zzv;
        n3 = ((zzmg)object).zze;
        n4 = 3;
        n7 = 2;
        if (n3 == n4) {
            this.zzac(false, false);
            this.zzn.zzh();
            this.zzV();
            this.zzh.zzi(n7);
            return;
        }
        if (n3 == n7) {
            object2 = this.zzh;
            object2.zzi(n7);
        }
    }

    private final void zzU(int n3) {
        zzmg zzmg2 = this.zzv;
        int n4 = zzmg2.zze;
        if (n4 != n3) {
            zzmg zzmg3;
            n4 = 2;
            if (n3 != n4) {
                long l2;
                this.zzM = l2 = -9223372036854775807L;
            }
            this.zzv = zzmg3 = zzmg2.zze(n3);
        }
    }

    private final void zzV() {
        Object object = this.zzq.zze();
        if (object != null) {
            object = ((zzlq)object).zzi();
            int n3 = 0;
            while (true) {
                int n4;
                Object object2 = this.zza;
                int n7 = ((zzmn[])object2).length;
                n7 = 2;
                if (n3 >= n7) break;
                n7 = (int)(((zzzn)object).zzb(n3) ? 1 : 0);
                if (n7 != 0 && (n7 = (object2 = this.zza[n3]).zzcU()) == (n4 = 1)) {
                    object2 = this.zza[n3];
                    object2.zzO();
                }
                ++n3;
            }
        }
    }

    private final void zzW(boolean bl2, boolean bl3) {
        zzlk zzlk2;
        int n3 = 1;
        if (bl2 || !(bl2 = this.zzF)) {
            bl2 = true;
        } else {
            bl2 = false;
            zzlk2 = null;
        }
        this.zzM(bl2, false, n3 != 0, false);
        this.zzw.zza((int)(bl3 ? 1 : 0));
        zzlk2 = this.zzf;
        zzpj zzpj2 = this.zzt;
        zzlk2.zze(zzpj2);
        this.zzU(n3);
    }

    private final void zzX() {
        int n3;
        this.zzn.zzi();
        zzmn[] zzmnArray = this.zza;
        int n4 = zzmnArray.length;
        for (n4 = 0; n4 < (n3 = 2); ++n4) {
            zzmn zzmn2 = zzmnArray[n4];
            boolean bl2 = zzlh.zzaf(zzmn2);
            if (!bl2) continue;
            zzlh.zzam(zzmn2);
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void zzY() {
        var1_1 = this;
        var2_2 = this.zzq.zzd();
        var3_3 = this.zzC;
        if (var3_3 != 0) ** GOTO lbl-1000
        var3_3 = 0;
        var4_4 = null;
        if (var2_2 != null && (var5_5 = (var2_2 = var2_2.zza).zzp())) lbl-1000:
        // 2 sources

        {
            var6_6 = 1;
        } else {
            var6_6 = 0;
        }
        var2_2 = var1_1.zzv;
        var3_3 = var2_2.zzg;
        if (var6_6 != var3_3) {
            var7_7 = var2_2.zza;
            var8_8 = var2_2.zzb;
            var9_9 = var2_2.zzc;
            var11_10 = var2_2.zzd;
            var13_11 = var2_2.zze;
            var14_12 = var2_2.zzf;
            var15_13 = var2_2.zzh;
            var16_14 = var2_2.zzi;
            var17_15 = var2_2.zzj;
            var18_16 = var2_2.zzk;
            var19_17 = var2_2.zzl;
            var3_3 = var2_2.zzm;
            var20_18 = var2_2.zzn;
            var21_19 = var2_2.zzp;
            var23_20 = var2_2.zzq;
            var25_21 = var2_2.zzr;
            var27_22 = var2_2.zzs;
            var4_4 = new zzmg(var7_7, var8_8, var9_9, var11_10, var13_11, var14_12, (boolean)var6_6, var15_13, var16_14, var17_15, var18_16, var19_17, var3_3, var20_18, var21_19, var23_20, var25_21, var27_22, false);
            var2_2 = var4_4;
            var1_1.zzv = var4_4;
        }
    }

    private final void zzZ(zzvo zzvo2, zzxr zzxr2, zzzn zzzn2) {
        zzdc zzdc2 = this.zzv.zza;
        zzzg[] zzzgArray = zzzn2.zzc;
        zzmn[] zzmnArray = this.zza;
        zzlk zzlk2 = this.zzf;
        zzpj zzpj2 = this.zzt;
        zzlk2.zzf(zzpj2, zzdc2, zzvo2, zzmnArray, zzxr2, zzzgArray);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private final void zzaa() {
        int n3;
        Object object;
        long l2;
        float f5;
        Object object2;
        int n4;
        long l3;
        long l4;
        Object object3;
        Object object4 = this.zzq.zze();
        if (object4 == null) {
            return;
        }
        int n7 = ((zzlq)object4).zzd;
        long l7 = -9223372036854775807L;
        if (n7 != 0) {
            object3 = ((zzlq)object4).zza;
            l3 = l4 = object3.zzd();
        } else {
            l3 = l7;
        }
        n7 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
        if (n7 != 0) {
            n7 = ((zzlq)object4).zzr();
            if (n7 == 0) {
                object3 = this.zzq;
                ((zzlt)object3).zzn((zzlq)object4);
                this.zzE(false);
                this.zzI();
            }
            this.zzO(l3);
            object4 = this.zzv;
            long l8 = ((zzmg)object4).zzr;
            n4 = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
            if (n4 != 0) {
                object4 = this.zzv;
                object3 = ((zzmg)object4).zzb;
                l4 = ((zzmg)object4).zzc;
                boolean bl2 = true;
                int n8 = 5;
                object4 = this;
                l7 = l3;
                this.zzv = object4 = this.zzz((zzvo)object3, l3, l4, l3, bl2, n8);
            }
        } else {
            int n10;
            object3 = this.zzn;
            object2 = this.zzq.zzf();
            if (object4 != object2) {
                n4 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n4 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            this.zzI = l2 = ((zzjf)object3).zzb(n4 != 0);
            long l12 = ((zzlq)object4).zze();
            l3 = l2 - l12;
            object4 = this.zzv;
            long l14 = ((zzmg)object4).zzr;
            object2 = this.zzo;
            n4 = ((ArrayList)object2).isEmpty();
            if (n4 == 0 && (n4 = ((zzvo)(object2 = this.zzv.zzb)).zzb()) == 0) {
                long l15;
                long l16;
                Object object5;
                int n14;
                n4 = (int)(this.zzK ? 1 : 0);
                if (n4 != 0) {
                    l7 = -1;
                    l14 += l7;
                    this.zzK = false;
                }
                object2 = this.zzv;
                object = ((zzmg)object2).zza;
                object2 = ((zzmg)object2).zzb.zza;
                n4 = ((zzdc)object).zza(object2);
                int n15 = this.zzJ;
                int n16 = this.zzo.size();
                n15 = Math.min(n15, n16);
                n16 = 0;
                if (n15 <= 0) {
                    n14 = 0;
                    object5 = null;
                } else {
                    object5 = this.zzo;
                    n10 = n15 + -1;
                    object5 = (zzle)((ArrayList)object5).get(n10);
                }
                while (object5 != null && (n4 < 0 || n4 == 0 && (n14 = (int)((l16 = l14 - (l15 = 0L)) == 0L ? 0 : (l16 < 0L ? -1 : 1))) < 0)) {
                    n14 = n15 + -1;
                    if (n14 > 0) {
                        ArrayList arrayList = this.zzo;
                        object5 = object = (zzle)arrayList.get(n15 += -2);
                        n15 = n14;
                        continue;
                    }
                    n15 = n14;
                    n14 = 0;
                    object5 = null;
                }
                object4 = this.zzo;
                n3 = ((ArrayList)object4).size();
                if (n15 < n3) {
                    object4 = (zzle)this.zzo.get(n15);
                }
                this.zzJ = n15;
            }
            if ((n3 = ((zzjf)(object4 = this.zzn)).zzj()) != 0) {
                object4 = this.zzv;
                object3 = ((zzmg)object4).zzb;
                l4 = ((zzmg)object4).zzc;
                n10 = 1;
                int n17 = 6;
                object4 = this;
                l7 = l3;
                this.zzv = object4 = this.zzz((zzvo)object3, l3, l4, l3, n10 != 0, n17);
            } else {
                object4 = this.zzv;
                ((zzmg)object4).zzr = l3;
                ((zzmg)object4).zzs = l2 = SystemClock.elapsedRealtime();
            }
        }
        object4 = this.zzq.zzd();
        object3 = this.zzv;
        ((zzmg)object3).zzp = l7 = ((zzlq)object4).zzc();
        object4 = this.zzv;
        ((zzmg)object4).zzq = l2 = this.zzt();
        object4 = this.zzv;
        n7 = ((zzmg)object4).zzl;
        if (n7 == 0) return;
        n7 = ((zzmg)object4).zze;
        n4 = 3;
        f5 = 4.2E-45f;
        if (n7 != n4) return;
        object3 = ((zzmg)object4).zza;
        object4 = ((zzmg)object4).zzb;
        n3 = this.zzaj((zzdc)object3, (zzvo)object4);
        if (n3 == 0) return;
        object4 = this.zzv;
        object3 = ((zzmg)object4).zzn;
        float f6 = ((zzcl)object3).zzc;
        n4 = 1065353216;
        f5 = 1.0f;
        float f7 = f6 - f5;
        n7 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n7 != 0) return;
        object3 = this.zzO;
        object2 = ((zzmg)object4).zza;
        object = ((zzmg)object4).zzb.zza;
        l4 = ((zzmg)object4).zzr;
        l7 = this.zzs((zzdc)object2, object, l4);
        l4 = this.zzt();
        float f8 = ((zzja)object3).zza(l7, l4);
        object3 = this.zzn.zzc();
        f6 = ((zzcl)object3).zzc;
        float f11 = f6 - f8;
        n7 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
        if (n7 == 0) return;
        f6 = this.zzv.zzn.zzd;
        object2 = new zzcl(f8, f6);
        this.zzS((zzcl)object2);
        object4 = this.zzv.zzn;
        object3 = this.zzn.zzc();
        f6 = ((zzcl)object3).zzc;
        this.zzH((zzcl)object4, f6, false, false);
    }

    private final void zzab(zzdc object, zzvo object2, zzdc object3, zzvo object4, long l2, boolean bl2) {
        long l3;
        block10: {
            block9: {
                int n3;
                block8: {
                    n3 = this.zzaj((zzdc)object, (zzvo)object2);
                    if (n3 != 0) break block8;
                    boolean bl3 = ((zzvo)object2).zzb();
                    object = bl3 ? zzcl.zza : this.zzv.zzn;
                    object2 = this.zzn.zzc();
                    boolean bl4 = ((zzcl)object2).equals(object);
                    if (!bl4) {
                        this.zzS((zzcl)object);
                        object2 = this.zzv.zzn;
                        float f5 = ((zzcl)object).zzc;
                        this.zzH((zzcl)object2, f5, false, false);
                        return;
                    }
                    break block9;
                }
                Object object5 = ((zzvo)object2).zza;
                Object object6 = this.zzl;
                n3 = ((zzdc)object).zzn((Object)object5, (zzcz)object6).zzd;
                object6 = this.zzk;
                long l4 = 0L;
                ((zzdc)object).zze(n3, (zzdb)object6, l4);
                object5 = this.zzO;
                object6 = this.zzk.zzl;
                int n4 = zzgd.zza;
                ((zzja)object5).zzd((zzbk)object6);
                l3 = -9223372036854775807L;
                n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                if (n4 != 0) {
                    object3 = this.zzO;
                    object2 = ((zzvo)object2).zza;
                    long l7 = this.zzs((zzdc)object, object2, l2);
                    ((zzja)object3).zze(l7);
                    return;
                }
                object = this.zzk.zzc;
                boolean n7 = ((zzdc)object3).zzo();
                if (!n7) {
                    object2 = ((zzvo)object4).zza;
                    object4 = this.zzl;
                    int n8 = ((zzdc)object3).zzn((Object)object2, (zzcz)object4).zzd;
                    object4 = this.zzk;
                    object2 = ((zzdc)object3).zze((int)n8, (zzdb)object4, (long)l4).zzc;
                } else {
                    boolean bl3 = false;
                    object2 = null;
                }
                boolean bl5 = zzgd.zzG(object2, object);
                if (!bl5 || bl2) break block10;
            }
            return;
        }
        this.zzO.zze(l3);
    }

    private final void zzac(boolean bl2, boolean bl3) {
        this.zzA = bl2;
        long l2 = bl3 ? -9223372036854775807L : SystemClock.elapsedRealtime();
        this.zzB = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzad(zzfyw object, long l2) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                try {
                    long l3 = SystemClock.elapsedRealtime() + l2;
                    boolean bl2 = false;
                    while (true) {
                        long l4;
                        long l7;
                        long l8;
                        Object object2 = object;
                        object2 = (zzkx)object;
                        object2 = ((zzkx)object2).zza;
                        boolean bl3 = ((zzlh)object2).zzx;
                        if (bl3 || (l8 = (l7 = l2 - (l4 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) <= 0) break;
                        try {
                            this.wait(l2);
                        }
                        catch (InterruptedException interruptedException) {
                            bl2 = true;
                        }
                        l2 = SystemClock.elapsedRealtime();
                        l2 = l3 - l2;
                    }
                    if (bl2) {
                        object = Thread.currentThread();
                        ((Thread)object).interrupt();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                return;
            }
            throw throwable2;
        }
    }

    private final boolean zzae() {
        long l2;
        zzlq zzlq2 = this.zzq.zzd();
        if (zzlq2 == null) {
            return false;
        }
        long l3 = zzlq2.zzd();
        long l4 = l3 - (l2 = Long.MIN_VALUE);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }

    private static boolean zzaf(zzmn zzmn2) {
        int n3 = zzmn2.zzcU();
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean zzag() {
        zzlq zzlq2 = this.zzq.zze();
        zzlr zzlr2 = zzlq2.zzf;
        long l2 = zzlr2.zze;
        boolean bl2 = zzlq2.zzd;
        boolean bl3 = false;
        if (!bl2) return bl3;
        long l3 = -9223372036854775807L;
        bl2 = true;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) return true;
        zzmg zzmg2 = this.zzv;
        l3 = zzmg2.zzr;
        long l4 = l3 - l2;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 < 0) return true;
        boolean bl4 = this.zzai();
        if (!bl4) return bl2;
        return bl3;
    }

    private static boolean zzah(zzmg object, zzcz zzcz2) {
        Object object2 = ((zzmg)object).zzb;
        object = ((zzmg)object).zza;
        boolean bl2 = ((zzdc)object).zzo();
        if (!bl2) {
            object2 = ((zzvo)object2).zza;
            object = ((zzdc)object).zzn(object2, zzcz2);
            boolean bl3 = ((zzcz)object).zzg;
            if (!bl3) {
                return false;
            }
        }
        return true;
    }

    private final boolean zzai() {
        int n3;
        zzmg zzmg2 = this.zzv;
        boolean bl2 = zzmg2.zzl;
        return bl2 && (n3 = zzmg2.zzm) == 0;
    }

    private final boolean zzaj(zzdc object, zzvo object2) {
        boolean bl2 = ((zzvo)object2).zzb();
        if (!bl2 && !(bl2 = ((zzdc)object).zzo())) {
            object2 = ((zzvo)object2).zza;
            Object object3 = this.zzl;
            object2 = ((zzdc)object).zzn(object2, (zzcz)object3);
            int n3 = ((zzcz)object2).zzd;
            object3 = this.zzk;
            long l2 = 0L;
            ((zzdc)object).zze(n3, (zzdb)object3, l2);
            object = this.zzk;
            boolean bl3 = ((zzdb)object).zzb();
            if (bl3) {
                long l3;
                long l4;
                object = this.zzk;
                n3 = (int)(((zzdb)object).zzj ? 1 : 0);
                if (n3 != 0 && (bl2 = (l4 = (l3 = ((zzdb)object).zzg) - (l2 = -9223372036854775807L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzan[] zzak(zzzg zzzg2) {
        int n3 = zzzg2 != null ? zzzg2.zzc() : 0;
        zzan[] zzanArray = new zzan[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            zzan zzan2;
            zzanArray[i3] = zzan2 = zzzg2.zzd(i3);
        }
        return zzanArray;
    }

    private static final void zzal(zzmj zzmj2) {
        zzmj2.zzj();
        boolean bl2 = true;
        try {
            zzmi zzmi2 = zzmj2.zzc();
            int n3 = zzmj2.zza();
            Object object = zzmj2.zzg();
            zzmi2.zzt(n3, object);
            return;
        }
        finally {
            zzmj2.zzh(bl2);
        }
    }

    private static final void zzam(zzmn zzmn2) {
        int n3;
        int n4 = zzmn2.zzcU();
        if (n4 == (n3 = 2)) {
            zzmn2.zzP();
        }
    }

    private static final void zzan(zzmn zzmn2, long l2) {
        zzmn2.zzK();
        boolean bl2 = zzmn2 instanceof zzxv;
        if (!bl2) {
            return;
        }
        zzmn2 = (zzxv)zzmn2;
        throw null;
    }

    public static /* bridge */ /* synthetic */ zzfb zzc(zzlh zzlh2) {
        return zzlh2.zzh;
    }

    public static /* synthetic */ zzlq zzd(zzlh zzlh2, zzlr zzlr2, long l2) {
        zzlk zzlk2 = zzlh2.zzf;
        zzzm zzzm2 = zzlh2.zzd;
        zzzv zzzv2 = zzlk2.zzj();
        zzzn zzzn2 = zzlh2.zze;
        zzmf zzmf2 = zzlh2.zzr;
        zzmp[] zzmpArray = zzlh2.zzc;
        zzlq zzlq2 = new zzlq(zzmpArray, l2, zzzm2, zzzv2, zzmf2, zzlr2, zzzn2);
        return zzlq2;
    }

    public static Object zzf(zzdb zzdb2, zzcz zzcz2, int n3, boolean bl2, Object object, zzdc zzdc2, zzdc zzdc3) {
        int n4 = zzdc2.zza(object);
        int n7 = zzdc2.zzb();
        int n8 = -1;
        int n10 = n4;
        n4 = -1;
        for (int i3 = 0; i3 < n7 && n4 == n8; ++i3) {
            if ((n10 = zzdc2.zzi(n10, zzcz2, zzdb2, n3, bl2)) == n8) {
                n4 = -1;
                break;
            }
            object = zzdc2.zzf(n10);
            n4 = zzdc3.zza(object);
        }
        if (n4 == n8) {
            return null;
        }
        return zzdc3.zzf(n4);
    }

    public static final /* synthetic */ void zzr(zzmj zzmj2) {
        try {
            zzlh.zzal(zzmj2);
            return;
        }
        catch (zzjh zzjh2) {
            zzfk.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", zzjh2);
            RuntimeException runtimeException = new RuntimeException(zzjh2);
            throw runtimeException;
        }
    }

    private final long zzs(zzdc object, Object object2, long l2) {
        boolean bl2;
        Object object3 = this.zzl;
        object2 = ((zzdc)object).zzn(object2, (zzcz)object3);
        int n3 = ((zzcz)object2).zzd;
        object3 = this.zzk;
        long l3 = 0L;
        ((zzdc)object).zze(n3, (zzdb)object3, l3);
        object = this.zzk;
        long l4 = ((zzdb)object).zzg;
        long l7 = -9223372036854775807L;
        n3 = (int)(l4 == l7 ? 0 : (l4 < l7 ? -1 : 1));
        if (n3 != 0 && (bl2 = ((zzdb)object).zzb())) {
            object = this.zzk;
            n3 = (int)(((zzdb)object).zzj ? 1 : 0);
            if (n3 != 0) {
                long l8 = ((zzdb)object).zzh;
                long l12 = l8 - l7;
                Object object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object4 == false) {
                    l8 = System.currentTimeMillis();
                } else {
                    l4 = SystemClock.elapsedRealtime();
                    l8 += l4;
                }
                l4 = this.zzk.zzg;
                return zzgd.zzr(l8 - l4) - l2;
            }
        }
        return l7;
    }

    private final long zzt() {
        long l2 = this.zzv.zzp;
        return this.zzu(l2);
    }

    private final long zzu(long l2) {
        zzlq zzlq2 = this.zzq.zzd();
        long l3 = 0L;
        if (zzlq2 == null) {
            return l3;
        }
        long l4 = this.zzI;
        long l7 = zzlq2.zze();
        return Math.max(l3, l2 -= (l4 -= l7));
    }

    private final long zzv(zzvo zzvo2, long l2, boolean bl2) {
        boolean bl3;
        Object object = this.zzq;
        Object object2 = ((zzlt)object).zze();
        if (object2 != (object = ((zzlt)object).zzf())) {
            bl3 = true;
        } else {
            object = null;
            bl3 = false;
        }
        object2 = this;
        return this.zzw(zzvo2, l2, bl3, bl2);
    }

    private final long zzw(zzvo object, long l2, boolean n3, boolean n4) {
        long l3;
        long l4;
        long l7;
        long l8;
        zzvo zzvo2;
        boolean bl2;
        Object object2;
        Object object3;
        int n7;
        block14: {
            block13: {
                this.zzX();
                this.zzac(false, true);
                n7 = 2;
                if (n4 != 0) break block13;
                object3 = this.zzv;
                n4 = ((zzmg)object3).zze;
                int n8 = 3;
                if (n4 != n8) break block14;
            }
            this.zzU(n7);
        }
        for (object2 = object3 = this.zzq.zze(); object2 != null && !(bl2 = ((zzvo)object).equals(zzvo2 = ((zzlq)object2).zzf.zza)); object2 = ((zzlq)object2).zzg()) {
        }
        if (n3 != 0 || object3 != object2 || object2 != null && (l8 = (l7 = (l4 = ((zzlq)object2).zze() + l2) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) {
            object = this.zza;
            n3 = ((zzmn[])object).length;
            for (n3 = 0; n3 < n7; ++n3) {
                object3 = object[n3];
                this.zzA((zzmn)object3);
            }
            if (object2 != null) {
                while ((object = this.zzq.zze()) != object2) {
                    object = this.zzq;
                    ((zzlt)object).zza();
                }
                object = this.zzq;
                ((zzlt)object).zzn((zzlq)object2);
                l4 = 1000000000000L;
                ((zzlq)object2).zzp(l4);
                this.zzB();
            }
        }
        if (object2 != null) {
            object = this.zzq;
            ((zzlt)object).zzn((zzlq)object2);
            l8 = (long)((zzlq)object2).zzd;
            if (l8 == false) {
                ((zzlq)object2).zzf = object = ((zzlq)object2).zzf.zzb(l2);
            } else {
                l8 = (long)((zzlq)object2).zze;
                if (l8 != false) {
                    l2 = ((zzlq)object2).zza.zze(l2);
                    object = ((zzlq)object2).zza;
                    l4 = this.zzm;
                    l4 = l2 - l4;
                    object.zzj(l4, false);
                }
            }
            this.zzO(l2);
            this.zzI();
        } else {
            object = this.zzq;
            ((zzlt)object).zzj();
            this.zzO(l2);
        }
        this.zzE(false);
        this.zzh.zzi(n7);
        return l2;
    }

    private final Pair zzx(zzdc object) {
        boolean n3 = ((zzdc)object).zzo();
        long l2 = 0L;
        if (n3) {
            object = zzmg.zzh();
            Long l3 = l2;
            return Pair.create((Object)object, (Object)l3);
        }
        boolean bl2 = this.zzE;
        int n4 = ((zzdc)object).zzg(bl2);
        Object object2 = this.zzk;
        zzcz zzcz2 = this.zzl;
        long l4 = -9223372036854775807L;
        Object object3 = object;
        Object object4 = ((zzdc)object).zzl((zzdb)object2, zzcz2, n4, l4);
        object3 = this.zzq;
        object2 = ((Pair)object4).first;
        object3 = ((zzlt)object3).zzi((zzdc)object, object2, l2);
        object4 = (Long)((Pair)object4).second;
        long l7 = (Long)object4;
        boolean bl3 = ((zzvo)object3).zzb();
        if (bl3) {
            object4 = ((zzvo)object3).zza;
            object2 = this.zzl;
            ((zzdc)object).zzn(object4, (zzcz)object2);
            int n7 = ((zzvo)object3).zzc;
            object4 = this.zzl;
            int n8 = ((zzvo)object3).zzb;
            int n10 = ((zzcz)object4).zze(n8);
            if (n7 == n10) {
                object = this.zzl;
                ((zzcz)object).zzj();
            }
        } else {
            l2 = l7;
        }
        object = l2;
        return Pair.create((Object)object3, (Object)object);
    }

    private static Pair zzy(zzdc zzdc2, zzlg zzlg2, boolean bl2, int n3, boolean bl3, zzdb zzdb2, zzcz zzcz2) {
        int n4;
        Object object = zzlg2;
        zzcz zzcz3 = zzcz2;
        Object object2 = zzlg2.zza;
        boolean n7 = zzdc2.zzo();
        if (n7) {
            return null;
        }
        int n8 = 1;
        int n10 = ((zzdc)object2).zzo();
        Object object3 = n8 == n10 ? zzdc2 : object2;
        try {
            n4 = ((zzlg)object).zzb;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
        long l2 = ((zzlg)object).zzc;
        object2 = object3;
        Object object4 = zzdb2;
        Object object5 = zzcz2;
        object2 = ((zzdc)object3).zzl(zzdb2, zzcz2, n4, l2);
        boolean bl4 = zzdc2.equals(object3);
        if (bl4) {
            return object2;
        }
        object4 = ((Pair)object2).first;
        int n14 = zzdc2.zza(object4);
        if (n14 != (n8 = -1)) {
            object4 = ((Pair)object2).first;
            object4 = ((zzdc)object3).zzn(object4, zzcz3);
            boolean bl5 = ((zzcz)object4).zzg;
            if (bl5) {
                int n15 = zzcz3.zzd;
                long l3 = 0L;
                object4 = ((zzdc)object3).zze(n15, zzdb2, l3);
                int n16 = ((zzdb)object4).zzp;
                object5 = ((Pair)object2).first;
                n8 = ((zzdc)object3).zza(object5);
                if (n16 == n8) {
                    object2 = ((Pair)object2).first;
                    n8 = zzdc2.zzn((Object)object2, (zzcz)zzcz3).zzd;
                    long l4 = ((zzlg)object).zzc;
                    object = zzdc2;
                    object2 = zzdb2;
                    object4 = zzcz2;
                    return zzdc2.zzl(zzdb2, zzcz2, n8, l4);
                }
            }
            return object2;
        }
        Object object6 = ((Pair)object2).first;
        object = zzdb2;
        object2 = zzcz2;
        int n17 = n3;
        n8 = (int)(bl3 ? 1 : 0);
        object = zzlh.zzf(zzdb2, zzcz2, n3, bl3, object6, (zzdc)object3, zzdc2);
        if (object != null) {
            n8 = zzdc2.zzn((Object)object, (zzcz)zzcz3).zzd;
            object = zzdc2;
            object2 = zzdb2;
            object4 = zzcz2;
            return zzdc2.zzl(zzdb2, zzcz2, n8, -9223372036854775807L);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final zzmg zzz(zzvo var1_1, long var2_2, long var4_3, long var6_4, boolean var8_5, int var9_6) {
        var10_7 = this;
        var11_8 = var1_1;
        var12_9 /* !! */  = this.zzK;
        var13_10 = 0;
        var14_11 = null;
        if (var12_9 /* !! */ ) ** GOTO lbl-1000
        var15_12 /* !! */  = this.zzv;
        var16_13 = var15_12 /* !! */ .zzr;
        cfr_temp_0 = var2_2 - var16_13;
        var12_9 /* !! */  = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
        if (var12_9 /* !! */  || !(var12_9 /* !! */  = var1_1.equals(var15_12 /* !! */  = this.zzv.zzb))) lbl-1000:
        // 2 sources

        {
            var12_9 /* !! */  = true;
        } else {
            var12_9 /* !! */  = false;
            var15_12 /* !! */  = null;
        }
        var10_7.zzK = var12_9 /* !! */ ;
        this.zzN();
        var15_12 /* !! */  = var10_7.zzv;
        var18_14 = var15_12 /* !! */ .zzh;
        var19_15 = var15_12 /* !! */ .zzi;
        var15_12 /* !! */  = var15_12 /* !! */ .zzj;
        var20_16 = var10_7.zzr;
        var21_17 = var20_16.zzj();
        if (var21_17) {
            var15_12 /* !! */  = var10_7.zzq.zze();
            var18_14 = var15_12 /* !! */  == null ? zzxr.zza : var15_12 /* !! */ .zzh();
            var19_15 = var15_12 /* !! */  == null ? var10_7.zze : var15_12 /* !! */ .zzi();
            var20_16 = var19_15.zzc;
            var22_18 = new zzgaz();
            var23_19 = var20_16.length;
            var25_21 /* !! */  = false;
            var26_22 = null;
            for (var24_20 = 0; var24_20 < var23_19; ++var24_20) {
                var27_23 = var20_16[var24_20];
                if (var27_23 == null) continue;
                var27_23 = var27_23.zzd((int)0).zzl;
                if (var27_23 == null) {
                    var28_24 = -9223372036854775807L;
                    var30_25 = new zzcc[]{};
                    var27_23 = new zzcd(var28_24, var30_25);
                    var22_18.zzf(var27_23);
                    continue;
                }
                var22_18.zzf(var27_23);
                var25_21 /* !! */  = true;
            }
            var31_26 = var25_21 /* !! */  != false ? var22_18.zzi() : zzgbc.zzm();
            if (var15_12 /* !! */  != null) {
                var32_28 = var15_12 /* !! */ .zzf;
                var33_29 = var32_28.zzc;
                cfr_temp_1 = var33_29 - var4_3;
                var25_21 /* !! */  = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                if (var25_21 /* !! */ ) {
                    var32_28 = var32_28.zza(var4_3);
                    var15_12 /* !! */ .zzf = var32_28;
                }
            }
            if ((var15_12 /* !! */  = var10_7.zzq.zze()) != null) {
                var15_12 /* !! */  = var15_12 /* !! */ .zzi();
                while (true) {
                    var32_28 = var10_7.zza;
                    var35_30 = ((zzmn[])var32_28).length;
                    var35_30 = 2;
                    if (var13_10 >= var35_30) break;
                    var35_30 = (int)var15_12 /* !! */ .zzb(var13_10);
                    if (var35_30 != 0) {
                        var32_28 = var10_7.zza[var13_10];
                        var35_30 = var32_28.zzb();
                        if (var35_30 != (var36_31 = 1)) break;
                        var32_28 = var15_12 /* !! */ .zzb[var13_10];
                        var35_30 = var32_28.zzb;
                    } else {
                        var36_31 = 1;
                    }
                    ++var13_10;
                }
            }
            var30_25 = var31_26;
lbl76:
            // 2 sources

            while (true) {
                var26_22 = var18_14;
                var27_23 = var19_15;
                break;
            }
        } else {
            var14_11 = var10_7.zzv.zzb;
            var13_10 = var11_8.equals(var14_11);
            if (var13_10 == 0) {
                var15_12 /* !! */  = var10_7.zze;
                var14_11 = zzxr.zza;
                var31_27 = zzgbc.zzm();
                var27_23 = var15_12 /* !! */ ;
                var26_22 = var14_11;
                var30_25 = var31_27;
            } else {
                var30_25 = var15_12 /* !! */ ;
                ** continue;
            }
        }
        if (var8_5) {
            var15_12 /* !! */  = var10_7.zzw;
            var13_10 = var9_6;
            var15_12 /* !! */ .zzd(var9_6);
        }
        var15_12 /* !! */  = var10_7.zzv;
        var33_29 = this.zzt();
        var11_8 = var1_1;
        var16_13 = var6_4;
        var37_32 = var26_22;
        var26_22 = var30_25;
        return var15_12 /* !! */ .zzb(var1_1, var2_2, var4_3, var6_4, var33_29, (zzxr)var37_32, (zzzn)var27_23, (List)var30_25);
    }

    /*
     * Exception decompiling
     */
    public final boolean handleMessage(Message var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [76, 75, 74, 73, 72, 71, 70 : 294->312)] java.lang.RuntimeException
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

    public final void zza(zzcl zzcl2) {
        this.zzh.zzc(16, zzcl2).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    public final /* synthetic */ Boolean zze() {
        return this.zzx;
    }

    public final void zzh() {
        this.zzh.zzi(22);
    }

    public final void zzi(zzvm zzvm2) {
        this.zzh.zzc(8, zzvm2).zza();
    }

    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzdc zzdc2, int n3, long l2) {
        zzlg zzlg2 = new zzlg(zzdc2, n3, l2);
        this.zzh.zzc(3, zzlg2).zza();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(zzmj object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                boolean bl2;
                block4: {
                    try {
                        bl2 = this.zzx;
                        if (bl2) break block4;
                        object2 = this.zzj;
                        bl2 = ((Thread)(object2 = object2.getThread())).isAlive();
                        if (bl2) {
                            object2 = this.zzh;
                            int n3 = 14;
                            object = object2.zzc(n3, object);
                            object.zza();
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object2 = "ExoPlayerImplInternal";
                String string2 = "Ignoring messages sent after release.";
                zzfk.zzf((String)object2, string2);
                bl2 = false;
                object2 = null;
                ((zzmj)object).zzh(false);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzn(boolean bl2, int n3) {
        this.zzh.zzd(1, (int)(bl2 ? 1 : 0), n3).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzp() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zzx;
                    if (bl2) return true;
                    Object object = this.zzj;
                    bl2 = ((Thread)(object = object.getThread())).isAlive();
                    if (bl2) {
                        object = this.zzh;
                        int n3 = 7;
                        object.zzi(n3);
                        object = new zzkx(this);
                        long l2 = this.zzs;
                        this.zzad((zzfyw)object, l2);
                        return this.zzx;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return true;
            }
            throw throwable2;
        }
    }

    public final void zzq(List list, int n3, long l2, zzxi zzxi2) {
        zzlc zzlc2 = new zzlc(list, zzxi2, n3, l2, null);
        this.zzh.zzc(17, zzlc2).zza();
    }
}

