/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzagl;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzagq;
import com.google.android.gms.internal.ads.zzaie;
import com.google.android.gms.internal.ads.zzakj;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

final class zzagk
implements zzadu {
    private final zzfu zza;
    private zzadx zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private zzaie zzg;
    private zzadv zzh;
    private zzagn zzi;
    private zzakj zzj;

    public zzagk() {
        zzfu zzfu2;
        this.zza = zzfu2 = new zzfu(6);
        this.zzf = -1;
    }

    private final int zza(zzadv zzadv2) {
        Object object = this.zza;
        int n3 = 2;
        ((zzfu)object).zzH(n3);
        object = this.zza.zzM();
        ((zzadi)zzadv2).zzm((byte[])object, 0, n3, false);
        return this.zza.zzq();
    }

    private final void zzg() {
        zzadx zzadx2 = this.zzb;
        zzadx2.getClass();
        zzadx2.zzD();
        zzadx2 = this.zzb;
        zzaes zzaes2 = new zzaes(-9223372036854775807L, 0L);
        zzadx2.zzO(zzaes2);
        this.zzc = 6;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int zzb(zzadv var1_1, zzaeq var2_2) {
        block30: {
            block25: {
                block26: {
                    block29: {
                        block27: {
                            block28: {
                                block24: {
                                    var3_3 = this;
                                    var4_4 = var1_1;
                                    var5_5 = var2_2;
                                    var6_6 = -1;
                                    var7_7 = false;
                                    var8_8 = null;
                                    var9_9 = 1;
                                    var10_10 = this.zzc;
                                    var11_11 = 4;
                                    var12_12 = -1;
                                    var14_13 = 2;
                                    if (var10_10 == 0) break block25;
                                    if (var10_10 == var9_9) break block26;
                                    if (var10_10 != var14_13) {
                                        var15_14 = 5;
                                        if (var10_10 != var11_11) {
                                            if (var10_10 != var15_14) {
                                                var16_15 = 6;
                                                if (var10_10 == var16_15) {
                                                    return var6_6;
                                                }
                                                var4_4 = new IllegalStateException();
                                                throw var4_4;
                                            }
                                            var17_21 /* !! */  = this.zzi;
                                            if (var17_21 /* !! */  == null || var1_1 != (var17_21 /* !! */  = this.zzh)) {
                                                var3_3.zzh = var4_4;
                                                var18_26 = var3_3.zzf;
                                                var3_3.zzi = var17_21 /* !! */  = new zzagn((zzadv)var4_4, var18_26);
                                            }
                                            var4_4 = var3_3.zzj;
                                            var4_4.getClass();
                                            var17_21 /* !! */  = var3_3.zzi;
                                            var16_16 = var4_4.zzb(var17_21 /* !! */ , (zzaeq)var5_5);
                                            if (var16_16 == var9_9) {
                                                var20_27 = var5_5.zza;
                                                var22_29 = var3_3.zzf;
                                                var5_5.zza = var20_27 += var22_29;
                                            }
                                            return var16_16;
                                        }
                                        var24_31 = var1_1.zzf();
                                        cfr_temp_0 = var24_31 - (var26_32 = this.zzf);
                                        var6_6 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                        if (var6_6 == 0) {
                                            var5_5 = this.zza.zzM();
                                            var28_34 = var1_1.zzm((byte[])var5_5, 0, var9_9, (boolean)var9_9);
                                            if (!var28_34) {
                                                this.zzg();
                                            } else {
                                                var1_1.zzj();
                                                var5_5 = this.zzj;
                                                if (var5_5 == null) {
                                                    var17_22 = zzalt.zza;
                                                    var10_10 = 8;
                                                    this.zzj = var5_5 = new zzakj((zzalt)var17_22, var10_10);
                                                }
                                                var24_31 = var3_3.zzf;
                                                var3_3.zzi = var5_5 = new zzagn((zzadv)var4_4, var24_31);
                                                var4_4 = var3_3.zzj;
                                                var16_17 = var4_4.zzf((zzadv)var5_5);
                                                if (var16_17) {
                                                    var4_4 = var3_3.zzj;
                                                    var24_31 = var3_3.zzf;
                                                    var17_22 = var3_3.zzb;
                                                    var17_22.getClass();
                                                    var5_5 = new zzagp(var24_31, (zzadx)var17_22);
                                                    var4_4.zzd((zzadx)var5_5);
                                                    var4_4 = var3_3.zzg;
                                                    var4_4.getClass();
                                                    var5_5 = var3_3.zzb;
                                                    var5_5.getClass();
                                                    var6_6 = 1024;
                                                    var5_5 = var5_5.zzw(var6_6, var11_11);
                                                    var17_22 = new zzal();
                                                    var17_22.zzB("image/jpeg");
                                                    var24_31 = -9223372036854775807L;
                                                    var30_39 = new zzcc[var9_9];
                                                    var30_39[0] = var4_4;
                                                    var29_37 = new zzcd(var24_31, var30_39);
                                                    var17_22.zzQ(var29_37);
                                                    var4_4 = var17_22.zzad();
                                                    var5_5.zzl((zzan)var4_4);
                                                    var3_3.zzc = var15_14;
                                                } else {
                                                    this.zzg();
                                                }
                                            }
                                            return 0;
                                        }
                                        var2_2.zza = var26_32;
                                        return var9_9;
                                    }
                                    var28_35 = this.zzd;
                                    var9_9 = (char)-31;
                                    if (var28_35 != var9_9) break block27;
                                    var9_9 = this.zze;
                                    var5_5 = new zzfu(var9_9);
                                    var30_40 /* !! */  = var5_5.zzM();
                                    var10_10 = this.zze;
                                    var31_41 = var1_1;
                                    var31_41 = (zzadi)var1_1;
                                    var31_41.zzn(var30_40 /* !! */ , 0, var10_10, false);
                                    var30_40 /* !! */  = (byte[])this.zzg;
                                    if (var30_40 /* !! */  != null || (var9_9 = (int)(var29_38 = "http://ns.adobe.com/xap/1.0/").equals(var30_40 /* !! */  = (byte[])var5_5.zzx('\u0000'))) == 0 || (var5_5 = var5_5.zzx('\u0000')) == null) break block28;
                                    var22_30 = var1_1.zzd();
                                    cfr_temp_1 = var22_30 - var12_12;
                                    var11_11 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                    if (var11_11 == 0) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            var16_18 /* !! */  = 0;
                                            var4_4 = null;
                                            break block24;
                                            break;
                                        }
                                    }
                                    if ((var5_5 = zzagq.zza((String)var5_5)) == null || (var11_11 = (var31_41 = var5_5.zzb).size()) < var14_13) ** GOTO lbl-1000
                                    var31_41 = var5_5.zzb;
                                    var26_33 = var12_12;
                                    var32_42 = var12_12;
                                    var34_43 = var12_12;
                                    var36_44 = var12_12;
                                    var14_13 = 0;
                                    for (var11_11 = var31_41.size() + var6_6; var11_11 >= 0; var11_11 += var6_6) {
                                        var38_45 = (zzagl)var5_5.zzb.get(var11_11);
                                        var4_4 = var38_45.zza;
                                        var8_8 = "video/mp4";
                                        var16_18 /* !! */  = var8_8.equals(var4_4) | var14_13;
                                        if (var11_11 == 0) {
                                            var12_12 = var38_45.zzd;
                                            var22_30 -= var12_12;
                                            var12_12 = 0L;
lbl127:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var12_12 = var38_45.zzc;
                                        var12_12 = var22_30 - var12_12;
                                        ** continue;
                                        var39_46 = var22_30;
                                        var22_30 = var12_12;
                                        var12_12 = var39_46;
                                        if (var16_18 /* !! */  != 0 && (var7_7 = var22_30 == var39_46 ? 0 : (var22_30 < var39_46 ? -1 : 1))) {
                                            var36_44 = var39_46 - var22_30;
                                            var34_43 = var22_30;
                                            var14_13 = 0;
                                        } else {
                                            var14_13 = var16_18 /* !! */ ;
                                        }
                                        if (var11_11 == 0) {
                                            var32_42 = var12_12;
                                        }
                                        if (var11_11 == 0) {
                                            var26_33 = var22_30;
                                        }
                                        var7_7 = false;
                                        var8_8 = null;
                                        var12_12 = -1;
                                    }
                                    var16_18 /* !! */  = (int)(var34_43 == var12_12 ? 0 : (var34_43 < var12_12 ? -1 : 1));
                                    if (var16_18 /* !! */  != 0 && (var16_18 /* !! */  = var36_44 == var12_12 ? 0 : (var36_44 < var12_12 ? -1 : 1)) != 0 && (var16_18 /* !! */  = var26_33 == var12_12 ? 0 : (var26_33 < var12_12 ? -1 : 1)) != 0 && (var16_18 /* !! */  = (int)(var32_42 == var12_12 ? 0 : (var32_42 < var12_12 ? -1 : 1))) != 0) ** break;
                                    ** while (true)
                                    var41_47 = var5_5.zza;
                                    var17_23 = new zzaie(var26_33, var32_42, var41_47, var34_43, var36_44);
                                    var4_4 = var17_23;
                                }
                                var3_3.zzg = var4_4;
                                if (var4_4 != null) {
                                    var3_3.zzf = var41_47 = var4_4.zzd;
                                }
                            }
                            var6_6 = 0;
                            var17_23 = null;
                            break block29;
                        }
                        var28_35 = this.zze;
                        var4_4 = (zzadi)var1_1;
                        var6_6 = 0;
                        var17_24 = null;
                        var4_4.zzo(var28_35, false);
                    }
                    var3_3.zzc = 0;
                    return 0;
                }
                this.zza.zzH(var14_13);
                var5_5 = this.zza.zzM();
                ((zzadi)var1_1).zzn((byte[])var5_5, 0, var14_13, false);
                this.zze = var16_19 = this.zza.zzq() + -2;
                this.zzc = var14_13;
                return 0;
            }
            var6_6 = 0;
            var17_25 = null;
            this.zza.zzH(var14_13);
            var5_5 = this.zza.zzM();
            ((zzadi)var1_1).zzn((byte[])var5_5, 0, var14_13, false);
            var4_4 = this.zza;
            this.zzd = var16_20 = var4_4.zzq();
            var28_36 = -38;
            if (var16_20 != var28_36) break block30;
            var41_48 = this.zzf;
            var20_28 = -1;
            cfr_temp_2 = var41_48 - var20_28;
            var9_9 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
            if (var9_9 != 0) {
                this.zzc = var11_11;
lbl198:
                // 4 sources

                while (true) {
                    continue;
                    break;
                }
            }
            this.zzg();
            ** GOTO lbl198
        }
        var28_36 = (char)-48;
        if (var16_20 >= var28_36 && var16_20 <= (var28_36 = (int)((char)-39)) || var16_20 == (var28_36 = 65281)) ** GOTO lbl198
        var3_3.zzc = var9_9;
        ** while (true)
        var16_20 = 0;
        var4_4 = null;
        return 0;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        this.zzb = zzadx2;
    }

    public final void zze(long l2, long l3) {
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            this.zzc = 0;
            this.zzj = null;
            return;
        }
        int n3 = this.zzc;
        int n4 = 5;
        if (n3 == n4) {
            zzakj zzakj2 = this.zzj;
            zzakj2.getClass();
            zzakj2.zze(l2, l3);
        }
    }

    public final boolean zzf(zzadv object) {
        Object object2;
        int n3;
        int n4 = this.zza((zzadv)object);
        if (n4 != (n3 = (int)-40)) {
            return false;
        }
        this.zzd = n4 = this.zza((zzadv)object);
        n3 = (char)-32;
        int n7 = 2;
        if (n4 == n3) {
            this.zza.zzH(n7);
            object2 = this.zza.zzM();
            zzadv zzadv2 = object;
            zzadv2 = (zzadi)object;
            ((zzadi)zzadv2).zzm((byte[])object2, 0, n7, false);
            object2 = this.zza;
            n4 = object2.zzq() + -2;
            ((zzadi)zzadv2).zzl(n4, false);
            this.zzd = n4 = this.zza((zzadv)object);
        }
        if (n4 == (n3 = (char)-31)) {
            object = (zzadi)object;
            ((zzadi)object).zzl(n7, false);
            object2 = this.zza;
            n3 = 6;
            object2.zzH(n3);
            object2 = this.zza.zzM();
            ((zzadi)object).zzm((byte[])object2, 0, n3, false);
            object = this.zza;
            long l2 = ((zzfu)object).zzu();
            long l3 = 1165519206L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false && (l4 = (long)((zzfu)(object = this.zza)).zzq()) == false) {
                return true;
            }
        }
        return false;
    }
}

