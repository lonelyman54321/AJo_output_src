/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaem;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzagb;
import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.internal.ads.zzage;
import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

public final class zzagd
implements zzadu {
    public static final zzaea zza;
    private final zzfu zzb;
    private final zzfu zzc;
    private final zzfu zzd;
    private final zzfu zze;
    private final zzage zzf;
    private zzadx zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzagb zzp;
    private zzagh zzq;

    static {
        zzagc zzagc2 = new zzagc();
        zza = zzagc2;
    }

    public zzagd() {
        Object object = new zzfu(4);
        this.zzb = object;
        object = new zzfu(9);
        this.zzc = object;
        object = new zzfu(11);
        this.zzd = object;
        object = new zzfu();
        this.zze = object;
        this.zzf = object = new zzage();
        this.zzh = 1;
    }

    private final zzfu zza(zzadv zzadv2) {
        Object object;
        int n3 = this.zzm;
        Object object2 = this.zze;
        int n4 = ((zzfu)object2).zzc();
        if (n3 > n4) {
            object = this.zze;
            n4 = ((zzfu)object).zzc();
            n4 += n4;
            int n7 = this.zzm;
            n4 = Math.max(n4, n7);
            object2 = new byte[n4];
            ((zzfu)object).zzI((byte[])object2, 0);
        } else {
            object = this.zze;
            ((zzfu)object).zzK(0);
        }
        object = this.zze;
        n4 = this.zzm;
        ((zzfu)object).zzJ(n4);
        object = this.zze.zzM();
        n4 = this.zzm;
        ((zzadi)zzadv2).zzn((byte[])object, 0, n4, false);
        return this.zze;
    }

    private final void zzg() {
        boolean bl2 = this.zzo;
        if (!bl2) {
            zzadx zzadx2 = this.zzg;
            long l2 = -9223372036854775807L;
            long l3 = 0L;
            zzaes zzaes2 = new zzaes(l2, l3);
            zzadx2.zzO(zzaes2);
            this.zzo = bl2 = true;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int zzb(zzadv var1_1, zzaeq var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = this.zzg;
        zzeq.zzb(var5_5);
        while (true) {
            block15: {
                block16: {
                    block17: {
                        block18: {
                            block14: {
                                block20: {
                                    block19: {
                                        var6_6 = var3_3.zzh;
                                        var7_7 = -1;
                                        var8_8 = 9;
                                        var9_9 = 8;
                                        var10_10 = 2;
                                        var11_11 = 4;
                                        var12_12 = 1;
                                        if (var6_6 == var12_12) break block15;
                                        var13_13 = 3;
                                        if (var6_6 == var10_10) break block16;
                                        if (var6_6 == var13_13) break block17;
                                        if (var6_6 != var11_11) break block18;
                                        var6_6 = (int)var3_3.zzi;
                                        var14_14 = -9223372036854775807L;
                                        if (var6_6 != 0) {
                                            var16_15 = var3_3.zzj;
                                            var18_16 = var3_3.zzn;
                                            var16_15 += var18_16;
                                        } else {
                                            var5_5 = var3_3.zzf;
                                            var16_15 = var5_5.zzc();
                                            cfr_temp_0 = var16_15 - var14_14;
                                            var20_17 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                            var16_15 = var20_17 /* !! */  == false ? 0L : var3_3.zzn;
                                        }
                                        var20_17 /* !! */  = var3_3.zzl;
                                        if (var20_17 /* !! */  == var9_9) {
                                            var21_18 = var3_3.zzp;
                                            if (var21_18 != null) {
                                                this.zzg();
                                                var22_19 = var3_3.zzp;
                                                var23_20 = this.zza(var1_1);
                                                var6_6 = (int)var22_19.zzf((zzfu)var23_20, var16_15);
lbl39:
                                                // 4 sources

                                                while (true) {
                                                    var7_7 = 1;
                                                    break block14;
                                                    break;
                                                }
                                            }
                                        } else {
                                            var9_9 = (int)var20_17 /* !! */ ;
                                        }
                                        if (var9_9 != var8_8) break block19;
                                        var22_19 = var3_3.zzq;
                                        if (var22_19 == null) break block20;
                                        this.zzg();
                                        var22_19 = var3_3.zzq;
                                        var23_20 = this.zza(var1_1);
                                        var6_6 = (int)var22_19.zzf((zzfu)var23_20, var16_15);
                                        ** GOTO lbl39
                                    }
                                    var8_8 = 18;
                                    if (var9_9 != var8_8 || (var8_8 = (int)var3_3.zzo) != 0) break block20;
                                    var22_19 = var3_3.zzf;
                                    var23_20 = this.zza(var1_1);
                                    var6_6 = (int)var22_19.zzf((zzfu)var23_20, var16_15);
                                    var24_21 = var3_3.zzf;
                                    var25_22 = var24_21.zzc();
                                    cfr_temp_1 = var25_22 - var14_14;
                                    var20_17 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                    if (var20_17 /* !! */  == false) ** GOTO lbl39
                                    var21_18 = var3_3.zzg;
                                    var28_24 = var24_21.zzd();
                                    var24_21 = var24_21.zze();
                                    var27_23 = new zzaem(var28_24, (long[])var24_21, var25_22);
                                    var21_18.zzO(var27_23);
                                    var3_3.zzo = var12_12;
                                    ** continue;
                                }
                                var6_6 = var3_3.zzm;
                                var24_21 = var4_4;
                                ((zzadi)var4_4).zzo(var6_6, false);
                                var6_6 = 0;
                                var5_5 = null;
                                var7_7 = 0;
                                var24_21 = null;
                            }
                            var8_8 = (int)var3_3.zzi;
                            if (var8_8 == 0 && var6_6 != 0) {
                                var3_3.zzi = var12_12;
                                var5_5 = var3_3.zzf;
                                var25_22 = var5_5.zzc();
                                cfr_temp_2 = var25_22 - var14_14;
                                var6_6 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                if (var6_6 == 0) {
                                    var25_22 = var3_3.zzn;
                                    var29_25 = -var25_22;
                                } else {
                                    var29_25 = 0L;
                                }
                                var3_3.zzj = var29_25;
                            }
                            var3_3.zzk = var11_11;
                            var3_3.zzh = var10_10;
                            if (var7_7 == 0) continue;
                            return 0;
                        }
                        var4_4 = new IllegalStateException();
                        throw var4_4;
                    }
                    var5_5 = var3_3.zzd.zzM();
                    var6_6 = var4_4.zzn((byte[])var5_5, 0, var8_8 = 11, (boolean)var12_12);
                    if (var6_6 == 0) {
                        return var7_7;
                    }
                    var3_3.zzd.zzK(0);
                    var3_3.zzl = var6_6 = var3_3.zzd.zzm();
                    var3_3.zzm = var6_6 = var3_3.zzd.zzo();
                    var3_3.zzn = var16_15 = (long)var3_3.zzd.zzo();
                    var6_6 = var3_3.zzd.zzm() << 24;
                    var31_26 = var3_3.zzn;
                    var33_27 = var6_6;
                    var16_15 = var33_27 | var31_26;
                    var25_22 = 1000L;
                    var3_3.zzn = var16_15 *= var25_22;
                    var5_5 = var3_3.zzd;
                    var5_5.zzL(var13_13);
                    var3_3.zzh = var11_11;
                    continue;
                }
                var6_6 = var3_3.zzk;
                var24_21 = var4_4;
                var24_21 = (zzadi)var4_4;
                var24_21.zzo(var6_6, false);
                var3_3.zzk = 0;
                var3_3.zzh = var13_13;
                continue;
            }
            var5_5 = var3_3.zzc.zzM();
            var6_6 = (int)var4_4.zzn((byte[])var5_5, 0, var8_8, (boolean)var12_12);
            if (var6_6 == 0) {
                return var7_7;
            }
            var3_3.zzc.zzK(0);
            var3_3.zzc.zzL(var11_11);
            var5_5 = var3_3.zzc;
            var6_6 = var5_5.zzm();
            var7_7 = var6_6 & 4;
            var6_6 &= var12_12;
            if (var7_7 != 0 && (var24_21 = var3_3.zzp) == null) {
                var35_28 = var3_3.zzg;
                var23_20 = var35_28.zzw(var9_9, var12_12);
                var3_3.zzp = var24_21 = new zzagb((zzafa)var23_20);
            }
            if (var6_6 != 0 && (var5_5 = var3_3.zzq) == null) {
                var24_21 = var3_3.zzg.zzw(var8_8, var10_10);
                var3_3.zzq = var5_5 = new zzagh((zzafa)var24_21);
            }
            var3_3.zzg.zzD();
            var5_5 = var3_3.zzc;
            var3_3.zzk = var6_6 = var5_5.zzg() + -5;
            var3_3.zzh = var10_10;
        }
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        this.zzg = zzadx2;
    }

    public final void zze(long l2, long l3) {
        l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            int n3;
            this.zzh = n3 = 1;
            this.zzi = false;
        } else {
            int n4;
            this.zzh = n4 = 3;
        }
        this.zzk = 0;
    }

    public final boolean zzf(zzadv object) {
        Object object2 = this.zzb.zzM();
        zzadv zzadv2 = object;
        zzadv2 = (zzadi)object;
        ((zzadi)zzadv2).zzm((byte[])object2, 0, 3, false);
        this.zzb.zzK(0);
        object2 = this.zzb;
        int n3 = object2.zzo();
        int n4 = 4607062;
        if (n3 != n4) {
            return false;
        }
        object2 = this.zzb.zzM();
        n4 = 2;
        ((zzadi)zzadv2).zzm((byte[])object2, 0, n4, false);
        this.zzb.zzK(0);
        object2 = this.zzb;
        n3 = object2.zzq() & 0xFA;
        if (n3 != 0) {
            return false;
        }
        object2 = this.zzb.zzM();
        n4 = 4;
        ((zzadi)zzadv2).zzm((byte[])object2, 0, n4, false);
        this.zzb.zzK(0);
        n3 = this.zzb.zzg();
        object.zzj();
        object = (zzadi)object;
        ((zzadi)object).zzl(n3, false);
        object2 = this.zzb.zzM();
        ((zzadi)object).zzm((byte[])object2, 0, n4, false);
        this.zzb.zzK(0);
        object = this.zzb;
        int n7 = ((zzfu)object).zzg();
        return n7 == 0;
    }
}

