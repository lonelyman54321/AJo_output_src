/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzacw;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzadf;
import com.google.android.gms.internal.ads.zzadg;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzagu;
import com.google.android.gms.internal.ads.zzajm;
import com.google.android.gms.internal.ads.zzajn;
import com.google.android.gms.internal.ads.zzajo;
import com.google.android.gms.internal.ads.zzajw;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzajz;
import com.google.android.gms.internal.ads.zzaka;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakc;
import com.google.android.gms.internal.ads.zzakl;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzakp;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgr;
import com.google.android.gms.internal.ads.zzu;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class zzakd
implements zzadu {
    public static final zzaea zza;
    private static final byte[] zzb;
    private static final zzan zzc;
    private zzakc zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private zzadx zzF;
    private zzafa[] zzG;
    private zzafa[] zzH;
    private boolean zzI;
    private final zzalt zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzfu zzg;
    private final zzfu zzh;
    private final zzfu zzi;
    private final byte[] zzj;
    private final zzfu zzk;
    private final zzagu zzl;
    private final zzfu zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private zzgbc zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private zzfu zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        Object object = new zzajz();
        zza = object;
        Object object2 = object = (Object)new byte[16];
        object2[0] = -94;
        object2[1] = 57;
        object2[2] = 79;
        object2[3] = 82;
        object2[4] = 90;
        object2[5] = -101;
        object2[6] = 79;
        object2[7] = 20;
        object2[8] = -94;
        object2[9] = 68;
        object2[10] = 108;
        object2[11] = 66;
        object2[12] = 124;
        object2[13] = 100;
        object2[14] = -115;
        object2[15] = -12;
        zzb = (byte[])object;
        object = new zzal();
        ((zzal)object).zzX("application/x-emsg");
        zzc = ((zzal)object).zzad();
    }

    public zzakd() {
        zzalt zzalt2 = zzalt.zza;
        zzgbc zzgbc2 = zzgbc.zzm();
        this(zzalt2, 32, null, null, zzgbc2, null);
    }

    public zzakd(zzalt zzalt2, int n3) {
        zzgbc zzgbc2 = zzgbc.zzm();
        this(zzalt2, 32, null, null, zzgbc2, null);
    }

    public zzakd(zzalt zzafaArray, int n3, zzgb object, zzakp zzakp2, List list, zzafa zzafa2) {
        long l2;
        this.zzd = zzafaArray;
        zzafaArray = Collections.unmodifiableList(list);
        this.zze = zzafaArray;
        zzafaArray = new zzagu();
        this.zzl = zzafaArray;
        n3 = 16;
        zzafaArray = new zzfu(n3);
        this.zzm = zzafaArray;
        object = zzgr.zza;
        zzafaArray = new zzfu((byte[])object);
        this.zzg = zzafaArray;
        zzafaArray = new zzfu(5);
        this.zzh = zzafaArray;
        zzafaArray = new zzfu();
        this.zzi = zzafaArray;
        zzafaArray = (zzafa[])new byte[n3];
        this.zzj = (byte[])zzafaArray;
        zzafa[] zzafaArray2 = new zzfu((byte[])zzafaArray);
        this.zzk = zzafaArray2;
        zzafaArray = new ArrayDeque();
        this.zzn = zzafaArray;
        zzafaArray = new ArrayDeque();
        this.zzo = zzafaArray;
        zzafaArray = new SparseArray();
        this.zzf = zzafaArray;
        zzafaArray = zzgbc.zzm();
        this.zzp = zzafaArray;
        this.zzy = l2 = -9223372036854775807L;
        this.zzx = l2;
        this.zzz = l2;
        zzafaArray = zzadx.zza;
        this.zzF = zzafaArray;
        zzafaArray2 = new zzafa[]{};
        this.zzG = zzafaArray2;
        zzafaArray = new zzafa[]{};
        this.zzH = zzafaArray;
    }

    private static int zza(int n3) {
        if (n3 >= 0) {
            return n3;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected negative value: ");
        stringBuilder.append(n3);
        throw zzch.zza(stringBuilder.toString(), null);
    }

    /*
     * Unable to fully structure code
     */
    private static zzae zzg(List var0) {
        var1_1 = var0.size();
        var2_2 = 0;
        var3_3 = null;
        var4_4 = null;
        while (var2_2 < var1_1) {
            block19: {
                block18: {
                    block14: {
                        block17: {
                            block13: {
                                block16: {
                                    block15: {
                                        var5_5 = var0;
                                        var6_6 = (zzajn)var0.get(var2_2);
                                        var7_7 = var6_6.zzd;
                                        var8_8 = 1886614376;
                                        if (var7_7 != var8_8) break block14;
                                        if (var4_4 == null) {
                                            var4_4 = new ArrayList();
                                        }
                                        if ((var10_10 = (var9_9 = new zzfu((byte[])(var6_6 = (Object)var6_6.zza.zzM()))).zze()) < (var11_11 = 32)) lbl-1000:
                                        // 4 sources

                                        {
                                            while (true) {
                                                var12_12 = var2_2;
                                                var13_13 = var4_4;
lbl17:
                                                // 2 sources

                                                while (true) {
                                                    var14_14 = 0;
                                                    var15_15 = null;
                                                    break block13;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var9_9.zzK(0);
                                        var10_10 = var9_9.zzb();
                                        var11_11 = var9_9.zzg();
                                        var16_16 = "PsshAtomUtil";
                                        if (var11_11 == var10_10) break block15;
                                        var9_9 = new StringBuilder("Advertised atom size (");
                                        var9_9.append(var11_11);
                                        var17_17 = ") does not match buffer size: ";
                                        var9_9.append(var17_17);
                                        var9_9.append(var10_10);
                                        var9_9 = var9_9.toString();
                                        zzfk.zzf(var16_16, (String)var9_9);
                                        ** GOTO lbl-1000
                                    }
                                    var10_10 = var9_9.zzg();
                                    if (var10_10 == var8_8) break block16;
                                    var9_9 = "Atom type is not pssh: ";
                                    w12_0.a(var10_10, (String)var9_9, var16_16);
                                    ** GOTO lbl-1000
                                }
                                var8_8 = zzajo.zze(var9_9.zzg());
                                if (var8_8 > (var10_10 = 1)) {
                                    var9_9 = "Unsupported pssh version: ";
                                    w12_0.a(var8_8, (String)var9_9, var16_16);
                                    ** continue;
                                }
                                var19_19 = var9_9.zzt();
                                var21_20 = var9_9.zzt();
                                var18_18 = new UUID(var19_19, var21_20);
                                if (var8_8 == var10_10) {
                                    var10_10 = var9_9.zzp();
                                    var23_21 = new UUID[var10_10];
                                    for (var24_22 = 0; var24_22 < var10_10; ++var24_22) {
                                        var12_12 = var2_2;
                                        var26_24 = var9_9.zzt();
                                        var13_13 = var4_4;
                                        var28_25 = var9_9.zzt();
                                        var23_21[var24_22] = var25_23 = new UUID(var26_24, var28_25);
                                        var5_5 = var0;
                                    }
                                    var12_12 = var2_2;
                                    var13_13 = var4_4;
                                } else {
                                    var12_12 = var2_2;
                                    var13_13 = var4_4;
                                    var23_21 = null;
                                }
                                var14_14 = var9_9.zzp();
                                var2_2 = var9_9.zzb();
                                if (var14_14 != var2_2) {
                                    var5_5 = "Atom data size (";
                                    var4_4 = new StringBuilder((String)var5_5);
                                    var4_4.append(var14_14);
                                    var4_4.append(") does not match the bytes left: ");
                                    var4_4.append(var2_2);
                                    var15_15 = var4_4.toString();
                                    zzfk.zzf(var16_16, (String)var15_15);
                                    ** continue;
                                }
                                var3_3 = new byte[var14_14];
                                var9_9.zzG((byte[])var3_3, 0, var14_14);
                                var15_15 = new zzakl(var18_18, var8_8, (byte[])var3_3, var23_21);
                            }
                            if (var15_15 == null) {
                                var14_14 = 0;
                                var15_15 = null;
                            } else {
                                var15_15 = var15_15.zza;
                            }
                            if (var15_15 != null) break block17;
                            var15_15 = "FragmentedMp4Extractor";
                            var3_3 = "Skipped pssh atom (failed to extract uuid)";
                            zzfk.zzf((String)var15_15, (String)var3_3);
                            var4_4 = var13_13;
                            break block18;
                        }
                        var5_5 = null;
                        var3_3 = new zzad((UUID)var15_15, null, "video/mp4", (byte[])var6_6);
                        var4_4 = var13_13;
                        var13_13.add(var3_3);
                        break block19;
                    }
                    var12_12 = var2_2;
                }
                var5_5 = null;
            }
            var2_2 = var12_12 + 1;
        }
        var5_5 = null;
        if (var4_4 == null) {
            return null;
        }
        var30_26 = new zzae((List)var4_4);
        return var30_26;
    }

    private final void zzh() {
        this.zzq = 0;
        this.zzt = 0;
    }

    private static void zzi(zzfu object, int n3, zzakr zzakr2) {
        ((zzfu)object).zzK(n3 += 8);
        n3 = ((zzfu)object).zzg();
        int n4 = n3 & 1;
        if (n4 == 0) {
            zzfu zzfu2;
            n4 = 0;
            if ((n3 &= 2) != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                zzfu2 = null;
            }
            int n7 = ((zzfu)object).zzp();
            if (n7 == 0) {
                object = zzakr2.zzl;
                n3 = zzakr2.zze;
                Arrays.fill((boolean[])object, 0, n3, false);
                return;
            }
            int n8 = zzakr2.zze;
            if (n7 == n8) {
                Arrays.fill(zzakr2.zzl, 0, n7, n3 != 0);
                n3 = ((zzfu)object).zzb();
                zzakr2.zza(n3);
                zzfu2 = zzakr2.zzn;
                byte[] byArray = zzfu2.zzM();
                n3 = zzfu2.zze();
                ((zzfu)object).zzG(byArray, 0, n3);
                zzakr2.zzn.zzK(0);
                zzakr2.zzo = false;
                return;
            }
            object = new StringBuilder("Senc sample count ");
            ((StringBuilder)object).append(n7);
            ((StringBuilder)object).append(" is different from fragment sample count");
            ((StringBuilder)object).append(n8);
            throw zzch.zza(((StringBuilder)object).toString(), null);
        }
        throw zzch.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private final void zzj(long var1_1) {
        var3_2 = this;
        while (true) {
            block88: {
                block89: {
                    block90: {
                        block91: {
                            block92: {
                                var4_3 = 8;
                                while (true) {
                                    block94: {
                                        block93: {
                                            if ((var6_5 = (var5_4 = var3_2.zzn).isEmpty()) != 0) break block93;
                                            var5_4 = (zzajm)var3_2.zzn.peek();
                                            var7_6 = var5_4.zza;
                                            cfr_temp_0 = var7_6 - var1_1;
                                            var9_7 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                            if (var9_7 /* !! */  != false) break block93;
                                            var10_8 = var5_4 = var3_2.zzn.pop();
                                            var10_8 = (zzajm)var5_4;
                                            var6_5 = var10_8.zzd;
                                            var9_7 /* !! */  = 1836019574;
                                            var11_9 = 12;
                                            if (var6_5 == var9_7 /* !! */ ) {
                                                var5_4 = zzakd.zzg(var10_8.zzb);
                                                var9_7 /* !! */  = 1836475768;
                                                var12_10 = var10_8.zza((int)var9_7 /* !! */ );
                                                var12_10.getClass();
                                                var13_11 = new SparseArray();
                                                var14_12 = var12_10.zzb;
                                                var15_13 = var14_12.size();
                                                var16_14 = -9223372036854775807L;
                                                var19_16 = null;
                                                break block94;
                                            } else {
                                                var24_21 /* !! */  = 0x6D6F6F66;
                                                if (var6_5 == var24_21 /* !! */ ) break;
                                                var20_17 = var3_2;
                                                var3_2 = var10_8;
                                                var4_3 = 2;
                                                var30_26 = 8;
                                                var9_7 /* !! */  = 1;
                                                var32_28 = 4;
                                                var11_9 = 16;
                                                var25_22 /* !! */  = (byte[])var20_17.zzn;
                                                var22_19 = var25_22 /* !! */ .isEmpty();
                                                if (var22_19 == 0) {
                                                    var25_22 /* !! */  = (zzajm)var20_17.zzn.peek();
                                                    var25_22 /* !! */ .zzc((zzajm)var10_8);
                                                }
                                                break block88;
                                            }
                                        }
                                        var20_17 = var3_2;
                                        this.zzh();
                                        return;
                                    }
                                    for (var18_15 = 0; var18_15 < var15_13; var18_15 += var24_21 /* !! */ ) {
                                        var20_17 = (zzajn)var12_10.zzb.get(var18_15);
                                        var21_18 = var20_17.zzd;
                                        var22_19 = 1953654136;
                                        if (var21_18 == var22_19) {
                                            var20_17 = var20_17.zza;
                                            var20_17.zzK(var11_9);
                                            var22_19 = var20_17.zzg();
                                            var21_18 = var20_17.zzg() + -1;
                                            var11_9 = var20_17.zzg();
                                            var23_20 = var20_17.zzg();
                                            var24_21 /* !! */  = var20_17.zzg();
                                            var25_22 /* !! */  = var22_19;
                                            var26_23 /* !! */  = new zzajy(var21_18, var11_9, var23_20, var24_21 /* !! */ );
                                            var20_17 = Pair.create((Object)var25_22 /* !! */ , (Object)var26_23 /* !! */ );
                                            var25_22 /* !! */  = (Integer)var20_17.first;
                                            var22_19 = var25_22 /* !! */ .intValue();
                                            var20_17 = (zzajy)var20_17.second;
                                            var13_11.put(var22_19, var20_17);
                                        } else {
                                            var22_19 = 1835362404;
                                            if (var21_18 == var22_19) {
                                                var20_17 = var20_17.zza;
                                                var20_17.zzK(var4_3);
                                                var22_19 = zzajo.zze(var20_17.zzg());
                                                var27_24 = var22_19 == 0 ? var20_17.zzu() : var20_17.zzv();
                                                var16_14 = var27_24;
                                            }
                                        }
                                        var24_21 /* !! */  = 1;
                                        var11_9 = 12;
                                    }
                                    var12_10 = new zzaej();
                                    var20_17 = new zzaka((zzakd)var3_2);
                                    var15_13 = 0;
                                    var14_12 = null;
                                    var18_15 = 0;
                                    var19_16 = null;
                                    var29_25 = var5_4;
                                    var25_22 /* !! */  = var13_11;
                                    var13_11 = var20_17;
                                    var20_17 = zzajw.zzd((zzajm)var10_8, (zzaej)var12_10, var16_14, (zzae)var5_4, false, false, (zzfxu)var20_17);
                                    var23_20 = var20_17.size();
                                    var26_23 /* !! */  = var3_2.zzf;
                                    var30_26 = var26_23 /* !! */ .size();
                                    if (var30_26 == 0) {
                                        var31_27 = null;
                                        for (var21_18 = 0; var21_18 < var23_20; var12_10 = var12_10.zzw(var21_18, var32_28), var21_18 += var30_26) {
                                            var26_23 /* !! */  = (zzaks)var20_17.get(var21_18);
                                            var5_4 = var26_23 /* !! */ .zza;
                                            var12_10 = var3_2.zzF;
                                            var32_28 = var5_4.zzb;
                                            var32_28 = var5_4.zza;
                                            var33_29 = zzakd.zzk((SparseArray)var25_22 /* !! */ , var32_28);
                                            var10_8 = new zzakc((zzafa)var12_10, (zzaks)var26_23 /* !! */ , (zzajy)var33_29);
                                            var26_23 /* !! */  = var3_2.zzf;
                                            var9_7 /* !! */  = var5_4.zza;
                                            var26_23 /* !! */ .put((int)var9_7 /* !! */ , var10_8);
                                            var34_30 = var3_2.zzy;
                                            var36_31 = var5_4.zze;
                                            var3_2.zzy = var36_31 = Math.max(var34_30, var36_31);
                                            var30_26 = 1;
                                        }
                                        var20_17 = var3_2.zzF;
                                        var20_17.zzD();
                                        continue;
                                    }
                                    var26_23 /* !! */  = var3_2.zzf;
                                    var30_26 = var26_23 /* !! */ .size();
                                    if (var30_26 == var23_20) {
                                        var30_26 = 1;
                                    } else {
                                        var30_26 = 0;
                                        var26_23 /* !! */  = null;
                                    }
                                    zzeq.zzf((boolean)var30_26);
                                    var21_18 = 0;
                                    var31_27 = null;
                                    while (true) {
                                        if (var21_18 >= var23_20) ** break;
                                        var26_23 /* !! */  = (zzaks)var20_17.get(var21_18);
                                        var5_4 = var26_23 /* !! */ .zza;
                                        var10_8 = var3_2.zzf;
                                        var9_7 /* !! */  = var5_4.zza;
                                        var10_8 = (zzakc)var10_8.get((int)var9_7 /* !! */ );
                                        var6_5 = var5_4.zza;
                                        var5_4 = zzakd.zzk((SparseArray)var25_22 /* !! */ , var6_5);
                                        var10_8.zzh((zzaks)var26_23 /* !! */ , (zzajy)var5_4);
                                        var30_26 = 1;
                                        var21_18 += var30_26;
                                    }
                                    break;
                                }
                                var20_17 = var3_2.zzf;
                                var25_22 /* !! */  = var3_2.zzj;
                                var38_32 = var10_8.zzc;
                                var23_20 = var38_32.size();
                                var30_26 = 0;
                                var26_23 /* !! */  = null;
                                block5: while (true) {
                                    block96: {
                                        block95: {
                                            if (var30_26 >= var23_20) break block95;
                                            var12_10 = (zzajm)var10_8.zzc.get(var30_26);
                                            var11_9 = var12_10.zzd;
                                            var15_13 = 1953653094;
                                            if (var11_9 != var15_13) ** GOTO lbl-1000
                                            var11_9 = 1952868452;
                                            var29_25 = var12_10.zzb(var11_9);
                                            var29_25.getClass();
                                            var29_25 = var29_25.zza;
                                            var29_25.zzK(var4_3);
                                            var15_13 = var29_25.zzg();
                                            var18_15 = var29_25.zzg();
                                            var19_16 = (zzakc)var20_17.get(var18_15);
                                            if (var19_16 == null) {
                                                var18_15 = 0;
                                                var19_16 = null;
                                            } else {
                                                var39_33 = 1;
                                                var21_18 = var15_13 & 1;
                                                if (var21_18 != 0) {
                                                    var40_34 = var29_25.zzv();
                                                    var33_29 = var19_16.zzb;
                                                    var33_29.zzb = var40_34;
                                                    var33_29.zzc = var40_34;
                                                }
                                                var33_29 = var19_16.zze;
                                                var42_35 /* !! */  = 2;
                                                var39_33 = var15_13 & 2;
                                                var42_35 /* !! */  = var39_33 != 0 ? var29_25.zzg() + -1 : var33_29.zza;
                                                var39_33 = var15_13 & 8;
                                                var39_33 = var39_33 != 0 ? var29_25.zzg() : var33_29.zzb;
                                                var21_18 = 16;
                                                var43_36 = var15_13 & 16;
                                                var21_18 = var43_36 != 0 ? var29_25.zzg() : var33_29.zzc;
                                                var32_28 = (var15_13 &= 32) != 0 ? var29_25.zzg() : var33_29.zzd;
                                                var29_25 = var19_16.zzb;
                                                var29_25.zza = var14_12 = new zzajy(var42_35 /* !! */ , var39_33, var21_18, var32_28);
                                            }
                                            if (var19_16 == null) lbl-1000:
                                            // 2 sources

                                            {
                                                var44_37 = var20_17;
                                                var45_38 = var25_22 /* !! */ ;
                                                var46_39 = var23_20;
                                                var47_40 = var30_26;
                                                var48_41 = var10_8;
                                                var23_20 = 1;
                                                var4_3 = 2;
                                                var30_26 = 8;
                                                var6_5 = 0;
                                                var5_4 = null;
                                                var49_42 = 12;
                                                var32_28 = 4;
                                                break block96;
                                            } else {
                                                var33_29 = var19_16.zzb;
                                                var50_43 = var33_29.zzp;
                                                var15_13 = (int)var33_29.zzq;
                                                var19_16.zzi();
                                                var39_33 = 1;
                                                zzakc.zzg(var19_16, (boolean)var39_33);
                                                var21_18 = 0x74666474;
                                                var31_27 = var12_10.zzb(var21_18);
                                                if (var31_27 != null) {
                                                    var45_38 = var31_27.zza;
                                                    var45_38.zzK(var4_3);
                                                    var11_9 = zzajo.zze(var45_38.zzg());
                                                    var50_43 = var11_9 == var39_33 ? var45_38.zzv() : var45_38.zzu();
                                                    var33_29.zzp = var50_43;
                                                    var33_29.zzq = var39_33;
                                                    break;
                                                } else {
                                                    var33_29.zzp = var50_43;
                                                    var33_29.zzq = var15_13;
                                                    break;
                                                }
                                            }
                                        }
                                        var3_2 = var10_8;
                                        var22_19 = 0;
                                        var25_22 /* !! */  = null;
                                        var4_3 = 2;
                                        var30_26 = 8;
                                        var6_5 = 0;
                                        var5_4 = null;
                                        var32_28 = 4;
                                        var11_9 = 16;
                                        var3_2 = zzakd.zzg(var10_8.zzb);
                                        var20_17 = this;
                                        if (var3_2 == null) break block89;
                                        var38_32 = this.zzf;
                                        var23_20 = var38_32.size();
                                        var10_8 = null;
                                        break block90;
                                    }
lbl230:
                                    // 2 sources

                                    while (true) {
                                        var11_9 = 16;
                                        var60_52 /* !! */  = var47_40 + 1;
                                        var4_3 = 8;
                                        var30_26 = (int)var60_52 /* !! */ ;
                                        var25_22 /* !! */  = var45_38;
                                        var20_17 = var44_37;
                                        var23_20 = var46_39;
                                        var10_8 = var48_41;
                                        var3_2 = this;
                                        continue block5;
                                        break;
                                    }
                                    break;
                                }
                                var45_38 = var12_10.zzb;
                                var11_9 = var45_38.size();
                                var15_13 = 0;
                                var14_12 = null;
                                var39_33 = 0;
                                var13_11 = null;
                                var21_18 = 0;
                                var31_27 = null;
                                while (true) {
                                    var6_5 = 1953658222;
                                    if (var15_13 >= var11_9) break;
                                    var52_44 = var44_37 = var45_38.get(var15_13);
                                    var52_44 = (zzajn)var44_37;
                                    var44_37 = var20_17;
                                    var24_21 /* !! */  = var52_44.zzd;
                                    if (var24_21 /* !! */  != var6_5) ** GOTO lbl-1000
                                    var20_17 = var52_44.zza;
                                    var4_3 = 12;
                                    var20_17.zzK(var4_3);
                                    var24_21 /* !! */  = var20_17.zzp();
                                    if (var24_21 /* !! */  > 0) {
                                        var21_18 += var24_21 /* !! */ ;
                                        var24_21 /* !! */  = 1;
                                        var39_33 += var24_21 /* !! */ ;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var24_21 /* !! */  = 1;
                                    }
                                    var15_13 += var24_21 /* !! */ ;
                                    var20_17 = var44_37;
                                    var4_3 = 8;
                                }
                                var44_37 = var20_17;
                                var24_21 /* !! */  = 0;
                                var19_16.zzh = 0;
                                var19_16.zzg = 0;
                                var19_16.zzf = 0;
                                var20_17 = var19_16.zzb;
                                var20_17.zzd = var39_33;
                                var20_17.zze = var21_18;
                                var52_44 = var20_17.zzg;
                                var4_3 = ((Object)var52_44).length;
                                if (var4_3 < var39_33) {
                                    var52_44 = new long[var39_33];
                                    var20_17.zzf = (long[])var52_44;
                                    var52_44 = new int[var39_33];
                                    var20_17.zzg = (int[])var52_44;
                                }
                                if ((var4_3 = ((Object)(var52_44 = (Object)var20_17.zzh)).length) < var21_18) {
                                    var21_18 = var21_18 * 125 / 100;
                                    var52_44 = new int[var21_18];
                                    var20_17.zzh = (int[])var52_44;
                                    var52_44 = new long[var21_18];
                                    var20_17.zzi = (long[])var52_44;
                                    var52_44 = new boolean[var21_18];
                                    var20_17.zzj = (boolean[])var52_44;
                                    var52_44 = new boolean[var21_18];
                                    var20_17.zzl = (boolean[])var52_44;
                                }
                                var24_21 /* !! */  = 0;
                                var20_17 = null;
                                var4_3 = 0;
                                var52_44 = null;
                                var15_13 = 0;
                                var14_12 = null;
                                while (true) {
                                    block106: {
                                        block105: {
                                            block97: {
                                                block98: {
                                                    block104: {
                                                        block103: {
                                                            block100: {
                                                                block99: {
                                                                    block102: {
                                                                        block101: {
                                                                            if (var24_21 /* !! */  >= var11_9) break block97;
                                                                            var53_45 = var45_38.get(var24_21 /* !! */ );
                                                                            var13_11 = var53_45;
                                                                            var13_11 = (zzajn)var53_45;
                                                                            var21_18 = var13_11.zzd;
                                                                            if (var21_18 != var6_5) break block98;
                                                                            var54_46 = var4_3 + 1;
                                                                            var13_11 = var13_11.zza;
                                                                            var13_11.zzK(8);
                                                                            var21_18 = var13_11.zzg();
                                                                            var5_4 = var19_16.zzd.zza;
                                                                            var46_39 = var23_20;
                                                                            var38_32 = var19_16.zzb;
                                                                            var55_47 = var45_38;
                                                                            var45_38 = var38_32.zza;
                                                                            var56_48 = zzgd.zza;
                                                                            var56_48 = var11_9;
                                                                            var29_25 = var38_32.zzg;
                                                                            var57_49 = var13_11.zzp();
                                                                            var29_25[var4_3] = var57_49;
                                                                            var29_25 = var38_32.zzf;
                                                                            var48_41 = var10_8;
                                                                            var58_50 = var12_10;
                                                                            var34_30 = var38_32.zzb;
                                                                            var29_25[var4_3] = var34_30;
                                                                            var59_51 = var21_18 & 1;
                                                                            if (var59_51 != 0) {
                                                                                var60_52 /* !! */  = var13_11.zzg();
                                                                                var59_51 = var24_21 /* !! */ ;
                                                                                var61_53 = var60_52 /* !! */ ;
                                                                                var29_25[var4_3] = var34_30 += var61_53;
                                                                            } else {
                                                                                var59_51 = var24_21 /* !! */ ;
                                                                            }
                                                                            var60_52 /* !! */  = 4;
                                                                            var63_54 = 5.6E-45f;
                                                                            var24_21 /* !! */  = var21_18 & 4;
                                                                            if (var24_21 /* !! */  != 0) {
                                                                                var60_52 /* !! */  = 1;
                                                                                var63_54 = 1.4E-45f;
                                                                            } else {
                                                                                var60_52 /* !! */  = 0;
                                                                                var63_54 = 0.0f;
                                                                                var3_2 = null;
                                                                            }
                                                                            var24_21 /* !! */  = var45_38.zzd;
                                                                            if (var60_52 /* !! */  != false) {
                                                                                var24_21 /* !! */  = var13_11.zzg();
                                                                            }
                                                                            var49_42 = var21_18 & 256;
                                                                            var9_7 /* !! */  = var21_18 & 512;
                                                                            var11_9 = var21_18 & 1024;
                                                                            var21_18 &= 2048;
                                                                            var64_55 = var24_21 /* !! */ ;
                                                                            var20_17 = var5_4.zzh;
                                                                            if (var20_17 == null) break block99;
                                                                            var47_40 = var30_26;
                                                                            var30_26 = ((Object)var20_17).length;
                                                                            var65_56 = var25_22 /* !! */ ;
                                                                            var22_19 = 1;
                                                                            if (var30_26 != var22_19 || (var25_22 /* !! */  = (byte[])var5_4.zzi) == null) break block100;
                                                                            var30_26 = 0;
                                                                            var26_23 /* !! */  = null;
                                                                            var69_59 = var20_17[0];
                                                                            var67_58 = 0L;
                                                                            cfr_temp_1 = var69_59 - var67_58;
                                                                            var24_21 /* !! */  = (int)(cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1));
                                                                            if (var24_21 /* !! */  != 0) break block101;
                                                                            var66_57 /* !! */  = var9_7 /* !! */ ;
                                                                            var26_23 /* !! */  = var33_29;
                                                                            break block102;
                                                                        }
                                                                        var27_24 = var25_22 /* !! */ [0];
                                                                        var71_60 = var69_59 + var27_24;
                                                                        var27_24 = var5_4.zzd;
                                                                        var73_61 /* !! */  = RoundingMode.FLOOR;
                                                                        var74_62 = 1000000L;
                                                                        var27_24 = zzgd.zzt((long)var71_60, var74_62, var27_24, (RoundingMode)var73_61 /* !! */ );
                                                                        var66_57 /* !! */  = var9_7 /* !! */ ;
                                                                        var26_23 /* !! */  = var33_29;
                                                                        var76_63 = var5_4.zze;
                                                                        cfr_temp_2 = var27_24 - var76_63;
                                                                        var78_64 = (boolean)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                                                        if (var78_64 < false) break block103;
                                                                    }
                                                                    var20_17 = var5_4.zzi;
                                                                    var22_19 = 0;
                                                                    var25_22 /* !! */  = null;
                                                                    var67_58 = var76_63 = (long)var20_17[0];
                                                                    break block104;
                                                                }
                                                                var65_56 = var25_22 /* !! */ ;
                                                                var47_40 = var30_26;
                                                            }
                                                            var66_57 /* !! */  = var9_7 /* !! */ ;
                                                            var26_23 /* !! */  = var33_29;
                                                        }
                                                        var67_58 = 0L;
                                                    }
                                                    var20_17 = var38_32.zzh;
                                                    var25_22 /* !! */  = (byte[])var38_32.zzi;
                                                    var12_10 = var38_32.zzj;
                                                    var4_3 = var38_32.zzg[var4_3] + var15_13;
                                                    var33_29 = var26_23 /* !! */ ;
                                                    var36_31 = var5_4.zzc;
                                                    var73_61 /* !! */  = var12_10;
                                                    var79_65 = var26_23 /* !! */ ;
                                                    var76_63 = var38_32.zzp;
                                                    break block105;
                                                }
                                                var59_51 = var24_21 /* !! */ ;
                                                var65_56 = var25_22 /* !! */ ;
                                                var46_39 = var23_20;
                                                var47_40 = var30_26;
                                                var48_41 = var10_8;
                                                var58_50 = var12_10;
                                                var79_65 = var33_29;
                                                var55_47 = var45_38;
                                                var56_48 = var11_9;
                                                var30_26 = 1;
                                                break block106;
                                            }
                                            var65_56 = var25_22 /* !! */ ;
                                            var46_39 = var23_20;
                                            var47_40 = var30_26;
                                            var48_41 = var10_8;
                                            var58_50 = var12_10;
                                            var79_65 = var33_29;
                                            var3_2 = var19_16.zzd.zza;
                                            var20_17 = var33_29;
                                            var25_22 /* !! */  = var33_29.zza;
                                            var25_22 /* !! */ .getClass();
                                            var22_19 = var25_22 /* !! */ .zza;
                                            var3_2 = var3_2.zza(var22_19);
                                            var22_19 = 1935763834;
                                            var25_22 /* !! */  = var12_10.zzb(var22_19);
                                            if (var25_22 /* !! */  == null) break block91;
                                            var3_2.getClass();
                                            var25_22 /* !! */  = var25_22 /* !! */ .zza;
                                            var23_20 = 8;
                                            var25_22 /* !! */ .zzK(var23_20);
                                            var4_3 = var25_22 /* !! */ .zzg();
                                            var30_26 = 1;
                                            if ((var4_3 &= var30_26) == var30_26) {
                                                var25_22 /* !! */ .zzL(var23_20);
                                            }
                                            var23_20 = var25_22 /* !! */ .zzm();
                                            var4_3 = var25_22 /* !! */ .zzp();
                                            if (var4_3 > (var30_26 = var20_17.zze)) {
                                                var3_2 = new StringBuilder("Saiz sample count ");
                                                var3_2.append(var4_3);
                                                var3_2.append(" is greater than fragment sample count");
                                                var3_2.append(var30_26);
                                                throw zzch.zza(var3_2.toString(), null);
                                            }
                                            var30_26 = var3_2.zzd;
                                            if (var23_20 == 0) {
                                                var38_32 = var20_17.zzl;
                                                var5_4 = null;
                                                var49_42 = 0;
                                                var10_8 = null;
                                                break;
                                            }
                                            if (var23_20 > var30_26) {
                                                var22_19 = 1;
                                            } else {
                                                var22_19 = 0;
                                                var25_22 /* !! */  = null;
                                            }
                                            var49_42 = var23_20 * var4_3;
                                            var38_32 = var20_17.zzl;
                                            var30_26 = 0;
                                            var26_23 /* !! */  = null;
                                            Arrays.fill((boolean[])var38_32, 0, var4_3, (boolean)var22_19);
                                            break block92;
                                        }
                                        while (var15_13 < var4_3) {
                                            block108: {
                                                block107: {
                                                    if (var49_42 != 0) {
                                                        var78_64 = var13_11.zzg();
                                                        var80_66 = var4_3;
                                                        var4_3 = var78_64;
                                                    } else {
                                                        var80_66 = var4_3;
                                                        var4_3 = var45_38.zzb;
                                                    }
                                                    zzakd.zza(var4_3);
                                                    if (var66_57 /* !! */  != false) {
                                                        var78_64 = var13_11.zzg();
                                                        var81_67 = var49_42;
                                                        var49_42 = var78_64;
                                                    } else {
                                                        var81_67 = var49_42;
                                                        var49_42 = var45_38.zzc;
                                                    }
                                                    zzakd.zza(var49_42);
                                                    if (var11_9 == 0) break block107;
                                                    var78_64 = var13_11.zzg();
                                                    var82_68 = var60_52 /* !! */ ;
                                                    var83_69 = var63_54;
                                                    var60_52 /* !! */  = (long)var78_64;
                                                    break block108;
                                                }
                                                var82_68 = var60_52 /* !! */ ;
                                                var83_69 = var63_54;
                                                if (var15_13 != 0) ** GOTO lbl513
                                                if (var60_52 /* !! */  != false) {
                                                    var60_52 /* !! */  = var64_55;
                                                    var15_13 = 0;
                                                    var14_12 = null;
                                                } else {
                                                    var15_13 = 0;
                                                    var14_12 = null;
lbl513:
                                                    // 2 sources

                                                    var60_52 /* !! */  = var45_38.zzd;
                                                }
                                            }
                                            if (var21_18 != 0) {
                                                var78_64 = var13_11.zzg();
                                                var84_70 = var45_38;
                                                var85_71 = var11_9;
                                                var42_35 /* !! */  = var78_64;
                                            } else {
                                                var84_70 = var45_38;
                                                var85_71 = var11_9;
                                                var42_35 /* !! */  = 0;
                                                var45_38 = null;
                                            }
                                            var86_72 = (long)var42_35 /* !! */  + var76_63 - var67_58;
                                            var88_73 = 1000000L;
                                            var90_74 /* !! */  = RoundingMode.FLOOR;
                                            var50_43 = zzgd.zzt(var86_72, var88_73, var36_31, (RoundingMode)var90_74 /* !! */ );
                                            var25_22 /* !! */ [var15_13] = (byte)var50_43;
                                            var86_72 = var36_31;
                                            var30_26 = (int)var38_32.zzq;
                                            if (var30_26 == 0) {
                                                var26_23 /* !! */  = var19_16.zzd;
                                                var36_31 = var26_23 /* !! */ .zzh;
                                                var25_22 /* !! */ [var15_13] = (byte)(var50_43 += var36_31);
                                            }
                                            var20_17[var15_13] = var49_42;
                                            var60_52 /* !! */  >>= 16;
                                            var30_26 = 1;
                                            if (var30_26 != (var60_52 /* !! */  = (long)(var60_52 /* !! */  & var30_26 ^ var30_26))) {
                                                var60_52 /* !! */  = 0;
                                                var63_54 = 0.0f;
                                                var3_2 = null;
                                            } else {
                                                var60_52 /* !! */  = 1;
                                                var63_54 = 1.4E-45f;
                                            }
                                            var73_61 /* !! */ [var15_13] = var60_52 /* !! */ ;
                                            var7_6 = var4_3;
                                            var76_63 += var7_6;
                                            var15_13 += var30_26;
                                            var36_31 = var86_72;
                                            var4_3 = var80_66;
                                            var49_42 = var81_67;
                                            var60_52 /* !! */  = var82_68;
                                            var63_54 = var83_69;
                                            var45_38 = var84_70;
                                            var11_9 = var85_71;
                                        }
                                        var80_66 = var4_3;
                                        var30_26 = 1;
                                        var38_32.zzp = var76_63;
                                        var4_3 = var54_46;
                                        var15_13 = var80_66;
                                    }
                                    var24_21 /* !! */  = var59_51 + 1;
                                    var3_2 = this;
                                    var23_20 = var46_39;
                                    var45_38 = var55_47;
                                    var11_9 = var56_48;
                                    var10_8 = var48_41;
                                    var12_10 = var58_50;
                                    var30_26 = var47_40;
                                    var25_22 /* !! */  = var65_56;
                                    var33_29 = var79_65;
                                    var6_5 = 1953658222;
                                }
                                for (var6_5 = 0; var6_5 < var4_3; var6_5 += var32_28) {
                                    var32_28 = var25_22 /* !! */ .zzm();
                                    var49_42 += var32_28;
                                    if (var32_28 > var30_26) {
                                        var32_28 = 1;
                                    } else {
                                        var32_28 = 0;
                                        var33_29 = null;
                                    }
                                    var38_32[var6_5] = var32_28;
                                    var32_28 = 1;
                                }
                                var30_26 = 0;
                                var26_23 /* !! */  = null;
                            }
                            var25_22 /* !! */  = (byte[])var20_17.zzl;
                            var23_20 = var20_17.zze;
                            Arrays.fill((boolean[])var25_22 /* !! */ , var4_3, var23_20, false);
                            if (var49_42 > 0) {
                                var20_17.zza(var49_42);
                            }
                        }
                        if ((var25_22 /* !! */  = var12_10.zzb(var22_19 = 1935763823)) != null) {
                            var25_22 /* !! */  = var25_22 /* !! */ .zza;
                            var23_20 = 8;
                            var25_22 /* !! */ .zzK(var23_20);
                            var4_3 = var25_22 /* !! */ .zzg();
                            var30_26 = 1;
                            var6_5 = var4_3 & 1;
                            if (var6_5 == var30_26) {
                                var25_22 /* !! */ .zzL(var23_20);
                            }
                            if ((var23_20 = var25_22 /* !! */ .zzp()) != var30_26) {
                                var3_2 = new StringBuilder("Unexpected saio entry count: ");
                                var3_2.append(var23_20);
                                throw zzch.zza(var3_2.toString(), null);
                            }
                            var23_20 = zzajo.zze(var4_3);
                            var91_75 = var20_17.zzc;
                            var93_76 = var23_20 == 0 ? var25_22 /* !! */ .zzu() : var25_22 /* !! */ .zzv();
                            var20_17.zzc = var91_75 += var93_76;
                        }
                        var22_19 = 0;
                        var25_22 /* !! */  = null;
                        var23_20 = 1936027235;
                        var38_32 = var12_10.zzb(var23_20);
                        if (var38_32 != null) {
                            var38_32 = var38_32.zza;
                            var4_3 = 0;
                            var52_44 = null;
                            zzakd.zzi((zzfu)var38_32, 0, (zzakr)var20_17);
                        }
                        var95_77 = var3_2 != null ? (var3_2 = var3_2.zzb) : null;
                        var60_52 /* !! */  = 0;
                        var3_2 = null;
                        var63_54 = 0.0f;
                        var23_20 = 0;
                        var38_32 = null;
                        var52_44 = null;
                        for (var4_3 = 0; var4_3 < (var30_26 = (var26_23 /* !! */  = var12_10.zzb).size()); var4_3 += var30_26) {
                            var26_23 /* !! */  = (zzajn)var12_10.zzb.get(var4_3);
                            var5_4 = var26_23 /* !! */ .zza;
                            var30_26 = var26_23 /* !! */ .zzd;
                            var49_42 = 1935828848;
                            var32_28 = 1936025959;
                            if (var30_26 == var49_42) {
                                var49_42 = 12;
                                var5_4.zzK(var49_42);
                                var30_26 = var5_4.zzg();
                                if (var30_26 == var32_28) {
                                    var3_2 = var5_4;
                                }
                            } else {
                                var49_42 = 12;
                                var42_35 /* !! */  = 1936158820;
                                if (var30_26 == var42_35 /* !! */ ) {
                                    var5_4.zzK(var49_42);
                                    var30_26 = var5_4.zzg();
                                    if (var30_26 == var32_28) {
                                        var38_32 = var5_4;
                                    }
                                }
                            }
                            var30_26 = 1;
                        }
                        var30_26 = 1;
                        var49_42 = 12;
                        if (var3_2 == null || var38_32 == null) {
                            var4_3 = 2;
                            var32_28 = 4;
                        } else {
                            var4_3 = 8;
                            var3_2.zzK(var4_3);
                            var6_5 = zzajo.zze(var3_2.zzg());
                            var32_28 = 4;
                            var3_2.zzL(var32_28);
                            if (var6_5 == var30_26) {
                                var3_2.zzL(var32_28);
                            }
                            if ((var60_52 /* !! */  = (long)var3_2.zzg()) != var30_26) {
                                throw zzch.zzc("Entry count in sbgp != 1 (unsupported).");
                            }
                            var38_32.zzK(var4_3);
                            var60_52 /* !! */  = zzajo.zze(var38_32.zzg());
                            var38_32.zzL(var32_28);
                            if (var60_52 /* !! */  == var30_26) {
                                var91_75 = var38_32.zzu();
                                cfr_temp_3 = var91_75 - (var50_43 = 0L);
                                var60_52 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                if (var60_52 /* !! */  == false) {
                                    throw zzch.zzc("Variable length description in sgpd found (unsupported)");
                                }
                                var4_3 = 2;
                            } else {
                                var4_3 = 2;
                                if (var60_52 /* !! */  >= var4_3) {
                                    var38_32.zzL(var32_28);
                                }
                            }
                            var36_31 = var38_32.zzu();
                            var50_43 = 1L;
                            var60_52 /* !! */  = var36_31 == var50_43 ? 0 : (var36_31 < var50_43 ? -1 : 1);
                            if (var60_52 /* !! */  != false) {
                                throw zzch.zzc("Entry count in sgpd != 1 (unsupported).");
                            }
                            var60_52 /* !! */  = 1;
                            var63_54 = 1.4E-45f;
                            var38_32.zzL((int)var60_52 /* !! */ );
                            var30_26 = var38_32.zzm();
                            var6_5 = var30_26 & 240;
                            var96_78 = var6_5 >> 4;
                            var97_79 = var30_26 & 15;
                            var30_26 = var38_32.zzm();
                            if (var30_26 == var60_52 /* !! */ ) {
                                var98_80 = var38_32.zzm();
                                var30_26 = 16;
                                var5_4 = new byte[var30_26];
                                var42_35 /* !! */  = 0;
                                var45_38 = null;
                                var38_32.zzG((byte[])var5_4, 0, var30_26);
                                if (var98_80 == 0) {
                                    var22_19 = var38_32.zzm();
                                    var26_23 /* !! */  = (SparseArray)new byte[var22_19];
                                    var38_32.zzG((byte[])var26_23 /* !! */ , 0, var22_19);
                                    var90_74 /* !! */  = var26_23 /* !! */ ;
                                } else {
                                    var90_74 /* !! */  = null;
                                }
                                var20_17.zzk = var60_52 /* !! */ ;
                                var78_64 = true;
                                var20_17.zzm = var3_2 = new zzakq(var78_64, (String)var95_77, var98_80, (byte[])var5_4, var96_78, var97_79, (byte[])var90_74 /* !! */ );
                            }
                        }
                        var3_2 = var12_10.zzb;
                        var60_52 /* !! */  = var3_2.size();
                        var25_22 /* !! */  = null;
                        for (var22_19 = 0; var22_19 < var60_52 /* !! */ ; var22_19 += var23_20) {
                            var38_32 = (zzajn)var12_10.zzb.get(var22_19);
                            var30_26 = var38_32.zzd;
                            var6_5 = 1970628964;
                            if (var30_26 == var6_5) {
                                var38_32 = var38_32.zza;
                                var30_26 = 8;
                                var38_32.zzK(var30_26);
                                var45_38 = var65_56;
                                var6_5 = 0;
                                var5_4 = null;
                                var11_9 = 16;
                                var38_32.zzG((byte[])var65_56, 0, var11_9);
                                var14_12 = zzakd.zzb;
                                var15_13 = (int)Arrays.equals((byte[])var65_56, (byte[])var14_12);
                                if (var15_13 != 0) {
                                    zzakd.zzi((zzfu)var38_32, var11_9, (zzakr)var20_17);
                                }
                            } else {
                                var45_38 = var65_56;
                                var30_26 = 8;
                                var6_5 = 0;
                                var5_4 = null;
                                var11_9 = 16;
                            }
                            var23_20 = 1;
                            var65_56 = var45_38;
                        }
                        var45_38 = var65_56;
                        var23_20 = 1;
                        var30_26 = 8;
                        var6_5 = 0;
                        var5_4 = null;
                        ** continue;
                    }
                    for (var49_42 = 0; var49_42 < var23_20; var49_42 += var9_7 /* !! */ ) {
                        var12_10 = (zzakc)var20_17.zzf.valueAt(var49_42);
                        var45_38 = var12_10.zzd.zza;
                        var14_12 = var12_10.zzb.zza;
                        var18_15 = zzgd.zza;
                        var15_13 = var14_12.zza;
                        if ((var45_38 = var45_38.zza(var15_13)) != null) {
                            var45_38 = var45_38.zzb;
                        } else {
                            var42_35 /* !! */  = 0;
                            var45_38 = null;
                        }
                        var45_38 = var3_2.zzb((String)var45_38);
                        var14_12 = var12_10.zzd.zza.zzf.zzb();
                        var14_12.zzE((zzae)var45_38);
                        var45_38 = var14_12.zzad();
                        var12_10 = var12_10.zza;
                        var12_10.zzl((zzan)var45_38);
                        var9_7 /* !! */  = 1;
                    }
                }
                if ((var60_52 /* !! */  = (cfr_temp_4 = (var93_76 = var20_17.zzx) - (var34_30 = -9223372036854775807L)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) != false) {
                    var3_2 = var20_17.zzf;
                    var60_52 /* !! */  = var3_2.size();
                    var31_27 = null;
                    for (var21_18 = 0; var21_18 < var60_52 /* !! */ ; var21_18 += var9_7 /* !! */ ) {
                        var25_22 /* !! */  = (zzakc)var20_17.zzf.valueAt(var21_18);
                        var7_6 = var20_17.zzx;
                        var23_20 = var25_22 /* !! */ .zzf;
                        while (true) {
                            var12_10 = var25_22 /* !! */ .zzb;
                            var42_35 /* !! */  = var12_10.zze;
                            if (var23_20 >= var42_35 /* !! */  || (var42_35 /* !! */  = (int)((cfr_temp_5 = (var99_81 = (var45_38 = (Object)var12_10.zzi)[var23_20]) - var7_6) == 0 ? 0 : (cfr_temp_5 < 0 ? -1 : 1))) > 0) break;
                            var12_10 = var12_10.zzj;
                            var9_7 /* !! */  = (long)var12_10[var23_20];
                            if (var9_7 /* !! */  != false) {
                                var25_22 /* !! */ .zzi = var23_20;
                            }
                            var9_7 /* !! */  = 1;
                            var23_20 += var9_7 /* !! */ ;
                        }
                        var9_7 /* !! */  = 1;
                    }
                    var93_76 = -9223372036854775807L;
                    var9_7 /* !! */  = 1;
                    var20_17.zzx = var93_76;
                }
            }
            var3_2 = var20_17;
        }
    }

    private static final zzajy zzk(SparseArray object, int n3) {
        int n4;
        int n7 = object.size();
        if (n7 == (n4 = 1)) {
            return (zzajy)object.valueAt(0);
        }
        object = (zzajy)object.get(n3);
        object.getClass();
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int zzb(zzadv var1_1, zzaeq var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        while (true) {
            block65: {
                block78: {
                    block76: {
                        block82: {
                            block80: {
                                block81: {
                                    block79: {
                                        block77: {
                                            block66: {
                                                block67: {
                                                    block73: {
                                                        block72: {
                                                            block68: {
                                                                var5_5 = var3_3.zzq;
                                                                var6_6 = 1701671783;
                                                                var7_7 = 1936286840;
                                                                var8_8 = 2;
                                                                var9_9 = 0;
                                                                var10_10 = 1;
                                                                var11_11 = 0;
                                                                var12_12 /* !! */  = null;
                                                                if (var5_5 == 0) break block65;
                                                                var13_13 = "FragmentedMp4Extractor";
                                                                if (var5_5 == var10_10) break block66;
                                                                var14_14 = 0x7FFFFFFFFFFFFFFFL;
                                                                var16_15 = 3;
                                                                if (var5_5 == var8_8) break block67;
                                                                var17_16 /* !! */  = (byte[])var3_3.zzA;
                                                                if (var17_16 /* !! */  != null) break block68;
                                                                var17_16 /* !! */  = (byte[])var3_3.zzf;
                                                                var18_17 = var17_16 /* !! */ .size();
                                                                var19_18 = var14_14;
                                                                var6_6 = 0;
                                                                var21_19 = null;
                                                                var22_20 = null;
                                                                for (var7_7 = 0; var7_7 < var18_17; ++var7_7) {
                                                                    block70: {
                                                                        block71: {
                                                                            block69: {
                                                                                var24_22 = var23_21 = var17_16 /* !! */ .valueAt(var7_7);
                                                                                var24_22 = (zzakc)var23_21;
                                                                                var25_23 = zzakc.zzj((zzakc)var24_22);
                                                                                if (var25_23 != 0) break block69;
                                                                                var26_24 = var24_22.zzf;
                                                                                var27_25 = var24_22.zzd;
                                                                                var28_26 = var27_25.zzb;
                                                                                if (var26_24 == var28_26) break block70;
                                                                            }
                                                                            if ((var28_26 = (int)zzakc.zzj((zzakc)var24_22)) == 0) break block71;
                                                                            var28_26 = var24_22.zzh;
                                                                            var29_27 = var24_22.zzb;
                                                                            var26_24 = var29_27.zzd;
                                                                            if (var28_26 == var26_24) break block70;
                                                                        }
                                                                        if ((var28_26 = (int)((cfr_temp_0 = (var30_28 = var24_22.zzd()) - var19_18) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) < 0) {
                                                                            var21_19 = var24_22;
                                                                            var19_18 = var30_28;
                                                                        }
                                                                    }
                                                                    var8_8 = 2;
                                                                }
                                                                if (var21_19 == null) {
                                                                    var32_29 = var3_3.zzv;
                                                                    var34_30 = var1_1.zzf();
                                                                    var6_6 = (int)(var32_29 -= var34_30);
                                                                    if (var6_6 >= 0) {
                                                                        var17_16 /* !! */  = var4_4;
                                                                        var17_16 /* !! */  = (zzadi)var4_4;
                                                                        var17_16 /* !! */ .zzo(var6_6, false);
                                                                        this.zzh();
                                                                        continue;
                                                                    }
                                                                    throw zzch.zza("Offset to end of mdat was negative.", null);
                                                                }
                                                                var34_30 = var21_19.zzd();
                                                                var36_31 = var1_1.zzf();
                                                                var5_5 = (int)(var34_30 -= var36_31);
                                                                if (var5_5 < 0) {
                                                                    zzfk.zzf((String)var13_13, "Ignoring negative offset to sample data.");
                                                                    var5_5 = 0;
                                                                    var17_16 /* !! */  = null;
                                                                }
                                                                var22_20 = var4_4;
                                                                var22_20 = (zzadi)var4_4;
                                                                var22_20.zzo(var5_5, false);
                                                                var3_3.zzA = var21_19;
                                                                var17_16 /* !! */  = var21_19;
                                                            }
                                                            var6_6 = var3_3.zzq;
                                                            var7_7 = 6;
                                                            if (var6_6 == var16_15) {
                                                                var3_3.zzB = var6_6 = var17_16 /* !! */ .zzb();
                                                                var8_8 = var17_16 /* !! */ .zzf;
                                                                var28_26 = var17_16 /* !! */ .zzi;
                                                                if (var8_8 < var28_26) {
                                                                    ((zzadi)var4_4).zzo(var6_6, false);
                                                                    var4_4 = var17_16 /* !! */ .zzf();
                                                                    if (var4_4 != null) {
                                                                        var21_19 = var17_16 /* !! */ .zzb.zzn;
                                                                        var38_59 = var4_4.zzd;
                                                                        if (var38_59 != 0) {
                                                                            var21_19.zzL(var38_59);
                                                                        }
                                                                        if ((var38_59 = (int)(var4_4 = var17_16 /* !! */ .zzb).zzb(var8_8 = var17_16 /* !! */ .zzf)) != 0) {
                                                                            var38_59 = var21_19.zzq() * 6;
                                                                            var21_19.zzL(var38_59);
                                                                        }
                                                                    }
                                                                    var38_59 = var17_16 /* !! */ .zzk();
                                                                    if (var38_59 == 0) {
                                                                        var3_3.zzA = null;
                                                                    }
lbl95:
                                                                    // 5 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var24_22 = var17_16 /* !! */ .zzd.zza;
                                                                var8_8 = var24_22.zzg;
                                                                if (var8_8 == var10_10) {
                                                                    var3_3.zzB = var6_6 += -8;
                                                                    var21_19 = var4_4;
                                                                    var21_19 = (zzadi)var4_4;
                                                                    var8_8 = 8;
                                                                    var21_19.zzo(var8_8, false);
                                                                }
                                                                var21_19 = var17_16 /* !! */ .zzd.zza.zzf;
                                                                var24_22 = "audio/ac4";
                                                                var21_19 = var21_19.zzn;
                                                                var6_6 = (int)var24_22.equals(var21_19);
                                                                if (var6_6 != 0) {
                                                                    var6_6 = var3_3.zzB;
                                                                    var8_8 = 7;
                                                                    var3_3.zzC = var6_6 = var17_16 /* !! */ .zzc(var6_6, var8_8);
                                                                    var6_6 = var3_3.zzB;
                                                                    var27_25 = var3_3.zzk;
                                                                    zzacw.zzb(var6_6, (zzfu)var27_25);
                                                                    var21_19 = var17_16 /* !! */ .zza;
                                                                    var27_25 = var3_3.zzk;
                                                                    var21_19.zzq((zzfu)var27_25, var8_8);
                                                                    var3_3.zzC = var6_6 = var3_3.zzC + var8_8;
                                                                } else {
                                                                    var6_6 = var3_3.zzB;
                                                                    var3_3.zzC = var6_6 = var17_16 /* !! */ .zzc(var6_6, 0);
                                                                }
                                                                var3_3.zzB = var8_8 = var3_3.zzB + var6_6;
                                                                var3_3.zzq = var6_6 = 4;
                                                                var3_3.zzD = 0;
                                                            }
                                                            var21_19 = var17_16 /* !! */ .zzd.zza;
                                                            var24_22 = var17_16 /* !! */ .zza;
                                                            var39_32 = var17_16 /* !! */ .zze();
                                                            var28_26 = var21_19.zzj;
                                                            if (var28_26 != 0) break block72;
                                                            while ((var6_6 = var3_3.zzC) < (var7_7 = var3_3.zzB)) {
                                                                var7_7 -= var6_6;
                                                                var6_6 = var24_22.zzf((zzu)var4_4, var7_7, false);
                                                                var3_3.zzC = var7_7 = var3_3.zzC + var6_6;
                                                            }
                                                            break block73;
                                                        }
                                                        var41_33 = var3_3.zzh.zzM();
                                                        var41_33[0] = 0;
                                                        var41_33[var10_10] = 0;
                                                        var41_33[2] = 0;
                                                        var42_34 = var28_26 + 1;
                                                        var43_35 = 4;
                                                        var28_26 = 4 - var28_26;
                                                        block4: while ((var43_35 = var3_3.zzC) < (var16_15 = var3_3.zzB)) {
                                                            block74: {
                                                                block75: {
                                                                    var16_15 = var3_3.zzD;
                                                                    var44_60 = "video/hevc";
                                                                    if (var16_15 != 0) break block74;
                                                                    var45_36 = var4_4;
                                                                    ((zzadi)var4_4).zzn((byte[])var41_33, var28_26, var42_34, false);
                                                                    var3_3.zzh.zzK(0);
                                                                    var45_36 = var3_3.zzh;
                                                                    var16_15 = var45_36.zzg();
                                                                    if (var16_15 <= 0) break block75;
                                                                    var3_3.zzD = var16_15 += -1;
                                                                    var3_3.zzg.zzK(0);
                                                                    var45_36 = var3_3.zzg;
                                                                    var11_11 = 4;
                                                                    var24_22.zzq((zzfu)var45_36, var11_11);
                                                                    var45_36 = var3_3.zzh;
                                                                    var24_22.zzq((zzfu)var45_36, var10_10);
                                                                    var45_36 = var3_3.zzH;
                                                                    var16_15 = ((zzafa[])var45_36).length;
                                                                    if (var16_15 <= 0) ** GOTO lbl176
                                                                    var45_36 = var21_19.zzf.zzn;
                                                                    var46_37 /* !! */  = (int)var41_33[var11_11];
                                                                    var12_12 /* !! */  = "video/avc";
                                                                    var11_11 = (int)var12_12 /* !! */ .equals(var45_36);
                                                                    if (var11_11 != 0 && (var11_11 = var46_37 /* !! */  & 31) == var7_7) {
                                                                        while (true) {
                                                                            var11_11 = 1;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        if ((var11_11 = (int)var44_60.equals(var45_36)) != 0 && (var11_11 = (var46_37 /* !! */  & 126) >> var10_10) == (var16_15 = 39)) ** continue;
lbl176:
                                                                        // 2 sources

                                                                        var11_11 = 0;
                                                                        var12_12 /* !! */  = null;
                                                                    }
                                                                    var3_3.zzE = var11_11;
                                                                    var3_3.zzC = var11_11 = var3_3.zzC + 5;
                                                                    var3_3.zzB = var11_11 = var3_3.zzB + var28_26;
lbl181:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var11_11 = 0;
                                                                        var12_12 /* !! */  = null;
                                                                        var16_15 = 3;
                                                                        continue block4;
                                                                        break;
                                                                    }
                                                                }
                                                                throw zzch.zza("Invalid NAL length", null);
                                                            }
                                                            var11_11 = (int)var3_3.zzE;
                                                            if (var11_11 != 0) {
                                                                var3_3.zzi.zzH(var16_15);
                                                                var12_12 /* !! */  = (zzafa[])var3_3.zzi.zzM();
                                                                var16_15 = var3_3.zzD;
                                                                var22_20 = var4_4;
                                                                ((zzadi)var4_4).zzn((byte[])var12_12 /* !! */ , 0, var16_15, false);
                                                                var22_20 = var3_3.zzi;
                                                                var10_10 = var3_3.zzD;
                                                                var24_22.zzq((zzfu)var22_20, var10_10);
                                                                var7_7 = var3_3.zzD;
                                                                var47_38 = var3_3.zzi;
                                                                var12_12 /* !! */  = (zzafa[])var47_38.zzM();
                                                                var10_10 = var47_38.zze();
                                                                var10_10 = zzgr.zzb((byte[])var12_12 /* !! */ , var10_10);
                                                                var12_12 /* !! */  = var3_3.zzi;
                                                                var45_36 = var21_19.zzf.zzn;
                                                                var16_15 = (int)var44_60.equals(var45_36);
                                                                var12_12 /* !! */ .zzK(var16_15);
                                                                var3_3.zzi.zzJ(var10_10);
                                                                var47_38 = var3_3.zzi;
                                                                var12_12 /* !! */  = var3_3.zzH;
                                                                zzadf.zza(var39_32, (zzfu)var47_38, var12_12 /* !! */ );
                                                            } else {
                                                                var22_20 = null;
                                                                var7_7 = var10_10 = var24_22.zzf((zzu)var4_4, var16_15, false);
                                                            }
                                                            var3_3.zzC = var10_10 = var3_3.zzC + var7_7;
                                                            var3_3.zzD = var10_10 = var3_3.zzD - var7_7;
                                                            var7_7 = 6;
                                                            var10_10 = 1;
                                                            ** continue;
                                                        }
                                                    }
                                                    var48_61 = var17_16 /* !! */ .zza();
                                                    var4_4 = var17_16 /* !! */ .zzf();
                                                    if (var4_4 != null) {
                                                        var49_62 = var4_4 = var4_4.zzc;
                                                    } else {
                                                        var50_39 = 0;
                                                        var49_62 = null;
                                                    }
                                                    var38_59 = var3_3.zzB;
                                                    var51_40 /* !! */  = var24_22;
                                                    var30_28 = var39_32;
                                                    var24_22.zzs(var39_32, var48_61, var38_59, 0, (zzaez)var49_62);
                                                    while ((var38_59 = (int)(var4_4 = var3_3.zzo).isEmpty()) == 0) {
                                                        var4_4 = (zzakb)var3_3.zzo.removeFirst();
                                                        var6_6 = var3_3.zzw;
                                                        var7_7 = var4_4.zzc;
                                                        var3_3.zzw = var6_6 -= var7_7;
                                                        var14_14 = var4_4.zza;
                                                        var8_8 = (int)var4_4.zzb;
                                                        if (var8_8 != 0) {
                                                            var14_14 += var39_32;
                                                        }
                                                        var24_22 = var3_3.zzG;
                                                        var28_26 = ((zzafa[])var24_22).length;
                                                        var47_38 = null;
                                                        for (var10_10 = 0; var10_10 < var28_26; ++var10_10) {
                                                            var45_36 = var24_22[var10_10];
                                                            var11_11 = var4_4.zzc;
                                                            var43_35 = var3_3.zzw;
                                                            var36_31 = var14_14;
                                                            var46_37 /* !! */  = var43_35;
                                                            var43_35 = 1;
                                                            var25_23 = var11_11;
                                                            var45_36.zzs(var14_14, var43_35, var11_11, var46_37 /* !! */ , null);
                                                        }
                                                    }
                                                    var38_59 = (int)var17_16 /* !! */ .zzk();
                                                    if (var38_59 != 0) ** GOTO lbl95
                                                    var3_3.zzA = null;
                                                    ** continue;
                                                    var38_59 = 3;
                                                    var3_3.zzq = var38_59;
                                                    return 0;
                                                }
                                                var17_16 /* !! */  = (byte[])var3_3.zzf;
                                                var5_5 = var17_16 /* !! */ .size();
                                                var28_26 = 0;
                                                var27_25 = null;
                                                var24_22 = null;
                                                for (var8_8 = 0; var8_8 < var5_5; ++var8_8) {
                                                    var47_38 = ((zzakc)var3_3.zzf.valueAt((int)var8_8)).zzb;
                                                    var11_11 = (int)var47_38.zzo;
                                                    if (var11_11 == 0 || (var54_42 = (cfr_temp_1 = (var52_41 = var47_38.zzc) - var14_14) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) >= 0) continue;
                                                    var21_19 = var3_3.zzf.valueAt(var8_8);
                                                    var27_25 = var21_19;
                                                    var27_25 = (zzakc)var21_19;
                                                    var14_14 = var52_41;
                                                }
                                                if (var27_25 == null) {
                                                    var3_3.zzq = var5_5 = 3;
                                                    continue;
                                                }
                                                var52_41 = var1_1.zzf();
                                                var5_5 = (int)(var14_14 -= var52_41);
                                                if (var5_5 >= 0) {
                                                    var21_19 = var4_4;
                                                    var21_19 = (zzadi)var4_4;
                                                    var7_7 = 0;
                                                    var22_20 = null;
                                                    var21_19.zzo(var5_5, false);
                                                    var17_16 /* !! */  = var27_25.zzb;
                                                    var24_22 = var17_16 /* !! */ .zzn;
                                                    var27_25 = var24_22.zzM();
                                                    var8_8 = var24_22.zze();
                                                    var21_19.zzn((byte[])var27_25, 0, var8_8, false);
                                                    var21_19 = var17_16 /* !! */ .zzn;
                                                    var21_19.zzK(0);
                                                    var17_16 /* !! */ .zzo = false;
                                                    continue;
                                                }
                                                throw zzch.zza("Offset to encryption data was negative.", null);
                                            }
                                            var55_43 = var3_3.zzs;
                                            var5_5 = (int)var55_43;
                                            var8_8 = var3_3.zzt;
                                            var5_5 -= var8_8;
                                            var24_22 = var3_3.zzu;
                                            if (var24_22 == null) break block76;
                                            var27_25 = var24_22.zzM();
                                            var47_38 = var4_4;
                                            var47_38 = (zzadi)var4_4;
                                            var11_11 = 8;
                                            var26_24 = 0;
                                            var29_27 = null;
                                            var47_38.zzn((byte[])var27_25, var11_11, var5_5, false);
                                            var28_26 = var3_3.zzr;
                                            var17_16 /* !! */  = new zzajn(var28_26, (zzfu)var24_22);
                                            var55_43 = var1_1.zzf();
                                            var47_38 = var3_3.zzn;
                                            var10_10 = (int)var47_38.isEmpty();
                                            if (var10_10 != 0) break block77;
                                            var21_19 = (zzajm)var3_3.zzn.peek();
                                            var21_19.zzd((zzajn)var17_16 /* !! */ );
                                            break block78;
                                        }
                                        var10_10 = var17_16 /* !! */ .zzd;
                                        if (var10_10 != var7_7) break block79;
                                        var17_16 /* !! */  = var17_16 /* !! */ .zza;
                                        var17_16 /* !! */ .zzK(8);
                                        var6_6 = zzajo.zze(var17_16 /* !! */ .zzg());
                                        var7_7 = 4;
                                        var17_16 /* !! */ .zzL(var7_7);
                                        var57_44 = var17_16 /* !! */ .zzu();
                                        if (var6_6 == 0) {
                                            var14_14 = var17_16 /* !! */ .zzu();
                                            var52_41 = var17_16 /* !! */ .zzu();
lbl337:
                                            // 2 sources

                                            while (true) {
                                                var52_41 += var55_43;
                                                break;
                                            }
                                        } else {
                                            var14_14 = var17_16 /* !! */ .zzv();
                                            var52_41 = var17_16 /* !! */ .zzv();
                                            ** continue;
                                        }
                                        var55_43 = var52_41;
                                        var39_32 = 1000000L;
                                        var59_45 /* !! */  = RoundingMode.FLOOR;
                                        var52_41 = var14_14;
                                        var60_46 = zzgd.zzt(var14_14, var39_32, var57_44, (RoundingMode)var59_45 /* !! */ );
                                        var10_10 = 2;
                                        var17_16 /* !! */ .zzL(var10_10);
                                        var43_35 = var17_16 /* !! */ .zzq();
                                        var59_45 /* !! */  = (zzafa[])new int[var43_35];
                                        var45_36 = new long[var43_35];
                                        var41_33 = new long[var43_35];
                                        var13_13 = new long[var43_35];
                                        var52_41 = var60_46;
                                        var26_24 = 0;
                                        var29_27 = null;
                                        while (var26_24 < var43_35) {
                                            var46_37 /* !! */  = var17_16 /* !! */ .zzg();
                                            var50_39 = var46_37 /* !! */  & -1 << -1;
                                            if (var50_39 == 0) {
                                                var62_47 = var17_16 /* !! */ .zzu();
                                                var64_48 = -1 >>> 1;
                                                var59_45 /* !! */ [var26_24] = (RoundingMode)(var46_37 /* !! */  &= var64_48);
                                                var45_36[var26_24] = var55_43;
                                                var13_13[var26_24] = var52_41;
                                                var51_40 /* !! */  = RoundingMode.FLOOR;
                                                var52_41 = var14_14 += var62_47;
                                                var65_49 = var26_24;
                                                var39_32 = 1000000L;
                                                var66_50 = var45_36;
                                                var62_47 = var14_14;
                                                var21_19 = var59_45 /* !! */ ;
                                                var59_45 /* !! */  = var51_40 /* !! */ ;
                                                var52_41 = zzgd.zzt(var14_14, var39_32, var57_44, (RoundingMode)var51_40 /* !! */ );
                                                var39_32 = (long)var13_13[var26_24];
                                                var39_32 = var52_41 - var39_32;
                                                var22_20 = var41_33;
                                                var41_33[var26_24] = var39_32;
                                                var54_42 = 4;
                                                var17_16 /* !! */ .zzL((int)var54_42);
                                                var67_51 = (long)var21_19[var26_24];
                                                var55_43 += var67_51;
                                                var26_24 = var65_49 + 1;
                                                var59_45 /* !! */  = var21_19;
                                                var9_9 = 0;
                                                continue;
                                            }
                                            throw zzch.zza("Unhandled indirect reference", null);
                                        }
                                        var66_50 = var45_36;
                                        var22_20 = var41_33;
                                        var21_19 = var59_45 /* !! */ ;
                                        var17_16 /* !! */  = var60_46;
                                        var27_25 = var45_36;
                                        var24_22 = new zzadg((int[])var59_45 /* !! */ , (long[])var45_36, (long[])var41_33, (long[])var13_13);
                                        var17_16 /* !! */  = Pair.create((Object)var17_16 /* !! */ , (Object)var24_22);
                                        var3_3.zzz = var14_14 = ((Long)var17_16 /* !! */ .first).longValue();
                                        var21_19 = var3_3.zzF;
                                        var17_16 /* !! */  = (zzaet)var17_16 /* !! */ .second;
                                        var21_19.zzO((zzaet)var17_16 /* !! */ );
                                        var5_5 = 1;
                                        var3_3.zzI = var5_5;
                                        break block78;
                                    }
                                    if (var10_10 != var6_6) break block78;
                                    var17_16 /* !! */  = var17_16 /* !! */ .zza;
                                    var21_19 = var3_3.zzG;
                                    var6_6 = ((zzafa[])var21_19).length;
                                    if (var6_6 == 0) break block78;
                                    var17_16 /* !! */ .zzK(8);
                                    var6_6 = zzajo.zze(var17_16 /* !! */ .zzg());
                                    var34_30 = -9223372036854775807L;
                                    if (var6_6 == 0) break block80;
                                    var28_26 = 1;
                                    if (var6_6 == var28_26) break block81;
                                    var17_16 /* !! */  = "Skipping unsupported emsg version: ";
                                    w12_0.a(var6_6, (String)var17_16 /* !! */ , (String)var13_13);
                                    break block78;
                                }
                                var69_52 = var17_16 /* !! */ .zzu();
                                var67_51 = var17_16 /* !! */ .zzv();
                                var21_19 = RoundingMode.FLOOR;
                                var51_40 /* !! */  = var21_19;
                                var52_41 = zzgd.zzt(var67_51, 1000000L, var69_52, (RoundingMode)var21_19);
                                var67_51 = var17_16 /* !! */ .zzu();
                                var69_52 = zzgd.zzt(var67_51, 1000L, var69_52, (RoundingMode)var21_19);
                                var39_32 = var17_16 /* !! */ .zzu();
                                var6_6 = 0;
                                var21_19 = null;
                                var45_36 = var17_16 /* !! */ .zzx('\u0000');
                                var45_36.getClass();
                                var41_33 = var17_16 /* !! */ .zzx('\u0000');
                                var41_33.getClass();
                                var71_53 = var69_52;
                                var73_54 = var39_32;
                                var75_55 = var45_36;
                                var66_50 = var41_33;
                                var36_31 = var52_41;
                                var52_41 = var34_30;
                                break block82;
                            }
                            var6_6 = 0;
                            var45_36 = var17_16 /* !! */ .zzx('\u0000');
                            var45_36.getClass();
                            var41_33 = var17_16 /* !! */ .zzx('\u0000');
                            var41_33.getClass();
                            var69_52 = var17_16 /* !! */ .zzu();
                            var76_56 = var17_16 /* !! */ .zzu();
                            var21_19 = RoundingMode.FLOOR;
                            var78_57 = 1000000L;
                            var52_41 = zzgd.zzt(var76_56, var78_57, var69_52, (RoundingMode)var21_19);
                            var39_32 = var3_3.zzz;
                            var42_34 = (int)(var39_32 == var34_30 ? 0 : (var39_32 < var34_30 ? -1 : 1));
                            var39_32 = var42_34 != 0 ? (var39_32 += var52_41) : var34_30;
                            var76_56 = var17_16 /* !! */ .zzu();
                            var78_57 = 1000L;
                            var69_52 = zzgd.zzt(var76_56, var78_57, var69_52, (RoundingMode)var21_19);
                            var19_18 = var17_16 /* !! */ .zzu();
                            var71_53 = var69_52;
                            var75_55 = var45_36;
                            var66_50 = var41_33;
                            var73_54 = var19_18;
                            var36_31 = var39_32;
                        }
                        var6_6 = var17_16 /* !! */ .zzb();
                        var21_19 = new byte[var6_6];
                        var28_26 = var17_16 /* !! */ .zzb();
                        var17_16 /* !! */ .zzG((byte[])var21_19, 0, var28_26);
                        var17_16 /* !! */  = new zzagt((String)var75_55, (String)var66_50, var71_53, var73_54, (byte[])var21_19);
                        var21_19 = var3_3.zzl;
                        var27_25 = new zzfu;
                        var17_16 /* !! */  = var21_19.zza((zzagt)var17_16 /* !! */ );
                        var27_25(var17_16 /* !! */ );
                        var5_5 = var27_25.zzb();
                        var21_19 = var3_3.zzG;
                        var9_9 = ((zzafa[])var21_19).length;
                        var13_13 = null;
                        for (var54_42 = (long)0; var54_42 < var9_9; ++var54_42) {
                            var29_27 = var21_19[var54_42];
                            var16_15 = 0;
                            var45_36 = null;
                            var27_25.zzK(0);
                            var29_27.zzq((zzfu)var27_25, var5_5);
                        }
                        var6_6 = (int)(var36_31 == var34_30 ? 0 : (var36_31 < var34_30 ? -1 : 1));
                        if (var6_6 == 0) {
                            var21_19 = var3_3.zzo;
                            var8_8 = 1;
                            var22_20 = new zzakb(var52_41, (boolean)var8_8, var5_5);
                            var21_19.addLast(var22_20);
                            var3_3.zzw = var6_6 = var3_3.zzw + var5_5;
                        } else {
                            var21_19 = var3_3.zzo;
                            var6_6 = (int)var21_19.isEmpty();
                            if (var6_6 == 0) {
                                var21_19 = var3_3.zzo;
                                var8_8 = 0;
                                var24_22 = null;
                                var22_20 = new zzakb(var36_31, false, var5_5);
                                var21_19.addLast(var22_20);
                                var3_3.zzw = var6_6 = var3_3.zzw + var5_5;
                            } else {
                                var21_19 = var3_3.zzG;
                                var7_7 = ((Object)var21_19).length;
                                var24_22 = null;
                                for (var8_8 = 0; var8_8 < var7_7; ++var8_8) {
                                    var27_25 = var21_19[var8_8];
                                    var26_24 = 0;
                                    var29_27 = null;
                                    var16_15 = 0;
                                    var45_36 = null;
                                    var11_11 = 1;
                                    var80_58 = var36_31;
                                    var54_42 = var5_5;
                                    var27_25.zzs(var36_31, var11_11, var5_5, 0, null);
                                }
                            }
                        }
                        break block78;
                    }
                    var21_19 = var4_4;
                    var21_19 = (zzadi)var4_4;
                    var8_8 = 0;
                    var24_22 = null;
                    var21_19.zzo(var5_5, false);
                }
                var32_29 = var1_1.zzf();
                var3_3.zzj(var32_29);
                continue;
            }
            var8_8 = 0;
            var24_22 = null;
            var5_5 = var3_3.zzt;
            if (var5_5 == 0) {
                var17_16 /* !! */  = var3_3.zzm.zzM();
                var5_5 = (int)var4_4.zzn(var17_16 /* !! */ , 0, var28_26 = 8, (boolean)(var9_9 = 1));
                if (var5_5 == 0) {
                    return -1;
                }
                var3_3.zzt = var28_26;
                var3_3.zzm.zzK(0);
                var3_3.zzs = var55_43 = var3_3.zzm.zzu();
                var17_16 /* !! */  = var3_3.zzm;
                var3_3.zzr = var5_5 = var17_16 /* !! */ .zzg();
            }
            if ((var5_5 = (int)((cfr_temp_2 = (var55_43 = var3_3.zzs) - (var80_58 = 1L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) == 0) {
                var17_16 /* !! */  = var3_3.zzm.zzM();
                var24_22 = var4_4;
                var24_22 = (zzadi)var4_4;
                var28_26 = 8;
                var9_9 = 0;
                var24_22.zzn(var17_16 /* !! */ , var28_26, var28_26, false);
                var3_3.zzt = var5_5 = var3_3.zzt + var28_26;
                var17_16 /* !! */  = var3_3.zzm;
                var3_3.zzs = var55_43 = var17_16 /* !! */ .zzv();
            } else {
                var80_58 = 0L;
                cfr_temp_3 = var55_43 - var80_58;
                var5_5 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                if (var5_5 == 0) {
                    var55_43 = var1_1.zzd();
                    cfr_temp_4 = var55_43 - (var80_58 = (long)-1);
                    var5_5 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                    if (var5_5 == 0) {
                        var17_16 /* !! */  = (byte[])var3_3.zzn;
                        var5_5 = (int)var17_16 /* !! */ .isEmpty();
                        if (var5_5 == 0) {
                            var17_16 /* !! */  = (zzajm)var3_3.zzn.peek();
                            var55_43 = var17_16 /* !! */ .zza;
                        } else {
                            var55_43 = var80_58;
                        }
                    }
                    if ((var5_5 = (int)(var55_43 == var80_58 ? 0 : (var55_43 < var80_58 ? -1 : 1))) != 0) {
                        var80_58 = var1_1.zzf();
                        var55_43 -= var80_58;
                        var5_5 = var3_3.zzt;
                        var80_58 = var5_5;
                        var3_3.zzs = var55_43 += var80_58;
                    }
                }
            }
            var55_43 = var3_3.zzs;
            var80_58 = var3_3.zzt;
            var5_5 = (int)(var55_43 == var80_58 ? 0 : (var55_43 < var80_58 ? -1 : 1));
            if (var5_5 < 0) break;
            var55_43 = var1_1.zzf() - var80_58;
            var5_5 = var3_3.zzr;
            var9_9 = 1835295092;
            var10_10 = 0x6D6F6F66;
            if ((var5_5 == var10_10 || var5_5 == var9_9) && (var5_5 = (int)var3_3.zzI) == 0) {
                var17_16 /* !! */  = var3_3.zzF;
                var39_32 = var3_3.zzy;
                var12_12 /* !! */  = new zzaes(var39_32, var55_43);
                var17_16 /* !! */ .zzO((zzaet)var12_12 /* !! */ );
                var5_5 = 1;
                var3_3.zzI = var5_5;
            }
            if ((var5_5 = var3_3.zzr) == var10_10) {
                var17_16 /* !! */  = var3_3.zzf;
                var5_5 = var17_16 /* !! */ .size();
                var12_12 /* !! */  = null;
                for (var11_11 = 0; var11_11 < var5_5; ++var11_11) {
                    var13_13 = ((zzakc)var3_3.zzf.valueAt((int)var11_11)).zzb;
                    var13_13.zzc = var55_43;
                    var13_13.zzb = var55_43;
                }
            }
            if ((var5_5 = var3_3.zzr) == var9_9) {
                var9_9 = 0;
                var3_3.zzA = null;
                var32_29 = var3_3.zzs;
                var3_3.zzv = var55_43 += var32_29;
                var3_3.zzq = var5_5 = 2;
                continue;
            }
            var8_8 = 1836019574;
            if (var5_5 != var8_8 && var5_5 != (var8_8 = 1953653099) && var5_5 != (var8_8 = 1835297121) && var5_5 != (var8_8 = 1835626086) && var5_5 != (var8_8 = 1937007212) && var5_5 != var10_10 && var5_5 != (var8_8 = 1953653094) && var5_5 != (var8_8 = 1836475768) && var5_5 != (var8_8 = 1701082227)) {
                var8_8 = 1751411826;
                var69_52 = 0x7FFFFFFFL;
                if (var5_5 != var8_8 && var5_5 != (var8_8 = 1835296868) && var5_5 != (var8_8 = 1836476516) && var5_5 != var7_7 && var5_5 != (var7_7 = 1937011556) && var5_5 != (var7_7 = 0x73747473) && var5_5 != (var7_7 = 1668576371) && var5_5 != (var7_7 = 1937011555) && var5_5 != (var7_7 = 1937011578) && var5_5 != (var7_7 = 1937013298) && var5_5 != (var7_7 = 1937007471) && var5_5 != (var7_7 = 1668232756) && var5_5 != (var7_7 = 0x73747373) && var5_5 != (var7_7 = 0x74666474) && var5_5 != (var7_7 = 1952868452) && var5_5 != (var7_7 = 1953196132) && var5_5 != (var7_7 = 1953654136) && var5_5 != (var7_7 = 1953658222) && var5_5 != (var7_7 = 1886614376) && var5_5 != (var7_7 = 1935763834) && var5_5 != (var7_7 = 1935763823) && var5_5 != (var7_7 = 1936027235) && var5_5 != (var7_7 = 1970628964) && var5_5 != (var7_7 = 1935828848) && var5_5 != (var7_7 = 1936158820) && var5_5 != (var7_7 = 1701606260) && var5_5 != (var7_7 = 1835362404) && var5_5 != var6_6) {
                    var32_29 = var3_3.zzs;
                    cfr_temp_5 = var32_29 - var69_52;
                    var7_7 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                    if (var7_7 <= 0) {
                        var17_16 /* !! */  = null;
                        var3_3.zzu = null;
                        var3_3.zzq = var5_5 = 1;
                        continue;
                    }
                    throw zzch.zzc("Skipping atom with length > 2147483647 (unsupported).");
                }
                var5_5 = var3_3.zzt;
                var6_6 = 8;
                if (var5_5 == var6_6) {
                    var34_30 = var3_3.zzs;
                    cfr_temp_6 = var34_30 - var69_52;
                    var5_5 = (int)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                    if (var5_5 <= 0) {
                        var34_30 = var3_3.zzs;
                        var8_8 = (int)var34_30;
                        var17_16 /* !! */  = new zzfu(var8_8);
                        var22_20 = var3_3.zzm.zzM();
                        var24_22 = var17_16 /* !! */ .zzM();
                        var28_26 = 0;
                        var27_25 = null;
                        System.arraycopy(var22_20, 0, var24_22, 0, var6_6);
                        var3_3.zzu = var17_16 /* !! */ ;
                        var3_3.zzq = var5_5 = 1;
                        continue;
                    }
                    throw zzch.zzc("Leaf atom with length > 2147483647 (unsupported).");
                }
                throw zzch.zzc("Leaf atom defines extended atom size (unsupported).");
            }
            var14_14 = var1_1.zzf();
            var55_43 = var3_3.zzs;
            var14_14 += var55_43;
            var24_22 = var3_3.zzn;
            var27_25 = new zzajm;
            var27_25(var5_5, var14_14 += (long)-8);
            var24_22.push(var27_25);
            var55_43 = var3_3.zzs;
            var80_58 = var3_3.zzt;
            var5_5 = (int)(var55_43 == var80_58 ? 0 : (var55_43 < var80_58 ? -1 : 1));
            if (var5_5 == 0) {
                var3_3.zzj(var14_14);
                continue;
            }
            this.zzh();
        }
        throw zzch.zzc("Atom size less than header length (unsupported).");
    }

    public final /* synthetic */ List zzc() {
        return this.zzp;
    }

    public final void zzd(zzadx object) {
        Object object2;
        int n3;
        this.zzF = object;
        this.zzh();
        int n4 = 2;
        object = new zzafa[n4];
        this.zzG = object;
        int n7 = 0;
        object = (zzafa[])zzgd.zzP((Object[])object, 0);
        this.zzG = object;
        for (Object object3 : object) {
            zzan zzan2 = zzc;
            object3.zzl(zzan2);
        }
        object = new zzafa[this.zze.size()];
        this.zzH = object;
        n4 = 100;
        while (n7 < (n3 = ((zzafa[])(object2 = this.zzH)).length)) {
            object2 = this.zzF;
            int n8 = n4 + 1;
            int n10 = 3;
            object = object2.zzw(n4, n10);
            object2 = (zzan)this.zze.get(n7);
            object.zzl((zzan)object2);
            object2 = this.zzH;
            object2[n7] = object;
            ++n7;
            n4 = n8;
        }
    }

    public final void zze(long l2, long l3) {
        SparseArray sparseArray = this.zzf;
        int n3 = sparseArray.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            zzakc zzakc2 = (zzakc)this.zzf.valueAt(i3);
            zzakc2.zzi();
        }
        this.zzo.clear();
        this.zzw = 0;
        this.zzx = l3;
        this.zzn.clear();
        this.zzh();
    }

    public final boolean zzf(zzadv object) {
        zzgbc zzgbc2 = (object = zzako.zza((zzadv)object)) != null ? zzgbc.zzn(object) : zzgbc.zzm();
        this.zzp = zzgbc2;
        return object == null;
    }
}

