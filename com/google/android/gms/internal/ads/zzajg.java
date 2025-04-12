/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadt;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzael;
import com.google.android.gms.internal.ads.zzaen;
import com.google.android.gms.internal.ads.zzaeo;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzaho;
import com.google.android.gms.internal.ads.zzahv;
import com.google.android.gms.internal.ads.zzahz;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzajc;
import com.google.android.gms.internal.ads.zzajd;
import com.google.android.gms.internal.ads.zzaje;
import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzajj;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzajl;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.io.EOFException;
import java.util.List;

public final class zzajg
implements zzadu {
    public static final zzaea zza;
    private static final zzaho zzb;
    private final zzfu zzc;
    private final zzaen zzd;
    private final zzaej zze;
    private final zzael zzf;
    private final zzafa zzg;
    private zzadx zzh;
    private zzafa zzi;
    private zzafa zzj;
    private int zzk;
    private zzcd zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzaji zzq;
    private boolean zzr;

    static {
        Object object = new zzaje();
        zza = object;
        zzb = object = new zzajf();
    }

    public zzajg() {
        throw null;
    }

    public zzajg(int n3) {
        Object object = new zzfu(10);
        this.zzc = object;
        this.zzd = object = new zzaen();
        this.zze = object = new zzaej();
        this.zzm = -9223372036854775807L;
        this.zzf = object = new zzael();
        this.zzg = object = new zzadt();
        this.zzj = object;
    }

    /*
     * Unable to fully structure code
     */
    private final int zzg(zzadv var1_1) {
        block40: {
            block41: {
                block42: {
                    block39: {
                        block33: {
                            block32: {
                                block38: {
                                    block36: {
                                        block37: {
                                            block35: {
                                                block34: {
                                                    var2_2 = this;
                                                    var3_3 = var1_1;
                                                    var4_4 = this.zzk;
                                                    var5_5 = -1;
                                                    if (var4_4 == 0) {
                                                        try {
                                                            this.zzl(var1_1, false);
                                                        }
                                                        catch (EOFException v0) {
                                                            return var5_5;
                                                        }
                                                    }
                                                    var6_6 = var2_2.zzq;
                                                    var7_7 = 1;
                                                    if (var6_6 != null) break block33;
                                                    var6_6 = var2_2.zzd;
                                                    var4_4 = var6_6.zzc;
                                                    var8_8 = new zzfu(var4_4);
                                                    var6_6 = var8_8.zzM();
                                                    var9_9 = var2_2.zzd;
                                                    var10_10 = var9_9.zzc;
                                                    var11_11 = var3_3;
                                                    var11_11 = (zzadi)var3_3;
                                                    var11_11.zzm((byte[])var6_6, 0, var10_10, false);
                                                    var6_6 = var2_2.zzd;
                                                    var10_10 = var6_6.zza & var7_7;
                                                    var12_12 = 21;
                                                    var13_13 = 36;
                                                    if (var10_10 != 0) {
                                                        var4_4 = var6_6.zze;
                                                        if (var4_4 != var7_7) {
                                                            var12_12 = 36;
                                                        }
                                                    } else {
                                                        var4_4 = var6_6.zze;
                                                        if (var4_4 == var7_7) {
                                                            var12_12 = 13;
                                                        }
                                                    }
                                                    var4_4 = var8_8.zze();
                                                    var10_10 = var12_12 + 4;
                                                    var14_14 = 1447187017;
                                                    var15_15 = 1231971951;
                                                    var16_16 = 1483304551;
                                                    if (var4_4 < var10_10) break block34;
                                                    var8_8.zzK(var12_12);
                                                    var4_4 = var8_8.zzg();
                                                    if (var4_4 == var16_16) break block35;
                                                    if (var4_4 != var15_15) break block34;
                                                    var4_4 = 1231971951;
                                                    break block35;
                                                }
                                                if ((var4_4 = var8_8.zze()) < (var10_10 = 40)) ** GOTO lbl-1000
                                                var8_8.zzK(var13_13);
                                                var4_4 = var8_8.zzg();
                                                if (var4_4 == var14_14) {
                                                    var4_4 = 1447187017;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var4_4 = 0;
                                                    var6_6 = null;
                                                }
                                            }
                                            var17_17 = -1;
                                            var19_18 = 0.0 / 0.0;
                                            if (var4_4 == var15_15) break block36;
                                            if (var4_4 == var14_14) break block37;
                                            if (var4_4 == var16_16) break block36;
                                            var1_1.zzj();
                                            var21_19 = var17_17;
                                            var23_20 = var19_18;
                                            var4_4 = 0;
                                            var6_6 = null;
                                            break block38;
                                        }
                                        var25_21 = var1_1.zzd();
                                        var27_22 = var1_1.zzf();
                                        var29_23 = var2_2.zzd;
                                        var21_19 = var17_17;
                                        var23_20 = var19_18;
                                        var17_17 = var25_21;
                                        var25_21 = var27_22;
                                        var6_6 = zzajj.zzb(var17_17, var27_22, (zzaen)var29_23, (zzfu)var8_8);
                                        var9_9 = var2_2.zzd;
                                        var10_10 = var9_9.zzc;
                                        var11_11 = var3_3;
                                        var11_11 = (zzadi)var3_3;
                                        var11_11.zzo(var10_10, false);
                                        break block38;
                                    }
                                    var21_19 = var17_17;
                                    var23_20 = var19_18;
                                    var9_9 = zzajk.zza(var2_2.zzd, (zzfu)var8_8);
                                    var11_11 = var2_2.zze;
                                    var13_13 = (int)var11_11.zza();
                                    if (var13_13 == 0 && (var13_13 = var9_9.zzd) != var5_5 && (var14_14 = var9_9.zze) != var5_5) {
                                        var11_11.zza = var13_13;
                                        var11_11.zzb = var14_14;
                                    }
                                    var30_24 = var1_1.zzf();
                                    var32_25 = var2_2.zzd;
                                    var14_14 = var32_25.zzc;
                                    var29_23 = var3_3;
                                    var29_23 = (zzadi)var3_3;
                                    var29_23.zzo(var14_14, false);
                                    if (var4_4 == var16_16) {
                                        var33_26 = var1_1.zzd();
                                        var6_6 = zzajl.zzb(var33_26, (zzajk)var9_9, var30_24);
                                    } else {
                                        var33_26 = var9_9.zzc;
                                        cfr_temp_0 = var33_26 - var21_19;
                                        var4_4 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                        if (var4_4 != 0) {
                                            var17_17 = var30_24 + var33_26;
                                        } else {
                                            var17_17 = var21_19;
                                            var19_18 = var23_20;
                                        }
                                        var6_6 = var2_2.zzi(var3_3, var17_17, false);
                                    }
                                }
                                var9_9 = var2_2.zzl;
                                var30_24 = var1_1.zzf();
                                if (var9_9 != null) {
                                    var14_14 = var9_9.zza();
                                    var29_23 = null;
                                    for (var15_15 = 0; var15_15 < var14_14; ++var15_15) {
                                        block31: {
                                            var8_8 = var9_9.zzb(var15_15);
                                            var16_16 = var8_8 instanceof zzahv;
                                            if (var16_16 == 0) continue;
                                            var8_8 = (zzahv)var8_8;
                                            var14_14 = var9_9.zza();
                                            var29_23 = null;
                                            for (var15_15 = 0; var15_15 < var14_14; ++var15_15) {
                                                var35_27 = var9_9.zzb(var15_15);
                                                var36_28 = var35_27 instanceof zzahz;
                                                if (var36_28 == 0) continue;
                                                var35_27 = (zzahz)var35_27;
                                                var37_29 = var35_27.zzf;
                                                var38_30 = "TLEN";
                                                var36_28 = (int)var37_29.equals(var38_30);
                                                if (var36_28 == 0) continue;
                                                var37_29 = (String)var35_27.zzc.get(0);
                                                var39_31 = zzgd.zzr(Long.parseLong((String)var37_29));
                                                break block31;
                                            }
                                            var39_31 = -9223372036854775807L;
                                        }
                                        var37_29 = zzajd.zzb(var30_24, (zzahv)var8_8, var39_31);
                                        break block32;
                                    }
                                }
                                var36_28 = 0;
                                var37_29 = null;
                            }
                            var41_32 = (int)var2_2.zzr;
                            if (var41_32 != 0) {
                                var6_6 = new zzajh();
                            } else {
                                if (var37_29 != null) {
                                    var6_6 = var37_29;
                                } else if (var6_6 == null) {
                                    var4_4 = 0;
                                    var6_6 = null;
                                }
                                if (var6_6 != null) {
                                    var6_6.zzh();
                                } else {
                                    var6_6 = var2_2.zzi(var3_3, var21_19, false);
                                }
                            }
                            var2_2.zzq = var6_6;
                            var2_2.zzh.zzO((zzaet)var6_6);
                            var6_6 = new zzal();
                            var37_29 = var2_2.zzd.zzb;
                            var6_6.zzX((String)var37_29);
                            var6_6.zzP(4096);
                            var36_28 = var2_2.zzd.zze;
                            var6_6.zzy(var36_28);
                            var36_28 = var2_2.zzd.zzd;
                            var6_6.zzY(var36_28);
                            var36_28 = var2_2.zze.zza;
                            var6_6.zzF(var36_28);
                            var36_28 = var2_2.zze.zzb;
                            var6_6.zzG(var36_28);
                            var37_29 = var2_2.zzl;
                            var6_6.zzQ((zzcd)var37_29);
                            var37_29 = var2_2.zzq;
                            var36_28 = var37_29.zzc();
                            var41_32 = -2147483647;
                            if (var36_28 != var41_32) {
                                var37_29 = var2_2.zzq;
                                var36_28 = var37_29.zzc();
                                var6_6.zzx(var36_28);
                            }
                            var37_29 = var2_2.zzj;
                            var6_6 = var6_6.zzad();
                            var37_29.zzl((zzan)var6_6);
                            var2_2.zzo = var39_31 = var1_1.zzf();
                            break block39;
                        }
                        var39_31 = var2_2.zzo;
                        var21_19 = 0L;
                        var23_20 = 0.0;
                        var4_4 = (int)(var39_31 == var21_19 ? 0 : (var39_31 < var21_19 ? -1 : 1));
                        if (var4_4 != 0 && (var4_4 = (int)((cfr_temp_1 = (var21_19 = var1_1.zzf()) - var39_31) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) {
                            var6_6 = var3_3;
                            var6_6 = (zzadi)var3_3;
                            var41_32 = (int)(var39_31 -= var21_19);
                            var6_6.zzo(var41_32, false);
                        }
                    }
                    var4_4 = var2_2.zzp;
                    if (var4_4 != 0) break block40;
                    var1_1.zzj();
                    var4_4 = (int)this.zzk(var1_1);
                    if (var4_4 != 0) ** GOTO lbl-1000
                    var2_2.zzc.zzK(0);
                    var6_6 = var2_2.zzc;
                    var4_4 = var6_6.zzg();
                    var39_31 = var2_2.zzk;
                    var36_28 = zzajg.zzj(var4_4, var39_31);
                    if (var36_28 == 0 || (var36_28 = zzaeo.zzb(var4_4)) == var5_5) break block41;
                    var37_29 = var2_2.zzd;
                    var37_29.zza(var4_4);
                    var39_31 = var2_2.zzm;
                    var21_19 = -9223372036854775807L;
                    var23_20 = -4.9E-324;
                    var4_4 = (int)(var39_31 == var21_19 ? 0 : (var39_31 < var21_19 ? -1 : 1));
                    if (var4_4 == 0) {
                        var6_6 = var2_2.zzq;
                        var39_31 = var1_1.zzf();
                        var2_2.zzm = var39_31 = var6_6.zze(var39_31);
                    }
                    var6_6 = var2_2.zzd;
                    var2_2.zzp = var36_28 = var6_6.zzc;
                    var38_30 = var2_2.zzq;
                    var41_32 = var38_30 instanceof zzajc;
                    if (var41_32 != 0) break block42;
                    var4_4 = var36_28;
                    break block40;
                }
                var42_33 = var2_2.zzn;
                var44_34 = var6_6.zzg;
                var2_2.zzh(var42_33 += var44_34);
                throw null;
            }
            var3_3 = (zzadi)var3_3;
            var36_28 = 1;
            var3_3.zzo(var36_28, false);
            var2_2.zzk = 0;
lbl251:
            // 2 sources

            while (true) {
                var5_5 = 0;
                ** GOTO lbl-1000
                break;
            }
        }
        var36_28 = 1;
        var38_30 = var2_2.zzj;
        var46_36 = var38_30.zzf(var3_3, var4_4, (boolean)var36_28);
        if (var46_36 != var5_5) {
            var2_2.zzp = var4_4 = var2_2.zzp - var46_36;
            if (var4_4 > 0) {
                ** continue;
            }
        } else lbl-1000:
        // 3 sources

        {
            return var5_5;
        }
        var37_29 = var2_2.zzj;
        var44_35 = var2_2.zzn;
        var47_37 = var2_2.zzh(var44_35);
        var10_10 = var2_2.zzd.zzc;
        var37_29.zzs(var47_37, 1, var10_10, 0, null);
        var44_35 = var2_2.zzn;
        var39_31 = var2_2.zzd.zzg;
        var2_2.zzn = var44_35 += var39_31;
        var2_2.zzp = 0;
        return 0;
    }

    private final long zzh(long l2) {
        zzaen zzaen2 = this.zzd;
        long l3 = this.zzm;
        long l4 = zzaen2.zzd;
        return l2 * 1000000L / l4 + l3;
    }

    private final zzaji zzi(zzadv zzadv2, long l2, boolean bl2) {
        Object object = this.zzc.zzM();
        Object object2 = zzadv2;
        object2 = (zzadi)zzadv2;
        int n3 = 4;
        ((zzadi)object2).zzm((byte[])object, 0, n3, false);
        this.zzc.zzK(0);
        object = this.zzd;
        object2 = this.zzc;
        int n4 = ((zzfu)object2).zzg();
        ((zzaen)object).zza(n4);
        long l3 = zzadv2.zzd();
        long l4 = -1;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false) {
            l2 = zzadv2.zzd();
        }
        l4 = l2;
        long l8 = zzadv2.zzf();
        zzaen zzaen2 = this.zzd;
        object = new zzajb(l2, l8, zzaen2, false);
        return object;
    }

    private static boolean zzj(int n3, long l2) {
        int n4 = -128000;
        long l3 = n3 &= n4;
        long l4 = 4294839296L;
        long l7 = l2 & l4;
        long l8 = l3 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        return object == false;
    }

    private final boolean zzk(zzadv zzadv2) {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        Object object = this.zzq;
        boolean bl2 = true;
        if (object != null && (l12 = (l8 = (l7 = object.zzd()) - (l4 = (long)-1)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false && (l12 = (l3 = (l4 = zzadv2.zze()) - (l7 += (l2 = (long)-4))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            return bl2;
        }
        try {
            object = this.zzc;
        }
        catch (EOFException eOFException) {
            return bl2;
        }
        object = ((zzfu)object).zzM();
        int n3 = 4;
        boolean bl3 = zzadv2.zzm((byte[])object, 0, n3, bl2);
        if (!bl3) {
            return bl2;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean zzl(zzadv object, boolean n3) {
        int n4;
        int n7;
        zzaej zzaej2;
        Object object2;
        object.zzj();
        long l2 = object.zzf();
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            object2 = this.zzf.zza((zzadv)object, null);
            this.zzl = object2;
            if (object2 != null) {
                zzaej2 = this.zze;
                zzaej2.zzb((zzcd)object2);
            }
            l2 = object.zze();
            n7 = (int)l2;
            if (n3 == 0) {
                object2 = object;
                object2 = (zzadi)object;
                ((zzadi)object2).zzo(n7, false);
            }
            n4 = 0;
            object2 = null;
        } else {
            n4 = 0;
            object2 = null;
            n7 = 0;
            zzaej2 = null;
        }
        int n8 = 0;
        int n10 = 0;
        Object object3 = null;
        while (true) {
            Object object4;
            block20: {
                int n14;
                block18: {
                    block19: {
                        int n15;
                        long l7;
                        int n16;
                        block17: {
                            l4 = (long)this.zzk((zzadv)object);
                            n14 = 1;
                            if (l4 == false) break block17;
                            if (n8 <= 0) {
                                object = new EOFException();
                                throw object;
                            }
                            break block18;
                        }
                        this.zzc.zzK(0);
                        object4 = this.zzc;
                        l4 = ((zzfu)object4).zzg();
                        if (n4 != 0 && (n16 = (int)(zzajg.zzj((int)l4, l7 = (long)n4) ? 1 : 0)) == 0 || (n16 = zzaeo.zzb((int)l4)) == (n15 = -1)) {
                            n4 = n14 != n3 ? 131072 : 32768;
                            n8 = n10 + 1;
                            if (n10 == n4) {
                                if (n3 != 0) {
                                    return false;
                                }
                                throw zzch.zza("Searched too many bytes.", null);
                            }
                            if (n3 != 0) {
                                object.zzj();
                                n4 = n7 + n8;
                                object3 = object;
                                object3 = (zzadi)object;
                                ((zzadi)object3).zzl(n4, false);
                            } else {
                                object2 = object;
                                object2 = (zzadi)object;
                                ((zzadi)object2).zzo(n14, false);
                            }
                            n10 = n8;
                            n4 = 0;
                            object2 = null;
                            n8 = 0;
                            continue;
                        }
                        if (++n8 != n14) break block19;
                        object2 = this.zzd;
                        ((zzaen)object2).zza((int)l4);
                        n4 = (int)l4;
                        break block20;
                    }
                    l4 = 4;
                    if (n8 != l4) break block20;
                }
                if (n3 != 0) {
                    object = (zzadi)object;
                    ((zzadi)object).zzo(n7 += n10, false);
                } else {
                    object.zzj();
                }
                this.zzk = n4;
                return n14 != 0;
            }
            object4 = object;
            object4 = (zzadi)object;
            ((zzadi)object4).zzl(n16 += -4, false);
        }
    }

    public final void zza() {
        this.zzr = true;
    }

    public final int zzb(zzadv object, zzaeq object2) {
        object2 = this.zzi;
        zzeq.zzb(object2);
        int n3 = zzgd.zza;
        int n4 = this.zzg((zzadv)object);
        n3 = -1;
        if (n4 == n3 && (n3 = (object2 = this.zzq) instanceof zzajc) != 0) {
            long l2 = this.zzn;
            l2 = this.zzh(l2);
            object2 = this.zzq;
            long l3 = object2.zza();
            long l4 = l3 - l2;
            n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
            if (n3 != 0) {
                object = (zzajc)this.zzq;
                throw null;
            }
        }
        return n4;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx object) {
        this.zzh = object;
        this.zzi = object = object.zzw(0, 1);
        this.zzj = object;
        this.zzh.zzD();
    }

    public final void zze(long l2, long l3) {
        long l4;
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = l4 = 0L;
        this.zzp = 0;
        zzaji zzaji2 = this.zzq;
        boolean bl2 = zzaji2 instanceof zzajc;
        if (!bl2) {
            return;
        }
        throw null;
    }

    public final boolean zzf(zzadv zzadv2) {
        return this.zzl(zzadv2, true);
    }
}

