/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacw;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzaie;
import com.google.android.gms.internal.ads.zzajm;
import com.google.android.gms.internal.ads.zzajn;
import com.google.android.gms.internal.ads.zzajw;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzakh;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzakp;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzalw;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgh;
import com.google.android.gms.internal.ads.zzgr;
import com.google.android.gms.internal.ads.zzu;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class zzakj
implements zzadu,
zzaet {
    public static final zzaea zza;
    private int zzA;
    private zzaie zzB;
    private final zzalt zzb;
    private final int zzc;
    private final zzfu zzd;
    private final zzfu zze;
    private final zzfu zzf;
    private final zzfu zzg;
    private final ArrayDeque zzh;
    private final zzakn zzi;
    private final List zzj;
    private zzgbc zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzfu zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private zzadx zzv;
    private zzaki[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    static {
        zzakh zzakh2 = new zzakh();
        zza = zzakh2;
    }

    public zzakj() {
        zzalt zzalt2 = zzalt.zza;
        this(zzalt2, 16);
    }

    public zzakj(zzalt zzakiArray, int n3) {
        Object object;
        this.zzb = zzakiArray;
        this.zzc = n3;
        zzakiArray = zzgbc.zzm();
        this.zzk = zzakiArray;
        int n4 = 4;
        if ((n3 &= n4) != 0) {
            n3 = 3;
        } else {
            n3 = 0;
            object = null;
        }
        this.zzl = n3;
        object = new zzakn();
        this.zzi = object;
        object = new ArrayList();
        this.zzj = object;
        this.zzg = object = new zzfu(16);
        object = new ArrayDeque();
        this.zzh = object;
        byte[] byArray = zzgr.zza;
        this.zzd = object = new zzfu(byArray);
        this.zze = object = new zzfu(n4);
        zzakiArray = new zzfu();
        this.zzf = zzakiArray;
        this.zzq = -1;
        zzakiArray = zzadx.zza;
        this.zzv = zzakiArray;
        zzakiArray = new zzaki[]{};
        this.zzw = zzakiArray;
    }

    private static int zzi(int n3) {
        int n4 = 1751476579;
        if (n3 != n4) {
            n4 = 1903435808;
            if (n3 != n4) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    private static int zzj(zzaks zzaks2, long l2) {
        int n3;
        int n4 = zzaks2.zza(l2);
        if (n4 == (n3 = -1)) {
            return zzaks2.zzb(l2);
        }
        return n4;
    }

    private static long zzk(zzaks zzaks2, long l2, long l3) {
        int n3;
        int n4 = zzakj.zzj(zzaks2, l2);
        if (n4 == (n3 = -1)) {
            return l3;
        }
        return Math.min(zzaks2.zzc[n4], l3);
    }

    private final void zzl() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void zzm(long var1_1) {
        var3_2 = this;
        while (true) {
            var4_3 = 0;
            var5_4 = null;
            var6_5 = 1;
            var7_6 = var3_2.zzh;
            var8_7 = var7_6.isEmpty();
            if (var8_7 != 0) break;
            var7_6 = (zzajm)var3_2.zzh.peek();
            var9_8 = var7_6.zza;
            cfr_temp_0 = var9_8 - var1_1;
            var11_9 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
            if (var11_9 /* !! */  != false) break;
            var12_10 = var7_6 = var3_2.zzh.pop();
            var12_10 = (zzajm)var7_6;
            var8_7 = var12_10.zzd;
            var11_9 /* !! */  = 1836019574;
            var13_11 = 4.631354E27f;
            if (var8_7 == var11_9 /* !! */ ) {
                var7_6 = new ArrayList();
                var11_9 /* !! */  = var3_2.zzA;
                var14_12 = new zzaej();
                var15_13 = 1969517665;
                var16_14 = 2.8960062E32f;
                var17_15 = var12_10.zzb(var15_13);
                if (var17_15 != null) {
                    var17_15 = zzajw.zzb((zzajn)var17_15);
                    var14_12.zzb((zzcd)var17_15);
                    var18_16 = var17_15;
                } else {
                    var19_17 = false;
                    var18_16 = null;
                }
                var15_13 = 1835365473;
                var16_14 = 4.4382975E27f;
                var17_15 = var12_10.zza(var15_13);
                if (var17_15 != null) {
                    var17_15 = zzajw.zza((zzajm)var17_15);
                    var20_18 = var17_15;
                } else {
                    var21_19 = 0;
                    var20_18 = null;
                }
                var15_13 = 1836476516;
                var16_14 = 4.7662196E27f;
                var17_15 = var12_10.zzb(var15_13);
                var17_15.getClass();
                var23_21 = var11_9 /* !! */  == var6_5 ? 1 : 0;
                var24_22 = zzajw.zzc(var17_15.zza);
                var17_15 = new zzcc[var6_5];
                var17_15[0] = var24_22;
                var25_23 = -9223372036854775807L;
                var22_20 = new zzcd(var25_23, (zzcc[])var17_15);
                var11_9 /* !! */  = var3_2.zzc & var6_5;
                if (var6_5 != var11_9 /* !! */ ) {
                    var27_24 = 0;
                    var28_25 = null;
                } else {
                    var27_24 = 1;
                }
                var29_26 = new zzakg();
                var30_27 = -9223372036854775807L;
                var24_22 = var14_12;
                var32_28 = var25_23;
                var34_29 /* !! */  = null;
                var35_30 = var27_24;
                var28_25 = var22_20;
                var36_31 = var23_21;
                var37_32 = var20_18;
                var20_18 = var29_26;
                var12_10 = zzajw.zzd(var12_10, var14_12, var30_27, null, (boolean)var27_24, (boolean)var23_21, var29_26);
                var15_13 = 0;
                var16_14 = 0.0f;
                var17_15 = null;
                var38_33 = -1;
                var36_31 = 0;
                var22_20 = null;
                while (true) {
                    var21_19 = var12_10.size();
                    var39_34 = 0L;
                    if (var15_13 >= var21_19) break;
                    var20_18 = (zzaks)var12_10.get(var15_13);
                    var4_3 = var20_18.zzb;
                    if (var4_3 == 0) {
                        var41_35 = var12_10;
                        var42_36 = var15_13;
                        var43_37 = var36_31;
                        var44_38 = 1;
                        var36_31 = -1;
                        var21_19 = 3;
                    } else {
                        var5_4 = var20_18.zza;
                        var42_36 = var15_13;
                        var45_39 = var5_4.zze;
                        cfr_temp_1 = var45_39 - var32_28;
                        var47_40 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var47_40 /* !! */  == false) {
                            var45_39 = var20_18.zzh;
                        }
                        var25_23 = Math.max(var25_23, var45_39);
                        var49_42 = var3_2.zzv;
                        var43_37 = var36_31 + 1;
                        var6_5 = var5_4.zzb;
                        var49_42 = var49_42.zzw(var36_31, var6_5);
                        var48_41 = new zzaki((zzakp)var5_4, (zzaks)var20_18, (zzafa)var49_42);
                        var49_42 = var5_4.zzf;
                        var50_43 = "audio/true-hd";
                        var49_42 = var49_42.zzn;
                        var51_44 = (int)var50_43.equals(var49_42);
                        var51_44 = var51_44 != 0 ? var20_18.zze * 16 : var20_18.zze + 30;
                        var50_43 = var5_4.zzf.zzb();
                        var50_43.zzP(var51_44);
                        var51_44 = var5_4.zzb;
                        var36_31 = 2;
                        if (var51_44 == var36_31) {
                            var51_44 = var3_2.zzc & 8;
                            if (var51_44 != 0) {
                                var49_42 = var5_4.zzf;
                                var36_31 = -1;
                                var36_31 = var38_33 == var36_31 ? 1 : 2;
                                var51_44 = var49_42.zzg | var36_31;
                                var50_43.zzV(var51_44);
                            }
                            if ((var51_44 = (int)(var45_39 == var39_34 ? 0 : (var45_39 < var39_34 ? -1 : 1))) > 0 && (var51_44 = var20_18.zzb) > 0) {
                                var13_11 = var45_39;
                                var52_45 = var51_44;
                                var15_13 = 1232348160;
                                var16_14 = 1000000.0f;
                                var50_43.zzH(var52_45 /= (var13_11 /= var16_14));
                            }
                        }
                        var51_44 = var5_4.zzb;
                        var11_9 /* !! */  = 1;
                        var13_11 = 1.4E-45f;
                        if (var51_44 == var11_9 /* !! */  && (var51_44 = (int)var14_12.zza()) != 0) {
                            var51_44 = var14_12.zza;
                            var50_43.zzF(var51_44);
                            var51_44 = var14_12.zzb;
                            var50_43.zzG(var51_44);
                        }
                        var51_44 = var5_4.zzb;
                        var24_22 = var3_2.zzj;
                        var11_9 /* !! */  = (long)var24_22.isEmpty();
                        if (var11_9 /* !! */  != false) {
                            var11_9 /* !! */  = 3;
                            var13_11 = 4.2E-45f;
                            var15_13 = 0;
                            var16_14 = 0.0f;
                            var17_15 = null;
                        } else {
                            var24_22 = var3_2.zzj;
                            var17_15 = new zzcd((List)var24_22);
                            var11_9 /* !! */  = 3;
                            var13_11 = 4.2E-45f;
                        }
                        var22_20 = new zzcd[var11_9 /* !! */ ];
                        var11_9 /* !! */  = 0;
                        var13_11 = 0.0f;
                        var24_22 = null;
                        var22_20[0] = var17_15;
                        var22_20[1] = var18_16;
                        var15_13 = 2;
                        var16_14 = 2.8E-45f;
                        var22_20[var15_13] = var28_25;
                        var20_18 = new zzcc[]{};
                        var41_35 = var12_10;
                        var53_46 = -9223372036854775807L;
                        var17_15 = new zzcd(var53_46, var20_18);
                        if (var37_32 != null) {
                            var20_18 = null;
                            for (var21_19 = 0; var21_19 < (var55_47 /* !! */  = var37_32.zza()); var21_19 += var11_9 /* !! */ ) {
                                block35: {
                                    var12_10 = var37_32.zzb(var21_19);
                                    var11_9 /* !! */  = var12_10 instanceof zzgh;
                                    if (var11_9 /* !! */  != false) {
                                        var12_10 = (zzgh)var12_10;
                                        var24_22 = var12_10.zza;
                                        var56_48 = var25_23;
                                        var34_29 /* !! */  = "com.android.capture.fps";
                                        var11_9 /* !! */  = (long)var24_22.equals(var34_29 /* !! */ );
                                        if (var11_9 /* !! */  != false) {
                                            var11_9 /* !! */  = 2;
                                            var13_11 = 2.8E-45f;
                                            if (var51_44 == var11_9 /* !! */ ) {
                                                var11_9 /* !! */  = 1;
                                                var13_11 = 1.4E-45f;
                                                var34_29 /* !! */  = new zzcc[var11_9 /* !! */ ];
                                                var35_30 = 0;
                                                var34_29 /* !! */ [0] = var12_10;
                                                var12_10 = var17_15.zzc(var34_29 /* !! */ );
lbl188:
                                                // 2 sources

                                                while (true) {
                                                    var17_15 = var12_10;
                                                    break block35;
                                                    break;
                                                }
                                            }
lbl191:
                                            // 3 sources

                                            while (true) {
                                                var11_9 /* !! */  = 1;
                                                var13_11 = 1.4E-45f;
                                                break block35;
                                                break;
                                            }
                                        }
                                        var11_9 /* !! */  = 1;
                                        var13_11 = 1.4E-45f;
                                        var35_30 = 0;
                                        var34_29 /* !! */  = new zzcc[var11_9 /* !! */ ];
                                        var34_29 /* !! */ [0] = var12_10;
                                        var12_10 = var17_15.zzc(var34_29 /* !! */ );
                                        ** continue;
                                    }
                                    var56_48 = var25_23;
                                    ** continue;
                                }
                                var25_23 = var56_48;
                            }
                        }
                        var56_48 = var25_23;
                        var11_9 /* !! */  = 1;
                        var13_11 = 1.4E-45f;
                        var52_45 = 0.0f;
                        var49_42 = null;
                        var21_19 = 3;
                        for (var51_44 = 0; var51_44 < var21_19; var51_44 += var11_9 /* !! */ ) {
                            var12_10 = var22_20[var51_44];
                            var17_15 = var17_15.zzd((zzcd)var12_10);
                        }
                        var51_44 = var17_15.zza();
                        if (var51_44 > 0) {
                            var50_43.zzQ((zzcd)var17_15);
                        }
                        var49_42 = var48_41.zzc;
                        var50_43 = var50_43.zzad();
                        var49_42.zzl((zzan)var50_43);
                        var51_44 = var5_4.zzb;
                        var4_3 = 2;
                        var36_31 = -1;
                        if (var51_44 == var4_3 && var38_33 == var36_31) {
                            var38_33 = var7_6.size();
                        }
                        var7_6.add(var48_41);
                        var25_23 = var56_48;
                        var44_38 = 1;
                    }
                    var15_13 = var42_36 + 1;
                    var36_31 = var43_37;
                    var12_10 = var41_35;
                    var32_28 = -9223372036854775807L;
                    var4_3 = 0;
                    var5_4 = null;
                    var6_5 = 1;
                }
                var36_31 = -1;
                var21_19 = 3;
                var3_2.zzy = var38_33;
                var3_2.zzz = var25_23;
                var44_38 = 0;
                var49_42 = new zzaki[]{};
                var48_41 = var7_6.toArray((T[])var49_42);
                var3_2.zzw = var48_41;
                var51_44 = ((zzaki[])var48_41).length;
                var5_4 = new long[var51_44][];
                var50_43 = new int[var51_44];
                var7_6 = new long[var51_44];
                var49_42 = new boolean[var51_44];
                var13_11 = 0.0f;
                var24_22 = null;
                for (var11_9 /* !! */  = (long)0; var11_9 /* !! */  < (var55_47 /* !! */  = ((zzaki[])var48_41).length); var11_9 /* !! */  += var55_47 /* !! */ ) {
                    var5_4[var11_9 /* !! */ ] = var12_10 = (Object)new long[var48_41[var11_9 /* !! */ ].zzb.zzb];
                    var12_10 = var48_41[var11_9 /* !! */ ].zzb.zzf;
                    var15_13 = 0;
                    var16_14 = 0.0f;
                    var17_15 = null;
                    var58_49 /* !! */  = (long)var12_10[0];
                    var7_6[var11_9 /* !! */ ] = var58_49 /* !! */ ;
                    var55_47 /* !! */  = 1;
                }
                var15_13 = 0;
                var16_14 = 0.0f;
                var17_15 = null;
                var11_9 /* !! */  = 0;
                var13_11 = 0.0f;
                var24_22 = null;
                block7: while (var11_9 /* !! */  < (var55_47 /* !! */  = ((zzaki[])var48_41).length)) {
                    var58_49 /* !! */  = 0x7FFFFFFFFFFFFFFFL;
                    var12_10 = null;
                    var35_30 = -1;
                    for (var55_47 /* !! */  = 0; var55_47 /* !! */  < (var60_50 /* !! */  = ((zzaki[])var48_41).length); var55_47 /* !! */  += var60_50 /* !! */ ) {
                        var60_50 /* !! */  = (int)var49_42[var55_47 /* !! */ ];
                        if (var60_50 /* !! */  == 0 && (var19_17 = (cfr_temp_2 = (var61_51 = var7_6[var55_47 /* !! */ ]) - var58_49 /* !! */ ) == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1)) <= 0) {
                            var35_30 = var55_47 /* !! */ ;
                            var58_49 /* !! */  = (long)var61_51;
                        }
                        var60_50 /* !! */  = 1;
                    }
                    var60_50 /* !! */  = 1;
                    var55_47 /* !! */  = (int)var50_43[var35_30];
                    var63_52 = var5_4[var35_30];
                    var63_52[var55_47 /* !! */ ] = var39_34;
                    var34_29 /* !! */  = var48_41[var35_30].zzb;
                    var37_32 = var34_29 /* !! */ .zzd;
                    var64_53 = var37_32[var55_47 /* !! */ ];
                    var65_54 /* !! */  = (long)var64_53;
                    var39_34 += var65_54 /* !! */ ;
                    var50_43[var35_30] = var55_47 /* !! */  += var60_50 /* !! */ ;
                    var38_33 = ((Object)var63_52).length;
                    if (var55_47 /* !! */  < var38_33) {
                        var63_52 = var34_29 /* !! */ .zzf;
                        var65_54 /* !! */  = (long)var63_52[var55_47 /* !! */ ];
                        var7_6[var35_30] = var65_54 /* !! */ ;
lbl298:
                        // 2 sources

                        while (true) {
                            var36_31 = -1;
                            var21_19 = 3;
                            continue block7;
                            break;
                        }
                    }
                    var49_42[var35_30] = var60_50 /* !! */ ;
                    var11_9 /* !! */  += var60_50 /* !! */ ;
                    ** continue;
                }
                var60_50 /* !! */  = 1;
                var3_2.zzx = (long[][])var5_4;
                var3_2.zzv.zzD();
                var3_2.zzv.zzO(var3_2);
                var48_41 = var3_2.zzh;
                var48_41.clear();
                var3_2.zzl = var44_38 = 2;
                continue;
            }
            var15_13 = 0;
            var16_14 = 0.0f;
            var17_15 = null;
            var60_50 /* !! */  = 1;
            var48_41 = var3_2.zzh;
            var44_38 = (int)var48_41.isEmpty();
            if (var44_38 != 0) continue;
            var48_41 = (zzajm)var3_2.zzh.peek();
            var48_41.zzc((zzajm)var12_10);
        }
        var44_38 = var3_2.zzl;
        var51_44 = 2;
        var52_45 = 2.8E-45f;
        if (var44_38 != var51_44) {
            this.zzl();
        }
    }

    public final long zza() {
        return this.zzz;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int zzb(zzadv var1_1, zzaeq var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = var2_2;
        while (true) {
            block79: {
                block78: {
                    block83: {
                        block80: {
                            var6_9 = 1;
                            var7_11 = var3_3.zzl;
                            var8_12 = 1718909296;
                            var9_13 = 0L;
                            var11_14 = 2;
                            var12_15 = -1;
                            var13_16 /* !! */  = 8;
                            if (var7_11 == 0) break block79;
                            var14_17 = 262144L;
                            if (var7_11 == var6_9) break block80;
                            if (var7_11 != var11_14) {
                                var16_18 = var3_3.zzi;
                                var17_19 = var3_3.zzj;
                                var16_18.zza((zzadv)var4_4, (zzaeq)var5_5, (List)var17_19);
                                var18_35 = var5_5.zza;
                                var20_20 = (int)(var18_35 == var9_13 ? 0 : (var18_35 < var9_13 ? -1 : 1));
                                if (!var20_20) {
                                    this.zzl();
                                }
                                return var6_9;
                            }
                            var21_21 = var1_1.zzf();
                            var13_16 /* !! */  = var3_3.zzq;
                            if (var13_16 /* !! */  != var12_15) ** GOTO lbl-1000
                            var25_37 = var23_36 = 0x7FFFFFFFFFFFFFFFL;
                            var27_38 /* !! */  = var23_36;
                            var29_39 = var23_36;
                            var31_40 = null;
                            var32_41 /* !! */  = true;
                            var33_42 = -1;
                            var34_43 = -1;
                            var35_44 = 1;
                            var36_45 = 1.4E-45f;
                            for (var13_16 /* !! */  = 0; var13_16 /* !! */  < (var37_22 = ((zzaki[])(var16_18 = var3_3.zzw)).length); var13_16 /* !! */  += var6_9) {
                                block82: {
                                    block81: {
                                        var16_18 = var16_18[var13_16 /* !! */ ];
                                        var37_22 = var16_18.zze;
                                        var16_18 = var16_18.zzb;
                                        var38_23 = var16_18.zzb;
                                        if (var37_22 == var38_23) continue;
                                        var39_46 = var16_18.zzc[var37_22];
                                        var16_18 = var3_3.zzx;
                                        var38_23 = zzgd.zza;
                                        var16_18 = var16_18[var13_16 /* !! */ ];
                                        var41_47 = var16_18[var37_22];
                                        cfr_temp_0 = (var39_46 -= var21_21) - var9_13;
                                        var20_20 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                        if (var20_20 < false || (var20_20 = (int)(var39_46 == var14_17 ? 0 : (var39_46 < var14_17 ? -1 : 1))) >= false) {
                                            var20_20 = true;
                                            var43_24 = 1.4E-45f;
                                        } else {
                                            var20_20 = false;
                                            var43_24 = 0.0f;
                                            var16_18 = null;
                                        }
                                        if (var20_20) break block81;
                                        if (var35_44 != 0) ** GOTO lbl-1000
                                        var38_23 = 0;
                                        var44_25 = 0.0f;
                                        var45_26 = null;
                                        break block82;
                                    }
                                    var38_23 = var35_44;
                                    var44_25 = var36_45;
                                }
                                if (var20_20 == var38_23 && (var37_22 = (int)(var39_46 == var29_39 ? 0 : (var39_46 < var29_39 ? -1 : 1))) < 0) lbl-1000:
                                // 2 sources

                                {
                                    var35_44 = var20_20;
                                    var36_45 = var43_24;
                                    var34_43 = var13_16 /* !! */ ;
                                    var29_39 = var39_46;
                                    var27_38 /* !! */  = (long)var41_47;
                                } else {
                                    var35_44 = var38_23;
                                    var36_45 = var44_25;
                                }
                                var38_23 = (int)(var41_47 == var25_37 ? 0 : (var41_47 < var25_37 ? -1 : 1));
                                if (var38_23 >= false) continue;
                                var32_41 /* !! */  = var20_20;
                                var33_42 = var13_16 /* !! */ ;
                                var25_37 = (long)var41_47;
                            }
                            var20_20 = (int)(var25_37 == var23_36 ? 0 : (var25_37 < var23_36 ? -1 : 1));
                            var13_16 /* !! */  = var20_20 != false && var32_41 /* !! */  != 0 && (var20_20 = (int)((cfr_temp_1 /* !! */  = var27_38 /* !! */  - (var25_37 += (var23_36 = 0xA00000L))) == 0L ? 0 : (cfr_temp_1 /* !! */  < 0L ? -1 : 1))) >= false ? var33_42 : var34_43;
                            var3_3.zzq = var13_16 /* !! */ ;
                            if (var13_16 /* !! */  == var12_15) {
                                var46_27 = -1 != 0;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var16_18 = var3_3.zzw[var13_16 /* !! */ ];
                                var45_26 = var16_18.zzc;
                                var37_22 = var16_18.zze;
                                var31_40 = var16_18.zzb;
                                var47_48 = var31_40.zzc;
                                var48_28 = var47_48[var37_22];
                                var31_40 = var31_40.zzd;
                                var13_16 /* !! */  = (int)var31_40[var37_22];
                                var17_19 = var16_18.zzd;
                                var21_21 = var48_28 - var21_21;
                                var6_9 = var3_3.zzr;
                                var50_29 = var48_28;
                                var48_28 = var6_9;
                                cfr_temp_2 = (var21_21 += var48_28) - var9_13;
                                if ((var6_9 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) >= 0 && (var6_9 = (int)(var21_21 == var14_17 ? 0 : (var21_21 < var14_17 ? -1 : 1))) < 0) {
                                    var5_5 = var16_18.zza;
                                    var54_49 = var5_5.zzg;
                                    var6_9 = 1;
                                    if (var54_49 == var6_9) {
                                        var9_13 = 8;
                                        var21_21 += var9_13;
                                        var13_16 /* !! */  += -8;
                                    }
                                    var54_49 = (int)var21_21;
                                    var4_4.zzk(var54_49);
                                    var5_5 = var16_18.zza;
                                    var6_9 = var5_5.zzj;
                                    if (var6_9 != 0) {
                                        var5_5 = var3_3.zze.zzM();
                                        var55_31 = null;
                                        var5_5[0] = false;
                                        var5_5[1] = false;
                                        var5_5[2] = false;
                                        var7_11 = 4;
                                        var8_12 = 4 - var6_9;
                                        while ((var7_11 = var3_3.zzs) < var13_16 /* !! */ ) {
                                            var7_11 = var3_3.zzt;
                                            if (var7_11 == 0) {
                                                var4_4.zzi((byte[])var5_5, var8_12, var6_9);
                                                var3_3.zzr = var7_11 = var3_3.zzr + var6_9;
                                                var55_31 = var3_3.zze;
                                                var56_50 = 0;
                                                var57_32 = null;
                                                var55_31.zzK(0);
                                                var55_31 = var3_3.zze;
                                                var7_11 = var55_31.zzg();
                                                if (var7_11 >= 0) {
                                                    var3_3.zzt = var7_11;
                                                    var3_3.zzd.zzK(0);
                                                    var55_31 = var3_3.zzd;
                                                    var58_33 = 4;
                                                    var45_26.zzq((zzfu)var55_31, var58_33);
                                                    var3_3.zzs = var7_11 = var3_3.zzs + var58_33;
                                                    var13_16 /* !! */  += var8_12;
                                                    continue;
                                                }
                                                throw zzch.zza("Invalid NAL length", null);
                                            }
                                            var57_32 = null;
                                            var7_11 = var45_26.zzf((zzu)var4_4, var7_11, false);
                                            var3_3.zzr = var56_50 = var3_3.zzr + var7_11;
                                            var3_3.zzs = var56_50 = var3_3.zzs + var7_11;
                                            var3_3.zzt = var56_50 = var3_3.zzt - var7_11;
                                        }
                                    } else {
                                        var5_5 = var5_5.zzf;
                                        var59_51 = "audio/ac4";
                                        var5_5 = var5_5.zzn;
                                        var54_49 = (int)var59_51.equals(var5_5);
                                        if (var54_49 != 0) {
                                            var54_49 = var3_3.zzs;
                                            if (var54_49 == 0) {
                                                var5_5 = var3_3.zzf;
                                                zzacw.zzb(var13_16 /* !! */ , (zzfu)var5_5);
                                                var5_5 = var3_3.zzf;
                                                var6_9 = 7;
                                                var45_26.zzq((zzfu)var5_5, var6_9);
                                                var3_3.zzs = var54_49 = var3_3.zzs + var6_9;
                                            } else {
                                                var6_9 = 7;
                                            }
                                            var13_16 /* !! */  += var6_9;
                                        } else if (var17_19 != null) {
                                            var17_19.zzd((zzadv)var4_4);
                                        }
                                        while ((var54_49 = var3_3.zzs) < var13_16 /* !! */ ) {
                                            var54_49 = var13_16 /* !! */  - var54_49;
                                            var59_51 = null;
                                            var54_49 = var45_26.zzf((zzu)var4_4, var54_49, false);
                                            var3_3.zzr = var6_9 = var3_3.zzr + var54_49;
                                            var3_3.zzs = var6_9 = var3_3.zzs + var54_49;
                                            var3_3.zzt = var6_9 = var3_3.zzt - var54_49;
                                        }
                                    }
                                    var4_4 = var16_18.zzb;
                                    var5_5 = var4_4.zzf;
                                    var60_52 = var5_5[var37_22];
                                    var4_4 = var4_4.zzg;
                                    var62_53 /* !! */  = var4_4[var37_22];
                                    if (var17_19 != null) {
                                        var25_37 = (long)var60_52;
                                        var32_41 /* !! */  = var62_53 /* !! */ ;
                                        var17_19.zzc((zzafa)var45_26, (long)var60_52, (int)var62_53 /* !! */ , var13_16 /* !! */ , 0, null);
                                        var4_4 = var16_18.zzb;
                                        var62_53 /* !! */  = (reference)var4_4.zzb;
                                        if (++var37_22 == var62_53 /* !! */ ) {
                                            var62_53 /* !! */  = (reference)false;
                                            var4_4 = null;
                                            var17_19.zza((zzafa)var45_26, null);
                                        }
                                    } else {
                                        var50_29 = (long)var60_52;
                                        var32_41 /* !! */  = var13_16 /* !! */ ;
                                        var45_26.zzs((long)var60_52, (int)var62_53 /* !! */ , var13_16 /* !! */ , 0, null);
                                    }
                                    var62_53 /* !! */  = (reference)var16_18.zze;
                                    var54_49 = 1;
                                    var16_18.zze = (int)(var62_53 /* !! */  += var54_49);
                                    var3_3.zzq = -1;
                                    var62_53 /* !! */  = (reference)false;
                                    var4_4 = null;
                                    var3_3.zzr = 0;
                                    var3_3.zzs = 0;
                                    var3_3.zzt = 0;
                                    var46_27 = false;
                                    var17_19 = null;
                                } else {
                                    var52_30 = var50_29;
                                    var5_5.zza = var50_29;
                                    var46_27 = true;
                                }
                            }
                            return var46_27;
                        }
                        var6_9 = 7;
                        var52_30 = var3_3.zzn;
                        var38_23 = var3_3.zzo;
                        var63_34 = var38_23;
                        var52_30 -= var63_34;
                        var63_34 = var1_1.zzf() + var52_30;
                        var45_26 = var3_3.zzp;
                        if (var45_26 == null) break block83;
                        var55_31 = var45_26.zzM();
                        var58_33 = var3_3.zzo;
                        var46_27 = (int)var52_30;
                        var4_4.zzi((byte[])var55_31, var58_33, var46_27);
                        var20_20 = var3_3.zzm;
                        if (var20_20 == var8_12) {
                            block77: {
                                var43_24 = 1.4E-45f;
                                var3_3.zzu = true;
                                var45_26.zzK(var13_16 /* !! */ );
                                var20_20 = zzakj.zzi(var45_26.zzg());
                                if (!var20_20) {
                                    var20_20 = 4 != 0;
                                    var43_24 = 5.6E-45f;
                                    var45_26.zzL(var20_20);
                                    while ((var20_20 = var45_26.zzb()) > false) {
                                        var20_20 = zzakj.zzi(var45_26.zzg());
                                        if (!var20_20) continue;
                                        break block77;
                                    }
                                    var20_20 = false;
                                    var43_24 = 0.0f;
                                    var16_18 = null;
                                }
                            }
                            var3_3.zzA = var20_20;
lbl244:
                            // 3 sources

                            while (true) {
                                var20_20 = false;
                                var43_24 = 0.0f;
                                var16_18 = null;
                                break block78;
                                break;
                            }
                        }
                        var16_18 = var3_3.zzh;
                        var20_20 = (int)var16_18.isEmpty();
                        if (!var20_20) {
                            var16_18 = (zzajm)var3_3.zzh.peek();
                            var7_11 = var3_3.zzm;
                            var17_19 = new zzajn(var7_11, (zzfu)var45_26);
                            var16_18.zzd((zzajn)var17_19);
                        }
                        ** GOTO lbl244
                    }
                    var38_23 = (int)var3_3.zzu;
                    if (var38_23 == 0 && (var38_23 = var3_3.zzm) == (var7_11 = 1835295092)) {
                        var38_23 = 1;
                        var44_25 = 1.4E-45f;
                        var3_3.zzA = var38_23;
                    }
                    if ((var38_23 = (int)(var52_30 == var14_17 ? 0 : (var52_30 < var14_17 ? -1 : 1))) < 0) {
                        var46_27 = (int)var52_30;
                        var4_4.zzk(var46_27);
                        ** continue;
                    }
                    var5_5.zza = var21_21 = var1_1.zzf() + var52_30;
                    var20_20 = true;
                    var43_24 = 1.4E-45f;
                }
                var3_3.zzm(var63_34);
                if (!var20_20 || (var20_20 = var3_3.zzl) == (var46_27 = 2 != 0)) continue;
                return 1;
            }
            var20_20 = true;
            var43_24 = 1.4E-45f;
            var46_27 = 2 != 0;
            var6_9 = 7;
            var38_23 = var3_3.zzo;
            if (var38_23 == 0) {
                var45_26 = var3_3.zzg.zzM();
                var7_11 = 0;
                var55_31 = null;
                var38_23 = (int)var4_4.zzn((byte[])var45_26, 0, var13_16 /* !! */ , (boolean)var20_20);
                if (var38_23 == 0) {
                    var62_54 = var3_3.zzA;
                    if (var62_54 == var46_27 && (var62_54 = var3_3.zzc & var46_27)) {
                        var4_4 = var3_3.zzv;
                        var20_20 = 4 != 0;
                        var43_24 = 5.6E-45f;
                        var4_4 = var4_4.zzw(0, var20_20);
                        var5_5 = var3_3.zzB;
                        var52_30 = -9223372036854775807L;
                        if (var5_5 == null) {
                            var37_22 = 0;
                            var65_6 = null;
                        } else {
                            var38_23 = 1;
                            var44_25 = 1.4E-45f;
                            var45_26 = new zzcc[var38_23];
                            var45_26[0] = var5_5;
                            var65_6 = new zzcd(var52_30, (zzcc[])var45_26);
                        }
                        var5_5 = new zzal();
                        var5_5.zzQ((zzcd)var65_6);
                        var5_5 = var5_5.zzad();
                        var4_4.zzl((zzan)var5_5);
                        var3_3.zzv.zzD();
                        var4_4 = var3_3.zzv;
                        var5_5 = new zzaes(var52_30, var9_13);
                        var4_4.zzO((zzaet)var5_5);
                    }
                    return -1;
                }
                var20_20 = 4 != 0;
                var43_24 = 5.6E-45f;
                var3_3.zzo = var13_16 /* !! */ ;
                var17_19 = var3_3.zzg;
                var38_23 = 0;
                var44_25 = 0.0f;
                var45_26 = null;
                var17_19.zzK(0);
                var3_3.zzn = var66_7 = var3_3.zzg.zzu();
                var17_19 = var3_3.zzg;
                var3_3.zzm = var46_27 = var17_19.zzg();
            } else {
                var20_20 = 4 != 0;
                var43_24 = 5.6E-45f;
            }
            var66_7 = var3_3.zzn;
            var48_28 = 1L;
            var7_11 = (int)(var66_7 == var48_28 ? 0 : (var66_7 < var48_28 ? -1 : 1));
            if (var7_11 == 0) {
                var17_19 = var3_3.zzg.zzM();
                var4_4.zzi((byte[])var17_19, var13_16 /* !! */ , var13_16 /* !! */ );
                var3_3.zzo = var46_27 = var3_3.zzo + var13_16 /* !! */ ;
                var17_19 = var3_3.zzg;
                var3_3.zzn = var66_7 = var17_19.zzv();
            } else {
                var7_11 = (int)(var66_7 == var9_13 ? 0 : (var66_7 < var9_13 ? -1 : 1));
                if (var7_11 == 0) {
                    var66_7 = var1_1.zzd();
                    cfr_temp_3 = var66_7 - (var63_34 = (long)-1);
                    var7_11 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                    if (var7_11 == 0) {
                        var17_19 = (zzajm)var3_3.zzh.peek();
                        var66_7 = var17_19 != null ? var17_19.zza : var63_34;
                    }
                    if ((var7_11 = (int)(var66_7 == var63_34 ? 0 : (var66_7 < var63_34 ? -1 : 1))) != 0) {
                        var63_34 = var1_1.zzf();
                        var66_7 -= var63_34;
                        var7_11 = var3_3.zzo;
                        var63_34 = var7_11;
                        var3_3.zzn = var66_7 += var63_34;
                    }
                }
            }
            var66_7 = var3_3.zzn;
            var7_11 = var3_3.zzo;
            var63_34 = var7_11;
            var58_33 = (int)(var66_7 == var63_34 ? 0 : (var66_7 < var63_34 ? -1 : 1));
            if (var58_33 < 0) break;
            var46_27 = var3_3.zzm;
            var38_23 = 1836019574;
            var44_25 = 4.631354E27f;
            var37_22 = 1835365473;
            if (var46_27 != var38_23) {
                var38_23 = 1953653099;
                var44_25 = 7.681346E31f;
                if (var46_27 != var38_23) {
                    var38_23 = 1835297121;
                    var44_25 = 4.4181236E27f;
                    if (var46_27 != var38_23) {
                        var38_23 = 1835626086;
                        var44_25 = 4.515217E27f;
                        if (var46_27 != var38_23) {
                            var38_23 = 1937007212;
                            var44_25 = 1.9362132E31f;
                            if (var46_27 != var38_23) {
                                var38_23 = 1701082227;
                                var44_25 = 6.742798E22f;
                                if (var46_27 == var38_23 || var46_27 == var37_22) {
                                } else {
                                    var38_23 = 1835296868;
                                    var44_25 = 4.418049E27f;
                                    if (var46_27 != var38_23) {
                                        var38_23 = 1836476516;
                                        var44_25 = 4.7662196E27f;
                                        if (var46_27 != var38_23) {
                                            var38_23 = 1751411826 != 0;
                                            var44_25 = 4.3148E24f;
                                            if (var46_27 != var38_23) {
                                                var38_23 = 1937011556 != 0;
                                                var44_25 = 1.9367383E31f;
                                                if (var46_27 != var38_23) {
                                                    var38_23 = 1937011827 != 0;
                                                    var44_25 = 1.9367711E31f;
                                                    if (var46_27 != var38_23) {
                                                        var38_23 = 0x73747373;
                                                        var44_25 = 1.9367401E31f;
                                                        if (var46_27 != var38_23) {
                                                            var38_23 = 1668576371;
                                                            var44_25 = 4.5093966E21f;
                                                            if (var46_27 != var38_23) {
                                                                var38_23 = 1701606260;
                                                                var44_25 = 6.9788014E22f;
                                                                if (var46_27 != var38_23) {
                                                                    var38_23 = 1937011555;
                                                                    var44_25 = 1.9367382E31f;
                                                                    if (var46_27 != var38_23) {
                                                                        var38_23 = 1937011578;
                                                                        var44_25 = 1.936741E31f;
                                                                        if (var46_27 != var38_23) {
                                                                            var38_23 = 1937013298;
                                                                            var44_25 = 1.9369489E31f;
                                                                            if (var46_27 != var38_23) {
                                                                                var38_23 = 1937007471;
                                                                                var44_25 = 1.9362445E31f;
                                                                                if (var46_27 != var38_23) {
                                                                                    var38_23 = 1668232756;
                                                                                    var44_25 = 4.4126776E21f;
                                                                                    if (var46_27 != var38_23) {
                                                                                        var38_23 = 1953196132;
                                                                                        var44_25 = 7.46037E31f;
                                                                                        if (var46_27 != var38_23 && var46_27 != var8_12) {
                                                                                            var38_23 = 1969517665;
                                                                                            var44_25 = 2.8960062E32f;
                                                                                            if (var46_27 != var38_23) {
                                                                                                var38_23 = 1801812339;
                                                                                                var44_25 = 2.7741754E26f;
                                                                                                if (var46_27 != var38_23) {
                                                                                                    var38_23 = 1768715124;
                                                                                                    var44_25 = 1.7865732E25f;
                                                                                                    if (var46_27 != var38_23) {
                                                                                                        var66_7 = var1_1.zzf();
                                                                                                        var7_11 = var3_3.zzo;
                                                                                                        var21_21 = var7_11;
                                                                                                        var48_28 = var66_7 - var21_21;
                                                                                                        var46_27 = var3_3.zzm;
                                                                                                        var38_23 = 1836086884;
                                                                                                        var44_25 = 4.6512205E27f;
                                                                                                        if (var46_27 == var38_23) {
                                                                                                            var68_8 = var48_28 + var21_21;
                                                                                                            var63_34 = var3_3.zzn;
                                                                                                            var50_29 = var63_34 - var21_21;
                                                                                                            var9_13 = 0L;
                                                                                                            var70_10 = -9223372036854775807L;
                                                                                                            var65_6 = var17_19;
                                                                                                            var3_3.zzB = var17_19 = new zzaie(var9_13, var48_28, var70_10, var68_8, var50_29);
                                                                                                        }
                                                                                                        var17_19 = null;
                                                                                                        var3_3.zzp = null;
                                                                                                        var3_3.zzl = var46_27 = 1;
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (var7_11 == var13_16 /* !! */ ) {
                                        var46_27 = true;
                                    } else {
                                        var46_27 = false;
                                        var17_19 = null;
                                    }
                                    zzeq.zzf((boolean)var46_27);
                                    var66_7 = var3_3.zzn;
                                    var21_21 = 0x7FFFFFFFL;
                                    var37_22 = (int)(var66_7 == var21_21 ? 0 : (var66_7 < var21_21 ? -1 : 1));
                                    if (var37_22 <= 0) {
                                        var46_27 = true;
                                    } else {
                                        var46_27 = false;
                                        var17_19 = null;
                                    }
                                    zzeq.zzf((boolean)var46_27);
                                    var21_21 = var3_3.zzn;
                                    var38_23 = (int)var21_21;
                                    var17_19 = new zzfu(var38_23);
                                    var45_26 = var3_3.zzg.zzM();
                                    var55_31 = var17_19.zzM();
                                    var8_12 = 0;
                                    System.arraycopy(var45_26, 0, var55_31, 0, var13_16 /* !! */ );
                                    var3_3.zzp = var17_19;
                                    var3_3.zzl = var46_27 = true;
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            var46_27 = true;
            var21_21 = var1_1.zzf();
            var9_13 = var3_3.zzn;
            var21_21 += var9_13;
            var48_28 = var3_3.zzo;
            var38_23 = (int)(var9_13 == var48_28 ? 0 : (var9_13 < var48_28 ? -1 : 1));
            if (var38_23 != 0 && (var38_23 = var3_3.zzm) == var37_22) {
                var3_3.zzf.zzH(var13_16 /* !! */ );
                var45_26 = var3_3.zzf.zzM();
                var37_22 = 0;
                var65_6 = null;
                var4_4.zzh((byte[])var45_26, 0, var13_16 /* !! */ );
                zzajw.zze(var3_3.zzf);
                var45_26 = var3_3.zzf;
                var38_23 = var45_26.zzd();
                var4_4.zzk(var38_23);
                var1_1.zzj();
            } else {
                var37_22 = 0;
                var65_6 = null;
            }
            var45_26 = var3_3.zzh;
            var58_33 = var3_3.zzm;
            var57_32 = new zzajm(var58_33, var21_21 -= var48_28);
            var45_26.push(var57_32);
            var9_13 = var3_3.zzn;
            var48_28 = var3_3.zzo;
            var38_23 = (int)(var9_13 == var48_28 ? 0 : (var9_13 < var48_28 ? -1 : 1));
            if (var38_23 == 0) {
                var3_3.zzm(var21_21);
                continue;
            }
            this.zzl();
        }
        throw zzch.zzc("Atom size less than header length (unsupported).");
    }

    public final /* synthetic */ List zzc() {
        return this.zzk;
    }

    public final void zzd(zzadx zzadx2) {
        int n3 = this.zzc & 0x10;
        if (n3 == 0) {
            zzalt zzalt2 = this.zzb;
            zzalw zzalw2 = new zzalw(zzadx2, zzalt2);
            zzadx2 = zzalw2;
        }
        this.zzv = zzadx2;
    }

    public final void zze(long l2, long l3) {
        int n3;
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = n3 = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 == false) {
            int n4 = this.zzl;
            int n7 = 3;
            if (n4 != n7) {
                this.zzl();
                return;
            }
            this.zzi.zzb();
            this.zzj.clear();
            return;
        }
        for (zzaki zzaki2 : this.zzw) {
            zzaks zzaks2 = zzaki2.zzb;
            l7 = zzaks2.zza(l3);
            if (l7 == n3) {
                l7 = zzaks2.zzb(l3);
            }
            zzaki2.zze = (int)l7;
            zzafb object = zzaki2.zzd;
            if (object == null) continue;
            object.zzb();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final boolean zzf(zzadv object) {
        void var2_5;
        zzgbc zzgbc2;
        int bl2 = this.zzc & 2;
        boolean bl3 = true;
        if (bl2 != 0) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            zzgbc2 = null;
        }
        object = zzako.zzb((zzadv)object, (boolean)var2_5);
        zzgbc2 = object != null ? zzgbc.zzn(object) : zzgbc.zzm();
        this.zzk = zzgbc2;
        if (object == null) {
            return bl3;
        }
        return false;
    }

    public final zzaer zzg(long l2) {
        Object object;
        block7: {
            int n3;
            Object object2;
            long l3;
            Object object3;
            long l4;
            Object object4;
            long l7;
            long l8;
            Object object5;
            Object object6;
            block10: {
                block8: {
                    int n4;
                    int n7;
                    block9: {
                        block6: {
                            object6 = this.zzw;
                            n7 = ((zzaki[])object6).length;
                            if (n7 != 0) break block6;
                            zzaeu zzaeu2 = zzaeu.zza;
                            object = new zzaer(zzaeu2, zzaeu2);
                            break block7;
                        }
                        n7 = this.zzy;
                        n4 = -1;
                        object5 = -1;
                        l8 = -9223372036854775807L;
                        if (n7 == n4) break block8;
                        object6 = object6[n7].zzb;
                        n7 = zzakj.zzj((zzaks)object6, l2);
                        if (n7 != n4) break block9;
                        zzaeu zzaeu3 = zzaeu.zza;
                        object = new zzaer(zzaeu3, zzaeu3);
                        break block7;
                    }
                    l7 = ((zzaks)object6).zzf[n7];
                    object4 = ((zzaks)object6).zzc;
                    l4 = (long)object4[n7];
                    Object object7 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
                    if (object7 < 0 && n7 < (object7 = (Object)(((zzaks)object6).zzb + n4)) && (object3 = (Object)((zzaks)object6).zzb(l2)) != n4 && object3 != n7) {
                        l3 = ((zzaks)object6).zzf[object3];
                        object2 = ((zzaks)object6).zzc;
                        object5 = object2[object3];
                    } else {
                        l3 = l8;
                    }
                    l2 = l7;
                    break block10;
                }
                l4 = Long.MAX_VALUE;
                l3 = l8;
            }
            object6 = null;
            for (int i3 = 0; i3 < (n3 = ((zzaki[])(object4 = this.zzw)).length); ++i3) {
                n3 = this.zzy;
                if (i3 == n3) continue;
                object4 = object4[i3].zzb;
                l7 = zzakj.zzk((zzaks)object4, l2, l4);
                Object object8 = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
                if (object8 != false) {
                    object5 = zzakj.zzk((zzaks)object4, l3, object5);
                }
                l4 = l7;
            }
            object6 = new zzaeu(l2, l4);
            object3 = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
            if (object3 == false) {
                object = new zzaer((zzaeu)object6, (zzaeu)object6);
            } else {
                object = new zzaeu(l3, (long)object5);
                object = object2 = new zzaer((zzaeu)object6, (zzaeu)object);
            }
        }
        return object;
    }

    public final boolean zzh() {
        return true;
    }
}

